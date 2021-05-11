package org.mycompany.models;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="customer_id")
public class CustomerID {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int cid;
	
	@Column(name="id")
	protected BigInteger id;
	
	@Column(name="type")
    protected String type;
    
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
    
    
}
