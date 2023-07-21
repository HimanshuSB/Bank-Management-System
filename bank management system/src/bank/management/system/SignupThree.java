
package bank.management.system;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener
{
    String formno;
    JLabel additionalDetails,account_typeJLabel,Card_JLabel,Number_JLabel,details_JLabel,Pin_JLabel,Pnumber_JLabel,pdetails_JLabel,Services_JLabel;
    JRadioButton Saving_JRadioButton, Fixed_JRadioButton, Current_JRadioButton, Recurring_JRadioButton;
    JCheckBox ATM_checkbox,internet_checkbox,mob_checkbox,email_checkbox,cheque_checkbox,e_checkbox;
    JButton submit,cancel;
    
    SignupThree(String formno)
    {
        this.formno = formno;
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 3");
    
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l14 = new JLabel(i3);
        l14.setBounds(20, 0, 100, 100);
        add(l14);
        
        additionalDetails = new JLabel("Page 3: Account Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(280,40,400,40);
        add(additionalDetails);
        
        account_typeJLabel = new JLabel("Account Type:");
        account_typeJLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        account_typeJLabel.setBounds(100,140,200,30);
        add(account_typeJLabel);
        
        Saving_JRadioButton = new JRadioButton("Saving Account");
        Saving_JRadioButton.setFont(new Font("Raleway", Font.BOLD, 14));
        Saving_JRadioButton.setBackground(Color.WHITE);
        Saving_JRadioButton.setBounds(100,180,250,20);
        add(Saving_JRadioButton);
        
        Fixed_JRadioButton = new JRadioButton("Fixed Deposit Account");
        Fixed_JRadioButton.setFont(new Font("Raleway", Font.BOLD, 14));
        Fixed_JRadioButton.setBackground(Color.WHITE);
        Fixed_JRadioButton.setBounds(350,180,250,20);
        add(Fixed_JRadioButton);
        
        Current_JRadioButton = new JRadioButton("Current Account");
        Current_JRadioButton.setFont(new Font("Raleway", Font.BOLD, 14));
        Current_JRadioButton.setBackground(Color.WHITE);
        Current_JRadioButton.setBounds(100,220,250,20);
        add(Current_JRadioButton);
        
        Recurring_JRadioButton = new JRadioButton("Recurring Deposit Account");
        Recurring_JRadioButton.setFont(new Font("Raleway", Font.BOLD, 14));
        Recurring_JRadioButton.setBackground(Color.WHITE);
        Recurring_JRadioButton.setBounds(350,220,250,20);
        add(Recurring_JRadioButton);
        
        ButtonGroup groupgender = new ButtonGroup();
        groupgender.add(Saving_JRadioButton);
        groupgender.add(Fixed_JRadioButton);
        groupgender.add(Current_JRadioButton);
        groupgender.add(Recurring_JRadioButton);
        
        Card_JLabel = new JLabel("Card Number");
        Card_JLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        Card_JLabel.setBounds(100,300,200,30);
        add(Card_JLabel);
        
        Number_JLabel = new JLabel("XXXX-XXXX-XXXX-8475");
        Number_JLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        Number_JLabel.setBounds(350,300,300,30);
        add(Number_JLabel);
        
        details_JLabel = new JLabel("(Your 16-digit Card number)");
        details_JLabel.setFont(new Font("Raleway", Font.BOLD, 12));
        details_JLabel.setBounds(100,330,300,20);
        add(details_JLabel);
        
        Pin_JLabel = new JLabel("Pin:");
        Pin_JLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        Pin_JLabel.setBounds(100,370,200,30);
        add(Pin_JLabel);
        
        Pnumber_JLabel = new JLabel("XXXX");
        Pnumber_JLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        Pnumber_JLabel.setBounds(350,370,300,30);
        add(Pnumber_JLabel);
        
        pdetails_JLabel = new JLabel("(Your 04-digit Pin number)");
        pdetails_JLabel.setFont(new Font("Raleway", Font.BOLD, 12));
        pdetails_JLabel.setBounds(100,400,300,20);
        add(pdetails_JLabel);
        
        Services_JLabel = new JLabel("Services Required:");
        Services_JLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        Services_JLabel.setBounds(100,450,200,30);
        add(Services_JLabel);
        
        ATM_checkbox = new JCheckBox("ATM CARD");
        ATM_checkbox.setBackground(Color.WHITE);
        ATM_checkbox.setFont(new Font("Raleway", Font.BOLD, 16));
        ATM_checkbox.setBounds(100,500,200,30);
        add(ATM_checkbox);
        
        internet_checkbox = new JCheckBox("Internet Banking");
        internet_checkbox.setBackground(Color.WHITE);
        internet_checkbox.setFont(new Font("Raleway", Font.BOLD, 16));
        internet_checkbox.setBounds(350,500,200,30);
        add(internet_checkbox);
        
        mob_checkbox = new JCheckBox("Mobile Banking");
        mob_checkbox.setBackground(Color.WHITE);
        mob_checkbox.setFont(new Font("Raleway", Font.BOLD, 16));
        mob_checkbox.setBounds(100,550,200,30);
        add(mob_checkbox);
        
        email_checkbox = new JCheckBox("EMAIL Alerts");
        email_checkbox.setBackground(Color.WHITE);
        email_checkbox.setFont(new Font("Raleway", Font.BOLD, 16));
        email_checkbox.setBounds(350,550,200,30);
        add(email_checkbox);
        
        cheque_checkbox = new JCheckBox("Cheque Book");
        cheque_checkbox.setBackground(Color.WHITE);
        cheque_checkbox.setFont(new Font("Raleway", Font.BOLD, 16));
        cheque_checkbox.setBounds(100,600,200,30);
        add(cheque_checkbox);
        
        e_checkbox = new JCheckBox("E-Statement");
        e_checkbox.setBackground(Color.WHITE);
        e_checkbox.setFont(new Font("Raleway", Font.BOLD, 16));
        e_checkbox.setBounds(350,600,200,30);
        add(e_checkbox);
        
        e_checkbox = new JCheckBox("I hereby declares that the above entered details correct to th best of my knowledge.",false);
        e_checkbox.setBackground(Color.WHITE);
        e_checkbox.setFont(new Font("Raleway", Font.BOLD, 12));
        e_checkbox.setBounds(100,680,600,30);
        add(e_checkbox);
        
        submit = new JButton("Submit");
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setBounds(250,720,100,30);
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setBounds(420,720,100,30);
        add(cancel);
        
        submit.addActionListener(this);
        cancel.addActionListener(this);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,850);
        setLocation(500,120);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        String accountType = null;
        if(Saving_JRadioButton.isSelected())
        { 
            accountType = "Saving Account";
        }
        else if(Fixed_JRadioButton.isSelected())
        { 
            accountType = "Fixed Deposit Account";
        }
        else if(Current_JRadioButton.isSelected())
        { 
            accountType = "Current Account";
        }
        else if(Recurring_JRadioButton.isSelected())
        { 
            accountType = "Recurring Deposit Account";
        }
        
        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 5040936000000000L;
        String cardnumber = "" + Math.abs(first7);
        
        long first3 = (ran.nextLong() % 9000L) + 1000L;
        String pin = "" + Math.abs(first3);
        
        String facility = "";
        if(ATM_checkbox.isSelected())
        { 
            facility = facility + " ATM Card";
        }
        if(internet_checkbox.isSelected())
        { 
            facility = facility + " Internet Banking";
        }
        if(mob_checkbox.isSelected())
        { 
            facility = facility + " Mobile Banking";
        }
        if(email_checkbox.isSelected())
        { 
            facility = facility + " EMAIL Alerts";
        }
        if(cheque_checkbox.isSelected())
        { 
            facility = facility + " Cheque Book";
        }
        if(e_checkbox.isSelected())
        { 
            facility = facility + " E-Statement";
        }
        
        try
        {
            if(ae.getSource()==submit)
            {
                if(accountType.equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Fill all the required fields");
                }
                else
                {
                    Conn c = new Conn();
                    String query1 = "insert into signupthree values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pin+"','"+facility+"')";  
                    String query2 = "insert into login values('"+formno+"','"+cardnumber+"','"+pin+"')";
                    c.s.executeUpdate(query1);
                    c.s.executeUpdate(query2);
                    JOptionPane.showMessageDialog(null, "Card Number: " + cardnumber + "\n Pin:"+ pin);
                    
                    new Deposit(pin).setVisible(true);
                    setVisible(false);
                }
            }
            else if(ae.getSource()==cancel)
            {
                setVisible(false);
                new Login().setVisible(true);
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public static void main(String args[])
    {
        new SignupThree("").setVisible(true);
    }
}

