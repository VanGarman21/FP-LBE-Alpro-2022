public abstract class Telephone {
	protected String phonenumber;
	
	public Telephone(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public abstract void call();
	public abstract void end();
	public abstract void massage();
}