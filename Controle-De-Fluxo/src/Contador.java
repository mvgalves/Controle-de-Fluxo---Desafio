import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        boolean sucesso = true;
        

        try {
            System.out.println("Digite o Parâmetro 1");
            int parametroUm = terminal.nextInt();
            
            System.out.println("Digite o Parâmetro 2");
            int parametroDois = terminal.nextInt();
            
            contar(parametroUm,parametroDois);
          
           } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage()); 
            sucesso = false;
          
           } catch (Exception e) {
            System.out.println("Os parâmetros devem ser números inteiros.");
            sucesso = false;

           } finally { 
            terminal.close(); 
            if (sucesso) {
                System.out.println("Programa finalizado com sucesso.");
            } else {
                System.out.println("Programa finalizado por conta do erro citado acima, tente novamente.");
            }
          }

        }

        static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
            if (parametroUm > parametroDois) {
                throw new ParametrosInvalidosException();
            }
        
        int contagem = parametroDois - parametroUm;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("imprimindo o número" + i);
        }

    }
}
    class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException() {
            super("O segundo parâmetro deve ser maior que o primeiro");
        }
}
