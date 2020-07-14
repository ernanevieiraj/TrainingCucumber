# language: pt
Funcionalidade: Aprender Cucumber
  Como um aluno
  Eu quero aprender a utilizar Cucumber
  Para que eu possa automatizar critérios de aceitação

  Cenario: Deve calcular atraso no prazo de entrega da China
    Dado que o prazo é dia 05/04/2018
    Quando a entrega atrasar em 2 'meses'
    Então a entrega será efetuada em '05/06/2018'

#  Cenario: Deve executar especificação
#    Dado que criei o arquivo corretamente
#    Quando executá-lo
#    Então a especifição deve finalizar com sucesso

#  Cenario: Deve incrementar contador
#    Dado que o valor do contador é 15 peras
#    Quando eu incrementar em 3
#    Então o valor do contador será 18
#
#  Cenario: Deve incrementar contador
#    Dado que o valor do contador é 123
#    Quando eu incrementar em 35
#    Então o valor do contador será 158
#
#  Cenario: Deve calcular atraso no prazo de entrega
#    Dado que o prazo é dia 05/04/2018
#    Quando a entrega atrasar em 2 'dias'
#    Então a entrega será efetuada em '07/04/2018'
#


#  Cenario: Deve criar steps genéricos para estes passos
#    Dado que o ticket é AF345
#    Dado que o valor da passagem é R$ 230,45
#    Dado que o nome do passageiro é 'Fulano da Silva'
#    Dado que o telefone do passageiro é 9999-9999
#    Quando criar os steps
#    Então o teste vai funcionar
#
#  Cenario: Deve reaproveitar os steps 'Dado' do cenário anterior
#    Dado que o ticket é AB167
#    Dado que o ticket especial é AB167
#    Dado que o valor da passagem é R$ 1120,23
#    Dado que o nome do passageiro é 'Cicrano de Oliveira'
#    Dado que o nome do passageiro é 9888-8888
#
#  Cenario: Deve negar todos os steps 'dado' dos cenários anteriores
#    Dado que o ticket é CD123
#    Dado que o ticket é AG1234
#    Dado que o valor da passagem é R$ 1.1345,56
#    Dado que o nome do passageiro é 'Beltrano Souza Martins'
#    Dado que o telefone do passageiro é 1234-5678
#    Dado que o telefone do passageiro é 999-2223