public class Tetraedro extends FormaTridimensional{
    public Tetraedro(double altura, double largura, double lado) {
        super(altura, largura, 0, lado, 0);
        setArea();
        setVolume();
    }

    public double obterArea(){
        return super.obterArea();
    }

    public void setArea() {
        double area = Math.sqrt(3) * (lado * lado);
        super.setArea(area);
    }

    public void setVolume() {
        double volume = (largura/3) * altura;
        super.setVolume(volume);
    }

    public double obterVolume(){
        return super.obterVolume();
    }

    public void descricao(){
        System.out.print("Tetraedro");
    }
}
