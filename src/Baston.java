public class Baston {
	public static void main(String[] args) {
		Worms worms1 = new Worms(1);
		Worms worms2 = new Worms(2);

		while (worms1.isAlive() && worms2.isAlive()) {
			worms2.setHp(worms2.getHp()-worms1.getDamage());
			if(worms2.getHp() < 1) {
				int bonusLife = (int) (worms1.getHp()*0.20);
				worms1.setHp(worms1.getHp()+bonusLife);
				worms1.setAlive(false);
				System.out.println("le worms 1 de l'equipe "+worms1.getTeam()+" à gagner, il lui reste "+ worms1.getHp() +"hp");
				break;
			}
			worms1.setHp(worms1.getHp()-worms2.getDamage());
			if(worms1.getHp() < 1) {
				int bonusLife = (int) (worms2.getHp()*0.20);
				worms2.setHp(worms2.getHp()+bonusLife);
				worms1.setAlive(false);
				System.out.println("le worms 2 de l'equipe "+worms2.getTeam()+" à gagner, il lui reste "+ worms2.getHp()+"hp");
				break;
			}
		}
	}
}