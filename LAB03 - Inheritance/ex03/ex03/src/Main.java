import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Figurinhas figurinhaA = new Figurinhas("Gabigordo", LocalDate.of(2000,10,10), 1.4, 100, "Ataque", "Brasil");
        FigurinhasExtra figurinhaB = new FigurinhasExtra(figurinhaA, "Rookie", "Ouro");

        System.out.println("Figurinha A");
        figurinhaA.mostrarFigurinhas();
        System.out.printf("\n==========================\n\n");
        System.out.println("Figurinha B");
        figurinhaB.mostrarFigurinhas();
    }
}