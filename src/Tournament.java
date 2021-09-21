
public class Tournament {
	public static void main(String[] args) {
		Worms[] team1;                                            // creation des equipes
		Worms[] team2;


		team1 = new Worms[5];
		for (int i=0; i<5;i++) {
			team1[i] = new Worms(1);
		}
		team2 = new Worms[5];
		for (int j=0; j<5;j++) {
			team2[j] = new Worms(2);
		}
		Tournament tournament = new Tournament();
		tournament.baston(team1, team2);
	}
	public static String baston(Worms team1[], Worms team2[]) {
		int i = 0;
		int j = 0;
		String winner = "aucun";
		while (team1[4].isAlive() && team2[4].isAlive()) {
			//equipe 1 attaque
			team2[j].setHp(team2[j].getHp()-team1[i].getDamage()); //attaque effectué
			if(team2[j].getHp() < 1) {							//controle si worms en vie
				int bonusLife = (int) (team1[i].getHp()*0.20); //augmentation des hp
				team1[i].setHp(team1[i].getHp()+bonusLife);
				team2[j].setAlive(false);						//tue le worms qui n'a plus de hp
				if (!team2[4].isAlive()) {						// si le dernier worms d'une equipe est mort alors message de victoire
					System.out.println("L'equipe 1 à gagné");
					winner = "L'equipe 1 à gagné";
					break;
				}
				j++;
				System.out.println("l'equipe "+team1[i].getTeam()+" à tuer un worms, il reste "+ team1[i].getHp() +"hp au worms en vie, il a tué le worms numéro " + j +" de l'equipe 2" );

			}
			//equipe 2 attaque
			team1[i].setHp(team1[i].getHp()-team2[j].getDamage());
			if(team1[i].getHp() < 1) {
				int bonusLife = (int) (team2[j].getHp()*0.20);
				team2[j].setHp(team2[j].getHp()+bonusLife);
				team1[i].setAlive(false);
				if (!team1[4].isAlive()) {
					System.out.println("L'equipe 2 à gagné");
					winner = "L'equipe 2 à gagné";
					break;
				}
				i++;
				System.out.println("l'equipe "+team2[j].getTeam()+" à tuer un worms, il reste "+ team2[j].getHp()+"hp au worms en vie, il a tué le worms numéro " + i +" de l'equipe 1");

			}
		}
		return winner;
	}
}

