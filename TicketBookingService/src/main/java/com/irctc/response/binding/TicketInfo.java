package com.irctc.response.binding;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@XmlRootElement(name="ticket-info")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class TicketInfo {

	@XmlElement(name="train-number")
	private Long trainNo;
	@XmlElement(name="train-name")
	private String trainName;
	@XmlElement(name="passenger-name")
	private String name;
	@XmlElement(name="passenger-age")
	private Integer age;
	@XmlElement(name="pan-number")
	private String panNum;
	@XmlElement(name="adhar-number")
	private String adharNum;
	private String from;
	private String to;
	@XmlElement(name="ticket-fare")
	private Double ticketFare;
	@XmlElement(name="status")
	private String status;
}
