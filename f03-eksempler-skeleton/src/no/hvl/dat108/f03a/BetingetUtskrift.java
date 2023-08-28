package no.hvl.dat108.f03a;


interface Betingelse{
    boolean erSant(String s);
}

public class BetingetUtskrift {

    static void betingetUtskrift(String s, Betingelse b){
        if (b.erSant(s)){
            System.out.println(s);
        }
    }
    public static void main(String[] args) {

        String s1 = "Xo";
        String s2 = "Anne";

        Betingelse starterMedX = a -> a.startsWith("X");
        betingetUtskrift(s1, starterMedX);
        betingetUtskrift(s2, starterMedX);

        betingetUtskrift(s1, a -> a.length() > 3);
        betingetUtskrift(s2, a -> a.length() > 3);
    }
}
