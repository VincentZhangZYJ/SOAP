package yujian.ts;

import java.util.Date;

import javax.jws.WebService;

@WebService(endpointInterface="yujian.ts.TimeServer")
public class TimeServerImpl implements TimeServer {

	public String getTimeAsString() {
		// TODO Auto-generated method stub
		return new Date().toString();
	}

	public long getTimeAsElapsed() {
		// TODO Auto-generated method stub
		return new Date().getTime();
	}

}
