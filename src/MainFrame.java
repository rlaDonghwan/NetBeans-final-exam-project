
import java.io.IOException;
import javax.swing.JOptionPane;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author alswp
 */
public class MainFrame extends javax.swing.JFrame {
    DB_MAN DBM = new DB_MAN();
    String strSQL = null;
    private Long loggedInUserId; // 세션처리
    
    
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        try {
            String strData = null;
            DBM.dbOpen();
            

            DBM.dbClose();
        } catch(Exception e){
            System.out.println("SQLException : " + e.getMessage());
        }
        
    }
    @SuppressWarnings("unchecked")  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        phoneNumber = new javax.swing.JTextField();
        register = new javax.swing.JButton();
        duplicateBtn = new javax.swing.JButton();
        pwd = new javax.swing.JPasswordField();
        pwdC = new javax.swing.JPasswordField();
        duplicateLabel = new javax.swing.JLabel();
        userRadioButton = new javax.swing.JRadioButton();
        ADMINRadioButton = new javax.swing.JRadioButton();
        adminAuthBtn = new javax.swing.JButton();
        birth = new com.toedter.calendar.JDateChooser();
        jFrame2 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        startBtn = new javax.swing.JButton();
        endBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        nameField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        payField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        monthPay = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        handOverBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        welcomeLabel2 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jFrame3 = new javax.swing.JFrame();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jTextField11 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jDialog1 = new javax.swing.JDialog();
        jLabel10 = new javax.swing.JLabel();
        auth = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jFrame4 = new javax.swing.JFrame();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jTextField3 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        loginBtn = new javax.swing.JButton();
        registerBtn = new javax.swing.JButton();
        Pwd = new javax.swing.JPasswordField();
        welcomeLabel1 = new javax.swing.JLabel();

        jLabel4.setText("이름");

        jLabel6.setText("전화번호(ID)");

        jLabel7.setText("비밀번호");

        jLabel8.setText("비밀번호 확인");

        jLabel9.setText("생년월일");

        jLabel12.setText("회원가입");

        register.setText("등록");
        register.setEnabled(false);
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        duplicateBtn.setText("중복확인");
        duplicateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duplicateBtnActionPerformed(evt);
            }
        });

        duplicateLabel.setText("중복 체크를 하세요!");
        duplicateLabel.setToolTipText("");
        duplicateLabel.setOpaque(true);

        buttonGroup3.add(userRadioButton);
        userRadioButton.setSelected(true);
        userRadioButton.setText("User");

        buttonGroup3.add(ADMINRadioButton);
        ADMINRadioButton.setText("ADMIN");
        ADMINRadioButton.setEnabled(false);

        adminAuthBtn.setText("관리자 인증");
        adminAuthBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminAuthBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(duplicateLabel)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addComponent(duplicateBtn)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jFrame1Layout.createSequentialGroup()
                                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(50, 50, 50)
                                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(phoneNumber)
                                    .addComponent(name)))
                            .addGroup(jFrame1Layout.createSequentialGroup()
                                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(42, 42, 42)
                                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jFrame1Layout.createSequentialGroup()
                                        .addComponent(userRadioButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ADMINRadioButton)
                                        .addGap(2, 2, 2))
                                    .addComponent(pwd, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(pwdC, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jFrame1Layout.createSequentialGroup()
                                        .addComponent(birth, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(18, 18, 18)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adminAuthBtn))
                        .addGap(33, 33, 33))))
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel5)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(duplicateLabel)
                        .addGap(18, 18, 18)))
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(duplicateBtn))
                .addGap(15, 15, 15)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(pwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(pwdC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(birth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userRadioButton)
                    .addComponent(ADMINRadioButton)
                    .addComponent(adminAuthBtn))
                .addGap(18, 18, 18)
                .addComponent(register)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "출근등록", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 0, 13), new java.awt.Color(0, 0, 255))); // NOI18N
        jPanel1.setToolTipText("");

        startBtn.setText("출근");
        buttonGroup2.add(startBtn);
        startBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBtnActionPerformed(evt);
            }
        });

        endBtn.setText("퇴근");
        buttonGroup2.add(endBtn);
        endBtn.setEnabled(false);
        endBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(endBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(startBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(endBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "근무자 정보", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 0, 13), new java.awt.Color(0, 0, 255))); // NOI18N

        jLabel13.setText("이름");

        payField.setText("9620");

        jLabel15.setText("시급");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(payField)
                    .addComponent(nameField))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(29, 29, 29))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "근무일 및 월급", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 0, 13), new java.awt.Color(0, 0, 255))); // NOI18N

        jLabel14.setText("근무일");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월", "9월", "10월", "11월", "12월" }));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel16.setText("월급");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(24, 24, 24)
                        .addComponent(monthPay, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(monthPay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "기타", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 0, 13), new java.awt.Color(0, 0, 255))); // NOI18N

        handOverBtn.setText("인수인계");

        logoutBtn.setText("로그아웃");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(handOverBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(logoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(handOverBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutBtn)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jFrame2Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(welcomeLabel2)
                            .addGroup(jFrame2Layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(welcomeLabel2)
                .addGap(18, 18, 18)
                .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 209, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 129, Short.MAX_VALUE)
        );

        jLabel11.setText("직원관리");

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "ID로 검색하시오.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 0, 13), new java.awt.Color(255, 0, 0))); // NOI18N

        jButton9.setText("검색");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9))
                .addGap(20, 20, 20))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel17.setText("ID");

        jLabel18.setText("시급");

        jLabel22.setBackground(new java.awt.Color(204, 204, 204));
        jLabel22.setText("jLabel22");

        jTextField12.setText("jTextField12");

        jButton10.setText("삭제");

        jButton11.setText("수정");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(46, 46, 46)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel22))
                .addGap(30, 30, 30)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(jButton11))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jFrame3Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame3Layout.createSequentialGroup()
                .addGroup(jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jFrame3Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jFrame3Layout.createSequentialGroup()
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel10.setText("관리자 인증 비밀번호");

        auth.setText("인증");
        auth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(0, 68, Short.MAX_VALUE)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDialog1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(auth)))
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(81, 81, 81))))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(auth)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel21.setText("jLabel21");

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        javax.swing.GroupLayout jFrame4Layout = new javax.swing.GroupLayout(jFrame4.getContentPane());
        jFrame4.getContentPane().setLayout(jFrame4Layout);
        jFrame4Layout.setHorizontalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame4Layout.createSequentialGroup()
                .addGroup(jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame4Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(jFrame4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3))))
                .addContainerGap())
        );
        jFrame4Layout.setVerticalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("로그인");

        jLabel2.setText("전화번호(ID)");

        jLabel3.setText("비밀번호");

        loginBtn.setText("로그인");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        registerBtn.setText("회원가입");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(registerBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(welcomeLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(id, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                .addComponent(Pwd)))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(welcomeLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Pwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginBtn)
                    .addComponent(registerBtn))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    public final void getDBData(String strQuery) {
    String strOutput = "|이름|\t|시작 시간|\t\t|종료 시간|\t\t|근무 시간|\n";
    jTextArea1.setText(strOutput);

    try {
        // SQL 쿼리 작성
        String query = "SELECT u.name, wh.start_time, wh.end_time, wh.work_duration " +
                       "FROM WorkHour wh " +
                       "JOIN User u ON wh.user_id = u.user_id " +
                       "JOIN UserRole ur ON u.user_id = ur.user_id " +
                       "WHERE ur.role = 'User' AND u.user_id = ?";

        // PreparedStatement 사용
        DBM.pstmt = DBM.DB_con.prepareStatement(query);
        DBM.pstmt.setLong(1, loggedInUserId);
        DBM.DB_rs = DBM.pstmt.executeQuery();

        while (DBM.DB_rs.next()) {
            strOutput = "";
            strOutput += DBM.DB_rs.getString("name") + "\t";
            strOutput += DBM.DB_rs.getString("start_time") + "\t";
            strOutput += DBM.DB_rs.getString("end_time") + "\t     ";
            strOutput += DBM.DB_rs.getString("work_duration") + "\n";
            jTextArea1.append(strOutput);
        }

        DBM.DB_rs.close();
    } catch (Exception e) {
        // 데이터베이스 작업 중 에러 발생 시
        System.out.println("SQLException : " + e.getMessage());
    }
}



    
  
    
    
    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        jFrame1.setLocation(300, 300);
        jFrame1.pack();
        jFrame1.setVisible(true);
        
    }//GEN-LAST:event_registerBtnActionPerformed

    private void updateWelcomeLabel(Long userId) {
        String userName = getUserNameById(userId);

        if (userName != null) {
            welcomeLabel1.setText(userName + " 님, 환영합니다!");
            welcomeLabel2.setText(userName + " 님, 환영합니다!");
            nameField.setText(userName);
        } else {
            welcomeLabel1.setText("로그아웃 되었습니다.");
            welcomeLabel2.setText("로그아웃 되었습니다.");
        }
    }


    private String getUserNameById(Long userId) {
        String userName = "";

        // SQL 쿼리 작성
        String query = "SELECT name FROM User WHERE user_id = " + userId;

        try {
            DBM.dbOpen();
            DBM.DB_rs = DBM.DB_stmt.executeQuery(query);

            if (DBM.DB_rs.next()) {
                userName = DBM.DB_rs.getString("name");
            }

            DBM.dbClose();
        } catch (Exception e) {
            // 데이터베이스 작업 중 에러 발생 시
            System.out.println("SQLException : " + e.getMessage());
        }

        return userName;
    }
    
    private Long getUserIdByPhoneNumber(String phoneNumber) {
        try {
            String query = "SELECT user_id FROM User WHERE phone_number = ?";
            DBM.pstmt = DBM.DB_con.prepareStatement(query);
            DBM.pstmt.setString(1, phoneNumber);

            DBM.DB_rs = DBM.pstmt.executeQuery();

            if (DBM.DB_rs.next()) {
                return DBM.DB_rs.getLong("user_id");
            }
        } catch (Exception e) {
            System.out.println("SQLException : " + e.getMessage());
        }

        return null; // 사용자를 찾지 못한 경우 null 반환
    }

   
    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
      String nameValue = name.getText();
      String phoneNumberValue = phoneNumber.getText();
      String passwordValue = new String(pwd.getPassword());
      String confirmPasswordValue = new String(pwdC.getPassword());
      String birthValue = null;
      
      Date birthDay = birth.getDate();
      if (birthDay != null) {
    // SimpleDateFormat을 사용하여 날짜를 문자열로 변환
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // 원하는 형식으로 포맷을 지정
        birthValue = sdf.format(birthDay); 
      }

      // 패스워드 확인
      if (!passwordValue.equals(confirmPasswordValue)) {
          duplicateLabel.setText("비밀번호가 일치하지 않습니다.");
          return; // 비밀번호가 일치하지 않으면 종료
      }

      // 패스워드 해싱
      String hashedPassword = hashPassword(passwordValue);

      // SQL 쿼리 작성
      strSQL = "INSERT INTO User (name, phone_number, password, birth_date) VALUES (";
      strSQL += "'" + nameValue + "',";
      strSQL += "'" + phoneNumberValue + "',";
      strSQL += "'" + hashedPassword + "',";
      strSQL += "'" + birthValue + "')";

     try {
        DBM.dbOpen();
        DBM.DB_stmt.executeUpdate(strSQL);

        // 회원가입 성공 시에 실행되어야 할 동작
        JOptionPane.showMessageDialog(this, "회원가입 성공!");
        
        ADMINRadioButton.setEnabled(false);
        phoneNumber.setText(null);
        name.setText(null);
        pwd.setText(null);
        pwdC.setText(null);
        birth.setDate(null);
        
        
        // 회원가입 성공 시에 jFrame1을 닫음
        jFrame1.dispose();

        // 새로 추가된 사용자의 userId 가져오기
        Long userId = getUserIdByPhoneNumber(phoneNumberValue);

        // UserRole 테이블에 권한 추가
        String role = userRadioButton.isSelected() ? "USER" : "ADMIN";
        addRoleToUserRoleTable(userId, role);

        DBM.dbClose();
        } catch (Exception e) {
            // 데이터베이스 작업 중 에러 발생 시
            System.out.println("SQLException : " + e.getMessage());
            JOptionPane.showMessageDialog(this, "회원가입 실패. 다시 시도하세요.");
        }
 
    }//GEN-LAST:event_registerActionPerformed
    
    // UserRole 테이블에 권한 추가
    private void addRoleToUserRoleTable(Long userId, String role) {
        try {
            String query = "INSERT INTO UserRole (user_id, role) VALUES (?, ?)";
            DBM.pstmt = DBM.DB_con.prepareStatement(query);
            DBM.pstmt.setLong(1, userId);
            DBM.pstmt.setString(2, role);
            DBM.pstmt.executeUpdate();

        } catch (Exception e) {
            System.out.println("SQLException : " + e.getMessage());
        }
    }

    

    
    
    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        String phoneNumberValue = id.getText();
        String passwordValue = new String(Pwd.getPassword());

        // 패스워드 해싱
        String hashedPassword = hashPassword(passwordValue);

        // SQL 쿼리 작성
        strSQL = "SELECT * FROM User WHERE phone_number = '" + phoneNumberValue + "' AND password = '" + hashedPassword + "'";

        try {
            DBM.dbOpen();
            DBM.DB_rs = DBM.DB_stmt.executeQuery(strSQL);

            if (DBM.DB_rs.next()) {
                // 로그인 성공
                Long userId = DBM.DB_rs.getLong("user_id");

                // 클래스 멤버 변수에 저장
                loggedInUserId = userId;

                // 세션 정보를 이용하여 환영 라벨 업데이트
                updateWelcomeLabel(loggedInUserId);

                // 여기서 성공한 후의 동작 추가
                JOptionPane.showMessageDialog(this, "로그인 성공!");
                getDBData(strSQL);
                id.setText(null);
                Pwd.setText(null);
                jFrame2.setLocation(300, 300);
                jFrame2.pack();
                jFrame2.setVisible(true);
                
                // 현재 프레임 닫지 않음
            } else {
                // 로그인 실패
                JOptionPane.showMessageDialog(this, "로그인 실패. 전화번호 또는 비밀번호를 확인하세요.");
            }
            DBM.dbClose();
        } catch (Exception e) {
            // 데이터베이스 작업 중 에러 발생 시
            System.out.println("SQLException : " + e.getMessage());
            JOptionPane.showMessageDialog(this, "로그인 실패. 다시 시도하세요.");
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void duplicateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duplicateBtnActionPerformed
        String phoneNumberValue = phoneNumber.getText();

        // 전화번호 중복 체크
        if (isPhoneNumberExists(phoneNumberValue)) {
            duplicateLabel.setText("이미 등록된 전화번호입니다.");
            register.setEnabled(false); // 이미 사용 중인 전화번호이므로 등록 버튼 비활성화
        } else {
            duplicateLabel.setText("사용 가능한 전화번호입니다.");
            register.setEnabled(true); // 사용 가능한 전화번호이므로 등록 버튼 활성화
        }
    }//GEN-LAST:event_duplicateBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // 세션 정보 초기화
        loggedInUserId = null;
        updateWelcomeLabel(loggedInUserId);
        jFrame2.dispose();

        // 로그아웃 완료 얼럿 창 띄우기
        JOptionPane.showMessageDialog(this, "로그아웃 완료!");
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void adminAuthBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminAuthBtnActionPerformed
            jDialog1.setLocationRelativeTo(this);
            jDialog1.pack();
            jDialog1.setVisible(true);
    }//GEN-LAST:event_adminAuthBtnActionPerformed

    private void authActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authActionPerformed
         // jPasswordField1에서 입력된 비밀번호 가져오기
        char[] passwordChars = jPasswordField1.getPassword();
        String enteredPassword = new String(passwordChars);

        // Authentication 테이블에 저장된 비밀번호 가져오기
        String storedPassword = getStoredAdminPassword();

        // 입력된 비밀번호를 해싱
        String hashedEnteredPassword = hashPassword(enteredPassword);

        // 입력된 해싱된 비밀번호와 저장된 비밀번호 비교
        if (hashedEnteredPassword.equals(storedPassword)) {
            // 인증 성공
            ADMINRadioButton.setEnabled(true);
            JOptionPane.showMessageDialog(null, "인증 완료!");
            jDialog1.dispose();
        } else {
            // 인증 실패
            ADMINRadioButton.setEnabled(false);
            JOptionPane.showMessageDialog(null, "인증 실패. 비밀번호를 확인하세요.");
        }
    }//GEN-LAST:event_authActionPerformed

        
   
    private void startBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBtnActionPerformed
        if (loggedInUserId != null) {
        try {
            // 데이터베이스 연결 열기
            DBM.dbOpen();

            // 현재 시간을 가져와서 데이터베이스에 저장할 준비
            LocalDateTime currentTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formattedTime = currentTime.format(formatter);

            // SQL 쿼리 작성
            strSQL = "INSERT INTO WorkHour (user_id, start_time) VALUES (?, ?)";

            try {
                // PreparedStatement를 사용하여 쿼리를 실행
                DBM.pstmt = DBM.DB_con.prepareStatement(strSQL);
                DBM.pstmt.setLong(1, loggedInUserId);  // 세션에서 가져온 현재 로그인한 사용자의 ID를 사용
                DBM.pstmt.setString(2, formattedTime); // 현재 시간을 쿼리에 넣음

                // 쿼리 실행
                DBM.pstmt.executeUpdate();

                // 출근 완료 알림 창 띄우기
                JOptionPane.showMessageDialog(this, "출근 완료!");
                startBtn.setEnabled(false);
                endBtn.setEnabled(true);

            } catch (Exception e) {
                // 데이터베이스 작업 중 에러 발생 시
                System.out.println("SQLException : " + e.getMessage());
                JOptionPane.showMessageDialog(this, "출근 시간 기록 실패. 다시 시도하세요.");
            } finally {
                // 예외 발생 여부와 상관없이 항상 데이터베이스 연결 닫기
                getDBData(strSQL);
                DBM.dbClose();
            }
        } catch (IOException e) {
            System.out.println("IOException : " + e.getMessage());
        }
    } else {
        // 사용자가 로그인하지 않은 경우
        JOptionPane.showMessageDialog(this, "로그인 후에 출근 기록이 가능합니다.");
    }
    }//GEN-LAST:event_startBtnActionPerformed

    private void endBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endBtnActionPerformed
    if (loggedInUserId != null) {
    try {
        // 데이터베이스 연결 열기
        DBM.dbOpen();

        // 현재 시간을 가져와서 데이터베이스에 저장할 준비
        LocalDateTime endTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedEndTime = endTime.format(formatter);

        // 출근 시간 가져오기
        LocalDateTime startTime = getStartTime(loggedInUserId);
        if (startTime != null) {
            // 근무 시간 계산 (분 단위)
            long workDurationInMinutes = Duration.between(startTime, endTime).toMinutes();

            // 근무 시간을 시간 단위로 변환
            long workDurationInHours = workDurationInMinutes / 60;

            // SQL 쿼리 작성
            strSQL = "UPDATE WorkHour SET end_time = ?, work_duration = IFNULL(work_duration, 0) + ? WHERE user_id = ? AND end_time IS NULL";

            try {
                // PreparedStatement를 사용하여 쿼리를 실행
                DBM.pstmt = DBM.DB_con.prepareStatement(strSQL);
                DBM.pstmt.setString(1, formattedEndTime); // 현재 시간을 쿼리에 넣음
                DBM.pstmt.setLong(2, workDurationInHours); // 계산된 근무 시간(시간 단위)을 쿼리에 넣음
                DBM.pstmt.setLong(3, loggedInUserId);    // 세션에서 가져온 현재 로그인한 사용자의 ID를 사용

                // 쿼리 실행
                DBM.pstmt.executeUpdate();

                // 퇴근 완료 알림 창 띄우기
                JOptionPane.showMessageDialog(this, "퇴근 완료!");
                startBtn.setEnabled(true);
                endBtn.setEnabled(false);

            } catch (Exception e) {
                // 데이터베이스 작업 중 에러 발생 시
                System.out.println("SQLException : " + e.getMessage());
                JOptionPane.showMessageDialog(this, "퇴근 시간 기록 실패. 다시 시도하세요.");
            }
        } else {
            // 출근 기록이 없는 경우
            JOptionPane.showMessageDialog(this, "출근 기록이 없습니다. 출근 후에 퇴근이 가능합니다.");
        }
    } catch (IOException e) {
        System.out.println("IOException : " + e.getMessage());
    } finally {
        try {
            // 예외 발생 여부와 상관없이 항상 데이터베이스 연결 닫기
            getDBData(strSQL);
            DBM.DB_rs.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
} else {
    // 사용자가 로그인하지 않은 경우
    JOptionPane.showMessageDialog(this, "로그인 후에 퇴근 기록이 가능합니다.");
}
    }//GEN-LAST:event_endBtnActionPerformed
    
    private boolean hasWorkEntryForToday(Long userId) throws Exception {
        // Check if there is an existing entry for the current date
        String checkQuery = "SELECT * FROM WorkHour WHERE user_id = ? AND DATE(start_time) = CURDATE()";
        DBM.pstmt = DBM.DB_con.prepareStatement(checkQuery);
        DBM.pstmt.setLong(1, userId);
        DBM.DB_rs = DBM.pstmt.executeQuery();
        boolean hasEntry = DBM.DB_rs.next();
        DBM.DB_rs.close();
        return hasEntry;
    }

    
    
    
    private LocalDateTime getStartTime(Long userId) {
        LocalDateTime startTime = null;

        try {
            // SQL 쿼리 작성
            String query = "SELECT start_time FROM WorkHour WHERE user_id = ? AND end_time IS NULL";
            DBM.pstmt = DBM.DB_con.prepareStatement(query);
            DBM.pstmt.setLong(1, userId);

            // 쿼리 실행
            DBM.DB_rs = DBM.pstmt.executeQuery();

            if (DBM.DB_rs.next()) {
                // 출근 기록이 있는 경우 출근 시간을 가져옴
                String startTimeString = DBM.DB_rs.getString("start_time");
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                startTime = LocalDateTime.parse(startTimeString, formatter);
            }

        } catch (Exception e) {
            System.out.println("SQLException : " + e.getMessage());
        }

        return startTime;
    }

    
    
    // Authentication 테이블에서 비밀번호 가져오는 메서드
    private String getStoredAdminPassword() {
       String storedPassword = "";

       try {
           DBM.dbOpen();
           String query = "SELECT password FROM Authentication";
           DBM.DB_rs = DBM.DB_stmt.executeQuery(query);

           if (DBM.DB_rs.next()) {
               storedPassword = DBM.DB_rs.getString("password");
           }

           DBM.dbClose();
       } catch (Exception e) {
           // 데이터베이스 작업 중 에러 발생 시
           System.out.println("SQLException: " + e.getMessage());
       }

       // 가져온 비밀번호를 해싱
       return hashPassword(storedPassword);
   }


    
    private boolean isPhoneNumberExists(String phoneNumber) {
        try {
            // 적절한 데이터베이스 쿼리를 사용하여 전화번호가 이미 데이터베이스에 있는지 확인
            // 만약 있다면 true를 반환하고, 없다면 false를 반환
            // 예시: "SELECT COUNT(*) FROM User WHERE phone_number = '전화번호'";
            DBM.dbOpen();
            String query = "SELECT COUNT(*) FROM User WHERE phone_number = '" + phoneNumber + "'";
            DBM.DB_rs = DBM.DB_stmt.executeQuery(query);
            DBM.DB_rs.next();
            int count = DBM.DB_rs.getInt(1);
            DBM.dbClose();

            return count > 0; // 전화번호가 이미 존재하면 true 반환
        } catch (Exception e) {
            System.out.println("SQLException : " + e.getMessage());
            return false; // 에러 발생 시 일단 false 반환
        }
    }

    
        // 패스워드를 해싱하는 메서드
    private String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashedBytes = md.digest(password.getBytes());

            // 바이트 배열을 16진수 문자열로 변환
            StringBuilder sb = new StringBuilder();
            for (byte b : hashedBytes) {
                sb.append(String.format("%02x", b));
            }

            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
 
    
    
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ADMINRadioButton;
    private javax.swing.JPasswordField Pwd;
    private javax.swing.JButton adminAuthBtn;
    private javax.swing.JButton auth;
    private com.toedter.calendar.JDateChooser birth;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton duplicateBtn;
    private javax.swing.JLabel duplicateLabel;
    private javax.swing.JButton endBtn;
    private javax.swing.JButton handOverBtn;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JFrame jFrame4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton loginBtn;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JTextField monthPay;
    private javax.swing.JTextField name;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField payField;
    private javax.swing.JTextField phoneNumber;
    private javax.swing.JPasswordField pwd;
    private javax.swing.JPasswordField pwdC;
    private javax.swing.JButton register;
    private javax.swing.JButton registerBtn;
    private javax.swing.JButton startBtn;
    private javax.swing.JRadioButton userRadioButton;
    private javax.swing.JLabel welcomeLabel1;
    private javax.swing.JLabel welcomeLabel2;
    // End of variables declaration//GEN-END:variables
}
