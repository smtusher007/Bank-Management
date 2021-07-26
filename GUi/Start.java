import javax.swing.JOptionPane;//try every option
import javax.swing.ImageIcon;

class Start
{
	public static void main(String args[])
	{
		ImageIcon img = new ImageIcon("java.png");
		ImageIcon icon = new ImageIcon("java2.png");
		String name = JOptionPane.showInputDialog(null,"Enter your name","Log in",JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null,"Welcome"+name,"Welcoming",JOptionPane.PLAIN_MESSAGE);
		int choice = JOptionPane.showConfirmDialog(null,"Are you Sleeping now?","Question1",JOptionPane.YES_NO_OPTION);
		if(choice == JOptionPane.YES_OPTION)
		{
			JOptionPane.showMessageDialog(null,"Wake up Then","Order",JOptionPane.WARNING_MESSAGE,icon);
		}
		else
		{
			int a = JOptionPane.showConfirmDialog(null,"Are you bored? ","Question2",JOptionPane.YES_NO_OPTION);
			if(a == JOptionPane.YES_OPTION)
			{
				JOptionPane.showMessageDialog(null,"Play some games");
			}
			else
			{
				int b = JOptionPane.showConfirmDialog(null,"Do you want to Exit the Programe","Question3",JOptionPane.YES_NO_OPTION);
				if(b==JOptionPane.YES_OPTION)
				{
					System.exit(0);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Leave it madafakar","compliment",JOptionPane.WARNING_MESSAGE,img);
				}
			
			}
		}
		String n = JOptionPane.showInputDialog(null,"What is you doing then?","Question",JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null,"Don't do "+n,"no",JOptionPane.WARNING_MESSAGE);
		int b = JOptionPane.showConfirmDialog(null,"Do you want to Exit the Programe","Question3",JOptionPane.YES_NO_OPTION);
		if(b==JOptionPane.YES_OPTION)
		{
			System.exit(0);
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Leave it madafakar","compliment",JOptionPane.WARNING_MESSAGE,img);
		}
	}
}