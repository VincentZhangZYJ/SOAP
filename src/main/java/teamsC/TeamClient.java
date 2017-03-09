package teamsC;

import java.util.List;

public class TeamClient {
	public static void main(String[] args){
		TeamsService service=new TeamsService();
		Teams port=service.getTeamsPort();
		List<Team> teams=port.getTeams();
		for(Team team:teams){
			System.out.println(team.getName());
			for(Player player:team.getPlayers()){
				System.out.println(player.getName()+"|"+player.getNickname());
			}
		}
	}
}
