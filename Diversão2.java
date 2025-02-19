public class Diversão2 {
    public static void main(String[] args) {
        
        int[] numeros={10,20,30,40,50};

        int maior = numeros[0];
        
        for(int i=0;i<numeros.length;i++){
            System.out.println("Elementos "+(i+1)+": "+numeros[i]);
        }

        for(int i=0;i<numeros.length;i++){
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        

        System.out.println("O maior elemento do vetor é: "+maior);

       
    }

}

