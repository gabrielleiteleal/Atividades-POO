import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeTarefas {

    Scanner scan = new Scanner(System.in);

    // Atributos
    private ArrayList<Tarefa> lista = new ArrayList<Tarefa>();
    String tarefa = scan.nextLine();

    // Construtor (vazio)
    public ListaDeTarefas() {
    }

    // Método para adicionar uma nova tarefa
    public void adicionarTarefa(Tarefa t) {
        for (int rp = 0; rp < lista.size(); rp++) {
            t.setId(lista.get(rp).getId() + 1);
        }
        lista.add(t);
        System.out.println(("Foi adicionado à lista a tarefa: " + t.getDescrição()));
        System.out.println("Quantidade de tarefas: " + lista.size());
        System.out.println("");
    }

    // Método para listar todos os itens da lista
    public void listarTarefas() {
        System.out.println("|ID|");

        for (int rp = 0; rp < lista.size(); rp++) {
            System.out.print("|" + lista.get(rp).getId());
            System.out.print(" | " + lista.get(rp).getDescrição() + " =");
            if (lista.get(rp).isConcluida()) {
                System.out.println(" Concluída");
            } else {
                System.out.println(" Não concluída");
            }
        }
        System.out.println("");
    }

    // Método tarefa concluída
    public void tarefaConcluida(Tarefa c) {
        c.setConcluida(true);
        System.out.println("A tarefa '" + c.getDescrição() + "' foi concluída!!");
        System.out.println("");
    }

    // Método para remover tarefa (pelo ID)
    public void removerTarefa(Tarefa r) {
        lista.remove(r.getId());
        System.out.println(("A tarefa '" + r.getDescrição() + "' Foi removida da lista!!"));
        System.out.println("");
        for (int rp = 0; rp < lista.size(); rp++) {
            System.out.print("|" + lista.get(rp).getId());
            System.out.print(" | " + lista.get(rp).getDescrição() + " =");
            if (lista.get(rp).isConcluida()) {
                System.out.println(" Concluída");
            } else {
                System.out.println(" Não concluída");
            }
        }
    }

}
