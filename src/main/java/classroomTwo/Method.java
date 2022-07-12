package classroomTwo;

import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        System.out.println("Sākās koda izpilde");
        checkPersonAge();
        System.out.println("Beidzās koda izpilde");
    }
    static void checkPersonAge() {
        Scanner scanner = new Scanner(System.in);
        int vecumsTris = scanner.nextInt();
        if (vecumsTris >= 18) {
            System.out.println("Cilvēks drīkst balsot");
        } else {
            System.out.println("Cilvēks nedrīkst balsot");
        }
        System.out.println("Beidzās  metodes izpilde");

    }

}

