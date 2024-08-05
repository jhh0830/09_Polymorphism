package com.kh.chap01_poly.part02_eletronic.model.vo;

public class Desktop  extends Electronic{
	private static final String  CPU = "intel";
	private String  graphic;
	
	
	public Desktop(String brand, String name,
			 int price,String graphic) {
		super(brand,name,price);
		
		this.graphic = graphic;
	}

	
	
	
	public String getGraphic() {
		return graphic;
	}

	public void setGraphic(String graphic) {
		this.graphic = graphic;
	}

	@Override
	public String toString() {
		return "Desktop [brand= "+ super.getBrand()+ ", name="+super.getName()+", price="+super.getPrice()+", graphic="
				+graphic+"]";
	}
	
	
}
