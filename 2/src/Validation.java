import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Validation {

	public Validation() {

	}
	
	boolean shoeName(String name) {
		return name.endsWith("shoe") ? true : false;	
	}
	
	boolean shoeCategory(String category) {
		return (category.contentEquals("Sneaker") ||
				   category.contentEquals("Running") ||
				   category.contentEquals("Boot")) ? true : false;
	}
	
	boolean shoeReleaseDate(String date) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
			sdf.setLenient(false);
			sdf.parse(date);
		} catch(ParseException pe) {
			return false;
		}
		return true;
	}
	
	boolean shoePrice(Integer price) {
		return (price >= 5000) ? true : false;
	}
	
	public static void main() {
		new Validation();
	}
}
