import java.util.List;

public class FP02Functional {
    public static void main(String[] args) {

        List<String> courses = List.of("Spring Boot", "Cyber Security", "Ethical Hacking", "Spring Microservices");

        //Print all courses
//        courses.stream()
//                .forEach(System.out::println);

        //print courses with spring
//        courses.stream()
//                .filter(course -> course.contains("Spring"))
//                .forEach(System.out::println);

        //Courses with at least  4 letters
        courses.stream()
                .filter(course -> course.length()>=21)
                .forEach(System.out::println);
    }
}
