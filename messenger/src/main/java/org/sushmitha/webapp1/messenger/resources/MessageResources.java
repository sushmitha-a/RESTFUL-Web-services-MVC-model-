package org.sushmitha.webapp1.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.sushmitha.webapp1.messenger.mode.Message;
import org.sushmitha.webapp1.messenger.service.MessageService;

@Path("/messages")
@Consumes(MediaType.APPLICATION_XML)	
@Produces(MediaType.APPLICATION_XML)
public class MessageResources {

	MessageService messageService = new MessageService();
	
	@GET
	public List<Message> getMessages() {
		return messageService.getAllMessages();
	}
	
	@POST
	public Message addMessage(Message m) {
		return messageService.addMessage(m);
		
	}
	
	@PUT
	@Path("/{messageId}")
	public Message updateMessage(@PathParam("messageId")long id , Message m)
	{
		m.setId(id);
		return messageService.updateMessage(m);
	}
	
	@DELETE
	@Path("/{messageId}")
	public void deleteMessage(@PathParam("messageId")long id) {
		messageService.removeMessage(id);
	}
	
	
	@GET
	@Path("/{messageId}")
	public Message getMessage(@PathParam("messageId")long id) {
		return messageService.getMessage(id);
	}
	
	
	
	
}
