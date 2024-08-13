public class TiposVariaveis {
    public static void main(String[] args) {
        byte idade = 123;
        short ano = 2024;
        int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
        long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo (é necessário terminar com o L)
        float pi = 3.14F; // tem que colocar um F no final se não da erro
        double salario = 1275.33;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // casting
    }
}
