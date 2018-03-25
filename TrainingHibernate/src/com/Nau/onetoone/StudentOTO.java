package com.Nau.onetoone;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class StudentOTO {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String s_name;
	@ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@PrimaryKeyJoinColumn
	private Collection<AddressOTO> address;
	
	public void setAddress(Collection<AddressOTO> address) {
		this.address = address;
	}
	public StudentOTO() {
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	/*public AddressOTO getAddress() {
		return address;
	}
	public void setAddress(AddressOTO address) {
		this.address = address;
	}*/
	
	

}
