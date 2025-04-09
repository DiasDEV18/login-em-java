import java.util.Scanner;

public class loginSimples {

    /**
     * @param args
     */
    public static void main(String[] args) {
    Scanner scr = new Scanner(System.in);

        String senhaCorreta = "12345678901"; // você pode trocar por qualquer senha

        System.out.print("Digite seu nome: ");
        String nome = scr.nextLine();

        System.out.print("Digite sua senha: ");
        String senhaDigitada = scr.nextLine();

        if (senhaDigitada.equals(senhaCorreta)) {
            System.out.println("Pode entrar, " + nome + "!");
        } else {
            System.out.println("Senha incorreta.");
        }

        scr.close();
    }
}





