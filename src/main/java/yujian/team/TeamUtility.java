package yujian.team;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TeamUtility {
	private Map<String,Team> team_map;
	public TeamUtility(){
		team_map=new HashMap<String,Team>();
	}
	public List<Team> getTeams() {
		List<Team> list=new ArrayList<Team>();
		Set<String> keys=team_map.keySet();
		for(String key:keys){
			list.add(team_map.get(key));
		}
		return list;
		// TODO Auto-generated method stub
		
	}

	public Team getTeam(String name) {
		// TODO Auto-generated method stub
		return team_map.get(name);
	}

	public void make_test_teams() {
		// TODO Auto-generated method stub
		List<Team> teams=new ArrayList<Team>();
		Player a=new Player("a","aaa");
		Player b=new Player("b","bbb");
		Player c=new Player("c","ccc");
		List<Player> mb=new ArrayList<Player>();
		mb.add(a);
		mb.add(b);
		mb.add(c);
		Team marx_brothers=new Team("Marx Brothers",mb);
		teams.add(marx_brothers);
		store_teams(teams);
	}
	private void store_teams(List<Team> teams){
		for(Team team:teams){
			team_map.put(team.getName(), team);
		}
	}

}
