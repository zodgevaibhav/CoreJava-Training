package javacore.collectionlearn.chocolate;

public class KitKat {

	private String barCode;
	private String coverColor;
	private int price;
	private int weight;
	
	//**** Parameterized constructor ***********************
	public KitKat(String barCode, String coverColor, int price, int weight) {
		super();
		this.barCode = barCode;
		this.coverColor = coverColor;
		this.price = price;
		this.weight = weight;
	}

	//******************* Getter setter *****************
	public String getBarCode() {
		return barCode;
	}
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}
	public String getCoverColor() {
		return coverColor;
	}
	public void setCoverColor(String coverColor) {
		this.coverColor = coverColor;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
}
