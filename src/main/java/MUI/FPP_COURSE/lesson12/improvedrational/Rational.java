package MUI.FPP_COURSE.lesson12.improvedrational;

import java.util.Objects;

public class Rational {
	private int num;
	private int denom;
	public Rational(int num, int denom) {
		if(denom <= 0) {
			throw new IllegalArgumentException("Denominator must be positive");
		}
		this.num=num;
		this.denom=denom;
	}
	//a/b + c/d = (ad + bc) / bd
	public Rational add(Rational rat){
		int a = this.num;
		int b = this.denom;
		int c = rat.num;
		int d = rat.denom;
		return new Rational((a*d + b*c), b*d);
	}
	//a/b * c/d = ac / bd
	public Rational multiply(Rational rat) {
		int a = this.num;
		int b = this.denom;
		int c = rat.num;
		int d = rat.denom;
		return new Rational(a*c, b*d);		
	}
	
	//a/b < c/d iff ad < bc
	public int compareTo(Rational rat) {
		int a = this.num;
		int b = this.denom;
		int c = rat.num;
		int d = rat.denom;	
		if (a*d < b*c) return -1;
		else if (a * d == b * c) return 0;
		else return 1;
	}
	//a/b == c/d iff ad == bc
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(ob.getClass() != getClass()) return false;
		Rational rat = (Rational)ob;
		int a = this.num;
		int b = this.denom;
		int c = rat.num;
		int d = rat.denom;	
		return (a*d == b*c);
	}
	public int hashCode() {
		return Objects.hash(num, denom);
	}
	public String toString(){
		if(denom == 1) return ""+num;
		return "" + num + "/"+denom;
	}
	public double doubleValue() {
		return (double)num/ (double)denom;
	}
	public static void main(String[] args) {
		//no need to enclose this in a try/catch block
		new Rational(2,-5);
	
		Rational twoThirds = new Rational(2,3);
		Rational negSeventeenFifths = new Rational(-17,5);
//		//Multiply 2/3 and -17/5
//		System.out.println("Expecting: 2/3 * -17/5 = -34/15");
//		System.out.print(twoThirds + " * " + negSeventeenFifths
//		   + " = " + twoThirds.multiply(negSeventeenFifths));
//		
//		
//		Rational oneThird = new Rational(1,3);
//		Rational leftSide = (twoThirds.multiply(negSeventeenFifths)).add(oneThird);
//		Rational rightSide = twoThirds.multiply((negSeventeenFifths.add(oneThird)));
//		String left = "("+twoThirds.toString()+" * "+negSeventeenFifths.toString()+") + "+oneThird.toString();
//		String right = twoThirds.toString()+" * "+"("+negSeventeenFifths.toString()+" + "+oneThird.toString()+")";
//		int result = leftSide.compareTo(rightSide);
//		switch(result){
//			case -1:
//				System.out.println(left+" is less than "+ right);
//				break;
//			case 0:
//				System.out.println(left+" equals "+ right);
//				break;
//			case 1:
//				System.out.println(left+" is greater than "+right);
//				break;
//			default:
//		
//		}
	}
	public int getDenom() {
		return denom;
	}
	public void setDenom(int denom) {
		this.denom = denom;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
}
