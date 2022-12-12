public class FormaBidimensional extends Forma {
    public FormaBidimensional(double altura, double largura, double raio, double lado) {
        super(altura, largura, raio, lado);
    }

    public double obterArea(){
        return super.obterArea();
    }

    @Override
    public void setArea(double area) {
        super.setArea(area);
    }
}
