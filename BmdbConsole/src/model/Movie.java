package model;

public class Movie {

		private int movieId;
		private String title;
		private int year;
		private String rating;
		private String director;
		
		public Movie(int movieId, String title, int year, String rating, String director) {
			super();
			this.movieId = movieId;
			this.title = title;
			this.year = year;
			this.rating = rating;
			this.director = director;
		}

		public Movie() {
			super();
		}

		public int getMovieId() {
			return movieId;
		}

		public void setMovieId(int movieId) {
			this.movieId = movieId;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		public String getRating() {
			return rating;
		}

		public void setRating(String rating) {
			this.rating = rating;
		}

		public String getDirector() {
			return director;
		}

		public void setDirector(String director) {
			this.director = director;
		}

		@Override
		public String toString() {
			return "Movie [movieId=" + movieId + ", title=" + title + ", year=" + year + ", rating=" + rating
					+ ", director=" + director + "]";
		}



}
