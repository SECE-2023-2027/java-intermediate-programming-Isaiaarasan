import java.util.Scanner;

public class Product {
	private String productId;
	private String productName;
	private double price;
	private int stockQuantity;

	public Product(String productId, String productName, double price, int stockQuantity) {
		this.productId = productId;
		this.productName = productName;
		setPrice(price);
		setStockQuantity(stockQuantity);
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price < 0 ? 0.0 : price;
	}

	public int getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity < 0 ? 0 : stockQuantity;
	}

	public void applyDiscount(double percentage) {
		price -= price * (percentage / 100.0);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter product ID: ");
		String productId = scanner.nextLine();

		System.out.print("Enter product name: ");
		String productName = scanner.nextLine();

		System.out.print("Enter price: ");
		double price = scanner.nextDouble();

		System.out.print("Enter stock quantity: ");
		int stockQuantity = scanner.nextInt();

		System.out.print("Enter discount percentage: ");
		double discountPercentage = scanner.nextDouble();

		Product p = new Product(productId, productName, price, stockQuantity);
		p.applyDiscount(discountPercentage);

		System.out.println(p.getPrice());
		System.out.println(p.getStockQuantity());

		scanner.close();
	}
}
