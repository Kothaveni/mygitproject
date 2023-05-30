package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
public class PolindromeProgram {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        //get list of unique squares
        //List<Integer> squaresList = numbers.stream().map( i -> i*i).collect(Collectors.toList());
        numbers.stream().map( i -> i*i).forEach(System.out::println);
        //System.out.println("squares list"+squaresList);
        List<String> strings = Arrays.asList("hyderabd","banglore","chennai","chennai","mumbai");
        System.out.println("filtered strings         "+strings.stream().filter(string->!string.isEmpty()).distinct().anyMatch(s->s.equalsIgnoreCase("BONTHIRALLA")));
        HashMap<String, String> h= new HashMap<>();
        h.put("100", "Hyderabad");
        h.put("200", "Banglore");
        h.put("300", "Channai");
        h.put("400", "Delhi");
        h.put("500", "Amaravathi");
        h.put("600", "Mumbai");
        Student student = new Student("Krishnaveni",17017,"Kurnool",10000,h);
        HashMap<String, String> h1= new HashMap<>();
        h1.put("100", "Hyderabad");
        h1.put("200", "Banglore");
        h1.put("300", "Channai");
        h1.put("400", "Delhi");
        h1.put("500", "Amaravathi");
        h1.put("600", "Mumbai");
        Student student1 = new Student("Sujay",17100,"USA",100000,h1);
        ArrayList<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.stream().filter(one->one.getSalary()>1000).
                forEach(i->System.out.println(i.getSalary()+i.getSalary()*10/100));

    }

}
