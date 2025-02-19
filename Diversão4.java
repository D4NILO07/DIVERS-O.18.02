import java.util.Scanner;

public class Diversão4 {
    public static void main(String[] args) {
        int capacidade = 5;
        int[] numeros = new int[capacidade];
        int contador = 0; // Contador para controlar o número de elementos no array
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Exibe o menu de opções
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar número");
            System.out.println("2. Exibir números");
            System.out.println("3. Remover número");
            System.out.println("4. Finalizar");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Adicionar um número ao array
                    if (contador < capacidade) {
                        System.out.print("Digite o número para adicionar: ");
                        int numero = scanner.nextInt();
                        numeros[contador] = numero;
                        contador++;
                        System.out.println("Número adicionado com sucesso!");
                    } else {
                        System.out.println("O array está cheio! Não é possível adicionar mais números.");
                    }
                    break;
                
                case 2:
                    // Exibir todos os números armazenados no array
                    if (contador == 0) {
                        System.out.println("Não há números cadastrados.");
                    } else {
                        System.out.println("Números cadastrados:");
                        for (int i = 0; i < contador; i++) {
                            System.out.println("Índice " + (i+1) + ": " + numeros[i]);
                        }
                    }
                    break;
                
                    case 3:
                    // Remover um número específico
                    if (contador == 0) {
                        System.out.println("O array está vazio! Não há números para remover.");
                    } else {
                        System.out.print("Digite o índice (de 1 a " + contador + ") do número a ser removido: ");
                        int indiceRemover = scanner.nextInt() - 1; // Corrige o índice para 0-based
                        
                        if (indiceRemover < 0 || indiceRemover >= contador) {
                            System.out.println("Índice inválido! O índice deve estar entre 1 e " + contador + ".");
                        } else {
                            // Remover o número e deslocar os subsequentes
                            for (int i = indiceRemover; i < contador - 1; i++) {
                                numeros[i] = numeros[i + 1];
                            }
                            numeros[contador - 1] = 0; // Apaga o último número (opcional)
                            contador--;
                            System.out.println("Número removido com sucesso!");
                        }
                    }
                    break;
                
                
                case 4:
                    // Finalizar o programa
                    System.out.println("Programa finalizado.");
                    scanner.close();
                    return;
                
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
