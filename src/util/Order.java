package util;

import java.text.DateFormat;
import java.util.Date;

public class Order {
	private Integer id;
	private Date moment;
	private OrderStatus status;
	DateFormat f = DateFormat.getDateInstance(DateFormat.FULL);
	
	public Order() {
	}

	public Order(Integer id, Date moment, OrderStatus status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	public String toString() {
		return "ID do Pedido: " + id + "\nData do pedido: " + f.format(moment) + "\nStatus do pedido: " + status;
	}
}	
