import java.util.Scanner;
public class HalloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password;
        String number;
        do{ 
        
            System.out.println("Skriv in ditt lösenord");
            password = sc.nextLine();
            if (password.equals("Gaming"))
                System.out.println("Välkommen in!");
            else
                System.out.println("Fel lösenord, försök igen");
        }while(password.equals("Gaming") == false);
        do{
            System.out.println("Skriv in nummer fem");
            number = sc.nextLine();
            if (number.equals("5"))
            System.out.println("bra jobbat!!!");
            else
            System.out.println("fel nummer");
        }while(number.equals("5") == false);
                 {
                
            }
          


        
                  
        }
    }


