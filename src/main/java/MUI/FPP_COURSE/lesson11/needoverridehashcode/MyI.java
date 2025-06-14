package MUI.FPP_COURSE.lesson11.needoverridehashcode;
class A extends MyI1.MyC{
	
};
interface MyI1 {
	class MyC{
		public void display() {
			System.out.println("hi");
		}
	};
	
}


public class MyI{
	
	public static void main(String args[]) {
		MyI1.MyC m = new A();
		m.display();
		
	}
}