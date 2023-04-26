
package minorproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MainApp extends javax.swing.JFrame {
     private int shomeworks;
     private int stestmarks;
     private String grade;
     private String resultID;
    /**
     * Creates new form MainApp
     */
    public MainApp() {
        initComponents();
        stud_id.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        stud_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        stud_name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        stud_hwScore = new javax.swing.JTextField();
        stud_tScore = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("STUDENT GRADING SYSTEM");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Student ID");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Student Name");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Total Practical Score not exceeding 30%");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Total Theoritical score not exceeding 70%");

        jButton1.setBackground(new java.awt.Color(0, 255, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("DELETE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(51, 153, 255));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setText("ADD STUDENT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton3.setText("VIEW GRADES");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(465, 465, 465)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(stud_id, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(651, 651, 651)
                                .addComponent(stud_name, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(185, 185, 185)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(stud_hwScore, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(stud_tScore, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(218, 218, 218)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(41, 41, 41)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))
                .addContainerGap(227, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stud_id, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addComponent(stud_name, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(stud_hwScore, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(stud_tScore, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        GradesTable tab = new GradesTable();
        tab.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(stud_name.getText().equals("")) {
           JOptionPane.showMessageDialog(null, "Please fill the student Name");
        }else if(stud_hwScore.getText().equals("")){
           
            JOptionPane.showMessageDialog(null, "Homework score must not be empty");
            
        }else if(stud_tScore.getText().equals("")){
            //check if  marks is an integer
                JOptionPane.showMessageDialog(null, "Test marks must not be empty");
              
               
        }else{
            
            //Calculate the total score
              //check if value entered is an integer
            Connection connect = createConnection();
            String homework = stud_hwScore.getText();
            String db_ID = "SELECT `id` FROM `students`"; 
            Statement stmt;
            ResultSet result;
            String ID = stud_id.getText();
            try{
                stmt = connect.createStatement();
                result = stmt.executeQuery(db_ID);
                StudentInfo stud;
                while(result.next())
                {
                    String resultID = result.getString("id");
                }
                
                if(ID == resultID){
                    JOptionPane.showMessageDialog(null, "Sudent ID already exists");
                    //System.exit(1);
                }
            }catch(Exception ex){
                ex.printStackTrace();
            }
            
             //validate home work to be only number
            try {
                    shomeworks = Integer.parseInt(homework);
               }
               catch (NumberFormatException e) {
                    //if Not an integer  output this error
                    JOptionPane.showMessageDialog(null, "Homework mark must be an integer value");
 
               }
            //validate test score to be only number
            String test = stud_tScore.getText();
            try {
                    stestmarks = Integer.parseInt(test);
                    
               }
               catch (NumberFormatException e) {
                    //Not an integer
                    JOptionPane.showMessageDialog(null, "Test marks must be an integer value");
               }
                    int total;
                    total = shomeworks + stestmarks;
                    total = shomeworks + stestmarks;
                    if (shomeworks > 30){
                        //JOptionPane.showMessageDialog(null, "Home work should not exceed score of 30%!");
                       JOptionPane.showMessageDialog(null , "Homework score must not exceed 30%" , "Homework" , JOptionPane.INFORMATION_MESSAGE);
                    }else if(stestmarks > 70){
                        JOptionPane.showMessageDialog(null, "Test score must not exceed 70%","testmarks", JOptionPane.INFORMATION_MESSAGE);
                        //System.exit(0);
                    }else{
                        if(total > 89 ){
                            grade = "A";
                        }else if(total > 79 && total < 90){
                            grade = "B";
                        }else if(total > 69 && total <= 80){
                            grade = "C";
                        }else if(total > 59 && total <= 70){
                            grade = "D";
                        }else if(total < 60){
                            grade = "F";
                        }else if(total > 100 || total < 0){
                            JOptionPane.showMessageDialog(null, "Total Can not exceed 100!","total", JOptionPane.INFORMATION_MESSAGE);
                        }
                        String query = "INSERT INTO `students`(`username`, `HomeWork`, `TEST`, `total`, `grade`) VALUES ('"+stud_name.getText()+"','"+stud_hwScore.getText()+"','"+stud_tScore.getText()+"','"+total+"','"+grade+"')";

                        CommandHelper(query," added ");
                        //clear all fields after insertion
                        stud_id.setText("");
                        stud_name.setText("");
                        stud_hwScore.setText("");
                        stud_tScore.setText("");
                        
                    }
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //query to delete student data
        String query = "DELETE FROM `students` WHERE `id`="+stud_id.getText();
        CommandHelper(query," Deleted");
        GradesTable tab = new GradesTable();
        tab.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(stud_name.getText().equals("")) {
           JOptionPane.showMessageDialog(null, "Please fill the student Name");
        }else if(stud_hwScore.getText().equals("")){
           
            JOptionPane.showMessageDialog(null, "Homework score must not be empty");
            
        }else if(stud_tScore.getText().equals("")){
            //check if  marks is an integer
                JOptionPane.showMessageDialog(null, "Test marks must not be empty");
              
               
        }else{
            
            //Calculate the total SCORE
              //check if value entered is an integer
            Connection connect = createConnection();
            String homework = stud_hwScore.getText();
            String db_ID = "SELECT `id` FROM `students`"; 
            Statement stmt;
            ResultSet result;
            String ID = stud_id.getText();
            try{
                stmt = connect.createStatement();
                result = stmt.executeQuery(db_ID);
                StudentInfo stud;
                while(result.next())
                {
                    String resultID = result.getString("id");
                }
                
                if(ID == resultID){
                    JOptionPane.showMessageDialog(null, "Sudent ID already exists");
                    //System.exit(1);
                }
            }catch(Exception ex){
                ex.printStackTrace();
            }
            
             //validate home work to be only number
            try {
                    shomeworks = Integer.parseInt(homework);
               }
               catch (NumberFormatException e) {
                    //if Not an integer  output this error
                    JOptionPane.showMessageDialog(null, "Homework mark must be an integer value");
 
               }
            //validate test score to be only number
            String test = stud_tScore.getText();
            try {
                    stestmarks = Integer.parseInt(test);
                    
               }
               catch (NumberFormatException e) {
                    //Not an integer
                    JOptionPane.showMessageDialog(null, "Test marks must be an integer value");
               }
                    int total;
                    total = shomeworks + stestmarks;
                    total = shomeworks + stestmarks;
                    if (shomeworks > 30){
                        //JOptionPane.showMessageDialog(null, "Home work should not exceed score of 30%!");
                       JOptionPane.showMessageDialog(null , "Homework score must not exceed 30%" , "Homework" , JOptionPane.INFORMATION_MESSAGE);
                    }else if(stestmarks > 70){
                        JOptionPane.showMessageDialog(null, "Test score must not exceed 70%","testmarks", JOptionPane.INFORMATION_MESSAGE);
                        //System.exit(0);
                    }else{
                        if(total > 89 ){
                            grade = "A";
                        }else if(total > 79 && total < 90){
                            grade = "B";
                        }else if(total > 69 && total <= 80){
                            grade = "C";
                        }else if(total > 59 && total <= 70){
                            grade = "D";
                        }else if(total < 60){
                            grade = "F";
                        }else if(total > 100 || total < 0){
                            JOptionPane.showMessageDialog(null, "Total Can not exceed 100!","total", JOptionPane.INFORMATION_MESSAGE);
                        }
                        String query = "UPDATE `students` SET `username`='"+stud_name.getText()+"',`HomeWork`='"+stud_hwScore.getText()+"',`TEST`='"+stud_tScore.getText()+"',`total`='"+total+"',`Grade`='"+grade+"' WHERE `id` = "+stud_id.getText();

                        CommandHelper(query," updated ");
                        GradesTable tab = new GradesTable();
                        tab.setVisible(true);
                        setVisible(false);
                    }
        }
    }//GEN-LAST:event_jButton1ActionPerformed
     // all functions, add, update, delete works under the operation of this command
    public void CommandHelper(String sql,String result)
    {
        Connection con = createConnection();
        Statement stmt;
        try{
            stmt = con.createStatement();
            if(stmt.executeUpdate(sql) == 1)
            {
                //refresh table automatically
                GradesTable tbl = new GradesTable();
                DefaultTableModel model = (DefaultTableModel) tbl.students_table.getModel();
                model.setRowCount(0);
                tbl.show_Student_Details();
                JOptionPane.showMessageDialog(null,"Student data " + result +" successfully");
            }else{
                JOptionPane.showMessageDialog(null,"Student data not " + result);
            }
        }catch(Exception exp){
            exp.printStackTrace();
        }
    }
    public Connection createConnection()
    {

        Connection conn = null;
        //try to connect to the studentsdb
        try{
           
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            String url = "jdbc:mysql://localhost:3306/studentsdb";
            String user = "root";
            String password = "Tanay@25";
            conn = DriverManager.getConnection(url,user ,password);
            
            return conn;
        }catch(Exception e){
            //print error message if not connected
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField stud_hwScore;
    public javax.swing.JTextField stud_id;
    public javax.swing.JTextField stud_name;
    public javax.swing.JTextField stud_tScore;
    // End of variables declaration//GEN-END:variables
}
