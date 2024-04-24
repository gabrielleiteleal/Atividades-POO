import java.util.ArrayList;
import java.util.Scanner;

public class CategoriaDespesa {

    // Atributos
    private ArrayList<Despesa> alimentacao = new ArrayList<Despesa>();
    private ArrayList<Despesa> moradia = new ArrayList<Despesa>();
    private ArrayList<Despesa> transporte = new ArrayList<Despesa>();
    private ArrayList<Despesa> saude = new ArrayList<Despesa>();
    private ArrayList<Despesa> lazer = new ArrayList<Despesa>();
    private ArrayList<Despesa> outro = new ArrayList<Despesa>();

    private Scanner scan = new Scanner(System.in);

    // Interface
    public void InterfaceDespesa() {
        System.out.println("=============== APP DESPESAS ===============");
        while (true) {
            System.out.println(" [0] Acidionar | [1] Remover | [2] Relatório | [3] Sair");
            int appEscolha = scan.nextInt();
            String varMorta = scan.nextLine();

            switch (appEscolha) {
                case 0:
                    System.out.println("Adicionando...");
                    novaDespesa();
                    break;

                case 1:
                    System.out.println("Removendo...");
                    break;

                case 2:
                    System.out.println("Relatório");
                    relatorio();
                    break;

            }

            if (appEscolha == 3) {
                break;
            }
        }
    }

    // Nova despesa
    public void novaDespesa() {
        Despesa despesa = new Despesa();

        System.out.print("Nome da despesa: ");
        String nomeDesp = scan.nextLine();
        despesa.setDescricao(nomeDesp);

        System.out.print("Valor da despesa: ");
        double valorDesp = scan.nextDouble();
        despesa.setValor(valorDesp);

        System.out.println("Categoria da despesa:");
        System.out.println("|0| Alimentação");
        System.out.println("|1| Moradia");
        System.out.println("|2| Transporte");
        System.out.println("|3| Saúde");
        System.out.println("|4| Lazer");
        System.out.println("|5| Outros");
        int categEscolha = scan.nextInt();
        String varMortaa = scan.nextLine();
        switch (categEscolha) {
            case 0:
                alimentacao.add(despesa);
                System.out.println("'" + despesa.getDescricao() + "' Adicionado à Alimentação");
                System.out.println("");
                break;
            case 1:
                moradia.add(despesa);
                System.out.println("'" + despesa.getDescricao() + "' Adicionado à Moradia");
                System.out.println("");
                break;
            case 2:
                transporte.add(despesa);
                System.out.println("'" + despesa.getDescricao() + "' Adicionado à Transporte");
                System.out.println("");
                break;
            case 3:
                saude.add(despesa);
                System.out.println("'" + despesa.getDescricao() + "' Adicionado à Saúde");
                System.out.println("");
                break;
            case 4:
                lazer.add(despesa);
                System.out.println("'" + despesa.getDescricao() + "' Adicionado à Lazer");
                System.out.println("");
                break;
            case 5:
                outro.add(despesa);
                System.out.println("'" + despesa.getDescricao() + "' Adicionado à Outros");
                System.out.println("");
                break;

        }
    }

    // Relatório
    public void relatorio() {

        System.out.println("Despesas em 'Alimentação': " + alimentacao.size());
        for (int rp = 0; rp < alimentacao.size(); rp++) {
            alimentacao.get(rp).detalhes();
        }

        System.out.println("Despesas em 'Moradia': " + moradia.size());
        for (int rp = 0; rp < moradia.size(); rp++) {
            moradia.get(rp).detalhes();
        }

        System.out.println("Despesas em 'Transporte': " + transporte.size());
        for (int rp = 0; rp < transporte.size(); rp++) {
            transporte.get(rp).detalhes();
        }

        System.out.println("Despesas em 'Saúde': " + saude.size());
        for (int rp = 0; rp < saude.size(); rp++) {
            saude.get(rp).detalhes();
        }

        System.out.println("Despesas em 'Lazer': " + lazer.size());
        for (int rp = 0; rp < lazer.size(); rp++) {
            lazer.get(rp).detalhes();
        }

        System.out.println("Despesas em 'Outros': " + outro.size());
        for (int rp = 0; rp < outro.size(); rp++) {
            outro.get(rp).detalhes();
        }

    }

}
