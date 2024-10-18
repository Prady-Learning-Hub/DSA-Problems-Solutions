package Scaler;

public class primeNumber {
    boolean isPrimeBruteForce(int N){
        boolean result = true;
        if(N < 2) {return false;}
        if (N == 2) {return true;}

        for (int i = 2; i < N - 1; i++) {
            if(N % i == 0){
                return false;
            }
        }
        return result;
    }

    boolean isPrimeOptimize_1(int N){
        boolean result = true;
        if(N < 2) {return false;}
        if (N == 2) {return true;}

        for (int i = 2; i <= N/2; i++) {
            if(N % i == 0){
                return false;
            }
        }
        return result;
    }

    boolean isPrimeOptimize_2(int N){
        boolean result = true;
        if(N < 2) {return false;}
        if (N == 2) {return true;}

        for (int i = 2; i*i <= N; i++) {
            if(N % i == 0){
                return false;
            }
        }
        return result;
    }
}
