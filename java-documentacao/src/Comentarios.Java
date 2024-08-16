public class Comentarios {
    public static void main(String[] args) {
        // Olá, eu sou um comentário em uma única linha

        /* Olá,
         * Eu sou um comentario
         * que posso ser mais detalhado
         * quando necessário
         */

    }
    /**
    * Os dois asteriscos acima
    * é para identificar que você
    * pretende elaborar um comentário
    * a nível de documentação
    * elas se encaixam fora de um bloco de método
    */
    public void metodo(){

    }

    /*
     * Metodo de exemplo utilizando variaveis
     * com os nomes abreviados que deixaram tudo bem CONFUSO
     * este é um exemplo do que NÃO fazer
     * e, é claro, não utilizar os comentários para
     * tentar amenizar a maneira esdrúxula
     * na qual as variaveis foram escritas
     */

    public int somaMultiplica (int n, int x, String m){
        int r = 0; // r é igual ao resultado
        if (m == "M"){
            r = n * x;
        }else{
            // se não soma mesmo
            r = n + x
        }
        return r;
    }

}