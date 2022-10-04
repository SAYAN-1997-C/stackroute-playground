package com.stackroute.moviejpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.moviejpa.exceptions.ActorNotFoundException;
import com.stackroute.moviejpa.exceptions.ActoridAlreadyExistException;
import com.stackroute.moviejpa.model.Actor;
import com.stackroute.moviejpa.repository.ActorRepo;


@Service
public class ActorServiceImpl implements ActorService{

	
	@Autowired
	ActorRepo actrepo;
	
	@Override
	public Actor addActor(Actor newactor) throws ActoridAlreadyExistException {
		
		Optional<Actor> actopt=actrepo.findById(newactor.getActorid());
		
		if(actopt.isPresent())
			throw new ActoridAlreadyExistException("duplicate Id");
		
		Actor result=actrepo.save(newactor);
		return result;
	}

	@Override
	public List<Actor> getActors() {
		 
		return actrepo.findAll();
	}

	@Override
	public List<Actor> findByActorName(String name) {
				//actrepo.f
		return actrepo.findByActorName(name);
	}

	@Override
	public boolean deleteActor(String actid) throws ActorNotFoundException {
		
		Optional<Actor> actopt=actrepo.findById(actid);
		if( actopt.isEmpty())
			throw new ActorNotFoundException("record does not exist for delete");
		
		actrepo.delete(actopt.get());
		return true;
	}

	@Override
	public Actor updateActor(Actor actmodi) throws ActorNotFoundException {
	 
		Optional<Actor> actopt=actrepo.findById(actmodi.getActorid());
		
		if (actopt.isEmpty())
			throw new ActorNotFoundException("ID not avialable");
		
		Actor actormodified=actrepo.save(actmodi);
		return actormodified;
	}

}
