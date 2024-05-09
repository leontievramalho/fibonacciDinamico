public class Main {
    public static void main(String[] args){
        System.out.println("Top-Bottom indice 6: " + fibonacci(6));
        System.out.println("Bottom-Up indice 7: " + fibonacciBotUp(7));
    }
    public static int fibonacci(int n){
        int[] vetor = new int[n+1];
        return fibonacciVetor(vetor, n);
    }
    public static int fibonacciVetor(int[] vetor, int n){
        if(n <= 1){
            return n;
        }
        else if(vetor[n] != 0){
            return vetor[n];
        }

        vetor[n] = fibonacciVetor(vetor, n-1) + fibonacciVetor(vetor, n-2);
        return vetor[n];
    }

    public static int fibonacciBotUp(int n){
        int[] vetor = new int[n+1];

        vetor[0] = 0;
        vetor[1] = 1;

        for(int i = 2; i<n+1; i++){
            vetor[i] = vetor[i-1] + vetor[i-2];
        }
        return vetor[n];
    }
}
