import java.util.Scanner;

public class ContaTerminal {
   
   public static void main(String[] args) {
   // Declaração de variáveis
    int numero;
    String agencia;
    String nomeCliente;
    double saldo = 0.0;

    // conhecer e importar a classe Scanner
    Scanner conta = new Scanner(System.in);
   
    
    System.out.println("Digite o número da conta: "); //Exibir mensagem para o usuário
    numero = conta.nextInt();                           //Ler o número da conta

    System.out.println("Digite o numero da Agencia: ");
    agencia = conta.next();

    System.out.println("Digite o nome do cliente: ");
    nomeCliente = conta.next();

    System.out.println("Digite o valor depositado: ");
    saldo = conta.nextDouble();

    //Exibir mensagem conta criada
    System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
     + agencia + " conta: " + numero +  " e seu saldo de R$" + saldo +" já está disponível para saque.");

   }
   
    
}
