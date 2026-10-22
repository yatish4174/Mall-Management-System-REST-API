package mall.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mall.entity.Mall_info;

public interface Myrepository extends JpaRepository<Mall_info, Integer> {
	

}
