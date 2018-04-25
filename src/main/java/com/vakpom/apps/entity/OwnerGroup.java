package com.vakpom.apps.entity;
/**
 * 
 */

/**
 * @author Pete
 *
 */
@Entity
@Table(name= "ownerGroup")
public class OwnerGroup {
	
	@org.springframework.data.annotation.Id
    @Column(name = "Id")
    public String Id;

}
