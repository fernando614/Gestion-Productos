package infrastructure.invoice;

import domain.ports.Invoice;

public class Invoice1 implements Invoice{
	//clases que implementa a su manera el tipo de factura
	public void create() {
		System.out.println("se genera XML versión 1");
		System.out.println("se sella el XML");
		System.out.println("se guarda");
	}
}