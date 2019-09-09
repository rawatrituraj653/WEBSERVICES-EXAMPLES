package com.nit.handler;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.ext.DefaultHandler2;

import com.nit.model.Item;
import com.nit.model.ShippingAddress;

public class POHandler extends DefaultHandler2 {
//flags property
private boolean item_code;
private boolean  quantity;
private boolean line1;
private boolean line2;
private boolean city;
private boolean state;
private boolean zip;
private boolean country;

//has-a relation to others
private ShippingAddress address;
private List<Item> list=new ArrayList<Item>();
private Item item;		
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if("purchase-order".contentEquals(qName)) {
			System.out.println("Company Id Is: "+attributes.getValue(0));
			System.out.println("Company Name is: "+attributes.getValue(1));			
		}
		else if("shipping-address".equals(qName)) {
			address=new ShippingAddress();
		}
		else if("item".equals(qName)) {
			item=new Item();
		}
		else if("item-id".equals(qName)) {
			item_code=true;
		}
		else if("quantity".equals(qName)) {
			quantity=true;
		}
		else if("line1".equals(qName)) {
			line1=true;
		}
		else if("line2".equals(qName)) {
			line2=true;
		}
		else if("city".equals(qName)) {
			city=true;
		}
		else if("state".equals(qName)) {
			state=true;
		}
		else if("zip".equals(qName)) {
			zip=true;
		}
		else if("country".equals(qName)) {
			country=true;
		}
	}
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
	
		if(item_code) {
			item.setItemCode(new String(ch, start, length));
			item_code=false;
		}
		else if(quantity) {
			item.setQuantity(Integer.parseInt(new String(ch,start,length)));
			list.add(item);
			quantity=false;
		}
		
		else if(line1) {
			String lin1=new String(ch,start,length);
			address.setLine1(lin1);
			line1=false;
		}
		else if(line2) {
			address.setLine2(new String(ch,start,length));
			line2=false;
		}
		else if(city) {
			address.setCity(new String(ch,start,length));
			city=false;
		}
		else if(state) {
			address.setState(new String(ch,start,length));
			state=false;
		}
		else if(zip) {
			address.setZip(Integer.parseInt(new String(ch,start,length)));
			zip=false;
		}
		else if(country) {
			address.setCountry(new String(ch, start, length));
			country=false;
		}
		
	}
		@Override
		public void endDocument() throws SAXException {
			System.out.println("Item are:");
			list.forEach(s->System.out.println("\t"+s));
			System.out.println("ShippMent-Address: \n\t"+address);
			System.out.println("**********End Document*********");
		}
		@Override
		public void endElement(String uri, String localName, String qName) throws SAXException {
		}
		
		@Override
		public void startDocument() throws SAXException {
			System.out.println("**********Start Document*********");
		}

		
}

