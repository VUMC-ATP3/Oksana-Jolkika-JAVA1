package classroomThree;
import java.util.Scanner;


public class Masivi {
    public static void main(String[] args) {
        majuParbaude();

 //       int sakotnejs = 0;
 //       while(sakotnejs<=1000) {
//            System.out.println(sakotnejs);
//            sakotnejs = sakotnejs + 2;
 //       }

        String pietura = "Centrālā stacija";
        //saraksts/array/masīvs
        String[] stacijas = {"Centrāla", "Torņakalns", "Brasla", "Majori", "Dzintari"};
        String[] pieturas = {"Centrālā stacija", "Marijas iela", "Gogoļa iela", "Maskavas iela", "Aviācijas iela"};
        printetTekstaMasivu(stacijas);
        printetTekstaMasivu(pieturas);
        int skaititajs = 0;
        while (skaititajs < 3) {
            System.out.println(pieturas[skaititajs]);
            //sakititajs++ =skaitijas + 1
            skaititajs = skaititajs + 1;

        }
        int[] majuNumuri = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        printetIntegerMasivu(majuNumuri);
        int e = 0;
        while (e < 9){

            System.out.println("Majas numurs: " + majuNumuri[e]);
            e = e + 1;
        }
        char[] patskani = {'a', 'o', 'i', 'e', 'u'};
        System.out.println(pieturas[0] + pieturas[1] + pieturas[2]);
        pieturas[2] = "Zemetanu stacija";
        System.out.println(pieturas[0] + pieturas[1] + pieturas[2]);
        System.out.println("Cik pieturas ir masīvā? " + pieturas.length);
        System.out.println("Cik majas  ir uz ielas? " + majuNumuri.length);
        String[] hokejaCempioniTopTris = new String[3];
        System.out.println("Cik vietas ir čempionātā? " + hokejaCempioniTopTris.length);
        String pirmaVieta = "Somija";
        String otraVieta = "Kanāda";
        String tresaVieta = "Čehija";

        hokejaCempioniTopTris[0] = pirmaVieta;
        hokejaCempioniTopTris[1] = otraVieta;
        hokejaCempioniTopTris[2] = tresaVieta;
        System.out.println(hokejaCempioniTopTris[0] + "\n" + hokejaCempioniTopTris[1] +"\n" + hokejaCempioniTopTris[2]);

        System.out.println("Cikls sākas");
        int i = 0;
        while (i < 5) {
            //kods kurs izpildās, ja nosacījums ir true(patiess)
            System.out.println(i);
            i = i + 1;
        }
        System.out.println("Cikls beidzās");

        Scanner scanner = new Scanner(System.in);
        String parole = "Parole123";
        String lietotajaIevaditaParole;

        do {
            System.out.println("Ievadi paroli!");
            lietotajaIevaditaParole = scanner.nextLine();
            System.out.println("Notiek paroles pārbaude");
        }while(!lietotajaIevaditaParole.equals(parole));
        System.out.println("Pareiza parole");

    }
    static void printetTekstaMasivu(String[] randomMasivs) {
        int skaititajs = 0;
        while (skaititajs < randomMasivs.length) {
            System.out.println(randomMasivs[skaititajs]);
            skaititajs = skaititajs + 1;
        }
    }

    static void printetIntegerMasivu(int[] kautKo){
        int i = 0;
        while(i<kautKo.length){
            System.out.println(kautKo[i]);
            i++; //i = i + 1;
        }
    }
    static void majuParbaude() {
        int majuNumuri = 1;
        while (majuNumuri <= 50) {
            if (majuNumuri % 3 == 0 || majuNumuri % 5 == 0 || majuNumuri == 13) {
                System.out.println("šie māju numuri neder" + majuNumuri);
            } else {
                System.out.println("šie māju numuri DER " + majuNumuri);
            }
            majuNumuri = majuNumuri + 1;
        }
    }
//    static void majuParbaude(int sakums, int beigas, int iznemums) {
//        int majuNumuri = sakums;
 //       while (majuNumuri <= beigas) {
//            if (majuNumuri % 3 == 0 || majuNumuri % 5 == 0 || majuNumuri == iznemums) {
//                System.out.println("šie māju numuri neder" + majuNumuri);
//            } else {
//                System.out.println("šie māju numuri DER " + majuNumuri);
//            }
//            majuNumuri = majuNumuri + 1;
        }
}

