import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sasindu
 */
public class NewJFrame extends JFrame {

    public NewJFrame() {
        
        initComponents();
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(200);
        
              
    }

  public void addtable(int id ,String Name, int Qty ,Double Price){
  
      DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
      
      Vector v = new Vector() ;
      
      v.add(id);
      v.add(Name);
      v.add(Qty);
      v.add(Price);
      
      dt.addRow(v);

  }
  public void addtables(int id ,String Name,int Qty ,Double Price){
    
        DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
        
       DecimalFormat df = new DecimalFormat("00.00") ;       
       double totPrice = Price * Double.valueOf(Qty) ;
       
       String TotalPrice = df.format(totPrice);
        
        
        
        // product allready add chk
        
        for (int row = 0; row < jTable1.getRowCount(); row++) {
            
            if (Name == jTable1.getValueAt(row, 1)) {
                
                dt.removeRow(jTable1.convertRowIndexToModel(row));
                
            } 
        }
        
        Vector v = new Vector();
        
        v.add(id);
        v.add(Name);
        v.add(Qty);
        v.add(TotalPrice); // total price
        
        dt.addRow(v);
        
    
    }
    
   public void cal(){
    //cal total table values
   
   int numOfRow = jTable1.getRowCount() ;
   double tot = 0.0 ;
   
       for (int i = 0; i < numOfRow; i++) {
           
           double value = Double.valueOf(jTable1.getValueAt(i, 3).toString());
          
           tot += value ;
           
       }
       
       DecimalFormat df = new DecimalFormat("00.00") ;
       total.setText(df.format(tot));
    
   
   
   } 
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new JPanel();
        jButton1 = new JButton();
        q1 = new JLabel();
        jButton2 = new JButton();
        q2 = new JLabel();
        jButton3 = new JButton();
        q3 = new JLabel();
        jButton4 = new JButton();
        q6 = new JLabel();
        jButton5 = new JButton();
        q5 = new JLabel();
        q4 = new JLabel();
        jButton6 = new JButton();
        jButton7 = new JButton();
        q9 = new JLabel();
        q8 = new JLabel();
        jButton8 = new JButton();
        jButton9 = new JButton();
        q7 = new JLabel();
        jPanel2 = new JPanel();
        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        jScrollPane2 = new JScrollPane();
        b = new JTextArea();
        jPanel3 = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        bal = new JLabel();
        total = new JLabel();
        pay = new JTextField();
        jButton11 = new JButton();
        jButton12 = new JButton();
        jButton13 = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jButton1.setIcon(new ImageIcon(getClass().getResource("1.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        q1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        q1.setHorizontalAlignment(SwingConstants.CENTER);
        q1.setText("0");

        jButton2.setIcon(new ImageIcon(getClass().getResource("2.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        q2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        q2.setHorizontalAlignment(SwingConstants.CENTER);
        q2.setText("0");

        jButton3.setIcon(new ImageIcon(getClass().getResource("3.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        q3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        q3.setHorizontalAlignment(SwingConstants.CENTER);
        q3.setText("0");

        jButton4.setIcon(new ImageIcon(getClass().getResource("6.png")));
        // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        q6.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        q6.setHorizontalAlignment(SwingConstants.CENTER);
        q6.setText("0");

        jButton5.setIcon(new ImageIcon(getClass().getResource("5.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        q5.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        q5.setHorizontalAlignment(SwingConstants.CENTER);
        q5.setText("0");

        q4.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        q4.setHorizontalAlignment(SwingConstants.CENTER);
        q4.setText("0");

        jButton6.setIcon(new ImageIcon(getClass().getResource("4.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new ImageIcon(getClass().getResource("8.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        q9.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        q9.setHorizontalAlignment(SwingConstants.CENTER);
        q9.setText("0");

        q8.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        q8.setHorizontalAlignment(SwingConstants.CENTER);
        q8.setText("0");

        jButton8.setIcon(new ImageIcon(getClass().getResource("7.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setIcon(new ImageIcon(getClass().getResource("9.png"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        q7.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        q7.setHorizontalAlignment(SwingConstants.CENTER);
        q7.setText("0");

        jTable1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTable1.setModel(new DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Iteam", "Qty", "Price"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

//        b.setColumns(20);
//        b.setRows(5);
        jScrollPane2.setViewportView(b);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel1.setText("Total :");

//        jLabel2.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
//        jLabel2.setText("Cash :");

//        jLabel3.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
//        jLabel3.setText("Balance :");
//
//        bal.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
//        bal.setText("00");

        total.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        total.setText("00");

        pay.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N

        jButton11.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jButton11.setText("Pay");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jButton12.setText("Print");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(bal, GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(pay))
                        .addGap(19, 19, 19))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(total, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jButton11, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton12, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(total))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(pay)
                            .addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(bal)))
                    .addComponent(jButton11, GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(jButton12, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        //jButton13.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
       // jButton13.setText("Delete");
      //  jButton13.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jButton13ActionPerformed(evt);
//            }
//        });

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton13)
                    .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 345, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton13, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(q1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
                    .addComponent(q4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
                    .addComponent(q7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(q2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
                    .addComponent(q5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(q8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(q3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
                    .addComponent(q6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
                    .addComponent(q9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(q3, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(q2, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(q1, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(q6, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(q5, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(q4, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(q9, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton8, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(q8, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton9, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(q7, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // btn code
        int i = Integer.valueOf(q1.getText());
        ++i;
        q1.setText(String.valueOf(i));
        
        addtables(1, "Kurta   ", i, 1.0);
        
        cal();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // btn code
        int i = Integer.valueOf(q2.getText());
        ++i;
        q2.setText(String.valueOf(i));
        
        addtables(2, "Pajama  ", i, 1.0);
        
        cal();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // btn code
        int i = Integer.valueOf(q3.getText());
        ++i;
        q3.setText(String.valueOf(i));
        
        addtables(3, "Shirt  ", i, 1.0);
        
        cal();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // btn code
        int i = Integer.valueOf(q4.getText());
        ++i;
        q4.setText(String.valueOf(i));
        
        addtables(4, "T-shirt  ", i, 1.0);
        
        cal();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // btn code
        int i = Integer.valueOf(q5.getText());
        ++i;
        q5.setText(String.valueOf(i));
        
        addtables(5, "Lower  ", i, 1.0);
        
        cal();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // btn code
        int i = Integer.valueOf(q6.getText());
        ++i;
        q6.setText(String.valueOf(i));
        
        addtables(6, "Shorts", i, 1.0);
        
        cal();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // btn code
        int i = Integer.valueOf(q7.getText());
        ++i;
        q7.setText(String.valueOf(i));
        
        addtables(7, "Duppatta", i, 1.0);
        
        cal();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // btn code
        int i = Integer.valueOf(q8.getText());
        ++i;
        q8.setText(String.valueOf(i));
        
        addtables(8, "Pillow Cover  ", i, 1.0);
        
        cal();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       // btn code
        int i = Integer.valueOf(q9.getText());
        ++i;
        q9.setText(String.valueOf(i));
        
        addtables(9, "BedSheet  ", i, 1.0);
        
        cal();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // delete some iteam
       
              
        DefaultTableModel dt = (DefaultTableModel) jTable1.getModel(); 
        
        String r = dt.getValueAt(jTable1.getSelectedRow(), 0).toString();
       
        //remove product
        int rw = jTable1.getSelectedRow();
        dt.removeRow(rw);       
        
        
       //remove Qty Lable
        System.out.println(r);
        switch (r) {
                   
                   case "1":                       
                   q1.setText("0");
                   break;
                   
                   case "2":                       
                   q2.setText("0");
                   break;
                   
                   case "3":                       
                   q3.setText("0");
                   break;
                   
                   case "4":                       
                   q4.setText("0");
                   break;
                   
                   case "5":                       
                   q5.setText("0");
                   break;
                   
                   case "6":                       
                   q6.setText("0");
                   
                   case "7":                       
                   q7.setText("0");
                   break;
                   
                   case "8":                       
                   q8.setText("0");
                   break;
                   
                   case "9":                       
                   q9.setText("0");
                   break;
                   
                   default:
                       System.out.println("over");
               }
        
        cal(); // after iteam delete calculate total
        
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // pat btn
        
        double tot = Double.valueOf(total.getText());
        double paid = Double.valueOf(pay.getText());
        double balance = paid - tot ;

                
        DecimalFormat df = new DecimalFormat("00.00") ;   
       
       
        bal.setText(String.valueOf(df.format(balance)));
              
        
        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // bill print
        
        try {
            
           b.setText("                               LaundryLink\n");
            b.setText(b.getText() + "                          Bennett University \n");
            b.setText(b.getText() + "                             Greter Noida \n");
            b.setText(b.getText() + "                            +91 8368528828, \n");
            b.setText(b.getText() + "---------------------------------------------------------------------\n");
            b.setText(b.getText() + "  Clothes \t\tQuantity " +"\n");
            b.setText(b.getText() + "---------------------------------------------------------------------\n");
            
            DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
            
            // get table Product details
            
            for (int i = 0; i < jTable1.getRowCount(); i++) {
                
                String Name = df.getValueAt(i, 1).toString();
                String Qty = df.getValueAt(i, 2).toString();
                String Price = df.getValueAt(i, 3).toString();
                
                b.setText(b.getText() +"  "+ Name+"\t\t"+Qty +"\t"+Price + "\n");
            }
            
            b.setText(b.getText() + "---------------------------------------------------------------------\n");
            b.setText(b.getText() + "Total Clothes: " + (total).getText() +"\n");
//            b.setText(b.getText() + "Cash      : " + pay.getText() +"\n");
//            b.setText(b.getText() + "Balance   : " + bal.getText() +"\n");
            b.setText(b.getText() + "---------------------------------------------------------------------\n");
            b.setText(b.getText() + "                     Thanks For Your Business...!"+"\n");
            b.setText(b.getText() + "---------------------------------------------------------------------\n");
            b.setText(b.getText() + "                     Software by Team Void"+"\n");
            
           
        b.print(); //print
            
            
        } catch (Exception e) {
            
            System.out.println(e);
            
            
        }
        
        
        
        
        
    }//GEN-LAST:event_jButton12ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JTextArea b;
    private JLabel bal;
    private JButton jButton1;
    private JButton jButton11;
    private JButton jButton12;
    private JButton jButton13;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JButton jButton6;
    private JButton jButton7;
    private JButton jButton8;
    private JButton jButton9;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JTable jTable1;
    private JTextField pay;
    private JLabel q1;
    private JLabel q2;
    private JLabel q3;
    private JLabel q4;
    private JLabel q5;
    private JLabel q6;
    private JLabel q7;
    private JLabel q8;
    private JLabel q9;
    private JLabel total;
    // End of variables declaration//GEN-END:variables
}
