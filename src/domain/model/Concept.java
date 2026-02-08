package domain.model;


public class Concept {
	//concepto o ticket va a tener el producto y la cantidad de dicho producto
		private Product product;
		private int quantity;
		
		public Concept(Product product, int quantity) {
			this.product = product;
			this.quantity = quantity;
		}
		
		//método para calcular el subtotal por cantidad de productos
		public double subTotal() {
			return product.getPrice() * quantity;
		}
}
