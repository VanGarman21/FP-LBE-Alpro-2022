package Smartphone;

import telephone.Smartphone;

public class Android_Phone extends Smartphone {
	
	private String brand, series;
	
	public Android_Phone(String phonenumber, String name, String brand) {
		super(phonenumber, name);
		this.brand = brand;
		this.series = null;
	}


	public Android_Phone(String phonenumber, String name, String brand, String series) {
		this(phonenumber, name, brand);
		this.series = series;
	}
	
	

	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getSeries() {
		return series;
	}


	public void setSeries(String series) {
		this.series = series;
	}


	@Override
	public void massage() {
		System.out.printf("Massage %s from %s's phone%n", phonenumber, name);

	}

	@Override
	public void whatsapp() {
		System.out.printf("whatsapp %s from %s's phone%n", phonenumber, name);

	}


	
}