import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        String nome = "Tião";
        String conta = "Conta Corrente";
        Double saldoInicial = 1000.00;

        int senha = 1234;
        int opcao = 0;

        System.out.println("Digite a senha:");
        int senhaDigitada = leitura.nextInt();

    if (senhaDigitada == senha) {
        System.out.println("Senha correta!");
        System.out.println("\nDados do usuário: ");
        System.out.println("Nome: " + nome);
        System.out.println("Conta: " + conta);
        System.out.println("Saldo atual: " + saldoInicial);

        String menu = """
                
                ** Digite sua opção **
                
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                 
                """;

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("O salda atual é: " + saldoInicial);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir? ");
                double valor = leitura.nextDouble();
                if (valor > saldoInicial) {
                    System.out.println("Não há saldo para realizar a transferência");
                } else {
                    saldoInicial -= valor;
                    System.out.println("O salda atual é: " + saldoInicial);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldoInicial += valor;
                System.out.println("O salda atual é: " + saldoInicial);
            } else if (opcao != 4) {
                System.out.println("Opção inválida");
            }
        }
    } else {
        System.out.println("Senha incorreta!");
    }
    }
}