package com.vakpom.apps.entity;


/**
 * 
 */

/**
 * @author Pete
 *
 */

@Entity
@Table(name= "acctInfo")
public class AcctInfo {
	
	@org.springframework.data.annotation.Id
    @Column(name = "Id")
    public String Id;

}
