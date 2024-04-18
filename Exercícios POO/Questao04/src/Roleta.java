import java.util.Scanner;
import java.util.Random;

public class Roleta {

    // Atributos
    private int numPc;
    private int numUser;
    private boolean vermelhoPc;
    private boolean vermelhoUser;
    private Scanner scanner = new Scanner(System.in);
    private Random gerador = new Random();

    // Jogar
    public void jogar() {

        while (true) {

            System.out.println("");
            System.out.println("=============== ROLETA ===============");

            while (true) {

                System.out.print("Escolha [0] Vermelho ou [1] Preto: ");
                int corUser = scanner.nextInt();

                if (corUser == 0) {
                    setVermelhoUser(true);
                    System.out.println("Escolha um número ímpar entre 1 e 35");
                    int numeroI = scanner.nextInt();
                    @SuppressWarnings("unused")
                    String varMorta = scanner.nextLine();
                    while (true) {
                        if (numeroI % 2 == 1) {
                            this.numUser = numeroI;
                            System.out.println("Número escolhido: " + this.numUser);
                            System.out.println("Cor escolhida: Vermelho");
                            System.out.println("==============================");
                            break;
                        } else {
                            System.out.println("Número inválido");
                        }

                    }
                    break;
                } else if (corUser == 1) {
                    setVermelhoUser(false);
                    System.out.println("Escolha um número par entre 2 e 36");
                    int numeroP = scanner.nextInt();
                    @SuppressWarnings("unused")
                    String varMorta = scanner.nextLine();
                    while (true) {
                        if (numeroP % 2 == 0) {
                            this.numUser = numeroP;
                            System.out.println("Número escolhido: " + this.numUser);
                            System.out.println("Cor escolhida: Preto");
                            System.out.println("==============================");
                            break;
                        }
                        // Else
                        System.out.println("Número inválido");

                    }
                    break;
                }

                System.out.println("Número inválido");

            }

            sorteio();

            System.out.println("Jogada da Máquina: " + this.numPc + " " + (vermelhoPc ? "Vermelho" : "Preto"));
            System.out.println("Jogada do Usuário: " + this.numUser + " " + (vermelhoUser ? "Vermelho" : "Preto"));
            if (this.numUser == this.numPc || this.vermelhoPc == this.vermelhoUser) {
                System.out.println("O usuário Venceu!!");
            } else {
                System.out.println("A máquina Venceu, você perdeu!!");// Adicionar mais verificação
            }

            System.out.println("Deseja jogar novamente [s/n]");
            String escolha = scanner.nextLine();
            if (escolha.equals("n") || escolha.equals("N")) {
                break;
            }

        }
    }

    // Método para sortear número e cor
    public void sorteio() {
        this.numPc = gerador.nextInt(37);
        if (numPc % 2 == 0) {
            setVermelhoMaq(false);
        } else {
            setVermelhoMaq(true);
        }
    }

    // Getter & Setter
    public int getNumPc() {
        return this.numPc;
    }

    public boolean isVermelhoMaq() {
        return this.vermelhoPc;
    }

    public boolean isVermelhoUser() {
        return this.vermelhoUser;
    }

    public void setNumGerado(int n) {
        this.numPc = n;
    }

    public void setVermelhoMaq(boolean vm) {
        this.vermelhoPc = vm;
    }

    public void setVermelhoUser(boolean vu) {
        this.vermelhoUser = vu;
    }

}
