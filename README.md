# FP LBE Alpro 2022

- Fork repositori ini
- Ubah isi repository ini sehingga dapat diperlihatkan konsep:
  - *inheritance*
  - enkapsulasi
  - abstraksi
  - *polymorphism*
- Perlihatkan implementasi konsep diatas pada README ini.
- Gunakan nama *class* yang sudah ada sebagai tema dari project ini.

Catatan: Program tidak harus dapat dijalankan, cukup ditunjukkan implementasi konsepnya saja.
# 5025211054_M.Armand Giovani
![Untitled](https://user-images.githubusercontent.com/100523471/199169224-05b38a18-79a6-4479-9100-b96a8a32f400.jpg)

# Inheritance 
  Disini saya memiliki beberapa class antara lain :
- Telephone sebagai superclass
- Smartphone dan  HandPhone merupakan subclass dari Telephone
- Lalu ada Android_Phone dan iPhone yang merupakan child class dari Smartphone dan Nokia merupakan child class dari HandPhone
Cara untuk menghubungkan subclass dengan superclass yaitu dengan menggunakan kata `extends`
seperti pada contoh `Smartphone` dan `HandPhone` :
```java
public abstract class Telephone {
	protected String phonenumber;
	
	public Telephone(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public abstract void massage();
	public abstract void whatsapp();
}
 /***
public class Smartphone extends Telephone 
 /***
public class HandPhone extends Telephone
```

# Enkapsulasi
Pada class Handphone saya menggunakan Menggunakan keyword protected sehingga metode atau constructor lainnya dapat diakses dari package yang sama ataupun dari package lain menggunakan subclass atau child class. (Inheritance)
contoh :
```java
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
```

# Abstraksi
Untuk Abstraksi sendiri saya menggunakan Class `Telephone` sebagai abstract classnya sehingga object telephone harus memiliki atribut yang identik.
Contoh Abstraksi :
```java 
public abstract class Telephone {
	protected String phonenumber;
	
	public Telephone(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public abstract void massage();
	public abstract void whatsapp();
}
```

# Polymorphism
Untuk Polymorphism bisa dilihat dari output tiap-tiap class yang beragam
```java
public class HandPhone extends Telephone 
@Override
	public void massage() {
		System.out.printf("%s Phone is ready to massage", name);

	}

	@Override
	public void whatsapp() {
		System.out.printf("%s Phone is not satisfied to using whatsapp", name);

	}
  
 ***
 
 public class Smartphone extends Telephone
  @Override
	public void massage() {
		System.out.printf("%s Phone is ready to massage", name);

	}

	@Override
	public void whatsapp() {
		System.out.printf("%s Phone is ready to whatsapp", name);

	}
```
