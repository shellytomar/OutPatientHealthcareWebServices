package com.outpatientHealthcare.util;

import java.util.Calendar;

import com.outpatientHealthcare.model.User;
import com.outpatientHealthcare.model.BloodPressure;
import com.outpatientHealthcare.model.HeartBeat;
import com.outpatientHealthcare.resource.beans.UserVO;
import com.outpatientHealthcare.resource.beans.BloodPressureVO;
import com.outpatientHealthcare.resource.beans.HeartBeatVO;

public class CommonUtils {

	public static UserVO userToUserVO(User user){
		if(user!=null){
			
			return new UserVO(user.getUserId(), user.getEmail(), user.getName(), user.getPassword(), user.getPhoneNumber(), user.getAge(),user.getWeight(), user.getHeight(), user.getGender());
		}else
			return null;
	}

	public static User userVOToUser(UserVO user){
		if(user!=null)
			return new User(user.getUserId(), user.getEmail(), user.getName(), user.getPassword(), user.getPhoneNumber(),user.getAge(), user.getWeight(), user.getHeight(), user.getGender());
		else
			return null;
	}
	
	public static HeartBeatVO heartBeatToHeartBeatVO (HeartBeat hBeat) {
		if (hBeat != null) {
			return new HeartBeatVO(hBeat.getId(), hBeat.getDate(), hBeat.getMaxTime(),  hBeat.getMaxHeartBeat(), hBeat.getMinTime(), hBeat.getMinHeartBeat());
		} else
			return null;
	}
	
	public static BloodPressureVO bpToBpVO (BloodPressure bp) {
		if (bp != null) {
			return new BloodPressureVO (bp.getId(), bp.getSystolicBP(), bp.getDiastolicBP(), bp.getDateTime());
		} else
			return null;
	}
	
	public static String getTodaysDate(){
        Calendar c = Calendar.getInstance();
        return c.get(Calendar.DAY_OF_MONTH)+"-"+String.valueOf(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.YEAR);
    }
	

}

