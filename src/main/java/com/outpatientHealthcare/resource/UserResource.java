package com.outpatientHealthcare.resource;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.Response.Status;

import com.outpatientHealthcare.model.User;
import com.outpatientHealthcare.resource.beans.UserVO;
import com.outpatientHealthcare.service.UserService;
import com.outpatientHealthcare.util.CommonUtils;


@Path("/users")
public class UserResource {
	
	UserService userService;
	
	public UserResource() {
		userService = new UserService();
	}
	
	@GET
	@Produces(value={MediaType.APPLICATION_JSON})
	public Response getUsers(@Context UriInfo uriinfo) {
		List<User> usersList = userService.getUsers();
		List<UserVO> userVOList = new ArrayList<UserVO>();
		for (User user : usersList) {
			UserVO userVO = CommonUtils.userToUserVO(user);
			userVOList.add(userVO);
		}
		GenericEntity <List<UserVO>> entity = new GenericEntity<List<UserVO>>(userVOList){};
		return Response.status(Status.OK).entity(entity).build();
	}

	@GET
	@Path("/{userId}")
	@Produces(value={MediaType.APPLICATION_JSON})
	public Response getUser(@PathParam("userId") int userId){
		User user = userService.getUser(userId);
		UserVO userVO = CommonUtils.userToUserVO(user);
		return Response.status(Status.OK)
				.entity(userVO)
				.build();
	}
	
	@POST
	@Produces(value ={MediaType.APPLICATION_JSON,MediaType.TEXT_XML})
	@Consumes(value = {MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
	public Response registerUser(UserVO userVO, @Context UriInfo uriInfo){
		User user = CommonUtils.userVOToUser(userVO);
		user = userService.saveUser(user);
		userVO.setUserId(user.getUserId());
		return Response.status(Status.OK)
				.entity(userVO)
				.build();
	}
	
	@GET
	@Path("/{email}/{password}")
	@Produces(value ={MediaType.APPLICATION_JSON,MediaType.TEXT_XML})
	public Response login(@PathParam("email") String email, @PathParam("password") String password){
		User user = userService.loginUser(email,password);
		UserVO userVO = CommonUtils.userToUserVO(user);
		return Response.status(Status.OK)
				.entity(userVO)
				.build();
	}
}
