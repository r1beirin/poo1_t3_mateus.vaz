import java.sql.Date;
import java.util.Scanner;

public class Selecao {
    private String name;
    private String tecnico;
    private Figurinhas[] jogador = new Figurinhas[11];

    public Selecao() {
        Scanner sc = new Scanner(System.in);

        //  Instanciando cada posição do vetor
        for(int i = 0; i < 11; i++){
            jogador[i] = new Figurinhas();
        }

        //  Preenchendo dados de cada jogador da seleção
        for(int i = 0; i < 11; i++){
            System.out.printf("Digite o nome do jogador %d: ", i+1);
            jogador[i].setName(sc.nextLine());
            System.out.printf("Digite a data de nascimento (ano-mes-dia) do jogador %d: ", i+1);
            jogador[i].setBirthday(Date.valueOf(sc.nextLine()));
            System.out.printf("Digite a altura do jogador %d: ", i+1);
            jogador[i].setHeight(sc.nextFloat());
            System.out.printf("Digite o peso do jogador %d: ", i+1);
            jogador[i].setWeight(sc.nextFloat());
            sc.nextLine();
            System.out.printf("Digite a posição do jogador %d: ", i+1);
            jogador[i].setPosition(sc.nextLine());
            System.out.printf("Digite o pais do jogador %d: ", i+1);
            jogador[i].setCountry(sc.nextLine());
            System.out.println();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public Figurinhas[] getJogador() {
        return jogador;
    }
}


