package za.co.discovery.assignment.DijkstraAlgorithm.dao;
import java.util.List;

import za.co.discovery.assignment.DijkstraAlgorithm.model.PlanetNames;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
 
@Repository
public class PlanetNamesDaoImpl implements PlanetNamesDao{
	@Autowired
	private SessionFactory sessionFactory;
 
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	public List<PlanetNames> getAllPlanetNames() {
		Session session = this.sessionFactory.getCurrentSession();
		List<PlanetNames>  planetNamesList = session.createQuery("from PLANETNAMES").list();
		return planetNamesList;
	}
	
	
	
	
}
