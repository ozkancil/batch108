public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("merhaba");

long nFactorial=factorialFunction(5);
        System.out.println(nFactorial);
       // System.out.println(factorialFunction(5));
    }
    public static long factorialFunction(long n){
        if(n<=1) return 1;
        return n*factorialFunction(n-1);

    }
}