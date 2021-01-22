package assn2.dtm;

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

		Buyer tom = new Buyer();
		Buyer george = new Buyer(400);
		Buyer sam = new Buyer(50);
		Buyer ruth = new Buyer(150);
		Buyer amid = new Buyer();

		tom.upgradeMembership();
		george.upgradeMembership();
		sam.upgradeMembership();
		ruth.upgradeMembership();
		amid.upgradeMembership();

		System.out.println(Buyer.getBuyersCount());

		System.out.println(tom + "\n" + george + "\n" + sam + "\n" + ruth + "\n" + amid);

	}

}
