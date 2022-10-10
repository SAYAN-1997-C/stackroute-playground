package com.stackroute.favouriteApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.favouriteApp.model.Favourite;
import com.stackroute.favouriteApp.repo.FavRepo;

@Service
public class FavServiceImpl implements FavService {

	@Autowired
	FavRepo favrepo;
	
	@Override
	public Favourite addFavoruite(Favourite fav) {
		Favourite favresult=favrepo.save(fav);
		return favresult;
	}

	@Override
	public List<Favourite> getFavouriteByMail(String mailid) {
		List<Favourite> favlist=favrepo.findByMailid(mailid);
		return favlist;
	}

	@Override
	public boolean deleteFavourite(String id) {

		Optional<Favourite> favopt=favrepo.findById(id);
		
		if (favopt.isPresent())
		{
		favrepo.deleteById(id);
		return true;
		}
		else
			return false;
	}

}
