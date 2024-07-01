package model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Seat {

	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="seatId")
	private Integer seatid;
	
	  @ManyToOne
	  @JoinColumn(name = "memberId")
	  private Member member;
	  
	  @Column(name = "seatNumber")
	  private String seatnumber;
	  
	  
	  
}
