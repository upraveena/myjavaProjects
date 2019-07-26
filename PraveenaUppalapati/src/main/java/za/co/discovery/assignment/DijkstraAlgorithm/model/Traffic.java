package za.co.discovery.assignment.DijkstraAlgorithm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
/*
 * This is our model class and it corresponds to TRAFFIC table in database
 */
@Entity
@Table(name="TRAFFIC")
public class Traffic{
 
	@Id
	@Column(name="routeID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int routeID;
 
	@Column(name="planetOrigin")
	String planetOrigin; 
	
	@Column(name="planetDestination")
	String planetDestination; 
	
	@Column(name="trafficDelay")
	double trafficDelay; 
 
	
 
	public Traffic() {
		super();
	}
	public Traffic(int routeID, String planetOrigin,String planetDestination, double trafficDelay) {
		super();
		this.routeID=routeID;
		this.planetOrigin=planetOrigin;
		this.planetDestination=planetDestination;
		this.trafficDelay=trafficDelay;
	}
	public String getPlanetOrigin() {
		return planetOrigin;
	}
	public void setPlanetOrigin(String planetOrigin) {
		this.planetOrigin = planetOrigin;
	}
	public String getPlanetDestination() {
		return planetDestination;
	}
	public void setPlanetDestination(String planetDestination) {
		this.planetDestination = planetDestination;
	}
	public double getTrafficDelay() {
		return trafficDelay;
	}
	public void setTrafficDelay(double trafficDelay) {
		this.trafficDelay = trafficDelay;
	}
	
	public int getRouteID() {
		return routeID;
	}
	public void setRouteID(int routeID) {
		this.routeID = routeID;
	}
	
	
}