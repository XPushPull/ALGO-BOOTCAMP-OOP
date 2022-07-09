import java.util.*;

public class ShoeApp {
	
	Scanner sc = new Scanner(System.in);
	ArrayList<Shoe> shoes = new ArrayList<>();
	Validation validate = new Validation();
	
	public void viewShoes() {
		if (shoes.isEmpty()) {
			System.out.println("No shoes avalaible..");
			System.out.println("Press enter to continue..");
			return;
		}
		for (int i = 1; i <= shoes.size(); i++) {
			System.out.println(i + ". " + shoes.get(i-1).toString());
		}
	}
	
	public void addShoe() {
		String name = null;
		
		do {
			System.out.print("Input shoe's name[name ends with shoe, example: \"Fire shoe\"]: ");
			name = sc.nextLine();
		} while (!validate.shoeName(name));
		String category = null;
		do {
			System.out.print("Input shoe's category[Sneaker | Running | Boot] (case sensitive): ");
			category = sc.nextLine();
		} while (!validate.shoeCategory(category));
		
		String date = null;
		
		do {
			System.out.print("Input shoe's release date[dd-mm-yyyy]: ");
			date = sc.nextLine();
		} while (!validate.shoeReleaseDate(date));
		
		Integer price = -1;
		
		do {
			System.out.print("Input shoe's price[more than or equals to 5000]: ");
			price = sc.nextInt(); sc.nextLine();
		} while (!validate.shoePrice(price));
		
		System.out.println("Shoe added!");
		System.out.println("Press enter to continue...");
		sc.nextLine();
		Shoe newShoe = new Shoe(name, category, date, price);
		shoes.add(newShoe);
	}
	
	public void deleteShoe() {
		int size = shoes.size();
		boolean isValidIndex;
		int index;
		
		do {
			isValidIndex = true;
			System.out.printf("Choose shoe's number to delete[1..%d]: ", size);
			index = sc.nextInt(); sc.nextLine();
			if(index < 1 || index > size) isValidIndex = false;
		} while (!isValidIndex);
		
		shoes.remove(index-1);
		System.out.println("Shoe removed!");
	}

	public ShoeApp(boolean onApp) {
		while(onApp) {
			for (int i = 0; i < 50; i++) {
				System.out.println();
			}
			System.out.println("Shoe Shop");
			System.out.println("1. View Shoes");
			System.out.println("2. Add Shoe");
			System.out.println("3. Delete Shoe");
			System.out.println("4. Exit");
			
			int choice;
			boolean isValidChoice = true;
			
			do {
				System.out.print(">> ");
				choice = sc.nextInt(); sc.nextLine();
				if (choice < 1 || choice > 4) {
					isValidChoice = false;
				}
			} while (!isValidChoice);
			
			switch (choice) {
			case 1:
				viewShoes();
				sc.nextLine();
				break;
			case 2:
				addShoe();
				break;
			case 3:
				viewShoes();
				if (!shoes.isEmpty()) {
					deleteShoe();
				}
				sc.nextLine();
				break;
			case 4:
				System.out.println("Thank you!");
				onApp = false;
				break;
			}
		}
	}

	public static void main(String[] args) {
		new ShoeApp(true);
	}

}
