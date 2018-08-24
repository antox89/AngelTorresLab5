
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
        bt_admin_guardar.setVisible(false);
        bt_admin_agregar.setVisible(false);
        bt_boleteria_agregar.setVisible(false);
        bt_boleteria_guardar.setVisible(false);
        
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
        bt_admin_guardar = new javax.swing.JButton();
        jd_boleteria = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jt_boleteria = new javax.swing.JTree();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tf_boleteria_nombre = new javax.swing.JTextField();
        sp_boleteria_duracion = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        cb_boleteria_cat = new javax.swing.JComboBox<>();
        bt_boleteria_guardar = new javax.swing.JButton();
        bt_boleteria_agregar = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        tf_boleteria_clasificacion = new javax.swing.JTextField();
        jd_aseo = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jt_boleteria1 = new javax.swing.JTree();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel18 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        cb_boleteria_cat1 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jd_dulceria = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jt_boleteria2 = new javax.swing.JTree();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jLabel23 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        cb_boleteria_cat2 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jd_login = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tf_login_usuario = new javax.swing.JTextField();
        tf_login_password = new javax.swing.JPasswordField();
        bt_login_signIn = new javax.swing.JButton();
        ppm_admin = new javax.swing.JPopupMenu();
        jmi_ver = new javax.swing.JMenuItem();
        jmi_modificar = new javax.swing.JMenuItem();
        jmi_eliminar = new javax.swing.JMenuItem();
        ppm_boleteria = new javax.swing.JPopupMenu();
        jmi_boleteria_ver = new javax.swing.JMenuItem();
        jmi_boleteria_modificar = new javax.swing.JMenuItem();
        jmi_boleteria_eliminar = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmi_login = new javax.swing.JMenuItem();
        jmi_logout = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmi_exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmi_empleados = new javax.swing.JMenuItem();
        jmi_boleteria = new javax.swing.JMenuItem();

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
        jt_empleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_empleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_empleados);

        jl_empleados.setModel(new DefaultListModel());
        jScrollPane2.setViewportView(jl_empleados);

        bt_admin_guardar.setText("Guardar");
        bt_admin_guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_admin_guardarMouseClicked(evt);
            }
        });

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
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(bt_admin_guardar)
                            .addGap(30, 30, 30)
                            .addComponent(bt_admin_agregar))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_admin_agregar)
                    .addComponent(bt_admin_guardar))
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

        jd_boleteria.setTitle("Boleteria");

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Peliculas");
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Terror");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Comedia");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Romance");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Drama");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Accion");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Infantil");
        treeNode1.add(treeNode2);
        jt_boleteria.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jt_boleteria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_boleteriaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jt_boleteria);

        jLabel9.setText("Nombre:");

        jLabel10.setText("Duración:");

        jLabel11.setText("Categoría:");

        sp_boleteria_duracion.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel13.setText("mins.");

        cb_boleteria_cat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Terror", "Comedia", "Romance", "Drama", "Acción", "Infantil" }));

        bt_boleteria_guardar.setText("Guardar");
        bt_boleteria_guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_boleteria_guardarMouseClicked(evt);
            }
        });

        bt_boleteria_agregar.setText("Agregar");
        bt_boleteria_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_boleteria_agregarMouseClicked(evt);
            }
        });

        jLabel24.setText("Calsificacion:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_boleteria_nombre)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(sp_boleteria_duracion, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13))
                    .addComponent(cb_boleteria_cat, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bt_boleteria_guardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(bt_boleteria_agregar))
                    .addComponent(tf_boleteria_clasificacion))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(tf_boleteria_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(sp_boleteria_duracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(cb_boleteria_cat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(tf_boleteria_clasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_boleteria_guardar)
                            .addComponent(bt_boleteria_agregar))))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_boleteriaLayout = new javax.swing.GroupLayout(jd_boleteria.getContentPane());
        jd_boleteria.getContentPane().setLayout(jd_boleteriaLayout);
        jd_boleteriaLayout.setHorizontalGroup(
            jd_boleteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jd_boleteriaLayout.setVerticalGroup(
            jd_boleteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Peliculas");
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Terror");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Comedia");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Romance");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Drama");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Accion");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Infantil");
        treeNode1.add(treeNode2);
        jt_boleteria1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane4.setViewportView(jt_boleteria1);

        jLabel14.setText("Nombre:");

        jLabel15.setText("Duración:");

        jLabel16.setText("Categoría:");

        jLabel17.setText("Descripcion:");

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel18.setText("mins.");

        cb_boleteria_cat1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Terror", "Comedia", "Romance", "Drama", "Acción", "Infantil" }));

        jButton3.setText("Guardar");

        jButton4.setText("Agregar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel18))
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_boleteria_cat1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(cb_boleteria_cat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(83, 83, 83)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton4))))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_aseoLayout = new javax.swing.GroupLayout(jd_aseo.getContentPane());
        jd_aseo.getContentPane().setLayout(jd_aseoLayout);
        jd_aseoLayout.setHorizontalGroup(
            jd_aseoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jd_aseoLayout.setVerticalGroup(
            jd_aseoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Peliculas");
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Terror");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Comedia");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Romance");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Drama");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Accion");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Infantil");
        treeNode1.add(treeNode2);
        jt_boleteria2.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane5.setViewportView(jt_boleteria2);

        jLabel19.setText("Nombre:");

        jLabel20.setText("Duración:");

        jLabel21.setText("Categoría:");

        jLabel22.setText("Descripcion:");

        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel23.setText("mins.");

        cb_boleteria_cat2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Terror", "Comedia", "Romance", "Drama", "Acción", "Infantil" }));

        jButton5.setText("Guardar");

        jButton6.setText("Agregar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel22)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField5)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel23))
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_boleteria_cat2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6)))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(cb_boleteria_cat2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(83, 83, 83)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jButton6))))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_dulceriaLayout = new javax.swing.GroupLayout(jd_dulceria.getContentPane());
        jd_dulceria.getContentPane().setLayout(jd_dulceriaLayout);
        jd_dulceriaLayout.setHorizontalGroup(
            jd_dulceriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jd_dulceriaLayout.setVerticalGroup(
            jd_dulceriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jmi_ver.setText("Ver Contacto");
        jmi_ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_verActionPerformed(evt);
            }
        });
        ppm_admin.add(jmi_ver);

        jmi_modificar.setText("Modificar");
        jmi_modificar.setToolTipText("");
        jmi_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_modificarActionPerformed(evt);
            }
        });
        ppm_admin.add(jmi_modificar);

        jmi_eliminar.setText("Eliminar");
        jmi_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_eliminarActionPerformed(evt);
            }
        });
        ppm_admin.add(jmi_eliminar);

        jmi_boleteria_ver.setText("Ver Película");
        jmi_boleteria_ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_boleteria_verActionPerformed(evt);
            }
        });
        ppm_boleteria.add(jmi_boleteria_ver);

        jmi_boleteria_modificar.setText("Modificar");
        jmi_boleteria_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_boleteria_modificarActionPerformed(evt);
            }
        });
        ppm_boleteria.add(jmi_boleteria_modificar);

        jmi_boleteria_eliminar.setText("Eliminar");
        jmi_boleteria_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_boleteria_eliminarActionPerformed(evt);
            }
        });
        ppm_boleteria.add(jmi_boleteria_eliminar);

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

        jmi_empleados.setText("Empleados");
        jmi_empleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_empleadosActionPerformed(evt);
            }
        });
        jMenu2.add(jmi_empleados);

        jmi_boleteria.setText("Boleteria");
        jmi_boleteria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_boleteriaActionPerformed(evt);
            }
        });
        jMenu2.add(jmi_boleteria);

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
                        limpiarAdmin();
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
                        limpiarAdmin();
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
                        limpiarAdmin();
                    }
                }
                modeloLista.addElement(e);
            }
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(jd_admin, "Revise los datos");
        }
    }//GEN-LAST:event_bt_admin_agregarMouseClicked

    private void jmi_empleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_empleadosActionPerformed
        bt_admin_agregar.setVisible(true);
        jd_admin.pack();
        jd_admin.setModal(true);
        jd_admin.setLocationRelativeTo(this);
        jd_admin.setVisible(true);
        
    }//GEN-LAST:event_jmi_empleadosActionPerformed

    private void jt_empleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_empleadosMouseClicked
        
        if(evt.isMetaDown()){
            int row = jt_empleados.getClosestRowForLocation(evt.getX(), evt.getY());
            jt_empleados.setSelectionRow(row);
            
            Object v1 = jt_empleados.getSelectionPath().getLastPathComponent();
            nodo_seleccionado = (DefaultMutableTreeNode)v1;
            if(nodo_seleccionado.getUserObject() instanceof Empleado){
                empleado_seleccionado = (Empleado)nodo_seleccionado.getUserObject();
                ppm_admin.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
        
    }//GEN-LAST:event_jt_empleadosMouseClicked

    private void jmi_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_eliminarActionPerformed
        
        int response = JOptionPane.showConfirmDialog(this, "¿Desea eliminar al empleado?","Eliminar Empleado",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        if(response == JOptionPane.OK_OPTION){
            DefaultTreeModel m
                    = (DefaultTreeModel)jt_empleados.getModel();
            m.removeNodeFromParent(nodo_seleccionado);
            m.reload();
        }
        
    }//GEN-LAST:event_jmi_eliminarActionPerformed

    private void jmi_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_modificarActionPerformed
        bt_admin_agregar.setVisible(false);
        bt_admin_guardar.setVisible(true);  
        
        tf_admin_nombre.setText(empleado_seleccionado.getNombre());
        tf_admin_email.setText(empleado_seleccionado.getEmail());
        tf_admin_password.setText(empleado_seleccionado.getPassword());
        tf_admin_usuario.setText(empleado_seleccionado.getUsuario());
        cb_admin_puesto.setSelectedItem(empleado_seleccionado.getPuesto());
        jdc_admin_fecha.setDate(empleado_seleccionado.fechaNacimiento);
        
        
        
    }//GEN-LAST:event_jmi_modificarActionPerformed

    private void bt_admin_guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_admin_guardarMouseClicked
        
        String nombre,usuario,password,email,puesto;
        Date fechaNacimiento;
        
        nombre =tf_admin_nombre.getText();
        usuario = tf_admin_usuario.getText();
        password = tf_admin_password.getText();
        email = tf_admin_email.getText();
        puesto = cb_admin_puesto.getSelectedItem().toString();
        fechaNacimiento = jdc_admin_fecha.getDate();
        
        empleado_seleccionado.setNombre(nombre);
        empleado_seleccionado.setUsuario(usuario);
        empleado_seleccionado.setPassword(password);
        empleado_seleccionado.setPuesto(puesto);
        empleado_seleccionado.setEmail(email);
        empleado_seleccionado.setFechaNacimiento(fechaNacimiento);
        
        DefaultTreeModel m
                    = (DefaultTreeModel)jt_empleados.getModel();
        m.reload();
        
        JOptionPane.showMessageDialog(jd_admin, "Modificado con éxito");
        limpiarAdmin();
        bt_admin_agregar.setVisible(true);
        bt_admin_guardar.setVisible(false); 
    }//GEN-LAST:event_bt_admin_guardarMouseClicked

    private void jmi_verActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_verActionPerformed
        
        tf_admin_nombre.setText(empleado_seleccionado.getNombre());
        tf_admin_email.setText(empleado_seleccionado.getEmail());
        tf_admin_password.setText(empleado_seleccionado.getPassword());
        tf_admin_usuario.setText(empleado_seleccionado.getUsuario());
        cb_admin_puesto.setSelectedItem(empleado_seleccionado.getPuesto());
        jdc_admin_fecha.setDate(empleado_seleccionado.fechaNacimiento);
    }//GEN-LAST:event_jmi_verActionPerformed

    private void bt_boleteria_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_boleteria_agregarMouseClicked
        
        String nombre, categoria, clasif;
        int duracion;
        
        try{
            
            nombre = tf_boleteria_nombre.getText();
            categoria = cb_boleteria_cat.getSelectedItem().toString();
            duracion = (Integer)sp_boleteria_duracion.getValue();
            clasif = tf_boleteria_clasificacion.getText();
            
            Pelicula p = new Pelicula(nombre, categoria, duracion, clasif);
            
            DefaultTreeModel m = (DefaultTreeModel)jt_boleteria.getModel();
            DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)m.getRoot();
            
            if(categoria.equals("Terror")){
                for (int i = 0; i < raiz.getChildCount(); i++) {
                
                    if(raiz.getChildAt(i).toString().equals("Terror")){
                        DefaultMutableTreeNode terror = new DefaultMutableTreeNode(p);
                        ((DefaultMutableTreeNode)raiz.getChildAt(i)).add(terror);                    
                    }
                }
            }
            
            if(categoria.equals("Comedia")){
                for (int i = 0; i < raiz.getChildCount(); i++) {
                    if(raiz.getChildAt(i).toString().equals("Comedia")){
                        DefaultMutableTreeNode comedia = new DefaultMutableTreeNode(p);
                        ((DefaultMutableTreeNode)raiz.getChildAt(i)).add(comedia);                    
                    }
                }
            }
            
            if(categoria.equals("Romance")){
                for (int i = 0; i < raiz.getChildCount(); i++) {
                    if(raiz.getChildAt(i).toString().equals("Romance")){
                        DefaultMutableTreeNode romance = new DefaultMutableTreeNode(p);
                        ((DefaultMutableTreeNode)raiz.getChildAt(i)).add(romance);                    
                    }
                }
            }
            
            if(categoria.equals("Drama")){
                for (int i = 0; i < raiz.getChildCount(); i++) {
                    if(raiz.getChildAt(i).toString().equals("Drama")){
                        DefaultMutableTreeNode drama = new DefaultMutableTreeNode(p);
                        ((DefaultMutableTreeNode)raiz.getChildAt(i)).add(drama);                    
                    }
                }
            }
            
            if(categoria.equals("Accion")){
                for (int i = 0; i < raiz.getChildCount(); i++) {
                    if(raiz.getChildAt(i).toString().equals("Accion")){
                        DefaultMutableTreeNode accion = new DefaultMutableTreeNode(p);
                        ((DefaultMutableTreeNode)raiz.getChildAt(i)).add(accion);                    
                    }
                }
            }
            
            if(categoria.equals("Infantil")){
                for (int i = 0; i < raiz.getChildCount(); i++) {
                    if(raiz.getChildAt(i).toString().equals("Infantil")){
                        DefaultMutableTreeNode infantil = new DefaultMutableTreeNode(p);
                        ((DefaultMutableTreeNode)raiz.getChildAt(i)).add(infantil);                    
                    }
                }
            }
            
            JOptionPane.showMessageDialog(jd_boleteria,"Agregado con éxito");
            m.reload();
            limpiarBoletos();
        }catch(Exception e){
            JOptionPane.showMessageDialog(jd_boleteria,"Error");
        }
        
    }//GEN-LAST:event_bt_boleteria_agregarMouseClicked

    private void jmi_boleteriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_boleteriaActionPerformed
        bt_boleteria_agregar.setVisible(true);
        jd_boleteria.pack();
        jd_boleteria.setModal(true);
        jd_boleteria.setLocationRelativeTo(this);
        jd_boleteria.setVisible(true);
    }//GEN-LAST:event_jmi_boleteriaActionPerformed

    private void jt_boleteriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_boleteriaMouseClicked
        
        if(evt.isMetaDown()){
            int row = jt_boleteria.getClosestRowForLocation(evt.getX(), evt.getY());
            jt_boleteria.setSelectionRow(row);
            
            Object v1 = jt_boleteria.getSelectionPath().getLastPathComponent();
            nodo_seleccionado = (DefaultMutableTreeNode)v1;
            if(nodo_seleccionado.getUserObject() instanceof Pelicula){
                pelicula_seleccionada = (Pelicula)nodo_seleccionado.getUserObject();
                ppm_boleteria.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_jt_boleteriaMouseClicked

    private void jmi_boleteria_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_boleteria_eliminarActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "¿Desea eliminar la película?","Eliminar Película",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        if(response == JOptionPane.OK_OPTION){
            DefaultTreeModel m
                    = (DefaultTreeModel)jt_boleteria.getModel();
            m.removeNodeFromParent(nodo_seleccionado);
            m.reload();
        }
    }//GEN-LAST:event_jmi_boleteria_eliminarActionPerformed

    private void jmi_boleteria_verActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_boleteria_verActionPerformed
        tf_boleteria_nombre.setText(pelicula_seleccionada.getNombre());
        tf_boleteria_clasificacion.setText(pelicula_seleccionada.getClasificacion());
        cb_boleteria_cat.setSelectedItem(pelicula_seleccionada.getCategoria());
        sp_boleteria_duracion.setValue(pelicula_seleccionada.getDuracion());
    }//GEN-LAST:event_jmi_boleteria_verActionPerformed

    private void bt_boleteria_guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_boleteria_guardarMouseClicked
        
        try{
            pelicula_seleccionada.setCategoria(cb_boleteria_cat.getSelectedItem().toString());
            pelicula_seleccionada.setClasificacion(tf_boleteria_clasificacion.getText());
            pelicula_seleccionada.setDuracion((Integer)sp_boleteria_duracion.getValue());
            pelicula_seleccionada.setNombre(tf_boleteria_nombre.getText());
            
            DefaultTreeModel m
                    = (DefaultTreeModel)jt_boleteria.getModel();
            m.reload();

            JOptionPane.showMessageDialog(jd_admin, "Modificado con éxito");
            limpiarBoletos();
            bt_boleteria_agregar.setVisible(true);
            bt_boleteria_guardar.setVisible(false); 
            
        }catch(Exception e){
            
        } 
    }//GEN-LAST:event_bt_boleteria_guardarMouseClicked

    private void jmi_boleteria_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_boleteria_modificarActionPerformed
        bt_boleteria_agregar.setVisible(false);
        bt_boleteria_guardar.setVisible(true); 
        
        tf_boleteria_nombre.setText(pelicula_seleccionada.getNombre());
        tf_boleteria_clasificacion.setText(pelicula_seleccionada.getClasificacion());
        sp_boleteria_duracion.setValue(pelicula_seleccionada.getDuracion());
        cb_boleteria_cat.setSelectedItem(pelicula_seleccionada.getCategoria());
        
    }//GEN-LAST:event_jmi_boleteria_modificarActionPerformed

    public void limpiarAdmin(){
        tf_admin_nombre.setText("");
        tf_admin_email.setText("");
        tf_admin_password.setText("");
        tf_admin_usuario.setText("");
        cb_admin_puesto.setSelectedIndex(0);
        jdc_admin_fecha.setDate(new Date());
    }
    
    public void limpiarBoletos(){
        tf_boleteria_nombre.setText("");
        tf_boleteria_clasificacion.setText("");
        cb_boleteria_cat.setSelectedIndex(0);
        sp_boleteria_duracion.setValue(0);
        
    }
    
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
    private javax.swing.JButton bt_admin_guardar;
    private javax.swing.JButton bt_boleteria_agregar;
    private javax.swing.JButton bt_boleteria_guardar;
    private javax.swing.JButton bt_login_signIn;
    private javax.swing.JComboBox<String> cb_admin_puesto;
    private javax.swing.JComboBox<String> cb_boleteria_cat;
    private javax.swing.JComboBox<String> cb_boleteria_cat1;
    private javax.swing.JComboBox<String> cb_boleteria_cat2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JDialog jd_admin;
    private javax.swing.JDialog jd_aseo;
    private javax.swing.JDialog jd_boleteria;
    private javax.swing.JDialog jd_dulceria;
    private javax.swing.JDialog jd_login;
    private com.toedter.calendar.JDateChooser jdc_admin_fecha;
    private javax.swing.JList<String> jl_empleados;
    private javax.swing.JMenuItem jmi_boleteria;
    private javax.swing.JMenuItem jmi_boleteria_eliminar;
    private javax.swing.JMenuItem jmi_boleteria_modificar;
    private javax.swing.JMenuItem jmi_boleteria_ver;
    private javax.swing.JMenuItem jmi_eliminar;
    private javax.swing.JMenuItem jmi_empleados;
    private javax.swing.JMenuItem jmi_exit;
    private javax.swing.JMenuItem jmi_login;
    private javax.swing.JMenuItem jmi_logout;
    private javax.swing.JMenuItem jmi_modificar;
    private javax.swing.JMenuItem jmi_ver;
    private javax.swing.JTree jt_boleteria;
    private javax.swing.JTree jt_boleteria1;
    private javax.swing.JTree jt_boleteria2;
    private javax.swing.JTree jt_empleados;
    private javax.swing.JPopupMenu ppm_admin;
    private javax.swing.JPopupMenu ppm_boleteria;
    private javax.swing.JSpinner sp_boleteria_duracion;
    private javax.swing.JTextField tf_admin_email;
    private javax.swing.JTextField tf_admin_nombre;
    private javax.swing.JTextField tf_admin_password;
    private javax.swing.JTextField tf_admin_usuario;
    private javax.swing.JTextField tf_boleteria_clasificacion;
    private javax.swing.JTextField tf_boleteria_nombre;
    private javax.swing.JPasswordField tf_login_password;
    private javax.swing.JTextField tf_login_usuario;
    // End of variables declaration//GEN-END:variables

    String admin="admin", passAdm="admin123";
    ArrayList<Empleado> lista = new ArrayList();
    DefaultMutableTreeNode nodo_seleccionado;
    Empleado empleado_seleccionado;
    Pelicula pelicula_seleccionada;
}
