package com.management.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "event_photos")
public class EventPhotos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "photo_id")
    private Long photoId;

    @Column(name = "event_id")
    private Long eventId;

    @Column(name = "photo_path", length = 300)
    private String photoPath;

    @Column(name = "file_temp", length = 350)
    private String fileTemp;

	public EventPhotos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EventPhotos(Long photoId, Long eventId, String photoPath, String fileTemp) {
		super();
		this.photoId = photoId;
		this.eventId = eventId;
		this.photoPath = photoPath;
		this.fileTemp = fileTemp;
	}

	/**
	 * @return the photoId
	 */
	public Long getPhotoId() {
		return photoId;
	}

	/**
	 * @param photoId the photoId to set
	 */
	public void setPhotoId(Long photoId) {
		this.photoId = photoId;
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
	 * @return the photoPath
	 */
	public String getPhotoPath() {
		return photoPath;
	}

	/**
	 * @param photoPath the photoPath to set
	 */
	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}

	/**
	 * @return the fileTemp
	 */
	public String getFileTemp() {
		return fileTemp;
	}

	/**
	 * @param fileTemp the fileTemp to set
	 */
	public void setFileTemp(String fileTemp) {
		this.fileTemp = fileTemp;
	}

	@Override
	public String toString() {
		return "EventPhotos [photoId=" + photoId + ", eventId=" + eventId + ", photoPath=" + photoPath + ", fileTemp="
				+ fileTemp + ", getPhotoId()=" + getPhotoId() + ", getEventId()=" + getEventId() + ", getPhotoPath()="
				+ getPhotoPath() + ", getFileTemp()=" + getFileTemp() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

    




}