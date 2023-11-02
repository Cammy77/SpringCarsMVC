package dmacc.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 * Cameron Mockobee - cmockobee1@dmacc.edu
 * CIS175 - Fall 2023
 * Nov 2, 2023
 */

@Entity
public class Cars {
	@Id
	@GeneratedValue
	private long id;
	private int year;
	private String make;
	private String model;
	
	public Cars() {
		super();
	}

	public Cars(String make, String model) {
		super();
		this.make = make;
		this.model = model;
	}

	public Cars(int year, String make, String model) {
		super();
		this.year = year;
		this.make = make;
		this.model = model;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", year=" + year + ", make=" + make + ", model=" + model + "]";
	}
}
