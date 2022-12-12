public class Quadrado extends FormaBidimensional {
    public Quadrado(double lado) {
        super(0, 0, 0, lado);
        setArea();
    }

    public double obterArea(){
        return super.obterArea();
    }

    public void setArea() {
        double area = lado * lado;
        super.setArea(area);
    }

    public void descricao(){
        System.out.print("Quadrado");
    }
}
