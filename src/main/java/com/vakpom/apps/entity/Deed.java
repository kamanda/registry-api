package com.vakpom.apps.entity;
/**
 * @author Pete
 *
 */
@Entity
@Table(name= "deed")
public class Deed {
	
	@org.springframework.data.annotation.Id
    @Column(name = "Id")
    public String Id;

}
