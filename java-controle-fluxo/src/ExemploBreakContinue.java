public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int numeroBreak = 1; numeroBreak <=5; numeroBreak++){
            if(numeroBreak==3)
                break;

            System.out.println("break: " + numeroBreak);
        }

        for(int numeroContinue = 1; numeroContinue <=5; numeroContinue++){
            if(numeroContinue==3)
                continue;

            System.out.println("continue: " + numeroContinue);
        }
    }
}
