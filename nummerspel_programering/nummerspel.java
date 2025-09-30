package nummerspel_programering;
import java.util.Scanner;
import  java.util.Random;
public class nummerspel {
    static int playerchoice;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        startmeny();
        systemet();
        End();
}
public static void startmeny() {
    Scanner sc = new Scanner(System.in);

    String startmeny = """
            Hej och välkommna till spelet! välj ett  nummer från 1-6
            """;

            System.out.println(startmeny);
            playerchoice = sc.nextInt();
}
public static void systemet() {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    int random = rand.nextInt(6) +1;

    if (random == playerchoice) {
System.out.println("Rätt svar!!! " + "korrekt svar var " + random);

    }else {
System.out.println("fel, försök igen " + "korrekt svar var " + random);
 }



}
public static void End(){
    Scanner sc = new Scanner(System.in);

   System.out.println("Vill du spela igen? y/n"); 
   String input = sc.nextLine();

}
}






