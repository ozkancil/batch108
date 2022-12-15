package queues;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashMap {
    public static void main(String[] args) {


        Hashtable<String, Students > studentInfo=new Hashtable<>();
        studentInfo.put("Ozkan",new Students(30,"ozkancil92@gmail.com",2030));
        studentInfo.put("ozgur",new Students(32,"ozgurcil@gmail.com",2022));
        studentInfo.put("cemal",new Students(40,"cemalcil@",20333));

Students ozkan=studentInfo.get("Ozkan");
        System.out.println(ozkan.toString());

    }
}
