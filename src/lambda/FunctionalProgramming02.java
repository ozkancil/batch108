package lambda;

import javax.rmi.CORBA.Util;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalProgramming02 {
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

        squareOddSpace(list);
    }
    //print on same line
    public static void sameLine(List<Integer>ls){
        ls.stream().forEach(UtilsClass::sameLine);
    }
    //return even
    public static void even(List<Integer>ls){
  ls.stream().filter(UtilsClass::checkToBeEven).forEach(UtilsClass::sameLine);

    }
    //square odd with space
    public static void squareOddSpace(List<Integer>ls){
        ls.stream().filter(UtilsClass::checkOdd).map(UtilsClass::getSquare).forEach(UtilsClass::sameLine);
    }
//cube dist odd same line space
    public static void cubeDstOdd(List<Integer>ls){
        ls.stream().distinct().filter(UtilsClass::checkOdd).map(UtilsClass::cube).forEach(UtilsClass::sameLine);
    }
    //sum square dist eve ele
    public static void sumSquareDistEven(List<Integer>ls){
        ls.stream().distinct().filter(UtilsClass::checkToBeEven).map(UtilsClass::getSquare).reduce(0,Math::addExact);
    }
    public static void sumSquareDistEven2(List<Integer>ls){
        ls.stream().distinct().filter(UtilsClass::checkToBeEven).map(UtilsClass::getSquare).reduce(0,(t,u)->t+u);

    }
    public static void max(List<Integer>ls){
        ls.stream().distinct().reduce(Integer.MAX_VALUE,Math::max);

    }
    //min >7 even

    public static void minGreater7(List<Integer>ls){
        ls.stream().filter(UtilsClass::checkToBeEven).filter(t->t>7).reduce(Integer.MIN_VALUE,Math::min);


    }
    public static void gethalfdsGreThan5Re(List<Integer>ls){
        ls.stream().filter(t->t>5).map(t->t/2).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }




    }
