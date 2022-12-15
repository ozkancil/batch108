package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalProgramming01 {
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

greaterThan7(list);
halfDistntGreaterThan5(list);
    }
    public static void greaterThan7(List<Integer>ls){
       Integer greater= ls.stream().filter(t->t%2==0).filter(t->t>7).sorted().findFirst().get();
        System.out.println(greater);
    }

    ////hald distct greater than 5
    public static void halfDistntGreaterThan5(List<Integer>ls){
ls.stream().distinct().filter(t->t>5).map(t->t/2).sorted(Comparator.reverseOrder()).collect(Collectors.toList());


    }
}
