package newYearGift;

import java.util.ArrayList;

public class GiftBox {
	Chocolates Chocolates = new Chocolates();
	Sweets Sweets = new Sweets();
	ArrayList<Chocolates> ChocolatesList = new ArrayList<>();
	ArrayList<Sweets> SweetsList = new ArrayList<>();
	ArrayList<Integer> ChocolatesWeight = new ArrayList<>();
	ArrayList<Integer> SweetsWeight = new ArrayList<>();

	public void AddChocolate(int n, Chocolates Chocolates) {
		for (int i = 0; i < n; i++) {
			ChocolatesList.add(Chocolates);
			ChocolatesWeight.add(Chocolates.getWeight());
		}
	}

	public void AddSweet(int n, Sweets Sweets) {
		for (int i = 0; i < n; i++) {
			SweetsList.add(Sweets);
			SweetsWeight.add(Sweets.getWeight());
		}
	}
}
