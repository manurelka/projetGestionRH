package vues;

import java.awt.event.ActionEvent;

import reader_writer.LecteurCompetences;
import ressources.ListeCompetences;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Principale extends javax.swing.JFrame {

    /**
     * Creates new form Principale
     */
    public Principale() {
        initComponents();
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
    	jpan_ajouter_cpt = new Ajouter2();
    	jpan_modifier_cpt = new Modifier2();
    	jpan_supprimer_cpt = new Supprimer();
    	jpan_liste_cpt = new Listecpt2();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);
        jMenuBar1.add(jMenu4);
        jMenu3.setText("Compétence");
        
        jMenu4.setText("Personnel");
        
        jMenuItem1.setText("Liste");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("Ajouter");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener(){

			public void actionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				jMenuItem1ActionPerformed(evt);
			}
        	
        });
        jMenu3.add(jMenuItem2);

        jMenuItem3.setText("Modifier");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener(){

			public void actionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				jMenuItem1ActionPerformed(evt);
			}
        	
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("Supprimer");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener(){

			public void actionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				jMenuItem1ActionPerformed(evt);
			}
        	
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        Object e = evt.getSource();
        if(e==jMenuItem1){
        	this.setContentPane(jpan_liste_cpt);
        }
        if(e==jMenuItem2){
        	this.setContentPane(jpan_ajouter_cpt);
        }
        if(e==jMenuItem3){
        	this.setContentPane(jpan_modifier_cpt);
        }
        if(e==jMenuItem4){
        	this.setContentPane(jpan_supprimer_cpt);
        }
        this.repaint();
        this.revalidate();
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
            java.util.logging.Logger.getLogger(Principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private Ajouter2 jpan_ajouter_cpt;
    private Modifier2 jpan_modifier_cpt;
    private Supprimer jpan_supprimer_cpt;
    private Listecpt2 jpan_liste_cpt;
   
    // End of variables declaration                   
}
