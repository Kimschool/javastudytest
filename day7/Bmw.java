package day7;

public class Bmw {

	private String color;
	private String kind;
	private String engine;
	private int price;
	private static int count = 0;

	public Bmw(String engine) {
		this.color = "white";
		this.kind = "3";
		this.engine = engine;
		if(engine == "v3") {
			this.price = 3000;
		} else {
			this.price = 5000;
		}

	}

	public Bmw() {
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Bmw.count = count;
	}



}
