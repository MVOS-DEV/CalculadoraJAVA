import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Escolha uma Operação matematica:\n");
        System.out.println("1-Soma");
        System.out.println("2-Subtração");
        System.out.println("3-Multiplicação");
        System.out.println("4-Divisão");
        System.out.println("5-Resto");
        operacao1();
    }
    public static void operacao1(){
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();
        if (opcao == 1){
            System.out.println("ENTROU NO MODO SOMA!\n");
            System.out.println("Digite o primeiro valor: ");
            int n1 = scanner.nextInt();
            System.out.println("Digite o segundo valor: ");
            int n2 = scanner.nextInt();
            int soma = n1 + n2;
            System.out.println("O resultado da soma é: " + soma);
        }else if (opcao == 2){
            System.out.println("ENTROU NO MODO SUBTRACAO!\n");
            System.out.println("Digite o primeiro valor: ");
            int n1 = scanner.nextInt();
            System.out.println("Digite o segundo valor: ");
            int n2 = scanner.nextInt();
            int subitracao = n1 - n2;
            System.out.println("O resultado da subtracao é: " + subitracao);
        }else if (opcao == 3){
            System.out.println("ENTROU NO MODO MULTIPLICACAO!\n");
            System.out.println("Digite o primeiro valor: ");
            int n1 = scanner.nextInt();
            System.out.println("Digite o segundo valor: ");
            int n2 = scanner.nextInt();
            int multi = n1 * n2;
            System.out.println("O resultado da multiplicacao é: " + multi);
        }else if (opcao == 4){
            System.out.println("ENTROU NO MODO DIVISAO!\n");
            System.out.println("Digite o primeiro valor: ");
            int n1 = scanner.nextInt();
            System.out.println("Digite o segundo valor: ");
            int n2 = scanner.nextInt();
            int div = n1 / n2;
            System.out.println("O resultado da divisao é: " + div);
        }else if (opcao == 5){
            System.out.println("ENTROU NO MODO RESTO!\n");
            System.out.println("Digite o primeiro valor: ");
            int n1 = scanner.nextInt();
            System.out.println("Digite o segundo valor: ");
            int n2 = scanner.nextInt();
            int resto = n1 % n2;
            System.out.println("O resultado do resto é: " + resto);
        }else{
            System.out.println("ERRO!\n");
        }

        scanner.close();
    }

}

