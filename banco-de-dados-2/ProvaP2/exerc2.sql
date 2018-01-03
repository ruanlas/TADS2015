/*
Exercício 2)
Um dos recursos que pode ser utilizado é uma função, que retorne um valor do tipo varchar,
que verifique se existe vaga disponível para o cargo do currículo em questão, retornando
a informação "há vagas", caso a pesquisa encontre uma vaga para o currículo, ou "não há vagas",
caso a pesquisa não encontre uma vaga para o currículo. Um dos parâmetros de entrada para a
verificação da existencia da vaga na tablela vagas, é o campo que contém o cargo pretendido
pelo candidato. Elevando um pouco o nível desta função, poderia haver um retorno informando
se existe vagas, e em caso positivo, informando também quantas vagas existe para aquele
cargo pretendido pelo candidato.
Para melhorar a visualização desta informação, poderia também criar uma visão, realizando
uma consulta de todos os campos da tabela currículos, adicionando uma ultima coluna que informasse
se existe ou não vaga para aquele determinado currículo do candidato, e esta ultima coluna seria
criada apenas na consulta da visão, e para gerar esse resultado se existe ou não a vaga, seria
utilizado a função criada acima, recebendo como parâmetro o cargo pretendido do candidato.
*/