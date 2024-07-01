package model;


import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

public class Concert {
	 
	
	@Id
	@Column(name = "cocertId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer concertid;
	
	@Column(name = "concertName")
	private String concertname;
    
	@Column(name = "date")
	private String date;
    
	@Column(name = "location")
	private String location;
	
    @OneToMany(mappedBy = "concert")
    private List<Ticket> tickets;
}
