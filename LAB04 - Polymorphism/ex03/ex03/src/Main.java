import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Estudante[] alunos = new Estudante[100];

        for(int i = 0; i < alunos.length; i++){
            alunos[i] = new Estudante();
        }

        alunos[0] = new EstudanteGraduacao("Maria", "Rua Maio", "Java is funny");
        alunos[1] = new EstudanteGraduacao("Marco", "Rua Fevereiro", "Java is funny");
        alunos[2] = new EstudanteGraduacao("Marcio", "Rua Janeiro", "Java is funny");
        alunos[3] = new EstudanteGraduacao("Julia", "Rua Dezembro", "Java is funny");
        alunos[4] = new EstudanteGraduacao("Pedro", "Rua Junho", "Java is funny");
        alunos[5] = new EstudanteMestrado("Carla","Rua Primavera","Medicina", "Vacinas de RNA", "Anticorpos","academico");
        alunos[6] = new EstudanteMestrado("Ruan","Rua Verão","Biomedicina", "Vacinas de DNA", "Anticorpos","academico");
        alunos[7] = new EstudanteDoutorado("Felipe","Rua Inverno", "Tecnologia","Processamento de Imagens","Carros Inteligentes");
        alunos[8] = new EstudanteDoutorado("Bruno","Rua Verão", "Tecnologia","Processamento de Segurança","Honeypots");
        alunos[9] = new EstudanteDoutorado("Mateus","Rua Outono", "Tecnologia","Processamento de Algoritmos","Estudo de algoritmos");
        alunos[10] = new EstudanteDoutorado("Luis","Rua Primavera", "Tecnologia","Processamento de Complexidade","Analise de complexidade");

        Universidade u = new Universidade("UFU", LocalDate.of(2000, 10, 10), alunos);

        System.out.println("============================");
        u.quantidadeEstudantes();
        System.out.println("============================");

        for(int i = 0; i < alunos.length; i++){
            if(alunos[i].getNome() != null){
                System.out.printf("Nome: %s\n", alunos[i].getNome());

                if(alunos[i] instanceof EstudanteDoutorado){
                    System.out.printf("{Título da tese: %s\n", ((EstudanteDoutorado) alunos[i]).getTituloTese());
                    System.out.printf("Linha de pesquisa: %s}\n", ((EstudanteDoutorado) alunos[i]).getLinhadDePesquisa());
                }
            }
        }

        /*
            Dessa forma, sem utilizar ArrayList é necessário fazer gambiarra
            caso eu queira acessar supostos "IDs/matriculas" de alunos, pois não estão adicionados na ordem correta,
            estão seguindo o index i do if(alunos[i] instanceof EstudantePosGrad).
         */
        Estudante[] novoAlunos = new Estudante[100];

        for(int i = 0; i < novoAlunos.length; i++){
            if(alunos[i] instanceof EstudantePosGrad) novoAlunos[i] = alunos[i];
        }
        System.out.println();
        for(int i = 0; i < novoAlunos.length; i++){
            if(novoAlunos[i] instanceof EstudantePosGrad){
                System.out.printf("Nome: %s\n", novoAlunos[i].getNome());
                System.out.printf("Endereço: %s\n", novoAlunos[i].getEndereco());
                System.out.printf("Formação: %s\n", ((EstudantePosGrad) novoAlunos[i]).getFormacao());
                System.out.printf("Linha de pesquisa: %s\n", ((EstudantePosGrad) novoAlunos[i]).getLinhadDePesquisa());
                System.out.println("=======================================================");
            }
        }
    }
}
