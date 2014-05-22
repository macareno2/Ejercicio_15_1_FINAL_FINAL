package paquete_principal;

// Manuel Seselle Fernández

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class Ejercicio_15_1 extends javax.swing.JFrame {

    Usuario nuevoUsuario = null;
    int id_usuario = 0;
    ArrayList<Enlace> enlaces = new ArrayList<>();
    ArrayList<String> etiquetas = new ArrayList<>();
    
    public Ejercicio_15_1() {
        initComponents();
        etiquetaNombreUsuario.setText("Usuario NO registrado");
        botonEnlacesPublicos.setVisible(false);
        botonEnlacesPrivados.setVisible(false);        
        presentaResultadosIniciales();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        areaTextoEnlaces = new javax.swing.JTextArea();
        panelRegistro = new javax.swing.JTabbedPane();
        panelIdentificarse = new javax.swing.JPanel();
        etiquetaLogin = new javax.swing.JLabel();
        campoTextoIdentificarseLogin = new javax.swing.JTextField();
        etiquetaPass = new javax.swing.JLabel();
        campoTextoIdentificarsePass = new javax.swing.JTextField();
        botonAceptarIdentificarse = new javax.swing.JButton();
        panelRegistrarse = new javax.swing.JPanel();
        etiquetaLogin1 = new javax.swing.JLabel();
        campoTextoRegistrarseLogin1 = new javax.swing.JTextField();
        etiquetaPass1 = new javax.swing.JLabel();
        campoTextoRegistrarsePass1 = new javax.swing.JTextField();
        etiquetaNombreCompleto1 = new javax.swing.JLabel();
        campoTextoNombreCompleto1 = new javax.swing.JTextField();
        botonAceptarRegistrarse = new javax.swing.JButton();
        panelDeslogearse = new javax.swing.JPanel();
        labelDeslogearse = new javax.swing.JLabel();
        botonDeslogearse = new javax.swing.JButton();
        etiquetaNombreUsuario = new javax.swing.JLabel();
        botonEnlacesPublicos = new javax.swing.JButton();
        botonEnlacesPrivados = new javax.swing.JButton();
        panelBusqueda = new javax.swing.JPanel();
        etiquetaBusqueda = new javax.swing.JLabel();
        campoTextoEtiquetas = new javax.swing.JTextField();
        botonEtiquetaBusca = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ejercicio 15.1");

        areaTextoEnlaces.setColumns(20);
        areaTextoEnlaces.setRows(5);
        jScrollPane1.setViewportView(areaTextoEnlaces);

        panelRegistro.setBackground(new java.awt.Color(204, 204, 204));

        panelIdentificarse.setBackground(new java.awt.Color(204, 204, 204));
        panelIdentificarse.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        etiquetaLogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        etiquetaLogin.setText("Login:");

        campoTextoIdentificarseLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        etiquetaPass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        etiquetaPass.setText("Pass:");

        campoTextoIdentificarsePass.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        botonAceptarIdentificarse.setText("Aceptar");
        botonAceptarIdentificarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarIdentificarseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelIdentificarseLayout = new javax.swing.GroupLayout(panelIdentificarse);
        panelIdentificarse.setLayout(panelIdentificarseLayout);
        panelIdentificarseLayout.setHorizontalGroup(
            panelIdentificarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIdentificarseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelIdentificarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaLogin)
                    .addComponent(etiquetaPass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelIdentificarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoTextoIdentificarseLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                    .addComponent(campoTextoIdentificarsePass))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIdentificarseLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonAceptarIdentificarse)
                .addGap(123, 123, 123))
        );
        panelIdentificarseLayout.setVerticalGroup(
            panelIdentificarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIdentificarseLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panelIdentificarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaLogin)
                    .addComponent(campoTextoIdentificarseLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelIdentificarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaPass)
                    .addComponent(campoTextoIdentificarsePass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(botonAceptarIdentificarse)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        panelRegistro.addTab("Identificarse", panelIdentificarse);

        panelRegistrarse.setBackground(new java.awt.Color(204, 204, 204));
        panelRegistrarse.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        etiquetaLogin1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        etiquetaLogin1.setText("Login deseado:");

        campoTextoRegistrarseLogin1.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        etiquetaPass1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        etiquetaPass1.setText("Pass deseada:");

        campoTextoRegistrarsePass1.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        etiquetaNombreCompleto1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        etiquetaNombreCompleto1.setText("Nombre completo:");

        campoTextoNombreCompleto1.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        botonAceptarRegistrarse.setText("Ingresar");
        botonAceptarRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarRegistrarseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRegistrarseLayout = new javax.swing.GroupLayout(panelRegistrarse);
        panelRegistrarse.setLayout(panelRegistrarseLayout);
        panelRegistrarseLayout.setHorizontalGroup(
            panelRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistrarseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelRegistrarseLayout.createSequentialGroup()
                        .addComponent(etiquetaNombreCompleto1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoTextoNombreCompleto1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelRegistrarseLayout.createSequentialGroup()
                        .addGroup(panelRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegistrarseLayout.createSequentialGroup()
                                .addComponent(etiquetaLogin1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(panelRegistrarseLayout.createSequentialGroup()
                                .addComponent(etiquetaPass1)
                                .addGap(10, 10, 10)))
                        .addGroup(panelRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(campoTextoRegistrarsePass1, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(campoTextoRegistrarseLogin1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegistrarseLayout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addComponent(botonAceptarRegistrarse)
                .addGap(121, 121, 121))
        );
        panelRegistrarseLayout.setVerticalGroup(
            panelRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistrarseLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaLogin1)
                    .addComponent(campoTextoRegistrarseLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaPass1)
                    .addComponent(campoTextoRegistrarsePass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNombreCompleto1)
                    .addComponent(campoTextoNombreCompleto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonAceptarRegistrarse)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelRegistro.addTab("Registrarse", panelRegistrarse);

        panelDeslogearse.setBackground(new java.awt.Color(204, 204, 204));
        panelDeslogearse.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelDeslogearse.setForeground(new java.awt.Color(204, 204, 204));

        labelDeslogearse.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelDeslogearse.setText("¿Está usted seguro?");

        botonDeslogearse.setText("Si");
        botonDeslogearse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDeslogearseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDeslogearseLayout = new javax.swing.GroupLayout(panelDeslogearse);
        panelDeslogearse.setLayout(panelDeslogearseLayout);
        panelDeslogearseLayout.setHorizontalGroup(
            panelDeslogearseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDeslogearseLayout.createSequentialGroup()
                .addGroup(panelDeslogearseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDeslogearseLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(botonDeslogearse, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDeslogearseLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(labelDeslogearse)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        panelDeslogearseLayout.setVerticalGroup(
            panelDeslogearseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDeslogearseLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(labelDeslogearse)
                .addGap(32, 32, 32)
                .addComponent(botonDeslogearse)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        panelRegistro.addTab("LogOut", panelDeslogearse);

        etiquetaNombreUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        etiquetaNombreUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        botonEnlacesPublicos.setText("Enlaces públicos");
        botonEnlacesPublicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEnlacesPublicosActionPerformed(evt);
            }
        });

        botonEnlacesPrivados.setText("Enlaces privados");
        botonEnlacesPrivados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEnlacesPrivadosActionPerformed(evt);
            }
        });

        panelBusqueda.setBackground(new java.awt.Color(204, 204, 204));
        panelBusqueda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        etiquetaBusqueda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        etiquetaBusqueda.setText("Etiquetas a buscar:");

        campoTextoEtiquetas.setText(" introdúzcalas-separadas-por-guiones");

        botonEtiquetaBusca.setText("Ir");
        botonEtiquetaBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEtiquetaBuscaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBusquedaLayout = new javax.swing.GroupLayout(panelBusqueda);
        panelBusqueda.setLayout(panelBusquedaLayout);
        panelBusquedaLayout.setHorizontalGroup(
            panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoTextoEtiquetas)
                    .addGroup(panelBusquedaLayout.createSequentialGroup()
                        .addComponent(etiquetaBusqueda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonEtiquetaBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelBusquedaLayout.setVerticalGroup(
            panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaBusqueda)
                    .addComponent(botonEtiquetaBusca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoTextoEtiquetas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        botonSalir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                    .addComponent(etiquetaNombreUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(panelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(panelBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(botonSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(botonEnlacesPublicos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonEnlacesPrivados, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
                        .addGap(101, 101, 101))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(13, 13, 13))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(botonEnlacesPublicos)
                        .addGap(30, 30, 30)
                        .addComponent(botonEnlacesPrivados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(panelBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(etiquetaNombreUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void presentaResultadosIniciales() {
        
        // Mostrara los Titulos y las URL's de los enlaces publicos existentes en la BD:
            
        ///////////////////////////////////////////////////////////////////////

        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/bd_enlaces","root","root");
            System.out.println("- Conexion CORRECTA a la BD");
            
        } catch (SQLException e) {
            System.out.println("- Conexion NO CORRECTA a la BD");            
            e.printStackTrace();
        }
 
        Statement statement = null;
        
        ///////////////////////////////////////////////////////////////////////

        try {
            statement = connection.createStatement();

            statement.execute("SELECT titulo,url FROM enlaces WHERE privado='0' ");
            ResultSet resset = statement.getResultSet();

            enlaces.clear(); // Vacio el ArrayList del contenido anterior y lo vuelvo a llenar ahora
            
            while (resset.next()) { // Recorro linea a linea
                String titulo = resset.getString("titulo");
                String url = resset.getString("url");
                
                // Construyo un Objeto Enlace:
                Enlace nuevoEnlace = new Enlace();
                
                // Lleno ese Objeto:
                nuevoEnlace.setTitulo(titulo);
                nuevoEnlace.setUrl(url);
                
                // ArrayList<Enlace> enlaces = new ArrayList<>();     declarada arriba.
                // Lleno el ArrayList "enlaces" de Objetos de la clase "Enlace":                
                enlaces.add(nuevoEnlace);   
            }
            resset.close();
            
        } catch (SQLException e) {
            System.out.println("Error - A");
            e.printStackTrace();
        }
        
        ///////////////////////////////////////////////////////////////////////        
        
        // Llenar el "Campo de Texto" con los Titulos y las URL's:
        
        areaTextoEnlaces.setText("");
        
        for (int i=0 ; i<enlaces.size() ; i++) {
            
            areaTextoEnlaces.append(enlaces.get(i).getTitulo() + "\n");
            areaTextoEnlaces.append(enlaces.get(i).getUrl() + "\n\n");            
                
        }
        
        ///////////////////////////////////////////////////////////////////////        
        
    }
    
    
    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    
    private void botonAceptarIdentificarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarIdentificarseActionPerformed

        // Obtengo valores de los campos "login" y "pass"
        String login = campoTextoIdentificarseLogin.getText();
        String pass = campoTextoIdentificarsePass.getText();

        // Construyo un objeto Usuario:
        nuevoUsuario = new Usuario();

        // Veo si existe, utilizando el metodo "existe" (devuelve boolean y rellena por completo el objeto "nuevoUsuario", sacando datos de la BD):
        boolean existeUsuario = nuevoUsuario.existe(login, pass);

        if (existeUsuario) {
            id_usuario = nuevoUsuario.getId_usuario();
            etiquetaNombreUsuario.setText("Bienvenido/a, " + nuevoUsuario.getNombreCompleto());
            botonEnlacesPublicos.setVisible(true);
            botonEnlacesPrivados.setVisible(true);
            areaTextoEnlaces.setText("");
        } else {
            etiquetaNombreUsuario.setText("No existe ese usuario, regístrese please");
        }

    }//GEN-LAST:event_botonAceptarIdentificarseActionPerformed

    
    private void botonAceptarRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarRegistrarseActionPerformed

        // Obtengo los valores de los campos:
        String loginR = campoTextoRegistrarseLogin1.getText();
        String passR = campoTextoRegistrarsePass1.getText();
        String nombreC = campoTextoNombreCompleto1.getText();

        // Construyo un objeto Usuario:
        nuevoUsuario = new Usuario();
        nuevoUsuario.setLogin(loginR);
        nuevoUsuario.setPass(passR);
        nuevoUsuario.setNombreCompleto(nombreC);

        // Guardo usuario:
        nuevoUsuario.guardar();

    }//GEN-LAST:event_botonAceptarRegistrarseActionPerformed

    
    private void botonEtiquetaBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEtiquetaBuscaActionPerformed

        // Buscar los Enlaces que contengan las Etiquetas introducidas y presentarlos:
        
        ///////////////////////////////////////////////////////////////////////
        
        String etiquet = campoTextoEtiquetas.getText();
        String[] arrayEtiquetas = etiquet.split("-");
           
        etiquetas.clear();
        
        for(int i=0 ; i<arrayEtiquetas.length ; i++) {
            
            etiquetas.add(arrayEtiquetas[i]);
    
        }
              
        // "etiquetas" es un ArrayList de etiquetas introducidas en el campo de texto
        // "enlaces" es un ArrayList de enlaces que contienen esas etiquetas
        
        enlaces.clear();
        
        enlaces = Enlace.Etiquetados(etiquetas);
               
        // "Etiquetados" metodo definido en la Clase "Enlace"
        
        ///////////////////////////////////////////////////////////////////////
        
        // Presentar resultados en el "Area de texto"
        areaTextoEnlaces.setText(""); 
        
        // De todos los enlaces que vienen en el ArrayList "enlaces" hay que diferenciar:

        if (id_usuario == 0) { // Usuario NO REGISTRADO, entonces MOSTRAR TODOS los ENLACES PUBLICOS:
 
            for (int i=0 ; i<enlaces.size() ; i++){
                if (enlaces.get(i).isPrivado() == false) { // Es publico     
        
                    // Llenar el "Campo de Texto" con los Titulos y las URL's:
                    
                    areaTextoEnlaces.append(enlaces.get(i).getTitulo() + "\n");
                    areaTextoEnlaces.append(enlaces.get(i).getUrl() + "\n\n");         
                }
            }

        } else { // Usuario REGISTRADO con un "id_usuario" distinto de cero
            for (int i=0 ; i<enlaces.size() ; i++){
                if (enlaces.get(i).getId_usuario() == id_usuario) { // Es PRIVADO o PUBLICO de ese usuario 
        
                    // Llenar el "Campo de Texto" con los Titulos y las URL's y si es publico o privado:
                    
                    areaTextoEnlaces.append(enlaces.get(i).getTitulo() + "\n");
                    areaTextoEnlaces.append(enlaces.get(i).getUrl() + "\n");
                    if (enlaces.get(i).isPrivado() == false) { // Es publico
                        areaTextoEnlaces.append("Enlace Público" + "\n\n");                        
                    }
                    if (enlaces.get(i).isPrivado() == true) { // Es privado
                        areaTextoEnlaces.append("Enlace Privado" + "\n\n");                        
                    }                    
                }
            }                
        }
        
        ///////////////////////////////////////////////////////////////////////        
            
    }//GEN-LAST:event_botonEtiquetaBuscaActionPerformed

    
    private void botonDeslogearseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDeslogearseActionPerformed

        nuevoUsuario = null;
        id_usuario = 0;
        presentaResultadosIniciales();
        etiquetaNombreUsuario.setText("Usuario NO registrado");
        campoTextoIdentificarseLogin.setText("");
        campoTextoIdentificarsePass.setText("");
        campoTextoRegistrarseLogin1.setText("");
        campoTextoRegistrarsePass1.setText("");
        campoTextoNombreCompleto1.setText("");
        botonEnlacesPublicos.setVisible(false);
        botonEnlacesPrivados.setVisible(false);
        
    }//GEN-LAST:event_botonDeslogearseActionPerformed

    
    private void botonEnlacesPublicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEnlacesPublicosActionPerformed
    
        // Mostrara los Titulos y las URL's de los enlaces publicos pertenecientes a este usuario:
            
        ///////////////////////////////////////////////////////////////////////

        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/bd_enlaces","root","root");
            System.out.println("- Conexion CORRECTA a la BD");
            
        } catch (SQLException e) {
            System.out.println("- Conexion NO CORRECTA a la BD");            
            e.printStackTrace();
        }
 
        Statement statement = null;
        
        ///////////////////////////////////////////////////////////////////////

        try {
            statement = connection.createStatement();

            statement.execute("SELECT titulo,url FROM enlaces WHERE privado='0' and id_usuario='" + id_usuario + "'  ");
            ResultSet resset = statement.getResultSet();

            enlaces.clear(); // Vacio el ArrayList del contenido anterior y lo vuelvo a llenar ahora
            
            while (resset.next()) { // Recorro linea a linea
                String titulo = resset.getString("titulo");
                String url = resset.getString("url");
                
                // Construyo un Objeto Enlace:
                Enlace nuevoEnlace = new Enlace();
                
                // Lleno ese Objeto:
                nuevoEnlace.setTitulo(titulo);
                nuevoEnlace.setUrl(url);
                
                // ArrayList<Enlace> enlaces = new ArrayList<>();     declarada arriba.
                // Lleno el ArrayList "enlaces" de Objetos de la clase "Enlace":                
                enlaces.add(nuevoEnlace);   
            }
            resset.close();
            
        } catch (SQLException e) {
            System.out.println("Error - B");
            e.printStackTrace();
        }
        
        ///////////////////////////////////////////////////////////////////////        
        
        // Llenar el "Campo de Texto" con los Titulos y las URL's:
        
        areaTextoEnlaces.setText("");
        
        for (int i=0 ; i<enlaces.size() ; i++) {
            
            areaTextoEnlaces.append(enlaces.get(i).getTitulo() + "\n");
            areaTextoEnlaces.append(enlaces.get(i).getUrl() + "\n\n");            
                
        }
        
        ///////////////////////////////////////////////////////////////////////        
             
    }//GEN-LAST:event_botonEnlacesPublicosActionPerformed

    
    private void botonEnlacesPrivadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEnlacesPrivadosActionPerformed
    
        // Mostrara los Titulos y las URL's de los enlaces PRIVADOS pertenecientes a este usuario:
            
        ///////////////////////////////////////////////////////////////////////

        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/bd_enlaces","root","root");
            System.out.println("- Conexion CORRECTA a la BD");
            
        } catch (SQLException e) {
            System.out.println("- Conexion NO CORRECTA a la BD");            
            e.printStackTrace();
        }
 
        Statement statement = null;
        
        ///////////////////////////////////////////////////////////////////////

        try {
            statement = connection.createStatement();

            statement.execute("SELECT titulo,url FROM enlaces WHERE privado='1' and id_usuario='" + id_usuario + "'  ");
            ResultSet resset = statement.getResultSet();

            enlaces.clear(); // Vacio el ArrayList del contenido anterior y lo vuelvo a llenar ahora
            
            while (resset.next()) { // Recorro linea a linea
                String titulo = resset.getString("titulo");
                String url = resset.getString("url");
                
                // Construyo un Objeto Enlace:
                Enlace nuevoEnlace = new Enlace();
                
                // Lleno ese Objeto:
                nuevoEnlace.setTitulo(titulo);
                nuevoEnlace.setUrl(url);
                
                // ArrayList<Enlace> enlaces = new ArrayList<>();     declarada arriba.
                // Lleno el ArrayList "enlaces" de Objetos de la clase "Enlace":                
                enlaces.add(nuevoEnlace);   
            }
            resset.close();
            
        } catch (SQLException e) {
            System.out.println("Error - C");
            e.printStackTrace();
        }
        
        ///////////////////////////////////////////////////////////////////////        
        
        // Llenar el "Campo de Texto" con los Titulos y las URL's:
        
        areaTextoEnlaces.setText("");
        
        for (int i=0 ; i<enlaces.size() ; i++) {
            
            areaTextoEnlaces.append(enlaces.get(i).getTitulo() + "\n");
            areaTextoEnlaces.append(enlaces.get(i).getUrl() + "\n\n");            
                
        }
        
        ///////////////////////////////////////////////////////////////////////        
 
    }//GEN-LAST:event_botonEnlacesPrivadosActionPerformed

    
    public static void main(String args[]) {
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
                java.util.logging.Logger.getLogger(Ejercicio_15_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(Ejercicio_15_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(Ejercicio_15_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(Ejercicio_15_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>

            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Ejercicio_15_1().setVisible(true);
                }
            });
    }
        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaTextoEnlaces;
    private javax.swing.JButton botonAceptarIdentificarse;
    private javax.swing.JButton botonAceptarRegistrarse;
    private javax.swing.JButton botonDeslogearse;
    private javax.swing.JButton botonEnlacesPrivados;
    private javax.swing.JButton botonEnlacesPublicos;
    private javax.swing.JButton botonEtiquetaBusca;
    private javax.swing.JButton botonSalir;
    private javax.swing.JTextField campoTextoEtiquetas;
    private javax.swing.JTextField campoTextoIdentificarseLogin;
    private javax.swing.JTextField campoTextoIdentificarsePass;
    private javax.swing.JTextField campoTextoNombreCompleto1;
    private javax.swing.JTextField campoTextoRegistrarseLogin1;
    private javax.swing.JTextField campoTextoRegistrarsePass1;
    private javax.swing.JLabel etiquetaBusqueda;
    private javax.swing.JLabel etiquetaLogin;
    private javax.swing.JLabel etiquetaLogin1;
    private javax.swing.JLabel etiquetaNombreCompleto1;
    private javax.swing.JLabel etiquetaNombreUsuario;
    private javax.swing.JLabel etiquetaPass;
    private javax.swing.JLabel etiquetaPass1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDeslogearse;
    private javax.swing.JPanel panelBusqueda;
    private javax.swing.JPanel panelDeslogearse;
    private javax.swing.JPanel panelIdentificarse;
    private javax.swing.JPanel panelRegistrarse;
    private javax.swing.JTabbedPane panelRegistro;
    // End of variables declaration//GEN-END:variables
}


class Usuario {
    
    private int id_usuario;
    private String login = "";
    private String pass = "";
    private String nombreCompleto = "";

    public int getId_usuario() {
        return id_usuario;
    }

    public String getLogin() {
        return login;
    }

    public String getPass() {
        return pass;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public boolean existe(String login, String clave) {

        boolean existeUsuario = false; // Originalmente

         ///////////////////////////
         Connection connection = null;
         try {
         connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/bd_enlaces","root","root");
         System.out.println("- Conexion CORRECTA a la BD");

         } catch (SQLException e) {
         e.printStackTrace();
         }
         ///////////////////////////////////

        Statement statement = null;
        try {
            statement = connection.createStatement();

            statement.execute("SELECT id_usuario, login, clave, nombre_completo FROM usuarios WHERE login='" + login + "' AND clave='" + clave + "' ");
            ResultSet resset = statement.getResultSet();

            while (resset.next()) { // Es decir, si existe ese usuario en la BD.
                existeUsuario = true; // La funcion devuelvera verdadero.

                // Construyo un objeto con esa informacion:
                this.id_usuario = resset.getInt("id_usuario");
                this.login = resset.getString("login");
                this.pass = resset.getString("clave");
                this.nombreCompleto = resset.getString("nombre_completo");
            }
            resset.close();

        } catch (SQLException e) {
            System.out.println("Error - D");
            e.printStackTrace();
        }
        return existeUsuario;
    }

    public void guardar() {

        ///////////////////////////
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/bd_enlaces","root","root");
            System.out.println("- Conexion CORRECTA a la BD");

        } catch (SQLException e) {
            e.printStackTrace();
        }
        /////////////////////////////////// 

        // Obtengo valores del objeto:
        String loginA = this.getLogin();
        String passA = this.getPass();
        String nombreCompletoA = this.getNombreCompleto();

        // Veo si existe o no en la BD:
        if (this.existe(loginA, passA)) {
            // Hay que hacer una actualizacion del "nombre completo":

            Statement statement = null;
            try {
                statement = connection.createStatement();
                statement.execute("UPDATE usuarios SET nombre_completo='" + nombreCompletoA + "' WHERE  login='" + loginA + "' AND clave='" + passA + "'");

            } catch (SQLException e) {
                System.out.println("Error - E");
                e.printStackTrace();
            }

        } else {
            // Hay que insertar en la BD:
            Statement statement = null;
            try {
                statement = connection.createStatement();

                statement.execute("INSERT INTO usuarios VALUES (null,'" + loginA + "','" + passA + "','" + nombreCompletoA + "')");

            } catch (SQLException e) {
                System.out.println("Error - F");
                e.printStackTrace();
            }

        }

    }
} // Fin de la CLASE USUARIO


class Enlace {
    int id_enlaces;
    String url;
    String titulo;
    String comentario;
    int id_usuario;
    boolean privado;
 
    
    public int getId_enlaces() {
        return id_enlaces;
    }

    public void setId_enlaces(int id_enlaces) {
        this.id_enlaces = id_enlaces;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }
   

    // Inspirado en Metodo del profesor:
    public static ArrayList<Enlace> Etiquetados(ArrayList<String> etiquetas) {
        ArrayList<Enlace> resultado = new ArrayList<Enlace>();
        String cadea = "SELECT * FROM enlaces";
        if (etiquetas!=null && etiquetas.size()>0) {
            cadea += " WHERE";
            for (String etiqueta : etiquetas){
                cadea += " id_enlaces IN (SELECT id_enlace FROM etiquetas WHERE etiqueta='" + etiqueta + "') AND";
            }
            if(cadea.endsWith(" AND")){
                cadea = cadea.substring(0, cadea.length() - 4);  
            }
        }
        System.out.println(cadea);

        Statement st = null;
        try {
            ///////////////////////////
            Connection connection = null;
            try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/bd_enlaces","root","root");
            System.out.println("- Conexion CORRECTA a la BD");

            } catch (SQLException e) {
            e.printStackTrace();
            }
            ///////////////////////////////////

            st = connection.createStatement();
            ResultSet rs = st.executeQuery(cadea);
            while (rs.next()) {
                Enlace e = new Enlace();
                    e.setId_enlaces(rs.getInt("id_enlaces"));
                    e.setUrl(rs.getString("url"));
                    e.setTitulo(rs.getString("titulo"));
                    e.setComentario(rs.getString("comentario"));
                    e.setPrivado(rs.getBoolean("privado"));
                    e.setId_usuario(rs.getInt("id_usuario"));
                resultado.add(e);
            }

        } catch(SQLException e) {
            System.out.println(e.getLocalizedMessage());
        }
       return resultado;
    }     
           
} // Fin de la CLASE ENLACE