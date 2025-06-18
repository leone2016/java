package MUI.FPP_COURSE.lesson8.demo.equalsexample;

/**
 * Implements equals in the wrong way for inheritance.
 * If a different equals method is needed, should use
 * composition instead of inheritance.
 */
public class DogCounter extends Dog {
	public static int counter = 0;
	public DogCounter(String name, boolean barkIsLoud) {
		super(name, barkIsLoud);
	}
	
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(getClass() != ob.getClass()) return false;
		DogCounter d = (DogCounter)ob;
		return d.getName().equals(getName()) && 
			d.barkIsLoud() == barkIsLoud();
	}

	public int hashCode() {
		int nameHash = getName().hashCode();
		int barkHash = barkIsLoud() ? 1 : 0;
		int result = 17;
		result = 31 * result + nameHash;
		result = 31 * result + barkHash;
		return result;
	}
}
