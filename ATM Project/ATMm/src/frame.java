/**
 *
 * @author Dishon Wambua
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
public class frame extends javax.swing.JFrame {

    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
    public int Recogniser,amount;
    public String pin;
    public frame() {
        initComponents();
        conn=Connector.connection();
        Recogniser=0;
        disable();
        btnWithdraw.setEnabled(false);
        txtArea2.setText("please insert your card");
    }
    
    public void enable(){
    txtDisplay.setEnabled(true);
    
    btnON.setEnabled(false);
    btnOFF.setEnabled(true);
    
    
  txtArea2.setEnabled(true);
  txtDisplay.setEnabled(true);
   btnEnter.setEnabled(true);
   btnX.setEnabled(true);
   btn8.setEnabled(true);
   btn7.setEnabled(true);
   btn9.setEnabled(true);
   btn0.setEnabled(true);
   btn6.setEnabled(true);
   btn5.setEnabled(true);
   btn4.setEnabled(true);
   btn3.setEnabled(true);
   btn2.setEnabled(true);
   btn1.setEnabled(true);
   btnWithdraw.setEnabled(true);
   btnBal.setEnabled(true);
   btnDeposit.setEnabled(true);
   btnReceit.setEnabled(true);
   btnMenu.setEnabled(true);
   txtArea1.setEnabled(true);
    }
    
    public void disable(){
    txtDisplay.setEnabled(false);
    
    btnON.setEnabled(true);
    btnOFF.setEnabled(false);
    Recogniser=0;
    
  txtArea2.setEnabled(false);
  txtDisplay.setEnabled(false);
   btnEnter.setEnabled(false);
   btnX.setEnabled(false);
   btn8.setEnabled(false);
   btn7.setEnabled(false);
   btn9.setEnabled(false);
   btn0.setEnabled(false);
   btn6.setEnabled(false);
   btn5.setEnabled(false);
   btn4.setEnabled(false);
   btn3.setEnabled(false);
   btn2.setEnabled(false);
   btn1.setEnabled(false);
   btnWithdraw.setEnabled(false);
   btnBal.setEnabled(false);
   btnDeposit.setEnabled(false);
   btnReceit.setEnabled(false);
   btnMenu.setEnabled(false);
   txtArea1.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnOFF = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        btn6 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btnX = new javax.swing.JButton();
        btnEnter = new javax.swing.JButton();
        btnTrial = new javax.swing.JLabel();
        txtDisplay = new javax.swing.JPasswordField();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        btnWithdraw = new javax.swing.JButton();
        btnMenu = new javax.swing.JLabel();
        btnBal = new javax.swing.JButton();
        btnDeposit = new javax.swing.JButton();
        btnReceit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea2 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArea1 = new javax.swing.JTextArea();
        btnON = new javax.swing.JRadioButton();
        btnClose = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ATM MACHINE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 0, 158, 33));

        btnOFF.setBackground(new java.awt.Color(153, 255, 204));
        btnOFF.setText("CARD OUT");
        btnOFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOFFActionPerformed(evt);
            }
        });
        jPanel1.add(btnOFF, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 36, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jInternalFrame2.setVisible(true);

        btn6.setBackground(new java.awt.Color(102, 102, 102));
        btn6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn1.setBackground(new java.awt.Color(102, 102, 102));
        btn1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(102, 102, 102));
        btn9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(102, 102, 102));
        btn3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(102, 102, 102));
        btn2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn0.setBackground(new java.awt.Color(102, 102, 102));
        btn0.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn0.setForeground(new java.awt.Color(255, 255, 255));
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(102, 102, 102));
        btn7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn7.setForeground(new java.awt.Color(255, 255, 255));
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(102, 102, 102));
        btn8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(102, 102, 102));
        btn5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(102, 102, 102));
        btn4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btnX.setBackground(new java.awt.Color(204, 255, 255));
        btnX.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnX.setForeground(new java.awt.Color(153, 0, 153));
        btnX.setText("X");
        btnX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXActionPerformed(evt);
            }
        });

        btnEnter.setBackground(new java.awt.Color(51, 255, 51));
        btnEnter.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnEnter.setForeground(new java.awt.Color(153, 0, 153));
        btnEnter.setText("OK");
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jInternalFrame2Layout.createSequentialGroup()
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn7)
                            .addComponent(btnX))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                                .addComponent(btn8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                                .addComponent(btn0)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEnter))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jInternalFrame2Layout.createSequentialGroup()
                            .addComponent(btn1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jInternalFrame2Layout.createSequentialGroup()
                            .addComponent(btn4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btn5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn6))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn3)
                    .addComponent(btn2)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6)
                    .addComponent(btn5))
                .addGap(5, 5, 5)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8)
                    .addComponent(btn9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn0)
                    .addComponent(btnX)
                    .addComponent(btnEnter))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        btnTrial.setBackground(new java.awt.Color(204, 255, 204));
        btnTrial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTrial.setForeground(new java.awt.Color(255, 0, 0));
        btnTrial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTrial.setText("3 TRIALS ONLY");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnTrial, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTrial, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 277, -1, 260));

        jInternalFrame1.setVisible(true);

        btnWithdraw.setBackground(new java.awt.Color(204, 102, 255));
        btnWithdraw.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnWithdraw.setText("2:withdraw ");
        btnWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWithdrawActionPerformed(evt);
            }
        });

        btnMenu.setBackground(new java.awt.Color(153, 255, 204));
        btnMenu.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(255, 0, 0));
        btnMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMenu.setText("OPERATIONS:");

        btnBal.setBackground(new java.awt.Color(204, 102, 255));
        btnBal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBal.setText("1:BAL_INQ");
        btnBal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBalActionPerformed(evt);
            }
        });

        btnDeposit.setBackground(new java.awt.Color(153, 255, 153));
        btnDeposit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDeposit.setText("4:RESTART");
        btnDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositActionPerformed(evt);
            }
        });

        btnReceit.setBackground(new java.awt.Color(255, 153, 153));
        btnReceit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnReceit.setText("3:RECEIT ");
        btnReceit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReceitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBal, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnReceit, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReceit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jInternalFrame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 123, -1, -1));

        txtArea2.setEditable(false);
        txtArea2.setColumns(20);
        txtArea2.setRows(5);
        jScrollPane1.setViewportView(txtArea2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 51, 259, 90));

        txtArea1.setEditable(false);
        txtArea1.setColumns(20);
        txtArea1.setForeground(new java.awt.Color(51, 0, 204));
        txtArea1.setRows(5);
        jScrollPane2.setViewportView(txtArea1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 259, 110));

        btnON.setBackground(new java.awt.Color(153, 255, 204));
        btnON.setText("CARD IN");
        btnON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnONActionPerformed(evt);
            }
        });
        jPanel1.add(btnON, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 93, 90, 24));

        btnClose.setBackground(new java.awt.Color(153, 255, 255));
        btnClose.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnClose.setForeground(new java.awt.Color(255, 0, 0));
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close.png"))); // NOI18N
        btnClose.setText("CLOSE");
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jPanel1.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, -1, 45));

        jTextField1.setEditable(false);
        jTextField1.setText("-----------------------------------");
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 66, 143, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXActionPerformed
        // TODO add your handling code here:
        String backspace = null;
        if(txtDisplay.getText().length()>0)
        {
        StringBuilder strB = new StringBuilder(txtDisplay.getText());
        strB.deleteCharAt(txtDisplay.getText().length() -1);
        backspace =strB.toString();
        txtDisplay.setText(backspace);
        }
    }//GEN-LAST:event_btnXActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        if(Recogniser==1){
            String num1 = txtArea1.getText()+btn4.getText();
            txtArea1.setText(num1);
        }else{
            String EnterNumber =  txtDisplay.getText()+btn4.getText();
        txtDisplay.setText(EnterNumber);
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        if(Recogniser==1){
            String num1 = txtArea1.getText()+btn5.getText();
            txtArea1.setText(num1);
        }else{
            String EnterNumber =  txtDisplay.getText()+btn5.getText();
        txtDisplay.setText(EnterNumber);
        }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        if(Recogniser==1){
            String num1 = txtArea1.getText()+btn8.getText();
            txtArea1.setText(num1);
        }else{
            String EnterNumber =  txtDisplay.getText()+btn8.getText();
        txtDisplay.setText(EnterNumber);
        }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        if(Recogniser==1){
            String num1 = txtArea1.getText()+btn7.getText();
            txtArea1.setText(num1);
        }else{
            String EnterNumber =  txtDisplay.getText()+btn7.getText();
        txtDisplay.setText(EnterNumber);
        }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        // TODO add your handling code here:
        if(Recogniser==1){
            String num1 = txtArea1.getText()+btn0.getText();
            txtArea1.setText(num1);
        }else{
            String EnterNumber =  txtDisplay.getText()+btn0.getText();
        txtDisplay.setText(EnterNumber);
        }
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        if(Recogniser==1){
            String num1 = txtArea1.getText()+btn2.getText();
            txtArea1.setText(num1);
        }else{
            String EnterNumber =  txtDisplay.getText()+btn2.getText();
        txtDisplay.setText(EnterNumber);
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        if(Recogniser==1){
            String num1 = txtArea1.getText()+btn3.getText();
            txtArea1.setText(num1);
        }else{
            String EnterNumber =  txtDisplay.getText()+btn3.getText();
        txtDisplay.setText(EnterNumber);
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        if(Recogniser==1){
            String num1 = txtArea1.getText()+btn9.getText();
            txtArea1.setText(num1);
        }else{
            String EnterNumber =  txtDisplay.getText()+btn9.getText();
        txtDisplay.setText(EnterNumber);
        }
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
       if(Recogniser==1){
            String num1 = txtArea1.getText()+btn1.getText();
            txtArea1.setText(num1);
        }else{
            String EnterNumber =  txtDisplay.getText()+btn1.getText();
        txtDisplay.setText(EnterNumber);
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        if(Recogniser==1){
            String num1 = txtArea1.getText()+btn6.getText();
            txtArea1.setText(num1);
        }else{
            String EnterNumber =  txtDisplay.getText()+btn6.getText();
        txtDisplay.setText(EnterNumber);
        }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btnONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnONActionPerformed
        // TODO add your handling code here:
        txtArea2.setText("card inserted\n welcome:please enter your PIN");
        enable();
        btnWithdraw.setEnabled(false);
        btnBal.setEnabled(false);
        btnReceit.setEnabled(false);
    }//GEN-LAST:event_btnONActionPerformed

    private void btnOFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOFFActionPerformed
        // TODO add your handling code here:
        txtArea2.setText("card removed\n Good Bye!!!");
        disable();
    }//GEN-LAST:event_btnOFFActionPerformed

    private void btnBalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBalActionPerformed
        // TODO add your handling code here:

        String sql ="select * from AtmDetails where PIN=?";
        try{
            pst=conn.prepareStatement(sql);
            pst.setString(1, pin);
            rs=pst.executeQuery();
            if(rs.next()){
                String add1=rs.getString("BALANCE");
                txtArea2.setText("CONFIRMED...\n Your Current Balance:Kshs "+ add1);
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }finally{

        }

    }//GEN-LAST:event_btnBalActionPerformed

    private void btnWithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWithdrawActionPerformed
        // TODO add your handling code here:
        String sql="select * from AtmDetails where PIN=?";
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1, pin);
            rs=pst.executeQuery();
            if(rs.next()){
                String bal= rs.getString("BALANCE");
                int  balance = Integer.parseInt(bal);
                if(balance<80){
                    txtArea2.setText("insufficient balance");
                    
                }else{
                   txtArea2.setText("Enter Amount to withdraw:");
                   txtArea1.setText(""); 
                   Recogniser=1;
                  
                }
            }else{
                JOptionPane.showMessageDialog(null, "Withdraw not allowed");
            }
            btnReceit.setEnabled(true);
        }catch(Exception e){
           JOptionPane.showMessageDialog(null,e); 
        }
        
    }//GEN-LAST:event_btnWithdrawActionPerformed

    private void btnDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositActionPerformed
        // TODO add your handling code here:
        txtArea1.setText("");
        txtArea2.setText("PLEASE INSERT YOUR CARD AGAIN:\n"+"To restart::::");
        txtDisplay.setText("");
        disable();
    }//GEN-LAST:event_btnDepositActionPerformed

    private void btnReceitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReceitActionPerformed
        // TODO add your handling code here:
         try{
        String sql="select*from AtmDetails where PIN=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, pin);
            rs=pst.executeQuery();
            if(rs.next()){
                String bal=rs.getString("BALANCE");
                int balance=Integer.parseInt(bal);
                if(balance>80){
                    int newBalance=balance-50-amount;
                    String sql1="update AtmDetails set BALANCE='"+newBalance+"' where PIN='"+pin+"'";
                    try{
                        pst=conn.prepareStatement(sql1);
                        pst.execute();
       txtArea1.setText("withdraw of kshs "+amount+" \n transaction cost kshs 50"+"\nYour availablebalance is kshs"+ newBalance+"\nThank for Banking with us!!!");
                    
                }catch(Exception e){
                    
                    
            }
                }else{
                    txtArea1.setText("no transaction was made");
                }
            }
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_btnReceitActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
        // TODO add your handling code here:
        if(Recogniser==0){
            
        String sql ="select * from AtmDetails where PIN=? and ifBLOCKED=?";
                try{
            
          pst=conn.prepareStatement(sql);
          
          pst.setString(1, txtDisplay.getText());
          pst.setString(2,"1");
          rs=pst.executeQuery();
         
          if(rs.next()){
              int availablebalance=1000000;
              txtArea2.setText("PIN accepted\n proceed to next operation...");
              btnWithdraw.setEnabled(true);
              btnBal.setEnabled(true);
              pin=txtDisplay.getText();
              rs.close();
              pst.close();
          }else{
           txtArea2.setText("oops!!Wrong PIN"); 
           btnTrial.setText("2 trials remaining");
          } 
            
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }finally{
             try{
                rs.close();
                pst.close();
            }catch(Exception e){
                
            }
        }
        }else{
         amount=Integer.parseInt(txtArea1.getText());
        String sql="select * from AtmDetails where PIN=?";
        try{
            pst=conn.prepareStatement(sql);
            pst.setString(1, pin);
            rs=pst.executeQuery();
            if(rs.next()){
                
                String bal=rs.getString("BALANCE");
                int balance=Integer.parseInt(bal);
                balance=balance-amount;
                if(balance<80){
                   txtArea1.setText("Sorry!!!\nYou have insufficientBalance to\n complete the transaction\nYour balance is: Kshs "+bal); 
                }else{
                  int newBalance=balance-30-amount;
                  String sql1="update AtmDetails set BALANCE='"+newBalance+"' where PIN='"+pin+"'";
                  try{
                      pst=conn.prepareStatement(sql1);
                      pst.executeUpdate();
                      txtArea2.setText("You have successfully withdrawn \nKshs "+amount+", transaction cost Kshs 30"+"\nYou new balance is Kshs "+newBalance); 
                      btnReceit.setEnabled(true);
                      txtArea1.setText("Do you want a Receit for your\n transaction?\nYES...Click RECEIT under operations.\nNO...Click CLOSE");
                    }catch(Exception e){
                     
                 }
                 
                }
                
            }
        }catch(Exception e){
            
        }
            }
    }//GEN-LAST:event_btnEnterActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBal;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDeposit;
    private javax.swing.JButton btnEnter;
    private javax.swing.JLabel btnMenu;
    private javax.swing.JRadioButton btnOFF;
    private javax.swing.JRadioButton btnON;
    private javax.swing.JButton btnReceit;
    private javax.swing.JLabel btnTrial;
    private javax.swing.JButton btnWithdraw;
    private javax.swing.JButton btnX;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextArea txtArea1;
    private javax.swing.JTextArea txtArea2;
    private javax.swing.JPasswordField txtDisplay;
    // End of variables declaration//GEN-END:variables
}
