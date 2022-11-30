import java.time.LocalDate;
public class Figurinhas {
    /*
        Se os atributos estiverem como private, não é possível chamar na subclasse.
    */
    private String name;
    private LocalDate birthday;
    private double height;
    private double weight;
    private String position;
    private String country;

    public Figurinhas(String name, LocalDate birthday, double height, double weight, String position, String country) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
        this.position = position;
        this.country = country;
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

    public void mostrarFigurinhas(){
        System.out.printf("Nome: %s\n", name);
        System.out.printf("Data de nascimento: %s\n", birthday);
        System.out.printf("Altura: %f\n", height);
        System.out.printf("Peso: %f\n", weight);
        System.out.printf("Posição: %s\n", position);
        System.out.printf("País: %s\n", country);
    }
}
