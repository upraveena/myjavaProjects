package za.co.discovery.assignment.DijkstraAlgorithm.service;

import java.util.List;

import javax.transaction.Transactional;
 
import za.co.discovery.assignment.DijkstraAlgorithm.dao.PlanetNamesDao;
import za.co.discovery.assignment.DijkstraAlgorithm.model.PlanetNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
 
@Service("planetNamesService")
public class PlanetNamesService {
	@Autowired
	PlanetNamesDao PlanetNamesDao;
 
	@Transactional
	public List<PlanetNames> getAllPlanetNames() {
		return PlanetNamesDao.getAllPlanetNames();
	}
 
	
	
}
