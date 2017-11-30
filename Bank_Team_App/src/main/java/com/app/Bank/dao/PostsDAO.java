package com.app.Bank.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.app.Bank.model.Picture;
import com.app.Bank.model.Post;
import com.app.Bank.model.Profile;
import com.app.Bank.service.GetPosts;

public class PostsDAO 
{

	public List<Post> getPostsFromRDS()
	{
		List<Post> postList= new ArrayList<Post>();

		try
		{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://rajdevelopersdb.cbkzg2fzety2.ap-south-1.rds.amazonaws.com:3306/agiledb","rajdevelopersdb","rajdevelopersdb");  
			//here sonoo is database name, root is username and password  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from post order by timestamp desc");  


			while(rs.next()) 
			{
				//				Profile n1 = new Profile();
				//				Picture p1= new Picture();
				//				n1.setFirst(rs.getString(""));

				Profile n1=new Profile("Mr","joerie","scheerman");
				Picture p1=new Picture("https://randomuser.me/api/portraits/thumb/women/1.jpg");
				Post post=new Post();
				post.setMessage(rs.getString("message"));
				post.setTimestamp(rs.getDate("timestamp").toString());
				post.setLikes(rs.getInt("likes"));
				post.setName(n1);
				post.setPicture(p1);
				postList.add(post);
			}
			con.close();  
		}
		catch(Exception e)
		{
			System.out.println(e);
		}  

		return postList;
	}
	public void insertPostToRDS(Post post)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://rajdevelopersdb.cbkzg2fzety2.ap-south-1.rds.amazonaws.com:3306/agiledb","rajdevelopersdb","rajdevelopersdb");  
			//here sonoo is database name, root is username and password  
			Statement stmt=con.createStatement();  
			PreparedStatement pst = null;
			//pst = con.prepareStatement("INSERT INTO Authors(Name) VALUES(?)");
			pst=con.prepareStatement("INSERT INTO post(postId,ProfileId,message,likes,timestamp,picture) VALUES(?,?,?,?,?,?)");
			pst.setInt(1, 103);
			pst.setInt(2, 101);
			pst.setString(3,post.getMessage().toString());
			pst.setInt(4, post.getLikes());
			pst.setString(5, post.getTimestamp());
			pst.setString(6, "https://randomuser.me/api/portraits/thumb/women/1.jpg");
            pst.executeUpdate();
			con.close();
			
			System.out.println("inseted");
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		
	}
}
