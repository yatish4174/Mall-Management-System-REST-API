package mall.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="mall")
@Data
public class Mall_info {

	 @Id
	  @GeneratedValue(strategy = GenerationType.SEQUENCE)
	    private Integer id;
	    private String name;
	    private String location;
	    private Integer totalfloors;
	    private Integer TotalShops;
	    private String  contactNo;
	    private  String openingTime;
	    private String closingTime;
	    
}
