import javax.swing.*;
public class  villes extends JFrame
{	
	private static final long serialVersionUID = 1L;
	 JRadioButton b[]= new JRadioButton[4];
	 
	public villes() 
	{	
		super("villes");
		setSize(250,175);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b[0]=new JRadioButton("London");
		b[1]=new JRadioButton("Berlin");
		b[2]=new JRadioButton("Moscow");
		b[3]=new JRadioButton("Tokyo");
		 ButtonGroup B=new ButtonGroup();
		JPanel p=new JPanel();
		for (int i = 0; i < b.length; i++) 
		{
			B.add(b[i]);
			p.add(b[i]);
		}
		setContentPane(p);
	}
	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
		{
			villes v=new villes();
			v.show();
		}

}



