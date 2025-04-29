# README.md: Conteúdo da Aula de JStatistics - Controles de Fluxo em Java

## Aula de 30/04/2025 (8:00-12:00)

Conteúdo para 30 alunos intermediários, ensinando **if**, **if-else**, **if-else encadeado**, **switch**, e **operador ternário** com o **JStatistics**, um jogo em Java com perguntas de estatística (média, moda). Código fonte mostrado a cada 10 minutos para orientar alunos e professor.

### 1ª Hora: Teoria (8:00-9:00)

#### 8:00-8:10 - Boas-vindas e JStatistics
- **Conteúdo**: Apresentar: "JStatistics é um jogo que ensina estatística com média e moda, usando controles de fluxo."
- **Interação**: Perguntar: "Quem curte jogos? Vamos criar um!"
- **Código**:
  ```java
  import javax.swing.JOptionPane;
  public class App {
      private static int pontuacao = 0;
      public static void main(String[] args) {
          JOptionPane.showMessageDialog(null, "Bem-vindo ao JStatistics!");
      }
  }
  ```
- **Explicação**: "Início do jogo com `JOptionPane` para mensagens."

#### 8:10-8:20 - if
- **Conteúdo**: Explicar `if`: "Executa se a condição for verdadeira."
- **Interação**: Perguntar: "O que acontece se acertar a média?"
- **Código**:
  ```java
  double resposta = Double.parseDouble(JOptionPane.showInputDialog("Média de [10, 20, 30]?"));
  double mediaCorreta = 20.0;
  if (resposta == mediaCorreta) {
      pontuacao += 10;
      JOptionPane.showMessageDialog(null, "Correto! +10 pontos!");
  }
  ```
- **Explicação**: "`if` verifica a média e dá pontos."

#### 8:20-8:30 - if-else
- **Conteúdo**: Explicar `if-else`: "Um bloco para verdadeiro, outro para falso."
- **Interação**: Perguntar: "E se errar a resposta?"
- **Código**:
  ```java
  if (resposta == mediaCorreta) {
      pontuacao += 10;
      JOptionPane.showMessageDialog(null, "Correto! +10 pontos!");
  } else {
      pontuacao -= 5;
      JOptionPane.showMessageDialog(null, "Errado! -5 pontos!");
  }
  ```
- **Explicação**: "`if-else` dá feedback para acerto ou erro."

#### 8:30-8:40 - if-else encadeado
- **Conteúdo**: Explicar `if-else encadeado`: "Testa várias condições."
- **Interação**: Perguntar: "O que faz se opVariavel for 2?"
- **Código**:
  ```java
  int opVariavel = Integer.parseInt(JOptionPane.showInputDialog("Variável: 1-Quantitativa, 2-Qualitativa"));
  if (opVariavel == 1) {
      JOptionPane.showMessageDialog(null, "Calcula média!");
  } else if (opVariavel == 2) {
      JOptionPane.showMessageDialog(null, "Encontra moda!");
  } else {
      JOptionPane.showMessageDialog(null, "Tipo inválido!");
  }
  ```
- **Explicação**: "`if-else encadeado` escolhe o tipo de pergunta."

#### 8:40-8:50 - switch
- **Conteúdo**: Explicar `switch`: "Seleciona um bloco por valor."
- **Interação**: Perguntar: "Para que serve o break?"
- **Código**:
  ```java
  int opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha: 1-Populacional, 2-Amostral, 3-Sair"));
  switch (opcao) {
      case 1: JOptionPane.showMessageDialog(null, "Populacional!"); break;
      case 2: JOptionPane.showMessageDialog(null, "Amostral!"); break;
      case 3: System.exit(0); break;
      default: JOptionPane.showMessageDialog(null, "Opção inválida!");
  }
  ```
- **Explicação**: "`switch` cria o menu principal."

#### 8:50-9:00 - Operador ternário
- **Conteúdo**: Explicar `operador ternário`: "If-else em uma linha."
- **Interação**: Perguntar: "Como seria sem ternário?"
- **Código**:
  ```java
  String mensagem = pontuacao >= 0 ? "Continue assim! Pontos: " + pontuacao : "Cuidado! Pontos: " + pontuacao;
  JOptionPane.showMessageDialog(null, mensagem);
  ```
- **Explicação**: "Ternário mostra feedback da pontuação."

### 2ª Hora: Demonstração e Revisão (9:00-10:00)

#### 9:00-9:10 - Revisão dos Conceitos
- **Conteúdo**: Resumir: "`if` verifica, `if-else` alterna, `if-else encadeado` escolhe, `switch` seleciona, ternário simplifica."
- **Interação**: Perguntar: "Qual controle é mais legal para jogos?"
- **Código**:
  ```java
  int opcao = Integer.parseInt(JOptionPane.showInputDialog("1-Populacional, 2-Amostral"));
  switch (opcao) {
      case 1:
          if (resposta == 20.0) {
              pontuacao += 10;
          } else {
              pontuacao -= 5;
          }
          break;
  }
  ```
- **Explicação**: "Combinação de `switch` e `if-else` no jogo."

#### 9:10-9:20 - Demonstração: Menu
- **Conteúdo**: Mostrar menu do JStatistics.
- **Interação**: Pedir a um aluno: "Escolha 1, 2 ou 3!"
- **Código**:
  ```java
  while (true) {
      int opcao = Integer.parseInt(JOptionPane.showInputDialog("JStatistics: 1-Populacional, 2-Amostral, 3-Sair"));
      switch (opcao) {
          case 1: jogar("Populacional"); break;
          case 2: jogar("Amostral"); break;
          case 3: JOptionPane.showMessageDialog(null, "Fim! Pontos: " + pontuacao); return;
          default: JOptionPane.showMessageDialog(null, "Opção inválida!");
      }
  }
  ```
- **Explicação**: "`switch` em loop faz o menu funcionar."

#### 9:20-9:30 - Demonstração: Pergunta Quantitativa
- **Conteúdo**: Mostrar pergunta: "Média de [10, 20, 30, 40, 50]?"
- **Interação**: Testar resposta correta (30) e errada (25).
- **Código**:
  ```java
  private static void perguntarQuantitativa(String estrategia) {
      int[] dados = {10, 20, 30, 40, 50};
      double mediaCorreta = 30.0;
      double resposta = Double.parseDouble(JOptionPane.showInputDialog("Média de " + Arrays.toString(dados) + "?"));
      if (resposta == mediaCorreta) {
          pontuacao += 10;
          JOptionPane.showMessageDialog(null, "Correto! +10 pontos!");
      } else {
          pontuacao -= 5;
          JOptionPane.showMessageDialog(null, "Errado! -5 pontos!");
      }
  }
  ```
- **Explicação**: "`if-else` verifica a média."

#### 9:30-9:40 - Demonstração: Pergunta Qualitativa
- **Conteúdo**: Mostrar pergunta: "Moda de [Azul, Vermelho, Azul]?"
- **Interação**: Pedir a um aluno: "Qual é a moda?"
- **Código**:
  ```java
  private static void perguntarQualitativa(String estrategia) {
      String[] cores = {"Azul", "Vermelho", "Azul"};
      String resposta = JOptionPane.showInputDialog("Moda de " + Arrays.toString(cores) + "?");
      if (resposta.equals("Azul")) {
          pontuacao += 10;
          JOptionPane.showMessageDialog(null, "Correto! +10 pontos!");
      } else {
          pontuacao -= 5;
          JOptionPane.showMessageDialog(null, "Errado! -5 pontos!");
      }
  }
  ```
- **Explicação**: "`if` verifica a moda."

#### 9:40-9:50 - Demonstração: Progresso
- **Conteúdo**: Mostrar mensagem de pontuação.
- **Interação**: Perguntar: "Essa pontuação motiva vocês?"
- **Código**:
  ```java
  String mensagem = pontuacao >= 0 ? "Continue assim! Pontos: " + pontuacao : "Cuidado! Pontos: " + pontuacao;
  JOptionPane.showMessageDialog(null, mensagem);
  ```
- **Explicação**: "Ternário dá feedback divertido."

#### 9:50-10:00 - Preparação para Prática
- **Conteúdo**: Explicar: "Vocês vão criar perguntas para o JStatistics!"
- **Interação**: Dividir em duplas (15 grupos) e distribuir código.
- **Código**:
  ```java
  private static void novaPergunta() {
      // Adicione sua pergunta aqui
      JOptionPane.showInputDialog("Sua pergunta?");
      if (resposta == correta) {
          pontuacao += 10;
      } else {
          pontuacao -= 5;
      }
  }
  ```
- **Explicação**: "Modelo para novas perguntas com `if-else`."

### 3ª Hora: Prática (10:00-11:00)

#### 10:00-10:10 - Início da Prática
- **Conteúdo**: Orientar: "Escolham: mediana, revisar conceitos, ou pontuação."
- **Interação**: Dizer: "Sejam criativos nas perguntas!"
- **Código**:
  ```java
  private static void perguntarMediana() {
      int[] dados = {5, 10, 15, 20, 25};
      Arrays.sort(dados);
      double mediana = dados[2]; // 15.0
      double resposta = Double.parseDouble(JOptionPane.showInputDialog("Mediana de " + Arrays.toString(dados) + "?"));
      if (resposta == mediana) {
          pontuacao += 10;
      } else {
          pontuacao -= 5;
      }
  }
  ```
- **Explicação**: "Modelo para mediana com `if`."

#### 10:10-10:20 - Prática: Mediana
- **Conteúdo**: Duplas criam pergunta de mediana.
- **Interação**: Ajudar: "Usem `Arrays.sort`!"
- **Código**:
  ```java
  if (opVariavel == 1) {
      perguntarMediana();
  } else if (opVariavel == 2) {
      perguntarQualitativa(estrategia);
  }
  ```
- **Explicação**: "Chama mediana no `if-else encadeado`."

#### 10:20-10:30 - Prática: Revisar Conceitos
- **Conteúdo**: Duplas adicionam `case 4` ao `switch`.
- **Interação**: Sugerir: "Expliquem média ou moda!"
- **Código**:
  ```java
  switch (opcao) {
      case 4:
          JOptionPane.showMessageDialog(null, "Média: Soma ÷ número de elementos");
          break;
  }
  ```
- **Explicação**: "Novo `case` ensina estatística."

#### 10:30-10:40 - Prática: Pontuação
- **Conteúdo**: Duplas ajustam pontuação com ternário.
- **Interação**: Perguntar: "Como dar pontos para quase certo?"
- **Código**:
  ```java
  pontuacao += Math.abs(resposta - mediaCorreta) < 5 ? 5 : (resposta == mediaCorreta ? 10 : -5);
  JOptionPane.showMessageDialog(null, pontuacao >= 0 ? "Bom trabalho!" : "Tente mais!");
  ```
- **Explicação**: "Ternário para pontuação dinâmica."

#### 10:40-10:50 - Prática Livre
- **Conteúdo**: Duplas criam perguntas (ex.: probabilidade).
- **Interação**: Incentivar: "Façam algo divertido, como sobre dados!"
- **Código**:
  ```java
  double resposta = Double.parseDouble(JOptionPane.showInputDialog("Chance de cara numa moeda?"));
  if (resposta == 0.5) {
      pontuacao += 10;
      JOptionPane.showMessageDialog(null, "Correto! +10 pontos!");
  } else {
      pontuacao -= 5;
  }
  ```
- **Explicação**: "Pergunta de probabilidade com `if`."

#### 10:50-11:00 - Apresentação
- **Conteúdo**: 3 duplas mostram suas perguntas.
- **Interação**: Comentar: "Essa pergunta tá show!"
- **Código**:
  ```java
  String resposta = JOptionPane.showInputDialog("Cor mais frequente: [Verde, Verde, Azul]?");
  if (resposta.equals("Verde")) {
      pontuacao += 10;
  } else {
      pontuacao -= 5;
  }
  ```
- **Explicação**: "Exemplo de pergunta criada por aluno."

### 4ª Hora: Prática e Fechamento (11:00-12:00)

#### 11:00-11:10 - Continuação da Prática
- **Conteúdo**: Duplas finalizam ou criam novas perguntas.
- **Interação**: Ajudar: "Que tal uma pergunta de probabilidade?"
- **Código**:
  ```java
  String[] dados = {"Gato", "Cachorro", "Gato"};
  String resposta = JOptionPane.showInputDialog("Moda de " + Arrays.toString(dados) + "?");
  if (resposta.equals("Gato")) {
      pontuacao += 10;
  } else {
      pontuacao -= 5;
  }
  ```
- **Explicação**: "Nova pergunta de moda."

#### 11:10-11:20 - Mais Prática
- **Conteúdo**: Duplas testam suas mudanças.
- **Interação**: Dizer: "Rodaram o jogo? Mostrem!"
- **Código**:
  ```java
  switch (opcao) {
      case 5:
          perguntarProbabilidade();
          break;
  }
  ```
- **Explicação**: "Novo `case` expande o menu."

#### 11:20-11:30 - Revisão
- **Conteúdo**: Resumir: "`if` para respostas, `switch` para menus, ternário para feedback."
- **Interação**: Perguntar: "O que mais gostaram?"
- **Código**:
  ```java
  switch (opcao) {
      case 1:
          if (opVariavel == 1) {
              perguntarQuantitativa();
          } else if (opVariavel == 2) {
              perguntarQualitativa();
          }
          break;
  }
  ```
- **Explicação**: "Fluxo completo do JStatistics."

#### 11:30-11:40 - Apresentação Final
- **Conteúdo**: 2-3 duplas mostram criações.
- **Interação**: Elogiar: "Essa pergunta é demais!"
- **Código**:
  ```java
  int resposta = Integer.parseInt(JOptionPane.showInputDialog("Chance de tirar 6 num dado? (1 a 6)"));
  if (resposta == 1) {
      pontuacao += 10;
  } else {
      pontuacao -= 5;
  }
  ```
- **Explicação**: "Pergunta de probabilidade de aluno."

#### 11:40-11:50 - Fechamento
- **Conteúdo**: Dizer: "Vocês melhoraram o JStatistics!" Tarefa: "Criem uma pergunta em casa."
- **Interação**: Perguntar: "Ideias para o JStatistics?"
- **Código**:
  ```java
  JOptionPane.showMessageDialog(null, "Fim! Pontuação final: " + pontuacao);
  ```
- **Explicação**: "Mensagem final do jogo."

#### 11:50-12:00 - Encerramento
- **Conteúdo**: Agradecer: "Parabéns por aprenderem Java e estatística!" Próxima aula: "Loops ou gráficos."
- **Interação**: Pedir aplausos para todos.
- **Código**: Nenhum (revisar).
- **Explicação**: "Hora de comemorar!"