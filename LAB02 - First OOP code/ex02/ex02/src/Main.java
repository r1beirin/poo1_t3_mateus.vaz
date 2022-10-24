import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        Figurinhas jogador1 = new Figurinhas();
        Figurinhas jogador2 = new Figurinhas();
        Figurinhas jogador3 = new Figurinhas();

        //  Jogador 1
        jogador1.setName("Luva de pedreiro");
        jogador1.setBirthday(Date.valueOf("1666-04-20"));
        jogador1.setHeight(2);
        jogador1.setWeight(90);
        jogador1.setPosition("tacante");
        jogador1.setCountry("Brazil");

        //  Jogador 2
        jogador2.setName("Luva de marceneiro");
        jogador2.setBirthday(Date.valueOf("1666-04-21"));
        jogador2.setHeight(1.5F);
        jogador2.setWeight(85);
        jogador2.setPosition("efesa");
        jogador2.setCountry("Brazil");

        //  Jogador 3
        jogador3.setName("Luva de motorista");
        jogador3.setBirthday(Date.valueOf("1666-04-23"));
        jogador3.setHeight(1.8F);
        jogador3.setWeight(86);
        jogador3.setPosition("agueiro");
        jogador3.setCountry("Brazil");

        System.out.println(jogador1.getName());
        System.out.println(jogador1.getBirthday());
        System.out.println(jogador1.getHeight());
        System.out.println(jogador1.getWeight());
        System.out.println(jogador1.getPosition());
        System.out.println(jogador1.getCountry());
        System.out.println("========================================");
        System.out.println(jogador2.getName());
        System.out.println(jogador2.getBirthday());
        System.out.println(jogador2.getHeight());
        System.out.println(jogador2.getWeight());
        System.out.println(jogador2.getPosition());
        System.out.println(jogador2.getCountry());
        System.out.println("========================================");
        System.out.println(jogador3.getName());
        System.out.println(jogador3.getBirthday());
        System.out.println(jogador3.getHeight());
        System.out.println(jogador3.getWeight());
        System.out.println(jogador3.getPosition());
        System.out.println(jogador3.getCountry());
    }
}
