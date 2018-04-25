package com.vakpom.apps.entity;
/**
 * @author Pete
 *
 */
@Entity
@Table(name= "lien")
public class Lien {
	
	@org.springframework.data.annotation.Id
    @Column(name = "Id")
    public String Id;

}
