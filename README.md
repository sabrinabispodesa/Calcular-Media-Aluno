## Cadastro de Alunos 📚
Projeto Java simples para cadastro e exibição de informações de alunos. Ele solicita nome, RA e três notas, calcula a média, e exibe o resultado com a situação de aprovação.

## 📁 Estrutura do Projeto
less
Copiar
Editar
tentativa.pkg3/
├── Main.java        // Classe principal com lógica de entrada e exibição
├── Aluno.java       // Classe modelo representando os alunos
└── README.md        // Você está vendo este arquivo!

## 🚀 Funcionalidades

Solicita ao usuário o número de alunos a cadastrar.

Para cada aluno, coleta:

Nome

Registro Acadêmico (RA)

Três notas (A1, A2, A3)

Calcula a média das três notas.

Determina a situação:

Aprovado (média ≥ 7)

Reprovado (média < 7 e > 0)

Ausente (média igual a 0, ou sem notas)

Exibe todos os alunos cadastrados, com média e situação.

## 🧠 Como Funciona

Main.java
Pede o número total de alunos a cadastrar.

Cria um array Aluno[] para armazenar os objetos.

Em loop do...while, lê nome, RA e notas, cria cada objeto Aluno e armazena no array.

Após inserir todos, imprime a lista completa via toString() do Aluno.

Aluno.java
Atributos:

nome (String)

registroAluno / RA (int)

notas (int[3])

média (float) e situação (String) – definidos via métodos.

Construtores:

Principal com todos os parâmetros.

Alternativo que só recebe nome, RA e notas.

Métodos principais:

calcularMedia(): soma as notas e divide por 3.

verificarSituacao(): decide se está aprovado, reprovado ou ausente.

toString(): formata a saída com dados do aluno.

## 📥 Como Executar
Clone o repositório:

bash
Copiar
Editar
git clone https://seu-repositorio.git
Entre na pasta:

bash
Copiar
Editar
cd tentativa.pkg3
Compile as classes:

bash
Copiar
Editar
javac Main.java Aluno.java
Execute o programa:

bash
Copiar
Editar
java tentativa.pkg3.Main
Siga os prompts no terminal para cadastrar os alunos.

## ✨ Melhorias Futuras
Validar entradas (ex.: evitar notas negativas ou RA inválido).

Usar Scanner.nextLine() para capturar nomes compostos.

Tratar possível exceção caso o usuário digite algo diferente de número.

Adicionar persistência (salvar em arquivo .csv ou banco de dados).

Implementar interface gráfica para tornar a aplicação mais interativa.

Adicionar opções de reiniciar ou remover alunos.

## 📌 Exemplo de Execução
markdown
Copiar
Editar
Digite o número de alunos que você deseja cadastrar?
> 2

---------- Aluno #: 1 ----------
Digite nome do aluno:
> Maria
Digite RA do aluno:
> 123
Digite nota A1:
> 8
Digite nota A2:
> 7
Digite nota A3:
> 9

---------- Aluno #: 2 ----------
Digite nome do aluno:
> João
Digite RA do aluno:
> 456
Digite nota A1:
> 5
Digite nota A2:
> 6
Digite nota A3:
> 4

------------------------------ Lista de Alunos ------------------------------
Aluno{Nome= Maria, RA= 123, Média= 8.0, Situação= Aprovado}
Aluno{Nome= João, RA= 456, Média= 5.0, Situação= Reprovado}
📝 Contato
Desenvolvido por sabrinadesa. Fique à vontade para abrir issues ou enviar um pull request com sugestões e melhorias!
