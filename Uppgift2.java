import java.util.Scanner;
public class Uppgift2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int nummer1, nummer2, nummer3;
        System.out.println("Skriv ett nummer");
        nummer1 = sc.nextInt();

        System.out.println("Skriv till nummer");
        nummer2 = sc.nextInt();

        System.out.println("Skriv ditt sista nummer");
        nummer3 = sc.nextInt();
        
        if (nummer1 > nummer2 && nummer1 > nummer3)
            System.out.println("Det största nummret är: " + nummer1); {
            
        } if (nummer2 > nummer1 && nummer2 > nummer3) {
            System.out.println(" Det största talet är: " + nummer2); {
             } if (nummer3 > nummer1 && nummer3 > nummer2)
                    System.out.println(" Det största talet är: " + nummer3); {

        }

    }

}
}


