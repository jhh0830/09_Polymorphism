package com.kh.chap01_poly.part02_eletronic.model.vo;

public class NoteBook  extends Electronic{
	private int usbPort;

	public NoteBook(String brand, String name,
			 int price, int usbPort) {
		super(brand,name,price);
		this.usbPort = usbPort;
	}

	public int getUsbPort() {
		return usbPort;
	}

	public void setUsbPort(int usbPort) {
		this.usbPort = usbPort;
	}

	
	@Override
	public String toString() {
		return"NoteBook [brand= "+ super.getBrand() + ", name="+super.getName()+", price="+super.getPrice()+", usbPort="
				+usbPort+"]";
	}
	
}
