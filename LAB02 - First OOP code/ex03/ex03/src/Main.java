import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        Figurinhas[] jogador = new Figurinhas[3];

        for(int i = 0; i < 3; i++){
            jogador[i] = new Figurinhas();
        }

        //  Jogador 1
        jogador[0].setName("Luva de pedreiro");
        jogador[0].setBirthday(Date.valueOf("1666-04-20"));
        jogador[0].setHeight(2);
        jogador[0].setWeight(90);
        jogador[0].setPosition("tacante");
        jogador[0].setCountry("Brazil");

        //  Jogador 2
        jogador[1].setName("Luva de marceneiro");
        jogador[1].setBirthday(Date.valueOf("1666-04-21"));
        jogador[1].setHeight(1.5F);
        jogador[1].setWeight(85);
        jogador[1].setPosition("efesa");
        jogador[1].setCountry("Brazil");

        //  Jogador 3
        jogador[2].setName("Luva de motorista");
        jogador[2].setBirthday(Date.valueOf("1666-04-23"));
        jogador[2].setHeight(1.8F);
        jogador[2].setWeight(86);
        jogador[2].setPosition("agueiro");
        jogador[2].setCountry("Brazil");

        for(int i = 0; i < 3; i++){
            System.out.println(jogador[i].getName());
            System.out.println(jogador[i].getBirthday());
            System.out.println(jogador[i].getHeight());
            System.out.println(jogador[i].getWeight());
            System.out.println(jogador[i].getPosition());
            System.out.println(jogador[i].getCountry());
            if(i == 2) continue;
            else System.out.println("========================================");
        }
    }
}
