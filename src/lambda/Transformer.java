package lambda;

import java.util.List;
import java.util.function.Function;

@FunctionalInterface
public interface Transformer {
	public  List<String> transformToListInt(List<Integer> list, Function<Integer, String> func);
}
