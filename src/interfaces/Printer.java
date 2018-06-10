package interfaces;

public interface Printer {
	
	public static void print(String str){
		System.out.println(str);
	}
	
	public void scan(String str);
	public void scanf(String str);
}
