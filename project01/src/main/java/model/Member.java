package model;

import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Getter 
@Setter 
@Entity@Table(name = "MemberInfo")
public class Member {
    
	@Id @Column(name = "memberId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer memberid;
	
	@Column(name = "memberAcct")
	private String memberacct;
	
	@Column(name = "memberName")
	private String membername;
	
	@Column(name = "memberPwd")
	private String pwd;
	
	@Column(name = "email")
	private String email;
	
	public Member(Integer memberid, String memberacct, String membername, String pwd, String email) {
		this.memberid = memberid;
		this.memberacct = memberacct;
		this.membername = membername;
		this.email = email;
	}
	
}
