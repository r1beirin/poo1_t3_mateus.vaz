import java.time.LocalDate;

public class FigurinhasExtra {
    private String name;
    private LocalDate birthday;
    private double height;
    private double weight;
    private String position;
    private String country;
    private String category;
    private String color;


    public FigurinhasExtra(String name, LocalDate birthday, double height, double weight, String position, String country, String category, String color) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
        this.position = position;
        this.country = country;
        this.category = category;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCountry() {
        return country;
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
