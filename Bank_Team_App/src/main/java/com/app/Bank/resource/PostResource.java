package com.app.Bank.resource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.app.Bank.dao.PostsDAO;
import com.app.Bank.model.Picture;
import com.app.Bank.model.Post;
import com.app.Bank.model.Profile;
import com.app.Bank.service.GetPosts;

@Path("/v1")
public class PostResource
{

	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getStudentRecord(){

//		Profile n1=new Profile("Mr","joerie","scheerman");
//		Picture p1=new Picture("https://randomuser.me/api/portraits/thumb/women/1.jpg");
//		Post post1=new Post(n1,"Team.. Make sure attend tomorrow team meeting at 03.00 PM in Darbar","2017-10-06 10:52:04",24,p1);
//		Profile n2=new Profile("Mr","jhon","scheerman");
//		Picture p2=new Picture("https://randomuser.me/api/portraits/thumb/men/47.jpg");
//		Post  post2=new Post(n2,"Please fill your EPMS for this week with out fail","2017-10-05 11:52:04",4,p2);

		GetPosts gp=new GetPosts();
		
		try {
//			gp.getResults().add(post1);
//			gp.getResults().add(post2);
			
			System.out.println("Calling DAO");
			PostsDAO postsDAO=new PostsDAO();
			List<Post> resultPostList =new ArrayList<Post>();
			resultPostList=postsDAO.getPostsFromRDS();
			System.out.println(resultPostList);
			
			Iterator itr = resultPostList.iterator();
		      
		      while(itr.hasNext()) {
		         Post element = (Post)itr.next();
		        gp.getResults().add(element);
		      }
		
		} 
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return Response.status(Status.OK).entity(gp).build();

	}
	
	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response postStudentRecord(Post post){
		
		System.out.println("successful");
		
		PostsDAO postsDAO=new PostsDAO();
		
		Profile n2=new Profile("Mr","jhon","scheerman");
		Picture p2=new Picture("https://randomuser.me/api/portraits/thumb/men/47.jpg");
		Post  post2=new Post(n2,"Please fill your EPMS for this week with out fail","2017-10-05 11:52:04",4,p2);
		String result = "Record entered: "+ post2;
		
		postsDAO.insertPostToRDS(post);
		
		System.out.println("successful");
		return Response.status(201).entity(result).build();
	}
	

}
