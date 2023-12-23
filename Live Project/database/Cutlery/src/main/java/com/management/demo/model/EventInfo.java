package com.management.demo.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "event_info")
public class EventInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "event_id")
    private Long eventId;

    @Column(name = "branch_id")
    private Long branchId;

    @Column(name = "status", length = 50)
    private String status;

    @Column(name = "customer_id")
    private Long customerId;

    @Column(name = "booking_date")
    private Date bookingDate;

    @Column(name = "event_date")
    private Date eventDate;

    @Column(name = "event_type", length = 50)
    private String eventType;

    @Column(name = "event_location", length = 255)
    private String eventLocation;

    @Column(name = "planned_pick_date")
    private Date plannedPickDate;

    @Column(name = "planned_return_date")
    private Date plannedReturnDate;

    @Column(name = "approved_date")
    private Date approvedDate;

    @Column(name = "approved_by", length = 50)
    private String approvedBy;

    @Column(name = "booking_amount_paid")
    private Float bookingAmountPaid;

    @Column(name = "total_amount")
    private Float totalAmount;

    @Column(name = "total_amount_paid")
    private Float totalAmountPaid;

    @Column(name = "remark", length = 50)
    private String remark;

    @Column(name = "actual_pickup_date")
    private Date actualPickupDate;

    @Column(name = "actual_return_date")
    private Date actualReturnDate;

    @Column(name = "missing_item_charge_amount")
    private Float missingItemChargeAmount;

    @Column(name = "late_return_charges")
    private Float lateReturnCharges;

	public EventInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EventInfo(Long eventId, Long branchId, String status, Long customerId, Date bookingDate, Date eventDate,
			String eventType, String eventLocation, Date plannedPickDate, Date plannedReturnDate, Date approvedDate,
			String approvedBy, Float bookingAmountPaid, Float totalAmount, Float totalAmountPaid, String remark,
			Date actualPickupDate, Date actualReturnDate, Float missingItemChargeAmount, Float lateReturnCharges) {
		super();
		this.eventId = eventId;
		this.branchId = branchId;
		this.status = status;
		this.customerId = customerId;
		this.bookingDate = bookingDate;
		this.eventDate = eventDate;
		this.eventType = eventType;
		this.eventLocation = eventLocation;
		this.plannedPickDate = plannedPickDate;
		this.plannedReturnDate = plannedReturnDate;
		this.approvedDate = approvedDate;
		this.approvedBy = approvedBy;
		this.bookingAmountPaid = bookingAmountPaid;
		this.totalAmount = totalAmount;
		this.totalAmountPaid = totalAmountPaid;
		this.remark = remark;
		this.actualPickupDate = actualPickupDate;
		this.actualReturnDate = actualReturnDate;
		this.missingItemChargeAmount = missingItemChargeAmount;
		this.lateReturnCharges = lateReturnCharges;
	}

	/**
	 * @return the eventId
	 */
	public Long getEventId() {
		return eventId;
	}

	/**
	 * @param eventId the eventId to set
	 */
	public void setEventId(Long eventId) {
		this.eventId = eventId;
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
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
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
	 * @return the bookingDate
	 */
	public Date getBookingDate() {
		return bookingDate;
	}

	/**
	 * @param bookingDate the bookingDate to set
	 */
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	/**
	 * @return the eventDate
	 */
	public Date getEventDate() {
		return eventDate;
	}

	/**
	 * @param eventDate the eventDate to set
	 */
	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}

	/**
	 * @return the eventType
	 */
	public String getEventType() {
		return eventType;
	}

	/**
	 * @param eventType the eventType to set
	 */
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	/**
	 * @return the eventLocation
	 */
	public String getEventLocation() {
		return eventLocation;
	}

	/**
	 * @param eventLocation the eventLocation to set
	 */
	public void setEventLocation(String eventLocation) {
		this.eventLocation = eventLocation;
	}

	/**
	 * @return the plannedPickDate
	 */
	public Date getPlannedPickDate() {
		return plannedPickDate;
	}

	/**
	 * @param plannedPickDate the plannedPickDate to set
	 */
	public void setPlannedPickDate(Date plannedPickDate) {
		this.plannedPickDate = plannedPickDate;
	}

	/**
	 * @return the plannedReturnDate
	 */
	public Date getPlannedReturnDate() {
		return plannedReturnDate;
	}

	/**
	 * @param plannedReturnDate the plannedReturnDate to set
	 */
	public void setPlannedReturnDate(Date plannedReturnDate) {
		this.plannedReturnDate = plannedReturnDate;
	}

	/**
	 * @return the approvedDate
	 */
	public Date getApprovedDate() {
		return approvedDate;
	}

	/**
	 * @param approvedDate the approvedDate to set
	 */
	public void setApprovedDate(Date approvedDate) {
		this.approvedDate = approvedDate;
	}

	/**
	 * @return the approvedBy
	 */
	public String getApprovedBy() {
		return approvedBy;
	}

	/**
	 * @param approvedBy the approvedBy to set
	 */
	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}

	/**
	 * @return the bookingAmountPaid
	 */
	public Float getBookingAmountPaid() {
		return bookingAmountPaid;
	}

	/**
	 * @param bookingAmountPaid the bookingAmountPaid to set
	 */
	public void setBookingAmountPaid(Float bookingAmountPaid) {
		this.bookingAmountPaid = bookingAmountPaid;
	}

	/**
	 * @return the totalAmount
	 */
	public Float getTotalAmount() {
		return totalAmount;
	}

	/**
	 * @param totalAmount the totalAmount to set
	 */
	public void setTotalAmount(Float totalAmount) {
		this.totalAmount = totalAmount;
	}

	/**
	 * @return the totalAmountPaid
	 */
	public Float getTotalAmountPaid() {
		return totalAmountPaid;
	}

	/**
	 * @param totalAmountPaid the totalAmountPaid to set
	 */
	public void setTotalAmountPaid(Float totalAmountPaid) {
		this.totalAmountPaid = totalAmountPaid;
	}

	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * @return the actualPickupDate
	 */
	public Date getActualPickupDate() {
		return actualPickupDate;
	}

	/**
	 * @param actualPickupDate the actualPickupDate to set
	 */
	public void setActualPickupDate(Date actualPickupDate) {
		this.actualPickupDate = actualPickupDate;
	}

	/**
	 * @return the actualReturnDate
	 */
	public Date getActualReturnDate() {
		return actualReturnDate;
	}

	/**
	 * @param actualReturnDate the actualReturnDate to set
	 */
	public void setActualReturnDate(Date actualReturnDate) {
		this.actualReturnDate = actualReturnDate;
	}

	/**
	 * @return the missingItemChargeAmount
	 */
	public Float getMissingItemChargeAmount() {
		return missingItemChargeAmount;
	}

	/**
	 * @param missingItemChargeAmount the missingItemChargeAmount to set
	 */
	public void setMissingItemChargeAmount(Float missingItemChargeAmount) {
		this.missingItemChargeAmount = missingItemChargeAmount;
	}

	/**
	 * @return the lateReturnCharges
	 */
	public Float getLateReturnCharges() {
		return lateReturnCharges;
	}

	/**
	 * @param lateReturnCharges the lateReturnCharges to set
	 */
	public void setLateReturnCharges(Float lateReturnCharges) {
		this.lateReturnCharges = lateReturnCharges;
	}

	@Override
	public String toString() {
		return "EventInfo [eventId=" + eventId + ", branchId=" + branchId + ", status=" + status + ", customerId="
				+ customerId + ", bookingDate=" + bookingDate + ", eventDate=" + eventDate + ", eventType=" + eventType
				+ ", eventLocation=" + eventLocation + ", plannedPickDate=" + plannedPickDate + ", plannedReturnDate="
				+ plannedReturnDate + ", approvedDate=" + approvedDate + ", approvedBy=" + approvedBy
				+ ", bookingAmountPaid=" + bookingAmountPaid + ", totalAmount=" + totalAmount + ", totalAmountPaid="
				+ totalAmountPaid + ", remark=" + remark + ", actualPickupDate=" + actualPickupDate
				+ ", actualReturnDate=" + actualReturnDate + ", missingItemChargeAmount=" + missingItemChargeAmount
				+ ", lateReturnCharges=" + lateReturnCharges + ", getEventId()=" + getEventId() + ", getBranchId()="
				+ getBranchId() + ", getStatus()=" + getStatus() + ", getCustomerId()=" + getCustomerId()
				+ ", getBookingDate()=" + getBookingDate() + ", getEventDate()=" + getEventDate() + ", getEventType()="
				+ getEventType() + ", getEventLocation()=" + getEventLocation() + ", getPlannedPickDate()="
				+ getPlannedPickDate() + ", getPlannedReturnDate()=" + getPlannedReturnDate() + ", getApprovedDate()="
				+ getApprovedDate() + ", getApprovedBy()=" + getApprovedBy() + ", getBookingAmountPaid()="
				+ getBookingAmountPaid() + ", getTotalAmount()=" + getTotalAmount() + ", getTotalAmountPaid()="
				+ getTotalAmountPaid() + ", getRemark()=" + getRemark() + ", getActualPickupDate()="
				+ getActualPickupDate() + ", getActualReturnDate()=" + getActualReturnDate()
				+ ", getMissingItemChargeAmount()=" + getMissingItemChargeAmount() + ", getLateReturnCharges()="
				+ getLateReturnCharges() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

    
    
    
    

}
