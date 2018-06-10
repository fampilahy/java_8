import java.util.ArrayList;
import java.util.List;
import java.util.function.DoubleToIntFunction;
import java.util.function.Function;

import interfaces.ConsolePrinter;
import interfaces.Printer;
import lambda.Dialog;
import lambda.Transformer;

public class Test {

	public static void main(String[] args) {
		
		//printer is here an interface and it still works well
		Printer.print("Hello World");
		
		//test of inheritance in interfaces 
		ConsolePrinter.print("Hello World Interface Inheritace");
		
		
		//lambda
		Dialog dialog = (str) -> {System.out.println(str);};
		dialog.dialoguer("Hello word facon lambda");
		
		Integer a = 1;
		Function<Integer, String> parseToString = (intvalue) ->  ""+intvalue;
		System.out.println("la valeur est "+parseToString.apply(a));
		
		Transformer t1 = ( list, func) -> {
			ArrayList<String> strings = new ArrayList<String>();
			for(Integer integer : list){
				strings.add(func.apply(a));
			}
			return strings;
			
		};
		
		
	}

	
	public static List<String> transformListIntToString(List<Integer> list, Function<Integer,String> parseToString){
		List<String> strings = new ArrayList<String>();
		for(Integer a : list){
			strings.add(parseToString.apply(a));
		}
		return strings;
	}

	
			
}
