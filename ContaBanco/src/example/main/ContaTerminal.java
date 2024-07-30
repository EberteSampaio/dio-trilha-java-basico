import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import example.model.Conta;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        try{
            Scanner input = new Scanner(System.in);

            System.out.println("Olá, para realizar o seu cadastro, informe seu nome completo!");
            String nome = input.nextLine();

            validarNome(nome);
                
            System.out.println("Excelente! Agora preciso do número da sua agência. \nExemplo: 067-8");
            String agencia = input.nextLine();

            validarAgencia(agencia);

            System.out.println("Falta só um pouco para finalizarmos... Agora preciso do seu número da conta. \nExemplo: 1021");
            int numeroConta = input.nextInt();

            validarNumeroConta(numeroConta);

            System.out.println("Para finalizar, informe seu saldo!");
            double saldoConta = input.nextDouble();

            validarSaldo(saldoConta);

            Conta novaConta = new Conta(numeroConta, agencia, nome, saldoConta);

            System.out.println("Olá "+ novaConta.getNomeCliente() +", obrigado por criar uma conta em nosso banco, sua agência é "+ novaConta.getAgencia() +", conta "+ novaConta.getNumero() +" e seu saldo "+ novaConta.getSaldo() +" já está disponível para saque");
            
            input.close(); 

        } catch (InputMismatchException |IllegalArgumentException exception) {

            String msg = (exception.getMessage() == null)? "Aceitamos apenas no formato informado no exemplo.": exception.getMessage();

            System.out.println(msg +" Tente novamente!");
        }
        
    
    }

     public static void validarAgencia(String agencia) throws IllegalArgumentException {

        Pattern formatoAgencia = Pattern.compile("\\d{3}-\\d");
        Matcher validaFormato = formatoAgencia.matcher(agencia);

        if (!validaFormato.matches()) {
            throw new IllegalArgumentException("O formato da agência precisar seguir o exemplo.");
        }
    }

    public static void validarNumeroConta(int numeroConta) {

        Pattern formatoNumeroConta = Pattern.compile("\\d{4}");
        Matcher validaFormato = formatoNumeroConta.matcher(String.valueOf(numeroConta));

        if (!validaFormato.matches()) {
            throw new IllegalArgumentException("O formato da agência precisar seguir o exemplo.");
        }
    }

    public static void validarNome(String nome) {

        if(nome.equals("") || nome == null){
            throw new IllegalArgumentException("É necessário preencher o nome.");
        }
    }

    public static void validarSaldo(double saldoConta) {

        if(saldoConta < 0){
            throw new IllegalArgumentException("Não é aceito valores menores que zero.");  
        }
    }
}
