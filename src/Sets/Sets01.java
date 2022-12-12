package Sets;

import java.util.HashSet;

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
        System.out.println(emails);

    }
}
