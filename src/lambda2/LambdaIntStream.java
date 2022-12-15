package lambda2;

import java.util.stream.IntStream;

public class LambdaIntStream {
    public static void main(String[] args) {

        int7To100(1,3);
        int7To1002(1,3);
        mult(1,3);
        multFrom2to11(1,3);
        System.out.println(  calculateFactorial(5));
        System.out.println(calculateSumOfEven(-9,-3));
    }
    //create method to find sum of the integers from 7 to 100
    public static void int7To100(int a , int b){
      int sum=  IntStream.rangeClosed(a,b).sum();//3
        System.out.println(sum);
    }
    //2nd way
    public static void int7To1002(int a , int b){
       int sum= IntStream.rangeClosed(a,b).reduce(0,Math::addExact);//3
        System.out.println(sum);
    }
    public static void multFrom2to11(int a , int b){
      int mult=  IntStream.rangeClosed(a,b).reduce(1,(t,u)->t*u);
        System.out.println(mult+" this is mult");
    }    public static void mult(int a , int b){
    int multp=    IntStream.rangeClosed(a,b).reduce(1,Math::multiplyExact);
        System.out.println(multp);
    }

public static int calculateFactorial(int x){
        if(x>0){
            return IntStream.rangeClosed(1,x).reduce(1,Math::multiplyExact);
        }else {
            System.out.println("Do not enter negetive numbers or zero");
            return 0;
        }

}

public static int calculateSumOfEven(int a ,int b){
        int temp=0;
        if(b>a){
            //temp has lowest
            temp=a;
            //a has highest
            a=b;
            //now give lowest to b. b has lowest
            b=temp;
        }
        return IntStream.rangeClosed(a,b).reduce(0,Math::addExact);

}


    }
