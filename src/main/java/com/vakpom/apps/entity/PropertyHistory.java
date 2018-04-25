package com.vakpom.apps.entity;
/**
 * @author Pete
 *
 */
@Entity
@Table(name= "propertyHistory")
public class PropertyHistory {
	
	@org.springframework.data.annotation.Id
    @Column(name = "Id")
    public String Id;

}
