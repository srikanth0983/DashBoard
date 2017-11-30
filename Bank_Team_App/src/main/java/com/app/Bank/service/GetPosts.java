package com.app.Bank.service;

import java.util.ArrayList;
import java.util.List;

import com.app.Bank.model.Post;


public class GetPosts 
{

	private List<Post> results;

	public List<Post> getResults() {
		if(results==null)
		{
			results=new ArrayList<Post>();
		}
		return this.results;
	}

	public void setResults(List<Post> results) {
		this.results = results;
	}

}
