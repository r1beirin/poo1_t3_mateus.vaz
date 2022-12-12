public class Cubo extends FormaTridimensional{
    public Cubo(double lado) {
        super(0, 0, 0, lado, 0);
        setArea();
        setVolume();
    }

    public double obterArea(){
        return super.obterArea();
    }

    public void setArea() {
        double area = 6 * (lado * lado);
        super.setArea(area);
    }

    public void setVolume() {
        double volume = lado * lado * lado;
        super.setVolume(volume);
    }

    public double obterVolume(){
        return super.obterVolume();
    }

    public void descricao(){
        System.out.print("Cubo");
    }
}
