package MUI.FPP_COURSE.lec12;

public class NegativeDimensionException extends Exception {
	
	public String toString() {
		return this.getMessage();
	}
	
	public NegativeDimensionException(String msg) {
		super(msg);
	}
	
	public NegativeDimensionException() {
		super("Dimensions cannot be Negative");
	}
}
