import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class FaceFriends {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int digito;
        String subtipo, nome, apelido, email, parentesco;

        //  Criar com arrayList para no inserirContato ser adicionado corretamente na posição
        //Contato[] contatos = new Contato[100];
        ArrayList<Contato> contatos = new ArrayList<>();

        while(true){
            System.out.println("1. Inserir um contato");

            System.out.print("Digite a opção desejada: ");
            digito = sc.nextInt();

            if(digito == 100) break;

            else if(digito == 1){

                System.out.println("===== Inserir contato no FaceFriends =====");
                System.out.print("Digite o subtipo do contato: ");
                subtipo = sc.nextLine();
                sc.nextLine();

                if(subtipo.equals("familia")){
                    System.out.print("Digite o nome: ");
                    nome = sc.nextLine();
                    System.out.print("Digite o apelido: ");
                    apelido = sc.nextLine();
                    System.out.print("Digite o email: ");
                    email = sc.nextLine();
                    System.out.print("Digite o parentesco: ");
                    parentesco = sc.nextLine();
                    contatos.add(new Familia(nome, apelido, email, LocalDate.of(2000, 10, 10), parentesco));
                }

                //System.out.println(contatos.get(0));
            }
        }
    }
}
