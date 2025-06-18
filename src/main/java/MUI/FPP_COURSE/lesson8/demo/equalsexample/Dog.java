package MUI.FPP_COURSE.lesson8.demo.equalsexample;

public class Dog  {
	private String name;
	private boolean barkIsLoud;
	public Dog(String name, boolean barksLoudly) {
		this.name = name;
		this.barkIsLoud = barksLoudly;
	}
	public String getName() {
		return name;
	}
	public boolean barkIsLoud() {
		return barkIsLoud;
	}
	
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(getClass() != ob.getClass()) return false;
		Dog d = (Dog)ob;
		return d.name.equals(name) && d.barkIsLoud == barkIsLoud;
	}
	
	/*
	@Override
	public int compareTo(Object o) {
		if(o == null) return 1;
		if(getClass() != o.getClass()) return 1;
		Dog d = (Dog)o;
		if(name.equals(d.name)) {
			if(barkIsLoud && !d.barkIsLoud)return 1;
			if(!barkIsLoud && d.barkIsLoud) return -1;
			return 0;
		}
		else {
			return name.compareTo(d.name);
		}
	}*/
	
}
