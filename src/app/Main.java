package app;
import domain.model.*;
import domain.ports.*;
import infrastructure.invoice.*;
import infrastructure.send.*;

public class Main {

	public static void main(String[] args) {
		
		//creo mis productos
		var product1 = new Product(1,"chips",20);
		var product2 = new Product(2,"coca-cola",8.20);
		var product3 = new Product(3,"galletas", 7.50);
		
		//creo mi cliente
		var customer = new Customer(1,"Bob");
		//creo el tipo de factura y el tipo de envio
		var invoice1 = new Invoice1();
		var sendEmail = new SendEmail();
		//creo mi venta
		var sale = new Sale(1,customer,invoice1,sendEmail);
		
		sale.addConcepts(product1, 3);// agrego 3 bolsas de papas
		sale.addConcepts(product2, 2);//agrego 2 cocas
		sale.addConcepts(product3, 1);//agrego unas galletas
		
		//imprimo el total
		System.out.println(sale.total());//output: total
		sale.createInvoice();//se imprime el tipo de factura y el cómo se va a enviar
	}

}
