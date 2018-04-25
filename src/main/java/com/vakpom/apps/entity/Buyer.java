package com.vakpom.apps.entity;
/**
 * 
 */

/**
 * @author Pete
 *
 */
@Entity
@Table(name= "buyer")
public class Buyer {
	
	@org.springframework.data.annotation.Id
    @Column(name = "Id")
    public String Id;

}
