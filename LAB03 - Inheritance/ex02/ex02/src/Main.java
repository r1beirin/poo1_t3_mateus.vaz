import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FigurinhasExtra a = new FigurinhasExtra("Gabigordo", LocalDate.of(2000,10,10), 1.4, 100, "Ataque", "Brasil", "Rookie", "Ouro");

        a.mostraFigurinhas();
    }
}