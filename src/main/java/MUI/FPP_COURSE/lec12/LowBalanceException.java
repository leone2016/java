package MUI.FPP_COURSE.lec12;

public class LowBalanceException extends RuntimeException {
	public String toString() {
		return "Balance Should not be less than 5000";
	}
	
	public String getMessage() {
		return "Balance Should not be less than 5000";
	}
}
