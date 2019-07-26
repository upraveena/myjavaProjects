package za.co.discovery.assignment.DijkstraAlgorithm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
/*
 * This is our model class and it corresponds to PLANETNAMES table in database
 */
@Entity
@Table(name="PLANETNAMES")
public class PlanetNames{
 
	@Id
	@Column(name="planetNode")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	String planetNode;
 
	@Column(name="planetName")
	String planetName; 
 
	
 
	public PlanetNames() {
		super();
	}
	public PlanetNames(String planetNode,String planetName) {
		super();
		this.planetNode=planetNode;
		this.planetName=planetName;
	}
	public String getPlanetName() {
		return planetName;
	}
	public void setPlanetName(String planetName) {
		this.planetName = planetName;
	}
	public String getPlanetNode() {
		return planetNode;
	}
	public void setPlanetNode(String planetNode) {
		this.planetNode = planetNode;
	}

}
 
