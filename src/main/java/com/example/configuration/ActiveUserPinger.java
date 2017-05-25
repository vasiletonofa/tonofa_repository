package com.example.configuration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.simp.user.SimpSession;
import org.springframework.messaging.simp.user.SimpUser;
import org.springframework.messaging.simp.user.SimpUserRegistry;
import org.springframework.scheduling.annotation.Scheduled;

import com.example.service.ActiveUserService;

public class ActiveUserPinger {

public void setUser(){
	
}
	
  private SimpMessagingTemplate template;
  private ActiveUserService activeUserService;

  public ActiveUserPinger(SimpMessagingTemplate template, ActiveUserService activeUserService) {
    this.template = template;
    this.activeUserService = activeUserService;
  }
  
  int temp=0;
  @Autowired private SimpUserRegistry userRegistry;
  
  @Scheduled(fixedDelay = 5000)
  public void pingUsers() {
	  int i = userRegistry.getUserCount();
	 
	  
	  Set<SimpSession> s = null;
	  
	  List<String> result = new ArrayList<>();
		for (SimpUser user : this.userRegistry.getUsers()) {
			s = user.getSessions();
			
			Iterator iter = s.iterator();
			while (iter.hasNext()) {
				result.add(((SimpSession) iter.next()).getUser().getName());
				
			}
		 
			
			
			
			
		}
	  
      template.convertAndSend("/topic/active",result);
  
  }
  
  
  
  public void listUsers() {
	 
		List<String> result = new ArrayList<>();
		for (SimpUser user : this.userRegistry.getUsers()) {
			result.add(user.toString());
			System.out.print(user.toString());
		}
		
	}



}
