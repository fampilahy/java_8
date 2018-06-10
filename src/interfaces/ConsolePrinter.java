package interfaces;

public interface ConsolePrinter extends Printer {

	public static void print(String str){
		Printer.print(str);
		System.out.println("Redifinition in ConsolePrinter");
	}
	
	
//	public default void scanf(String str){
//		System.out.println("Scanf"+str);
//	}
//	
}
