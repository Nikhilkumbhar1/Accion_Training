package com.accion.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "PERSON_DETAILS")
public class Person {

	 @Id
	 @GeneratedValue
	 private Integer pId;

	 @Column(length=20)
	 private String pName;

	 @Column(length=20)
	 private String pAddrs;

	 @OneToMany(targetEntity=PhoneNumber.class,cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	 @JoinColumn(name="PERSON_ID",referencedColumnName="PID")
	 private Set<PhoneNumber> phonesInfo;

	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpAddrs() {
		return pAddrs;
	}

	public void setpAddrs(String pAddrs) {
		this.pAddrs = pAddrs;
	}

	public Set<PhoneNumber> getPhonesInfo() {
		return phonesInfo;
	}

	public void setPhonesInfo(Set<PhoneNumber> phonesInfo) {
		this.phonesInfo = phonesInfo;
	}

	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + ", pAddrs=" + pAddrs + "]";
	}


}
