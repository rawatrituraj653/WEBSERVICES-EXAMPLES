package com.nit.jaxb.test;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import order.purchase.types.ItemType;
import order.purchase.types.ItemsType;
import order.purchase.types.OrderItemsType;
import order.purchase.types.PurchaseOrderType;
import order.purchase.types.ShippingAddressType;

public class AppMarshaller {

	public static void main(String[] args) throws Exception {
		System.out.println("main method.................");
		//item type
		ItemType item=new ItemType();
		item.setItemCode("1C001"); item.setQuantity(123);
		//item type
		ItemType item1=new ItemType();
		item1.setItemCode("1C002");item1.setQuantity(220);
		//items types
		ItemsType itemsType=new ItemsType();
		List<ItemType> list=itemsType.getItem();
		list.add(item);list.add(item1);
		//order items 
		OrderItemsType type=new OrderItemsType();
		List<ItemsType> lists= type.getItems();
		lists.add(itemsType);
		//shipping type 
		ShippingAddressType addressType=new ShippingAddressType();
		addressType.setLine1("Mythrivanam");
		addressType.setLine2("Ameerpet");
		addressType.setCity("Hyderabd");
		addressType.setState("Telangana");
		addressType.setMobile(8966055458l);
		addressType.setZip(500016);
		// purchase order
		PurchaseOrderType orderType =new PurchaseOrderType();
		orderType.setOrderItems(type);
		orderType.setShippingAddress(addressType);
		
		JAXBContext context=JAXBContext.newInstance("order.purchase.types");
		Marshaller marshaller=context.createMarshaller();
		marshaller.marshal(orderType, new File("PO.xml"));
		System.out.println("Program ends.................");	
		
	}
}
