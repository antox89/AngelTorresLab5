
package angeltorres_lab5;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;


public class Cinepolis extends javax.swing.JFrame {

    
    public Cinepolis() {
        initComponents();
        this.setLocationRelativeTo(null);
        Empleado b1 = new Boleteria("Boleteria01", "boleto1", "boleto1", "boleto1@gmail.com", new Date());
        Empleado a1 = new Aseo("Aseo01", "aseo1", "aseo1", "aseo1@gmail.com", new Date());
        Empleado d1 = new Dulceria("Dulceria01","dulce1","dulce1","dulceria1@gmail.com",new Date());
        
        lista.add(b1);
        lista.add(a1);
        lista.add(d1);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_admin = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jdc_admin_fecha = new com.toedter.calendar.JDateChooser();
        tf_admin_nombre = new javax.swing.JTextField();
        cb_admin_puesto = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        tf_admin_usuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_admin_password = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tf_admin_email = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        bt_admin_agregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_empleados = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        jl_empleados = new javax.swing.JList<>();
        jd_boleteria = new javax.swing.JDialog();
        jd_aseo = new javax.swing.JDialog();
        jd_dulceria = new javax.swing.JDialog();
        jd_login = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tf_login_usuario = new javax.swing.JTextField();
        tf_login_password = new javax.swing.JPasswordField();
        bt_login_signIn = new javax.swing.JButton();
        ppm_admin = new javax.swing.JPopupMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmi_login = new javax.swing.JMenuItem();
        jmi_logout = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmi_exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jLabel1.setText("Nombre:");

        jLabel2.setText("Fecha Nacimiento:");

        cb_admin_puesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dulceria", "Boleteria", "Aseo" }));

        jLabel3.setText("Usuario:");

        jLabel4.setText("Password:");

        jLabel5.setText("E-mail:");

        jLabel8.setText("Tipo:");

        bt_admin_agregar.setText("Agregar");
        bt_admin_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_admin_agregarMouseClicked(evt);
            }
        });

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Empleados");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Boleteria");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Dulceria");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Aseo");
        treeNode1.add(treeNode2);
        jt_empleados.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(jt_empleados);

        jl_empleados.setModel(new DefaultListModel());
        jScrollPane2.setViewportView(jl_empleados);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tf_admin_password, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tf_admin_usuario, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jdc_admin_fecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                    .addComponent(cb_admin_puesto, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(bt_admin_agregar)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tf_admin_email, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                            .addComponent(tf_admin_nombre))))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_admin_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jdc_admin_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_admin_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_admin_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_admin_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_admin_puesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(30, 30, 30)
                .addComponent(bt_admin_agregar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout jd_adminLayout = new javax.swing.GroupLayout(jd_admin.getContentPane());
        jd_admin.getContentPane().setLayout(jd_adminLayout);
        jd_adminLayout.setHorizontalGroup(
            jd_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_adminLayout.setVerticalGroup(
            jd_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jd_boleteriaLayout = new javax.swing.GroupLayout(jd_boleteria.getContentPane());
        jd_boleteria.getContentPane().setLayout(jd_boleteriaLayout);
        jd_boleteriaLayout.setHorizontalGroup(
            jd_boleteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_boleteriaLayout.setVerticalGroup(
            jd_boleteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jd_aseoLayout = new javax.swing.GroupLayout(jd_aseo.getContentPane());
        jd_aseo.getContentPane().setLayout(jd_aseoLayout);
        jd_aseoLayout.setHorizontalGroup(
            jd_aseoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_aseoLayout.setVerticalGroup(
            jd_aseoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jd_dulceriaLayout = new javax.swing.GroupLayout(jd_dulceria.getContentPane());
        jd_dulceria.getContentPane().setLayout(jd_dulceriaLayout);
        jd_dulceriaLayout.setHorizontalGroup(
            jd_dulceriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_dulceriaLayout.setVerticalGroup(
            jd_dulceriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jd_login.setTitle("Ingreso al Sistema de Cinepoli$");

        jLabel6.setText("Usuario:");

        jLabel7.setText("Contraseña:");

        bt_login_signIn.setText("Sign In");
        bt_login_signIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_login_signInMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_loginLayout = new javax.swing.GroupLayout(jd_login.getContentPane());
        jd_login.getContentPane().setLayout(jd_loginLayout);
        jd_loginLayout.setHorizontalGroup(
            jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_loginLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bt_login_signIn)
                    .addGroup(jd_loginLayout.createSequentialGroup()
                        .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_login_usuario)
                            .addComponent(tf_login_password, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jd_loginLayout.setVerticalGroup(
            jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_loginLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_login_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_login_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(bt_login_signIn)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jMenuItem3.setText("jMenuItem3");
        ppm_admin.add(jMenuItem3);

        jMenuItem4.setText("jMenuItem4");
        ppm_admin.add(jMenuItem4);

        jMenuItem5.setText("jMenuItem5");
        ppm_admin.add(jMenuItem5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cinepoli$");

        jMenu1.setText("Sistema");

        jmi_login.setText("Log In");
        jmi_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_loginActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_login);

        jmi_logout.setText("Log Out");
        jMenu1.add(jmi_logout);
        jMenu1.add(jSeparator1);

        jmi_exit.setText("Salir");
        jMenu1.add(jmi_exit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Administrar");

        jMenuItem1.setText("Empleados");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("jMenuItem2");
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_loginActionPerformed
        jd_login.pack();
        jd_login.setModal(true);
        jd_login.setLocationRelativeTo(this);
        jd_login.setVisible(true);
    }//GEN-LAST:event_jmi_loginActionPerformed

    private void bt_login_signInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_login_signInMouseClicked
        
        if(tf_login_usuario.getText().equals(admin) && tf_login_password.getText().equals(passAdm)){
                System.out.println("admin hola");
         }
        
        for (Empleado empleado : lista) {
            
            if(empleado instanceof Boleteria){
                if(tf_login_usuario.getText().equals(((Boleteria) empleado).nombre) && tf_login_password.getText().equals(((Boleteria) empleado).password)){
                    System.out.println("entré");
                    System.out.println("Hola "+ ((Boleteria)empleado).getNombre()+"\n");
                
                
            }
            
            if(empleado instanceof Aseo){
                if(tf_login_usuario.getText().equals(((Aseo) empleado).nombre) && tf_login_password.getText().equals(((Aseo) empleado).password)){
                    System.out.println("Hola "+ ((Aseo)empleado).getNombre()+"\n");
                }
                
            }
            
            if(empleado instanceof Dulceria){
                if(tf_login_usuario.getText().equals(((Dulceria) empleado).nombre) && tf_login_password.getText().equals(((Dulceria) empleado).password)){
                    System.out.println("Hola "+ ((Dulceria)empleado).getNombre()+"\n");
                }
                
            }
            
            }
        }
        
        
    }//GEN-LAST:event_bt_login_signInMouseClicked

    private void bt_admin_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_admin_agregarMouseClicked
        
        String nombre, usuario, password, email, puesto;
        Date fechaNacimiento;
        
        try{
            
            nombre =tf_admin_nombre.getText();
            usuario = tf_admin_usuario.getText();
            password = tf_admin_password.getText();
            email = tf_admin_email.getText();
            puesto = cb_admin_puesto.getSelectedItem().toString();
            fechaNacimiento = jdc_admin_fecha.getDate();
            
            Empleado e;
            
            DefaultListModel modeloLista = (DefaultListModel)jl_empleados.getModel();
            
            DefaultTreeModel m = (DefaultTreeModel)jt_empleados.getModel();
            DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)m.getRoot();
            
            
            if(puesto.equals("Boleteria")){
                puesto = "Boleteria";
                e = new Boleteria(nombre, usuario, password, email, fechaNacimiento);
                for (int i = 0; i < raiz.getChildCount(); i++) {
                
                    if(raiz.getChildAt(i).toString().equals("Boleteria")){
                        DefaultMutableTreeNode boleteria = new DefaultMutableTreeNode(e);
                        ((DefaultMutableTreeNode)raiz.getChildAt(i)).add(boleteria);
                        m.reload();
                    }
                }
                modeloLista.addElement(e);
                
            }
            if(puesto.equals("Dulceria")){
                puesto = "Dulceria";
                e = new Dulceria(nombre, usuario, password, email, fechaNacimiento);
                
                for (int i = 0; i < raiz.getChildCount(); i++) {
                
                    if(raiz.getChildAt(i).toString().equals("Dulceria")){
                        DefaultMutableTreeNode dulceria = new DefaultMutableTreeNode(e);
                        ((DefaultMutableTreeNode)raiz.getChildAt(i)).add(dulceria);
                        m.reload();
                    }
                }
                modeloLista.addElement(e);
            }
            if(puesto.equals("Aseo")){
                puesto = "Aseo";
                e = new Aseo(nombre, usuario, password, email, fechaNacimiento);
                for (int i = 0; i < raiz.getChildCount(); i++) {
                
                    if(raiz.getChildAt(i).toString().equals("Aseo")){
                        DefaultMutableTreeNode aseo = new DefaultMutableTreeNode(e);
                        ((DefaultMutableTreeNode)raiz.getChildAt(i)).add(aseo);
                        m.reload();
                    }
                }
                modeloLista.addElement(e);
            }
            
            
            
            
            
            
            
            
            
            
            
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(jd_admin, "Revise los datos");
        }
    }//GEN-LAST:event_bt_admin_agregarMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        jd_admin.pack();
        jd_admin.setModal(true);
        jd_admin.setLocationRelativeTo(this);
        jd_admin.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Cinepolis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cinepolis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cinepolis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cinepolis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cinepolis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_admin_agregar;
    private javax.swing.JButton bt_login_signIn;
    private javax.swing.JComboBox<String> cb_admin_puesto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JDialog jd_admin;
    private javax.swing.JDialog jd_aseo;
    private javax.swing.JDialog jd_boleteria;
    private javax.swing.JDialog jd_dulceria;
    private javax.swing.JDialog jd_login;
    private com.toedter.calendar.JDateChooser jdc_admin_fecha;
    private javax.swing.JList<String> jl_empleados;
    private javax.swing.JMenuItem jmi_exit;
    private javax.swing.JMenuItem jmi_login;
    private javax.swing.JMenuItem jmi_logout;
    private javax.swing.JTree jt_empleados;
    private javax.swing.JPopupMenu ppm_admin;
    private javax.swing.JTextField tf_admin_email;
    private javax.swing.JTextField tf_admin_nombre;
    private javax.swing.JTextField tf_admin_password;
    private javax.swing.JTextField tf_admin_usuario;
    private javax.swing.JPasswordField tf_login_password;
    private javax.swing.JTextField tf_login_usuario;
    // End of variables declaration//GEN-END:variables

    String admin="admin", passAdm="admin123";
    ArrayList<Empleado> lista = new ArrayList();
}
