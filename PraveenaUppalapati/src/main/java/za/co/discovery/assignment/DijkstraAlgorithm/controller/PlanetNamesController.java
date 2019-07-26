package za.co.discovery.assignment.DijkstraAlgorithm.controller;
import java.util.List;

import za.co.discovery.assignment.DijkstraAlgorithm.model.PlanetNames;
import za.co.discovery.assignment.DijkstraAlgorithm.service.PlanetNamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
public class PlanetNamesController {

	@Autowired
	PlanetNamesService PlanetNamesService;
	
	 @ModelAttribute
	    public List<PlanetNames> planetNamesList(){
	        return PlanetNamesService.getAllPlanetNames();
	    }
	
}
