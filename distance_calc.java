import java.util.Scanner;
public class distance_calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] metrics = {"Kilometers, Miles", "km", "mi"};
        String input = "";
        double distance = 0.0;
        double  convertedDistance= 0.0;
        double convertedDistance1 = 0.0;
        boolean choice = true;


        //input
        System.out.println("DISTANCE CALCULATOR");
        do {

            System.out.print("Enter the distance: ");
            if(!sc.hasNextDouble()) {
                System.out.println("Invalid input");
               return;
            }else {
                distance = sc.nextDouble();
                sc.nextLine();
            }

            System.out.print("Enter the metric unit (Kilometers, Miles): ");
            input = sc.nextLine().toLowerCase();
            if (!(input.equalsIgnoreCase("km") || input.equalsIgnoreCase("mi") || input.equalsIgnoreCase("Miles") || input.equalsIgnoreCase("Kilometers")) ) {
                System.out.println("Invalid input");
          }
            //process
            if(input.equalsIgnoreCase("km")){
                convertedDistance = distance * 0.621371;
            } else if ( input.equalsIgnoreCase("kilometers")) {
                convertedDistance = distance * 0.621371;
            } else if (input.equalsIgnoreCase("mi")){
                convertedDistance1 = distance * 1.60934;
            }else if (input.equalsIgnoreCase("Miles")){
                convertedDistance1 = distance * 1.60934;
            }

            //output
            System.out.println("Calculated distance: ");
            System.out.println("Miles: " + convertedDistance1 + " mi");
            System.out.println("Kilometers: " + convertedDistance + " km");



        //loop
            System.out.print("\n Do you want to continue? (Y/N): ");
            choice = sc.next().equalsIgnoreCase("y");

        }while (choice);

        sc.close();
    }

}