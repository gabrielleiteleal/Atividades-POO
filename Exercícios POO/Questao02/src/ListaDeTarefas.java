import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeTarefas {

    Scanner scan = new Scanner(System.in);

    // Atributos
    private ArrayList<Tarefa> lista = new ArrayList<Tarefa>();

    // Construtor (vazio)
    public ListaDeTarefas() {
    }

    // Interface
    public void Interface() {

        System.out.println("========== Gerenciador de tarefas ==========");

        while (true) {

            System.out.println(" [0] Adicionar tarefa | [1] Marcar como concluída | [2] Remover tarefa | [3] SAIR ");
            int escolha = scan.nextInt();
            @SuppressWarnings("unused")
            final String varMorta = scan.nextLine(); // Variável morta apenas para receber o (\n) do .nextInt() acima.

            switch (escolha) {
                case 0:

                    Tarefa tarefa = new Tarefa();
                    System.out.println(("Descrição da tarefa... "));
                    String desc = scan.nextLine();
                    tarefa.novaTarefa(desc);
                    int novoId = lista.size();
                    tarefa.setId(novoId);
                    lista.add(tarefa);

                    System.out.println("========================================");
                    System.out.println("A tarefa '" + desc + "' foi adicionada à lista");
                    System.out.println("Quantidade de tarefas: " + lista.size());
                    System.out.println("========================================");
                    listarTarefas();
                    System.out.println("========================================");

                    break;

                case 1:
                    System.out.println("========== CONCLUÍDO ==========");
                    listarTarefas();
                    System.out.println("Qual tarefa foi concluída (ID)...");
                    int idConcluido = scan.nextInt();
                    for (int rp = 0; rp < lista.size(); rp++) {
                        if (idConcluido == lista.get(rp).getId()) {
                            lista.get(rp).setConcluida(true);
                            System.out.println("A tarefa '" + lista.get(rp).getDescrição() + "' foi concluída");
                        }
                    }
                    listarTarefas();

                    break;

                case 2:

                    System.out.println("========== REMOVENDO ========== ");
                    listarTarefas();
                    System.out.println("Qual tarefa deseja remover (ID)...");
                    int idRemoved = scan.nextInt();
                    for (int rp = 0; rp < lista.size(); rp++) {
                        if (idRemoved == lista.get(rp).getId()) {
                            System.out.println(
                                    "A tarefa '" + lista.get(rp).getDescrição() + "' foi removida com sucesso!");
                            lista.remove(rp);
                        }
                    }
                    for (int rp = 0; rp < lista.size(); rp++) {
                        lista.get(rp).setId(rp);
                    }

                    listarTarefas();

                    break;

                case 3:
                    break;

            }

            if (escolha == 3) {
                break;
            }

        }

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

}
