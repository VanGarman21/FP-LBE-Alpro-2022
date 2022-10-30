public class iPhone extends Handphone {
	
	private String series_name;
	
	public iPhone(String phonenumber, String name, String series_name) {
		super(phonenumber, name);
		this.series_name = series_name;
	}

	public String getseries_name() {
		return series_name;
	}

	public void setseries_name(String series_name) {
		this.series_name = series_name;
	}
	
	@Override
	public void call() {
		System.out.printf("Calling %s (%s) from %s%n", phonenumber, name, series_name);
	}


	@Override
	public void end() {
		System.out.printf("End call %s (%s) from %s%n", phonenumber, name, series_name);
	}

    @Override
	public void massage() {
		System.out.printf("Massage from %s", phonenumber);

	}
}