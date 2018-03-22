package com.anncode.amazonviewer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import static com.anncode.amazonviewer.db.DataBase.*;

import com.anncode.amazonviewer.db.IDBConnection;
import com.anncode.amazonviewer.model.Movie;

public interface MovieDAO extends IDBConnection {
	
	default Movie setMovieViewed(Movie movie) {
		try(Connection connection = connectToDB()){
			Statement statement = connection.createStatement();
			String query = "INSERT INTO " + TVIEWED + 
					" ("+TVIEWED_IDMATERIAL+", "+TVIEWED_IDELEMENT+", "+TVIEWED_IDUSUARIO+")" +
					 " VALUES("+ID_TMATERIALS [0]+", "+movie.getId()+", "+TUSER_IDUSUARIO+")";
			if (statement.executeUpdate(query) > 0) {
				System.out.println("Se marcó en Visto");
			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return movie;
	} 
	
	default ArrayList<Movie> read(){
		ArrayList<Movie> movies = new ArrayList();
		try (Connection connection = connectToDB()){
			String query = "SELECT * FROM " + TMOVIE;
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			ResultSet rs = preparedStatement.executeQuery();
			
			while (rs.next()) {
				Movie movie = new Movie(
						rs.getString(TMOVIE_TITLE), 
						rs.getString(TMOVIE_GENRE), 
						rs.getString(TMOVIE_CREATOR), 
						Integer.valueOf(rs.getString(TMOVIE_DURATION)), 
						Short.valueOf(rs.getString(TMOVIE_YEAR)));
				
				movie.setId(Integer.valueOf(rs.getString(TMOVIE_ID)));
				movie.setViewed(getMovieViewed(
						preparedStatement, 
						connection, 
						Integer.valueOf(rs.getString(TMOVIE_ID))));
				movies.add(movie);
				
			}
			
			
		}catch (SQLException e) {
			// TODO: handle exception
		}
		return movies;
	}
	
	private boolean getMovieViewed(PreparedStatement preparedStatement, Connection connection, int id_movie) {
		boolean viewed = false;
		String query = "SELECT * FROM " + TVIEWED +
				" WHERE " + TVIEWED_IDMATERIAL + "= ?"+ 
				" AND " + TVIEWED_IDELEMENT + "= ?" +
				" AND " + TVIEWED_IDUSUARIO + "= ?";
		ResultSet rs = null;
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, ID_TMATERIALS[0]);
			preparedStatement.setInt(2, id_movie);
			preparedStatement.setInt(3, TUSER_IDUSUARIO);
			
			rs = preparedStatement.executeQuery();
			viewed = rs.next();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
				
		return viewed;
	}
	
}












