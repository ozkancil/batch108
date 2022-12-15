package Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets01 {
    public static void main(String[] args) {
        HashSet<String> emails=new HashSet<>();
        emails.add("Apple");
        emails.add("Mango");
        emails.add("Orange");
        emails.add("Appricot");
        emails.add("Fig");
        emails.add(null);
        emails.add(null);

        //emails.remove("Orange");
        emails.size();
        System.out.println(emails);
        System.out.println(emails.size());

        Object emails2=emails.clone();//here we created a new object with the same data form emails
        System.out.println(emails2);

        HashSet<String> emails3=(HashSet<String>) emails.clone();

        Object email4=emails.clone();

        HashSet<String> emails5=(HashSet<String>) emails.clone();

        //TreeSet--> Slower
        Set<Integer> nums=new TreeSet<>();
        nums.add(2);
        nums.add(1);
       // nums.add(null);
      //  nums.add(null);
        nums.add(1);//it only shows one 1 out of the two 1's i entered because sets only take unique ones

        System.out.println(nums);

        Set<String> nullTest=new TreeSet<>();//treeset doesnt accept null cuz i doesnt know where to put it.
        nullTest.add("a");
        nullTest.add("b");
        nullTest.add("c");
        //nullTest.add(null);
        // nullTest.add(null);
        System.out.println(nullTest);



        //to make treeset faster cuz theyt slow they order in natural order
        //we need to create hashset and put it into treeset
        HashSet<Integer> tst=new HashSet<>();
        tst.add(1);
        tst.add(2);
        tst.add(3);
        tst.add(4);

        TreeSet<Integer> tst2=new TreeSet<>(tst);
        System.out.println(tst2);





//LINKED HASHSETS
        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
lhs.add(1);
lhs.add(1);
lhs.add(null);
lhs.add(2);
lhs.add(null);
        System.out.println(lhs);//takes only one 1 cuz its hashsets so only unique ones. and shows null. treeset doesnt do null cuz it doenst know whre to put it.













    }
}
