package mall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

import mall.entity.Mall_info;
import mall.service.Mall_service;

@RestController
public class Mycotroller {

	@Autowired
	Mall_service service;

	@GetMapping("/details")
	public List<Mall_info> getAll() {
		return service.getAll();
	}

	@PostMapping("/add")
	public List<Mall_info> add(@RequestBody List<Mall_info> get) {

		return service.add(get);

	}

	 @PutMapping("/update/{id}")
	public String update(@PathVariable Integer id, @PathVariable String name) {

		return service.update(id, name);

	}

	@DeleteMapping("/delete/{id}")
	public String remove(@PathVariable Integer id) {
		service.remove(id);

		return "Data deleted successfull...";

	}

}
