import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        Figurinhas jogador1 = new Figurinhas();
        Figurinhas jogador2 = new Figurinhas();
        Figurinhas jogador3 = new Figurinhas();

        //  Jogador 1
        jogador1.name = "Luva de pedreiro";
        jogador1.birthday = Date.valueOf("1666-04-20");
        jogador1.height = 2;
        jogador1.weight = 90;
        jogador1.position = "tacante";
        jogador1.country = "Brazil";

        //  Jogador 2
        jogador2.name = "Luva de marceneiro";
        jogador2.birthday = Date.valueOf("1666-04-21");
        jogador2.height = 1.5F;
        jogador2.weight = 85;
        jogador2.position = "efesa";
        jogador2.country = "Brazil";

        //  Jogador 3
        jogador3.name = "Luva de motorista";
        jogador3.birthday = Date.valueOf("1666-04-23");
        jogador3.height = 1.8F;
        jogador3.weight = 86;
        jogador3.position = "agueiro";
        jogador3.country = "Brazil";

        System.out.println(jogador1.name);
        System.out.println(jogador1.birthday);
        System.out.println(jogador1.height);
        System.out.println(jogador1.weight);
        System.out.println(jogador1.position);
        System.out.println(jogador1.country);
        System.out.println("========================================");
        System.out.println(jogador2.name);
        System.out.println(jogador2.birthday);
        System.out.println(jogador2.height);
        System.out.println(jogador2.weight);
        System.out.println(jogador2.position);
        System.out.println(jogador2.country);
        System.out.println("========================================");
        System.out.println(jogador3.name);
        System.out.println(jogador3.birthday);
        System.out.println(jogador3.height);
        System.out.println(jogador3.weight);
        System.out.println(jogador3.position);
        System.out.println(jogador3.country);
    }
}
