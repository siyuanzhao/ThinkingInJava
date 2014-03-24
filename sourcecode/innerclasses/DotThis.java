package innerclasses;

public class DotThis {

	/**
	 * @param args
	 */
	void f() { System.out.println("DotThis.f()"); }
	public class Inner {
		public DotThis outer() {
			return DotThis.this;
		}
	}
	public Inner inner() { return new Inner(); }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DotThis dt = new DotThis();
		DotThis.Inner dti = dt.inner();
		dti.outer().f();
	}

}
