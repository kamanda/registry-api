package com.vakpom.apps.entity;
/**
 * @author Pete
 *
 */
@Entity
@Table(name= "address")
public class Address {
	
	@org.springframework.data.annotation.Id
    @Column(name = "Id")
    public String Id;

}
