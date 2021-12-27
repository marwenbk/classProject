qzimport javax.swing.*;
public class Uses extends JFrame 
	{
	// private static final long serialVersionUID = 1L;
	 public Uses() 
	 {
		super("Password");
		setSize(500,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p = new JPanel();
		JLabel nameLabel = new JLabel("Username:");
		JTextField username = new JTextField (8);
		JLabel passwordLabel = new JLabel ("Password \n:");
		JPasswordField password = new JPasswordField(8);
		p.add (nameLabel);
		p.add (username);
		p.add (passwordLabel);
		p.add (password);
		setContentPane(p);
	 }
		//@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		Uses uses=new Uses();
		uses.show();
	}

}

public class Uses extends JFrame 
	{
	 private static final long serialVersionUID = 1L;
	 public Uses() 
	 {
		super("Password");
		setSize(500,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p = new JPanel();
		JLabel nameLabel = new JLabel("Username:");
		JTextField username = new JTextField (15);
		JLabel passwordLabel = new JLabel ("Password \n:");
		JPasswordField password = new JPasswordField(8);
		p.add (nameLabel);
		p.add (username);
		p.add (passwordLabel);
		p.add (password);
		setContentPane(p);
	 }
		@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		Uses uses=new Uses();
		uses.show();
	}

}
