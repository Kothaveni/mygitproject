package sample;

public class Singleton2 {
	private  static final Singleton2 instance2=null;
	private Singleton2() {
		
	}
	
	static {
		Singleton2 instance2 = new Singleton2();
	}
	
	public static Singleton2 getInstance() {
		return instance2;
	}
}
