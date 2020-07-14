$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/java/aprender_cucumber.feature");
formatter.feature({
  "name": "Aprender Cucumber",
  "description": "  Como um aluno\n  Eu quero aprender a utilizar Cucumber\n  Para que eu possa automatizar critérios de aceitação",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "Deve incrementar contador",
  "description": "",
  "keyword": "Cenario"
});
formatter.step({
  "name": "que o valor do contador é 15 peras",
  "keyword": "Dado "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "eu incrementar em 3",
  "keyword": "Quando "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "o valor do contador será 18",
  "keyword": "Então "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});