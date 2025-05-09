import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImageBox extends JPanel implements ActionListener {
    private JLabel imageLabel;
    private JButton chooseImageButton;
    private Connection connection;

    public ImageBox() {
        setLayout(new BorderLayout());

        imageLabel = new JLabel();
        chooseImageButton = new JButton("Choose Image");
        chooseImageButton.setPreferredSize(new Dimension(120, 30));

        add(imageLabel, BorderLayout.CENTER);
        add(chooseImageButton, BorderLayout.SOUTH);

        chooseImageButton.addActionListener(this);

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cvmaker","root","Abro@123");
        } catch (SQLException e) {
            System.out.println("Failed to connect to database: " + e.getMessage());
        }
    }

    public ImageIcon getImageIcon() {
        return (ImageIcon) imageLabel.getIcon();
    }

    private void storeImageInDatabase(File imageFile) {
        try (InputStream inputStream = new FileInputStream(imageFile);
             PreparedStatement deleteStatement = connection.prepareStatement("DELETE FROM image");
             PreparedStatement statement = connection.prepareStatement("insert into image VALUES ( ?)")) {
            deleteStatement.executeUpdate();
            statement.setBinaryStream(1, inputStream);
            statement.executeUpdate();
            System.out.println("Image stored in database");
        } catch (SQLException | IOException e) {
            System.out.println("Failed to store image in database: " + e.getMessage());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == chooseImageButton) {
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                ImageIcon icon = new ImageIcon(selectedFile.getAbsolutePath());
                Image image = icon.getImage();
                int labelWidth = imageLabel.getWidth();
                int labelHeight = imageLabel.getHeight();
                if (labelWidth > 0 && labelHeight > 0) {
                    // calculate the aspect ratio of the image
                    double aspectRatio = (double) image.getWidth(null) / image.getHeight(null);

                    // calculate the scaling factor to fit the image within the label's bounds
                    double scaleX = (double) labelWidth / image.getWidth(null);
                    double scaleY = (double) labelHeight / image.getHeight(null);
                    double scaleFactor = Math.min(scaleX, scaleY);

                    // apply the scaling factor while preserving aspect ratio
                    int newWidth = (int) (image.getWidth(null) * scaleFactor);
                    int newHeight = (int) (image.getHeight(null) * scaleFactor);
                    image = image.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
                }
                imageLabel.setIcon(new ImageIcon(image));
                storeImageInDatabase(selectedFile);
            }
        }
    }
}
