
import javax.swing.JOptionPane;

public class Teams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String team;
		int team1;
		team = JOptionPane.showInputDialog("Enter number of people in team ");
		team1 = Integer.parseInt(team);
		if (team1>=11&&team1<=55)
			
			JOptionPane.showMessageDialog(null, "The number of players in your team are " + team1/11);
		
		else JOptionPane.showMessageDialog(null, "your team size is 1 ");
	}


}

