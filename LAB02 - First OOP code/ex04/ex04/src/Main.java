import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        Figurinhas[] jogadorSel1 = new Figurinhas[11];
        Figurinhas[] jogadorSel2 = new Figurinhas[11];
        Selecao selecao1 = new Selecao();
        Selecao selecao2 = new Selecao();

        for(int i = 0; i < 11; i++){
            jogadorSel1[i] = new Figurinhas();
            jogadorSel2[i] = new Figurinhas();
        }

        //  Instanciação jogadores seleção 1
        jogadorSel1[0].setName("Luva de pedreiro");
        jogadorSel1[0].setBirthday(Date.valueOf("1666-04-20"));
        jogadorSel1[0].setHeight(2);
        jogadorSel1[0].setWeight(90);
        jogadorSel1[0].setPosition("tacante");
        jogadorSel1[0].setCountry("Brazil");

        jogadorSel1[1].setName("Luva de marceneiro");
        jogadorSel1[1].setBirthday(Date.valueOf("1666-04-21"));
        jogadorSel1[1].setHeight(1.5F);
        jogadorSel1[1].setWeight(85);
        jogadorSel1[1].setPosition("efesa");
        jogadorSel1[1].setCountry("Brazil");

        jogadorSel1[2].setName("Luva de padeiro");
        jogadorSel1[2].setBirthday(Date.valueOf("1666-04-21"));
        jogadorSel1[2].setHeight(1.5F);
        jogadorSel1[2].setWeight(85);
        jogadorSel1[2].setPosition("efesa");
        jogadorSel1[2].setCountry("Brazil");

        jogadorSel1[3].setName("Luva de calcario");
        jogadorSel1[3].setBirthday(Date.valueOf("1666-04-21"));
        jogadorSel1[3].setHeight(1.5F);
        jogadorSel1[3].setWeight(85);
        jogadorSel1[3].setPosition("efesa");
        jogadorSel1[3].setCountry("Brazil");

        jogadorSel1[4].setName("Luva de boxe");
        jogadorSel1[4].setBirthday(Date.valueOf("1666-04-21"));
        jogadorSel1[4].setHeight(1.5F);
        jogadorSel1[4].setWeight(85);
        jogadorSel1[4].setPosition("efesa");
        jogadorSel1[4].setCountry("Brazil");

        jogadorSel1[5].setName("Luva de vendedor");
        jogadorSel1[5].setBirthday(Date.valueOf("1666-04-21"));
        jogadorSel1[5].setHeight(1.5F);
        jogadorSel1[5].setWeight(85);
        jogadorSel1[5].setPosition("efesa");
        jogadorSel1[5].setCountry("Brazil");

        jogadorSel1[6].setName("Luva de goleiro");
        jogadorSel1[6].setBirthday(Date.valueOf("1666-04-21"));
        jogadorSel1[6].setHeight(1.5F);
        jogadorSel1[6].setWeight(85);
        jogadorSel1[6].setPosition("efesa");
        jogadorSel1[6].setCountry("Brazil");

        jogadorSel1[7].setName("Luva de otaco");
        jogadorSel1[7].setBirthday(Date.valueOf("1666-04-21"));
        jogadorSel1[7].setHeight(1.5F);
        jogadorSel1[7].setWeight(85);
        jogadorSel1[7].setPosition("efesa");
        jogadorSel1[7].setCountry("Brazil");

        jogadorSel1[8].setName("Luva de ladrao");
        jogadorSel1[8].setBirthday(Date.valueOf("1666-04-21"));
        jogadorSel1[8].setHeight(1.5F);
        jogadorSel1[8].setWeight(85);
        jogadorSel1[8].setPosition("efesa");
        jogadorSel1[8].setCountry("Brazil");

        jogadorSel1[9].setName("Luva de lixeiro");
        jogadorSel1[9].setBirthday(Date.valueOf("1666-04-21"));
        jogadorSel1[9].setHeight(1.5F);
        jogadorSel1[9].setWeight(85);
        jogadorSel1[9].setPosition("efesa");
        jogadorSel1[9].setCountry("Brazil");

        jogadorSel1[10].setName("Luva de computeiro");
        jogadorSel1[10].setBirthday(Date.valueOf("1666-04-21"));
        jogadorSel1[10].setHeight(1.5F);
        jogadorSel1[10].setWeight(85);
        jogadorSel1[10].setPosition("efesa");
        jogadorSel1[10].setCountry("Brazil");

        selecao1.setName("Brazil");
        selecao1.setTecnico("Luxemburgo");
        selecao1.setJogador(jogadorSel1);

        //  Instanciação jogadores seleção 2
        jogadorSel2[0].setName("Luva de pedreiro");
        jogadorSel2[0].setBirthday(Date.valueOf("1666-04-20"));
        jogadorSel2[0].setHeight(2);
        jogadorSel2[0].setWeight(90);
        jogadorSel2[0].setPosition("tacante");
        jogadorSel2[0].setCountry("Mexico");

        jogadorSel2[1].setName("Luva de marceneiro");
        jogadorSel2[1].setBirthday(Date.valueOf("1666-04-21"));
        jogadorSel2[1].setHeight(1.5F);
        jogadorSel2[1].setWeight(85);
        jogadorSel2[1].setPosition("efesa");
        jogadorSel2[1].setCountry("Mexico");

        jogadorSel2[2].setName("Luva de padeiro");
        jogadorSel2[2].setBirthday(Date.valueOf("1666-04-21"));
        jogadorSel2[2].setHeight(1.5F);
        jogadorSel2[2].setWeight(85);
        jogadorSel2[2].setPosition("efesa");
        jogadorSel2[2].setCountry("Mexico");

        jogadorSel2[3].setName("Luva de calcario");
        jogadorSel2[3].setBirthday(Date.valueOf("1666-04-21"));
        jogadorSel2[3].setHeight(1.5F);
        jogadorSel2[3].setWeight(85);
        jogadorSel2[3].setPosition("efesa");
        jogadorSel2[3].setCountry("Mexico");

        jogadorSel2[4].setName("Luva de boxe");
        jogadorSel2[4].setBirthday(Date.valueOf("1666-04-21"));
        jogadorSel2[4].setHeight(1.5F);
        jogadorSel2[4].setWeight(85);
        jogadorSel2[4].setPosition("efesa");
        jogadorSel2[4].setCountry("Mexico");

        jogadorSel2[5].setName("Luva de vendedor");
        jogadorSel2[5].setBirthday(Date.valueOf("1666-04-21"));
        jogadorSel2[5].setHeight(1.5F);
        jogadorSel2[5].setWeight(85);
        jogadorSel2[5].setPosition("efesa");
        jogadorSel2[5].setCountry("Mexico");

        jogadorSel2[6].setName("Luva de goleiro");
        jogadorSel2[6].setBirthday(Date.valueOf("1666-04-21"));
        jogadorSel2[6].setHeight(1.5F);
        jogadorSel2[6].setWeight(85);
        jogadorSel2[6].setPosition("efesa");
        jogadorSel2[6].setCountry("Mexico");

        jogadorSel2[7].setName("Luva de otaco");
        jogadorSel2[7].setBirthday(Date.valueOf("1666-04-21"));
        jogadorSel2[7].setHeight(1.5F);
        jogadorSel2[7].setWeight(85);
        jogadorSel2[7].setPosition("efesa");
        jogadorSel2[7].setCountry("Mexico");

        jogadorSel2[8].setName("Luva de ladrao");
        jogadorSel2[8].setBirthday(Date.valueOf("1666-04-21"));
        jogadorSel2[8].setHeight(1.5F);
        jogadorSel2[8].setWeight(85);
        jogadorSel2[8].setPosition("efesa");
        jogadorSel2[8].setCountry("Mexico");

        jogadorSel2[9].setName("Luva de lixeiro");
        jogadorSel2[9].setBirthday(Date.valueOf("1666-04-21"));
        jogadorSel2[9].setHeight(1.5F);
        jogadorSel2[9].setWeight(85);
        jogadorSel2[9].setPosition("efesa");
        jogadorSel2[9].setCountry("Mexico");

        jogadorSel2[10].setName("Luva de computeiro");
        jogadorSel2[10].setBirthday(Date.valueOf("1666-04-21"));
        jogadorSel2[10].setHeight(1.5F);
        jogadorSel2[10].setWeight(85);
        jogadorSel2[10].setPosition("efesa");
        jogadorSel2[10].setCountry("Mexico");

        selecao2.setName("Mexico");
        selecao2.setTecnico("Pelé");
        selecao2.setJogador(jogadorSel2);


    }
}