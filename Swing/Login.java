import javax.swing.*;

public class Login {
    public static void main(String[] args) 
    {
        JFrame f = new JFrame("Login");
        
        JLabel titleLabel = new JLabel("Login");
        titleLabel.setBounds(150, 20, 100, 40);
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
       
        
        JLabel infoLabel = new JLabel("Please enter your login and your password");
        infoLabel.setBounds(50, 60, 300, 20);
        infoLabel.setHorizontalAlignment(SwingConstants.CENTER);
        
        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(50, 100, 80, 25);
        JTextField usernameField = new JTextField();
        usernameField.setBounds(150, 100, 200, 25);
        
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 140, 80, 25);
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(150, 140, 200, 25);
        
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(150, 180, 100, 30);
        
        f.add(titleLabel);
        f.add(infoLabel);
        f.add(usernameLabel);
        f.add(usernameField);
        f.add(passwordLabel);
        f.add(passwordField);
        f.add(loginButton);
        f.setSize(400,300);    
        f.setLayout(null);    
        f.setVisible(true);   
    }
}
        
        