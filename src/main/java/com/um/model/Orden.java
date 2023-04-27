package com.um.model;

public class Orden {
	private Integer id;
	private String numero;
	private double total;
	
	public Orden() {
	}
	
	

	public Orden(Integer id, String numero, double total) {
		super();
		this.id = id;
		this.numero = numero;
		this.total = total;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	@Override
	public String toString() {
		return "Orden [id=" + id + ", numero=" + numero + ", total=" + total + "]";
	}
}

    