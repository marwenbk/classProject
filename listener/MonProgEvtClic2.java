package listener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class MaFenetre extends JFrame implements MouseListener 
{
	public MaFenetre () 
	{
		super("Une fenetre qui traite les clics souris");
		setSize(300, 200);
		addMouseListener(this);
		//la fen�tre est son propre �couteur d��v�nements souris
	}

	//L�argument e de type MouseEvent correspond � l�objet
	//�v�nement g�n�r� dans la
	//fen�tre lors d�un clic souris.
	//On peut utiliser les informations qui lui sont associ�es.
	public void mouseClicked(MouseEvent e) { }
	public void mousePressed(MouseEvent e) { }
	public void mouseReleased(MouseEvent e) { }
	public void mouseEntered(MouseEvent e) 
	{
		int x = e.getX();
		int y = e.getY();
		//coordonn�es du curseur de la souris au moment du clic
		System.out.println("clic dans la fenetre au point de coordonnees " + x + ", " + y); 
	}
	public void mouseExited(MouseEvent e) { }
}
public class MonProgEvtClic2 
{
	public static void main(String args[]) 
	{
		JFrame fen = new MaFenetre();
		fen.setVisible(true);
	}
}