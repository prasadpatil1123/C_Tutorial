package com.management.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer_info")
public class CustomerInfo {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "customer_id")
	    private Long customerId;

	    @ManyToOne
	    @JoinColumn(name = "branch_id")
	    private Branch branch;

	    @Column(name = "customer_name", length = 50)
	    private String customerName;

	    @Column(name = "customer_mobile", length = 50)
	    private String customerMobile;

	    @Column(name = "customer_address", length = 255)
	    private String customerAddress;

	    @Column(name = "password", length = 25)
	    private String password;

		public CustomerInfo() {
			super();
			// TODO Auto-generated constructor stub
		}

		public CustomerInfo(Long customerId, Branch branch, String customerName,
				String customerMobile, String customerAddress, String password) {
			super();
			this.customerId = customerId;
			this.branch = branch;
			this.customerName = customerName;
			this.customerMobile = customerMobile;
			this.customerAddress = customerAddress;
			this.password = password;
		}

		/**
		 * @return the customerId
		 */
		public Long getCustomerId() {
			return customerId;
		}

		/**
		 * @param customerId the customerId to set
		 */
		public void setCustomerId(Long customerId) {
			this.customerId = customerId;
		}

		/**
		 * @return the branch
		 */
		public Branch getBranch() {
			return branch;
		}

		/**
		 * @param branch the branch to set
		 */
		public void setBranch(Branch branch) {
			this.branch = branch;
		}

		/**
		 * @return the customerName
		 */
		public String getCustomerName() {
			return customerName;
		}

		/**
		 * @param customerName the customerName to set
		 */
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}

		/**
		 * @return the customerMobile
		 */
		public String getCustomerMobile() {
			return customerMobile;
		}

		/**
		 * @param customerMobile the customerMobile to set
		 */
		public void setCustomerMobile(String customerMobile) {
			this.customerMobile = customerMobile;
		}

		/**
		 * @return the customerAddress
		 */
		public String getCustomerAddress() {
			return customerAddress;
		}

		/**
		 * @param customerAddress the customerAddress to set
		 */
		public void setCustomerAddress(String customerAddress) {
			this.customerAddress = customerAddress;
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
			return "CustomerInfo [customerId=" + customerId + ", branch=" + branch + ", customerName=" + customerName
					+ ", customerMobile=" + customerMobile + ", customerAddress=" + customerAddress + ", password="
					+ password + ", getCustomerId()=" + getCustomerId() + ", getBranch()=" + getBranch()
					+ ", getCustomerName()=" + getCustomerName() + ", getCustomerMobile()=" + getCustomerMobile()
					+ ", getCustomerAddress()=" + getCustomerAddress() + ", getPassword()=" + getPassword()
					+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
					+ "]";
		}
	    
	    

}
