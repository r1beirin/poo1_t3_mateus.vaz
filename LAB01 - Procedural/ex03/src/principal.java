import javax.sound.midi.SysexMessage;
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
        int[] vetA = new int[3], vetB = new int[3], vetC = new int[3];

        System.out.println("<< Subtração de vetores >>");

        for(int i = 0; i < 3; i++){
            System.out.printf("Digite o valor %d de A: ", i+1);
            vetA[i] = sc.nextInt();
        }

        for(int i = 0; i < 3; i++){
            System.out.printf("Digite o valor %d de B: ", i+1);
            vetB[i] = sc.nextInt();
        }

        for(int i = 0; i < 3; i++){
            vetC[i] = vetA[i] - vetB[i];
        }

        System.out.printf("O vetor C, definido como C = A-B é (%d, %d, %d)", vetC[0], vetC[1], vetC[2]);
    }

    public static void ex11(){
        Scanner sc = new Scanner(System.in);
        int[] v = new int[5], v1 = new int[5], v2 = new int[5];

        System.out.println("<< Pares e Ímpares >>");
        for(int i = 0; i < 5; i++){
            System.out.printf("Digite o valor %d: ", i+1);
            v[i] = sc.nextInt();

            if(v[i] % 2 == 0) v2[i] = v[i];
            else v1[i] = v[i];
        }

        System.out.print("Ímpares: ");
        for(int i = 0; i < 5; i++){
            if(v1[i] != 0) System.out.printf("%d ", v1[i]);
        }

        System.out.print("\nPares: ");
        for(int i = 0; i < 5; i++){
            if(v2[i] != 0) System.out.printf("%d ", v2[i]);
        }
    }

    public static void ex12(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[4];
        float[] prob = new float[4];
        float soma = 0 , maior = 0;

        System.out.println("<< Probabilidades >>");

        System.out.println("Digite a quantidade de bolinhas");
        System.out.printf("Verde: ");
        vet[0] = sc.nextInt();
        System.out.printf("Azul: ");
        vet[1] = sc.nextInt();
        System.out.printf("Amarela: ");
        vet[2] = sc.nextInt();
        System.out.printf("Vermelha: ");
        vet[3] = sc.nextInt();

        //  Soma do total de bolinhas
        for(int i = 0; i < 4; i++){
            soma += vet[i];
        }

        //  Verde = 0
        prob[0] = (vet[0] / soma) * 100;
        //  Azul = 1
        prob[1] = (vet[1] / soma) * 100;
        // Amarela = 2
        prob[2] = (vet[2] / soma) * 100;
        // Vermelha = 3
        prob[3] = (vet[3] / soma) * 100;

        //  Detectar a maior probabilidade
        for(int i = 0; i < 4; i++){
            if(prob[i] >= maior) maior = prob[i];
        }

        //  Verde = 0
        if(prob[0] >= maior) System.out.printf("Verde: %.1f%% <<< Maior probabilidade\n", maior);
        else System.out.printf("Verde: %.1f%%\n", prob[0]);

        //  Azul = 1
        if(prob[1] >= maior) System.out.printf("Azul: %.1f%% <<< Maior probabilidade\n", maior);
        else System.out.printf("Azul: %.1f%%\n", prob[1]);

        // Amarela = 2
        if(prob[2] >= maior) System.out.printf("Amarela: %.1f%% <<< Maior probabilidade\n", maior);
        else System.out.printf("Amarela: %.1f%%\n", prob[2]);

        //  Vermelha = 3
        if(prob[3] >= maior) System.out.printf("Vermelha: %.1f%% <<< Maior probabilidade\n", maior);
        else System.out.printf("Vermelha: %.1f%%\n", prob[3]);
    }

    public static void ex13(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];

        System.out.println("<< Zerando negativos >>");

        for(int i = 0; i < 5; i++){
            System.out.printf("Entre com o número %d: ", i+1);
            vet[i] = sc.nextInt();

            if(vet[i] < 0) vet[i] = 0;
        }

        System.out.print("Zerando os negativos, obtém-se: ");
        for(int i = 0; i < 5; i++){
            System.out.printf("%d ", vet[i]);
        }
    }

    public static void ex14(){
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("<< Universidade X >>");
        System.out.print("Quantos alunos serão cadastrados: ");
        n = sc.nextInt();

        int vet[] = new int[n];
        int numero[] = new int[n];
        String classe[] = new String[n];
        float cra[] = new float[n];

        for(int i = 0; i < n; i++){
            System.out.print("Entre com o número do aluno: ");
            numero[i] = sc.nextInt();
            System.out.printf("Entre com a classe social do aluno %d: ", numero[i]);
            classe[i] = sc.nextLine();
            sc.nextLine();
            System.out.printf("Entre com o CRA do aluno %d: ", numero[i]);
            cra[i] = sc.nextInt();
        }

        System.out.println("==== Alunos Cadastrados ====");
        for(int i = 0; i < n; i++){
            System.out.printf("Número %d - Classe social %s - CRA: %.2f\n", numero[i], classe[i], cra[i]);
        }
    }

    public static void ex15(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[8], rep = new int[8];
        int count = 0;
        boolean verifica = false;

        System.out.println("<< Valores iguais >>");
        for(int i = 0; i < 8; i++) {
            System.out.printf("Entre com o número %d: ", i + 1);
            vet[i] = sc.nextInt();
        }

        for(int i = 0; i < 8; i++){
            for(int j = i+1; j < 8; j++){
                //  Encontrou um repetido
                if(vet[i] == vet[j]) verifica = true;
            }
            //  Fazendo atribuições para os repetidos
            if(verifica) {
                for (int r = 0; r < 8; r++) {
                    if (rep[r] == vet[i]) verifica = false; // Número já adicionado
                }
            }

            if(verifica) {
                rep[count] = vet[i];
                count++;
            }

            verifica = false;
        }

        System.out.print("Valores repetidos: ");
        for(int i = 0; i < count; i++){
            System.out.printf("%d, ", rep[i]);
        }
    }

    public static void ex16(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[8], rep = new int[8], valRep = new int[8];
        int count = 0, count2 = 1;
        boolean verifica = false;

        System.out.println("<< Valores iguais >>");
        for(int i = 0; i < 8; i++) {
            System.out.printf("Entre com o número %d: ", i + 1);
            vet[i] = sc.nextInt();
        }

        for(int i = 0; i < 8; i++){
            for(int j = i+1; j < 8; j++){
                //  Encontrou um repetido
                if(vet[i] == vet[j]) {
                    count2++;
                    verifica = true;
                }
            }
            //  Fazendo atribuições para os repetidos
            if(verifica) {
                for (int r = 0; r < 8; r++) {
                    if (rep[r] == vet[i]) verifica = false; // Número já adicionado
                }
            }

            if(verifica) {
                rep[count] = vet[i];
                valRep[count] = count2;
                count++;
            }

            verifica = false;
            count2 = 1;
        }

        System.out.print("Valores repetidos: ");
        for(int i = 0; i < count; i++){
            System.out.printf("%d aparece %d vezes\n", rep[i], valRep[i]);
        }
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
        // ex10();
        // ex11();
        // ex12();
        // ex13();
        // ex14();
        // ex15();
        // ex16();
    }


}
