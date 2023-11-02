package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.Cars;
import dmacc.repository.CarsRepository;

@Controller
public class WebController {
	@Autowired
	CarsRepository repo;
	
	@GetMapping({"/", "viewAll"})
	public String viewAllCars(Model model) {
		if(repo.findAll().isEmpty()) {
			return addNewCar(model);
		}
		model.addAttribute("car", repo.findAll());
		return "results";
	}
	
	@GetMapping("/inputCar")
	public String addNewCar(Model model) {
		Cars c = new Cars();
		model.addAttribute("newCar", c);
		return "input";
	}
	
	@PostMapping("/inputCar")
	public String addNewCar(@ModelAttribute Cars c, Model model) {
		repo.save(c);
		return viewAllCars(model);
	}
	
	@GetMapping("/edit/{id}")
	public String showUpdateCar(@PathVariable("id") long id,Model model) {
		Cars c = repo.findById(id).orElse(null);
		model.addAttribute("newCar", c);
		return "input";
	}
	
	@PostMapping("/update/{id}")
	public String reviseCar(Cars c, Model model) {
		repo.save(c);
		return viewAllCars(model);
	}
	
	@GetMapping("/delete/{id}")
	public String deleteCar(@PathVariable("id") long id, Model model) {
		Cars c = repo.findById(id).orElse(null);
		repo.delete(c);
		return viewAllCars(model);
	}
}

