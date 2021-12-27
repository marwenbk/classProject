import javax.swing.*;
import java.util.*; 
import java.awt.event.*;
import java.awt.BorderLayout;
public class convertir extends JFrame implements ActionListener 
{
	Scanner input = new Scanner(System.in);
	List arrayList = new ArrayList();
	JButton b=new JButton("convertir");
	JPanel p=new JPanel();
	JLabel label= new JLabel ("=");
	JTextField UB = new JTextField (8);
	JComboBox uniteBox = new JComboBox();
	JTextField UB2  = new JTextField (8);
	JComboBox newuniteBox = new JComboBox();
	public convertir()
	{
		super("convertisseur de monnaies");
		setSize(500,150);
		b.setLayout(new BoxLayout(b, BoxLayout.LINE_AXIS));
		b.addActionListener(this);
		uniteBox.addActionListener(this);
		newuniteBox.addActionListener(this);
		ArrayList<String> unite=new ArrayList<String>();
		unite.add("$");
		unite.add("€");
		unite.add("£");
		unite.add("dt");
		for(String u: unite)
		{
			uniteBox.addItem("" + u);
 			newuniteBox.addItem("" + u);
		}		
 		p.add(UB);
 		p.add(uniteBox);
 		p.add(label);
 		p.add(UB2);
 		p.add(newuniteBox);
 		p.add(b);
		setContentPane(p);
		
		// TODO Auto-generated constructor stub
	}
	
	
	public static void main (String[]a)
	{
		convertir c = new convertir();
		c.show();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b)
		{
			double d=Double.valueOf(UB.getText()).floatValue();
			if (uniteBox.getSelectedIndex()=='$') 
				{	
					if (newuniteBox.getSelectedIndex()=='€')
					{
					d=d*0.89;
					UB2.setText("%.2f"+d);
					}
					else if (newuniteBox.getSelectedIndex()=='£')
					{
					d=d*0.75;
					UB2.setText("%.2f"+d);
					}
					else 
					{
					d=d*2.89;
					UB2.setText("%.2f"+d);
					}
					
				}
			else if (uniteBox.getSelectedIndex()=='€') 
			{	
				if (newuniteBox.getSelectedIndex()=='$')
				{
				d=d/0.89;
				UB2.setText("%.2f"+d);
				}
				else if (newuniteBox.getSelectedIndex()=='£')
				{
				d=d*0.85;
				UB2.setText("%.2f"+d);
				}
				else 
				{
				d=d*3.25;
				UB2.setText("%.2f"+d);
				}
				
			}
			else if (uniteBox.getSelectedIndex()=='£') 
			{	
				if (newuniteBox.getSelectedIndex()=='$')
				{
				d=d/0.75;
				UB2.setText("%.2f"+d);
				}
				else if (newuniteBox.getSelectedIndex()=='€')
				{
				d=d/0.85;
				UB2.setText("%.2f"+d);
				}
				else 
				{
				d=d*3.83;
				UB2.setText("%.2f"+d);
				}
				
			}
			else  
			{	
				if (newuniteBox.getSelectedIndex()=='$')
				{
				d=d/2.89;
				UB2.setText("%.2f"+d);
				}
				else if (newuniteBox.getSelectedIndex()=='€')
				{
				d=d/3.25;
				UB2.setText("%.2f"+d);
				}
				else 
				{
				d=d/3.83;
				UB2.setText("%.2f"+d);
				}
				
			}
			 
		}
		
	}

}
