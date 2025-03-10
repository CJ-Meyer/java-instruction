import java.util.ArrayList;
import java.util.List;

import util.MyConsole;

public class ArrayListApp {

	public static void main(String[] args) {
		MyConsole.printHeader("Welcome to array lists");
		
		
		List<String> names = new ArrayList<>();
		names.add("Celina");
		names.add("Jim");
		names.add("Andy");
		names.add("Adrian");
		names.add("Heath");
		names.add("Joe");
		names.add("Christian");
		names.add("Nick");
		names.add("Sean");
		
		names.forEach(n -> MyConsole.print(n+", "));
		MyConsole.printLine("");
		
		names.add(4, "temp");
		names.forEach(n -> MyConsole.print(n+", "));
		MyConsole.printLine("");
		
		names.remove(4);
		names.forEach(n -> MyConsole.print(n+", "));
		MyConsole.printLine("");
		MyConsole.printLine("\nBYE");
	}

}
