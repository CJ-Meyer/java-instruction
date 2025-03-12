package com.mm.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mm.model.Movie;

public class MovieDBDAO implements DAO<Movie> {
	static String dbURL = "jdbc:mysql://localhost:8080/bmdb";
	static String username = "bmdb_user";
	static String password = "sesame";

	// p.625
	private static Connection getConnection() throws SQLException {
		Connection connection = DriverManager.getConnection(dbURL, username, password);
		return connection;
	}
	
	@Override
	public List<Movie> getAll() {
		List<Movie> movies = new ArrayList<>();
		String sql = "SELECT * FROM movie";
		// get connection to db 
		// create sql statement
		// execute query
		// process result set (create movie objects)
			// get a row from result set
		    // parse the row into fields
		    // create an instance of Movie
		    // add the instance to the list
		// close connection
		try (Connection conn = getConnection();
			// create a statement
			// execute the query
			// process the result set
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();){
			while (rs.next()) {
				int id = rs.getInt(1);
				String title = rs.getString(2);
				int year = rs.getInt(3);
				String rating = rs.getString(4);
				String director = rs.getString(5);
				Movie m = new Movie(id, title, year, rating, director);
				movies.add(m);
			}
		} catch (SQLException e) {
			System.err.println("Error getting all movies.");
			e.printStackTrace();
			
		}
		return movies;
	}

	@Override
	public Movie getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movie add(Movie m) {
		String sql = "INSERT INTO movie (title, year, rating, director) VALUES (?, ?, ?, ?)";
		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql);) {
			ps.setString(1, m.getTitle());
			ps.setInt(2, m.getYear());
			ps.setString(3, m.getRating());
			ps.setString(4, m.getDirector());
			ps.executeUpdate();
		} catch (SQLException e) {
			System.err.println("Error adding movie.");
			e.printStackTrace();
		}
		return m;
	}

	@Override
	public void update(Movie t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		String sql = "DELETE FROM movie WHERE id = ?";
		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql);) {
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.err.println("Error deleting movie.");
			e.printStackTrace();
		}
	}
	
}
