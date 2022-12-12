public class FormaTridimensional extends Forma{
    protected double profundidade;

    public FormaTridimensional(double altura, double largura, double raio, double lado, double profundidade) {
        super(altura, largura, raio, lado);
        this.profundidade = profundidade;
    }

    public double obterArea(){
        return super.obterArea();
    }

    @Override
    public void setArea(double area) {
        super.setArea(area);
    }

    public double obterVolume(){
        return super.obterVolume();
    }

    @Override
    public void setVolume(double volume) {
        super.setVolume(volume);
    }
}
