
public class Tournament {
	public static void main(String[] args) {
		Worms[] team1;
		Worms[] team2;

			team1 = new Worms[5];
			for (int i=0; i<5;i++) {
				team1[i] = new Worms(1);
			}
			team2 = new Worms[5];
			for (int i=0; i<5;i++) {
				team2[i] = new Worms(2);
			}

	}
}
