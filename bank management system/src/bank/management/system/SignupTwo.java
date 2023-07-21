package bank.management.system;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SignupTwo extends JFrame implements ActionListener {
    
    JLabel additionalDetails,religionLabel,categoryLabel,incomeLabel,educationalLabel,qualification,occupationLabel,panLabel,aadharLabel,citizen,existingacc,l11;
    JTextField panJTextField,aadharJTextField;
    JComboBox religionJComboBox,categoryJComboBox,incomeJComboBox,educationalJComboBox,occupationJComboBox;
    JRadioButton syesJRadioButton, snoJRadioButton,eyesJRadioButton,enoJRadioButton;
    JButton next;
    String formno;
    
    SignupTwo(String formno)
    {
        this.formno = formno;
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);
        
        religionLabel = new JLabel("Religion:");
        religionLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        religionLabel.setBounds(100,140,100,30);
        add(religionLabel);
        
        String religion1[] = {"Hindu","Muslim","Sikh","Christian","Other"};
        religionJComboBox = new JComboBox(religion1);
        religionJComboBox.setBackground(Color.WHITE);
        religionJComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        religionJComboBox.setBounds(300,140,400,30);
        add(religionJComboBox);
        
        categoryLabel = new JLabel("Category:");
        categoryLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        categoryLabel.setBounds(100,190,200,30);
        add(categoryLabel);
        
        String valcategory[] = {"General","OBC","SC","ST","Other"};
        categoryJComboBox = new JComboBox(valcategory);
        categoryJComboBox.setBackground(Color.WHITE);
        categoryJComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        categoryJComboBox.setBounds(300,190,400,30);
        add(categoryJComboBox);
        
        incomeLabel = new JLabel("Income:");
        incomeLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        incomeLabel.setBounds(100,240,200,30);
        add(incomeLabel);
        
        String valincome[] = {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
        incomeJComboBox = new JComboBox(valincome);
        incomeJComboBox.setBackground(Color.WHITE);
        incomeJComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        incomeJComboBox.setBounds(300, 240, 400, 30);
	add(incomeJComboBox);
        
        educationalLabel = new JLabel("Educational");
        educationalLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        educationalLabel.setBounds(100,290,200,30);
        add(educationalLabel);
        
        String valeducation[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
        educationalJComboBox = new JComboBox(valeducation);
        educationalJComboBox.setBackground(Color.WHITE);
        educationalJComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        educationalJComboBox.setBounds(300, 315, 400, 30);
	add(educationalJComboBox);
        
        qualification = new JLabel("Qualification:");
        qualification.setFont(new Font("Raleway", Font.BOLD, 20));
        qualification.setBounds(100,310,200,30);
        add(qualification);
        
        occupationLabel = new JLabel("Occupation:");
        occupationLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        occupationLabel.setBounds(100,390,200,30);
        add(occupationLabel);
        
        String valoccupation[] = {"Salaried","Self-Employmed","Business","Student","Retired","Others"};
        occupationJComboBox = new JComboBox(valoccupation);
        occupationJComboBox.setBackground(Color.WHITE);
        occupationJComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        occupationJComboBox.setBounds(300,390,400,30);
        add(occupationJComboBox);
        
        panLabel = new JLabel("PAN Number:");
        panLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        panLabel.setBounds(100,440,200,30);
        add(panLabel);
        
        panJTextField = new JTextField();
        panJTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        panJTextField.setBounds(300,440,400,30);
        add(panJTextField);
        
        aadharLabel = new JLabel("Aadhar Number:");
        aadharLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        aadharLabel.setBounds(100,490,200,30);
        add(aadharLabel);
        
        aadharJTextField = new JTextField();
        aadharJTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        aadharJTextField.setBounds(300,490,400,30);
        add(aadharJTextField);
        
        citizen = new JLabel("Senior Citizen:");
        citizen.setFont(new Font("Raleway", Font.BOLD, 20));
        citizen.setBounds(100,540,200,30);
        add(citizen);
        
        syesJRadioButton = new JRadioButton("Yes");
        syesJRadioButton.setFont(new Font("Raleway", Font.BOLD, 14));
        syesJRadioButton.setBackground(Color.WHITE);
        syesJRadioButton.setBounds(300,540,100,30);
        add(syesJRadioButton);
        
        snoJRadioButton = new JRadioButton("No");
        snoJRadioButton.setFont(new Font("Raleway", Font.BOLD, 14));
        snoJRadioButton.setBackground(Color.WHITE);
        snoJRadioButton.setBounds(500,540,100,30);
        add(snoJRadioButton);
        
        ButtonGroup senior = new ButtonGroup();
        senior.add(syesJRadioButton);
        senior.add(snoJRadioButton);
        
        existingacc = new JLabel("Existing Account:");
        existingacc.setFont(new Font("Raleway", Font.BOLD, 20));
        existingacc.setBounds(100,590,200,30);
        add(existingacc);
        
        eyesJRadioButton = new JRadioButton("Yes");
        eyesJRadioButton.setFont(new Font("Raleway", Font.BOLD, 14));
        eyesJRadioButton.setBackground(Color.WHITE);
        eyesJRadioButton.setBounds(300,590,100,30);
        add(eyesJRadioButton);
        
        enoJRadioButton = new JRadioButton("No");
        enoJRadioButton.setFont(new Font("Raleway", Font.BOLD, 14));
        enoJRadioButton.setBackground(Color.WHITE);
        enoJRadioButton.setBounds(500,590,100,30);
        add(enoJRadioButton);
        
        ButtonGroup existing = new ButtonGroup();
        existing.add(eyesJRadioButton);
        existing.add(enoJRadioButton);
        
        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,660,80,30);
        next.addActionListener(this); 
        add(next);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l11 = new JLabel(i3);
        l11.setBounds(20, 0, 100, 100);
        add(l11);
        
        setLayout(null);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);
        setLocation(500,120);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        String religion = (String)religionJComboBox.getSelectedItem(); 
        String category = (String)categoryJComboBox.getSelectedItem();
        String income = (String)incomeJComboBox.getSelectedItem();
        String education = (String)educationalJComboBox.getSelectedItem();
        String occupation = (String)occupationJComboBox.getSelectedItem();
        
        String pan = panJTextField.getText();
        String aadhar = aadharJTextField.getText();
        
        String scitizen = "";
        if(syesJRadioButton.isSelected())
        { 
            scitizen = "Yes";
        }
        else if(snoJRadioButton.isSelected())
        { 
            scitizen = "No";
        }
           
        String eaccount = "";
        if(eyesJRadioButton.isSelected()){ 
            eaccount = "Yes";
        }else if(enoJRadioButton.isSelected()){ 
            eaccount = "No";
        }
        
        try
        {
            if(aadharJTextField.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            }
            else
            {
                Conn c = new Conn();
                String query = "insert into signuptwo values('"+formno+"','"+religion+"','"+category+"','"+income+"','"+education+"','"+occupation+"','"+pan+"','"+aadhar+"','"+scitizen+"','"+eaccount+"')";
                c.s.executeUpdate(query);
                
                new SignupThree(formno).setVisible(true);
                setVisible(false);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public static void main(String args[])
    {
        new SignupTwo("").setVisible(true);
    }
}