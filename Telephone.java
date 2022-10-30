public abstract class Telephone {
	protected String phonenumber;
	
	public Telephone(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public abstract void massage();
	public abstract void whatsapp();
}