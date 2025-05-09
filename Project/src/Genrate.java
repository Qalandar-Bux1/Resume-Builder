import java.awt.Color;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.JTextArea;
//import javax.swing.JTextField;
//
//public class Education extends JFrame {
//       
//                 JLabel education=new JLabel("Education");
//                 JLabel institute=new JLabel("Institute");
//                 JLabel City=new JLabel("City");
//                 JLabel startdate=new JLabel("Start Date ");
//                 JLabel enddate=new JLabel("End of Date");
//                 JLabel description=new JLabel("Description");
//                 
//                 JTextField educationf=new JTextField();
//                 JTextField institutef=new JTextField();
//                 JTextField Cityf=new JTextField();
//                 JTextField startdatef=new JTextField();
//                 JTextField enddatef=new JTextField();
//                 JTextArea descriptionf=new JTextArea();
//                 JButton submit=new JButton("Submit");
//                 JButton reset=new JButton("Reset");
//                 
//                 Education(){
//              	   createWindow();
//              	 addComponentsToFrame();
//              	   setLocationAndSize();
//              	 //   addfield();
//           	      
//              	    
//                 }
//                 public void createWindow() {
//              	   this.setTitle("Eduaction");
//              	   this.setBounds(100,50,350,500);
//              	   this.getContentPane().setBackground(Color.yellow);
//              	   this.getContentPane().setLayout(null);
//              	  descriptionf.setLineWrap(true);
//              	   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//              	 //  this.setResizable(false);
//              	 this.setVisible(true);
//                 }
//                 public void setLocationAndSize() {
//                	 education.setBounds(10, 5, 250, 20);
//                	 institute.setBounds(10, 50, 250, 50);
//                	 
//                	 startdate.setBounds(10, 100, 250, 50);
//               	     enddate.setBounds(120, 100, 250, 50);
//                	 description.setBounds(10, 150, 250, 50);
//                	 
//                	 educationf.setBounds(10, 25, 250, 25);
//                	 institutef.setBounds(9, 90, 100, 20);
//                	 City.setBounds(125, 50, 250, 50);
//                 	 Cityf.setBounds(125, 90, 100, 20);
//                 	
//              	    startdatef.setBounds(9, 140, 100, 20);
//               	     enddatef.setBounds(125, 140, 100, 25);
//                 	 descriptionf.setBounds(10, 200, 250, 150);
//                 	 
//                 }
//                 public void addComponentsToFrame(){
//
//               	  this.add( educationf);
//           	      this.add( institutef);
//           	      this.add(Cityf);
//               	  this.add(startdatef);
//               	  this.add(enddatef);
//                	  this.add(descriptionf);
//                	 this.add( education);
//                	 this.add(institute);
//                	 this.add(City);
//                	 this.add(startdate);
//                	 this.add(enddate);
//                	 this.add(description);
//                
//                 }
//}

//package maker;
//
//import java.awt.Color;
//import java.awt.Font;
//import java.io.FileOutputStream;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//
//import com.itextpdf.text.Document;
//import com.itextpdf.text.Element;
//import com.itextpdf.text.Paragraph;
//import com.itextpdf.text.pdf.PdfPCell;
//import com.itextpdf.text.pdf.PdfPTable;
//import com.itextpdf.text.pdf.PdfWriter;
//import com.itextpdf.text.Image;
//
//public class Main {
//    public static void main(String[] args) {
//        try {
//            String file = "D:\\generate_pdf\\qaland.pdf";
//            Document document = new Document();
//            PdfWriter.getInstance(document, new FileOutputStream(file));
//            document.open();
//            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/cvmaker", "root", "Abro@123");
//            Statement stmt = conn.createStatement();
//
//            // Execute query to retrieve data from database
//            ResultSet rs = stmt.executeQuery("SELECT * FROM data1");
//
//            // Add "Personal Detail" section to the PDF document
//            Paragraph personalDetailPara = new Paragraph();
//            personalDetailPara.setAlignment(Element.ALIGN_LEFT);
//            personalDetailPara.setSpacingBefore(10f);
//            personalDetailPara.setSpacingAfter(10f);
//            personalDetailPara.add(new Paragraph("Personal Detail"));
//
//            // Create a table with 2 columns to hold the image and name
//            PdfPTable table = new PdfPTable(2);
//            table.setWidthPercentage(100);
//
//            // Add image to the table
//            try {
//                Statement stmt1 = conn.createStatement();
//                ResultSet rs1 = stmt1.executeQuery("SELECT * FROM image");
//                if (rs1.next()) {
//                    byte[] imageData = rs1.getBytes("pic");
//                    Image image = Image.getInstance(imageData);
//                    image.scaleToFit(150f, 150f);
//                    PdfPCell imageCell = new PdfPCell(image);
//                    imageCell.setBorderWidth(0);
//                    table.addCell(imageCell);
//                }
//                rs1.close();
//                stmt1.close();
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//
//            // Add first name and last name to the table
//            while (rs.next()) {
//                String firstName = rs.getString("firstname");
//                String lastName = rs.getString("lastname");
//
//                PdfPCell nameCell = new PdfPCell();
//                nameCell.setBorderWidth(0);
//                nameCell.addElement(new Paragraph(firstName + " " + lastName));
//                table.addCell(nameCell);
//            }
//
//            // Add the table and personal details section to the PDF document
//            Paragraph combinedPara = new Paragraph();
//            combinedPara.add(personalDetailPara);
//            combinedPara.add(table);
//            document.add(combinedPara);
//
//            // Add other content to the PDF document
//
//            document.close();
//            System.out.println("PDF created successfully!");
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//}
/*Copy code
try {
    String file = "D:\\generate_pdf\\qalandar.pdf";
    Document document = new Document();
    PdfWriter.getInstance(document, new FileOutputStream(file));
    document.open();
    
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/cvmaker", "root", "Abro@123");
    Statement stmt = conn.createStatement();

    // Execute query to retrieve data from database
    ResultSet rs = stmt.executeQuery("SELECT * FROM data1 LIMIT 1");
    
    // Add "Personal Detail" section to the PDF document
    Paragraph personalDetailPara = new Paragraph("Personal Detail", new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLDITALIC));
    personalDetailPara.setAlignment(Element.ALIGN_LEFT);
    personalDetailPara.setSpacingBefore(10f);
    personalDetailPara.setSpacingAfter(10f);
    document.add(personalDetailPara);

    // Add the Personal Detail content
    PdfPTable table = new PdfPTable(2);
    table.setWidthPercentage(100);
    table.setSpacingBefore(10f);
    table.setSpacingAfter(10f);
    table.getDefaultCell().setPadding(5f);

    // Create a cell for the profile picture
    Image profileImage = Image.getInstance(rs.getString("profile_image_path"));
    profileImage.scaleAbsolute(120, 120);
    PdfPCell imageCell = new PdfPCell(profileImage, true);
    imageCell.setBorderWidth(0);
    table.addCell(imageCell);

    // Create a cell for the personal information
    Paragraph personalInfo = new Paragraph();
    personalInfo.setSpacingBefore(5f);
    personalInfo.setSpacingAfter(5f);

    Chunk nameChunk = new Chunk(rs.getString("name"), new Font(Font.FontFamily.TIMES_ROMAN, 22, Font.BOLD));
    personalInfo.add(nameChunk);
    personalInfo.add(new Chunk("\n\n"));

    Chunk infoChunk1 = new Chunk(rs.getString("address") + " | " + rs.getString("city") + ", " + rs.getString("state") + " " + rs.getString("zip_code"), new Font(Font.FontFamily.TIMES_ROMAN, 14, Font.NORMAL, new BaseColor(128, 128, 128)));
    personalInfo.add(infoChunk1);
    personalInfo.add(new Chunk("\n"));

    Chunk infoChunk2 = new Chunk(rs.getString("email") + " | " + rs.getString("phone"), new Font(Font.FontFamily.TIMES_ROMAN, 14, Font.NORMAL, new BaseColor(128, 128, 128)));
    personalInfo.add(infoChunk2);

    table.addCell(personalInfo);
    document.add(table);*/
  import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.DocWriter;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Font;
import java.awt.Color;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

import org.w3c.dom.Text;

   public class Genrate{
	public Genrate() {

        try {
           
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/cvmaker", "root", "Abro@123");
            Statement stmt = conn.createStatement();

            
    
            ResultSet rs = stmt.executeQuery("SELECT * FROM cvdata ORDER BY id DESC LIMIT 1");

       
            // Add image and name to the PDF document
            while (rs.next()) {
           
            	String firstnam = rs.getString("firstname");
            	String file = "D:\\generate_pdf\\"+firstnam +".pdf";
            	Document document = new Document();
            	PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(file));
            	document.open();

                Paragraph detail= new Paragraph("Personaldetail", new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLDITALIC, new BaseColor(70,130,180)));
                detail.setAlignment(Element.ALIGN_CENTER);
                detail.setSpacingBefore(20f);
                detail.setSpacingAfter(20f);
                document.add(detail);
          
                PdfPTable table = new PdfPTable(2);
                // 2 columns: image and namePara
                table.setWidthPercentage(100);
                
                // Add image to the table
                try {
                    Statement stmt1 = conn.createStatement();
                    ResultSet rs1 = stmt1.executeQuery("SELECT * FROM image");
                    if (rs1.next()) {
                        byte[] imageData = rs1.getBytes("pic");
                        Image image = Image.getInstance(imageData);
                        image.scaleToFit(10f, 10f);
                        PdfPCell imageCell = new PdfPCell(image, true);
                        imageCell.setBorderWidth(0);
                        table.addCell(imageCell);
                        
                    }
                    rs1.close();
                    stmt1.close();
                } catch (Exception e) {
                    System.out.println(e);
                }
                String firstName = rs.getString("firstname");
                Paragraph firstname = new Paragraph(firstName, new Font(Font.FontFamily.TIMES_ROMAN, 20, Font.BOLDITALIC, new BaseColor(0, 0, 255)));
                firstname.setAlignment(Element.ALIGN_CENTER);
                firstname.setSpacingBefore(0f);
                firstname.setSpacingAfter(0f);

                String lastName = rs.getString("lastname");
                Paragraph lastname = new Paragraph(lastName, new Font(Font.FontFamily.TIMES_ROMAN, 20, Font.BOLDITALIC, new BaseColor(0, 0, 255)));
                lastname.setAlignment(Element.ALIGN_CENTER);
                lastname.setSpacingBefore(0f);
                lastname.setSpacingAfter(0f);

                Paragraph name = new Paragraph();
                name.add(firstname);
                name.add(lastname);

                PdfPCell nameCell0 = new PdfPCell(name);
                nameCell0.setBorderWidth(0);

                PdfPTable table01= new PdfPTable(1);
                table01.setWidthPercentage(100f);
                table01.setHorizontalAlignment(Element.ALIGN_CENTER);

                table01.addCell(nameCell0);

                document.add(table01);
                
                // Add namePara to the table
                Paragraph namePara = new Paragraph();
                namePara.setAlignment(Element.ALIGN_LEFT);
                namePara.setSpacingBefore(10f); 
                namePara.setSpacingAfter(10f);

          
               
                String Email = rs.getString("Email");
                String City = rs.getString("City");
                String Phone = rs.getString("Phone");
                String Dateofbirth = rs.getString("Dateofbirth");
                String placeofbirth = rs.getString("placeofbirth");
                String gender = rs.getString("gender");
                String nationality = rs.getString("Natonality");

                namePara.add(new Paragraph("Email: " + Email + "\n\n"
                                          + "City: " + City + "\n\n"
                                          + "Contact: " + Phone + "\n\n"
                                          + "Date of birth: " + Dateofbirth + "\n\n"
                                          + "Place of birth: " + placeofbirth + "\n\n"
                                          + "Gender: " + gender + "\n\n"
                                          + "Nationality: " + nationality));

                PdfPCell nameCell = new PdfPCell(namePara);
                nameCell.setBorderWidth(0);

                table.addCell(nameCell);
                document.add(table);


                Paragraph Education = new Paragraph("Education", new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLDITALIC, new BaseColor(70,130,180)));
                Education.setAlignment(Element.ALIGN_CENTER);
                Education.setSpacingBefore(20f);
                Education.setSpacingAfter(20f);
//                Chunk bullet = new Chunk("\u2022"); // creates a bullet symbol
//                bullet.setTextRise(5f); // raises the bullet to align with the text
               
                document.add(Education);

                // Add namePara to the table
             // create table with two columns and four rows
                PdfPTable table11 = new PdfPTable(2);
                table11.setWidthPercentage(100);
                table11.setWidths(new float[] {1f, 3f});
                // add rows for each label and value
                PdfPCell educationLabelCell = new PdfPCell(new Phrase("Education:"));
                educationLabelCell.setPaddingBottom(10f); // add spacing after this cell
                table11.addCell(educationLabelCell);
                PdfPCell educationValueCell = new PdfPCell(new Phrase(rs.getString("Education")));
                educationValueCell.setPaddingBottom(10f); // add spacing after this cell
                table11.addCell(educationValueCell);

                PdfPCell instituteLabelCell = new PdfPCell(new Phrase("Institute:"));
                instituteLabelCell.setPaddingBottom(10f); // add spacing after this cell
                table11.addCell(instituteLabelCell);
                PdfPCell instituteValueCell = new PdfPCell(new Phrase(rs.getString("Institute")));
                instituteValueCell.setPaddingBottom(10f); // add spacing after this cell
                table11.addCell(instituteValueCell);

                PdfPCell cityLabelCell = new PdfPCell(new Phrase("City:"));
                cityLabelCell.setPaddingBottom(10f); // add spacing after this cell
                table11.addCell(cityLabelCell);
                PdfPCell cityValueCell = new PdfPCell(new Phrase(rs.getString("city1")));
                cityValueCell.setPaddingBottom(10f); // add spacing after this cell
                table11.addCell(cityValueCell);

                PdfPCell descriptionLabelCell = new PdfPCell(new Phrase("Description:"));
                descriptionLabelCell.setPaddingBottom(10f); // add spacing after this cell
                table11.addCell(descriptionLabelCell);
                PdfPCell descriptionValueCell = new PdfPCell(new Phrase(rs.getString("description1")));
                descriptionValueCell.setPaddingBottom(10f); // add spacing after this cell
                table11.addCell(descriptionValueCell);

                // add table to document
                document.add(table11);


                Paragraph workexperience = new Paragraph("Work Experience", new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLDITALIC, new BaseColor(70,130,180)));
                workexperience.setAlignment(Element.ALIGN_CENTER);
                workexperience.setSpacingBefore(10f);
                workexperience.setSpacingAfter(10f);
                document.add(workexperience);

                
             // create table with two columns
                PdfPTable table21 = new PdfPTable(2);

                // set spacing after table to 20f
          
                table21.setWidthPercentage(100);
                table21.setWidths(new float[] {1f, 3f});
                // add rows for each label and value
                PdfPCell companyNameLabelCell = new PdfPCell(new Phrase("Company Name:"));
                companyNameLabelCell.setPaddingBottom(10f); // add spacing after this cell
                table21.addCell(companyNameLabelCell);
                PdfPCell companyNameValueCell = new PdfPCell(new Phrase(rs.getString("CompanyName")));
                companyNameValueCell.setPaddingBottom(10f); // add spacing after this cell
                table21.addCell(companyNameValueCell);

                PdfPCell designationLabelCell = new PdfPCell(new Phrase("Designation:"));
                designationLabelCell.setPaddingBottom(10f); // add spacing after this cell
                table21.addCell(designationLabelCell);
                PdfPCell designationValueCell = new PdfPCell(new Phrase(rs.getString("designation")));
                designationValueCell.setPaddingBottom(10f); // add spacing after this cell
                table21.addCell(designationValueCell);

                // add spacing between rows
                PdfPCell emptyCell1 = new PdfPCell(new Phrase(""));
                emptyCell1.setBorder(PdfPCell.NO_BORDER);
                emptyCell1.setPaddingBottom(10f); // add spacing after this cell
                table21.addCell(emptyCell1);
                PdfPCell emptyCell2 = new PdfPCell(new Phrase(""));
                emptyCell2.setBorder(PdfPCell.NO_BORDER);
                emptyCell2.setPaddingBottom(10f); // add spacing after this cell
                table21.addCell(emptyCell2);

                // add table to document
                document.add(table21);

               
                Paragraph certificate = new Paragraph("Award and Certification", new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLDITALIC, new BaseColor(70,130,180)));
                certificate.setAlignment(Element.ALIGN_CENTER);
                certificate.setSpacingBefore(10f);
                certificate.setSpacingAfter(10f);
                document.add(certificate);

              
                String certification = rs.getString("Certification");
                String monthCombo = rs.getString("monthcombo");
                String yearCombo = rs.getString("yearcombo");
                String description3 = rs.getString("description3");

                // create table
                PdfPTable table31 = new PdfPTable(2);
                table31.setWidthPercentage(100);
                table31.setWidths(new float[] {1f, 3f});
                // add certification label and value
                PdfPCell certificationLabelCell = new PdfPCell(new Phrase("Certification"));
               
                table31.addCell(certificationLabelCell);

                PdfPCell certificationValueCell = new PdfPCell(new Phrase(certification));
                
                table31.addCell(certificationValueCell);

                // add date label and value
                PdfPCell dateLabelCell = new PdfPCell(new Phrase("Date"));
              
                table31.addCell(dateLabelCell);

                PdfPCell dateValueCell = new PdfPCell(new Phrase(monthCombo + " \\ " + yearCombo));
               
                table31.addCell(dateValueCell);

                // add description label and value
                PdfPCell descriptionLabelCel2 = new PdfPCell(new Phrase("Description"));
                
                table31.addCell(descriptionLabelCell);

                PdfPCell descriptionValueCel2 = new PdfPCell(new Phrase(description3));
                //descriptionValueCell.setBorderWidth(0);
                table31.addCell(descriptionValueCell);


                document.add(table31);

                               // Add namePara to the table
                PdfPTable table4 = new PdfPTable(2);
                table4.setWidthPercentage(100);
                table4.setWidths(new float[] {1f, 3f});
                Paragraph skill = new Paragraph("Skill", new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLDITALIC, new BaseColor(70,130,180)));
                skill.setAlignment(Element.ALIGN_CENTER);
                skill.setSpacingBefore(10f);
                skill.setSpacingAfter(10f);
                document.add(skill);

                // create cell for Skill column
                PdfPCell skillLabelCell = new PdfPCell(new Phrase("Skill:"));
                skillLabelCell.setPaddingBottom(10f); // add spacing after this cell
                table4.addCell(skillLabelCell);
                PdfPCell skillValueCell = new PdfPCell(new Phrase(rs.getString("Skill")));
                skillValueCell.setPaddingBottom(10f); // add spacing after this cell
                table4.addCell(skillValueCell);

                // create cell for Description column
                PdfPCell descriptionLabelCell1 = new PdfPCell(new Phrase("Description:"));
                descriptionLabelCell1.setPaddingBottom(10f); // add spacing after this cell
                table4.addCell(descriptionLabelCell1);
                PdfPCell descriptionValueCell11 = new PdfPCell(new Phrase(rs.getString("description2")));
                descriptionValueCell11.setPaddingBottom(10f); // add spacing after this cell
                table4.addCell(descriptionValueCell11);

                // add space between rows
                table4.setSpacingAfter(10f);

                document.add(table4);

                Paragraph hoby= new Paragraph("Hobby ", new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLDITALIC, new BaseColor(70,130,180)));
                hoby.setAlignment(Element.ALIGN_CENTER);
                hoby.setSpacingBefore(10f);
                hoby.setSpacingAfter(10f);
                document.add(hoby);

                String hobby = rs.getString("Hobby");
                String description4 = rs.getString("description4");

                // create table
                PdfPTable table5 = new PdfPTable(2);
                table5.setWidthPercentage(100);
                table5.setWidths(new float[] {1f, 3f});
                // add hobby label and value
                PdfPCell hobbyLabelCell = new PdfPCell(new Phrase("Hobby"));
              
                table5.addCell(hobbyLabelCell);

                PdfPCell hobbyValueCell = new PdfPCell(new Phrase(hobby));
              //  hobbyValueCell.setBorderWidth(0);
                table5.addCell(hobbyValueCell);

                // add description label and value
                PdfPCell descriptionLabelCel3 = new PdfPCell(new Phrase("Description"));
          
                table5.addCell(descriptionLabelCell);

                PdfPCell descriptionValueCel3 = new PdfPCell(new Phrase(description4));
                //descriptionValueCell.setBorderWidth(0);
                table5.addCell(descriptionValueCell);

                // set table properties
                table5.setSpacingBefore(10f);
                table5.setSpacingAfter(10f);

                // add table to document
                document.add(table5);
                document.close();
            }

            JOptionPane.showMessageDialog(null, "CV generate successfully");

         
        } catch (Exception e) {
            System.out.println(e);
         }
    }

} 


    	

