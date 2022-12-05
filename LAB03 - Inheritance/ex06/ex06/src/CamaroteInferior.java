public class CamaroteInferior extends Vip{
    private String localizacao;

    public CamaroteInferior(double valor, String localizacao) {
        super(valor, 0);
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void imprimeLocalizacao(){
        System.out.printf("Localização: %s\n", localizacao);
    }
}
