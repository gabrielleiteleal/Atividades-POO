import java.util.Scanner;


public class Cassino {

    private Scanner scan = new Scanner(System.in);
    private Roleta roleta = new Roleta();
    private CacaNiqueis cacaNiqueis = new CacaNiqueis();
    private Blackjack blackjack = new Blackjack();
    
    //Interface
    public void comecar(){
        System.out.println("=============== CASSINO ===============");
        System.out.println(" [0] Roleta | [1] Caça níqueis | [2] Blackjack");
        int comecar = scan.nextInt();
        switch (comecar) {
            case 0:
                roleta.jogar();
                break;
            case 1:
                cacaNiqueis.jogar();
                break;
            case 2:
                blackjack.jogar();
                break;
        }
        
    }
}
