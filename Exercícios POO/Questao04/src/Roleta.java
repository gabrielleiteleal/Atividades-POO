import java.util.Scanner;
import java.util.Random;

public class Roleta {

    // Atributos
    private int numGerado;
    private int numUser;
    private boolean vermelhoMaq;
    private boolean vermelhoUser;
    private Scanner scanner = new Scanner(System.in);
    private Random gerador = new Random();

    // Jogar
    public void jogar() {
        System.out.println("=============== ROLETA ===============");
        System.out.print("Escolha [0] Vermelho ou [1] Preto: ");
        int opcaoUser = scanner.nextInt();

        if (opcaoUser == 0) {
            setVermelhoUser(true);
            //Utilizar um for para exibir apenas numeros vermelhos
        } else if (opcaoUser == 1) {
            setVermelhoUser(false);
            //Utilizar um for para exibir apenas numeros pretos
        } else {
            System.out.println("Opção inválida");
        }

        

        System.out.print("Escolha um número de 1 à 36: ");
        this.numUser = scanner.nextInt();
        // String varMorta = scanner.nextLine();

        sorteio();
        System.out.println(this.numGerado);
        System.out.println(this.numUser);
        System.out.println(this.vermelhoMaq);
        System.out.println(this.vermelhoUser);
        if (this.numGerado == this.numUser || this.vermelhoMaq == this.vermelhoUser) {
            System.out.println("O usuário Venceu!!");
        } else {
            System.out.println("A máquina Venceu, você perdeu!!");
        }
    }

    // Método para sortear número e cor
    public void sorteio() {
        this.numGerado = gerador.nextInt(37);
        if (numGerado % 2 == 0) {
            setVermelhoMaq(false);
        } else {
            setVermelhoMaq(true);
        }
    }

    // Getter & Setter
    public int getNumGerado() {
        return this.numGerado;
    }

    public boolean isVermelhoMaq() {
        return this.vermelhoMaq;
    }

    public boolean isVermelhoUser() {
        return this.vermelhoUser;
    }

    public void setNumGerado(int n) {
        this.numGerado = n;
    }

    public void setVermelhoMaq(boolean vm) {
        this.vermelhoMaq = vm;
    }

    public void setVermelhoUser(boolean vu) {
        this.vermelhoUser = vu;
    }

}
