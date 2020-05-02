package com.course.practicaljava.rest.domain;

public class Car {

	private String brand;
	private String color;
	private String type;

	public Car(String brand, String color, String type) {
		super();
		this.brand = brand;
		this.color = color;
		this.type = type;
	}

	public String getBrand() {
		return brand;
	}

	public String getColor() {
		return color;
	}

	public String getType() {
		return type;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", color=" + color + ", type=" + type + "]";
	}

}
