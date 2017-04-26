package com.outpatientHealthcare.resource;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;

import com.outpatientHealthcare.model.HeartBeat;
import com.outpatientHealthcare.resource.beans.HeartBeatVO;
import com.outpatientHealthcare.service.HeartBeatService;
import com.outpatientHealthcare.util.CommonUtils;


@Path("/heartbeat")
public class HeartBeatResource {
	
	HeartBeatService heartBeatService;
	
	public HeartBeatResource() {
		heartBeatService = new HeartBeatService();
	}

//	@GET
//	@Path("/{userId}")
//	@Produces(value={MediaType.APPLICATION_JSON})
//	public Response getHeartBeat(@PathParam("userId") int userId){
//		HeartBeat hBeat = heartBeatService.getHeartBeat(userId);
//		HeartBeatVO hBeatVO = CommonUtils.heartBeatToHeartBeatVO(hBeat);
//		return Response.status(Status.OK)
//				.entity(hBeatVO)
//				.build();
//	}
	
	/*
	@GET
	@Produces(value={MediaType.APPLICATION_JSON})
	public Response getMaxHeartBeat(){
		List<HeartBeat> hBeatList = heartBeatService.getMaxHeartBeat();
		List<HeartBeatVO> hBeatVOList = new ArrayList<HeartBeatVO>();
		for(HeartBeat hBeat : hBeatList) {
			HeartBeatVO hBeatVO = new HeartBeatVO(hBeat.getId(), hBeat.getDate(), hBeat.getMaxTime(), hBeat.getMaxHeartBeat(), hBeat.getMinTime(), hBeat.getMinHeartBeat());
			hBeatVOList.add(hBeatVO);
		}
		
		GenericEntity<List<HeartBeatVO>> entity = new GenericEntity<List<HeartBeatVO>>(hBeatVOList){};
		return Response.status(Status.OK).entity(entity).build();
	}
	*/
	
	@GET
	@Produces(value={MediaType.APPLICATION_JSON})
	public Response getAllHeartBeat(@Context UriInfo uriinfo) {
		List<HeartBeat> hrList = heartBeatService.getHeartBeat();
		List<HeartBeatVO> hrVOList = new ArrayList<HeartBeatVO>();
		for (HeartBeat hr : hrList) {
			HeartBeatVO hrVO = CommonUtils.heartBeatToHeartBeatVO(hr);
			hrVOList.add(hrVO);
		}
		GenericEntity <List<HeartBeatVO>> entity = new GenericEntity<List<HeartBeatVO>>(hrVOList){};
		return Response.status(Status.OK).entity(entity).build();
	}

}
