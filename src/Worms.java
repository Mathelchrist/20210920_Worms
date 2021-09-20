import java.lang.Math;

public class Worms {
	int hps = (int)(Math.random()*(120-80+1)+80);  
	private int hp = hps;
	int damages = (int)(Math.random()*(40-20+1)+20);  
	private int damage = damages;
	private boolean alive = true;
	private int team;
	
	
	public int getTeam() {
		return team;
	}
	public void setTeam(int team) {
		this.team = team;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getDamage() {
		return damage;
	}
	public boolean isAlive() {
		return alive;
	}
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	
}
