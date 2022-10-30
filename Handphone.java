public class Handphone extends Telephone {
	
	protected String name;
	
	public Handphone(String phonenumber, String name) {
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
	public void call() {
		System.out.printf("Calling %s from %s's phone%n", phonenumber, name);

	}

	@Override
	public void end() {
		System.out.printf("End call %s from %s's phone%n", phonenumber, name);

	}

    @Override
	public void massage() {
		System.out.printf("Massage from %s", phonenumber);

	}

}