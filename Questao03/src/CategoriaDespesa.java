import java.util.ArrayList;
import java.util.Scanner;

public class CategoriaDespesa {

    //Atributos
    private ArrayList<Despesa> alimentacao = new ArrayList<Despesa>();
    private ArrayList<Despesa> moradia = new ArrayList<Despesa>();
    private ArrayList<Despesa> transporte = new ArrayList<Despesa>();
    private ArrayList<Despesa> saude = new ArrayList<Despesa>();
    private ArrayList<Despesa> lazer = new ArrayList<Despesa>();
    private ArrayList<Despesa> outro = new ArrayList<Despesa>();
    private Despesa despesa = new Despesa();
    private Scanner scan = new Scanner(System.in);
    
    //Interface
    public void Interface(){
        System.out.println("=============== APP DESPESAS ===============");
        while (true) {
            System.out.println(" [0] Acidionar | [] Remover | [] Relatório | [3] Sair");
            int escolha = scan.nextInt();
            String varMorta = scan.nextLine();

            switch (escolha) {
                case 0:
                    System.out.println("Sla");
                    break;
            }

            if(escolha == 3){
                break;
            }
        }
    }

    //Nova despesa


}
