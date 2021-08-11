package testproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Float.parseFloat;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;



public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
        //fetching date and time
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
                LocalDateTime now = LocalDateTime.now();  
                datenow.setText(dtf.format(now));
                
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cityloc = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        datenow = new javax.swing.JLabel();
        cloud = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        speed = new javax.swing.JLabel();
        fahren = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        humid = new javax.swing.JLabel();
        nameLabel = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        celsi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 900));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("You are welcome to the world City direct forecast");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 410, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testproject/maps.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 40, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("WorldForeCast");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 390, 60));

        cityloc.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cityloc.setText("Kumasi");
        jPanel1.add(cityloc, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, -1, -1));

        jLabel14.setText("Knowing Seasons and Times is very important to the human race ~King");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        datenow.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        datenow.setText("8th August, 2021");
        jPanel1.add(datenow, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        cloud.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cloud.setForeground(new java.awt.Color(255, 255, 255));
        cloud.setText("Cloudy");
        jPanel1.add(cloud, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 70, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Cloud Level :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 686, 250));

        speed.setFont(new java.awt.Font("Trajan Pro 3", 1, 18)); // NOI18N
        speed.setForeground(new java.awt.Color(255, 153, 0));
        speed.setText("4.3");
        getContentPane().add(speed, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 130, 30));

        fahren.setFont(new java.awt.Font("Trajan Pro 3", 1, 18)); // NOI18N
        fahren.setForeground(new java.awt.Color(255, 153, 0));
        fahren.setText("36");
        getContentPane().add(fahren, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 110, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testproject/humid.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testproject/temp.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testproject/windChill.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testproject/temp.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addGap(60, 60, 60)
                .addComponent(jLabel6)
                .addGap(74, 74, 74)
                .addComponent(jLabel7)
                .addGap(107, 107, 107)
                .addComponent(jLabel8)
                .addContainerGap(291, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 680, 30));

        humid.setFont(new java.awt.Font("Trajan Pro 3", 1, 18)); // NOI18N
        humid.setForeground(new java.awt.Color(255, 153, 0));
        humid.setText("7");
        getContentPane().add(humid, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 90, 40));

        nameLabel.setText("City");
        nameLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameLabelActionPerformed(evt);
            }
        });
        getContentPane().add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 310, 150, 30));

        jLabel1.setText("Enter City");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, -1, -1));

        jLabel13.setText("all rights reseserved (c) 2021");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, -1, -1));

        jLabel11.setText("Wind Speed");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, -1, -1));

        jLabel17.setText("Fahrenheit");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        jLabel18.setText("Humidity");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, -1, -1));

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, -1, -1));

        jLabel19.setText("Celcius");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        celsi.setFont(new java.awt.Font("Trajan Pro 3", 1, 18)); // NOI18N
        celsi.setForeground(new java.awt.Color(255, 153, 0));
        celsi.setText("36");
        getContentPane().add(celsi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 110, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents
String loc,cityname;

  
    private void nameLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameLabelActionPerformed
        // TODO add your handling code here
        
    }//GEN-LAST:event_nameLabelActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        loc = nameLabel.getText();
        cityloc.setText(loc);
        System.out.print(loc);
        
		    String API_KEY = "e7dda5158a7819350afa06b7a49f9656";
		    String urlString = "http://api.openweathermap.org/data/2.5/weather?q=" + loc + "&appid="
			    + API_KEY + "&units=imperial";
                        try{
                        StringBuilder result = new StringBuilder();
			URL url = new URL(urlString);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			BufferedReader rd = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String line;
			while ((line = rd.readLine()) != null) {
			    result.append(line);
			}
                        
                        JSONParser parser = new JSONParser();
                        Object obj = parser.parse(result.toString());
                        JSONObject mainobj = (JSONObject)obj;
                        Object newobj =  mainobj.get("main");

                        JSONObject Value = (JSONObject)newobj;
                        String humi = Value.get("humidity").toString();
                        String tempp = Value.get("temp").toString();
                        float k = parseFloat(tempp);
                        float f = (float) ((k - 273.15) *9/5 + 32);
                        float c = (float) (k - 273.15);
                        String celsius = String.valueOf(c);                        
                        String fahrenheit = String.valueOf(f);


                        Object wind =  mainobj.get("wind");
                        JSONObject Value_a = (JSONObject)wind;
                        String speedd = Value_a.get("speed").toString(); 
                        
                        
                        Object clod =  mainobj.get("clouds"); 
                        JSONObject Value_b = (JSONObject)clod;
                        String clodd = Value_b.get("all").toString();

                        celsi.setText(celsius);                        
                        fahren.setText(fahrenheit);
                        humid.setText(humi + " %");
                        cloud.setText(clodd +" %");                        
                        speed.setText(speedd +" mph");

                        
                        rd.close();
                        DateFormat dt = DateFormat.getTimeInstance(DateFormat.SHORT, Locale.ENGLISH);
                        }catch(MalformedURLException e){
                            
                        } catch (IOException ex) {
                            
                            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (ParseException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                        }

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel celsi;
    private javax.swing.JLabel cityloc;
    private javax.swing.JLabel cloud;
    private javax.swing.JLabel datenow;
    private javax.swing.JLabel fahren;
    private javax.swing.JLabel humid;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nameLabel;
    private javax.swing.JLabel speed;
    // End of variables declaration//GEN-END:variables

    private String getText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
