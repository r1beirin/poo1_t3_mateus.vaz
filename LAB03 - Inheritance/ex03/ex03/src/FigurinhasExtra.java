import java.time.LocalDate;

public class FigurinhasExtra extends Figurinhas{
    private String category;
    private String color;

    public FigurinhasExtra(String name, LocalDate birthday, double height, double weight, String position, String country, String category, String color) {
        super(name, birthday, height, weight, position, country);
        this.category = category;
        this.color = color;
    }

    public FigurinhasExtra(Figurinhas fig, String category, String color){
        super(fig.getName(), fig.getBirthday(), fig.getHeight(), fig.getWeight(), fig.getPosition(), fig.getCountry());
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

    public void mostrarFigurinhas(){
        super.mostrarFigurinhas();
        System.out.printf("Categoria: %s\n", category);
        System.out.printf("Cor: %s\n", color);
    }
}
