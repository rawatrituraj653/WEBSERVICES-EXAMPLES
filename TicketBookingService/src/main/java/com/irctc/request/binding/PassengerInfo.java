package com.irctc.request.binding;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@XmlRootElement(name="person-info")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class PassengerInfo {

	@XmlElement(name="passenger-name")
	private String name;
	@XmlElement(name="passenger-age")
	private int age;
	@XmlElement(name="pan-number")
	private String panNum;
	@XmlElement(name="adhar-number")
	private String adharNum;
	
}
