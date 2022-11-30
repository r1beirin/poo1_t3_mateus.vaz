import java.time.LocalDate;

public class FigurinhasExtra extends Figurinhas{
    private String category;
    private String color;


    public FigurinhasExtra(String name, LocalDate birthday, double height, double weight, String position, String country, String category, String color) {
        super(name, birthday, height, weight, position, country);
        this.category = category;
        this.color = color;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void mostraFigurinhas(){
        System.out.printf("Nome: %s\n", name);
        System.out.printf("Data de nascimento: %s\n", birthday);
        System.out.printf("Altura: %f\n", height);
        System.out.printf("Peso: %f\n", weight);
        System.out.printf("Posição: %s\n", position);
        System.out.printf("País: %s\n", country);
        System.out.printf("Categoria: %s\n", category);
        System.out.printf("Cor: %s\n", color);
    }
}
