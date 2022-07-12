package classroomTwo;

import java.util.Scanner;


public class PracticalsTaskTwo {
    public static void main(String[] args) {
        Scanner skeneris = new Scanner(System.in);
        //      System.out.println("Ievadi savu vārdu!");
        //      String name = skeneris.nextLine();
        //       System.out.println("Ievadi savu vecumu");
        //       int age = skeneris.nextInt();
        //       System.out.println("Esi sveicināta: " + name + "!");
        //       System.out.println("Jūsu vecums ir: " + age);

        //       System.out.println("Ievadi pirmo skatili");
        //      int a = skeneris.nextInt();
        //       System.out.println("Ievadi otro skatili");
//        int b = skeneris.nextInt();
        //       int summa = a + b;
        //       System.out.println("skaitļu summa ir " + summa);

        int a = 5;
        int b = 10;
        int c = 5;

        //lielāks >
        System.out.println(b > a); //true
        System.out.println(a > b); //false
//mazāks <
        System.out.println(a < b); //true
        System.out.println(b < a); //false
        //vienāds
        System.out.println(a == b); //false
        System.out.println(a == c); //true
        System.out.println(b == c); //false

        int vecums = 18;
        boolean vaiDrikstBalsot = (vecums >= 18);
        System.out.println("Vai cilvēks drīkst balsot? " + vaiDrikstBalsot);
        String name = "Oksana";
        String secondName = "Olga";
        boolean vaiVardiSakrit = (name.equals(secondName));
        System.out.println("Vai vārdi sakrīt? " + vaiVardiSakrit);

        int e = 4;

        boolean vaiIrPatiess = ((e < 5) && (e < 10));
        System.out.println(vaiIrPatiess);

        e = 5;
        vaiIrPatiess = ((e < 5) && (e < 10));
        System.out.println(vaiIrPatiess);
        vaiIrPatiess = ((e < 5) || (e < 10));
        System.out.println(vaiIrPatiess);

        e = 5;
        vaiIrPatiess = (!(e < 5));
        System.out.println(vaiIrPatiess);

        System.out.println(!(false == true));
        int vecumsDivi = 18;
        if (vecumsDivi >= 18) {
            System.out.println("Cilvēks drīkst balsot");
            System.out.println("Cilvēks drīkst balsot");
            System.out.println("Cilvēks drīkst balsot");
            System.out.println("Cilvēks drīkst balsot");
            System.out.println("Cilvēks drīkst balsot");
        }
        //      System.out.println("Koda turpinājums");
        //       System.out.println("Ievadi savu vecumu...");
        //      int vecumsTris = skeneris.nextInt();
        //       if(vecumsTris>=18){
        //           System.out.println("Cilvēks drīkst balsot");
        //       } else{
        //           System.out.println("Cilvēks nedrīkst balsot");
        //       }
        System.out.println("Koda turpinājums");
//        System.out.println("Ievadi skatli..");
        int skaitlisViens = skeneris.nextInt();
        if (skaitlisViens == 10) {
            System.out.println("Printejam Skaitlis 10");
        } else if (skaitlisViens == 15) {
            System.out.println("Printejam Skaitlis 15");
        } else if (skaitlisViens == 20) {
            System.out.println("Printejam Skaitlis 20");
        } else {
            System.out.println("Skaitlis ir nezināms");
        }

        System.out.println("Koda turpinājums");

        //Janodefine cilveks
        //Cilveka vecums
        //cilveka dzimums - V vai S
        //Sieviete drikst doties pensija no 60 gadiem
        //Virietis driskt doties pensija no 65 gadiem

    }

    int manaKvadrataLaukums = aprekinatKvadrataLaukumu(5);
        System.out.println("Kvadrata lauikuims ir: " + manaKvadrataLaukums);
    static int aprekinatKvadrataLaukumu(int mala){
        int laukums = mala * mala;
        return laukums;
    }

            static void CheckPersionPension(){
        int cilvekaVecums = 65;
        char cilvekaDzimums = 'V';
        boolean drikstDotiesPensija = false;


        if (cilvekaVecums >= 65 && cilvekaDzimums == 'V') {
            drikstDotiesPensija = true;
        } else if (cilvekaVecums >= 60 && cilvekaDzimums == 'S') {
            drikstDotiesPensija = true;
        }

        if (drikstDotiesPensija) {
            System.out.println("Cilveks drikst doties pensija!");
        }
        System.out.println("Koda turpinājums");


        int diena = 3;
        String dienasVards;

        switch (diena) {
            case 1:
                dienasVards = "Pirmdiena";
                break;
            case 2:
                dienasVards = "Otrdiena";
                break;
            case 3:
                dienasVards = "Trešdiena";
                break;
            case 4:
                dienasVards = "Ceturdiena";
                break;
            case 5:
                dienasVards = "Piektdiena";
                break;
            case 6:
                dienasVards = "Sestdiena";
                break;
            case 7:
                dienasVards = "Svētdiena";
                break;
            default:
                dienasVards = "Nezināma diena";
        }
        System.out.println(dienasVards);


        System.out.println("Lūdzu ievadiet skaitli");
        int skaitlis =  skeneris.nextInt();
        if (skaitlis > 0) {
            System.out.println("Skaitlis lielāks par 0");
        } else {
            System.out.println("Skaitlis ir mazāks par 0");
        }


        System.out.println("Ievadi veselu skaitli!");
        int veselsSlaitlis = skeneris.nextInt();
        if (veselsSlaitlis > 0) {
            System.out.println("Skaitlis " + veselsSlaitlis + " ir lielāks par 0");
        } else {
            System.out.println("Skaitlis " + veselsSlaitlis + " nav lielāks par 0");
        }
    }
}
