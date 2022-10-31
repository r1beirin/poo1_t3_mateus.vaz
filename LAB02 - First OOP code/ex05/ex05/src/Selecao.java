public class Selecao {
    private String name;
    private String tecnico;
    private Figurinhas[] jogador = new Figurinhas[11];

    public Selecao(String name, String tecnico) {
        this.name = name;
        this.tecnico = tecnico;

        for(int i = 0; i < 11; i++){
            jogador[i] = new Figurinhas(name);
        }
    }

    public String getName() {
        return name;
    }

    public String getTecnico() {
        return tecnico;
    }

    public Figurinhas[] getJogador() {
        return jogador;
    }

    public void setJogador(Figurinhas[] jogadores) {
        this.jogador = jogadores;
    }
}


