use UNIAO
go
insert into TBPAIS (sgl_pais, nom_pais) values ('BR', 'Brasil');
go
insert into TBESTADO (cod_pais, sgl_estado, nome_estado) values (1, 'RJ', 'Rio de Janeiro');
insert into TBESTADO (cod_pais, sgl_estado, nome_estado) values (1, 'SP', 'S�o Paulo');
insert into TBESTADO (cod_pais, sgl_estado, nome_estado) values  (1, 'GO', 'Goi�s');
insert into TBESTADO (cod_pais, sgl_estado, nome_estado) values (1, 'MA', 'Maranh�o');
insert into TBESTADO (cod_pais, sgl_estado, nome_estado) values (1, 'RS', 'Rio Grande do Sul');
go
insert into TBCIDADE (cod_estado, nome_cidade) values (2, 'S�o Paulo');
insert into TBCIDADE (cod_estado, nome_cidade) values (2, 'Valinhos');
insert into TBCIDADE (cod_estado, nome_cidade) values (2, 'Campinas');
insert into TBCIDADE (cod_estado, nome_cidade) values (1, 'Rio de Janeiro');
insert into TBCIDADE (cod_estado, nome_cidade) values (4, 'S�o Luis');