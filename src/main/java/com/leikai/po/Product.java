package com.leikai.po;

// default package
// Generated Oct 19, 2013 5:02:47 PM by Hibernate Tools 3.4.0.CR1

/**
 * Product generated by hbm2java
 */
public class Product implements java.io.Serializable {

	private Integer id;
	private String name;
	private Integer ptTypeId;
	private Integer ptSizeId;
	private Integer ptColorId;
	private Integer ptNumber;

	public Product() {
	}

	public Product(String name, Integer ptTypeId, Integer ptSizeId,
			Integer ptColorId, Integer ptNumber) {
		this.name = name;
		this.ptTypeId = ptTypeId;
		this.ptSizeId = ptSizeId;
		this.ptColorId = ptColorId;
		this.ptNumber = ptNumber;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPtTypeId() {
		return this.ptTypeId;
	}

	public void setPtTypeId(Integer ptTypeId) {
		this.ptTypeId = ptTypeId;
	}

	public Integer getPtSizeId() {
		return this.ptSizeId;
	}

	public void setPtSizeId(Integer ptSizeId) {
		this.ptSizeId = ptSizeId;
	}

	public Integer getPtColorId() {
		return this.ptColorId;
	}

	public void setPtColorId(Integer ptColorId) {
		this.ptColorId = ptColorId;
	}

	public Integer getPtNumber() {
		return this.ptNumber;
	}

	public void setPtNumber(Integer ptNumber) {
		this.ptNumber = ptNumber;
	}

	public String toString() {
		return this.getId() + ":" + this.getName() + ":" + this.getPtNumber();
	}

}
