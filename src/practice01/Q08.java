package practice01;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {

/*
    Type the codes which asks the user to put the letters for the favorite football club in Turkey.
    It prints "Galatasaray" for gs,
    it prints "Trabzonspor" for ts,
    it prints "Besiktas" for bjk, and
    it prints "Fenerbahce" for fb.
    Please use switch statement in your codes.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your club");
        String club=scan.nextLine();
        club=club.toLowerCase();
        switch(club){
            case "gs":
                System.out.println("galatasaray");
                break;
            case "fb":
                System.out.println("fenerbahce");
                break;
            case "bjk":
                System.out.println("besiktas");
                break;
            case "ts":
                System.out.println("trabzonspor");
                break;
            default:
                System.out.println("We do not know your club ");

        }




    }
}
