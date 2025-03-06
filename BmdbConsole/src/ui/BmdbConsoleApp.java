package ui;

import model.Actor;
import model.Credit;
import model.Movie;
import util.MyConsole;

public class BmdbConsoleApp {

	public static void main(String[] args) {
		MyConsole.printLine("Welcome to the Bmdb Console Application");
		
		int movieId = MyConsole.promptInt("Movie ID: ");
		String title = MyConsole.promptString("title: ");
		int year = MyConsole.promptInt("year: ");
		String rating = MyConsole.promptString("rating: ");
		String director = MyConsole.promptString("director: ");
		Movie m1 = new Movie(movieId, title, year, rating, director);
		System.out.println(m1);
		
		int actorId = MyConsole.promptInt("Actor ID:");
		String firstName = MyConsole.promptString("First Name: ");
		String lastName = MyConsole.promptString("Last Name: ");
		String gender = MyConsole.promptString("Gender: ");
		String dateOfBirth = MyConsole.promptString("Date Of Birth: ");
		Actor a1 = new Actor(actorId, firstName, lastName, gender, dateOfBirth);
		System.out.println(a1);
		
		int creditId = MyConsole.promptInt("Credit ID: ");
		String role = MyConsole.promptString("Role: ");
		Credit c1 = new Credit(creditId, m1.getMovieId(), a1.getActorId(), role);
		System.out.println(c1);
	}

}
