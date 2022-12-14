import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class FaceFriends {
    static ArrayList<Contato> contatos = new ArrayList<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int digito;

        while(true){
            System.out.println("1. Inserir um contato");
            System.out.println("2. Imprimir todos os contatos");
            System.out.println("3. Imprimir todos os familiares");
            System.out.println("4. Imprimir todos os amigos");
            System.out.println("5. Imprimir todos os trabalho");
            System.out.println("6. Imprimir os melhores amigos");
            System.out.println("7. Imprimir os irmãos");
            System.out.println("8. Imprimir os colegas de trabalho");
            System.out.println("9. Imprimir contato específico");
            System.out.println("10. Sair");


            System.out.print("Digite a opção desejada: ");
            digito = sc.nextInt();

            if(digito == 10) break;
            else if(digito == 1) insereContato(sc);
            else if(digito == 2) imprimeTodosContatos();
            else if(digito == 3) imprimeFamiliares();
            else if(digito == 4) imprimeAmigos();
            else if(digito == 5) imprimeTrabalho();
            else if(digito == 6) imprimeMelhoresAmigos();
            else if(digito == 7) imprimeIrmaos();
            else if(digito == 8) imprimeColegasTrabalho();
            else if(digito == 9) imprimeContatoEspecifico(sc);
        }
    }

    public static void insereContato(Scanner sc){
        int digito;
        System.out.println("===== Inserir contato no FaceFriends =====");
        System.out.println("1. Familia");
        System.out.println("2. Amigos");
        System.out.println("3. Trabalho");
        System.out.print("Digite o tipo do contato: ");
        digito = sc.nextInt();
        sc.nextLine();

        if(digito == 1) insereContatoFamilia(sc);
        if(digito == 2) insereContatoAmigos(sc);
        if(digito == 3) insereContatoTrabalho(sc);
    }

    public static void insereContatoFamilia(Scanner sc){
        String nome, apelido, email, aniversario, parentesco;
        System.out.println("===== Insira os dados básicos e o parentesco =====");
        System.out.print("Digite o nome: ");
        nome = sc.nextLine();
        System.out.print("Digite o apelido: ");
        apelido = sc.nextLine();
        System.out.print("Digite o email: ");
        email = sc.nextLine();
        System.out.print("Digite a data de aniverśario (ano-mes-dia): ");
        aniversario = sc.nextLine();
        System.out.print("Digite o parentesco: ");
        parentesco = sc.nextLine();
        contatos.add(new Familia(nome, apelido, email, LocalDate.parse(aniversario), parentesco));
    }

    public static void insereContatoAmigos(Scanner sc){
        String nome, apelido, email, aniversario;
        int grau;
        System.out.println("===== Insira os dados básicos e o grau =====");
        System.out.println("1. Grau: melhor amigo");
        System.out.println("2. Grau: amigo");
        System.out.println("3. Grau: conhecido");
        System.out.println("4. Grau: desconhecido");
        System.out.print("Digite o nome: ");
        nome = sc.nextLine();
        System.out.print("Digite o apelido: ");
        apelido = sc.nextLine();
        System.out.print("Digite o email: ");
        email = sc.nextLine();
        System.out.print("Digite a data de aniverśario (ano-mes-dia): ");
        aniversario = sc.nextLine();
        System.out.print("Digite o grau: ");
        grau = sc.nextInt();
        contatos.add(new Amigos(nome, apelido, email, LocalDate.parse(aniversario), grau));
    }

    public static void insereContatoTrabalho(Scanner sc){
        String nome, apelido, email, aniversario, tipo;
        System.out.println("===== Insira os dados básicos e o parentesco =====");
        System.out.print("Digite o nome: ");
        nome = sc.nextLine();
        System.out.print("Digite o apelido: ");
        apelido = sc.nextLine();
        System.out.print("Digite o email: ");
        email = sc.nextLine();
        System.out.print("Digite a data de aniverśario (ano-mes-dia): ");
        aniversario = sc.nextLine();
        System.out.print("Digite o parentesco: ");
        tipo = sc.nextLine();
        contatos.add(new Trabalho(nome, apelido, email, LocalDate.parse(aniversario), tipo));
    }

    public static void imprimeTodosContatos(){
        System.out.println();
        System.out.println("===== Inicio dos contatos =====");
        for(int i = 0; i < contatos.size(); i++){
            System.out.println(contatos.get(i));
            System.out.println();
        }
        System.out.println();
        System.out.println("===== Fim dos contatos =====");
    }

    public static void imprimeFamiliares(){
        System.out.println();
        System.out.println("===== Inicio dos contatos de Familiares =====");
        for(int i = 0; i < contatos.size(); i++){
            if(contatos.get(i) instanceof Familia) {
                System.out.println(contatos.get(i));
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("===== Fim dos contatos de Familiares =====");
    }
    public static void imprimeAmigos(){
        System.out.println();
        System.out.println("===== Inicio dos contatos de Amigos =====");
        for(int i = 0; i < contatos.size(); i++){
            if(contatos.get(i) instanceof Amigos) {
                System.out.println(contatos.get(i));
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("===== Fim dos contatos de Amigos =====");
    }
    public static void imprimeTrabalho(){
        System.out.println();
        System.out.println("===== Inicio dos contatos de Trabalho =====");
        for(int i = 0; i < contatos.size(); i++){
            if(contatos.get(i) instanceof Trabalho) {
                System.out.println(contatos.get(i));
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("===== Fim dos contatos de Trabalho =====");
    }
    public static void imprimeMelhoresAmigos(){
        System.out.println();
        System.out.println("===== Inicio dos contatos de melhores amigos =====");
        for(int i = 0; i < contatos.size(); i++){
            if(contatos.get(i) instanceof Amigos) {
                if(((Amigos) contatos.get(i)).getGrau() == 1) {
                    System.out.println(contatos.get(i));
                    System.out.println();
                }
            }
        }
        System.out.println();
        System.out.println("===== Fim dos contatos de melhores amigos =====");
    }

    public static void imprimeIrmaos(){
        System.out.println();
        System.out.println("===== Inicio dos contatos de irmãos =====");
        for(int i = 0; i < contatos.size(); i++){
            if(contatos.get(i) instanceof Familia) {
                if(((Familia) contatos.get(i)).getParentesco().equals("irmão")) {
                    System.out.println(contatos.get(i));
                    System.out.println();
                }
            }
        }
        System.out.println();
        System.out.println("===== Fim dos contatos de irmãos =====");
    }

    public static void imprimeColegasTrabalho(){
        System.out.println();
        System.out.println("===== Inicio dos contatos de colegas de trabalho =====");
        for(int i = 0; i < contatos.size(); i++){
            if(contatos.get(i) instanceof Trabalho) {
                if(((Trabalho) contatos.get(i)).getTipo().equals("colega")) {
                    System.out.println(contatos.get(i));
                    System.out.println();
                }
            }
        }
        System.out.println();
        System.out.println("===== Fim dos contatos de colegas de trabalho =====");
    }

    public static void imprimeContatoEspecifico(Scanner sc){
        int indice;
        System.out.println();
        System.out.print("Digite o índice do contato a ser imprimido: ");
        indice = sc.nextInt();
        System.out.println();
        System.out.println(contatos.get(indice));
    }
}
