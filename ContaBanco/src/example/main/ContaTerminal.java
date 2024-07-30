import java.util.Scanner;

import example.model.Conta;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Olá, para realizar o seu cadastro, informe seu nome completo!");
        String nome = input.nextLine();
            
        System.out.println("Excelente! Agora preciso do número da sua agência. \nExemplo: 067-8");
        String agencia = input.nextLine();

        System.out.println("Falta só um pouco para finalizarmos... Agora preciso do seu número da conta.");
        int numeroConta = input.nextInt();

        System.out.println("Para finalizar, informe seu saldo!");
        double saldoConta = input.nextDouble();


        Conta novaConta = new Conta(numeroConta, agencia, nome, saldoConta);


        System.out.println("Olá "+ novaConta.getNomeCliente() +", obrigado por criar uma conta em nosso banco, sua agência é "+ novaConta.getAgencia() +", conta "+ novaConta.getNumero() +" e seu saldo "+ novaConta.getSaldo() +" já está disponível para saque");
    }
}
