import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        Figurinhas jogador1 = new Figurinhas();
        Figurinhas jogador2 = new Figurinhas();

        //  Seleção 1 + jogadores
        jogador1.setName("Luva de pedreiro");
        jogador1.setBirthday(Date.valueOf("1666-04-20"));
        jogador1.setHeight(2);
        jogador1.setWeight(90);
        jogador1.setPosition("tacante");
        jogador1.setCountry("Brazil");
        Selecao selecao1 = new Selecao("Brasil", "Dunga", jogador1);

        //  Seleção 2 + jogadores
        jogador2.setName("Luva de marceneiro");
        jogador2.setBirthday(Date.valueOf("1666-04-21"));
        jogador2.setHeight(1.5F);
        jogador2.setWeight(85);
        jogador2.setPosition("efesa");
        jogador2.setCountry("Brazil");

        Selecao selecao2 = new Selecao("Estados Unidos", "Tom Jobim", jogador2);

        //System.out.println(selecao2.getJogadores().getName());

    }
}