<h1>PairOdd - Verificador de Par ou Ímpar</h1>
<h2>Descrição</h2>
<p>PairOdd é um pequeno programa em Java que verifica se um número digitado pelo usuário é par ou ímpar. Ele também inclui casos especiais para os números 0 e 17, retornando respostas personalizadas.</p>

   <h2>Funcionalidades</h2>
   <ul>
     <li>Solicita que o usuário digite um número inteiro.</li>
     <li>Retorna:
            <ul>
                <li>"Zero" se o número for 0.</li>
                <li>"Dezessete" se o número for 17.</li>
                <li>"Par" ou "Ímpar" para qualquer outro número, conforme o resultado da verificação.</li>
            </ul>
        </li>
        <li>Utiliza a expressão <code>switch</code> moderna do Java com <code>yield</code> para determinar a saída.</li>
    </ul>
    
  <h2>Como Executar</h2>
    <ol>
        <li>Certifique-se de ter o Java (JDK) instalado.</li>
        <li>Compile o arquivo <code>PairOdd.java</code> 
        </li>
        <li>Execute o programa: <code>java PairOdd</code>
        </li>
        <li>Digite um número quando solicitado e veja o resultado.</li>
    </ol>

  <h2>Exemplo de Uso</h2>
      <pre><code>
        -
        Digite um número para verificação de par ou ímpar: 0
        Zero
        -
        Digite um número para verificação de par ou ímpar: 17
        Dezessete
        -
        Digite um número para verificação de par ou ímpar: 8
        Par
        -
        Digite um número para verificação de par ou ímpar: 7
        Ímpar
        -
      </code></pre>
  <h2>Notas</h2>
    <ul>
        <li>O programa usa <code>Scanner</code> para entrada de dados e é fechado adequadamente após o uso.</li>
        <li>Pode gerar uma exceção <code>NumberFormatException</code> se a entrada não for um número inteiro válido.</li>
    </ul>

  <h2>Requisitos</h2>
    <ul>
        <li>Java 14 ou superior (para suporte à sintaxe moderna do <code>switch</code>).</li>
    </ul>

    

   








































     
