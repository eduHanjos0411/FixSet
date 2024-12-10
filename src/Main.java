import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.print("How many students for course A?");
        int studentsA = sc.nextInt();
        for(int i = 1; i <= studentsA; i++) {
            int id = sc.nextInt();
            a.add(id);
        }
        System.out.print("How many students for course B?");
        int studentsB = sc.nextInt();
        for(int i = 1; i <= studentsB; i++) {
            int id = sc.nextInt();
            b.add(id);
        }

        System.out.print("How many students for course C?");
        int studentsC = sc.nextInt();
        for(int i = 1; i <= studentsC; i++) {
            int id = sc.nextInt();
            c.add(id);
        }

        Set<Integer> total = new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);

        System.out.println("Total students: " + total.size());
    }
}