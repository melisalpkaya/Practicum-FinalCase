import java.util.Scanner;

public class PatikaStore {

    public void start() {
        Scanner input = new Scanner(System.in);
            while (true) {
                System.out.println();
                System.out.println("PatikaStore Product Management Panel");

                System.out.println("1 - Notebook ");
                System.out.println("2 - Mobile Phone");
                System.out.println("3 - List Brands");
                System.out.println("0 - Exit");

                System.out.print("Your choice: ");
                int userChoice = input.nextInt();

                String[] brands = {"Samsung", "Lenovo", "Apple", "Huawei", "Casper", "Asus", "HP", "Xiaomi", "Monster"};

                int index = 0;
                for (String brand:brands) {
                    Brands.addBrand(brand, index++);
                }

                boolean exit = false;

                switch (userChoice) {
                    case 1 -> {
                        System.out.println("1 is chosen");
                        Product.menu(1);
                    }
                    case 2 -> {
                        System.out.println("2 is chosen");
                        Product.menu(2);
                    }
                    case 3 -> Brands.printBrands();
                    case 0 -> exit = true;
                    default -> {
                        System.out.println();
                        System.out.println("There is no such an option. Please enter your choice again.");
                        System.out.println();
                    }
                }

                if (exit) {
                    System.out.println();
                    System.out.println("You've left the store. See you soon.");
                    return;
                }
            }
        }
}
