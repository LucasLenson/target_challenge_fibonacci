import java.util.Scanner;

public class Fibo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int num = scanner.nextInt();

        if (isFibo(num)) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean isFibo(int num) {
        int a = 0;
        int b = 1;

        // Verificar se é 0 ou 1
        if (num == a || num == b) {
            return true;
        }

        // Verificar se pertence a Fibo
        int c;
        while (true) {
            c = a + b;
            if (c == num) {
                return true;
            } else if (c > num) {
                return false;
            }
            a = b;
            b = c;
        }
    }
}
