
public class CustomException extends Exception {

	public CustomException(String ex) {
		super(ex);
	}

	public static void main(String[] args) {

		try {
			throw new CustomException("Exception");
		} catch (CustomException e) {
			System.out.println(e.getMessage());
		}

	}
}
