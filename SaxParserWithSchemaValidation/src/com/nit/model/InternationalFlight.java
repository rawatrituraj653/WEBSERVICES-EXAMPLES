package com.nit.model;

public class InternationalFlight {

	private String flightId;
	private String pilotName;
	private String to;
	private String from;
	private int agentId;
	
	
	public String getFlightId() {
		return flightId;
	}


	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}


	public String getPilotName() {
		return pilotName;
	}


	public void setPilotName(String pilotName) {
		this.pilotName = pilotName;
	}


	public String getTo() {
		return to;
	}


	public void setTo(String to) {
		this.to = to;
	}


	public String getFrom() {
		return from;
	}


	public void setFrom(String from) {
		this.from = from;
	}


	public int getAgentId() {
		return agentId;
	}


	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}


	@Override
	public String toString() {
		return "InternationalFlight [flightId=" + flightId + ", pilotName=" + pilotName + ", to=" + to + ", from="
				+ from + ", agentId=" + agentId + "]";
	}
	
}
