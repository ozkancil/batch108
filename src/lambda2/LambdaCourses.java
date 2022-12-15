package lambda2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaCourses {
    public static void main(String[] args) {



      Courses  courseTurkishDay=new Courses("Summer","Turkish Day",97,128);
      Courses courseTurkishNight=new Courses("Winter","Turkish Night",98,154);
      Courses courseEnglishDay=new Courses("Spring","English Day",95,132);
      Courses courseEnglishNight=new Courses("Winter","English Night",93,144);

      List<Courses> addCourses=new ArrayList<>();
      addCourses.add(courseTurkishDay);
      addCourses.add(courseTurkishNight);
      addCourses.add(courseEnglishDay);
      addCourses.add(courseEnglishNight);

containWord(addCourses,"Turkish");
    }
    //see if all scores average are above given number
    public static void averageAllMatch(List<Courses>ls, double avg){
        ls.stream().allMatch(t->t.getAverageScore()>avg);
    }
    public static boolean averageAllMatch1(List<Courses>ls, double avg){
      return  ls.stream().allMatch(t->t.getAverageScore()>avg);
    }
    public static boolean containWord(List<Courses>ls, String word){
     return    ls.stream().anyMatch(t->t.getCourseName().contains(word));
    }
    //get the highest average
    public static String printAverageScoreHighest(List<Courses>ls, double avg){//it will return a string so we put String as data type.
        return ls.stream().sorted(Comparator.comparing(Courses::getAverageScore).reversed()).findFirst().get().getCourseName();
    }
    public static void listAverageAscendingSKipFirstGivenNum(List<Courses>ls, int avg){
        ls.stream().sorted(Comparator.comparing(Courses::getAverageScore)).skip(avg).collect(Collectors.toList());
    }




    public static void listAverageAscendingSKipFirstGivenNum2(List<Courses>ls, int avg){
        ls.stream().sorted(Comparator.comparing(Courses::getAverageScore)).skip(avg).collect(Collectors.toList());
    }

    public static String printAverageScoreHighest2(List<Courses>ls, double avg){
        //it will return a string so we put String as data type.
      return   ls.stream().sorted(Comparator.comparing(Courses::getAverageScore).reversed()).findFirst().get().getCourseName();
    }































    }
