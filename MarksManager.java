import java.util.ArrayList;
import java.util.Scanner;

public class MarksManager {
    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 student marks:");
        for (int i = 0; i < 5; i++) {
            marks.add(sc.nextInt());
        }
        System.out.println("All Marks: " + marks);
        int highest = marks.get(0);
        for (int m : marks) {
            if (m > highest) highest = m;
        }
        System.out.println("Highest Mark: " + highest);
        int lowest = marks.get(0);
        for (int m : marks) {
            if (m < lowest) lowest = m;
        }
        System.out.println("Lowest Mark: " + lowest);
        int sum = 0;
        for (int m : marks) sum += m;
        double avg = sum / 5.0;
        System.out.println("Average Mark: " + avg);
        System.out.print("Enter new mark for index 2: ");
        int newM = sc.nextInt();
        marks.set(2, newM);
        marks.remove(1);

        System.out.println("Final Updated Marks List: " + marks);
    }
}

