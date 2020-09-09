# autoclash2
Repositório criado para guardar a o projeto individual (Estrutura de dados e armazenamento + Programação WEB)

Esse protótipo de API simula a obtenção e armazenamento de dados de um jogo online e separa essa modelagem em 3 principais objetos, sendo eles Vila(o jogador), Guerras, Clans e os 3 sendo herdeiros de um objeto abstrato mais genérico. Na parte da programação web, o ClashController que realiza essa organização do tráfego de dados. Nos métodos de adicionar blocos(dentro do ClashController) eu codei o registro de objetos restrito aos 3 tipos de blocos fundamentais do jogo(vila, guerra e clans). Ex.: para adicionar uma vila, é feito um json com os dados do objeto e realizado o POST em 1 das 3 URIs diferentes, seja /addVila , /addClan ou /addGuerra.
 Nos métodos de deletar deixei amplo a portabilidade dos tipos de objeto. Ex.: pra deletar fica na escolha do dev digitar /deletar/{tipo do objeto}/{id do objeto}
, eu sei que um é mais enxuto e o outro mais flexível em relação ao futuro se passar a existir mais tipos de objetos.
As diversas lists são pra demonstrar o conceito de agregação; Guerras possuem 2 Clans em disputa, que por sua vez cada Clan tem um list de Vilas. Os gets, posts e deletes estão funcionais.
