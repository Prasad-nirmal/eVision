package com.app.pojo;


import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;


@Entity

@Table(name="data")
public class Data {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int imageId;
	
	@Lob
	@Column(name = "cImage")
	private byte [] cImage;
	
	@Lob
	@Column (name = "pImage")
	private byte [] pImage;
	
	@CreationTimestamp
	private Timestamp createdDate;
	@Column(name = "result")
	private String result;
	 
	public int getImageId() {
		return imageId;
	}
	
	public byte[] getcImage() {
		return cImage;
	}
	public void setcImage(byte[] cImage) {
		this.cImage = cImage;
	}
	public byte[] getpImage() {
		return pImage;
	}
	public void setpImage(byte[] pImage) {
		this.pImage = pImage;
	}
	public Timestamp getcreatedDate() {
		return createdDate;
	}
	
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public Data() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Data(byte[] cImage, byte[] pImage, Timestamp createdDate, String result) {
		super();
		this.cImage = cImage;
		this.pImage = pImage;
		this.createdDate = createdDate;
		this.result = result;
	}
	@Override
	public String toString() {
		return "Data [imageId=" + imageId + ", cImage=" + Arrays.toString(cImage) + ", pImage="
				+ Arrays.toString(pImage) + ", createdDate=" + createdDate + ", result=" + result + "]";
	}
	
	
	 
	 
}
