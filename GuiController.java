package LifestyleChange;

import java.awt.CardLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GuiController extends JFrame implements ActionListener, WindowListener{
	
	JPanel MainMenu ;
	JPanel Login ;
	JPanel NewAcc;
	JPanel Profile;
	JPanel Excercise;
	JPanel controller;

	JButton loginButton;
	JButton newAccButton;
	JButton submit;
	JButton excersiseButton;
	JButton back;
	
	JTextField name;
	JTextField age;
	JTextField Height;
	JTextField Weight;
	JTextField Username;
	JPasswordField Password;
	CardLayout clayout= new CardLayout();

	PList plist ;
	
	public GuiController(String title)
	{
		super(title);
		this.addWindowListener(this);
		CreateContent();
	}
	
	public void CreateContent()
	{
		MainMenu = new JPanel() ;
		Login = new JPanel() ;
		 NewAcc= new JPanel() ;
		 Profile= new JPanel() ;
		 Excercise= new JPanel() ;
		 
		name = new JTextField();
		name.setFont(new Font("Ariel", Font.PLAIN, 18));
		age = new JTextField();
		age.setFont(new Font("Ariel", Font.PLAIN, 18));
		Weight = new JTextField();
		Weight.setFont(new Font("Ariel", Font.PLAIN, 18));
		Height = new JTextField();
		Height.setFont(new Font("Ariel", Font.PLAIN, 18));
		Username = new JTextField();
		Username.setFont(new Font("Ariel", Font.PLAIN, 18));
		Password = new JPasswordField();
		Password.setFont(new Font("Ariel", Font.PLAIN, 18));
	
			
		loginButton = new JButton("Login");
		loginButton.addActionListener(this);
		
		newAccButton = new JButton("Create new Account");
		newAccButton.addActionListener(this);
		
		submit = new JButton("Submit");
		submit.addActionListener(this);

		excersiseButton = new JButton("Excercise Routine");
		excersiseButton.addActionListener(this);
		
		back = new JButton("back");
		back.addActionListener(this);
		
		JLabel username = new JLabel("Username: ");
		username.setFont( new Font("Ariel", Font.PLAIN,18));
		JLabel password = new JLabel("Password");
		password.setFont( new Font("Ariel", Font.PLAIN,18));
		JLabel Name = new JLabel("Name");
		Name.setFont(new Font("Ariel", Font.PLAIN, 18));
		JLabel Age = new JLabel("Age:");
		Age.setFont(new Font("Ariel", Font.PLAIN, 18));
		JLabel weight = new JLabel("Weight");
		weight.setFont(new Font("Ariel", Font.PLAIN, 18));
		JLabel height= new JLabel("Height");
		height.setFont(new Font("Ariel", Font.PLAIN, 18));
		
				
		MainMenu.add(loginButton);
		MainMenu.add(newAccButton);
		
		
		
		NewAcc.setLayout(new GridLayout(7, 2));
		
		NewAcc.add(username);
		NewAcc.add(Username);
		NewAcc.add(password);
		NewAcc.add(Password);
		NewAcc.add(Name);
		NewAcc.add(name);
		NewAcc.add(Age);
		NewAcc.add(age);
		NewAcc.add(weight);
		NewAcc.add(Weight);
		NewAcc.add(height);
		NewAcc.add(Height);
		NewAcc.add(submit);

		Login.setLayout(new GridLayout(10, 2));
		
		Login.add(username);
		Login.add(Username);
		Login.add(password);
		Login.add(Password);
		
		Login.add(submit);
		Login.add(back);
		



		
		
		controller = new JPanel();
		controller.setLayout(clayout);
		
		controller.add(MainMenu,"Menu");
		controller.add(Login,"Login");
		controller.add(NewAcc, "New_Account");
		controller.add(Profile, "Profile");
		
		
		this.setContentPane(controller);
		clayout.show(controller, "mainMenu");
		
}
	
	
	
	

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		JButton click = (JButton)e.getSource();
		
		if (click.equals(loginButton))
		{			clayout.show(controller, "Login");
			
		}
		
		if(click.equals(newAccButton))
		{
			System.out.println("new account");
			clayout.show(controller, "New_Account");
			
		}
		
		if(click.equals(submit))
		{
		
			clayout.show(controller, "Profile");
		}
		
		if(click.equals(back))
		{
			clayout.previous(controller);
		}
}

	}


