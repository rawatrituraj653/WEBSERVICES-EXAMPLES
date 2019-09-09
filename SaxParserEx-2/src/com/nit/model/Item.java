package com.nit.model;

public class Item {

	private String itemCode;
	private Integer quantity;
	
	
	
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Item [itemCode=" + itemCode + ", quantity=" + quantity + "]";
	}	
}
