package com.stackroute.moviejpa.service;

import java.util.List;

import com.stackroute.moviejpa.exceptions.ActorNotFoundException;
import com.stackroute.moviejpa.exceptions.ActoridAlreadyExistException;
import com.stackroute.moviejpa.model.Actor;

public interface ActorService {
	
	Actor addActor(Actor newactor) throws ActoridAlreadyExistException;
	
     List<Actor> getActors();
     
     List<Actor> findByActorName(String name);
     
     boolean deleteActor(String actid) throws ActorNotFoundException;
     
     
     Actor updateActor(Actor actmodi) throws ActorNotFoundException;

}
