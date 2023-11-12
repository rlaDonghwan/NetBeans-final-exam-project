
import captcha.TextToGraphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
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
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

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
    String strASQL = "SELECT user_id, name, phone_number, birth_date, pay FROM User";
    String strSQL = null;
    private Long loggedInUserId; // 세션처리
    
    
    String currentCaptcha;
    
    //------------------------------------------------------------------------------
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        try {
            String strData = null;
            DBM.dbOpen();
            getUserData(strASQL);
            DBM.dbClose();
        } catch(Exception e){
            System.out.println("SQLException : " + e.getMessage());
        }
        
        lblImg.setText("");
        reset();
    }
    //------------------------------------------------------------------------------
    
    @SuppressWarnings("unchecked")  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registerFrame = new javax.swing.JFrame();
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
        userInfo = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        startBtn = new javax.swing.JButton();
        endBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        nameField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        payField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        monthComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTextArea = new javax.swing.JTextArea();
        totalPay = new javax.swing.JLabel();
        totalWorkTime = new javax.swing.JLabel();
        taxInclude = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        handOverBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        welcomeLabel2 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        adminAuthDialog = new javax.swing.JDialog();
        jLabel10 = new javax.swing.JLabel();
        auth = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        handOverFrame = new javax.swing.JFrame();
        javax.swing.JLabel handOverLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        handOverTextArea = new javax.swing.JTextArea();
        handOverInputField = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jTextField1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        adminFrame = new javax.swing.JFrame();
        jPanel11 = new javax.swing.JPanel();
        adminLogoutBtn = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        txtAdmin = new javax.swing.JTextField();
        btnSelect = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        adminPayField = new javax.swing.JTextField();
        adminDeleteBtn = new javax.swing.JButton();
        adminUpdateBtn = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        adminTextArea = new javax.swing.JTextArea();
        jPanel13 = new javax.swing.JPanel();
        adminHandOverBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        loginBtn = new javax.swing.JButton();
        registerBtn = new javax.swing.JButton();
        Pwd = new javax.swing.JPasswordField();
        welcomeLabel1 = new javax.swing.JLabel();
        txtCapcha = new javax.swing.JTextField();
        refreshBtn = new javax.swing.JButton();
        lblImg = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        authBtn = new javax.swing.JButton();

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

        javax.swing.GroupLayout registerFrameLayout = new javax.swing.GroupLayout(registerFrame.getContentPane());
        registerFrame.getContentPane().setLayout(registerFrameLayout);
        registerFrameLayout.setHorizontalGroup(
            registerFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerFrameLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(registerFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerFrameLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(duplicateLabel)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(duplicateBtn)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerFrameLayout.createSequentialGroup()
                        .addGroup(registerFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(registerFrameLayout.createSequentialGroup()
                                .addGroup(registerFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(50, 50, 50)
                                .addGroup(registerFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(phoneNumber)
                                    .addComponent(name)))
                            .addGroup(registerFrameLayout.createSequentialGroup()
                                .addGroup(registerFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(42, 42, 42)
                                .addGroup(registerFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pwd, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(pwdC, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerFrameLayout.createSequentialGroup()
                                        .addGroup(registerFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(birth, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(registerFrameLayout.createSequentialGroup()
                                                .addComponent(userRadioButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(ADMINRadioButton)))
                                        .addGap(2, 2, 2)))))
                        .addGap(18, 18, 18)
                        .addGroup(registerFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adminAuthBtn))
                        .addGap(33, 33, 33))))
            .addGroup(registerFrameLayout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        registerFrameLayout.setVerticalGroup(
            registerFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGroup(registerFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerFrameLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel5)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerFrameLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(duplicateLabel)
                        .addGap(18, 18, 18)))
                .addGroup(registerFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(duplicateBtn))
                .addGap(15, 15, 15)
                .addGroup(registerFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registerFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(pwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registerFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(pwdC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registerFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(birth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registerFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        monthComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월", "9월", "10월", "11월", "12월" }));
        monthComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthComboBoxActionPerformed(evt);
            }
        });

        userTextArea.setColumns(20);
        userTextArea.setRows(5);
        jScrollPane1.setViewportView(userTextArea);

        totalPay.setText("1");

        totalWorkTime.setText("1");
        totalWorkTime.setToolTipText("");

        taxInclude.setText("1");
        taxInclude.setToolTipText("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(totalWorkTime, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(totalPay, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(taxInclude)
                                .addGap(0, 250, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalPay)
                    .addComponent(totalWorkTime)
                    .addComponent(taxInclude))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "기타", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 0, 13), new java.awt.Color(0, 0, 255))); // NOI18N

        handOverBtn.setText("인수인계");
        handOverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                handOverBtnActionPerformed(evt);
            }
        });

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

        welcomeLabel2.setText("123123");

        javax.swing.GroupLayout userInfoLayout = new javax.swing.GroupLayout(userInfo.getContentPane());
        userInfo.getContentPane().setLayout(userInfoLayout);
        userInfoLayout.setHorizontalGroup(
            userInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userInfoLayout.createSequentialGroup()
                .addGroup(userInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userInfoLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(userInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(welcomeLabel2)
                            .addGroup(userInfoLayout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(userInfoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        userInfoLayout.setVerticalGroup(
            userInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userInfoLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(welcomeLabel2)
                .addGap(18, 18, 18)
                .addGroup(userInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jLabel10.setText("관리자 인증 비밀번호");

        auth.setText("인증");
        auth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adminAuthDialogLayout = new javax.swing.GroupLayout(adminAuthDialog.getContentPane());
        adminAuthDialog.getContentPane().setLayout(adminAuthDialogLayout);
        adminAuthDialogLayout.setHorizontalGroup(
            adminAuthDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminAuthDialogLayout.createSequentialGroup()
                .addGap(0, 68, Short.MAX_VALUE)
                .addGroup(adminAuthDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminAuthDialogLayout.createSequentialGroup()
                        .addGroup(adminAuthDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(adminAuthDialogLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(auth)))
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminAuthDialogLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(81, 81, 81))))
        );
        adminAuthDialogLayout.setVerticalGroup(
            adminAuthDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminAuthDialogLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(auth)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        handOverLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        handOverLabel.setText("인수인계");
        handOverLabel.setToolTipText("");

        handOverTextArea.setColumns(20);
        handOverTextArea.setRows(5);
        jScrollPane3.setViewportView(handOverTextArea);

        handOverInputField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                handOverInputFieldKeyTyped(evt);
            }
        });

        jLabel20.setText("입력: ");

        jLabel14.setText("이름 검색");

        jLabel16.setText("날짜 검색");

        javax.swing.GroupLayout handOverFrameLayout = new javax.swing.GroupLayout(handOverFrame.getContentPane());
        handOverFrame.getContentPane().setLayout(handOverFrameLayout);
        handOverFrameLayout.setHorizontalGroup(
            handOverFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(handOverFrameLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(handOverFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(handOverFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(handOverFrameLayout.createSequentialGroup()
                            .addComponent(jLabel20)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(handOverInputField, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(handOverFrameLayout.createSequentialGroup()
                        .addGroup(handOverFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16)
                            .addGroup(handOverFrameLayout.createSequentialGroup()
                                .addComponent(handOverLabel)
                                .addGap(47, 47, 47)
                                .addComponent(jLabel14)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(handOverFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(jTextField1))))
                .addGap(16, 28, Short.MAX_VALUE))
        );
        handOverFrameLayout.setVerticalGroup(
            handOverFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(handOverFrameLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(handOverFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(handOverLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(handOverFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(handOverFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(handOverInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(43, 43, 43))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        adminLogoutBtn.setText("로그아웃");
        adminLogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminLogoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adminLogoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adminLogoutBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel23.setText("환영합니다!");

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "ID로 검색하시오.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 0, 13), new java.awt.Color(255, 0, 0))); // NOI18N

        btnSelect.setText("검색");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelect))
                .addGap(20, 20, 20))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel24.setText("ID");

        jLabel25.setText("시급");

        adminDeleteBtn.setText("삭제");
        adminDeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminDeleteBtnActionPerformed(evt);
            }
        });

        adminUpdateBtn.setText("수정");
        adminUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminUpdateBtnActionPerformed(evt);
            }
        });

        jLabel26.setText("이름");

        jLabel27.setText("전화번호");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel27)
                    .addComponent(jLabel26))
                .addGap(22, 22, 22)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(adminPayField)
                    .addComponent(txtNum)
                    .addComponent(txtName)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(adminUpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(adminDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtID))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(adminPayField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adminUpdateBtn)
                            .addComponent(adminDeleteBtn))))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel28.setText("직원관리");

        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        adminTextArea.setColumns(20);
        adminTextArea.setRows(5);
        jScrollPane4.setViewportView(adminTextArea);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        adminHandOverBtn.setText("인수인계");
        adminHandOverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminHandOverBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adminHandOverBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adminHandOverBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout adminFrameLayout = new javax.swing.GroupLayout(adminFrame.getContentPane());
        adminFrame.getContentPane().setLayout(adminFrameLayout);
        adminFrameLayout.setHorizontalGroup(
            adminFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(adminFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(adminFrameLayout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel23))
                    .addGroup(adminFrameLayout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(adminFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(adminFrameLayout.createSequentialGroup()
                                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        adminFrameLayout.setVerticalGroup(
            adminFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminFrameLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(adminFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jLabel23))
                .addGap(18, 18, 18)
                .addGroup(adminFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminFrameLayout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(adminFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        refreshBtn.setText("새로고침");
        refreshBtn.setAutoscrolls(true);
        refreshBtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/refresh.png"))); // NOI18N
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        lblImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImg.setText("jLabel21");
        lblImg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel21.setText("자동 등록 방지를 위해 이미지에 나타난 문자를 입력하세요.");

        authBtn.setText("인증");
        authBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(registerBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(authBtn)
                                .addGap(18, 18, 18)
                                .addComponent(refreshBtn))
                            .addComponent(txtCapcha)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(welcomeLabel1)
                                    .addComponent(id, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                    .addComponent(Pwd)))
                            .addComponent(lblImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(30, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshBtn)
                    .addComponent(authBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCapcha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginBtn)
                    .addComponent(registerBtn))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //어드민창에서 데이터베이스의 user테이블 정보를 불러오는 메소드
    public final void getUserData(String strQuery){
        String strOutput = "ID\t이름\t전화번호\t   생년월일\t   시급\n";
        adminTextArea.setText(strOutput);
        
        try{
            DBM.DB_rs = DBM.DB_stmt.executeQuery(strQuery);
            while(DBM.DB_rs.next()){
                strOutput = "";
                strOutput += DBM.DB_rs.getString("user_id") + "\t";
                strOutput += DBM.DB_rs.getString("name") + "\t";
                strOutput += DBM.DB_rs.getString("phone_number") + "\t   ";
                strOutput += DBM.DB_rs.getString("birth_date") + "\t   ";
                strOutput += DBM.DB_rs.getString("pay") + "\n";
                adminTextArea.append(strOutput);
            }
            DBM.DB_rs.close();
        }catch(Exception e){
            System.out.println("SQLException : " + e.getMessage());
        }
    }
    




    //데이터베이스에서 값을 가져와서 jTextArea1뿌려주는 메소드
    public final void getDBData(String strQuery) {
        String strOutput = "|이름|\t|시작 시간|\t\t|종료 시간|\t\t|근무 시간|\n";
        userTextArea.setText(strOutput);

        try {
            // 데이터베이스 연결 열기
            DBM.dbOpen();

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

            long totalWorkHours = 0; // 변수 추가

            while (DBM.DB_rs.next()) {
                strOutput = "";
                strOutput += DBM.DB_rs.getString("name") + "\t";
                strOutput += DBM.DB_rs.getString("start_time") + "\t";
                strOutput += DBM.DB_rs.getString("end_time") + "\t     ";
                strOutput += DBM.DB_rs.getString("work_duration") + "\n";
                userTextArea.append(strOutput);

                // 총 일한 시간 누적
                totalWorkHours += DBM.DB_rs.getLong("work_duration");
            }

            // 총 일한 시간 출력
            totalWorkTime.setText("총 일한 시간: " + totalWorkHours + " 시간\n");
            String pay = payField.getText();
            long payLong = Long.parseLong(pay);
            totalPay.setText("총액: "+ String.valueOf(payLong * totalWorkHours)+ "원\n");
            //세후 금액 
            long grossPay = payLong * totalWorkHours; // 총 급여
            double taxRate = 0.033; // 세율
            long taxAmount = (long) (grossPay * taxRate); // 세금
            long netPay = grossPay - taxAmount; // 세후금액
            taxInclude.setText("3.3% 세후금액: " + netPay + "원\n");


            DBM.DB_rs.close();
        } catch (Exception e) {
            // 데이터베이스 작업 중 에러 발생 시
            System.out.println("SQLException : " + e.getMessage());
        } finally {
            try {
                // ResultSet을 닫아주는 메소드 호출
                if (DBM.DB_rs != null) {
                    DBM.DB_rs.close();
                }

                // 데이터베이스 연결 닫기
                DBM.dbClose();
            } catch (Exception ex) {
                System.out.println("Exception during closing resources: " + ex.getMessage());
            }
        }
    }

    //------------------------------------------------------------------------------
    
    
    //로그인을 성공하면 성공했다고 라벨에 사용자에 이름을 보여주는 메소드 로그인 로그아웃 메소드에서 사용됨
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
    //------------------------------------------------------------------------------
    
    //userId값으로 사용자에 이름을 찾아오는 메소드 라벨을 업데이트 할때 사용됨
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
    //------------------------------------------------------------------------------
    
    //회원가입 할 때 사용되고 전화번호 값으로 userId값을 찾을 때 사용됨
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
    //------------------------------------------------------------------------------
    
    
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
    //------------------------------------------------------------------------------ 
   
    
    // UserRole 테이블에 권한 추가하는 쿼리문을 가진 메소드
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
    //------------------------------------------------------------------------------
    
    
    //출근 시간을 가져와서 퇴근버튼에 뿌려주는 메소드
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
    //------------------------------------------------------------------------------
    
    //전화번호에 정보를 가져와서 회원가입을 할때 중복이 되는지 안되는지 확인할때 쓰임
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
    //------------------------------------------------------------------------------    
    
    //패스워드를 해싱하는 메소드 회원가입 로그인 어드민인증 과정에서 해싱해줌
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
    //------------------------------------------------------------------------------
    
    
    //회원가입 버튼을 누르면 jFrame1(회원가입을 하는 프레임)을 띄워줌
    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        registerFrame.setLocation(300, 300);
        registerFrame.pack();
        registerFrame.setVisible(true);
        
    }//GEN-LAST:event_registerBtnActionPerformed
    //------------------------------------------------------------------------------
    
    //회원가입 버튼 
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
           registerFrame.dispose();

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
    //------------------------------------------------------------------------------

    //로그인 버튼
    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed

        String phoneNumberValue = id.getText();
        String passwordValue = new String(Pwd.getPassword());

        // 패스워드 해싱
        String hashedPassword = hashPassword(passwordValue);

        // SQL 쿼리 작성
        strSQL = "SELECT u.user_id, u.name, ur.role " +
                 "FROM User u " +
                 "JOIN UserRole ur ON u.user_id = ur.user_id " +
                 "WHERE u.phone_number = '" + phoneNumberValue + "' AND u.password = '" + hashedPassword + "'";

        try {
            DBM.dbOpen();
            DBM.DB_rs = DBM.DB_stmt.executeQuery(strSQL);

            if (DBM.DB_rs.next()) {
                // 로그인 성공
                Long userId = DBM.DB_rs.getLong("user_id");
                String userRole = DBM.DB_rs.getString("role");

                // 클래스 멤버 변수에 저장
                loggedInUserId = userId;

                // 세션 정보를 이용하여 환영 라벨 업데이트
                updateWelcomeLabel(loggedInUserId);

                // 여기서 성공한 후의 동작 추가
                if ("USER".equals(userRole)) {
                    id.setText(null);
                    Pwd.setText(null);
                    userInfo.setLocation(400,0 );
                    userInfo.pack();
                    userInfo.setVisible(true);
                    getDBData(strSQL);                                                                      
                } else if ("ADMIN".equals(userRole)) {
                    // ADMIN일 경우 adminFrame 띄움
                    id.setText(null);
                    Pwd.setText(null);
                    adminFrame.setLocation(400, 300);
                    adminFrame.pack();
                    adminFrame.setVisible(true);
                }
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
    //------------------------------------------------------------------------------

    //중복 확인 메서드
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
    //------------------------------------------------------------------------------

    //로그아웃 버튼
    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // 세션 정보 초기화
        loggedInUserId = null;
        updateWelcomeLabel(loggedInUserId);
        userInfo.dispose();

        // 로그아웃 완료 얼럿 창 띄우기
        JOptionPane.showMessageDialog(this, "로그아웃 완료!");
    }//GEN-LAST:event_logoutBtnActionPerformed
    //------------------------------------------------------------------------------
    
    //어드빈 인증 버튼
    private void adminAuthBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminAuthBtnActionPerformed
            adminAuthDialog.setLocationRelativeTo(this);
            adminAuthDialog.pack();
            adminAuthDialog.setVisible(true);
    }//GEN-LAST:event_adminAuthBtnActionPerformed
    
    //관리자 인증 키 다이얼로그 화면에 있는 인증 버튼
    private void authActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authActionPerformed
        //jPasswordField1에서 입력된 비밀번호 가져오기
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
            adminAuthDialog.dispose();
        } else {
            // 인증 실패
            ADMINRadioButton.setEnabled(false);
            JOptionPane.showMessageDialog(null, "인증 실패. 비밀번호를 확인하세요.");
        }
    }//GEN-LAST:event_authActionPerformed
    //------------------------------------------------------------------------------
    
    //출근 시간 버튼
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
                    JOptionPane.showMessageDialog(userInfo, "출근 완료!");
                    startBtn.setEnabled(false);
                    endBtn.setEnabled(true);

                } catch (Exception e) {
                    // 데이터베이스 작업 중 에러 발생 시
                    System.out.println("SQLException : " + e.getMessage());
                    JOptionPane.showMessageDialog(userInfo, "출근 시간 기록 실패. 다시 시도하세요.");
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
            JOptionPane.showMessageDialog(userInfo, "로그인 후에 출근 기록이 가능합니다.");
        }
    }//GEN-LAST:event_startBtnActionPerformed
    //------------------------------------------------------------------------------
    
    //퇴근 시간 버튼
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

                long totalWorkDurationForUser = getTotalWorkDurationForUser(loggedInUserId);
                long updatedTotalWorkDuration = totalWorkDurationForUser + workDurationInHours;

                strSQL = "UPDATE WorkHour SET end_time = ?, work_duration = IFNULL(work_duration, 0) + ?, total_work_duration = IFNULL(total_work_duration, 0) + ? WHERE user_id = ? AND end_time IS NULL";

                try {
                    // PreparedStatement를 사용하여 쿼리를 실행
                    DBM.pstmt = DBM.DB_con.prepareStatement(strSQL);
                    DBM.pstmt.setString(1, formattedEndTime); // 현재 시간을 쿼리에 넣음
                    DBM.pstmt.setLong(2, workDurationInHours); // 계산된 근무 시간(분 단위)을 쿼리에 넣음
                    DBM.pstmt.setLong(3, updatedTotalWorkDuration); // total_work_duration에 더할 근무 시간(시간 단위)을 쿼리에 넣음
                    DBM.pstmt.setLong(4, loggedInUserId);
                                        System.out.println("쿼리 실행 전 total_work_duration: " + workDurationInHours);

                    // 쿼리 실행
                    DBM.pstmt.executeUpdate();

                    // 퇴근 완료 알림 창 띄우기
                    JOptionPane.showMessageDialog(userInfo, "퇴근 완료!");
                    startBtn.setEnabled(true);
                    endBtn.setEnabled(false);

                } catch (Exception e) {
                    // 데이터베이스 작업 중 에러 발생 시
                    System.out.println("SQLException : " + e.getMessage());
                    JOptionPane.showMessageDialog(userInfo, "퇴근 시간 기록 실패. 다시 시도하세요.");
                }

                } else {
                    // 출근 기록이 없는 경우
                    JOptionPane.showMessageDialog(userInfo, "출근 기록이 없습니다. 출근 후에 퇴근이 가능합니다.");
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
            JOptionPane.showMessageDialog(userInfo, "로그인 후에 퇴근 기록이 가능합니다.");
        }
    }//GEN-LAST:event_endBtnActionPerformed
    //------------------------------------------------------------------------------
        
    //누적 출근 시간 구하는 메서드
    public long getTotalWorkDurationForUser(long userId) {
        long totalWorkDuration = 0;

        try {
            // 데이터베이스 연결 열기
            DBM.dbOpen();

            // SQL 쿼리 작성
            String query = "SELECT SUM(IFNULL(work_duration, 0)) AS total_work_duration " +
                           "FROM WorkHour " +
                           "WHERE user_id = ?";

            // PreparedStatement 사용
            DBM.pstmt = DBM.DB_con.prepareStatement(query);
            DBM.pstmt.setLong(1, userId);
            DBM.DB_rs = DBM.pstmt.executeQuery();

            if (DBM.DB_rs.next()) {
                totalWorkDuration = DBM.DB_rs.getLong("total_work_duration");
            }

        } catch (Exception e) {
            // 데이터베이스 작업 중 에러 발생 시
            System.out.println("getSQLException : " + e.getMessage());
        } finally {
            try {
                // ResultSet을 닫아주는 메소드 호출
                if (DBM.DB_rs != null) {
                    DBM.DB_rs.close();
                }

                // 데이터베이스 연결 닫기
            } catch (Exception ex) {
                System.out.println("Exception during closing resources: " + ex.getMessage());
            }
        }
        System.out.println("쿼리 실행 전 total_work_duration: " + totalWorkDuration);
        return totalWorkDuration;
    }
    //------------------------------------------------------------------------------

    
    //인수인계 버튼
    private void handOverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_handOverBtnActionPerformed
        handOverFrame.setLocation(500, 100);
        handOverFrame.pack();
        handOverFrame.setVisible(true);
        updateHandOverTextArea();
    }//GEN-LAST:event_handOverBtnActionPerformed
    //------------------------------------------------------------------------------    
    
    //캡챠 리셋하는 메소드
    public void reset(){
        try {
            currentCaptcha = TextToGraphics.generateImage();
            Image img = ImageIO.read(new File("./src/captcha/Text.png"));
            lblImg.setIcon(new ImageIcon(img));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    //------------------------------------------------------------------------------
    
    //캡챠 새로고침 버튼
    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_refreshBtnActionPerformed
    //------------------------------------------------------------------------------

    //캡챠 인증버튼
    private void authBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authBtnActionPerformed
        if(currentCaptcha.equals(txtCapcha.getText())){
            loginBtn.setEnabled(true);
            JOptionPane.showMessageDialog(this, "인증성공!");
        }else{
            loginBtn.setEnabled(false);
            JOptionPane.showMessageDialog(this, "인증실패");
        }
    }//GEN-LAST:event_authBtnActionPerformed
    //------------------------------------------------------------------------------
    
    //콤보박스 날짜를 클릭하면 해당 달에 값이 출력 됌
    private void monthComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthComboBoxActionPerformed
        String selectedMonth = monthComboBox.getSelectedItem().toString();
        String monthWithoutSuffix = selectedMonth.replace("월", "");
        int monthAsInt = Integer.parseInt(monthWithoutSuffix);
        
        String strOutput = "|이름|\t|시작 시간|\t\t|종료 시간|\t\t|근무 시간|\n";
        userTextArea.setText(strOutput);

        try {
            // 데이터베이스 연결 열기
            DBM.dbOpen();

            String query = "SELECT u.name, wh.start_time, wh.end_time, wh.work_duration " +
                          "FROM WorkHour wh " +
                          "JOIN User u ON wh.user_id = u.user_id " +
                          "JOIN UserRole ur ON u.user_id = ur.user_id " +
                          "WHERE ur.role = 'User' AND u.user_id = ? " +
                          "AND MONTH(wh.start_time) = ? AND YEAR(wh.start_time) = YEAR(NOW())";

           DBM.pstmt = DBM.DB_con.prepareStatement(query);
           DBM.pstmt.setLong(1, loggedInUserId);
           DBM.pstmt.setInt(2, monthAsInt);

            DBM.DB_rs = DBM.pstmt.executeQuery();
            long totalWorkHours = 0; // 변수 추가

            System.out.println("실행할 쿼리: " + query);
            System.out.println("ResultSet의 상태: " + DBM.DB_rs);

            while (DBM.DB_rs.next()) {
                strOutput = "";
                strOutput += DBM.DB_rs.getString("name") + "\t";
                strOutput += DBM.DB_rs.getString("start_time") + "\t";
                strOutput += DBM.DB_rs.getString("end_time") + "\t     ";
                strOutput += DBM.DB_rs.getString("work_duration") + "\n";
                userTextArea.append(strOutput);
                userTextArea.append(strOutput);

                // 총 일한 시간 누적
                totalWorkHours += DBM.DB_rs.getLong("work_duration");
            }   
            // 총 일한 시간 출력
            totalWorkTime.setText("총 일한 시간: " + totalWorkHours + " 시간\n");
            String pay = payField.getText();
            long payLong = Long.parseLong(pay);
            totalPay.setText("총액: "+ String.valueOf(payLong * totalWorkHours)+ "원\n");
            //세후 금액 
            long grossPay = payLong * totalWorkHours; // 총 급여
            double taxRate = 0.033; // 세율
            long taxAmount = (long) (grossPay * taxRate); // 세금
            long netPay = grossPay - taxAmount; // 세후금액
            taxInclude.setText("3.3% 세후금액: " + netPay + "원\n");

            
            DBM.DB_rs.close();
        } catch (Exception e) {
            // 데이터베이스 작업 중 에러 발생 시
            System.out.println("SQLException : " + e.getMessage());
        } finally {
            try {
                // ResultSet을 닫아주는 메소드 호출
                if (DBM.DB_rs != null) {
                    DBM.DB_rs.close();
                }

                // 데이터베이스 연결 닫기
                DBM.dbClose();
            } catch (Exception ex) {
                System.out.println("Exception during closing resources: " + ex.getMessage());
            }
        }

    }//GEN-LAST:event_monthComboBoxActionPerformed
    //------------------------------------------------------------------------------
    
    private void handOverInputFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_handOverInputFieldKeyTyped
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
                if (loggedInUserId != null) {
                    try {
                        // 데이터베이스 연결 열기
                        DBM.dbOpen();

                        // 현재 시간을 가져와서 데이터베이스에 저장할 준비
                        LocalDateTime currentTime = LocalDateTime.now();
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                        String formattedTime = currentTime.format(formatter);

                        // 입력된 내용 가져오기
                        String note = handOverInputField.getText();

                        // SQL 쿼리 작성
                        String query = "INSERT INTO HandOver (user_id, input_time, handover_notes) VALUES (?, ?, ?)";

                        // PreparedStatement 사용
                        DBM.pstmt = DBM.DB_con.prepareStatement(query);
                        DBM.pstmt.setLong(1, loggedInUserId);
                        DBM.pstmt.setString(2, formattedTime);
                        DBM.pstmt.setString(3, note);
                        DBM.pstmt.executeUpdate();

                        // 저장된 값을 화면에 출력
                        updateHandOverTextArea();

                        // 입력 필드 초기화
                        handOverInputField.setText("");

                    } catch (Exception e) {
                        // 데이터베이스 작업 중 에러 발생 시
                        System.out.println("SQLException : " + e.getMessage());
                    } finally {
                        try {
                            // 데이터베이스 연결 닫기
                            DBM.dbClose();
                        } catch (Exception ex) {
                            System.out.println("Exception during closing resources: " + ex.getMessage());
                        }
                    }
                } else {
                    // 사용자가 로그인하지 않은 경우
                    JOptionPane.showMessageDialog(this, "로그인 후에 핸드오버 기록이 가능합니다.");
                }
            }
    }//GEN-LAST:event_handOverInputFieldKeyTyped
    //------------------------------------------------------------------------------
    
    private void updateHandOverTextArea() {
        try {
            // 데이터베이스 연결 열기
            DBM.dbOpen();

            // SQL 쿼리 작성
            String query = "SELECT u.name, ho.input_time, ho.handover_notes " +
                           "FROM HandOver ho " +
                           "JOIN User u ON ho.user_id = u.user_id " +
                           "ORDER BY ho.input_time";  // 최신 핸드오버가 먼저 나오도록 정렬

            // PreparedStatement 사용
            DBM.pstmt = DBM.DB_con.prepareStatement(query);
            DBM.DB_rs = DBM.pstmt.executeQuery();

            // 결과를 TextArea에 출력
            handOverTextArea.setText("");
            while (DBM.DB_rs.next()) {
                String output = "| " + DBM.DB_rs.getString("name") + " | " +
                                DBM.DB_rs.getString("input_time") + " | " +
                                DBM.DB_rs.getString("handover_notes") + " |\n";
                handOverTextArea.append(output);
            }

        } catch (Exception e) {
            // 데이터베이스 작업 중 에러 발생 시
            System.out.println("SQLException : " + e.getMessage());
        } finally {
            try {
                // ResultSet을 닫아주는 메소드 호출
                if (DBM.DB_rs != null) {
                    DBM.DB_rs.close();
                }

                // 데이터베이스 연결 닫기
                DBM.dbClose();
            } catch (Exception ex) {
                System.out.println("Exception during closing resources: " + ex.getMessage());
            }
        }
    }

    //------------------------------------------------------------------------------
    
    private void adminLogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminLogoutBtnActionPerformed

    }//GEN-LAST:event_adminLogoutBtnActionPerformed

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        adminTextArea.setText(null);
        String strQuery = "SELECT user_id, name, phone_number, birth_date, pay "
        + "FROM User WHERE User.user_id = '"
        + txtAdmin.getText() + "'";
        String strOutput = "ID\t이름\t전화번호\t   생년월일\t   시급\n";

        try{
            DBM.dbOpen();
            DBM.DB_rs = DBM.DB_stmt.executeQuery(strQuery);
            while(DBM.DB_rs.next()){
                strOutput += DBM.DB_rs.getString("user_id") + "\t";
                strOutput += DBM.DB_rs.getString("name") + "\t";
                strOutput += DBM.DB_rs.getString("phone_number") + "\t   ";
                strOutput += DBM.DB_rs.getString("birth_date") + "\t   ";
                strOutput += DBM.DB_rs.getString("pay") + "\n";
                adminTextArea.append(strOutput);
                txtID.setText(DBM.DB_rs.getString("user_id"));
                txtName.setText(DBM.DB_rs.getString("name"));
                txtNum.setText(DBM.DB_rs.getString("phone_number"));
                adminPayField.setText(DBM.DB_rs.getString("pay"));
            }

            DBM.DB_rs.close();
            DBM.dbClose();
        }catch(Exception e){
            System.out.println("SQLException : " + e.getMessage());
        }
    }//GEN-LAST:event_btnSelectActionPerformed

    private void adminDeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminDeleteBtnActionPerformed
        // TODO add your handling code here:
        strSQL = "Delete FROM User ";
        strSQL += "WHERE user_id = '" + txtID.getText() + "' ";
        try{
            DBM.dbOpen();
            DBM.DB_stmt.executeUpdate(strSQL);
            strSQL = "SELECT user_id, name, phone_number, birth_date, pay FROM USER";
            getUserData(strSQL);
            DBM.dbClose();
        }catch(Exception e){
            System.out.println("SQLException : " + e.getMessage());
        }
    }//GEN-LAST:event_adminDeleteBtnActionPerformed

    private void adminUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminUpdateBtnActionPerformed
        // TODO add your handling code here:
        strSQL = "Update User Set ";
        strSQL += "user_id = '" + txtID.getText() + "', ";
        strSQL += "name = '" + txtName.getText() + "', ";
        strSQL += "phone_number = '" + txtNum.getText() + "', ";
        strSQL += "pay = '" + adminPayField.getText() + "' ";
        strSQL += "WHERE user_id = '" + txtID.getText() + "' ";

        try{
            DBM.dbOpen();
            DBM.DB_stmt.executeUpdate(strSQL);
            strSQL = "SELECT user_id, name, phone_number, birth_date, pay FROM User";
            getUserData(strSQL);
            DBM.dbClose();
        }catch(Exception e){
            System.out.println("SQLException : " + e.getMessage());
        }
    }//GEN-LAST:event_adminUpdateBtnActionPerformed

    private void adminHandOverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminHandOverBtnActionPerformed
        handOverFrame.setLocation(500, 100);
        handOverFrame.pack();
        handOverFrame.setVisible(true);
        updateHandOverTextArea();
    }//GEN-LAST:event_adminHandOverBtnActionPerformed
    //------------------------------------------------------------------------------
    









    
    
    
    
    
    //-------------------------------------------------------------------------------------------------------------------
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
    private javax.swing.JDialog adminAuthDialog;
    private javax.swing.JButton adminDeleteBtn;
    private javax.swing.JFrame adminFrame;
    private javax.swing.JButton adminHandOverBtn;
    private javax.swing.JButton adminLogoutBtn;
    private javax.swing.JTextField adminPayField;
    private javax.swing.JTextArea adminTextArea;
    private javax.swing.JButton adminUpdateBtn;
    private javax.swing.JButton auth;
    private javax.swing.JButton authBtn;
    private com.toedter.calendar.JDateChooser birth;
    private javax.swing.JButton btnSelect;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton duplicateBtn;
    private javax.swing.JLabel duplicateLabel;
    private javax.swing.JButton endBtn;
    private javax.swing.JButton handOverBtn;
    private javax.swing.JFrame handOverFrame;
    private javax.swing.JTextField handOverInputField;
    private javax.swing.JTextArea handOverTextArea;
    private javax.swing.JTextField id;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblImg;
    private javax.swing.JButton loginBtn;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JComboBox<String> monthComboBox;
    private javax.swing.JTextField name;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField payField;
    private javax.swing.JTextField phoneNumber;
    private javax.swing.JPasswordField pwd;
    private javax.swing.JPasswordField pwdC;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton register;
    private javax.swing.JButton registerBtn;
    private javax.swing.JFrame registerFrame;
    private javax.swing.JButton startBtn;
    private javax.swing.JLabel taxInclude;
    private javax.swing.JLabel totalPay;
    private javax.swing.JLabel totalWorkTime;
    private javax.swing.JTextField txtAdmin;
    private javax.swing.JTextField txtCapcha;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNum;
    private javax.swing.JFrame userInfo;
    private javax.swing.JRadioButton userRadioButton;
    private javax.swing.JTextArea userTextArea;
    private javax.swing.JLabel welcomeLabel1;
    private javax.swing.JLabel welcomeLabel2;
    // End of variables declaration//GEN-END:variables
}
