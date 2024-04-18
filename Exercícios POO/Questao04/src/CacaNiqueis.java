import java.util.Scanner;
import java.util.Random;

public class CacaNiqueis {

    // Atributos
    private int slot1;
    private int slot2;
    private int slot3;
    private String icon1;
    private String icon2;
    private String icon3;
    private Scanner scan = new Scanner(System.in);
    private Random gerador = new Random();

    // Funcionamento
    public void jogar() {
        System.out.println("=============== Caça níqueis ===============");
        sorteio();
    }

    //Método para gerar números aleatórios e verifica-los
    public void sorteio() {
        while (true) {
            this.slot1 = gerador.nextInt(4);
            this.slot2 = gerador.nextInt(4);
            this.slot3 = gerador.nextInt(4);
            switch (slot1) {
                case 0:
                    this.icon1 = "7";
                    break;
                case 1:
                    this.icon1 = "X";
                    break;
                case 2:
                    this.icon1 = "P";
                    break;
                case 3:
                    this.icon1 = "O";
                    break;
                default:
                    break;
            }
            switch (slot2) {
                case 0:
                    this.icon2 = "7";
                    break;
                case 1:
                    this.icon2 = "X";
                    break;
                case 2:
                    this.icon2 = "P";
                    break;
                case 3:
                    this.icon2 = "O";
                    break;
                default:
                    break;
            }
            switch (slot3) {
                case 0:
                    this.icon3 = "7";
                    break;
                case 1:
                    this.icon3 = "X";
                    break;
                case 2:
                    this.icon3 = "P";
                    break;
                case 3:
                    this.icon3 = "O";
                    break;
                default:
                    break;
            }
            System.out.println("Máquina");
            System.out.println("|" + this.icon1 + "|" + this.icon2 + "|" + this.icon3 + "|");
            if(slot1 == slot2 && slot1 == slot3){
                System.out.println("Parabéns! Você venceu...");
                break;
            }else{
                System.out.println("Você perdeu...");
            }
            System.out.println("Pressione para jogar novamente...");
            @SuppressWarnings("unused")
            String comecar = scan.nextLine();
        }
        
    }

}
