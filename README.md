# Tabela-Dispersao-Encadeamento-Direto

Desenvolver um programa em Java para gerir as classificações de uma unidade curricular do ISPGaya.

O programa deverá usar como estrutura de dados uma tabela de dispersão com encadeamento direto (ou encadeamento de posições, ver slides 14 e 15 de "Tabelas de Dispersão"), com uma taxa de ocupação máxima permitida de 75%.

Para cada aluno será necessário guardar o seu número de aluno, o nome, o curso e a classificação obtida na unidade curricular. Os alunos são identificados pelo número (por exemplo, 2020123456, devendo ser considerados para efeitos de chave para a tabela de dispersão apenas os 6 algarismos mais à direita). O programa deverá permitir inserir dados, eliminar e pesquisar a partir do número de aluno, contar o número de alunos inscritos e apresentar a pauta da turma (com o número completo do aluno, o nome e a classificação). Considerar que o número médio de alunos inscritos a unidades curriculares é de 30.

No caso da capacidade da tabela ser excedida (ou seja, quando a taxa de ocupação exceder 75%) a tabela deverá ser reconstruída (rehash) de forma a que a tabela passe a suportar o dobro das posições ocupadas antes de ser reconstruída.

No desenvolvimento deste projeto não devem ser usadas quaisquer classes das coleções do Java (Java Collections Framework).

 
