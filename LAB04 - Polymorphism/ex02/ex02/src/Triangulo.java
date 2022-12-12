public class Triangulo extends FormaBidimensional {
    public Triangulo(double altura, double largura) {
        super(altura, largura, 0, 0);
        setArea();
    }

    public double obterArea(){
        return super.obterArea();
    }

    public void setArea() {
        double area = altura * largura;
        super.setArea(area);
    }

    public void descricao(){
        System.out.print("Triângulo");
    }
}
