package esSmartphoneKamanin;
import bean.Smartphone;
import java.util.Scanner;

public class InputSmartphone {
    public Smartphone getSmartphone(Scanner scanner) {
        System.out.print("Enter the brand:");
        String brand = scanner.nextLine();

        System.out.print("Enter the model:");
        String model = scanner.nextLine();

        System.out.print("Enter the launch price:");
        double launchPrice = scanner.nextDouble();
       

        System.out.print("Enter the number of inches:");
        double numberOfInches = scanner.nextDouble();
       

        System.out.print("Enter the RAM:");
        double ram = scanner.nextDouble();

        return new Smartphone(brand, model, launchPrice, numberOfInches, ram);
    }
}