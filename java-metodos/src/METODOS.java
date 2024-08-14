public class METODOS {
    public double somar(int num1, int num2){
        //LOGICA - FINALIDADE DO MÉTODO
        // AQUI PRECISA DE return POIS ME RETORNARÁ UM RESULTADO
        return ... ;
    }

    public void imprimir(String texto){
        //LOGICA - FINALIDADE DO MÉTODO
        //AQUI NÃO PRECISA DO return POIS NÃO SERÁ RETORNADO NENHUM RESULTADO
    }
    // throws Exception: Indica que o método ao ser utilizado pode gerar uma exceção
    public double dividir(int dividendo, int divisor) throws Exception{}

    private void metodoPrivado(){}
    // este método não pode ser visto por outras classes no projeto

    //alguns equívocos estruturais
    public void validar(){
        //este método deveria retornar algum valor
        //ou seja, no lugar do void teria um valor boolean (true ou false)

    }
    public void calcularEnviar(){
        //um método deve representar uma única responsabilidade.
    }

    public void gravarCliente(String nome, String cpf){
        //este método tem a finalidade de gravar informações de um cliente
        //por que não criar um objeto cliente e passar como parâmetro?
        //veja abaixo
    }

    public void gravarCliente(Cliente cliente){}
    //ou
    public void gravar(Cliente cliente){}
    
}
