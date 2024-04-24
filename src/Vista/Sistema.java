package Vista;
import Modelo.Cliente;
import Modelo.ClienteDAO;
import Modelo.Productos;
import Modelo.ProductosDao;
import Modelo.Proveedor;
import Modelo.ProveedorDAO;
import Modelo.Venta;
import Modelo.VentaDao;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;


public class Sistema extends javax.swing.JFrame {
     Cliente cl = new Cliente();
     ClienteDAO client = new ClienteDAO();
     Proveedor pr = new Proveedor();
     ProveedorDAO PrDao = new ProveedorDAO();
     Productos pro = new Productos();
     ProductosDao proDao = new ProductosDao();
     Venta v = new Venta();
     VentaDao Vdao = new VentaDao();
     DefaultTableModel modelo = new  DefaultTableModel();
     int item;
     Double Totalpagar = 0.00;
    public Sistema() {
        initComponents();
        this.setLocationRelativeTo(null);
        txtIdCliente.setVisible(false);
        AutoCompleteDecorator.decorate(cbxProveedorPro);
        proDao.ConsultarProveedor(cbxProveedorPro);
        
    }
    public void ListarCliente(){
        List<Cliente> ListarCl =client.ListarCliente();
        modelo= (DefaultTableModel) TableCliente.getModel();
        Object[] ob = new Object[6];
        for (int i = 0; i < ListarCl.size(); i++){
        ob[0] =ListarCl.get(i).getId();
        ob[1] =ListarCl.get(i).getDni();
        ob[2] =ListarCl.get(i).getNombre();
        ob[3] =ListarCl.get(i).getTelefono();
        ob[4] =ListarCl.get(i).getDireccion();
        ob[5] =ListarCl.get(i).getRazon();
        modelo.addRow(ob);
    }
        TableCliente.setModel(modelo);
    
    }
    
        public void ListarProveedor(){
        List<Proveedor> ListarPr =PrDao.ListarProveedor();
        modelo= (DefaultTableModel) TableProveedor.getModel();
        Object[] ob = new Object[6];
        for (int i = 0; i < ListarPr.size(); i++){
        ob[0] =ListarPr.get(i).getId();
        ob[1] =ListarPr.get(i).getRuc();
        ob[2] =ListarPr.get(i).getNombre();
        ob[3] =ListarPr.get(i).getTelefono();
        ob[4] =ListarPr.get(i).getDireccion();
        ob[5] =ListarPr.get(i).getRazon();
        modelo.addRow(ob);
    }
        TableProveedor.setModel(modelo);
        
        }
   
        public void ListarProductos(){
        List<Productos> ListarPro =proDao.ListarProductos();
        modelo= (DefaultTableModel) TableProducto.getModel();
        Object[] ob = new Object[6];
        for (int i = 0; i < ListarPro.size(); i++){
        ob[0] =ListarPro.get(i).getId();
        ob[1] =ListarPro.get(i).getCodigo();
        ob[2] =ListarPro.get(i).getNombre();
        ob[3] =ListarPro.get(i).getProveedor();
        ob[4] =ListarPro.get(i).getStock();
        ob[5] =ListarPro.get(i).getPrecio();
        modelo.addRow(ob);
    }
        TableProducto.setModel(modelo);
        
        }
        
     public void LimpiarTable(){
        for(int i=0; i <modelo.getRowCount(); i++){
        modelo.removeRow(i);
        i = i-1;
    }
     }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnNuevaVenta = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnProveedor = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnConfig = new javax.swing.JButton();
        LabelVendedor = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnEliminarVenta = new javax.swing.JButton();
        txtCodigoVenta = new javax.swing.JTextField();
        txtDescripcionVenta = new javax.swing.JTextField();
        txtCantidadVenta = new javax.swing.JTextField();
        txtPrecioVenta = new javax.swing.JTextField();
        txtStockDisponible = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableVenta = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtRucVenta = new javax.swing.JTextField();
        txtNombreClienteventa = new javax.swing.JTextField();
        btnGenerarVenta = new javax.swing.JButton();
        LabelTotal = new javax.swing.JLabel();
        txtTelefonoCV = new javax.swing.JTextField();
        txtDireccionCV = new javax.swing.JTextField();
        txtRazonCV = new javax.swing.JTextField();
        txtIdPro = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtDniCliente = new javax.swing.JTextField();
        txtNombreCliente = new javax.swing.JTextField();
        txtTelefonoCliente = new javax.swing.JTextField();
        txtDireccionCliente = new javax.swing.JTextField();
        txtRazonCliente = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableCliente = new javax.swing.JTable();
        btnNuevoCliente = new javax.swing.JButton();
        btnGuardarCliente = new javax.swing.JButton();
        btnEditarCliente = new javax.swing.JButton();
        btnEliminarCliente = new javax.swing.JButton();
        txtIdCliente = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txtRucProveedor = new javax.swing.JTextField();
        txtNombreproveedor = new javax.swing.JTextField();
        txtTelefonoProveedor = new javax.swing.JTextField();
        txtRazonProveedor = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        TableProveedor = new javax.swing.JTable();
        btnNuevoProovedor = new javax.swing.JButton();
        btnGuardarProveedor = new javax.swing.JButton();
        btnEditarProveedor = new javax.swing.JButton();
        btnEliminarProveedor = new javax.swing.JButton();
        txtIdProveedor = new javax.swing.JTextField();
        txtDireccionProveedor = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtCodigoPro = new javax.swing.JTextField();
        txtDesPro = new javax.swing.JTextField();
        txtCantPro = new javax.swing.JTextField();
        txtPrecioPro = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableProducto = new javax.swing.JTable();
        btnNuevoPro = new javax.swing.JButton();
        btnGuardarPro = new javax.swing.JButton();
        btnEditarPro = new javax.swing.JButton();
        btnEliminarPro = new javax.swing.JButton();
        cbxProveedorPro = new javax.swing.JComboBox<>();
        txtIdProducto = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TableVentas = new javax.swing.JTable();
        btnPdfVentas = new javax.swing.JButton();
        txtIdVenta = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNuevaVenta.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnNuevaVenta.setForeground(new java.awt.Color(0, 0, 102));
        btnNuevaVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/punto-de-venta (1) (1) (1) (1).png"))); // NOI18N
        btnNuevaVenta.setText("NUEVA VENTA");
        btnNuevaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaVentaActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevaVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 180, 50));

        btnClientes.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnClientes.setForeground(new java.awt.Color(0, 0, 102));
        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/servicio-al-cliente (1) (1) (1).png"))); // NOI18N
        btnClientes.setText("CLIENTES");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        jPanel1.add(btnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 180, 50));

        btnProductos.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnProductos.setForeground(new java.awt.Color(0, 0, 102));
        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/bienes (1) (1) (1).png"))); // NOI18N
        btnProductos.setText("PRODUCTOS");
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        jPanel1.add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 180, 50));

        btnVentas.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnVentas.setForeground(new java.awt.Color(0, 0, 102));
        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/punto-de-venta (2) (1) (1).png"))); // NOI18N
        btnVentas.setText("VENTAS");
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });
        jPanel1.add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 180, 50));

        btnProveedor.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnProveedor.setForeground(new java.awt.Color(0, 0, 102));
        btnProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/camion-de-reparto (1).png"))); // NOI18N
        btnProveedor.setText("PROVEEDOR");
        btnProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedorActionPerformed(evt);
            }
        });
        jPanel1.add(btnProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 180, 50));

        jLabel2.setBackground(new java.awt.Color(0, 204, 204));
        jLabel2.setForeground(new java.awt.Color(0, 204, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/LOGO OFC (1).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 220, 170));

        jLabel12.setFont(new java.awt.Font("SimSun-ExtB", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 153));
        jLabel12.setText("KAROL B'S SHOP");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, 20));

        btnConfig.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnConfig.setForeground(new java.awt.Color(0, 0, 102));
        btnConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/tienda (1) (1) (1).png"))); // NOI18N
        btnConfig.setText("CONFIG ");
        btnConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfigActionPerformed(evt);
            }
        });
        jPanel1.add(btnConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 180, 50));

        LabelVendedor.setText("Karol Fernandez");
        jPanel1.add(LabelVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 640));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 204));

        jPanel2.setBackground(new java.awt.Color(255, 204, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel3.setText("Código");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel4.setText("Descripción");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel5.setText("Cantidad");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel6.setText("Precio");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("Stock Dispo");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 140, 20));

        btnEliminarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar (1).png"))); // NOI18N
        btnEliminarVenta.setText("ELIMINAR");
        btnEliminarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVentaActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 340, 170, 70));

        txtCodigoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoVentaActionPerformed(evt);
            }
        });
        txtCodigoVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoVentaKeyPressed(evt);
            }
        });
        jPanel2.add(txtCodigoVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 120, 40));
        jPanel2.add(txtDescripcionVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 170, 40));

        txtCantidadVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadVentaActionPerformed(evt);
            }
        });
        txtCantidadVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadVentaKeyPressed(evt);
            }
        });
        jPanel2.add(txtCantidadVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 140, 40));

        txtPrecioVenta.setEditable(false);
        jPanel2.add(txtPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 140, 40));
        jPanel2.add(txtStockDisponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 50, 140, 40));

        TableVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "DESCRIPCIÓN", "CANTIDAD", "PRECIO", "TOTAL"
            }
        ));
        jScrollPane1.setViewportView(TableVenta);
        if (TableVenta.getColumnModel().getColumnCount() > 0) {
            TableVenta.getColumnModel().getColumn(0).setPreferredWidth(30);
            TableVenta.getColumnModel().getColumn(1).setPreferredWidth(100);
            TableVenta.getColumnModel().getColumn(2).setPreferredWidth(30);
            TableVenta.getColumnModel().getColumn(3).setPreferredWidth(30);
            TableVenta.getColumnModel().getColumn(4).setPreferredWidth(40);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 930, 230));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 204));
        jLabel8.setText("DNI /  RUC");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 204));
        jLabel9.setText("NOMBRE");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, -1, -1));

        txtRucVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRucVentaActionPerformed(evt);
            }
        });
        txtRucVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRucVentaKeyPressed(evt);
            }
        });
        jPanel2.add(txtRucVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 180, 40));

        txtNombreClienteventa.setEditable(false);
        jPanel2.add(txtNombreClienteventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 220, 40));

        btnGenerarVenta.setFont(new java.awt.Font("SimSun-ExtB", 1, 12)); // NOI18N
        btnGenerarVenta.setForeground(new java.awt.Color(0, 51, 102));
        btnGenerarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/impresora (2).png"))); // NOI18N
        btnGenerarVenta.setText("REGISTRAR VENTA");
        btnGenerarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarVentaActionPerformed(evt);
            }
        });
        jPanel2.add(btnGenerarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 190, 70));

        LabelTotal.setText("-----------");
        jPanel2.add(LabelTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 420, 70, 30));
        jPanel2.add(txtTelefonoCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 0, 30));
        jPanel2.add(txtDireccionCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 0, 30));
        jPanel2.add(txtRazonCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 0, 30));

        txtIdPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProActionPerformed(evt);
            }
        });
        jPanel2.add(txtIdPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 50, 0, 30));

        jLabel11.setText("jLabel11");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 480, 210));

        jLabel10.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 51));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/dinero-en-efectivo (1).png"))); // NOI18N
        jLabel10.setText("Total a Pagar : ");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, 250, 30));

        jTabbedPane1.addTab("VENTAS", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 204, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel13.setText("Dni / Ruc :");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 103, 35));

        jLabel14.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel14.setText("NOMBRE :");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 80, 28));

        jLabel15.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel15.setText("TELÉFONO :");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 100, 40));

        jLabel16.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel16.setText("RAZON SOCIAL :");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 110, 28));

        jLabel17.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel17.setText("RAZÓN SOCIAL :");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 454, 92, 30));
        jPanel3.add(txtDniCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 170, 30));
        jPanel3.add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 170, 40));
        jPanel3.add(txtTelefonoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 170, 30));
        jPanel3.add(txtDireccionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 170, 40));
        jPanel3.add(txtRazonCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 170, 40));

        jLabel18.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel18.setText("DIRECCIÓN :");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 90, 28));

        TableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DNI / RUC", "NOMBRE", "TELEFONO", "DIRECCION", "RAZON SOC"
            }
        ));
        TableCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableClienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TableCliente);
        if (TableCliente.getColumnModel().getColumnCount() > 0) {
            TableCliente.getColumnModel().getColumn(0).setPreferredWidth(50);
            TableCliente.getColumnModel().getColumn(1).setPreferredWidth(50);
            TableCliente.getColumnModel().getColumn(2).setPreferredWidth(100);
            TableCliente.getColumnModel().getColumn(3).setPreferredWidth(40);
            TableCliente.getColumnModel().getColumn(4).setPreferredWidth(100);
            TableCliente.getColumnModel().getColumn(5).setPreferredWidth(50);
        }

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 650, 370));

        btnNuevoCliente.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        btnNuevoCliente.setForeground(new java.awt.Color(0, 51, 102));
        btnNuevoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/anadir (1).png"))); // NOI18N
        btnNuevoCliente.setText("LISTAR");
        btnNuevoCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoClienteActionPerformed(evt);
            }
        });
        jPanel3.add(btnNuevoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 130, 60));

        btnGuardarCliente.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        btnGuardarCliente.setForeground(new java.awt.Color(0, 51, 102));
        btnGuardarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/disco-flexible (1).png"))); // NOI18N
        btnGuardarCliente.setText("REGISTRAR");
        btnGuardarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarClienteActionPerformed(evt);
            }
        });
        jPanel3.add(btnGuardarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 160, 60));

        btnEditarCliente.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        btnEditarCliente.setForeground(new java.awt.Color(0, 51, 102));
        btnEditarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/actualizar (1).png"))); // NOI18N
        btnEditarCliente.setText("EDITAR");
        btnEditarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarClienteActionPerformed(evt);
            }
        });
        jPanel3.add(btnEditarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 130, 60));

        btnEliminarCliente.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        btnEliminarCliente.setForeground(new java.awt.Color(0, 51, 102));
        btnEliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/borrar (1).png"))); // NOI18N
        btnEliminarCliente.setText("ELIMINAR");
        btnEliminarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });
        jPanel3.add(btnEliminarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 150, 60));
        jPanel3.add(txtIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 0, 30));

        jTabbedPane1.addTab("CLIENTES", jPanel3);

        jPanel9.setBackground(new java.awt.Color(255, 204, 0));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel32.setText("RUC :");
        jPanel9.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 103, 35));

        jLabel33.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel33.setText("NOMBRE :");
        jPanel9.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 100, 28));

        jLabel34.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel34.setText("TELEFONO :");
        jPanel9.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 100, 37));

        jLabel35.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel35.setText("RAZON SOCIAL :");
        jPanel9.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 110, 28));

        jLabel36.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel36.setText("RAZÓN SOCIAL :");
        jPanel9.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 454, 92, 30));
        jPanel9.add(txtRucProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 190, 40));
        jPanel9.add(txtNombreproveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 190, 40));
        jPanel9.add(txtTelefonoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 190, 40));
        jPanel9.add(txtRazonProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 190, 40));

        jLabel37.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel37.setText("DIRECCION :");
        jPanel9.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 100, 28));

        TableProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "RUC", "NOMBRE", "TELEFONO", "DIRECCION", "RAZON"
            }
        ));
        TableProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableProveedorMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(TableProveedor);
        if (TableProveedor.getColumnModel().getColumnCount() > 0) {
            TableProveedor.getColumnModel().getColumn(0).setPreferredWidth(20);
            TableProveedor.getColumnModel().getColumn(1).setPreferredWidth(50);
            TableProveedor.getColumnModel().getColumn(2).setPreferredWidth(100);
            TableProveedor.getColumnModel().getColumn(3).setPreferredWidth(40);
            TableProveedor.getColumnModel().getColumn(4).setPreferredWidth(100);
            TableProveedor.getColumnModel().getColumn(5).setPreferredWidth(50);
        }

        jPanel9.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 660, 400));

        btnNuevoProovedor.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        btnNuevoProovedor.setForeground(new java.awt.Color(0, 51, 102));
        btnNuevoProovedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/anadir (1).png"))); // NOI18N
        btnNuevoProovedor.setText("LISTAR");
        btnNuevoProovedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevoProovedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProovedorActionPerformed(evt);
            }
        });
        jPanel9.add(btnNuevoProovedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 130, 60));

        btnGuardarProveedor.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        btnGuardarProveedor.setForeground(new java.awt.Color(0, 51, 102));
        btnGuardarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/disco-flexible (1).png"))); // NOI18N
        btnGuardarProveedor.setText("REGISTRAR");
        btnGuardarProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarProveedorActionPerformed(evt);
            }
        });
        jPanel9.add(btnGuardarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 160, 60));

        btnEditarProveedor.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        btnEditarProveedor.setForeground(new java.awt.Color(0, 51, 102));
        btnEditarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/actualizar (1).png"))); // NOI18N
        btnEditarProveedor.setText("EDITAR");
        btnEditarProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProveedorActionPerformed(evt);
            }
        });
        jPanel9.add(btnEditarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 140, 60));

        btnEliminarProveedor.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        btnEliminarProveedor.setForeground(new java.awt.Color(0, 51, 102));
        btnEliminarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/borrar (1).png"))); // NOI18N
        btnEliminarProveedor.setText("ELIMINAR");
        btnEliminarProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProveedorActionPerformed(evt);
            }
        });
        jPanel9.add(btnEliminarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 160, 60));

        txtIdProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProveedorActionPerformed(evt);
            }
        });
        jPanel9.add(txtIdProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, -1, 30));
        jPanel9.add(txtDireccionProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 190, 40));

        jTabbedPane1.addTab("PROVEEDOR", jPanel9);

        jPanel7.setBackground(new java.awt.Color(255, 204, 0));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel19.setText("CODIGO :");
        jPanel7.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 103, 35));

        jLabel20.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel20.setText("DESCRIPCION :");
        jPanel7.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 100, 28));

        jLabel21.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel21.setText("CANTIDAD :");
        jPanel7.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 100, 37));

        jLabel22.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel22.setText("PROVEEDOR :");
        jPanel7.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 110, 28));

        jLabel23.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel23.setText("RAZÓN SOCIAL :");
        jPanel7.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 454, 92, 30));
        jPanel7.add(txtCodigoPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 170, 30));
        jPanel7.add(txtDesPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 170, 40));
        jPanel7.add(txtCantPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 170, 40));
        jPanel7.add(txtPrecioPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 170, 30));

        jLabel24.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel24.setText("PRECIO :");
        jPanel7.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 100, 28));

        TableProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "COD", "DESCRIPCION", "PROVEEDOR", "STOCK", "PRECIO"
            }
        ));
        TableProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableProductoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TableProducto);
        if (TableProducto.getColumnModel().getColumnCount() > 0) {
            TableProducto.getColumnModel().getColumn(0).setPreferredWidth(20);
            TableProducto.getColumnModel().getColumn(1).setPreferredWidth(50);
            TableProducto.getColumnModel().getColumn(2).setPreferredWidth(100);
            TableProducto.getColumnModel().getColumn(3).setPreferredWidth(50);
            TableProducto.getColumnModel().getColumn(4).setPreferredWidth(40);
            TableProducto.getColumnModel().getColumn(5).setPreferredWidth(100);
        }

        jPanel7.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 650, 390));

        btnNuevoPro.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        btnNuevoPro.setForeground(new java.awt.Color(0, 51, 102));
        btnNuevoPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/anadir (1).png"))); // NOI18N
        btnNuevoPro.setText("LISTAR");
        btnNuevoPro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevoPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProActionPerformed(evt);
            }
        });
        jPanel7.add(btnNuevoPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 140, 60));

        btnGuardarPro.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        btnGuardarPro.setForeground(new java.awt.Color(0, 51, 102));
        btnGuardarPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/disco-flexible (1).png"))); // NOI18N
        btnGuardarPro.setText("REGISTRAR");
        btnGuardarPro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarProActionPerformed(evt);
            }
        });
        jPanel7.add(btnGuardarPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, 60));

        btnEditarPro.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        btnEditarPro.setForeground(new java.awt.Color(0, 51, 102));
        btnEditarPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/actualizar (1).png"))); // NOI18N
        btnEditarPro.setText("EDITAR");
        btnEditarPro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProActionPerformed(evt);
            }
        });
        jPanel7.add(btnEditarPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 130, 60));

        btnEliminarPro.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        btnEliminarPro.setForeground(new java.awt.Color(0, 51, 102));
        btnEliminarPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/borrar (1).png"))); // NOI18N
        btnEliminarPro.setText("ELIMINAR");
        btnEliminarPro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProActionPerformed(evt);
            }
        });
        jPanel7.add(btnEliminarPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 150, 60));

        jPanel7.add(cbxProveedorPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 170, 40));

        txtIdProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProductoActionPerformed(evt);
            }
        });
        jPanel7.add(txtIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 0, 30));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 1020, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 484, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("PRODUCTOS", jPanel4);

        jPanel5.setBackground(new java.awt.Color(204, 204, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TableVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CLIENTE", "VENDEDOR", "TOTAL"
            }
        ));
        jScrollPane4.setViewportView(TableVentas);
        if (TableVentas.getColumnModel().getColumnCount() > 0) {
            TableVentas.getColumnModel().getColumn(0).setPreferredWidth(20);
            TableVentas.getColumnModel().getColumn(1).setPreferredWidth(60);
            TableVentas.getColumnModel().getColumn(2).setPreferredWidth(60);
            TableVentas.getColumnModel().getColumn(3).setPreferredWidth(60);
        }

        jPanel5.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 830, 310));

        btnPdfVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/pdf (1).png"))); // NOI18N
        btnPdfVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.add(btnPdfVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 80, 60));
        jPanel5.add(txtIdVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        jTabbedPane1.addTab("HISTORIAL", jPanel5);

        jPanel8.setBackground(new java.awt.Color(255, 255, 204));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel25.setText("RUC :");
        jPanel8.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 103, 35));

        jLabel26.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel26.setText("TELEFÓNO :");
        jPanel8.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, 100, 28));

        jLabel27.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel27.setText("NOMBRE :");
        jPanel8.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 100, 30));

        jLabel28.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel28.setText("RAZÓN SOCIAL :");
        jPanel8.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 110, 28));

        jLabel29.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel29.setText("RAZÓN SOCIAL :");
        jPanel8.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 454, 92, 30));
        jPanel8.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 230, 50));
        jPanel8.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 230, 50));
        jPanel8.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 230, 50));
        jPanel8.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 260, 40));

        jTextField22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField22ActionPerformed(evt);
            }
        });
        jPanel8.add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 250, 40));

        jLabel30.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel30.setText("DIRECCIÓN :");
        jPanel8.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 100, 28));

        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/flecha-de-carga (1).png"))); // NOI18N
        jButton20.setText("ACTUALIZAR");
        jPanel8.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 190, 60));

        jLabel40.setText("\"");
        jPanel8.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 30, 110, -1));

        jLabel31.setFont(new java.awt.Font("Bodoni MT Poster Compressed", 1, 48)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(102, 102, 0));
        jLabel31.setText("DATOS DE LA EMPRESA :");
        jPanel8.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        jTabbedPane1.addTab("DATOS FACTURA", jPanel8);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 1020, 490));

        jLabel41.setFont(new java.awt.Font("MV Boli", 1, 48)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 0, 102));
        jLabel41.setText("ES UN PLACER !!");
        getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 80, 490, 60));

        jLabel43.setFont(new java.awt.Font("MV Boli", 1, 48)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 0, 102));
        jLabel43.setText("\"DONDE COMPRAR");
        getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 530, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/audifonos-inalambricos (1).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 60, 60));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/carrito-de-compras (1).png"))); // NOI18N
        getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, 80, 70));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cheque (1).png"))); // NOI18N
        getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 60, 60));

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/bolsa-para-la-escuela (1).png"))); // NOI18N
        getContentPane().add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 70, 60));

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/lampara-de-mesa (1).png"))); // NOI18N
        getContentPane().add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 70, 60));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/TITT II (2).jpg"))); // NOI18N
        jLabel38.setText("jLabel38");
        getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 1020, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaVentaActionPerformed
        
    }//GEN-LAST:event_btnNuevaVentaActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
    LimpiarTable();
        ListarCliente();
      jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void jTextField22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField22ActionPerformed

    private void btnEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClienteActionPerformed
    if("".equals(txtIdCliente.getText()))   {
        JOptionPane.showMessageDialog(null, "Selecciona una fila");
        
    }   else{
        
        if(!"".equals(txtDniCliente.getText()) || !"".equals(txtNombreCliente.getText())|| !"".equals(txtTelefonoCliente.getText()) || !"".equals(txtDireccionCliente.getText())) {
        cl.setDni(Integer.parseInt(txtDniCliente.getText()));
        cl.setNombre(txtNombreCliente.getText());
        cl.setTelefono(Integer.parseInt(txtTelefonoCliente.getText()));
        cl.setDireccion(txtDireccionCliente.getText());
        cl.setRazon(txtRazonCliente.getText());
        cl.setId(Integer.parseInt(txtIdCliente.getText()));
            client.ModificarCliente(cl);
        LimpiarTable();
        LimpiarCliente();
        ListarCliente();
    }else{
            JOptionPane.showMessageDialog(null, "Los campos estan vacios");
        }
    }
    }//GEN-LAST:event_btnEditarClienteActionPerformed

    private void btnEditarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProActionPerformed
    if("".equals(txtIdProducto.getText()))   {
        JOptionPane.showMessageDialog(null, "Selecciona una fila");
        
    }   else{
        
        if(!"".equals(txtCodigoPro.getText()) || !"".equals(txtDesPro.getText())|| !"".equals(txtCantPro.getText()) || !"".equals(txtPrecioPro.getText()) ){
        pro.setCodigo(txtCodigoPro.getText());
        pro.setNombre(txtDesPro.getText());
        pro.setProveedor(cbxProveedorPro.getSelectedItem().toString());
        pro.setStock(Integer.parseInt(txtCantPro.getText()));
        pro.setPrecio(Double.parseDouble(txtPrecioPro.getText()));
        pro.setId(Integer.parseInt(txtIdProducto.getText()));
         proDao.ModificarProductos(pro);
         JOptionPane.showMessageDialog(null,"Producto Modificado");
        LimpiarTable();
        ListarProductos();
         LimpiarProducto();
    
        }
    }              
    }//GEN-LAST:event_btnEditarProActionPerformed

    private void txtRucVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRucVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRucVentaActionPerformed

    private void txtCantidadVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadVentaActionPerformed

    private void btnEliminarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVentaActionPerformed
        modelo= (DefaultTableModel) TableVenta.getModel();
        modelo.removeRow(TableVenta.getSelectedRow());
        TotalPagar();
        txtCodigoVenta.requestFocus();
    }//GEN-LAST:event_btnEliminarVentaActionPerformed

    private void txtIdProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdProductoActionPerformed

    private void txtIdProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdProActionPerformed

    private void btnGuardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarClienteActionPerformed
           if(!"".equals(txtDniCliente.getText()) || !"".equals(txtNombreCliente.getText()) || !"".equals(txtTelefonoCliente.getText()) || !"".equals(txtDireccionCliente.getText())) {
               cl.setDni(Integer.parseInt(txtDniCliente.getText()));
               cl.setNombre(txtNombreCliente.getText());
               cl.setTelefono(Integer.parseInt(txtTelefonoCliente.getText()));
               cl.setDireccion(txtDireccionCliente.getText());
               cl.setRazon(txtRazonCliente.getText());
               client.RegistrarCliente(cl);
                JOptionPane.showMessageDialog(null,"Cliente registrado");
               LimpiarTable();
               LimpiarCliente();
                ListarCliente();
               JOptionPane.showMessageDialog(null, "Cliente Registrado");
           }else {
               JOptionPane.showMessageDialog(null, "Los campos estan vacios");
           }
    }//GEN-LAST:event_btnGuardarClienteActionPerformed

    private void TableClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableClienteMouseClicked
        int fila= TableCliente.rowAtPoint(evt.getPoint());
        txtIdCliente.setText(TableCliente.getValueAt(fila,0).toString());
        txtDniCliente.setText(TableCliente.getValueAt(fila,1).toString());
        txtNombreCliente.setText(TableCliente.getValueAt(fila,2).toString());
        txtTelefonoCliente.setText(TableCliente.getValueAt(fila,3).toString());
        txtDireccionCliente.setText(TableCliente.getValueAt(fila,4).toString());
        txtRazonCliente.setText(TableCliente.getValueAt(fila,5).toString());
        
    }//GEN-LAST:event_TableClienteMouseClicked

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
        if(!"".equals(txtIdCliente.getText())){
            int pregunta = JOptionPane.showConfirmDialog(null, "Estas seguro de eliminar?");
            if(pregunta == 0){
                int id = Integer.parseInt(txtIdCliente.getText());
                client.EliminarCliente(id);
                LimpiarTable();
                LimpiarCliente();
                ListarCliente();
            }
        }
    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    private void btnNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoClienteActionPerformed
        LimpiarCliente();
    }//GEN-LAST:event_btnNuevoClienteActionPerformed

    private void btnProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedorActionPerformed
          LimpiarTable();
        ListarProveedor();
       jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_btnProveedorActionPerformed

    private void btnConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfigActionPerformed

    private void btnEditarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProveedorActionPerformed
       if("".equals(txtIdProveedor.getText()))   {
        JOptionPane.showMessageDialog(null, "Selecciona una fila");
        
    }   else{
        
        if(!"".equals(txtRucProveedor.getText()) || !"".equals(txtNombreproveedor.getText())|| !"".equals(txtTelefonoProveedor.getText()) || !"".equals(txtDireccionProveedor.getText()) || !"".equals(txtRazonProveedor.getText())){
        pr.setRuc(Integer.parseInt(txtRucProveedor.getText()));
        pr.setNombre(txtNombreproveedor.getText());
        pr.setTelefono(Integer.parseInt(txtTelefonoProveedor.getText()));
        pr.setDireccion(txtDireccionProveedor.getText());
        pr.setRazon(txtRazonProveedor.getText());
        pr.setId(Integer.parseInt(txtIdProveedor.getText()));
         PrDao.ModificarProveedor(pr);
          JOptionPane.showMessageDialog(null,"Cliente Modificado");
        LimpiarTable();
        LimpiarProveedor();
        ListarProveedor();
    
        }
    }        
    }//GEN-LAST:event_btnEditarProveedorActionPerformed

    private void txtIdProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdProveedorActionPerformed

    private void btnGuardarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarProveedorActionPerformed
          if(!"".equals(txtRucProveedor.getText()) || !"".equals(txtNombreproveedor.getText()) || !"".equals(txtTelefonoProveedor.getText()) || !"".equals(txtDireccionProveedor.getText())) {
               pr.setRuc(Integer.parseInt(txtRucProveedor.getText()));
               pr.setNombre(txtNombreproveedor.getText());
               pr.setTelefono(Integer.parseInt(txtTelefonoProveedor.getText()));
               pr.setDireccion(txtDireccionProveedor.getText());
               pr.setRazon(txtRazonProveedor.getText());   
               PrDao.RegistrarProveedor(pr);
                JOptionPane.showMessageDialog(null,"Proovedor registrado");
               LimpiarTable();
               ListarProveedor();
               LimpiarProveedor();
          }else{
              JOptionPane.showMessageDialog(null,"Los campos estan vacios");
          }
          
    }//GEN-LAST:event_btnGuardarProveedorActionPerformed

    private void TableProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableProveedorMouseClicked
        int fila= TableProveedor.rowAtPoint(evt.getPoint());
        txtIdProveedor.setText(TableProveedor.getValueAt(fila,0).toString());
        txtRucProveedor.setText(TableProveedor.getValueAt(fila,1).toString());
        txtNombreproveedor.setText(TableProveedor.getValueAt(fila,2).toString());
        txtTelefonoProveedor.setText(TableProveedor.getValueAt(fila,3).toString());
        txtDireccionProveedor.setText(TableProveedor.getValueAt(fila,4).toString());
        txtRazonProveedor.setText(TableProveedor.getValueAt(fila,5).toString());
    }//GEN-LAST:event_TableProveedorMouseClicked

    private void btnEliminarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProveedorActionPerformed
      if(!"".equals(txtIdProveedor.getText())){
            int pregunta = JOptionPane.showConfirmDialog(null, "Estas seguro de eliminar?");
            if(pregunta == 0){
                int id = Integer.parseInt(txtIdProveedor.getText());
                PrDao.EliminarProveedor(id);
                LimpiarTable();
                ListarProveedor();
                LimpiarProveedor();
               
            }
        }else{
          JOptionPane.showMessageDialog(null,"Seleccione una fila");
      }
      
    }//GEN-LAST:event_btnEliminarProveedorActionPerformed

    private void btnNuevoProovedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProovedorActionPerformed
      LimpiarProveedor();
    }//GEN-LAST:event_btnNuevoProovedorActionPerformed

    private void btnGuardarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarProActionPerformed
     if(!"".equals(txtCodigoPro.getText()) || !"".equals(txtDesPro.getText()) || !"".equals(cbxProveedorPro.getSelectedItem().toString()) || !"".equals(txtCantPro.getText()) || !"".equals(txtPrecioPro.getText())) {
               pro.setCodigo(txtCodigoPro.getText());
               pro.setNombre(txtDesPro.getText());
               pro.setProveedor(cbxProveedorPro.getSelectedItem().toString());
               pro.setStock(Integer.parseInt(txtCantPro.getText()));
               pro.setPrecio(Double.parseDouble(txtPrecioPro.getText()));   
               proDao.RegistrarProductos(pro);      
               JOptionPane.showMessageDialog(null,"Producto registrado");
     }else{
         JOptionPane.showMessageDialog(null, "Los campos estan vacios");
     }
    }//GEN-LAST:event_btnGuardarProActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
   
        LimpiarTable();
        ListarProductos();
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_btnProductosActionPerformed

    private void TableProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableProductoMouseClicked
         int fila= TableProducto.rowAtPoint(evt.getPoint());
        txtIdProducto.setText(TableProducto.getValueAt(fila,0).toString());
        txtCodigoPro.setText(TableProducto.getValueAt(fila,1).toString());
        txtDesPro.setText(TableProducto.getValueAt(fila,2).toString());
        cbxProveedorPro.setSelectedItem(TableProducto.getValueAt(fila,3).toString());
        txtCantPro.setText(TableProducto.getValueAt(fila,4).toString());
        txtPrecioPro.setText(TableProducto.getValueAt(fila,5).toString());
    }//GEN-LAST:event_TableProductoMouseClicked

    private void btnNuevoProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoProActionPerformed

    private void btnEliminarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProActionPerformed
       if(!"".equals(txtIdProducto.getText())){
            int pregunta = JOptionPane.showConfirmDialog(null, "Estas seguro de eliminar?");
            if(pregunta == 0){
                int id = Integer.parseInt(txtIdProducto.getText());
                proDao.EliminarProducto(id);
                LimpiarTable();
                LimpiarProducto();
                ListarProductos();
              
               
            }
        }else{
          JOptionPane.showMessageDialog(null,"Seleccione una fila");
      }        
    }//GEN-LAST:event_btnEliminarProActionPerformed

    private void txtCodigoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoVentaActionPerformed
       
    }//GEN-LAST:event_txtCodigoVentaActionPerformed

    private void txtCodigoVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoVentaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(!"".equals(txtCodigoVenta.getText())){
                String cod = txtCodigoVenta.getText();
                pro = proDao.BuscarPro(cod);
                if(pro.getNombre() !=null){
                    txtDescripcionVenta.setText(""+pro.getNombre());
                   txtPrecioVenta.setText(""+pro.getPrecio());
                    txtStockDisponible.setText(""+pro.getStock());
                    txtCantidadVenta.requestFocus();
                }else{
                   LimpiarVenta();
                   txtCodigoVenta.requestFocus();
                }
            }else{
                JOptionPane.showMessageDialog(null,"Ingrese el codigo del producto");
                txtCodigoVenta.requestFocus();
            }
        }
    }//GEN-LAST:event_txtCodigoVentaKeyPressed

    private void txtCantidadVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadVentaKeyPressed
      if(evt.getKeyCode()== KeyEvent.VK_ENTER){
          if(!"".equals(txtCantidadVenta.getText())){
              String cod = txtCodigoVenta.getText();
              String descripcion = txtDescripcionVenta.getText();
              int cant = Integer.parseInt(txtCantidadVenta.getText());
              double precio = Double.parseDouble(txtPrecioVenta.getText());
              double total = cant *precio;
              int stock = Integer.parseInt(txtStockDisponible.getText());
              if(stock >= cant) {
              item = item +1;
              modelo= (DefaultTableModel) TableVenta.getModel();
              for(int i=0 ; i <TableVenta.getRowCount(); i++){
                  if (TableVenta.getValueAt(i,1).equals(txtDescripcionVenta.getText())){
                      JOptionPane.showMessageDialog(null, "El producto ya esta registrado");
                      return;
                      
                  }
                  
              }
              ArrayList lista = new ArrayList();
              lista.add(item);
              lista.add(cod);
              lista.add(descripcion);
              lista.add(cant);
              lista.add(precio);
              lista.add(total);
              Object[] O = new Object[5];
              O[0] = lista.get(1);
              O[1] = lista.get(2);
              O[2] = lista.get(3);
              O[3] = lista.get(4);
              O[4] = lista.get(4);
              modelo.addRow(O);
              TableVenta.setModel(modelo);
              TotalPagar();
              LimpiarVenta();
              txtCodigoVenta.requestFocus();
          }else{
                  JOptionPane.showMessageDialog(null,"Stock no disponible");
              }
              
          }else{
              JOptionPane.showMessageDialog(null,"Ingrese cantidad");
          }
      }
    }//GEN-LAST:event_txtCantidadVentaKeyPressed

    private void txtRucVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRucVentaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(!"".equals(txtRucVenta.getText())){
                int dni = Integer.parseInt(txtRucVenta.getText());
                cl= client.BuscarCliente(dni);
                if(cl.getNombre() != null){
                    txtNombreClienteventa.setText(""+cl.getNombre());
                    txtTelefonoCV.setText(""+cl.getTelefono());
                    txtDireccionCV.setText(""+cl.getDireccion());
                    txtRazonCV.setText(""+cl.getRazon());
                }else{
                    txtRucVenta.setText("");
                    JOptionPane.showMessageDialog(null, "El cliente no existe");
                }
            }
        }
    }//GEN-LAST:event_txtRucVentaKeyPressed

    private void btnGenerarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarVentaActionPerformed
       RegistrarVenta();
    }//GEN-LAST:event_btnGenerarVentaActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVentasActionPerformed

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
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelTotal;
    private javax.swing.JLabel LabelVendedor;
    private javax.swing.JTable TableCliente;
    private javax.swing.JTable TableProducto;
    private javax.swing.JTable TableProveedor;
    private javax.swing.JTable TableVenta;
    private javax.swing.JTable TableVentas;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnConfig;
    private javax.swing.JButton btnEditarCliente;
    private javax.swing.JButton btnEditarPro;
    private javax.swing.JButton btnEditarProveedor;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnEliminarPro;
    private javax.swing.JButton btnEliminarProveedor;
    private javax.swing.JButton btnEliminarVenta;
    private javax.swing.JButton btnGenerarVenta;
    private javax.swing.JButton btnGuardarCliente;
    private javax.swing.JButton btnGuardarPro;
    private javax.swing.JButton btnGuardarProveedor;
    private javax.swing.JButton btnNuevaVenta;
    private javax.swing.JButton btnNuevoCliente;
    private javax.swing.JButton btnNuevoPro;
    private javax.swing.JButton btnNuevoProovedor;
    private javax.swing.JButton btnPdfVentas;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnProveedor;
    private javax.swing.JButton btnVentas;
    private javax.swing.JComboBox<String> cbxProveedorPro;
    private javax.swing.JButton jButton20;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
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
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField txtCantPro;
    private javax.swing.JTextField txtCantidadVenta;
    private javax.swing.JTextField txtCodigoPro;
    private javax.swing.JTextField txtCodigoVenta;
    private javax.swing.JTextField txtDesPro;
    private javax.swing.JTextField txtDescripcionVenta;
    private javax.swing.JTextField txtDireccionCV;
    private javax.swing.JTextField txtDireccionCliente;
    private javax.swing.JTextField txtDireccionProveedor;
    private javax.swing.JTextField txtDniCliente;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtIdPro;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtIdProveedor;
    private javax.swing.JTextField txtIdVenta;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNombreClienteventa;
    private javax.swing.JTextField txtNombreproveedor;
    private javax.swing.JTextField txtPrecioPro;
    private javax.swing.JTextField txtPrecioVenta;
    private javax.swing.JTextField txtRazonCV;
    private javax.swing.JTextField txtRazonCliente;
    private javax.swing.JTextField txtRazonProveedor;
    private javax.swing.JTextField txtRucProveedor;
    private javax.swing.JTextField txtRucVenta;
    private javax.swing.JTextField txtStockDisponible;
    private javax.swing.JTextField txtTelefonoCV;
    private javax.swing.JTextField txtTelefonoCliente;
    private javax.swing.JTextField txtTelefonoProveedor;
    // End of variables declaration//GEN-END:variables
private void LimpiarCliente(){
    txtIdCliente.setText("");
    txtDniCliente.setText("");
    txtNombreCliente.setText("");
    txtTelefonoCliente.setText("");
    txtDireccionCliente.setText("");
    txtRazonCliente.setText("");
}

private void LimpiarProveedor(){
    txtIdProveedor.setText("");
    txtRucProveedor.setText("");
    txtNombreproveedor.setText("");
    txtTelefonoProveedor.setText("");
    txtDireccionProveedor.setText("");
    txtRazonProveedor.setText("");
}


private void LimpiarProducto(){
    txtIdProducto.setText("");
    txtCodigoPro.setText("");
    cbxProveedorPro.setSelectedItem(null);
    txtDesPro.setText("");
    txtCantPro.setText("");
    txtPrecioPro.setText("");
}

private void TotalPagar(){
    Totalpagar = 0.00;
    int numFila = TableVenta.getRowCount();
    for(int i=0; i <numFila; i++){
        double cal =Double.parseDouble(String.valueOf(TableVenta.getModel().getValueAt(i, 4)));
        Totalpagar = Totalpagar + cal;
    }
    LabelTotal.setText(String.format("%.2f", Totalpagar));
}

private void LimpiarVenta(){
    txtCodigoVenta.setText("");
    txtDescripcionVenta.setText("");
    txtCantidadVenta.setText("");
    txtStockDisponible.setText("");
    txtPrecioVenta.setText("");
}

private void RegistrarVenta(){
    String cliente = txtNombreClienteventa.getText();
    String vendedor = LabelVendedor.getText();
    double monto = Totalpagar;
    v.setCliente(cliente);
    v.setVendedor(vendedor);
    v.setTotal(monto);
    Vdao.RegistrarVenta(v);
}

}
