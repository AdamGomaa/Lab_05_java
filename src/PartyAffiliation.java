import java.util.Scanner;
public class PartyAffiliation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your party affiliation (D for Democrat, R for Republican, I for Independent): ");
        char affiliation = scanner.next().charAt(0);
        switch (Character.toUpperCase(affiliation)) {
            case 'D':
                System.out.println("You get a Democratic Donky.");
                break;
            case 'R':
                System.out.println("You get a Republican Elephant.");
                break;
            case 'I':
                System.out.println("You get an Independent Person.");
                break;
            default:
                System.out.println("You get Other.");
                break;
        }
    }
}
