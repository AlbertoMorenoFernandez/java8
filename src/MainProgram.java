import java.awt.event.PaintEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MainProgram {
    public static void main(String[] args) {
        Person p1 = new Person("alberto", "moreno", 37);
        Person p2 = new Person("alejandra", "gónzalez", 36);
        Person p3 = new Person("antonio", "martín", 40);
        Person p4 = new Person("adrian", "moreno", 26);
        Person p5 = new Person("guillermo", "romano", 38);
        Person p6 = new Person("jose", "moreno sanz", 24);
        Person p7 = new Person("maría del carmén", "fernández roldán", 61);
        Person p8 = new Person("jonathan", "moreno", 39);
        Person p9 = new Person("aithor", "moreno", 9);


        List<Person> people = new ArrayList<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);
        people.add(p6);
        people.add(p7);
        people.add(p8);
        people.add(p9);

//TASK 1 : GET NAMES AND PRINT TO SCREEN
        people.stream()
                .map((x) -> x.getName())
                .forEach(System.out::println);

//TASK 2:  GET NAMES AND CREATE A COLLECTION WITH THEM
        List<String> namesList=
                people.stream()
                .map((x)-> x.getName())

                .collect(Collectors.toList());
//TASK 3: GET ONLY PEOPLE YOUNGER THAN 18
        System.out.println("------------------------------------------------------"+"\n GET ONLY PEOPLE YOUNGER THAN 18");
        people.stream()
                .filter(x-> x.getAge()<18)
                .forEach(System.out::println);

// TASK 4: GET ONLY PEOPLE OLDER THAN 30 WHICH NAME ALBERT

        System.out.println("------------------------------------------------------"+"\n TASK 4: GET ONLY PEOPLE OLDER THAN 30 WHICH NAME ALBERT");
        Predicate<Person> name= (person -> person.getName().equals("alberto"));
        Predicate<Person> age= (person -> person.getAge()>30);
        Predicate<Person> complejo= name.and(age);
        people.stream()
              .filter(complejo)
              .forEach(System.out::println);

// TASK 5:
    }

}
