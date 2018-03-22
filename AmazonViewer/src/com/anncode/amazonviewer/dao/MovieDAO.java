package com.anncode.amazonviewer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import com.anncode.amazonviewer.model.Movie;

public interface MovieDAO {
	
	default Movie setMovieViewed(Movie movie) {
		return movie;
	} 
	
	default ArrayList<Movie> read(){
		ArrayList<Movie> movies = new ArrayList();
		return movies;
	}
	
	private boolean getMovieViewed() {
		return false;
	}
	
}












