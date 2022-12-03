package Banco;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner leia = new Scanner(System.in)) {

            int opcao;
            System.out.println("Digite o nome do titular da conta:");
            String titular = leia.nextLine();

            System.out.println("Digite o numero da conta:");
            int numeroConta = leia.nextInt();
            leia.nextLine();

            System.out.println("Digite o valor inicial:");
            Double saldo = leia.nextDouble();
            leia.nextLine();

            contaBancaria conta = new contaBancaria(titular, numeroConta, saldo);

            do {
                System.out.println("*****Banco da tech4me*****");
                System.out.println("1- Depositar");
                System.out.println("2- Sacar");
                System.out.println("3- Transferir");
                System.out.println("4- Consultar saldo");
                System.out.println("0- Sair");
                System.out.println("Opção: ");
                opcao = leia.nextInt();
                leia.nextLine();

                switch (opcao) {

                    case 1:
                        System.out.println(" Valor deposito:");
                        conta.depositar(leia.nextDouble());
                        System.out.println("Digite ENTER para voltar ao menu \n");
                        leia.nextLine();
                        break;

                    case 2:
                        System.out.println("Valor saque:");
                        conta.sacar(leia.nextDouble());
                        System.out.println("Digite ENTER para voltar ao menu \n");
                        leia.nextLine();
                        break;

                    case 3:
                        System.out.println("Digite o nome que deseja transferir:");
                        String nome = leia.nextLine();
                        System.out.println("Digite o valor da transferincia:");
                        double transferencia = leia.nextDouble();
                        conta.transferir(nome, transferencia);
                        System.out.println("Digite ENTER para voltar ao menu \n");
                        leia.nextLine();
                        break;

                    case 4:
                        System.out.print("Saldo da conta é:" + conta.getSaldo() + "\n\n");
                        System.out.println("Digite ENTER para voltar ao menu \n");
                        leia.nextLine();

                        break;

                    default:
                        System.out.println("Opção Invalida.");
                        System.out.println("Digite ENTER para voltar ao menu");
                        leia.nextLine();
                        break;

                }
            } while (opcao != 0);
        }

    }
}
