# Desafios
Desafios de lógica de programação


1 - Escrever um programa que calcule o fatorial de n iterativamente, para n>0.

2 - Faça um programa para identificar se um número é primo.

3 - Faça um programa que some todos os valores entre um intervalor (inicio, fim).

4 - Implemente um método que calcule os primeiros N termos da sequência de Fibonacci e salve em um vetor. Ao final imprima o vetor resultante.

5 - Dado um vetor qualquer sem valores repetidos, descubra qual é o índice do maior valor e o índice do menor valor. Exemplo no vetor {6, 10, 4 , 21, 9} = {3 e 2}.

6 - Escreva um programa que organize um vetor de inteiros em ordem crescente.

7 - Escreva um programa que receba um vetor de inteiros e calcule a média da valores.

8 - Escreva um programa que receba um vetor de inteiros e calcule o valor do desvio padrão dos valores.

9 - Escreva um programa que converta um número binário (base 2) em decimal (base 10). Seu programa deve ler o número binário do usuário como uma sequência de zeros e uns e exibir o número decimal equivalente, processando cada dígito da representação binária. Por exemplo, 1010011 (base 2) ≡ 83 (base 10).

10 - Escreva um programa que receba um vetor de inteiros e retorno a moda. Onde houver empate retorno o maior. Se não tiver retorne 0.

11 - Escreva um programa que receba um vetor de inteiros e retorno a moda. Caso o vetor tenha mais de uma moda retorno todos os valores. Se não tiver moda retorne 0.

12 - O máximo divisor comum (MDC) de dois inteiros positivos, n e m, é o maior número, d, capaz de dividir n e m sem deixar resto. Existem vários algoritmos para determinar d, incluindo o seguinte:
1. inicialize d como o menor entre m e n;
2. enquanto d não dividir exatamente m e n, diminua o valor de d de uma unidade.
Ao final do algoritmo, d será o MDC de n e m. Escreva um programa que leia dois inteiros positivos do usuário e use esse algoritmo para determinar e relatar seu máximo divisor comum.

13 - Escreva um programa que, dada uma duração de tempo em segundos, calcule o número equivalente de dias, horas, minutos e segundos.

Por exemplo, 123554 segundos equivalem a 1 dia, 10 horas, 19 minutos e 14 segundos. 

14 - A maioria dos anos tem 365 dias. No entanto, o tempo necessário para a Terra orbitar o Sol é na verdade um pouco maior que isso. Para corrigir essa diferença, um dia extra, 29 de fevereiro, está incluído em alguns anos, ditos bissextos. As regras para determinar se um ano é ou não um ano bissexto são as seguintes:
1. qualquer ano que seja divisível por 400 é um ano bissexto;
2. dos anos restantes, qualquer ano que seja divisível por 100 não é um ano bissexto;
3. dos anos restantes, qualquer ano que seja divisível por 4 é um ano bissexto;
4. todos os outros anos não são anos bissextos.
Escreva um programa que leia um ano do usuário e exiba uma mensagem dizendo se ele é ou não um ano bissexto.

15 - Definimos dois vetores A e B de dimensão n em termos de componentes como:
         A = (a1, a2, a3, ..., an) e B = (b1, b2, b3, ..., bn)
     O produto escalar entre esses vetores é descrito como:
        A . B = a1 * b1 + a2 * b2 + a3 * b3 + ... + an * bn
Desenvolva um programa que, dado dois vetores de dimensão n, retorne o produto escalar entre eles.

16 - O triângulo de Pascal é uma tabela de números construída assim: o elemento da linha i e coluna j (com 0≤j≤i e começando de cima, onde i=j=0) 


![image](https://user-images.githubusercontent.com/117191255/230794038-f3dbf14d-b946-4393-9271-f820767b8520.png)


As primeiras oito linhas (ou seja, até i=7) são mostradas abaixo:


![image](https://user-images.githubusercontent.com/117191255/230794317-28a6b57e-5548-4da4-bbfd-ae07b90950e2.png)


Implemente um algoritmo para calcular as primeiras n linhas do triângulo de Pascal.

17 - Números palindrômicos.
Um palíndromo é uma palavra ou expressão que pode ser lida da esquerda para a direita ou da direita para a esquerda mantendo o mesmo significado. Um exemplo de palíndromo é a palavra “reviver”.

Neste desafio, a idéia é imprimir todos os números palindrômicos entre dois outros números. Tal como as palavras, os números palindrômicos mantém o mesmo valor se lidos de trás para a frente.

Exemplo 1: Dado o número inicial 1 e número final 20, o resultado seria: 1, 2, 3, 4, 5, 6, 7, 8, 9, 11.

Exemplo 2: Dado o numero inicial 3000 e número final 3010, o resultado seria: 3003.

Para o desafio, assuma:

Apenas inteiros positivos podem ser usados como limites.
Números de um algarismo são palíndromos por definição.
Máximo número: (1 << 64) - 1 (máximo unsigned int de 64 bits).
Bônus: Se o desafio parece fácil demais, implemente um novo tipo de dados para calcular pra qualquer número com precisão arbitrária (limite: 100000 algarismos por número). O uso de bibliotecas matemáticas de precisão arbitrária não será considerado como uma solução válida.

18 - Processando as informações da empresa:
Considere, como exemplo, o seguinte arquivo funcionarios.json, com o seguinte conteúdo: 
```
{
    "funcionarios":[
        {
            "id":0,
            "nome":"Marcelo",
            "sobrenome":"Silva",
            "salario":3200.00,
            "area":"SM"
        },
        {
            "id":1,
            "nome":"Washington",
            "sobrenome":"Ramos",
            "salario":2700.00,
            "area":"UD"
        },
        {
            "id":2,
            "nome":"Sergio",
            "sobrenome":"Pinheiro",
            "salario":2450.00,
            "area":"SD"
        },
        {
            "id":3,
            "nome":"Bernardo",
            "sobrenome":"Costa",
            "salario":3700.00,
            "area":"SM"
        },
        {
            "id":4,
            "nome":"Cleverton",
            "sobrenome":"Farias",
            "salario":2750.00,
            "area":"SD"
        },
        {
            "id":5,
            "nome":"Abraão",
            "sobrenome":"Campos",
            "salario":2550.00,
            "area":"SD"
        },
        {
            "id":6,
            "nome":"Letícia",
            "sobrenome":"Farias",
            "salario":2450.00,
            "area":"UD"
        },
        {
            "id":7,
            "nome":"Fernando",
            "sobrenome":"Ramos",
            "salario":2450.00,
            "area":"SD"
        },
        {
            "id":8,
            "nome":"Marcelo",
            "sobrenome":"Farias",
            "salario":2550.00,
            "area":"UD"
        },
        {
            "id":9,
            "nome":"Fabio",
            "sobrenome":"Souza",
            "salario":2750.00,
            "area":"SD"
        },
        {
            "id":10,
            "nome":"Clederson",
            "sobrenome":"Oliveira",
            "salario":2500.00,
            "area":"SD"
        }
    ],
    "areas":[
        {
            "codigo":"SD",
            "nome":"Desenvolvimento de Software"
        },
        {
            "codigo":"SM",
            "nome":"Gerenciamento de Software"
        },
        {
            "codigo":"UD",
            "nome":"Designer de UI/UX"
        }
    ]
}
```

Utilize a linguagem de programação de sua preferência (e quaisquer bibliotecas que sejam necessárias) e escreva um programa que leia o nome de um arquivo JSON como parâmetro – que seguirá os mesmos moldes do arquivo funcionarios.json listado acima – e imprima as informações solicitadas a seguir, baseado no conteúdo do arquivo lido.

19 - Anagramas!
Um anagrama é uma palavra ou frase formada com o re-arranjo de todas as letras de uma outra palavra ou frase (sem sobra ou falta). Exemplos:

A palavra barco é um anagrama da palavra cobra (todas as letras de “cobra” usadas em “barco).
A palavra mar não é um anagrama da palavra roma (a letra “o” em “roma” não foi usada).
A palavra sal não é um anagrama da palavra mal (a letra “s” de “sal” não existe em “mal”).
O problema 
Escreva um programa na sua linguagem e bibliotecas preferidas que:

Leia a expressão (que pode ser uma frase ou apenas uma palavra) a ser usada para a criação dos anagramas da linha de comando. Apenas as letras de “A” a “Z” deverão ser consideradas (ignore espaços e converta todas as letras minúsculas para maíusculas). Retorne erro e aborte a execução se caracteres inválidos forem encontrados na expressão (qualquer caracter não alfabético que não seja espaço, incluindo números, pontuação, ou caracteres acentuados).

Leia uma lista de palavras válidas do arquivo words.txt (Download). O arquivo é formatado com uma palavra por linha, com palavras da língua inglesa (Nota: apesar de várias tentativas, o autor não conseguiu achar uma lista “limpa” de palavras da língua portuguesa).

Imprima todas as combinações possíveis de anagramas (sem repetição de linhas ou palavras). Os anagramas devem conter apenas palavras válidas (lidas do arquivo acima).

O formato de saída deve conter múltiplas linhas (uma por anagrama), com as palavras ordenadas dentro de cada linha (veja Exemplos abaixo).

O programa deve ser capaz de calcular e imprimir a lista de anagramas possíveis para uma expressão de até 16 caracteres em menos de 60 segundos.

```
$ ./anagramarama "vermelho"
ELM HO REV
ELM OH REV
OHM REVEL
LEVER OHM
ELM HOVER
HOLM VEER
HELM OVER
HELM ROVE

```
Expressão é uma frase (lembre-se de ignorar espaços e converter todas as letras para maiúsculas):

```
$ ./anagramarama "vermelho"
ELM HO REV
ELM OH REV
OHM REVEL
LEVER OHM
ELM HOVER
HOLM VEER
HELM OVER
HELM ROVE
```

Frações simples
Descrição 
Escreva um programa que leia um arquivo texto contendo uma lista de frações em ASCII (uma por linha) e produza na saída a versão simplificada de cada fração. Números simples assumem denominador 1 (apenas imprima o número). Divisões inteiras como 81/9 devem imprimir o número inteiro 9. Em caso de erros na entrada (como divisão por zero), imprima “ERR” em maíusculas.

Por exemplo, data a entrada abaixo:

```
14/3
3/8
4/8
4/3
5
10/0
48/12

```
A seguinte saída seria produzida:
```
4 2/3
3/8
1/2
1 1/3
5
ERR
4
```

20 - Turing Machine
Introdução 
Uma Máquina de Turing é um modelo computacional matemático que define uma máquina abstrata. Essa máquina manipula símbolos numa fita de papel de acordo com uma tabela de regras simples. Apesar da simplicidade do modelo, é possível construir uma Máquina de Turing capaz de simular qualquer algoritmo computacional.

Funcionamento 
Uma máquina de Turing lê os dados de uma “fita” infinita, caracter por caracter (também conhecidos como “símbolos” na terminologia original) A máquina está sempre em um determinado “estado” (estado inicial == string “0”). As regras contém instruções para “casar” um determinado par estado/símbolo e executar determinadas ações.

O primeiro caracter a ser lido é sempre o primeiro caracter da “fita”, no nosso caso, o primeiro caracter do string de dados.

As regras permitem que:

1.Determinada regra seja selecionada por estado corrente e símbolo.
2.Uma vez selecionada uma regra, a máquina pode, opcionalmente executar uma (ou várias) das tarefas abaixo:
         1.Gravar um novo símbolo na posição corrente.
         2.Mover a posição de leitura para a direita.
         3.Mover a posição de leitura para a esquerda.
         4.Mudar o estado atual da máquina.
Exemplo:
Data a entrada:
```
A/B/C/D@

```
E as regras:

```
1: state=0  simbolo=@  novo_simbolo=.  direção=*        novo_estado=halt
2: state=0  simbolo=*  novo_simbolo=*  direção=direita  novo_estado=0
3: state=0  simbolo=/  novo_simbolo=x  direção=direita  novo_estado=y
4: state=y  simbolo=@  novo_simbolo=.  direção=*        novo_estado=halt
5: state=y  simbolo=*  novo_simbolo=*  direção=direita  novo_estado=y
6: state=y  simbolo=/  novo_simbolo=y  direção=direita  novo_estado=0
```
A seguinte saída seria produzida:

```
AxByCxD.

```
O funcionamento pode ser detalhado da seguinte forma:

A máquina inicializa, no estado “0” e lê o primeiro símbolo da fita (A)

A regra 2 acima produz o melhor casamento. No caso, estado=“0” e símbolo=”*“ indicando “qualquer símbolo”.

A regra 2 não faz qualquer substituição de símbolo, já que o novo símbolo é “*”. A posição na fita é movida para a direita de acordo com a instrução em “direção” e o estado permanece em “0”.

As regras são re-executadas com o segundo símbolo (/), ainda em estado “0”.

Dessa vez, a regra 3 casa mais especificamente (estado=“0”, símbolo = “/”).

A regra 3 substitui o símbolo corrente na fita (“/”) por x, move a fita para a direita e muda o estado corrente para y

O próximo caracter é lido (B)

Dessa vez, a regra 5 é utilizada (estado=“y”, símbolo=”*”). A única ação concreta é mover a fita para a direita.

Outro caracter é lido (/). Como o estado ainda é “y”, a regra 6 é executada. Dessa vez, troca o caracter por um “y”, move a fita para a direita e muda o estado para “0”.

(…)

As regras são executadas até que:

Uma combinação de estado/símbolo seja encontrada na fita que não existe nas regras. Nesse caso, o programa é abortado.

Um estado chamado halt-<qualquer_coisa> seja encontrado. Este estado causa a finalização do programa após a execução das instruções contidas nesta regra.

Observe que a fita é infinita, ou seja, pode crescer indefinidamente para a esquerda ou para a direita. Mover para a direita além do tamanho corrente dos dados causa a inserção de um espaço no final da fita. Mover a posição para e esquerda causa a inserção de um espaço a esquerda dos dados atuais.

Ex:

Antes: [ABCD], posição em D, mover a posição para a direita transforma a fita em [ABCD ].
Antes: [ABCD], posição em A, mover a posição para a esquerda transforma a fita em [ ABCD].
Descrição 
Escreva um programa que leia dois arquivos: O primeiro contendo um “conjunto de regras” (o “programa”) e o segundo contendo o nome do arquivo de regras a ser usado e os dados. O programa deverá executar as regras usando os dados como entrada e emitir a saída no formato definido abaixo. Observe que o arquivo de dados contém o nome do arquivo de regras a ser usado para cada linha.

As próximas seções definem os formatos de entrada e saída em maiores detalhes.
Arquivo de Dados 
O arquivo de dados contem apenas dois campos por linha, separados por uma vírgula. O primeiro campo especifica o nome do arquivo de regras a ser usado para os dados nessa linha, e o segundo especifica o dado em si.

Exemplo:
```
prime.tur,101
prime.tur,102
pali.tur,1001001

```
No caso acima, o valor “101” deverá ser executado com as regras no arquivo prime.tur e os resultados impressos. Em seguida, execute prime.tur usando o valor 102, e finalmente, execute pali.tur usando o valor “1001001”.

Arquivo de regras. 
O arquivo de regras define as regras a serem aplicadas, com uma regra por linha. Cada linha é composta por 5 campos, separados por um espaço, no seguinte formato:
```
current_state current_symbol new_symbol direction new_state
```
Onde:

current_state & current_symbol: Esta regra só deverá ser executada se current_state casar com o estado corrente da máquina e current_symbol casar com o símbolo lido da fita de dados.

O valor de current_state pode ser “*” indicando “case qualquer estado”.
O valor de current_symbol pode ser “*”, indicando “case qualquer valor”.
O valor de current_symbol pode ser “_” (underscore) para casar o espaço.
No caso de duas regras com o mesmo current_state casando um símbolo de entrada, a mais específica deverá ser usada. Exemplo típico: duas regras, uma com current_symbol=* e outra com current_symbol=A. No caso, para todos os valores de entrada, exceto “A”, a primeira regra deverá ser usada. Se o valor de entrada for “A”, a segunda deverá ser usada por ser mais específica.
Caso existam duas regras genéricas (i.e, usando “*” no current_state ou current_symbol válidas, apenas a primeira deverá ser usada.
new_symbol: Se a regra corrente for executada, substitua o símbolo corrente por este símbolo.

new_symbol=_ indica “troque por espaço”.
new_symbol=* indica “não substitua”.
direction: Pode ser “l” para “left” (esquerda), “r” para “right” (direita), ou “*” para indicar “não mova a posição”. Qualquer outro valor devera resultar em erro.

new_state: O novo estado da máquina. Pode ser qualquer valor alfanumérico. Qualquer string começando com halt causa a finalização do programa após a execução desta regra.

Linhas em branco ou começando com “;” devem ser ignoradas. Dados após um caracter “;” em qualquer posição da linha deve ser ignorados (comentários inline).

O exemplo dado na seção “Funcionamento” poderia ser representado no formato de regras como:

```
0 @ . * halt
0 * * r 0
0 / x r y
y @ . * halt
y * * r y
y / y r 0

```

Formato de saída. 
Imprima uma linha contendo 3 campos, separados por vírgulas contendo:

Nome do arquivo de regras utilizado
Valor de entrada
Valor de saída
Ex:
```
foo.tur,100,001
foo.tur,101,101
bar.tur,1001,:)
meh.tur,9999,ERR
```
Em caso de erro na saída, imprimir apenas “ERR” na coluna de resultado.

21 - Primos em Pi
Introdução 
O número pi (π) é uma das mais famosas e mais facilmente reconhecidas constantes matemáticas. Originalmente definido como o resultado da divisão da circunferência de um círculo pelo seu diâmetro, π é um número irracional e a sua representação decimal é infinita e não se repete.

Instruções 
Este desafio consiste em encontrar a sequência mais longa de números primos (entre 2 e 9973) no primeiro 1 milhão de casas decimais de π.

Em detalhes:

Localize a sequência mais longa (em dígitos) de números primos nas casas decimais de π no arquivo fornecido (1 milhão de casas decimais).

Em caso de mais de uma sequência do mesmo tamanho, a sequência com o início mais próximo do ponto decimal deverá ser utilizada.

Apenas números primos entre 2 e 9973 deverão ser considerados na busca (basicamente, números primos contendo de um a quatro dígitos).

Exemplo 
Considere π com 20 decimais:
```
3.14159265358979323846
```
Neste caso, a maior sequência de numeros primos seria:
```
41 59 2 653 5 89 7 9323
```
Que resulta na sequência:
```
4159265358979323
```

22 - Potências de 2
Introdução 
A base 2 é uma das bases mais usadas em computação. Números nessa base são representados pela equação 2^n. Exemplo:

2^0 = 1
2^1 = 2
2^2 = 4
2^3 = 8
E assim por diante.

Instruções 
Este desafio consiste em:

Ler um arquivo de números (abaixo), contendo um número por linha.
Se o número for uma potência de 2, imprimir o número seguido de true e o expoente ao qual se deve elevar 2 para obter o número.
Se o número não for uma potência de 2, imprimir o número seguido de false.
Exemplo 
Considere a lista de números:
```
1
140
128
137
65535
65536
17179869184

```
A saída deverá ser:
```
1 true 0
140 false
128 true 7
137 false
65535 false
65536 true 16
17179869184 true 34
```
