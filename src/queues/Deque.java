package queues;

import java.util.*;

public class Deque {
    public static void main(String[] args) {
        /*
        hashmap is like a treasure it has a key and value.
        Key is not repeated data, key is unique. But teh value part can be
        repeated. It has a hash code for the key part. so hash for has value.
Value part can be repeated but the key part must be unique.
We call elements entry in hashmap. entry is an element. And all the elements
are called entry set. The reason its called entrySets is cuz its unique.
Just like in Sets each element must be unique, in hashMaps each key is unique.
Value can be null repeatedly, but not key.

1) maps have key value structure
2)keys are unique but values are not
3) every element in a map is called entry
4) all elements are called as entryset
5) HashMap just like hashset puts all entries into random order instead of order
so its fast. LinkedLis or lists puts it in order.
//6)Only hashmap accpets null not the other maps
//7) having null for key is 0 so it will always come first.
//         */
//        //create hasMap
//        HashMap<String, Integer> stdAges=new HashMap<>();
//        stdAges.put("oz",20);//oz is key, 20 is value
//        stdAges.put("o",20);
//        stdAges.put(null,0);
//        stdAges.put(null,3);
//        stdAges.put("z",null);
//        stdAges.put("b",null);
//
//        Set<Map.Entry<String,Integer>> entries=stdAges.entrySet();
//Set<Map.Entry<String,Integer>> entries1=stdAges.entrySet();
//Set<Map.Entry<String,Integer>>entries2=stdAges.entrySet();
//Set<Map.Entry<String,Integer>>entries3=stdAges.entrySet();
//        for (Map.Entry<String,Integer>w:entries){
//            System.out.println(w+"*");
//
//        }
//Set<Map.Entry<String,Integer>>entries4=stdAges.entrySet();
//
//        System.out.println(stdAges);
//
//        //how to get only keys from a map
//        Set<String> key =stdAges.keySet();
//        System.out.println(key);
//
//
//        //how to get a value
//        Collection<Integer> value=stdAges.values();//the reason we did collections is
//        //cuz values are repeated so  we must do collections. key is unique cant be repeated to
//        //so we use set.
//        System.out.println(value);
//
////can i put null into key?
//        //we can but only once because keys are sets and they must be unique not like values.
//
////how to get a key from the hashmap set
//        System.out.println( stdAges.get("oz"));
//
//        System.out.println(stdAges.get("ozzzz"));
//
//        //returns second value if key doesnt exist
//        System.out.println(stdAges.getOrDefault("b",0));
//
//        //if it doesnt exist.
//        stdAges.putIfAbsent("Brad Pit",44);
//        stdAges.putIfAbsent("Tom hanks",53);
//
//        stdAges.replace("Tom hanks",53,23);



    }
}
