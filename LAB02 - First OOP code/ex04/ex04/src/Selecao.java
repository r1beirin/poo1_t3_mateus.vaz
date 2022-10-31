public class Selecao {
    private String name;
    private String tecnico;
    private Figurinhas[] jogador = new Figurinhas[11];

    public Selecao() {
        for(int i = 0; i < 11; i++){
            jogador[i] = new Figurinhas();
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

    public void setJogador(Figurinhas[] jogadores) {
        this.jogador = jogadores;
    }
}


