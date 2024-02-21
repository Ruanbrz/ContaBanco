import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int cont;
    int ag;
    String nome;
    float s;

        System.out.println("Digite o numero da conta: ");
            cont = scan.nextInt();

        System.out.println("Digite o numero da agencia: ");
            ag = scan.nextInt();


        System.out.println("Informe o seu nome: ");
            nome = scan.next();


        System.out.println("Digite o seu saldo: ");
            s = scan.nextFloat();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %d e seu saldo de %.2f já esta disponível para saque" , nome , ag, cont, s);






    }

}
