package com.management.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cutlery_details")
public class CutleryDetails {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cutlery_id")
    private Long cutleryId;

    @Column(name = "initial_quantity")
    private Integer initialQuantity;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "branch_id")
    private Long branchId;

    @Column(name = "available_quantity")
    private Integer availableQuantity;

    @Column(name = "rent_per_item")
    private Float rentPerItem;

    @Column(name = "missing_charges")
    private Float missingCharges;

	public CutleryDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CutleryDetails(Long cutleryId, Integer initialQuantity, String name, Long branchId,
			Integer availableQuantity, Float rentPerItem, Float missingCharges) {
		super();
		this.cutleryId = cutleryId;
		this.initialQuantity = initialQuantity;
		this.name = name;
		this.branchId = branchId;
		this.availableQuantity = availableQuantity;
		this.rentPerItem = rentPerItem;
		this.missingCharges = missingCharges;
	}

	/**
	 * @return the cutleryId
	 */
	public Long getCutleryId() {
		return cutleryId;
	}

	/**
	 * @param cutleryId the cutleryId to set
	 */
	public void setCutleryId(Long cutleryId) {
		this.cutleryId = cutleryId;
	}

	/**
	 * @return the initialQuantity
	 */
	public Integer getInitialQuantity() {
		return initialQuantity;
	}

	/**
	 * @param initialQuantity the initialQuantity to set
	 */
	public void setInitialQuantity(Integer initialQuantity) {
		this.initialQuantity = initialQuantity;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the branchId
	 */
	public Long getBranchId() {
		return branchId;
	}

	/**
	 * @param branchId the branchId to set
	 */
	public void setBranchId(Long branchId) {
		this.branchId = branchId;
	}

	/**
	 * @return the availableQuantity
	 */
	public Integer getAvailableQuantity() {
		return availableQuantity;
	}

	/**
	 * @param availableQuantity the availableQuantity to set
	 */
	public void setAvailableQuantity(Integer availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	/**
	 * @return the rentPerItem
	 */
	public Float getRentPerItem() {
		return rentPerItem;
	}

	/**
	 * @param rentPerItem the rentPerItem to set
	 */
	public void setRentPerItem(Float rentPerItem) {
		this.rentPerItem = rentPerItem;
	}

	/**
	 * @return the missingCharges
	 */
	public Float getMissingCharges() {
		return missingCharges;
	}

	/**
	 * @param missingCharges the missingCharges to set
	 */
	public void setMissingCharges(Float missingCharges) {
		this.missingCharges = missingCharges;
	}

	@Override
	public String toString() {
		return "CutleryDetails [cutleryId=" + cutleryId + ", initialQuantity=" + initialQuantity + ", name=" + name
				+ ", branchId=" + branchId + ", availableQuantity=" + availableQuantity + ", rentPerItem=" + rentPerItem
				+ ", missingCharges=" + missingCharges + ", getCutleryId()=" + getCutleryId()
				+ ", getInitialQuantity()=" + getInitialQuantity() + ", getName()=" + getName() + ", getBranchId()="
				+ getBranchId() + ", getAvailableQuantity()=" + getAvailableQuantity() + ", getRentPerItem()="
				+ getRentPerItem() + ", getMissingCharges()=" + getMissingCharges() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

    
    
    
}

