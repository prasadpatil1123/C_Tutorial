package com.management.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "event_cutlery_item")
public class EventCutleryItem {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "event_cutlery_item_id")
    private Long eventCutleryItemId;

    @Column(name = "cutlery_id")
    private Long cutleryId;

    @Column(name = "event_id")
    private Long eventId;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "rate")
    private Float rate;

    @Column(name = "amount")
    private Float amount;

    @Column(name = "missing_quantity")
    private Integer missingQuantity;

    @Column(name = "missing_rate")
    private Float missingRate;

    @Column(name = "missing_amount")
    private Float missingAmount;

	public EventCutleryItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EventCutleryItem(Long eventCutleryItemId, Long cutleryId, Long eventId, Integer quantity, Float rate,
			Float amount, Integer missingQuantity, Float missingRate, Float missingAmount) {
		super();
		this.eventCutleryItemId = eventCutleryItemId;
		this.cutleryId = cutleryId;
		this.eventId = eventId;
		this.quantity = quantity;
		this.rate = rate;
		this.amount = amount;
		this.missingQuantity = missingQuantity;
		this.missingRate = missingRate;
		this.missingAmount = missingAmount;
	}

	/**
	 * @return the eventCutleryItemId
	 */
	public Long getEventCutleryItemId() {
		return eventCutleryItemId;
	}

	/**
	 * @param eventCutleryItemId the eventCutleryItemId to set
	 */
	public void setEventCutleryItemId(Long eventCutleryItemId) {
		this.eventCutleryItemId = eventCutleryItemId;
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
	 * @return the quantity
	 */
	public Integer getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the rate
	 */
	public Float getRate() {
		return rate;
	}

	/**
	 * @param rate the rate to set
	 */
	public void setRate(Float rate) {
		this.rate = rate;
	}

	/**
	 * @return the amount
	 */
	public Float getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Float amount) {
		this.amount = amount;
	}

	/**
	 * @return the missingQuantity
	 */
	public Integer getMissingQuantity() {
		return missingQuantity;
	}

	/**
	 * @param missingQuantity the missingQuantity to set
	 */
	public void setMissingQuantity(Integer missingQuantity) {
		this.missingQuantity = missingQuantity;
	}

	/**
	 * @return the missingRate
	 */
	public Float getMissingRate() {
		return missingRate;
	}

	/**
	 * @param missingRate the missingRate to set
	 */
	public void setMissingRate(Float missingRate) {
		this.missingRate = missingRate;
	}

	/**
	 * @return the missingAmount
	 */
	public Float getMissingAmount() {
		return missingAmount;
	}

	/**
	 * @param missingAmount the missingAmount to set
	 */
	public void setMissingAmount(Float missingAmount) {
		this.missingAmount = missingAmount;
	}

	@Override
	public String toString() {
		return "EventCutleryItem [eventCutleryItemId=" + eventCutleryItemId + ", cutleryId=" + cutleryId + ", eventId="
				+ eventId + ", quantity=" + quantity + ", rate=" + rate + ", amount=" + amount + ", missingQuantity="
				+ missingQuantity + ", missingRate=" + missingRate + ", missingAmount=" + missingAmount
				+ ", getEventCutleryItemId()=" + getEventCutleryItemId() + ", getCutleryId()=" + getCutleryId()
				+ ", getEventId()=" + getEventId() + ", getQuantity()=" + getQuantity() + ", getRate()=" + getRate()
				+ ", getAmount()=" + getAmount() + ", getMissingQuantity()=" + getMissingQuantity()
				+ ", getMissingRate()=" + getMissingRate() + ", getMissingAmount()=" + getMissingAmount()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

    
    
    
    
}
