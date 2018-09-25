
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        String name = "placeholder";
        
        while (!name.equals("")) {
        
            System.out.println("name: ");
            name = reader.nextLine();
            
            if (name.equals("")) {
                break;
            }
            System.out.println("studentnumber: ");
            String studentnumber = reader.nextLine();
            list.add( new Student(name, studentnumber));
        }
        for ( Student student : list ) {
            System.out.println( student );
        }
        System.out.println("Give search term: ");
        String search = reader.nextLine();  
        System.out.println("Result:");
            for (Student item: list) {
                if (item.getName().contains(search)) {
                    System.out.println( item );
                }
            }
        
    }
}
