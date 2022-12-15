package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FunctionalProgramming03 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Tom");
        list.add("Alley");
        list.add("Tom");
        list.add("Mark");
        list.add("Amanda");
        list.add("John");
        list.add("Jackson");
        list.add("Marry");
        list.add("Alberto");
        list.add("Tucker");
        list.add("Ben");

      upperCase(list);
        System.out.println();
        legnthRe(list);
        any(list);
        none(list);
    }

    //upper case
    public static void upperCase(List<String>ls){
        ls.stream().map(t->t.toUpperCase()).forEach(UtilsClass::sameLine);
    }
    //upperCase
    public static void upperCase1(List<String>ls){
        ls.stream().map(String::toUpperCase).forEach(System.out::print);
    }
    //according to length
    public static void length(List<String>ls){
        ls.stream().sorted(Comparator.comparing(String::length)).forEach(UtilsClass::sameLine);
        ls.stream().sorted(Comparator.comparing(String::length)).forEach(UtilsClass::sameLine);
    }
    public static void legnthRe(List<String>ls){
        ls.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(UtilsClass::sameLine);
    }
    public static void lastCHar(List<String>ls){
        ls.stream().distinct().sorted(Comparator.comparing(UtilsClass::lastChar)).forEach(UtilsClass::sameLine);
    }
    public static void lastChar1(List<String>ls){
        ls.stream().sorted(Comparator.comparing(UtilsClass::lastChar)).forEach(System.out::print);
    }
///length sort, then first character
public static void sortlegnthTHenchar(List<String>ls){
        ls.stream().sorted(Comparator.comparing(String::length).thenComparing(UtilsClass::firstChar)).forEach(UtilsClass::sameLine);
}
    public static void legnthsortfirstchar(List<String>ls){

//        ls.stream().sorted(Comparator.comparing(String::length).thenComparing(UtilsClass::firstChar))
    }

    public static void removeIfgreatherThan5(List<String>ls){
        ls.removeIf(t->t.length()>5);
    }
    public static void rmv(List<String>ls){
        ls.removeIf(t->t.startsWith("a") || t.startsWith("a") || t.endsWith("o") || t.endsWith("O"));
    }
    public static void rmv1(List<String>ls){
        ls.removeIf(t->t.charAt(0)=='A' || t.charAt(t.length()-1)=='n');
    }
    public static void rmv3(List<String>ls){
        ls.removeIf(t->t.length()>4 && t.length()<11 || t.endsWith("o"));

    }
    public static boolean allMath(List<String>ls){
       return ls.stream().allMatch(t->t.length()<12);
    }
    public static boolean any(List<String>ls){
       return ls.stream().anyMatch(t->t.charAt(0)!='X');
    }
    public static boolean none(List<String>ls){
       boolean a= ls.stream().noneMatch(t->t.charAt(0)=='X');
       return a;
    }




















    }
