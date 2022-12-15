package lambda;

import java.util.ArrayList;
import java.util.List;

public class FunctionalProgramming {

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();

        list.add(8);
        list.add(9);
        list.add(131);
        list.add(10);
        list .add(9);
        list .add(10);
        list .add(2);
        list .add(2);
        list .add(8);


sameLine(list);
evenEle(list);
squareOddNumbers(list);
        System.out.println();
sumDstcEve(list);
        System.out.println(
        );
        max(list);
    }
    //print elemtns on same line with space
    public static void sameLine(List<Integer>ls){
        ls.stream().forEach(t->System.out.print(t+" * "));
    }
public static void sameLine1(List<Integer>ls){
        ls.stream().forEach(t-> System.out.println(t+" "));
}
//even elemtns
    public static void evenEle(List<Integer>ls){
        ls.stream().filter(t->t%2==0).forEach(t-> System.out.println(t+" "));
    }
public static void squareOddNumbers(List<Integer>ls){
        ls.stream().filter(t->t%2!=0).map(t->t*2).forEach(t-> System.out.print(t+" "));

}
public static void cubeDistinctEven(List<Integer>ls){
        ls.stream().distinct().filter(t->t%2==0).map(t->t*t*t).forEach(System.out::println);
}

//get the sum of the distnct squared even numbers
    public static void sumDstcEve(List<Integer>ls){
      Integer reduce=  ls.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(0,(t,u)->t+u);
        System.out.println(reduce);
    }


//get max
    public static void max(List<Integer>ls){
      Integer maxN=  ls.stream().reduce(Integer.MIN_VALUE,(t,u)->t>u?t:u);
        System.out.println(maxN);
    }

    ///get min
    public static void min(List<Integer>ls){
    Integer minN=    ls.stream().reduce(Integer.MAX_VALUE,(t,u)->t<u?t:u);
        System.out.println(minN);
    }
}
