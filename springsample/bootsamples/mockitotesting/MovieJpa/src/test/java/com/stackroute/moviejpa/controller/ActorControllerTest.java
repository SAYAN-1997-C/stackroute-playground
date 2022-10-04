package com.stackroute.moviejpa.controller;

import static org.mockito.ArgumentMatchers.any;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stackroute.moviejpa.exceptions.ActorNotFoundException;
import com.stackroute.moviejpa.exceptions.ActoridAlreadyExistException;
import com.stackroute.moviejpa.model.Actor;
import com.stackroute.moviejpa.service.ActorService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ActorControllerTest {
	
	@InjectMocks
	ActorController actcontroller;
	
	
	@MockBean
	ActorService actorservice;
	
	
	MockMvc mockmvc;
	
	Actor actor;
	
	
	@BeforeEach
	public void setup()
	{
		 MockitoAnnotations.openMocks(this);
		   actor=new Actor();
		   actor.setActorid("A100");
		   actor.setActorName("Rose");
		   actor.setMovies("The Arabians");
		   actor.setAge(40);
		   
		   mockmvc=MockMvcBuilders.standaloneSetup(actcontroller).build();
		   
	}
	
	
	private String convertToJson(Object obj) throws JsonProcessingException
	{
		ObjectMapper objmapper=new ObjectMapper();
		String result=objmapper.writeValueAsString(obj);
		return result;
		
		
	}
	@Test
	public void addactorsuccesstest() throws Exception
	{
		
		Mockito.when(actorservice.addActor(actor)).thenReturn(actor);
		mockmvc.perform(MockMvcRequestBuilders.post("/movie/addactor")
						.contentType(MediaType.APPLICATION_JSON)
		                .content(convertToJson(actor)))
						.andExpect(MockMvcResultMatchers.status().isCreated())
						.andDo(MockMvcResultHandlers.print());
	}
	
	@Test
	public void addactorFailureTest() throws Exception
	
	{
		Mockito.when(actorservice.addActor(any())).thenThrow(ActoridAlreadyExistException.class);
		
		mockmvc.perform(MockMvcRequestBuilders.post("/movie/addactor")
				.contentType(MediaType.APPLICATION_JSON)
                .content(convertToJson(actor)))
				.andExpect(MockMvcResultMatchers.status().isConflict());
		
	}
		       
	@Test
	public void deleteactorSuccess() throws Exception
	{
		Mockito.when(actorservice.deleteActor(any())).thenReturn(true);
	
		mockmvc.perform(MockMvcRequestBuilders.delete("/movie/delete/A100")
											.contentType(MediaType.APPLICATION_JSON))
							.andExpect(MockMvcResultMatchers.status().isOk());
		
	}
	


}




