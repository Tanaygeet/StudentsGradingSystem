
package minorproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public final class GradesTable extends javax.swing.JFrame {

    /**
     * Creates new form GradesTable
     */
    public GradesTable() {
        initComponents();
        show_Student_Details();
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
        }catch(ClassNotFoundException | SQLException e){
            //print error message if not connected
            e.printStackTrace();
            return null;
        }
    }
   
    
    public ArrayList<StudentInfo> getstudentsList()
    {
        ArrayList<StudentInfo> sList = new ArrayList<>();
        Connection connect = createConnection();
        String query = "SELECT * FROM `students`"; 
        Statement stmt;
        ResultSet res;
        try{
            stmt = connect.createStatement();
            res = stmt.executeQuery(query);
            StudentInfo stud;
            while(res.next())
            {
                stud = new StudentInfo(res.getInt("id"),res.getString("username"),res.getInt("HomeWork"),res.getInt("TEST"),res.getInt("total"),res.getString("grade"));
                sList.add(stud);
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return sList;
    }
    //show student details on the jTable
     public void show_Student_Details()
    {
        ArrayList<StudentInfo> list = getstudentsList();
        DefaultTableModel model = (DefaultTableModel)students_table.getModel();
        Object[] data = new Object[6];
        for(int i = 0; i < list.size(); i++)
        {
            data[0] = list.get(i).getSID();
            data[1] = list.get(i).getSName();
            data[2] = list.get(i).getHScore();
            data[3] = list.get(i).getSTest();
            data[4] = list.get(i).getTotals();
            data[5] = list.get(i).getSGrade();
            
            model.addRow(data);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        students_table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GRADES TABLE");

        students_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student_ID", "Name", "Homework Score", "Test Score", "Totals in %", "Grades"
            }
        ));
        students_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                students_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(students_table);

        jButton1.setBackground(new java.awt.Color(0, 153, 204));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("GO TO ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void students_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_students_tableMouseClicked
        MainApp app = new MainApp();
        app.setVisible(true);
        //SEt row values to be editable by the textfields in mainapp jframe
        int i = students_table.getSelectedRow();
        TableModel model = students_table.getModel();
        app.stud_id.setText(model.getValueAt(i, 0).toString());
        app.stud_name.setText(model.getValueAt(i, 1).toString());
        app.stud_hwScore.setText(model.getValueAt(i, 2).toString());
        app.stud_tScore.setText(model.getValueAt(i, 3).toString());
        setVisible(false);
    }//GEN-LAST:event_students_tableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MainApp app = new MainApp();
        app.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GradesTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GradesTable().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable students_table;
    // End of variables declaration//GEN-END:variables
}
