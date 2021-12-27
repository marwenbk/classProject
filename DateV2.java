import javax.swing.*;
public class DateV2 extends JFrame
	{
	 private static final long serialVersionUID = 1L;
		JComboBox monthBox = new JComboBox();
		JComboBox yearBox = new JComboBox();
		JComboBox dayBox=new JComboBox();
	 	public DateV2() 
	 	{
	 		super("donner le date");
	 		setSize(200,150);
	 		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 		JPanel p=new JPanel();
	 		JLabel l=new JLabel("votre choix: ");
	 		p.add(l);
			JLabel dayLabel = new JLabel("jour:");
			JLabel monthLabel = new JLabel("mois:");
			JLabel yearLabel = new JLabel("année:");

	 		for(int i=0;i<32;i++)
	 			dayBox.addItem(""+i);
	 		for (int i=0;i<13;i++)
	 			monthBox.addItem("" + i);
	 		for (int i=0;i<2022;i++)
	 			yearBox.addItem("" +i);
	 		p.add(dayLabel);
	 		p.add(dayBox);
	 		p.add(monthLabel);
	 		p.add(monthBox);
	 		p.add(yearLabel);
	 		p.add(yearBox);
			setContentPane(p);
	 	}

	public static void main(String[] args) {
			DateV2 date=new DateV2();
			date.show();
	}

}
