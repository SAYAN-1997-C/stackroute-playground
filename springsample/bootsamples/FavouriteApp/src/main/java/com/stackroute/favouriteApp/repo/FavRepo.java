package com.stackroute.favouriteApp.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.favouriteApp.model.Favourite;

@Repository
public interface FavRepo extends MongoRepository<Favourite,String> {

	 List<Favourite> findByMailid(String mailid);
}
