package domain.model;

import java.util.*;

import domain.ports.Invoice;
import domain.ports.Send;

public class Sale {
	private int id;
	private Customer customer;
	private List<Concept> concepts;
	private Date date;
	//agrego las dos interfaces Invoice y Send
	private Invoice invoice;
	private Send send;
	
	public Sale(int id, Customer customer,Invoice invoice, Send send) {
		this.id = id;
		this.customer = customer;
		concepts = new ArrayList<>();
		
		//inicializo los objetos que implementen invoice y send
		this.invoice = invoice;
		this.send = send;
	}
	
	public double total() {
		double total = 0;
		//itero sobre la lista y devuelvo el subTotal de cada producto y los sumo
		for(Concept concept : concepts) {
			total += concept.subTotal();
		}
		return total;
	}
	
	//agrego mis concepts, el producto y la cantidad de ese producto
	public void addConcepts(Product product, int quantity) {
		concepts.add(new Concept(product,quantity));
	}
	
	//método para crear la facutura y el tipo de envió mediante interfaces
	public void createInvoice() {
		//aquí ya no me preocupo de modificar nada
		invoice.create();
		send.sendMessage("enviando factura...");
	}
	
}
