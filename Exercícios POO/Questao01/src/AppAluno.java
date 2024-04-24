public class AppAluno {
    public static void main(String[] args) throws Exception {

        Aluno a1 = new Aluno("Gabriel", 123, 6, 8);
        Aluno a2 = new Aluno("José", 321, 5, 6);
        Aluno a3 = new Aluno("Marcos", 777, 8, 5);
        Turma t1 = new Turma();


        t1.adicionarAluno(a1);
        t1.adicionarAluno(a2);
        t1.calcMedia(a1);
        t1.calcMedia(a2);

        t1.toString();

    }
}
