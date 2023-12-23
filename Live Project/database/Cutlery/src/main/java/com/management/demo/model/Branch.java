package com.management.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "branch")
public class Branch {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "branch_id")
    private Long branchId;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "taluka")
    private String taluka;

    @Column(name = "district")
    private String district;

    @Column(name = "contact_person_name")
    private String contactPersonName;

    @Column(name = "contact_person_phone_no")
    private String contactPersonPhoneNo;

    @Column(name = "contact_person_email")
    private String contactPersonEmail;

    @Column(name = "password")
    private String password;

	public Branch() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Branch(Long branchId, String name, String address, String taluka, String district, String contactPersonName,
			String contactPersonPhoneNo, String contactPersonEmail, String password) {
		super();
		this.branchId = branchId;
		this.name = name;
		this.address = address;
		this.taluka = taluka;
		this.district = district;
		this.contactPersonName = contactPersonName;
		this.contactPersonPhoneNo = contactPersonPhoneNo;
		this.contactPersonEmail = contactPersonEmail;
		this.password = password;
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
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the taluka
	 */
	public String getTaluka() {
		return taluka;
	}

	/**
	 * @param taluka the taluka to set
	 */
	public void setTaluka(String taluka) {
		this.taluka = taluka;
	}

	/**
	 * @return the district
	 */
	public String getDistrict() {
		return district;
	}

	/**
	 * @param district the district to set
	 */
	public void setDistrict(String district) {
		this.district = district;
	}

	/**
	 * @return the contactPersonName
	 */
	public String getContactPersonName() {
		return contactPersonName;
	}

	/**
	 * @param contactPersonName the contactPersonName to set
	 */
	public void setContactPersonName(String contactPersonName) {
		this.contactPersonName = contactPersonName;
	}

	/**
	 * @return the contactPersonPhoneNo
	 */
	public String getContactPersonPhoneNo() {
		return contactPersonPhoneNo;
	}

	/**
	 * @param contactPersonPhoneNo the contactPersonPhoneNo to set
	 */
	public void setContactPersonPhoneNo(String contactPersonPhoneNo) {
		this.contactPersonPhoneNo = contactPersonPhoneNo;
	}

	/**
	 * @return the contactPersonEmail
	 */
	public String getContactPersonEmail() {
		return contactPersonEmail;
	}

	/**
	 * @param contactPersonEmail the contactPersonEmail to set
	 */
	public void setContactPersonEmail(String contactPersonEmail) {
		this.contactPersonEmail = contactPersonEmail;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Branch [branchId=" + branchId + ", name=" + name + ", address=" + address + ", taluka=" + taluka
				+ ", district=" + district + ", contactPersonName=" + contactPersonName + ", contactPersonPhoneNo="
				+ contactPersonPhoneNo + ", contactPersonEmail=" + contactPersonEmail + ", password=" + password
				+ ", getBranchId()=" + getBranchId() + ", getName()=" + getName() + ", getAddress()=" + getAddress()
				+ ", getTaluka()=" + getTaluka() + ", getDistrict()=" + getDistrict() + ", getContactPersonName()="
				+ getContactPersonName() + ", getContactPersonPhoneNo()=" + getContactPersonPhoneNo()
				+ ", getContactPersonEmail()=" + getContactPersonEmail() + ", getPassword()=" + getPassword()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
    
    
    
    

}
