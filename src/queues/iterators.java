package queues;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.ListIterator;

public class iterators {
    public static void main(String[] args) {
//        ArrayList<String> list1=new ArrayList<>();
//        list1.add("aa");
//        list1.add("ad");
//        list1.add("nova");
//
//        ListIterator<String> editList=list1.listIterator();
//
//        while(editList.hasNext()){
//            String iterator=editList.next();
//            editList.set(iterator+"*");
//        }
//        System.out.println(list1);
//
//
//
//        while(editList.hasNext()){
//            String it=editList.next();
//            editList.set(it+" * ");
//
//        }
//        System.out.println(list1);
//
//        ListIterator<String> editList1=list1.listIterator();
//
//        while(editList1.hasNext()){
//            String ls=editList1.next();
//            editList1.set(ls+" * ");
//        }
//        System.out.println(list1);
//
//
//
//        ListIterator<String> editIterator2=list1.listIterator();
//
//        while(editIterator2.hasNext()){
//            String editIt=editIterator2.next();
//            editIterator2.set(editIt+" * ");
//        }
//
//
//        ListIterator<String> it3=list1.listIterator();

//        while(it3.hasNext()){
//            String oneByone=it3.previous();
//            it3.set(oneByone+" * ");
//        }
//        System.out.println(it3);



        ArrayList<Double> myList=new ArrayList<>();
        myList.add(20.0);
        myList.add(30.0);
        myList.add(60.0);
        myList.add(110.0);


        ListIterator<Double> mylist2=myList.listIterator();

        while(mylist2.hasNext()){
            Double oneByone= mylist2.next();
            mylist2.set(oneByone*1.2);
        }
        Collections.reverse(myList);
        System.out.println(myList);//Shouldnt we have mylist2 in here cuz i used iterator to make a new list?
    }
}
