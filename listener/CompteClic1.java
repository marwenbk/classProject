package listener;
import javax.swing.*;
import java.awt.event.*;

public class CompteClic1 extends JFrame implements ActionListener
{
	int i=0;
	JLabel xe= new JLabel ("nombre de clics: 0");
	JButton b=new JButton("cliquer!");
	public CompteClic1()
	{
		super("Compteur");
		setSize(250,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b.addActionListener(this);
		JPanel p=new JPanel();
		p.add(b);
		p.add(xe);
		setContentPane(p);
	}
	public void actionPerformed(ActionEvent e)
	{
		i++;
		xe.setText("Nombre de clics = " +i);
	}
	public static void main (String[]a)
	{
		CompteClic1 c = new CompteClic1();
		c.show();
	}
	
}