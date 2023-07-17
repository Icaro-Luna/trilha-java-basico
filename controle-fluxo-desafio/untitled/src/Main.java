import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.println("Insira o segundo número: ");
        int num2 = sc.nextInt();

        if (num2 < num1){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior do que o primeiro");
        }
        Contador(num1, num2);
    }

    public static class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException(String mensagem){
            super(mensagem);
        }
    }


    static void Contador (int num1, int num2){
        for (int i = num1; i < (num2 -1) ; i++) {
            System.out.println("Imprimindo número "+(i+1));
        }
    }
}