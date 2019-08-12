package com.irctc.request.binding;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@XmlRootElement(name="journey-info")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class JourneyInfo {


	@XmlElement(name="journey-date")
	private Date journeyDate;
	@XmlElement(name="from")
	private String from;
	@XmlElement(name="to")
	private String to;
	@XmlElement(name="train-num")
	private Long trainNum;
	@XmlElement(name="train-name")
	private String trainName; 
	
}

