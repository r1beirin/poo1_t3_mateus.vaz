public class Circulo extends FormaBidimensional{
    public Circulo(double raio) {
        super(0, 0, raio, 0);
        setArea();
    }

    public double obterArea(){
        return super.obterArea();
    }

    public void setArea() {
        double area = (raio * raio) * Math.PI;
        super.setArea(area);
    }

    public void descricao(){
        System.out.print("Círculo");
    }
}
