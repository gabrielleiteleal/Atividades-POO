import java.util.ArrayList;

public class Turma {
    
    private ArrayList<Aluno> turma = new ArrayList<Aluno>();
    //private Aluno[] turma = new Aluno[40];
    

    public void adicionarAluno(Aluno a){
        this.turma.add(a);
    }

    public void calcMedia(Aluno a){
        double media = (a.getNota1() + a.getNota2()) / 2;
        a.setMedia(media);
        System.out.println("A média do aluno: '" + a.getNome() + "' foi: " + a.getMedia());
    }

    @Override
    public String toString() {
        System.out.println("Quantidade de alunos: " + turma.size());
        System.out.println("");
        for(int rp = 0; rp < turma.size(); rp++){
            System.out.println("=====Dados do " + (rp+1) + " aluno=====");
            System.out.println("Nome: " + turma.get(rp).getNome());
            System.out.println("Matricula: " + turma.get(rp).getMatricula());
            System.out.println("Nota 1: " + turma.get(rp).getNota1());
            System.out.println("Nota 2: " + turma.get(rp).getNota2());
            System.out.println("Média: " + turma.get(rp).getMedia());
        }
        return super.toString();
    }

    
}
