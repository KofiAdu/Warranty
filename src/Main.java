import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList ;
import java.util.List ;

public class Main {
    public static Warranty newWarranty() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the product code of the device (0 = Stop Feeding): ");
        String warrantyCode = scanner.nextLine();
        if (Objects.equals(warrantyCode, "0")){
            return null;
        }else{
            System.out.println("Please provide a description of the problem: ");
            String description = scanner.nextLine() ;
            System.out.println("Enter the solution to the problem (if any): ") ;
            String solution = scanner.nextLine() ;
            System.out.println("Please enter the cost of solving the problem: (�):");
            double cost = Double.parseDouble(scanner.nextLine()) ;
            System.out.println();
            return new Warranty(warrantyCode, description, solution, cost);
        }
    }
    public static void main(String[] args) {
        ArrayList<Warranty> warrantyList = new ArrayList<>();

        while (true) {
            Warranty warrantyObj = newWarranty();
            if ( warrantyObj== null){
                break;
            }
            warrantyList.add(warrantyObj);
        }
        WarrantyUtils.getProductWarrantyIssues(warrantyList);
    }
}
