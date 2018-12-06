import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	String flavor = JOptionPane.showInputDialog("What flavor popcorn do you want?");
	Popcorn pop =  new Popcorn(flavor);	
	Microwave micro = new Microwave();
	micro.putInMicrowave(pop);
	String cooking = JOptionPane.showInputDialog("How long do you want to cook the popcorn?");
}
}
