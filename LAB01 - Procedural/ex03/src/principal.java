import java.util.Scanner;

import static java.lang.Math.pow;

public class principal {

    public static void ex01(){
        Scanner sc = new Scanner(System.in);
        int val1,val2,val3,val4,val5,val6;

        System.out.println("<< Listando um vetor >>");
        System.out.println("Entre com o número 1:");
        val1 = sc.nextInt();

        System.out.println("Entre com o número 2:");
        val2 = sc.nextInt();

        System.out.println("Entre com o número 3:");
        val3 = sc.nextInt();

        System.out.println("Entre com o número 4:");
        val4 = sc.nextInt();

        System.out.println("Entre com o número 5:");
        val5 = sc.nextInt();

        System.out.println("Entre com o número 6:");
        val6 = sc.nextInt();

        System.out.println("Os valores lidos são:");
        System.out.printf("%d %d %d %d %d %d ", val1, val2, val3, val4, val5, val6);

    }

    public static void ex02(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor >>");

        for (int i = 0; i < 6; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
        }

        System.out.println("Os valores lidos são:");
        for (int i = 0; i < 6; i++){
            System.out.printf("%d ",vet[i]);
        }
    }

    public static void ex03() {
        Scanner sc = new Scanner(System.in);

        int[] vet = new int[6];
        System.out.println("<< Listando um vetor em ordem inversa >>");

        for(int i = 0; i < 6; i++){
            System.out.printf("Entre com o número %d: \n", i+1);
            vet[i] = sc.nextInt();
        }

        System.out.println("A ordem inversa dos números é: ");
        for(int i = 5; i >= 0; i--){
            System.out.printf("%d ", vet[i]);
        }
    }

    public static void ex04(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        int foo = 0;
        int status = 1;

        System.out.println("<< Listando um vetor de números pares>>");
        while(status == 1){
            if(foo == 6) status = 0;
            else {
                System.out.printf("Entre com o número %d: ", foo);
                vet[foo] = sc.nextInt();

                if (vet[foo] % 2 != 0) {
                    System.out.println("Erro: valor inválido.");
                } else {
                    foo++;
                }
            }
        }

        System.out.println("Os numeros digitados foram: ");
        for(int i = 0; i < 6; i++){
            System.out.printf("%d ", vet[i]);
        }
    }

    public static void ex05() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        int maior = 0, menor = 0, soma = 0;
        double media;
        ;

        for (int i = 0; i < 5; i++) {
            System.out.printf("Entre com o número %d: \n", i + 1);
            vet[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if (vet[i] >= maior) maior = vet[i];
            if (vet[i] <= menor) menor = vet[i];
            soma += vet[i];
        }

        media = soma / 5.0;

        System.out.print("Os números digitados são: ");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d ", vet[i]);
        }

        System.out.printf("\nO maior valor é: %d\n", maior);
        System.out.printf("O menor valor é: %d\n", menor);
        ;
        System.out.printf("A média é: %.2f\n", media);
    }

    public static void ex06(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        int maior = 0, menor = 0, soma = 0, indiceMaior = 0, indiceMenor = 0;
        double media;

        for (int i = 0; i < 5; i++) {
            System.out.printf("Entre com o número %d: \n", i + 1);
            vet[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if (vet[i] >= maior){
                maior = vet[i];
                indiceMaior = i;
            }
            if (vet[i] <= menor){
                menor = vet[i];
                indiceMenor = i;
            }
            soma += vet[i];
        }

        media = soma / 5.0;

        System.out.print("Os números digitados são: ");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d ", vet[i]);
        }

        System.out.printf("\nO maior valor é: %d, localizado na posição %d do vetor\n", maior, indiceMaior);
        System.out.printf("O menor valor é: %d, localizado na posição %d do vetor\n", menor, indiceMenor);
        ;
        System.out.printf("A média é: %.2f\n", media);
    }

    public static void ex07(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        int maior = 0, foo = 0;

        for(int i = 0; i < 5; i++){
            System.out.printf("Entre com a nota do aluno %d: ", i+1);
            vet[i] = sc.nextInt();

            if (vet[i] <= 50) vet[i] *= 2;

            else if(vet[i] >= maior) {
                vet[i] *= 2;
                if(vet[i] >= 100) vet[i] = 100;
                maior = vet[foo];

            }
            else if(vet[i] >= 50) {
                maior = vet[i];
                foo = i;
            }

        }

        System.out.println("Notas normalizadas");

        for(int i = 0; i < 5; i++){
            System.out.printf("A nota do aluno %d é %d\n", i+1, vet[i]);
        }
    }

    public static void ex08(){

        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        double media = 0, desvioPadrao = 0;

        System.out.println("<< Média e desvio-padrão >>");
        for(int i = 0; i < 5; i++){
            System.out.printf("Digite o valor %d: ", i+1);
            num[i] = sc.nextInt();
            media += num[i];
        }

        media /= 5.0;

        for(int i = 0; i < 5; i++){
            desvioPadrao += pow(num[i] - media, 2);
        }

        desvioPadrao = Math.sqrt(desvioPadrao/(4));

        System.out.printf("A média é %.0f e o desvio-padrão é %f\n", media, desvioPadrao);
    }

    public static void ex09(){
        Scanner sc = new Scanner(System.in);
        int num;
        double mediaTurma = 0;

        System.out.println("<< Média de n alunos. Máximo 100 alunos >>");
        System.out.print("Entre com o número de alunos: ");
        num = sc.nextInt();

        if(num <= 100){
            int[] vet = new int[num];

            for(int i = 0; i < num; i++){
                System.out.printf("Digite a nota do aluno %d: ", i+1);
                vet[i] = sc.nextInt();
                mediaTurma += vet[i];
            }

            mediaTurma /= num;

            System.out.println("Relatório de notas");
            for(int i = 0; i < num; i++){
                System.out.printf("A nota do aluno %d é: %d\n", i, vet[i]);
            }
            System.out.printf("A média da turma é: %.1f", mediaTurma);
        }
        else System.out.println("Erro! O número máximo de alunos permitido é 100.");
    }

    public static void ex10(){
        Scanner sc = new Scanner(System.in);
        int[] vetA, vetB, vetC = new int[3];

    }

    public static void main(String[] args) {
        // ex01();
        // ex02();
        // ex03();
        // ex04();
        // ex05();
        // ex06();
        // ex07();
        // ex08();
        // ex09();
        ex10();
    }


}
