
package minorproject;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.Statement;

public class StudentsGradingSystem1 {

    public static void main(String[] args) {
        // TODO code application logic here
        try{
                Splash spl = new Splash();
                spl.setVisible(true);
                for(int i = 0; i <= 100; i++){
                //set the sleep time of the loader
                    Thread.sleep(45);
                    spl.loadingNum.setText("Loading..."+Integer.toString(i) +" %");
                    spl.jProgressBarload.setValue(i);
                    //open grading panel if loading in the progress bar is over
                    if(i == 100){
                        
                        JOptionPane.showMessageDialog(null, "Welcome");
                        MainApp app = new MainApp();
                        app.setVisible(true);
                        spl.setVisible(false);
                    }else if(i == 45){
                        spl.guides_add.setText("Please wait while setting things in order");
                        Connection conn = null;
                        try {
                String dbName = "studentsdb";
                String userName = "root";
                String password = "Tanay@25";

                String url = "jdbc:mysql://localhost:3306/studentsdb";
                Connection connection = DriverManager.getConnection(url,userName, password);

                String sql = "CREATE DATABASE IF NOT EXISTS " + dbName;

                Statement statement = connection.createStatement();
                statement.executeUpdate(sql);
                statement.close();
                spl.guides_add.setText("Database connected successfully");
//                JOptionPane.showMessageDialog(null, databaseName + " Database has been created successfully", "System Message", JOptionPane.INFORMATION_MESSAGE);
                

                        } catch (SQLException e) {
                            e.printStackTrace();
                    }
                    }else if(i == 90){
                        try {
                    // create table
                    String que = "CREATE TABLE IF NOT EXISTS students( \n" +
                    "        id INT NOT NULL AUTO_INCREMENT, \n" +
                    "        username VARCHAR(32),\n" +
                    "        HomeWork INT(64),  \n" +
                    "        TEST INT(64),  \n" +
                    "        total INT(64),  \n" +
                    "        grade varchar(32),  \n" +
                    "       PRIMARY KEY (`id`))";
                        Connection conntable = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentsdb", "root", "Tanay@25");
                        Statement Stmt = conntable.createStatement();
                        Stmt.executeUpdate(que);
                        Stmt.close();
                        //JOptionPane.showMessageDialog(null, " Table has been created successfully");
                        } catch (SQLException e) {
                            e.printStackTrace();
                    }
                        spl.guides_add.setText("All tables created.");
                    }else if(i == 99){
                        spl.guides_add.setText("Enjoy out service! Thanks!!");
                    }
            }
                }catch (HeadlessException | InterruptedException e){
                    
                }
    }
    
        
    }
    

