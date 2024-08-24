import java.util.Scanner;

public class cashback {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double cashBack;

        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = leitor.nextInt();

        System.out.println("Digite o valor da compra: ");
        double valorDaCompra = leitor.nextDouble();

        if (idade >= 21 && valorDaCompra < 1000) {
            cashBack = 0.05;
        } else if (idade < 21 && valorDaCompra < 1000 || idade >= 21 && valorDaCompra >= 1000) {
            cashBack = 0.07;
        } else {
            cashBack = 0.10;
        }

        double valorDoCashback = valorDaCompra * cashBack;

        System.out.println("Olá " + nome + ", o seu cashback é de " + valorDoCashback);

        leitor.close(); // Fechar o Scanner
    }
}
