public class MinhaClasse {
    
    public static void main (String [] args) {

        System.out.println("Olá mundo");

        String primeiroNome = "Daniel";
        String segundoNome = "da Silva";
        String terceiroNome = "Junior";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome, terceiroNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome, String terceiroNome) {

        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome).concat(" ").concat(terceiroNome);

    }

}
