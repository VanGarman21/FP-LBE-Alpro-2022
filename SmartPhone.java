public class SmartPhone extends Telephone {
    
    private String serial;
	
	public SmartPhone(String phonenumber, String serial) {
		super(phonenumber);
		this.serial = serial;
	}
	

	public String getserial() {
		return serial;
	}


	public void setserial(String serial) {
		this.serial = serial;
	}


	@Override
	public void call() {
		System.out.printf("Calling %s through Phone %s%n", phonenumber, serial);

	}

	@Override
	public void end() {
		System.out.printf("End call %s through Phone %s%n", phonenumber, serial);

	}

    @Override
	public void massage() {
		System.out.printf("Massage from %s", phonenumber);

	}
}
