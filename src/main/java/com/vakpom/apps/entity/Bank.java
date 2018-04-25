package com.vakpom.apps.entity;
/**
 * 
 */

/**
 * @author Pete
 *
 */

@Entity
@Table(name= "bank")
public class Bank {
	
	@org.springframework.data.annotation.Id
    @Column(name = "Id")
    public String Id;

}
