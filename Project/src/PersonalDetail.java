   import java.awt.Color;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.Box;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PersonalDetail extends JFrame implements ActionListener {
		   //Personal detail
	        JLabel personal=new JLabel("Personal Detail");
	        Font font = new Font("Arial", Font.BOLD, 20);

        	// Set the font and foreground color (text color) of the label
        	
	        JLabel Education=new JLabel("Education");
	        JLabel WorkExperience=new JLabel("WorkExperience");
	        JLabel Skill=new JLabel("Skill");
	        JLabel Hobby=new JLabel("Hobbies");  
	        
	        JLabel labels;
	        ImageIcon images;
	        
	        
	        JLabel   Award_and_Certification=new JLabel("Award_and_Certification");
	   	 
            JLabel FirstName=new JLabel("First Name");
            JLabel LastName=new JLabel("Last Name");
            JLabel Address=new JLabel("Address");
            JLabel Email=new JLabel("Email");
            JLabel City=new JLabel("City");
            JLabel Phone=new JLabel("Phone Number");
            JLabel Dateofbirth=new JLabel("Date of Birth");
            JLabel PlaceofBirth=new JLabel("Place of Birth");
            JLabel gender=new JLabel("Gender");
            JLabel Nationality=new JLabel("Nationality");
            // eduaction labels
            JLabel education=new JLabel("Education");
            JLabel institute=new JLabel("Institute");
            JLabel city=new JLabel("City");
            JLabel startdate=new JLabel("Start Date ");
            JLabel enddate=new JLabel("End of Date");
            JLabel description=new JLabel("Description");
            // Work Experience
            JLabel CompanyName= new JLabel("CompanyName");
            JLabel designation= new JLabel("Designation ");
//            JLabel titlel1= new JLabel("Title 2 ");
//            JLabel descriptionl1= new JLabel("Inter Description 2");
            // Skill
            JLabel titleSkill= new JLabel("Title 1");
            JLabel descriptionskill= new JLabel("Inter Description 1");
            JTextField Skillfield=new JTextField();
            JTextArea descriptionfiel= new JTextArea();     
            
            //Award and certifiacte
            JLabel Certification = new JLabel("Certification");
            JLabel Period = new JLabel("Period");
            JLabel Month=new JLabel("Month");
            JLabel Year=new JLabel("Year");
            JTextField Certificationf = new JTextField();
            JComboBox monthCombo;
            JComboBox yearCombo;
            JLabel descriptionlabel = new JLabel("Description");
            JTextArea descriptionArea = new JTextArea();
           

            
            
            
                       //personal detail
            
            JTextField FirstNamefield=new JTextField();
            JTextField LastNamefield=new  JTextField();
            JTextField Addressfied=new     JTextField();
            JTextField Emailfield=new     JTextField();
            JTextField Cityfield=new     JTextField();
            JTextField Phonefield=new     JTextField();
            JTextField Dateofbirthfield=new     JTextField();
            JTextField PlaceofBirthfield=new     JTextField();
            JTextField genderfield=new     JTextField();
            // eduaction  field
            JTextField educationf=new JTextField();
            JTextField institutef=new JTextField();
            JTextField cityf=new JTextField();
            JTextField startdatef=new JTextField();
            JTextField enddatef=new JTextField();
            JTextArea descriptionf=new JTextArea();
        JTextField Nationalityfield=new     JTextField();
            //work Experience field
        JTextField Comapanynamet=new JTextField();
        JTextArea designationt= new JTextArea();
//        JTextField titlea1=new JTextField();
//        JTextArea textarea1= new JTextArea();
//           
       
             // Hobby
        JLabel Hobbylabel= new JLabel("Title 1");
        JLabel descritionhobby= new JLabel("Inter Description 1");
        JTextField hobbyfield=new JTextField();
        JTextArea descriptionHobbyarea= new JTextArea();     
        
            
            
            JButton button=new JButton("Generate CV ");
            JButton button1=new JButton("Reset");
                       PersonalDetail(){
                    	     createWindow();
                    	   
                    	   addComponentsToFrame();
                    	   setLocationAndSize();
                    	  // addfield();
                    	   
                    	   actionEvent();
                    	     
                       }
                       
                      
             
                       public void createWindow() {
                    	   descriptionArea.setLineWrap(true);
                    	   
                    	   images = new ImageIcon(new ImageIcon(getClass().getResource("pic4.jpg"))
                    			   .getImage().getScaledInstance(1200,799,Image.SCALE_DEFAULT));
                    	//   images = new ImageIcon("C:\\Users\\hp\\Pictures\\Background.jpg");
                    	   labels = new JLabel(images);
                           String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
                           monthCombo = new JComboBox(months);

                           Integer[] years = { 2023, 2022, 2021, 2020, 2019, 2018, 2017, 2016, 2015, 2014, 2013, 2012 };
                           yearCombo = new JComboBox(years);
                    		
                           JPanel box=new JPanel();
                           box.setBounds(5,55,160,150);
                           box.setBackground(Color.white);
                            ImageBox imageBox = new ImageBox();
                            box.add(imageBox);
                            this.setVisible(true);
                              labels.add(box);
                    	   this.setTitle("CV maker");
                    
                    	   this.setSize(1200,700);
                    	   this.setLocationRelativeTo(null);
                    	   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    	//   this.getContentPane().setBackground(Color.pink);
                    	  this.getContentPane().setLayout(null);
                    
                    	   this.setVisible(true);
                    	  labels.setOpaque(true);
                     	   this.setResizable(false);
                       }
                       public void setLocationAndSize() {
                    	   //personal detail
                    	   personal.setFont(font);
                       	personal.setForeground(Color.BLUE);
                       	
                    	   labels.setSize( 1200, 799);
                    	personal.setBounds(80,5,200,50);
                    	Education.setBounds(500,5,200,50);
                    	WorkExperience.setBounds(710,5,200,50);
                     	Skill.setBounds(950,5,200,50);
                     	Award_and_Certification.setBounds(700,200,400,50);
                     	Hobby.setBounds(420,300,200,50);
                     	
                    	FirstName.setBounds(170, 35, 150, 70);
                  	    LastName.setBounds(280, 35, 150, 70);
                    	Email.setBounds(170, 100, 150, 70);
                    	Address.setBounds(20, 180, 150, 70);  
                   	    City.setBounds(20, 230, 230, 70);
                     	Phone.setBounds(20, 280, 150, 70);
                    	Dateofbirth.setBounds(20, 335, 150, 70);
                   	    PlaceofBirth.setBounds(20, 390, 150, 70);
                 	    gender.setBounds(20, 450, 150, 70);
                  	    Nationality.setBounds(20, 500, 150, 70);
                  	    
                    	FirstNamefield.setBounds(170, 90,80, 26); 
                    	Addressfied.setBounds(20,230,300,25);
                        LastNamefield.setBounds(280, 90, 80, 25);
                        Emailfield.setBounds(170,150,170,25);
                        Cityfield.setBounds(20, 280, 300, 25);
                        Phonefield.setBounds(20, 330, 300, 25);
                        Dateofbirthfield.setBounds(20, 390, 300, 25);
                        PlaceofBirthfield.setBounds(20, 440, 300, 25);
                        genderfield.setBounds(20, 495, 300, 25);
                        Nationalityfield.setBounds(20, 550, 300, 25);
                        
                        button1.setBounds(20, 605, 200, 30); 
                        button.setBounds(950, 600,200, 30);
                        
                        //eduaction 
                        Education.setFont(font);
                       	Education.setForeground(Color.BLUE);
                       	
                     education.setBounds(420, 60, 200, 20);
                   	 institute.setBounds(420, 110, 200, 20);
                   	 
                   	// startdate.setBounds(450, 140, 250, 50);
                  	 //    enddate.setBounds(450, 190, 250, 50);
                   	 description.setBounds(420, 190, 250, 30);
                   	 
                   	 educationf.setBounds(420, 80, 200, 20);
                   	 institutef.setBounds(420, 130, 200, 20);
                   	 city.setBounds(420, 140, 250, 50);
                    	 cityf.setBounds(420, 180, 200, 20);
                    	
                 	   // startdatef.setBounds(450, 180, 200, 20);
                  	     //enddatef.setBounds(450, 225, 200, 20);
                    	 descriptionf.setBounds(420, 225, 220, 50);
                    	 
                        // work Experience 
                    	
                    	 WorkExperience.setFont(font);
                    	 WorkExperience.setForeground(Color.BLUE);
                        	
                    	 CompanyName.setBounds(700,80,190,50);
                    designation.setBounds(700,130,195,40);
                    Comapanynamet.setBounds(700,115,190,25);
                    designationt .setBounds(700,175,190,25);
//                    	       work Experience 2
//                    	 descriptionl1.setBounds(700,210,190,50);
//                     	textarea1.setBounds(700,250,195,40);
//                         titlel1.setBounds(700,160,190,50);
//                     	titlea1.setBounds(700,200,190,25);
//                     	           // Skill
                    Skill.setFont(font);
                 Skill.setForeground(Color.BLUE);
                     	titleSkill.setBounds(950,45,190,25);
                        descriptionskill.setBounds(950,95,190,50);
                        Skillfield.setBounds(950,80,190,25);
                        descriptionfiel.setBounds(950,140,195,40);
                                 // Award and certificate
                        Award_and_Certification.setFont(font);
                        Award_and_Certification.setForeground(Color.BLUE);
                        Certification.setBounds(700,240,200,50);
                        Certificationf.setBounds(700,280,200,25);
                        Period.setBounds(700,300,250,50);
                        Month.setBounds(700,315,260,50);
                        Year.setBounds(800,315,260,50);
                   
                        monthCombo.setBounds(700,350,90,25);
                        yearCombo.setBounds(800,350,90,25);
                        descriptionlabel.setBounds(700,390,200,50);
                        descriptionArea.setBounds(700,430,200,50);
                        
                        // Hobby
                        Hobby.setFont(font);
                        Hobby.setForeground(Color.BLUE);
                        Hobbylabel.setBounds(420,340,200,25);
                        descritionhobby.setBounds(420,400,200,25);
                         hobbyfield.setBounds(420,370,200,25);
                         descriptionHobbyarea.setBounds(420,430,200,25);    
                        
                        
                       }
                       
                       public void addComponentsToFrame() {
                    	   // Personal Details//950,95,190,50
                    	   
                    	   this.add(labels);
                    	   labels.add(button);
                    	  labels.add( Hobby);
                    	   labels.add(Skill);
                    	   labels.add(Education);
                    	   labels.add(Award_and_Certification);
                    	   labels.add(WorkExperience);
                    	   labels.add(personal);
                    	   labels.add(button1);
                    	   labels.add(FirstName);
                    	   labels.add(LastName);
                    	   labels.add(Address);
                    	   labels.add(Email);
                    	   labels.add(City);
                    	   labels.add(Phone);
                    	   labels.add(Dateofbirth);
                    	   labels.add(PlaceofBirth);
                    	   labels.add(gender);
                    	   labels.add(Nationality);
                    	   
                    	   // Eduaction
                    	   labels.add( educationf);
                    	      labels.add( institutef);
                    	      labels.add(cityf);
                        	  labels.add(startdatef);
                        	  labels.add(enddatef);
                         	  labels.add(descriptionf);
                         	 labels.add( education);
                         	 labels.add(institute);
                         	 labels.add(city);
                         	 labels.add(startdate);
                         	 labels.add(enddate);
                         	 labels.add(description);
                         	 
                         	 //work Experience
                         	 labels.add(CompanyName);
                         	 labels.add(designation);
                         	 labels.add(Comapanynamet);
                         	 labels.add(designationt);
//                         	 labels.add(descriptionl1);
//                         	 labels.add(titlel1);
//                         	 labels.add(titlea1);
//                         	 labels.add(textarea1);
                         	 //Skill
                         	 
                         	 labels.add(titleSkill);
                         	labels.add(descriptionskill);
                         	labels.add(Skillfield);
                         	labels.add(  descriptionfiel);
                         	
                         	
                         	// Award and certificate 
                         	labels.add(Certification);
                         	labels.add(Certificationf);
                         	labels.add(  Month);
                         	labels.add(Year);
                         	labels.add(monthCombo);
                         	labels.add(yearCombo);
                         	labels.add(descriptionlabel);
                         	labels.add(descriptionArea);
                         	
                         	 //Hobby
                         	labels.add(Hobbylabel);
                         	labels.add( descritionhobby);
                         	labels.add(hobbyfield);
                         	labels.add(descriptionHobbyarea);
                         	
                         	 
                       
                       
                    	   labels.add(FirstNamefield);
                    	   labels.add(Addressfied);
                    	   labels.add(LastNamefield);
                    	   labels.add(Emailfield);
                    	   labels.add(Cityfield);
                    	   labels.add(Phonefield);
                    	   labels.add(Dateofbirthfield);
                    	   labels.add(Nationalityfield);
                    	   labels.add(genderfield);
                    	   labels.add(PlaceofBirthfield);                    	  
                       }
                       public void actionEvent() {
                    	    button1.addActionListener(this);
                    	    button.addActionListener(this);
                    	}


                       public void actionPerformed(ActionEvent e) {
                    	    if(e.getSource() == button) {

                    	        if (FirstNamefield.getText().isEmpty() || LastNamefield.getText().isEmpty() || Addressfied.getText().isEmpty() ||
                    	        		Emailfield.getText().isEmpty() || Cityfield.getText().isEmpty() || Phonefield.getText().isEmpty() || 
                    	        		Dateofbirthfield.getText().isEmpty() || PlaceofBirthfield.getText().isEmpty() || genderfield.getText().isEmpty()
                    	        		|| Nationalityfield.getText().isEmpty() || educationf.getText().isEmpty() || institutef.getText().isEmpty() || 
                    	        		cityf.getText().isEmpty() || descriptionf.getText().isEmpty() || Comapanynamet.getText().isEmpty() ||
                    	        		designation.getText().isEmpty() || Skillfield.getText().isEmpty() || descriptionfiel.getText().isEmpty() || 
                    	        		Certificationf.getText().isEmpty() || descriptionArea.getText().isEmpty() || hobbyfield.getText().isEmpty() 
                    	        		|| descriptionHobbyarea.getText().isEmpty()) {
                    	            JOptionPane.showMessageDialog(null, "Please fill in all required fields.");
                    	        } else {
                    	        	try {
                    	        	    //creating connection object
                    	        	    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cvmaker","root","Abro@123");

                    	        	    //Inserting new data into the table
                    	        	    PreparedStatement insertStatement = connection.prepareStatement("INSERT INTO cvdata (firstname, lastname, Address, Email"
                    	        	    		+ ", City, Phone, Dateofbirth, placeofbirth, gender, Natonality,"
                    	        	    		+ " Education, Institute, city1, description1, CompanyName, designation,"
                    	        	    		+ " Skill, description2, Certification, monthcombo, yearcombo, description3, Hobby,"
                    	        	    		+ " description4) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                    	        	    insertStatement.setString(1, FirstNamefield.getText());
                    	        	    insertStatement.setString(2, LastNamefield.getText());
                    	        	    insertStatement.setString(3, Addressfied.getText());
                    	        	    insertStatement.setString(4, Emailfield.getText());
                    	        	    insertStatement.setString(5, Cityfield.getText());
                    	        	    insertStatement.setString(6, Phonefield.getText());
                    	        	    insertStatement.setString(7, Dateofbirthfield.getText());
                    	        	    insertStatement.setString(8, PlaceofBirthfield.getText());
                    	        	    insertStatement.setString(9, genderfield.getText());
                    	        	    insertStatement.setString(10, Nationalityfield.getText());
                    	        	    // Education
                    	        	    insertStatement.setString(11, educationf.getText());
                    	        	    insertStatement.setString(12, institutef.getText());
                    	        	    insertStatement.setString(13, cityf.getText());
                    	        	    insertStatement.setString(14, descriptionf.getText());

                    	        	    //Work Experience
                    	        	    insertStatement.setString(15, Comapanynamet.getText());
                    	        	    insertStatement.setString(16, designation.getText());
                    	        	    insertStatement.setString(17, Skillfield.getText());
                    	        	    insertStatement.setString(18, descriptionfiel.getText());

                    	        	    // Award and certificate
                    	        	    insertStatement.setString(19, Certificationf.getText());
                    	        	    insertStatement.setString(20, monthCombo.getSelectedItem().toString());
                    	        	    insertStatement.setInt(21, Integer.parseInt(yearCombo.getSelectedItem().toString()));
                    	        	    insertStatement.setString(22, descriptionArea.getText());

                    	        	    // Hobby
                    	        	    insertStatement.setString(23, hobbyfield.getText());
                    	        	    insertStatement.setString(24, descriptionHobbyarea.getText());

                    	        	    insertStatement.executeUpdate();

                    	        	    JOptionPane.showMessageDialog(null, "Data inserted successfully");

                    	        	} catch (SQLException e1) {
                    	        	    e1.printStackTrace();
                    	        	}
                    	        }
                    

                     		this.dispose();
							new Firstpage();
						
						if(e.getSource()==button1) {
							FirstNamefield.setText("");
					        LastNamefield.setText("");
					        Addressfied.setText("");
					        Emailfield.setText("");
					        Cityfield.setText("");
					        Phonefield.setText("");
					        Dateofbirthfield.setText("");
					        PlaceofBirthfield.setText("");
					        genderfield.setText("");
					        Nationalityfield.setText("");
					        educationf.setText("");
					        institutef.setText("");
					        cityf.setText("");
					        descriptionf.setText("");
					        Comapanynamet.setText("");
					        designation.setText("");
					        Skillfield.setText("");
					        descriptionfiel.setText("");
					        Certificationf.setText("");
					        monthCombo.setSelectedIndex(0);
					        yearCombo.setSelectedIndex(0);
					        descriptionArea.setText("");
					        hobbyfield.setText("");
					        descriptionHobbyarea.setText("");
					    }
					}
						}
						 
					
                       }
