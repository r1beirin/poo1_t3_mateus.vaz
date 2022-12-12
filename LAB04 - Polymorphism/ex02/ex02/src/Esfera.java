public class Esfera extends FormaTridimensional{
    public Esfera(double raio) {
        super(0, 0, raio, 0, 0);
        setArea();
        setVolume();
    }

    public double obterArea(){
        return super.obterArea();
    }

    public void setArea() {
        double area = (raio * raio) * 4 * Math.PI;
        super.setArea(area);
    }

    public void setVolume() {
        double volume = (4/3) * Math.PI * raio * raio * raio;
        super.setVolume(volume);
    }

    public double obterVolume(){
        return super.obterVolume();
    }

    public void descricao(){
        System.out.print("Esfera");
    }
}
