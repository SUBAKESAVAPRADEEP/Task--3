        package Pradeep;


import java.util.Scanner;

public class XYZ {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter employee ID: ");
                int empId = scanner.nextInt();

                scanner.nextLine(); // Consume the newline

                System.out.print("Enter employee name: ");
                String empName = scanner.nextLine();

                System.out.print("Enter employee salary: ");
                double empSalary = scanner.nextDouble();

                Employee employee = new Employee(empId, empName, empSalary);
                employee.calcTax();

                System.out.print("Enter product ID: ");
                int productId = scanner.nextInt();

                System.out.print("Enter product price: ");
                double productPrice = scanner.nextDouble();

                System.out.print("Enter product quantity: ");
                int productQuantity = scanner.nextInt();

                Product product = new Product(productId, productPrice, productQuantity);
                product.calcTax();

                scanner.close();

            }
}
