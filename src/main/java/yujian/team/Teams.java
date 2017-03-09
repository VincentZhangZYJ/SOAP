package yujian.team;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Teams {
	private TeamUtility utils;
	public Teams(){
		utils=new TeamUtility();
		utils.make_test_teams();
	}
	@WebMethod
	public Team getTeam(String name){return utils.getTeam(name);}
	@WebMethod
	public List<Team> getTeams(){return utils.getTeams();}
}
