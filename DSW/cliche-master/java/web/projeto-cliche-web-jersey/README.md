Para construir e rodar o projeto, execute no terminal:
  * `mvn tomcat7:run`

Para ver rodando:
  * No navegador, acesse:
    * `http://localhost:8081/projeto-cliche-web-jersey/rest/pessoa`
    * `http://localhost:8081/projeto-cliche-web-jersey/rest/pessoa/1` (ou /2 ou /3)
  * No terminal, execute:
    * `curl -s -H 'Accept: application/json' http://localhost:8081/projeto-cliche-web-jersey/rest/pessoa`
