package HandPhone;

import telephone.HandPhone;

public class Nokia extends HandPhone {
	
	private String series_name;
	
	public Nokia(String phonenumber, String name, String series_name) {
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
	public void massage() {
		System.out.printf("Massage %s from %s's phone%n", phonenumber, name);

	}

	@Override
	public void whatsapp() {
		System.out.printf("%s Phone is not satisfied to using whatsapp", name);

	}

}