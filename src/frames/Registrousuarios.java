/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyecto.bo.usuarioBo;
import proyecto.clases.Usuario;

public class Registrousuarios extends javax.swing.JFrame {
    
    usuarioBo ubo = new usuarioBo();
    private Object mensaje;
    
    public Registrousuarios(){
        initComponents();
        setLocationRelativeTo(null);;
        listarUsuario();
    }

    public void listarUsuario() {
        ubo.listarUsuario(tbusuarios);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtnombresuser = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtimagen1 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        cbrol = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        txtiduser = new javax.swing.JTextField();
        txtapuser = new javax.swing.JTextField();
        txtamuser = new javax.swing.JTextField();
        txtcontrauser = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtbuscaruser = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnagregarusuario = new javax.swing.JButton();
        btnlimpiarusuario = new javax.swing.JButton();
        btnmodificarusuario = new javax.swing.JButton();
        btneliminarusuario = new javax.swing.JButton();
        btnregresar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbusuarios = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel14.setBackground(new java.awt.Color(255, 255, 51));
        jLabel14.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel14.setText("Apellido materno:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setBackground(new java.awt.Color(101, 59, 101));
        jLabel11.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel11.setText("Nombres:");

        txtnombresuser.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        txtnombresuser.setForeground(new java.awt.Color(51, 51, 51));
        txtnombresuser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel13.setBackground(new java.awt.Color(101, 59, 101));
        jLabel13.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel13.setText("Apellido paterno:");

        jLabel16.setBackground(new java.awt.Color(101, 59, 101));
        jLabel16.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel16.setText("Rol:");

        jLabel22.setBackground(new java.awt.Color(101, 59, 101));
        jLabel22.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel22.setText("Id:");

        cbrol.setBackground(new java.awt.Color(223, 194, 252));
        cbrol.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cbrol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Trabajador" }));
        cbrol.setBorder(null);

        jLabel15.setBackground(new java.awt.Color(101, 59, 101));
        jLabel15.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel15.setText("Apellido materno:");

        txtiduser.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        txtiduser.setForeground(new java.awt.Color(51, 51, 51));
        txtiduser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtapuser.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        txtapuser.setForeground(new java.awt.Color(51, 51, 51));
        txtapuser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtamuser.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        txtamuser.setForeground(new java.awt.Color(51, 51, 51));
        txtamuser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtcontrauser.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        txtcontrauser.setForeground(new java.awt.Color(51, 51, 51));
        txtcontrauser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel18.setBackground(new java.awt.Color(101, 59, 101));
        jLabel18.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel18.setText("Contraseña:");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtimagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbrol, javax.swing.GroupLayout.Alignment.TRAILING, 0, 205, Short.MAX_VALUE)
                    .addComponent(txtnombresuser)
                    .addComponent(txtiduser, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtapuser)
                    .addComponent(txtamuser)
                    .addComponent(txtcontrauser, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(44, 44, 44))
            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel15Layout.createSequentialGroup()
                    .addGap(82, 82, 82)
                    .addComponent(jLabel18)
                    .addContainerGap(283, Short.MAX_VALUE)))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtiduser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtnombresuser)))
                .addGap(27, 27, 27)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtapuser))
                .addGap(27, 27, 27)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtamuser))
                .addGap(27, 27, 27)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbrol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(txtcontrauser)
                .addGap(171, 171, 171)
                .addComponent(txtimagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                    .addContainerGap(302, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(221, 221, 221)))
        );

        txtbuscaruser.setBackground(new java.awt.Color(255, 204, 204));
        txtbuscaruser.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        txtbuscaruser.setForeground(new java.awt.Color(51, 51, 51));
        txtbuscaruser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtbuscaruser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscaruserActionPerformed(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupita.png"))); // NOI18N

        btnagregarusuario.setBackground(new java.awt.Color(53, 137, 44));
        btnagregarusuario.setFont(new java.awt.Font("NewsGoth Lt BT", 1, 14)); // NOI18N
        btnagregarusuario.setForeground(new java.awt.Color(255, 255, 255));
        btnagregarusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar 24px.png"))); // NOI18N
        btnagregarusuario.setText("Agregar");
        btnagregarusuario.setBorder(null);
        btnagregarusuario.setBorderPainted(false);
        btnagregarusuario.setFocusable(false);
        btnagregarusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarusuarioActionPerformed(evt);
            }
        });

        btnlimpiarusuario.setBackground(new java.awt.Color(53, 137, 44));
        btnlimpiarusuario.setFont(new java.awt.Font("NewsGoth Lt BT", 1, 14)); // NOI18N
        btnlimpiarusuario.setForeground(new java.awt.Color(255, 255, 255));
        btnlimpiarusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpieza-de-datos 32px.png"))); // NOI18N
        btnlimpiarusuario.setText("Limpiar");
        btnlimpiarusuario.setBorder(null);
        btnlimpiarusuario.setBorderPainted(false);
        btnlimpiarusuario.setFocusable(false);
        btnlimpiarusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarusuarioActionPerformed(evt);
            }
        });

        btnmodificarusuario.setBackground(new java.awt.Color(53, 137, 44));
        btnmodificarusuario.setFont(new java.awt.Font("NewsGoth Lt BT", 1, 14)); // NOI18N
        btnmodificarusuario.setForeground(new java.awt.Color(255, 255, 255));
        btnmodificarusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar 32px.png"))); // NOI18N
        btnmodificarusuario.setText("Modificar");
        btnmodificarusuario.setBorder(null);
        btnmodificarusuario.setBorderPainted(false);
        btnmodificarusuario.setFocusable(false);
        btnmodificarusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarusuarioActionPerformed(evt);
            }
        });

        btneliminarusuario.setBackground(new java.awt.Color(53, 137, 44));
        btneliminarusuario.setFont(new java.awt.Font("NewsGoth Lt BT", 1, 14)); // NOI18N
        btneliminarusuario.setForeground(new java.awt.Color(255, 255, 255));
        btneliminarusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar 32px.png"))); // NOI18N
        btneliminarusuario.setText("Eliminar");
        btneliminarusuario.setBorder(null);
        btneliminarusuario.setBorderPainted(false);
        btneliminarusuario.setFocusable(false);
        btneliminarusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarusuarioActionPerformed(evt);
            }
        });

        btnregresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha-hacia-atrasnegro 32px.png"))); // NOI18N
        btnregresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnregresar.setBorderPainted(false);
        btnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresarActionPerformed(evt);
            }
        });

        tbusuarios.setFont(new java.awt.Font("Ebrima", 0, 13)); // NOI18N
        tbusuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbusuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbusuariosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbusuarios);

        jPanel2.setBackground(new java.awt.Color(53, 137, 44));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 35)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Usuarios");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(214, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(230, 230, 230))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnmodificarusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(btneliminarusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnagregarusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(btnlimpiarusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(txtbuscaruser, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnregresar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 38, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnagregarusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnlimpiarusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnmodificarusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btneliminarusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtbuscaruser))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnregresar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtbuscaruserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscaruserActionPerformed
        buscarUsuarios();
    }//GEN-LAST:event_txtbuscaruserActionPerformed

    private void btnagregarusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarusuarioActionPerformed
       if (txtiduser.getText().isEmpty() || txtnombresuser.getText().isEmpty() || txtapuser.getText().isEmpty() || txtamuser.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Llene los campos vacios");
        } else {
            Usuario user = new Usuario();
            user.setId(txtiduser.getText());
            user.setNombres(txtnombresuser.getText());
            user.setAp(txtapuser.getText());
            user.setAm(txtamuser.getText());
            user.setRol(cbrol.getSelectedItem().toString());
            user.setContra(txtcontrauser.getText());

            String mensaje = ubo.agregarUsuario(user);
        }
        JOptionPane.showMessageDialog(null, "Datos ingresados correctamente");
        listarUsuario();
    }//GEN-LAST:event_btnagregarusuarioActionPerformed

    private void btnlimpiarusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarusuarioActionPerformed
        limpiarUsuarios();
    }//GEN-LAST:event_btnlimpiarusuarioActionPerformed

    private void btnmodificarusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarusuarioActionPerformed
        if (txtiduser.getText().isEmpty() || txtnombresuser.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Llene todos los campos");
        } else {
            Usuario user = new Usuario();
            user.setId(txtiduser.getText());
            user.setNombres(txtnombresuser.getText());
            user.setAp(txtapuser.getText());
            user.setAm(txtamuser.getText());
            user.setRol(cbrol.getSelectedItem().toString());
            user.setContra(txtcontrauser.getText());

            String mensaje = ubo.modificarUsuario(user);
        }
        JOptionPane.showMessageDialog(null, "Datos modificados correctamente");
        listarUsuario();
    }//GEN-LAST:event_btnmodificarusuarioActionPerformed

    private void btneliminarusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarusuarioActionPerformed
        int selectedRow = tbusuarios.getSelectedRow();
        String idUser = tbusuarios.getValueAt(selectedRow, 0).toString();
        String mensaje = ubo.eliminarUsuario(idUser);
        JOptionPane.showMessageDialog(null, mensaje);
        listarUsuario();
    }//GEN-LAST:event_btneliminarusuarioActionPerformed

    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
        PrincipalAdmin fv=new PrincipalAdmin();
        fv.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnregresarActionPerformed

    private void tbusuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbusuariosMouseClicked
        int seleccion = tbusuarios.rowAtPoint(evt.getPoint());
        txtiduser.setText(tbusuarios.getValueAt(seleccion, 0)+"");
        txtnombresuser.setText(tbusuarios.getValueAt(seleccion, 1)+"");
        txtapuser.setText(tbusuarios.getValueAt(seleccion, 2)+"");
        txtamuser.setText(tbusuarios.getValueAt(seleccion, 3)+"");
        cbrol.setSelectedItem(tbusuarios.getValueAt(seleccion, 4)+"");
        txtcontrauser.setText(tbusuarios.getValueAt(seleccion, 5)+"");
    }//GEN-LAST:event_tbusuariosMouseClicked

    private void limpiarUsuarios(){
        txtiduser.setText("");
        txtnombresuser.setText("");
        txtapuser.setText("");
        txtamuser.setText("");
        cbrol.setSelectedIndex(0);
        txtcontrauser.setText("");
        txtbuscaruser.setText("");
        txtiduser.requestFocus();
    }
    
    private void buscarUsuarios() {
        String dato = txtbuscaruser.getText().trim();
        DefaultTableModel tabla = (DefaultTableModel) tbusuarios.getModel();
        ubo.buscarUsuario(dato, tabla);
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
            java.util.logging.Logger.getLogger(Registrousuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrousuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrousuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrousuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrousuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagregarusuario;
    private javax.swing.JButton btneliminarusuario;
    private javax.swing.JButton btnlimpiarusuario;
    private javax.swing.JButton btnmodificarusuario;
    private javax.swing.JButton btnregresar;
    private javax.swing.JComboBox<String> cbrol;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbusuarios;
    private javax.swing.JTextField txtamuser;
    private javax.swing.JTextField txtapuser;
    private javax.swing.JTextField txtbuscaruser;
    private javax.swing.JTextField txtcontrauser;
    private javax.swing.JTextField txtiduser;
    private javax.swing.JLabel txtimagen1;
    private javax.swing.JTextField txtnombresuser;
    // End of variables declaration//GEN-END:variables
}
