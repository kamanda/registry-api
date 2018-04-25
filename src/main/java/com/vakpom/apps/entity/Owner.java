package com.vakpom.apps.entity;
/**
 * @author Pete
 *
 */
@Entity
@Table(name= "owner")
public class Owner {
	
	@org.springframework.data.annotation.Id
    @Column(name = "Id")
    public String Id;

}
