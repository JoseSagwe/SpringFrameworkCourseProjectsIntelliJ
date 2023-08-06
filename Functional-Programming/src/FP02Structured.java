import java.util.List;

public class FP02Structured {
    public static void main(String[] args) {

//          listOfCoursesStructured(List.of("Spring Boot", "API", "Microservices", "AWS", "Docker", "Kubernetes"));
//          courseContainingSpring(List.of("Spring Boot", "API", "Microservices", "AWS", "Docker", "Kubernetes"));
          courseWithFourLetters(List.of("Spring Boot", "API", "Microservices", "AWS", "Docker", "Kubernetes"));
    }
    public static void listOfCoursesStructured(List<String> courses){
        for (String course: courses){
            System.out.println(course);
        }
    }

    public static void courseContainingSpring(List<String> courses){
        for (String course: courses){
           if (course.equals("Spring Boot")){
               System.out.println(course);
           }
        }
    }

    public static void courseWithFourLetters(List<String> courses){
        for (String course: courses){
            if (course.length()==3){
                System.out.println(course);
            }
        }
    }



}
