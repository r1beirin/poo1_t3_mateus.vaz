public class Forma {
    private double area;
    private double volume;
    protected double altura;
    protected double largura;
    protected double raio;
    protected  double lado;

    public Forma(double altura, double largura, double raio, double lado) {
        this.altura = altura;
        this.largura = largura;
        this.raio = raio;
        this.lado = lado;
    }

    public double obterArea(){
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    public double obterVolume(){
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void descricao(){}
}
