package BT1;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ManagerProduct manager = new ManagerProduct();
        int choice;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("1. Them San Pham");
            System.out.println("2. Hien Thi San Pham");
            System.out.println("3. Ghi File");
            System.out.println("0. Thoat");
            choice = input.nextInt();
            input.nextLine();
            switch (choice){
                case 0:
                    System.exit(0);
                case 1:
                    manager.ceartProduct(input);
                    break;
                case 2:
                    manager.showProduct();
                    break;
                case 3:
                    manager.fileWriter();
                    break;
            }
        } while (true);
    }
}
