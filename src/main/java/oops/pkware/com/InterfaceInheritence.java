package oops.pkware.com;

interface Sample{
	void meth1();
	void meth2();
}

interface ChildSample extends Sample{
	void meth3();
	void meth4();
}

class One1 implements ChildSample{
	public void meth1() {
		System.out.println("Meth1");
	}
	
	public void meth2() {
		System.out.println("Meth2");
	}
	
	public void meth3() {
		System.out.println("Meth3");
	}
	
	public void meth4() {
		System.out.println("Meth4");
	}
}
public class InterfaceInheritence {

	public static void main(String[] args) {
		One1 obj=new One1();
		obj.meth1();

	}

}
