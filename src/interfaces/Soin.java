package interfaces;

@FunctionalInterface
public interface Soin {
	public void soigner();
	public default void manger(){
		System.out.println("Je mange");
	}
}
