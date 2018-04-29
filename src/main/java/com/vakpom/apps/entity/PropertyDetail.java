package com.vakpom.apps.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigInteger;
import java.time.LocalDate;

/**
 * Created by SanKp on 3/25/2018.
 */
@Entity
@Table(name= "property_detail")
public class PropertyDetail  {

    @javax.persistence.Id
    @Column(name = "id")
    public String Id;

    @Column(name = "description")
    public String description;

    @Column(name = "buyerAddress")
    public String buyerAddress;

    @Column(name = "price")
    public BigInteger price;

    @Column(name = "sellerAddress")
    public String sellerAddress;

    @Column(name = "propertyAddress")
    public String propertyAddress;

    @Column(name = "brokerAddress")
    public String brokerAddress;

    @Column(name = "contractAddress")
    public String contractAddress;

    @Column(name = "createdOn")
    public LocalDate createdOn;

    @Column(name = "confirmPrice")
    public BigInteger confirmPrice;

    @Column(name = "confirmBuyer")
    public String confirmBuyer;



}
