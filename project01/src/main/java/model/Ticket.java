package model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "Ticket")
public class Ticket {
	
	@ManyToOne(cascade = CascadeType.ALL,targetEntity = Concert.class, fetch = FetchType.EAGER)
	@JoinColumn(name = "concertid", referencedColumnName = "concertid")
	private Concert concert;
	
	@Id
	@Column(name = "ticketId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ticketid;
	
	@Column(name = "price")
	private Double price;
	
	@Column(name = "ticketType")
	private String tickettype;

	 @ManyToOne
	 @JoinColumn(name = "seatId")
	 private Seat seat;
	
	
	@Column(name = "status")
	private Status status;
    
	@Column(name = "remainingTicket")
	private Integer remainingticket;

	
}
