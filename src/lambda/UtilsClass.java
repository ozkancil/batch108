package lambda;

import java.util.List;

public class UtilsClass {

    public static void sameLine(Object x){
        System.out.print(x+" ");
    }
public static boolean checkToBeEven(Integer x){
         return x%2==0;
}
public static Integer getSquare(Integer x){
        return x*2;
}
public static boolean checkOdd(Integer x){
        return x%2!=0;
}
public static Integer cube(Integer x){
        return x*x*x;
}
public static Integer sum(Integer x){
        return x+x;
}
public static char lastChar(String x){
        return x.charAt(x.length()-1);

}
public static char firstChar(String x){
        return x.charAt(0);
}

}
