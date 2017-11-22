package org.koushik.javabrains.messenger.resources;


import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.koushik.javabrains.messenger.model.AppMock;
import org.koushik.javabrains.messenger.model.Message;
import org.koushik.javabrains.messenger.model.Results;
import org.koushik.javabrains.messenger.service.MessageService;

@Path("messages")
public class MessageResource {
	
	MessageService messageService =new MessageService();
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public AppMock getResults(){
		return messageService.getResults();
	}
	

}
