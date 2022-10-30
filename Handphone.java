package telephone;

public class HandPhone extends Telephone {
	
	protected String name;
	
	public HandPhone(String phonenumber, String name) {
		super(phonenumber);
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public void massage() {
		System.out.printf("%s Phone is ready to massage", name);

	}

	@Override
	public void whatsapp() {
		System.out.printf("%s Phone is not satisfied to using whatsapp", name);

	}
}