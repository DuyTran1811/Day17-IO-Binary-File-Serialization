package BT1;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ManagerProduct {
    ArrayList<Product> listProduct = new ArrayList<>(readFile());
    public static final String FILE_PRODUCT = "Product.DAT";

    public void ceartProduct(Scanner input) {
        System.out.println("Nhap Ma San Pham");
        String id = input.nextLine();
        System.out.println("Nhap Ten San Pham");
        String name = input.nextLine();
        System.out.println("Nhap Hang San Pham");
        String brand = input.nextLine();
        System.out.println("Nhap Gia San Pham");
        int price = Integer.parseInt(input.nextLine());
        System.out.println("Nam San Xuat");
        String year = input.nextLine();
        Product product1 = new Product(id, name, brand, price, year);
        listProduct.add(product1);
    }

    public void showProduct() {
        System.out.printf("%-12s%-12s%-12s%-12s%-12s\n",
                "Ma SP", "Ten SP", "Han SX", "Gia SP", "Nam SX");
        for (Product product : listProduct) {
            System.out.printf("%-12s%-12s%-12s%-12s%-12s\n",
                    product.getId(), product.getName(),
                    product.getBrand(), product.getPrice(), product.getYear());
        }
    }

    public void fileWriter() {
        try {
            FileOutputStream fos = new FileOutputStream(FILE_PRODUCT, true);
            ObjectOutputStream bos = new ObjectOutputStream(fos);
            bos.writeObject(listProduct);
            bos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private ArrayList<Product> readFile() {
        ArrayList<Product> list = new ArrayList<>();
        try {
            FileInputStream fo = new FileInputStream(FILE_PRODUCT);
            ObjectInputStream ois = new ObjectInputStream(fo);
            list = (ArrayList<Product>) ois.readObject();
        } catch (Exception e) {
            System.err.println(e);
        }
        return list;
    }
}
