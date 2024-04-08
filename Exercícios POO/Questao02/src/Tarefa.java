public class Tarefa {
    
    private String descrição;
    private boolean concluida;
    private int id;

    public Tarefa(String d){
        this.descrição = d;
    }


    public String getDescrição(){return this.descrição;}
    public boolean isConcluida(){return this.concluida;}
    public int getId(){return this.id;}
    public void setDescrição(String d){this.descrição = d;}
    public void setConcluida(boolean c){this.concluida = c;}
    public void setId(int id){this.id = id;}

}
