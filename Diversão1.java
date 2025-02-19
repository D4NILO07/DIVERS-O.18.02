import java.util.Scanner;

public class Diversão1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]numeros =new int[5];
        int soma=0;
        double media = 0;

        for(int i=0;i<numeros.length; i++){
            System.out.print("Digite o " +(i+1)+ "º número:");
            numeros[i]=sc.nextInt();
            soma+=numeros[i];
            media = soma/5;

        }
        System.out.println("A Média dos elementos do array é: "+media);
        sc.close();
    }
}
