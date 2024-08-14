public class Operadores {
    public static void main(String[] args) {

        //OPERADOR DE ATRIBUIÇÃO =
        String nome = "Daniel";
        int idade = 23;
        double peso = 50.2;
        char sexo = 'M';
        boolean doadorOrgao = false;
        //Date dataNascimento = new Date();

        //OPERADORES ARITMETICOS
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4);

        String nomeCompleto = "LINGUAGEM" + "JAVA"; // a soma em uma String irá juntar os dois textos, também chamado de concatenação
            System.out.println(nomeCompleto);

        //CONCATENAÇÃO
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

        //OPERADORES UNÁRIOS
        int numero = 5;
        numero = - numero; // transformar o numero em negativo
            System.out.println(numero);
        numero = numero * -1; // multiplicar por -1 para o número ficar positivo novamente
            System.out.println(numero);

        //INCREMENTAÇÃO E DECREMENTAÇÃO
        int incrementacao = 5;
        incrementacao++; // é a mesma coisa que numero = numero +1;
            System.out.println(incrementacao++); // o número não foi incrementado pois o ++ está depois da variável, então a impressão vai pegar o valor original. Ele só realizou a operação depois da impressão
            System.out.println(incrementacao);
            System.out.println(++incrementacao); // se colocar ++ antes da variável a impressão vai pegar o novo valor
            System.out.println(--incrementacao); // decrementação

        //NEGAÇÃO
        boolean variavel = true;
            System.out.println(!variavel);
            System.out.println(variavel); // ela continua sendo true porque o valor não foi atribuido novamente
        variavel = !variavel; // é melhor inverter um valor do tipo booleano desta maneira
            System.out.println(variavel);

        //TERNÁRIO
        int a, b;
        a = 5;
        b = 6;

        String ternario = a==b ? "verdadeiro" : "falso";
            System.out.println(ternario);

        //EQUALS E OPERADORES RELACIONAIS
        String nomeUm = "Daniel";
        String nomeDois = new String("Daniel");
            System.out.println((nomeUm).equals(nomeDois)); // usar equals quando for objeto

        int relacional1 = 1;
        int relacional2 = 2;

        boolean simNao = relacional1 == relacional2;

        if(relacional1 < relacional2){
            System.out.println("a nossa condição é verdadeira");
        }

            System.out.println("relacional1 é igual a relacional2? " + simNao);
        simNao = relacional1 != relacional2;
            System.out.println("relacional1 é diferente de relacional2? " + simNao);
        simNao = relacional1 > relacional2;
            System.out.println("relacional1 é maior que relacional2? " + simNao);


        //OPERADOR LÓGICO
        boolean condicao1 = true;
        boolean condicao2 = false;
        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }
        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }
            System.out.println("Fim");

        boolean condicao3 = true;
        boolean condicao4 = false;
        if(condicao3 && ( 7 > 4 )){
            System.out.println("As duas condições são verdadeiras");
        }
            System.out.println("Fim");

    }
}
