package com.mm.db;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.mm.model.Movie;

import util.MyConsole;

public class MovieFileDAO implements DAO<Movie> {
	// p.289 - How to work with file IO
	private static final String FILENAME = "movies.txt";
	private static final String SEP = "|";
	private List<Movie> movies = new ArrayList<>();

	@Override
	public List<Movie> getAll() {
		if (movies.size() == 0) {
			try (BufferedReader in = new BufferedReader(new FileReader(FILENAME));) {
				String line = in.readLine();
				while (line != null) {
					String[] cols = line.split("\\" + SEP);
					int id = Integer.parseInt(cols[0]);
					String title = cols[1];
					int year = Integer.parseInt(cols[2]);
					String rating = cols[3];
					String director = cols[4];
					// split line into fields/columns
					Movie m = new Movie(id, title, year, rating, director);
					movies.add(m);
					line = in.readLine();
				}

				// create the instance of Movie
				// add the instance to moviesList.
			} catch (FileNotFoundException e) {
				MyConsole.printLine("File not found: " + FILENAME);
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return movies;
	}

	// NOT YET IMLPEMENTED
	@Override
	public Movie getById(int id) {

		return null;
	}

	@Override
	public Movie add(Movie m) {
		// add movie to the list

		movies.add(m);
		saveMovieFile();
		// save the list to the file
		return m;
	}

	// NOT YET IMLPEMENTED
	@Override
	public void update(Movie m) {
		// read the file
		// update the movie in the list
		// save the list to the file
	}

	@Override
	public void delete(int id) {
		Movie delMovie = null;
		// read the file
		for (Movie m : movies) {
			if (m.getMovieId() == id) {
				delMovie = m;
			}
		}
		movies.remove(delMovie);
		saveMovieFile();
		// remove the movie from the list
		// save the list to the file
	}

	private void saveMovieFile() {
		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(FILENAME)))) {
			for (Movie m : movies) {
				out.println(m.getMovieId() + SEP + m.getTitle() + SEP + m.getYear() + SEP + m.getRating() + SEP
						+ m.getDirector());
			}
		}

		catch (IOException ioe) {
			// TODO Auto-generated catch block
			MyConsole.printLine(ioe.getMessage());
		}
	}
}
