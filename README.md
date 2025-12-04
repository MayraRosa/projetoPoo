Cálculo de Volume de Carga

Aplicação em Java + Swing para calcular o volume do baú de um caminhão e o valor da carga de areia.
Como executar:
-Baixe ou clone o projeto.
-Abra na sua IDE (Eclipse, IntelliJ, NetBeans ou VS Code).
-Execute a classe principal (Main.java).
Ou no terminal:
Javac Main.java
Java main

Como usar:
Digite:
-Comprimento do baú (m)
-Largura do baú (m)
-Altura do baú (m)
-Valor que deseja pagar pela carga
-Clique no botão Calcular.
Os resultados aparecerão na área de saída.

O programa calcula:
-Volume total do baú (m³)
-Valor total da carga se o baú encher
-Volume equivalente ao valor informado
-Percentual de ocupação do baú
-(Preço do m³: R$ 53,39)

Equipe:
Mayra Rosa 
Ana Clara Alves
Luana de melo 
Lohoane Hapuque

detalhamento de funções:

Pessoa 1: Líder e organização - Mayra:
Objetivo: Garantir que o projeto exista, compile e esteja bem documentado.
Onde mexe: Arquivos Main.java, README.md, gitignore e ajustes gerais da janela.


Pessoa 2: Interface Gráfica - Ana Clara:
Objetivo: criar a "cara" do programa.
Onde mexe: Apenas no arquivo TelaCaminhao.java.


Pessoa 3: Lógica pura - Lohoane:
Objetivo: Fazer as contas funcionarem isoladamente.
Onde mexe: mexe no arquivo Calculadoralogica.java.


Pessoa 4: Eventos e botões - Luana:
Objetivo: Fazer o clique funcionar.
Onde mexe: No arquivo telaCaminhao.java (depois que Ana clara terminar).


FASE 1: A Fundação (Feito pela Pessoa 1)

​Pessoa 1: Cria o repositório no GitHub. ✅️

​Pessoa 1: Cria o arquivo TelaCaminhao.java (vazio, só com a janela básica) e o CalculadoraLogica.java (vazio).  ✅

​Todos: Clonam o repositório (git clone) para seus computadores  ✅

​FASE 2: Trabalho Paralelo (Pessoas 2 e 3 trabalham ao mesmo tempo)
​Esta é a fase mágica. Como estão mexendo em arquivos ou partes diferentes, não dá conflito.

​Pessoa 2 (Branch design): Começa a adicionar add(new JLabel("Altura")); e add(txtAltura); na TelaCaminhao.  ✅

​Pessoa 3 (Branch logica): Abre o CalculadoraLogica.java e escreve as fórmulas. ✅

FASE 3: A União

​Pessoas 2 e 3: Sobem seus códigos (git push). ✅

​Agora o projeto tem uma tela bonita (mas botões que não funcionam) e uma lógica inteligente (que ninguém está usando). ✅

​FASE 4: A Instalação (Pessoa 4 entra em ação) ✅

​Pessoa 4 (Branch eventos): Baixa o projeto atualizado (git pull). ✅

​Pessoa 4: Abre a TelaCaminhao.java. Agora ele vê os campos da Pessoa 2. ✅

​Pessoa 4: Programa o botão: "Quando clicar, chame a classe da Pessoa 3". ✅

FASE 5: O Polimento Final (Todos, liderados pela Pessoa 1)

​Pessoa 1: Escreve no README.md como usar o programa.✅

​Todos: Testam e corrigem pequenos erros de digitação.✅


