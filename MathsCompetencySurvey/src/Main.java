import java.util.Scanner;
import java.util.Random;
public class Main {
    // Application code
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        DSchoolList dl = new DSchoolList();
        School sk1 = new School();

        sk1.setName("St Patrick");
        dl.addSchool(sk1);
        sk1.setPrincipal("Toto Wolf");
        Address addr = new Address("Abbey Road", "Bentong", "53100", "Pahang");

        System.out.println("Name of school: "+sk1.getName());
        System.out.println("Principal: " +sk1.getPrincipal());
        System.out.println(addr.toString());

        Marks marks = new Marks(10);
        marks.createData(10);

        /*    try {
                marks.setMark( int_random, 0);
            } catch (Exception ex) {
                System.out.println("Marks must be positive.");
                ex.printStackTrace(); // show where error happens }*/

        System.out.println("Mark for all students: ");

        for (int i=0; i<marks.numdata; i++) {
            float mark = marks.getMark(i);
            System.out.print(mark + " ");
        }

        System.out.println("\nAverage mark: " +marks.calcAvg());
        System.out.println("Standard deviation: "+marks.calcStdDev(marks.calcAvg()));

    }
}