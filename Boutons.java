import javax.swing.*;
public class Boutons extends JFrame
{
	//private static final long serialVersionUID = 1L;
		JButton b1= new JButton("confirmer");
		JButton b2= new JButton("Annuler");
		JButton b3= new JButton("Ressayer");
		public Boutons() 
		{	
			super("taper une Bouton");
			setSize(400, 140);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JPanel panel=new JPanel();
			panel.add(b1);
			panel.add(b2);
			panel.add(b3);
			setContentPane(panel);
		}
		//@SuppressWarnings("deprecation")
		public static void main(String[] args) 
		{
			Boutons b=new Boutons();
			b.show();
	    }
}

