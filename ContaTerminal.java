import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
     Scanner scanner = new Scanner(System.in);


     System.out.println("Digite seu nome ");
     String NomeCli = scanner.next();
     

     System.out.println("Digite sua agencia ");
     Double Agencia = scanner.nextDouble();
     

     System.out.println("Digite Numero da sua conta ");
     Double NumeroC= scanner.nextDouble();

     System.out.println("Digite seu saldo ");
     Float Saldo = scanner.nextFloat();





     System.out.println("Seu nome é " + NomeCli);
     System.out.println("Sua agencia é " + Agencia);
     System.out.println("Numero da sua conta é " + NumeroC);
     System.out.println("Seu saldo é " + Saldo);


     System.out.println("Olá " + NomeCli + ",obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + NumeroC + " e seu saldo é " + Saldo + " já está disponível para saque.");





    }
}
