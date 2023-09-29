package CosinusTaylor;

public class Main {
    public static int factorial(int n){
        if (n == 0){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static double sommeCosineTaylor(double x, int n){
        double somme = 1;
        for(int k = 1; k <= n; k++){
            somme = (somme + (Math.pow(-1, k)*Math.pow(x, 2*k)/factorial(2*k)));
        }
        return somme;
    }
    public static void main(String[] args) {
        double nSomme = sommeCosineTaylor(100, 10);
        System.out.println(nSomme);
    }
}
