package za.co.discovery.assignment.DijkstraAlgorithm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
/*
 * This is our model class and it corresponds to ROUTES table in database
 */
@Entity
@Table(name="ROUTES")
public class Routes{
 
	@Id
	@Column(name="routeID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int routeID;
 
	@Column(name="planetOrigin")
	String planetOrigin; 
	
	@Column(name="planetDestination")
	String planetDestination; 
	
	@Column(name="distance")
	double distance; 
 
	
 
	public Routes() {
		super();
	}
	public Routes(int routeID, String planetOrigin,String planetDestination, double distance) {
		super();
		this.routeID=routeID;
		this.planetOrigin=planetOrigin;
		this.planetDestination=planetDestination;
		this.distance=distance;
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
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	
	public int getRouteID() {
		return routeID;
	}
	public void setRouteID(int routeID) {
		this.routeID = routeID;
	}
	
	
}