package com.vakpom.apps.entity;

import org.springframework.data.annotation.Id;

import javax.persistence.*;

import java.math.BigInteger;
import java.time.LocalDate;

/**
 * Created by SanKp on 3/25/2018.
 */
@Entity
@Table(name= "property_detail")
public class PropertyDetail  {
    @org.springframework.data.annotation.Id
    @Column(name = "Id")
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
