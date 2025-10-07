import java.util.Scanner;
public class distanceConverterApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean körigen = true;
        while (körigen) {
             Menu(sc);
        körigen = End(sc);
        }
        sc.close();
        System.out.println("Programmet avslutades");
       
    }
    static void Menu(Scanner sc){
        System.out.println("""
                Vilken typ vill du convertera?

                miles till kilometers: tryck 1
                kilomters till miles: tryck 2
                """);
                int menyVall = sc.nextInt();
                
                if(menyVall == 1) {
                    milesToKilometers(sc);
                } else if(menyVall == 2) {
                    kilometersToMiles(sc);
                } else {
                    System.out.println("fel input");
                }
    }
    static void milesToKilometers(Scanner sc){
        System.out.println("Hur många miles vill du konvertera till kilometers?");
        double miles = sc.nextDouble();
        double kilometers = miles * 1.60934;
        System.out.println(miles +  " miles är " + kilometers + " kilometer");
    }
    static void kilometersToMiles(Scanner sc) {
        System.out.println("Hur många kilometer vill du konvertera till miles?");
       double kilometers = sc.nextDouble();
        double miles = kilometers / 1.60934;
        System.out.println(kilometers + " kilometer är " + miles + " miles");
       

    }
    static boolean End(Scanner sc){

        System.out.println();
 System.out.println("""
                Vill du convertera igen?
                Starta om tryck: 1
                Avsluta tryck: 2
                """);
                int endvall = sc.nextInt();

                if (endvall == 1){
                    return true;
                } else if (endvall == 2){
                    return false;
                } else{
                    System.out.println("Något blev fel, programmet avslutas");
                    return false;
                }
    }
}
