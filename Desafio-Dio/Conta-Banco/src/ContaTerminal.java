import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO:Conhecer e importar a classe Scanner
        //Exibir as mensagens para o nosso usuário
        //Obter pela scanner os valores digitados no terminal
        //Exibir a mensagem conta criada

        int Numero;
        String Agencia;
        String NomeCliente;
        double Saldo;

        Agencia = "067-8";
        Saldo = 237.48;




        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu nome! ");
        NomeCliente = scanner.next();

        System.out.println("Por favor digite o número da Agência! ");
        Numero = Integer.parseInt(scanner.next());







        System.out.println("Olá " + NomeCliente + " Obrigado por Criar uma conta em nosso Banco, Sua Agência é " + Agencia + ", Conta " + Numero
                + " E seu saldo " + Saldo + " Já esta disponível para saque." );

    }
}