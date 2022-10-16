package staticDemo;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.name="s";
		product.price= 0;
		
		ProductManager productManager = new ProductManager();
		
		productManager.add(product);
	}

}
