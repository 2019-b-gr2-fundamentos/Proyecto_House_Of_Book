/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.paneles;

/**
 *
 * @author lexsw
 */
public class Panel_consultarEstudiante extends javax.swing.JPanel {

    /**
     * Creates new form Panel_consultarEstudiante
     */
    public Panel_consultarEstudiante() {
        initComponents();
        this.setSize(816, 542);
        this.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        Campo_apellido = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        Boton_consultar = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        Campo_codigo = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        Campo_cedula = new javax.swing.JTextField();
        Campo_nombre = new javax.swing.JTextField();
        Campo_carrera = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        Campo_correo = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel7.setFont(new java.awt.Font("Eras Medium ITC", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 170, 0));
        jLabel7.setText("Nombre:");
        add(jLabel7);
        jLabel7.setBounds(30, 40, 79, 23);

        jSeparator4.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        add(jSeparator4);
        jSeparator4.setBounds(120, 60, 200, 10);

        jLabel9.setFont(new java.awt.Font("Eras Medium ITC", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 170, 0));
        jLabel9.setText("Apellido:");
        add(jLabel9);
        jLabel9.setBounds(390, 40, 79, 23);

        Campo_apellido.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        Campo_apellido.setBorder(null);
        add(Campo_apellido);
        Campo_apellido.setBounds(480, 40, 270, 20);

        jSeparator6.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        add(jSeparator6);
        jSeparator6.setBounds(480, 60, 270, 10);

        jLabel8.setFont(new java.awt.Font("Eras Medium ITC", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 170, 0));
        jLabel8.setText("Cédula:");
        add(jLabel8);
        jLabel8.setBounds(30, 100, 68, 23);

        jLabel10.setFont(new java.awt.Font("Eras Medium ITC", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 170, 0));
        jLabel10.setText("Código único: ");
        add(jLabel10);
        jLabel10.setBounds(390, 100, 131, 23);

        jLabel11.setFont(new java.awt.Font("Eras Medium ITC", 0, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 170, 0));
        jLabel11.setText("Carrera:");
        add(jLabel11);
        jLabel11.setBounds(30, 170, 72, 23);

        jLabel12.setFont(new java.awt.Font("Eras Medium ITC", 0, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 170, 0));
        jLabel12.setText("Correo:");
        add(jLabel12);
        jLabel12.setBounds(390, 170, 67, 23);

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID ", "Codigo único", "Cédula", "Nombre", "Apellido", "Carrera", "Correo electrónico"
            }
        ));
        jScrollPane1.setViewportView(Tabla);

        add(jScrollPane1);
        jScrollPane1.setBounds(30, 230, 750, 230);

        Boton_consultar.setText("CONSULTAR");
        add(Boton_consultar);
        Boton_consultar.setBounds(340, 490, 110, 30);

        jSeparator5.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        add(jSeparator5);
        jSeparator5.setBounds(110, 120, 210, 10);

        Campo_codigo.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        Campo_codigo.setBorder(null);
        add(Campo_codigo);
        Campo_codigo.setBounds(530, 100, 220, 20);

        jSeparator7.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        add(jSeparator7);
        jSeparator7.setBounds(530, 120, 220, 10);

        Campo_cedula.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        Campo_cedula.setBorder(null);
        add(Campo_cedula);
        Campo_cedula.setBounds(110, 100, 210, 20);

        Campo_nombre.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        Campo_nombre.setBorder(null);
        add(Campo_nombre);
        Campo_nombre.setBounds(120, 40, 210, 20);

        Campo_carrera.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        Campo_carrera.setBorder(null);
        add(Campo_carrera);
        Campo_carrera.setBounds(120, 170, 210, 20);

        jSeparator11.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator11.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        add(jSeparator11);
        jSeparator11.setBounds(120, 190, 210, 10);

        Campo_correo.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        Campo_correo.setBorder(null);
        add(Campo_correo);
        Campo_correo.setBounds(470, 170, 270, 20);

        jSeparator12.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator12.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        add(jSeparator12);
        jSeparator12.setBounds(470, 190, 270, 10);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Boton_consultar;
    public javax.swing.JTextField Campo_apellido;
    public javax.swing.JTextField Campo_carrera;
    public javax.swing.JTextField Campo_cedula;
    public javax.swing.JTextField Campo_codigo;
    public javax.swing.JTextField Campo_correo;
    public javax.swing.JTextField Campo_nombre;
    public javax.swing.JTable Tabla;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    // End of variables declaration//GEN-END:variables
}