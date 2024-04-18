import java.util.Scanner;
import java.util.Random;

public class Blackjack {

    // Atributos
    private int bancaUser;
    private int bancaPc;
    private Scanner scan = new Scanner(System.in);
    private Random gerador = new Random();

    // Funcionamento
    public void jogar() {
        System.out.println("=============== BLACKJACK ===============");
        while (true) {
            System.out.println("Puxar uma carta...");
            String comecar = scan.nextLine();
            int cartaUser = gerador.nextInt(14);
            int cartaPc = gerador.nextInt(14);
            setBancaUser(getBancaUser() + cartaUser);
            setBancaPc(getBancaPc() + cartaPc);
            System.out.println("==========");
            System.out.println("Sua carta: " + cartaUser);
            System.out.println("Sua banca: " + getBancaUser());
            System.out.println("==========");
            System.out.println("Carta máquina: " + cartaPc);
            System.out.println("Banca máquina: " + getBancaPc());
            System.out.println("==========");

            if (getBancaUser() > 21 || getBancaPc() == 21) {
                System.out.println("Você perdeu...");
                System.out.println("Sua banca: " + getBancaUser());
                System.out.println("Banca máquina: " + getBancaPc());
                break;
            } else if (getBancaPc() > 21 || getBancaUser() == 21) {
                System.out.println("Você venceu");
                System.out.println("Sua banca: " + getBancaUser());
                System.out.println("Banca máquina: " + getBancaPc());
                break;
            }

            System.out.println("Deseja continuar [s/n]");
            String continuar = scan.nextLine();
            if (continuar.equals("n") || continuar.equals("N")) {

                if (getBancaPc() > getBancaUser() && getBancaPc() <= 21) {
                    System.out.println("Você perdeu...");
                    System.out.println("Sua banca: " + this.getBancaUser());
                    System.out.println("Banca máquina: " + this.getBancaPc());
                } else if (getBancaUser() > getBancaPc() && getBancaUser() <= 21) {
                    System.out.println("Você ganhou!!!");
                    System.out.println("Sua banca: " + getBancaUser());
                    System.out.println("Banca máquina: " + getBancaPc());
                }

                break;
            }

        }
    }

    // Getter & Setter
    public int getBancaUser() {
        return this.bancaUser;
    }

    public int getBancaPc() {
        return this.bancaPc;
    }

    public void setBancaUser(int bu) {
        this.bancaUser = bu;
    }

    public void setBancaPc(int bp) {
        this.bancaPc = bp;
    }
}
