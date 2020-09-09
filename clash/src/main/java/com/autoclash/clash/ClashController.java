package com.autoclash.clash;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ClashController {
    private List<Bloco> blocos = new ArrayList<>();

    private List<Vila> vilas = new ArrayList<>();
    private List<Guerra> guerras = new ArrayList<>();
    private List<Clan> clans = new ArrayList<>();

    public ClashController(List<Bloco> blocos) {
        this.blocos = blocos;
        Vila v1 =  new Vila("ramon1","#A09C20F","ramon1@gmail.com",12,80971235,35543,151,911,3700);
        Vila v2 =  new Vila("Ramon22","#CAFFE01","rn32@hotmail.com",5,07235,353,0,55,190);
        Clan c1 = new Clan(285,59,"Templo","JL99G8GL");
        Clan c99 = new Clan(25,2,"Templo Jr","JBL");
        Guerra g1 = new Guerra("#01001010", c1,c99);
        blocos.add(v1);
        blocos.add(v2);
        blocos.add(c1);
        blocos.add(c99);
        blocos.add(g1);

    }

    @GetMapping("/vilas")
    public List<Bloco> getVilas() {
        List<Bloco> vilas = new ArrayList<>();
        for (Bloco b : blocos) {
            if (b instanceof Vila) {
                vilas.add(b);
            }
        }
        return vilas;
    }

    @GetMapping("/clans")
    public List<Bloco> getClans() {
        List<Bloco> clans = new ArrayList<>();
        for (Bloco b : blocos) {
            if (b instanceof Clan) {
                clans.add(b);
            }
        }
        return clans;
    }

    @GetMapping("/guerras")
    public List<Bloco> getGuerras() {
        List<Bloco> guerras = new ArrayList<>();
        for (Bloco b : blocos) {
            if (b instanceof Guerra) {
                guerras.add(b);
            }
        }
        return guerras;
    }

    //@Override
    public ResponseEntity status(Bloco b) {
        if (b.isOnline())
            return ResponseEntity.status(200).build();
        else return ResponseEntity.status(404).build();
    }


    @PostMapping("/addVila")
    public ResponseEntity addVila(@RequestBody Vila novaV) {
        blocos.add(novaV);
        return ResponseEntity.status(201).build();
    }

    @PostMapping("/addClan")
    public ResponseEntity addClan(@RequestBody Clan novoC) {
        blocos.add(novoC);
        return ResponseEntity.status(201).build();
    }

    @PostMapping("/addGuerra")
    public ResponseEntity addGuerra(@RequestBody Guerra novaG) {
        blocos.add(novaG);
        return ResponseEntity.status(201).build();
    }

    @DeleteMapping("/delete/{tipo}/{id}")
    public ResponseEntity excluirVila(@PathVariable String id, @PathVariable String tipo) {
        boolean encontrado = false;
        int status;
        switch (tipo) {
            case "clan": {
                for (Bloco b : blocos) {
                    String tag2 = "#" + id;
                    if (b.getTag().equals(tag2)) {
                        clans.remove(b);
                        encontrado = true;
                        break;
                    }
                }
            }
            case "guerra": {
                for (Bloco b : blocos) {
                    String tag2 = "#" + id;
                    if (b.getTag().equals(tag2)) {
                        guerras.remove(b);
                        encontrado = true;
                        break;
                    }
                }
            }
            case "vila": {
                for (Bloco b : blocos) {
                    String tag2 = "#" + id;
                    if (b.getTag().equals(tag2)) {
                        blocos.remove(b);
                        encontrado = true;
                        break;
                    }
                }
            }
        }
        if (encontrado) {
            return ResponseEntity.status(200).build();
        } else {
            return ResponseEntity.status(404).build();
        }
    }
}
