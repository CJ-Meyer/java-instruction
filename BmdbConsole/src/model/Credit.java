package model;

public class Credit {

	private int creditId;
    private int movieId;
    private int actorId;
    private String role;
	public Credit(int creditId, int movieId, int actorId, String role) {
		super();
		this.creditId = creditId;
		this.movieId = movieId;
		this.actorId = actorId;
		this.role = role;
	}
	public Credit() {
		super();
	}
	public int getcreditId() {
		return creditId;
	}
	public void setcreditId(int creditId) {
		this.creditId = creditId;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public int getActorId() {
		return actorId;
	}
	public void setActorId(int actorId) {
		this.actorId = actorId;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Credit [creditId=" + creditId + ", movieId=" + movieId + ", actorId=" + actorId + ", role=" + role + "]";
	}

}
