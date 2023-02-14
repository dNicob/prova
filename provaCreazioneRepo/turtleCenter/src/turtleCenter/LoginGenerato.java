package turtleCenter;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class LoginGenerato {

  public LoginGenerato() {
	  JFrame frame = new JFrame("Login");
	    frame.setSize(400, 300);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setLayout(new BorderLayout());
	    frame.getContentPane().setBackground(new Color(230, 230, 250));

	    JPanel imagePanel = new JPanel();
	    imagePanel.setBackground(new Color(230, 230, 250));
	   /* BufferedImage image = null;
	    try {
	      image = ImageIO.read(new File("login_image.jpg"));
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	    JLabel imageLabel = new JLabel(new ImageIcon(image));
	    imagePanel.add(imageLabel);
	    frame.add(imagePanel, BorderLayout.WEST);*/

	    JPanel formPanel = new JPanel();
	    formPanel.setBackground(new Color(230, 230, 250));
	    formPanel.setLayout(new GridBagLayout());
	    GridBagConstraints constraints = new GridBagConstraints();
	    constraints.insets = new Insets(10, 10, 10, 10);

	    JLabel titleLabel = new JLabel("Login");
	    titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
	    constraints.gridx = 0;
	    constraints.gridy = 0;
	    constraints.gridwidth = 2;
	    constraints.anchor = GridBagConstraints.CENTER;
	    formPanel.add(titleLabel, constraints);

	    JLabel usernameLabel = new JLabel("Username:");
	    usernameLabel.setFont(new Font("Arial", Font.PLAIN, 18));
	    usernameLabel.setForeground(new Color(25, 25, 112));
	    constraints.gridx = 0;
	    constraints.gridy = 1;
	    constraints.gridwidth = 1;
	    constraints.anchor = GridBagConstraints.EAST;
	    formPanel.add(usernameLabel, constraints);

	    JTextField usernameTextField = new JTextField(20);
	    usernameTextField.setFont(new Font("Arial", Font.PLAIN, 18));
	    usernameTextField.setBackground(new Color(255, 255, 240));
	    constraints.gridx = 1;
	    constraints.gridy = 1;
	    constraints.anchor = GridBagConstraints.WEST;
	    formPanel.add(usernameTextField, constraints);
	    
	    JLabel passwordLabel = new JLabel("Password:");
	    passwordLabel.setFont(new Font("Arial", Font.PLAIN, 18));
	    passwordLabel.setForeground(new Color(25, 25, 112));
	    constraints.gridx = 0;
	    constraints.gridy = 2;
	    constraints.anchor = GridBagConstraints.EAST;
	    formPanel.add(passwordLabel, constraints);

	    JPasswordField passwordField = new JPasswordField(20);
	    passwordField.setFont(new Font("Arial", Font.PLAIN, 18));
	    passwordField.setBackground(new Color(255, 255, 240));
	    constraints.gridx = 1;
	    constraints.gridy = 2;
	    constraints.anchor = GridBagConstraints.WEST;
	    formPanel.add(passwordField, constraints);

	    JButton loginButton = new JButton("Login");
	    loginButton.setFont(new Font("Arial", Font.PLAIN, 18));
	    loginButton.setForeground(new Color(255, 255, 255));
	    loginButton.setBackground(new Color(25, 25, 112));
	    constraints.gridx = 0;
	    constraints.gridy = 3;
	    constraints.gridwidth = 2;
	    constraints.anchor = GridBagConstraints.CENTER;
	    formPanel.add(loginButton, constraints);
	    loginButton.addActionListener(new ActionListener() {
	      @Override
	      public void actionPerformed(ActionEvent e) {
	        // codice per l'autenticazione dell'utente
	      }
	    });

	    frame.add(formPanel, BorderLayout.CENTER);

	    frame.setVisible(true);
	  }
	
  }
  



