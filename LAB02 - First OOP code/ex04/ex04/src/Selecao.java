public class Selecao {
    private String name;
    private String tecnico;
    private Figurinhas jogadores = new Figurinhas();

    public Selecao(String name, String tecnico, Figurinhas jogadores) {
        this.name = name;
        this.tecnico = tecnico;
        this.jogadores = jogadores;
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

    public Figurinhas getJogadores() {
        return jogadores;
    }

    public void setJogadores(Figurinhas jogadores) {
        this.jogadores = jogadores;
    }
}


