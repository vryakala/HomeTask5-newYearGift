package newYearGift;

public class Client {
	static GiftBox ChildGift = new GiftBox();

	public static void main(String[] args) {

		ChildGift.AddChocolate(2, new DairyMilk());
		ChildGift.AddChocolate(2, new Snickers());
		ChildGift.AddSweet(1, new laddu());
		ChildGift.AddSweet(2, new Badhshah());
		// System.out.println("Total weight of Childern's Gift = " +
		// TotalWeight());
		System.out.println("Total weight of Childern's Gift = " + TotalWeight1());
		// sorting(ChildGift.ChocolatesList);
	}

	private static int TotalWeight1() {
		int totalweight1 = 0;
		int chocoweight1 = 0;
		int sweetweight1 = 0;
		for (Chocolates chocolates : ChildGift.ChocolatesList) {
			chocoweight1 = chocoweight1 + chocolates.weight;
		}
		for (Sweets sweets : ChildGift.SweetsList) {
			sweetweight1 = sweetweight1 + sweets.weight;
		}
		totalweight1 = chocoweight1 + sweetweight1;
		return totalweight1;

	}

	/*
	 * private static int TotalWeight() { int totalweight = 0; int chocoweight =
	 * 0; int sweetweight = 0; for (int i = 0; i <
	 * ChildGift.ChocolatesList.size(); i++) { chocoweight = chocoweight +
	 * ChildGift.ChocolatesWeight.get(i); } for (int i = 0; i <
	 * ChildGift.SweetsList.size(); i++) { sweetweight = sweetweight +
	 * ChildGift.SweetsWeight.get(i); } totalweight = chocoweight + sweetweight;
	 * return totalweight; }
	 */
}
