package assn1.dtm;

public class APOController {

	private String description;
	private String code;
	private double price;
	
	

	public APOController(String description, String code, double price) {
		super();
		this.description = description;
		this.code = code;
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public String getCode() {
		return code;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "APOController [description=" + description + ", code=" + code + ", price=" + price + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		APOController mobile_phone = new APOController("GSM_digital_hand-held_radiotelephone_sets", "1FBACF3FC", 498.65);
		System.out.println(mobile_phone);

	}

}
