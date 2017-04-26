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

import com.outpatientHealthcare.model.BloodPressure;
import com.outpatientHealthcare.resource.beans.BloodPressureVO;
import com.outpatientHealthcare.service.BloodPressureService;
import com.outpatientHealthcare.util.CommonUtils;


@Path("/bloodpressure")
public class BloodPressureResource {
	
	BloodPressureService bpService;
	
	public BloodPressureResource () {
		bpService = new BloodPressureService();
	}
	
	@GET
	@Produces(value={MediaType.APPLICATION_JSON})
	public Response getAllBp(@Context UriInfo uriinfo) {
		List<BloodPressure> bpList = bpService.getBloodPressure();
		List<BloodPressureVO> bpVOList = new ArrayList<BloodPressureVO>();
		for (BloodPressure bp : bpList) {
			BloodPressureVO bpVO = CommonUtils.bpToBpVO(bp);
			bpVOList.add(bpVO);
		}
		GenericEntity <List<BloodPressureVO>> entity = new GenericEntity<List<BloodPressureVO>>(bpVOList){};
		return Response.status(Status.OK).entity(entity).build();
	}


}
