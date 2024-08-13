public class TiposVariaveis {
    public static void main(String[] args) {
        //tipos primitivos
        byte idade = 123;
        short ano = 2024;
        int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
        long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo (é necessário terminar com o L)
        float pi = 3.14F; // tem que colocar um F no final se não da erro
        double salario = 1275.33;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // casting

        int numero = 5;
        numero = 10;
        System.out.println(numero);

        final double VALOR_DE_PI = 3.14;
        //VALOR_DE_PI = 5;
    }
}
