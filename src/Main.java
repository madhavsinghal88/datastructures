import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);
//      int phy;
//      phy = sc.nextInt();

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        marks[3] = sc.nextInt();

        System.out.println("phy " + marks[0]);
        System.out.println("chem " + marks[1]);
        System.out.println("cs " + marks[2]);
        System.out.println("ct " + marks[3]);

//        marks[2] = 100;
//        System.out.println("cs " + marks[2]);
//
//        int percentage = (marks[0] + marks[1] + marks[2]+marks[3])/4;
//        System.out.println("percentage : " + percentage);

        System.out.println("length " + marks.length);
    }
}