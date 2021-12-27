package listener;
import java.awt.event.*;
import javax.swing.*;


class MaFenetre extends JFrame 
{
	public MaFenetre () 
	{
		super("Une fenetre qui traite les clics souris");
		setSize(300, 200);
		addMouseListener(new EcouteurSouris());
		//la fen�tre fait appel � un �couteur d��v�nements souris 
		//pour traiter les clics souris
	}
}
//L��couteur d��v�nements souris doit impl�menter l�interface 
//MouseListener qui correspond
// � une cat�gorie d��v�nements souris.
class EcouteurSouris implements MouseListener 
{
	//red�finition de la m�thode appel�e lors d�un clic souris
	public void mouseClicked(MouseEvent e) 
	{
	System.out.println("clic dans la fenetre");
	}
	//la red�finition des autres m�thodes est "vide"
	public void mousePressed(MouseEvent e) { }
	public void mouseReleased(MouseEvent e) { }
	public void mouseEntered(MouseEvent e) { }
	public void mouseExited(MouseEvent e) { }

}
public class MonProgEvtClic1 
{
	public static void main(String args[]) 
	{
		JFrame fen = new MaFenetre();
		fen.setVisible(true);
	}
}