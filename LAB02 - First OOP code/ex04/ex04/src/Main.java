import java.sql.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Selecao selecao = new Selecao();
        Figurinhas[] jogador = new Figurinhas[11];

        for(int i=0; i<11; i++){
            jogador[i] = new Figurinhas();
        }

        Scanner input = new Scanner(System.in);

        for(int i=0; i<11; i++){
            System.out.println("Nome");
            jogador[i].setName(input.nextLine());
            System.out.println("Data");
            jogador[i].setBirthday(Date.valueOf(input.nextLine()));
            System.out.println("Altura");
            jogador[i].setHeight(input.nextFloat());
            System.out.println("Peso");
            jogador[i].setWeight(input.nextFloat());
            System.out.println("Posição");
            jogador[i].setPosition(input.nextLine());
            System.out.println("Pais");
            jogador[i].setCountry(input.nextLine());
        }

    }
}