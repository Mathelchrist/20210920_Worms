import java.lang.Math;
import java.util.Objects;

public class Worms {
	int hps = (int)(Math.random()*(120-80+1)+80);  
	private int hp = hps;
	int damages = (int)(Math.random()*(40-20+1)+20);  
	private int damage = damages;
	private boolean alive = true;
	private int team;
	
	public Worms() {};
	public Worms(int team) {
		this.team = team;
		};
	
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
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public boolean isAlive() {
		return alive;
	}
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(alive, damage, damages, hp, hps, team);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Worms other = (Worms) obj;
		return alive == other.alive && damage == other.damage && damages == other.damages && hp == other.hp
				&& hps == other.hps && team == other.team;
	}
	
}
