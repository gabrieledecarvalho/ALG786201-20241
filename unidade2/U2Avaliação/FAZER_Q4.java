/*  Q4:
    A Escala de Beaufort é uma escala empírica que classifica a intensidade dos ventos, tendo em conta a sua velocidade e os efeitos resultantes das ventanias no mar e em terra. 
    A escala está diretamente relacionada com a dificuldade de realização de manobras nas embarcações em alto-mar, quanto menor o grau mais fácil é, quanto maior o grau mais complicado fica.
    Foi concebida pelo meteorologista anglo-irlandês Francis Beaufort no início do século XIX. Na década de 1830, a escala de Beaufort já era amplamente utilizada pela Marinha Real Britânica. [FONTE]

    A escala das forças do vento é descrita para fins práticos pela designação do vento, da faixa de velocidade do vento (em uma ou mais unidades), aspecto do mar, 
    e classificação da força (ou grau) que varia de grau 0 a grau 12, podendo ir além, como por exemplo, até o grau 17. A tabela a seguir mostra a escala de Beaufort:

        |Grau | Designação                          | m/s         | km/h      | nós     | Aspecto do mar                                        | Efeitos em terra                                                                                       |
        | --- | ----------------------------------- | ----------- | --------- | ------- | ----------------------------------------------------- | ------------------------------------------------------------------------------------------------------ |  
        | 0   | Calmo ou Calmaria                   | ≤0,2        | <2        | <1      | Espelhado                                             | Fumaça sobe na vertical                                                                                |
        |1    | Aragem ou Bafagem                   | 0,3 a 1,5   | 2 a 5     | 1 a 3   | Pequenas movimentações na superfície do mar           | Fumaça indica direção do vento                                                                         |
        |2    | Brisa leve ou Aragem                | 1,6 a 3,3   | 6 a 11    | 4 a 6   | Ligeira ondulação sem rebentação                      | As folhas das árvores movem; os moinhos começam a trabalhar                                            |
        |3    | Brisa fraca ou Fraco                | 3,4 a 5,4   | 12 a 19   | 7 a 10  | Ondulação até 60 cm, com alguns carneiros             | As folhas agitam-se e as bandeiras desfraldam ao vento                                                 |
        |4    | Brisa moderada ou Moderado          | 5,5 a 7,9   | 20 a 28   | 11 a 16 | Ondulação até 1 m, carneiros frequentes               | Poeira e pequenos papéis levantados; movem-se os galhos das árvores                                    |
        |5    | Brisa forte ou Fresco               | 8 a 10,7    | 29 a 38   | 17 a 21 | Ondulação até 2.5 m, com cristas e muitos carneiros   | Movimentação de grandes galhos e árvores pequenas                                                      |
        |6    | Vento fresco ou Muito fresco        | 10,8 a 13,8 | 39 a 49   | 22 a 27 | Ondas grandes até 3.5 m; borrifos                     | Movem-se os ramos das árvores; dificuldade em manter um guarda chuva aberto; assobio em fios de postes |
        |7    | Vento forte ou Forte	            | 13,9 a 17,1 | 50 a 61   | 28 a 33 | Mar revolto até 4.5 m com espuma e borrifos           | Movem-se as árvores grandes; dificuldade em andar contra o vento                                       |
        |8    | Ventania ou Muito forte	            | 17,2 a 20,7 | 62 a 74   | 34 a 40 | Mar revolto até 5 m com rebentação e faixas de espuma | Quebram-se galhos de árvores; dificuldade em andar contra o vento; barcos permanecem nos portos        |
        |9    | Ventania forte ou Duro	            | 20,8 a 24,4 | 75 a 88   | 41 a 47 | Mar revolto até 7 m; visibilidade precária            | Danos em árvores e pequenas construções; impossível andar contra o vento                               |
        |10   | Tempestade ou Muito Duro            | 24,5 a 28,4 | 89 a 102  | 48 a 55 | Mar revolto até 9 m; superfície do mar branca         | Árvores arrancadas; danos estruturais em construções                                                   |
        |11   | Tempestade violenta ou Tempestuoso	| 28,5 a 32,6 | 103 a 117 | 56 a 63 | Mar revolto até 11 m; pequenos navios sobem nas vagas | Estragos generalizados em construções                                                                  |
        |12   | Furacão	                            | ≥32,7       | ≥118      | ≥64     | Mar todo de espuma, com até 14 m; visibilidade nula   | Estragos graves e generalizados em construções                                                         |

        Escreva um programa que leia a velocidade do vento, em km/h, e mostre o grau correspondente da Escala de Beaufort, junto com sua designação.
*/