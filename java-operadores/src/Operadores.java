public class Operadores {
    public static void main(String[] args) {

        //operador de atribuição =
        String nome = "Daniel";
        int idade = 23;
        double peso = 50.2;
        char sexo = 'M';
        boolean doadorOrgao = false;
        //Date dataNascimento = new Date();

        //operadores aritmeticos
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4);

        String nomeCompleto = "LINGUAGEM" + "JAVA"; // a soma em uma String irá juntar os dois textos, também chamado de concatenação
        System.out.println(nomeCompleto);

        //Utilizar Debug nesta parte
        String concatenacao ="?";
        concatenacao = 1+1+1+"1";
            System.out.println(concatenacao); // o programa entendeu que era um operador de atribuição soma nos três primeiros números, mas quando chegou na String ele concatenou
        concatenacao = 1+"1"+1+1;
            System.out.println(concatenacao); // começou sendo um int mas ao utilizar a soma o programa viu que era uma String, entao ele concatenou os resultados posteriores
        concatenacao = 1+"1"+1+"1";
            System.out.println(concatenacao); // a mesma coisa do exemplo acima
        concatenacao = "1"+1+1+1;
            System.out.println(concatenacao); // detectou que era uma String desde o começo, portanto concatenou todos os resultados
        concatenacao = "1"+(1+1+1);
            System.out.println(concatenacao); // começou como uma String, mas ao ter uma expressão em evidência o programa a resolveu e depois concatenou com a String

        //operadores unários
        int numero = 5;
        numero = - numero; // transformar o numero em negativo
        System.out.println(numero);
        numero = numero * -1; // multiplicar por -1 para o número ficar positivo novamente
        System.out.println(numero);

        //incrementação e decrementação
        int incrementacao = 5;
        incrementacao++; // é a mesma coisa que numero = numero +1;
        System.out.println(incrementacao++); // o número não foi incrementado pois o ++ está depois da variável, então a impressão vai pegar o valor original. Ele só realizou a operação depois da impressão
        System.out.println(incrementacao);
        System.out.println(++incrementacao); // se colocar ++ antes da variável a impressão vai pegar o novo valor
        System.out.println(--incrementacao); // decrementação

        //negação
        boolean variavel = true;
        System.out.println(!variavel);
        System.out.println(variavel); // ela continua sendo true porque o valor não foi atribuido novamente
        variavel = !variavel; // é melhor inverter um valor do tipo booleano desta maneira
        System.out.println(variavel);
    }
}
