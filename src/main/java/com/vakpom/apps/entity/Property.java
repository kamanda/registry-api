package com.vakpom.apps.entity;

/**
 * 
 */

/**
 * @author Pete
 *
 */

@Entity
@Table(name= "property")
public class Property {
	
	@org.springframework.data.annotation.Id
    @Column(name = "Id")
    public String Id;

    @Column(name = "description")
    public String description;
	
    @Column(name = "size")
    public BigInteger size;
    
    @Column(name = "latitude")
    public BigInteger latitude;
    
    @Column(name = "longitude")
    public BigInteger longitude;
    
    @Column(name = "length")
    public BigInteger length;
    
    @Column(name = "width")
    public BigInteger width;
    
    @Column(name = "Address")
    public BigInteger address;
    
	

}
