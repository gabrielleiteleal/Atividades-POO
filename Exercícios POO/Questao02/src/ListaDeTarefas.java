import java.util.ArrayList;

public class ListaDeTarefas {

    
    
    private ArrayList<Tarefa> lista = new ArrayList<Tarefa>();

    public ListaDeTarefas(){
    }

    public void adicionarTarefa(Tarefa t){
        t.setId(t.getId() + 1);
        lista.add(t);
        System.out.println(("Foi adicionado à lista a tarefa: " + t.getDescrição()));
        System.out.println("Quantidade de tarefas: " + lista.size());
    }

    public void listarTarefas(){
        for(int rp = 0; rp < lista.size(); rp++){
            System.out.println("|ID| Tarefa | Concluída? |");
            System.out.print("|" + lista.get(rp).getId());
            System.out.print(" | " + lista.get(rp).getDescrição() + " |");
            if(lista.get(rp).isConcluida()){
                System.out.println(" Concluída");
            }else{
                System.out.println(" Não concluída");
            }
        }
    }


}
