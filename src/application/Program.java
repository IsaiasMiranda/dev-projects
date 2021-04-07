package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;
 

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner e = new Scanner(System.in);

		List<Product> product = new ArrayList<>();

		int count;

		do {
			System.out.print("Product's name: ");
			String name = e.nextLine();
			System.out.print("Price R$: ");
			double price = e.nextDouble();
			System.out.print("quantity in stock: ");
			int quantity = e.nextInt();

			// adicionar produtos
			product.add(new Product(name, price, quantity));

			System.out.print("Register another product? Y | N: ");
			char response = e.next().charAt(0);

			if (response == 'y') {
				count = 0;
			} else {
				count = 1;
			}
			e.nextLine();
		} while (count == 0);

		System.out.println();
		for (Product prod : product) {
			System.out.println(prod);
		}

		/**
		 * System.out.println("Product data: " + product);
		 * 
		 * System.out.print("Enter the number of products to be added in stock:");
		 * product.addProducts(e.nextInt());
		 * 
		 * System.out.println("Updated data: " + product);
		 * 
		 * System.out.print("Enter the number of products to be removed in stock:");
		 * product.removeProduct(e.nextInt());
		 * 
		 * System.out.println("Updated data: " + product);
		 */

		e.close();
	}

}
