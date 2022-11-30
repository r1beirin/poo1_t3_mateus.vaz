import javax.sound.midi.SysexMessage;

public class C1 {
    public String presidente;
    protected int quantidadeVotos;
    private String pais;

    public C1(){
        System.out.println("Classe C1: chamada do construtor padrao, sem parametros");
    }

    public C1(String presidente, int quantidadeVotos, String pais){
        System.out.println("Classe C1: chamada do construtor padrao, com parametros");
        this.presidente = presidente;
        this.quantidadeVotos = quantidadeVotos;
        this.pais = pais;
    }

    public String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    public int getQuantidadeVotos() {
        return quantidadeVotos;
    }

    public void setQuantidadeVotos(int quantidadeVotos) {
        this.quantidadeVotos = quantidadeVotos;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void mostrar_atributos(){
        System.out.printf("Nome do presidente: \n", getPresidente());
        System.out.printf("Qtd de votos: \n", getQuantidadeVotos());
        System.out.printf("País: \n", getPais());
    }
}
