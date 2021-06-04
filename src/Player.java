
public class Player implements Comparable<Player> {
	private int ranking;
	private String name;
	private int age;
	
	public Player(int ranking, String name, int age) {
		this.ranking = ranking;
		this.name = name;
		this.age = age;
	}
	
	public int getRanking() {
		return ranking;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int compareTo(Player player) {
		if(this.ranking == player.getRanking()) {
			return 0;
		}
		else if(this.ranking < player.getRanking()) {
			return 1;
		}
		else {
			return -1;
		}
	}
}
