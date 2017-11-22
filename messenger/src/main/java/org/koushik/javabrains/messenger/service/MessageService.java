package org.koushik.javabrains.messenger.service;

import java.util.ArrayList;
import java.util.List;

import org.koushik.javabrains.messenger.model.AppMock;
import org.koushik.javabrains.messenger.model.Message;
import org.koushik.javabrains.messenger.model.Results;
import org.koushik.javabrains.messenger.model.name;
import org.koushik.javabrains.messenger.model.picture;


public class MessageService {
	public List<Message> getAllMessages()
	{
		Message m1=new Message(1L, "Hello", "srikanth");
		Message m2=new Message(2L, "Hai", "srikanth");
		
		List<Message> list=new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return list;
	}
	
	
	public AppMock getResults()
	{
		AppMock app1=new AppMock();
		
		Results[] resarr=new Results[2];
		name n1=new name("Mr","joerie","scheerman");
		picture p1=new picture("https://randomuser.me/api/portraits/thumb/women/1.jpg");
		Results r1=new Results(n1,"Team.. Make sure attend tomorrow team meeting at 03.00 PM in Darbar","2017-10-06 10:52:04","24",p1);
		
		name n2=new name("Mr","jhon","scheerman");
		picture p2=new picture("https://randomuser.me/api/portraits/thumb/men/47.jpg");
		Results r2=new Results(n2,"Please fill your EPMS for this week with out fail","2017-10-05 11:52:04","4",p2);
		
		
		resarr[0]=r1;
		resarr[1]=r2;
		app1.setResults(resarr);
		return app1;
		
		
	}
	
	
	

}
