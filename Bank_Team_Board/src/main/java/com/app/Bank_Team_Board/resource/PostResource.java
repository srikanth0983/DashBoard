package com.app.Bank_Team_Board.resource;


import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.app.Bank_Team_Board.model.Picture;
import com.app.Bank_Team_Board.model.Post;
import com.app.Bank_Team_Board.model.Profile;

@Path("posts")
public class PostResource {
		
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getPosts()
	{
		List<Post> postList =new ArrayList<Post>();
		
		Profile n1=new Profile("Mr","joerie","scheerman");
		Picture p1=new Picture("https://randomuser.me/api/portraits/thumb/women/1.jpg");
		Post post1=new Post(n1,"Team.. Make sure attend tomorrow team meeting at 03.00 PM in Darbar","2017-10-06 10:52:04",24,p1);
		
		Profile n2=new Profile("Mr","jhon","scheerman");
		Picture p2=new Picture("https://randomuser.me/api/portraits/thumb/men/47.jpg");
		Post  post2=new Post(n2,"Please fill your EPMS for this week with out fail","2017-10-05 11:52:04",4,p2);
		
		postList.add(post1);
		postList.add(post2);
		
		return "Hello";
		
	}
	

}
