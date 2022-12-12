public class Main {
    public static void main(String[] args) {
        Forma[] formas = new Forma[6];

        formas[0] = new Circulo(3);
        formas[1] = new Quadrado(3);
        formas[2] = new Triangulo(3, 5);
        formas[3] = new Esfera(3);
        formas[4] = new Cubo(3);
        formas[5] = new Tetraedro(5, 4, 3);

        for(int i = 0; i < formas.length; i++){
            if(formas[i] instanceof FormaBidimensional){
                formas[i].descricao();
                System.out.printf(" - Área: %f\n", formas[i].obterArea());
            }
            else {
                formas[i].descricao();
                System.out.printf(" - Volume: %f\n", formas[i].obterVolume());
            }
        }
    }
}