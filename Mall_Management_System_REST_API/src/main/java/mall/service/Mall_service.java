package mall.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import mall.entity.Mall_info;
import mall.repository.Myrepository;

@Service
public class Mall_service {

	@Autowired
	Myrepository repo;

	public List<Mall_info> getAll() {

		return repo.findAll();

	}

	public List<Mall_info> add(List<Mall_info> get) {

		return repo.saveAll(get);

	}

	public String update(Integer id, String name) {

		Optional<Mall_info> info = repo.findById(id);

		Mall_info mall_info = info.get();
		mall_info.setName(name);
		repo.save(mall_info);

		return "Mall name updated successfully";
	}

	public String remove(Integer id) {

		repo.deleteById(id);
		return "Data deleted successfully...";

	}

}
