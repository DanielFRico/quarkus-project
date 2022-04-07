package org.mobiera.services;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.mobiera.entities.User;
import org.mobiera.repositories.UserRepository;

@Path("/user")
public class UserService {

	@Inject
	UserRepository userRepository;

	@GET
	public Response getUsers() {
		try {
			return Response.ok(userRepository.listAll()).status(Response.Status.OK).build();
		} catch (Exception e) {
			return Response.ok(e.getMessage()).status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}

	@POST
	@Transactional
	public Response save(User user) {
		try {
			userRepository.persist(user);
			return Response.ok(user).status(Response.Status.CREATED).build();
		} catch (Exception e) {
			return Response.ok(e.getMessage()).status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}

	}
}
