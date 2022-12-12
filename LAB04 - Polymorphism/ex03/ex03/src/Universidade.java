import java.time.LocalDate;

public class Universidade {
    private String nomeUniversidade;
    private LocalDate fundacao;
    private Estudante[] alunos;

    public Universidade(String nomeUniversidade, LocalDate fundacao, Estudante[] alunos) {
        this.nomeUniversidade = nomeUniversidade;
        this.fundacao = fundacao;
        this.alunos = alunos;
    }

    public String getNomeUniversidade() {
        return nomeUniversidade;
    }

    public void setNomeUniversidade(String nomeUniversidade) {
        this.nomeUniversidade = nomeUniversidade;
    }

    public LocalDate getFundacao() {
        return fundacao;
    }

    public void setFundacao(LocalDate fundacao) {
        this.fundacao = fundacao;
    }

    public void quantidadeEstudantes(){
        int graduacao = 0, mestrado = 0, doutorado = 0;

        for(int i = 0; i < alunos.length; i++){
            if(alunos[i] instanceof EstudanteGraduacao) graduacao++;
            else if(alunos[i] instanceof EstudanteMestrado) mestrado++;
            else if(alunos[i] instanceof EstudanteDoutorado) doutorado++;
        }

        System.out.printf("Alunos de graduação: %d\n", graduacao);
        System.out.printf("Alunos de mestrado: %d\n", mestrado);
        System.out.printf("Alunos de doutorado: %d\n", doutorado);
    }
}
