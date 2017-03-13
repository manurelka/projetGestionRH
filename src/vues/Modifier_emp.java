package vues;

/**
*
* @author bertr
*/
public class Modifier_emp extends javax.swing.JPanel {

   /** Creates new form Supprimer_pers */
   public Modifier_emp() {
       initComponents();
   }

   /** This method is called from within the constructor to
    * initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is
    * always regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
   private void initComponents() {

       jPanelHaut = new javax.swing.JPanel();
       jLabelTitre = new javax.swing.JLabel();
       jScrollPaneEmp = new javax.swing.JScrollPane();
       jListEmp = new javax.swing.JList<>();
       jPanelBas = new javax.swing.JPanel();
       jLabelNom = new javax.swing.JLabel();
       jLabelPren = new javax.swing.JLabel();
       jTextFieldNom = new javax.swing.JTextField();
       jTextFieldPren = new javax.swing.JTextField();
       jLabelDate = new javax.swing.JLabel();
       jTextFieldDate = new javax.swing.JTextField();
       jButtonModif = new javax.swing.JButton();

       jLabelTitre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
       jLabelTitre.setText("Modifier employ�");

       jListEmp.setModel(new javax.swing.AbstractListModel<String>() {
           String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
           public int getSize() { return strings.length; }
           public String getElementAt(int i) { return strings[i]; }
       });
       jScrollPaneEmp.setViewportView(jListEmp);

       javax.swing.GroupLayout jPanelHautLayout = new javax.swing.GroupLayout(jPanelHaut);
       jPanelHaut.setLayout(jPanelHautLayout);
       jPanelHautLayout.setHorizontalGroup(
           jPanelHautLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(jPanelHautLayout.createSequentialGroup()
               .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addGroup(jPanelHautLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                   .addComponent(jScrollPaneEmp)
                   .addComponent(jLabelTitre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
               .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
       );
       jPanelHautLayout.setVerticalGroup(
           jPanelHautLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(jPanelHautLayout.createSequentialGroup()
               .addContainerGap()
               .addComponent(jLabelTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
               .addComponent(jScrollPaneEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
       );

       jLabelNom.setText("Nom");
       jLabelNom.setPreferredSize(new java.awt.Dimension(60, 20));

       jLabelPren.setText("Pr�nom");
       jLabelPren.setPreferredSize(new java.awt.Dimension(60, 20));

       jTextFieldNom.setPreferredSize(new java.awt.Dimension(60, 20));
       jTextFieldNom.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               jTextFieldNomActionPerformed(evt);
           }
       });

       jTextFieldPren.setPreferredSize(new java.awt.Dimension(60, 20));
       jTextFieldPren.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               jTextFieldPrenActionPerformed(evt);
           }
       });

       jLabelDate.setText("Date d'entr�e");
       

       jTextFieldDate.setPreferredSize(new java.awt.Dimension(60, 20));

       jButtonModif.setText("Modifier");

       javax.swing.GroupLayout jPanelBasLayout = new javax.swing.GroupLayout(jPanelBas);
       jPanelBas.setLayout(jPanelBasLayout);
       jPanelBasLayout.setHorizontalGroup(
           jPanelBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBasLayout.createSequentialGroup()
               .addContainerGap(255, Short.MAX_VALUE)
               .addGroup(jPanelBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                   .addComponent(jTextFieldDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                   .addComponent(jLabelDate, javax.swing.GroupLayout.Alignment.LEADING)
                   .addComponent(jTextFieldNom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                   .addComponent(jLabelNom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
               .addGroup(jPanelBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                   .addGroup(jPanelBasLayout.createSequentialGroup()
                       .addGap(71, 71, 71)
                       .addGroup(jPanelBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(jLabelPren, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addComponent(jTextFieldPren, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                   .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBasLayout.createSequentialGroup()
                       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                       .addComponent(jButtonModif)))
               .addContainerGap(255, Short.MAX_VALUE))
       );
       jPanelBasLayout.setVerticalGroup(
           jPanelBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(jPanelBasLayout.createSequentialGroup()
               .addContainerGap()
               .addGroup(jPanelBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(jLabelNom, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addComponent(jLabelPren, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
               .addGroup(jPanelBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addComponent(jTextFieldPren, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGap(18, 18, 18)
               .addComponent(jLabelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
               .addGroup(jPanelBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(jTextFieldDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addComponent(jButtonModif))
               .addContainerGap(167, Short.MAX_VALUE))
       );

       javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
       this.setLayout(layout);
       layout.setHorizontalGroup(
           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addComponent(jPanelHaut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
           .addComponent(jPanelBas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
       );
       layout.setVerticalGroup(
           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(layout.createSequentialGroup()
               .addComponent(jPanelHaut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
               .addComponent(jPanelBas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
       );
       
   }// </editor-fold>                        

   private void jTextFieldNomActionPerformed(java.awt.event.ActionEvent evt) {                                              
       // TODO add your handling code here:
   }                                             

   private void jTextFieldPrenActionPerformed(java.awt.event.ActionEvent evt) {                                               
       // TODO add your handling code here:
   }                                              


   // Variables declaration - do not modify                     
   private javax.swing.JButton jButtonModif;
   private javax.swing.JLabel jLabelDate;
   private javax.swing.JLabel jLabelNom;
   private javax.swing.JLabel jLabelPren;
   private javax.swing.JLabel jLabelTitre;
   private javax.swing.JList<String> jListEmp;
   private javax.swing.JPanel jPanelBas;
   private javax.swing.JPanel jPanelHaut;
   private javax.swing.JScrollPane jScrollPaneEmp;
   private javax.swing.JTextField jTextFieldDate;
   private javax.swing.JTextField jTextFieldNom;
   private javax.swing.JTextField jTextFieldPren;
   // End of variables declaration                   

}
