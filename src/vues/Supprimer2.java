package vues;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JList;
import javax.swing.LayoutStyle;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import ressources.Competence;
import ressources.ModifEvenement;

public class Supprimer2 extends PanelCompetences {

    /**
     * Creates new form Modifier
     */
    public Supprimer2() {
    	initCompetences();
        initComponents();
      //ajouter � la liste des ecouteurs de modification de la liste des comp�tences
        abonnerModif();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jlab_titre = new javax.swing.JLabel();
        jpan_general = new javax.swing.JPanel();
        jpan_options = new javax.swing.JPanel();
        jpan_competences = new javax.swing.JPanel(); 
        
        jlab_competences = new javax.swing.JLabel();
        jlab_suprcpt = new javax.swing.JLabel();
        jscroll_competences = new javax.swing.JScrollPane();
        jlist_competences = new javax.swing.JList<Competence>();
        jlab_libFR = new javax.swing.JLabel();
        jlab_domaine = new javax.swing.JLabel();
        jlab_libGB = new javax.swing.JLabel();
        jlab_code = new javax.swing.JLabel();
        jbtn_supprimer = new javax.swing.JButton();        
        
        
        //
        jlab_titre.setText(TITRE);
        
        jlab_titre.setFont(new java.awt.Font("Tahoma", 1, 14));

        jlist_competences.setModel(new javax.swing.AbstractListModel<Competence>() {
           public int getSize() { return competences.length; }
           public Competence getElementAt(int i) { return competences[i]; }
        });
                
        jlist_competences.setListData(competences);
        
        jscroll_competences.setViewportView(jlist_competences);
        
        jlab_competences.setText(competences_TEXTE);
        
        jlab_suprcpt.setText(competence_TEXTE);

        jlab_libFR.setText(libFR_TEXTE);

        jlab_domaine.setText(domaine_TEXTE);
        
        jlab_code.setText(code_TEXTE);
        
        jlab_libGB.setText(libGB_TEXTE);
        
        jbtn_supprimer.setText(supprimer_TEXTE);
        
      
        //Layout
        jpan_competences.setLayout(new BorderLayout(20, 20));
        jpan_competences.add(jlab_competences, BorderLayout.NORTH);
        jpan_competences.add(jscroll_competences, BorderLayout.CENTER);
        
        GroupLayout layoutOptions = new GroupLayout(jpan_options);
        jpan_options.setLayout(layoutOptions);
        
        layoutOptions.setVerticalGroup(
        		layoutOptions.createSequentialGroup()
        			.addComponent(jlab_suprcpt, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addComponent(jlab_domaine, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		           .addComponent(jlab_code, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		           .addComponent(jlab_libFR, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		           .addComponent(jlab_libGB, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		           .addComponent(jbtn_supprimer, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		           .addGap(400)
     	);
        
        layoutOptions.setHorizontalGroup(
        		layoutOptions.createParallelGroup()
        			.addComponent(jlab_suprcpt, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		           .addComponent(jlab_domaine, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		           .addComponent(jlab_code, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		           .addComponent(jlab_libFR, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		           .addComponent(jlab_libGB, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		           .addComponent(jbtn_supprimer, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		);
        
        jbtn_supprimer.setMinimumSize(new Dimension(180, 15));
        
        jpan_general.setLayout(new GridLayout(1, 2, 20, 20));
        jpan_general.add(jpan_competences);
        jpan_general.add(jpan_options);
        jpan_general.setBorder(new EmptyBorder(10, 20, 20, 20));
        

        this.setLayout(new BorderLayout(20, 20));
        this.add(jlab_titre, BorderLayout.NORTH);
        this.add(jpan_general, BorderLayout.CENTER);
        
      //Ecouteurs d'�v�nement
        jlist_competences.addListSelectionListener(new ListSelectionListener(){

			@Override
			public void valueChanged(ListSelectionEvent e) {
				jlist_competencesVelueChanged(e);
			}
        	
        });
        jbtn_supprimer.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent evt) {
				jbtn_supprimerActPerf(evt);
			}
        });

        
    }// </editor-fold>                        


    // Variables declaration - do not modify  
    private javax.swing.JLabel jlab_titre;
    private javax.swing.JPanel jpan_general;
    private javax.swing.JPanel jpan_options;
    private javax.swing.JPanel jpan_competences;
    
    private javax.swing.JLabel jlab_competences;
    private JList<Competence> jlist_competences;
    private javax.swing.JScrollPane jscroll_competences;
    
    private javax.swing.JLabel jlab_suprcpt;
    private javax.swing.JLabel jlab_domaine;
    private javax.swing.JLabel jlab_code;
    private javax.swing.JLabel jlab_libFR;
    private javax.swing.JLabel jlab_libGB;
    
    private javax.swing.JButton jbtn_supprimer;
    
    private final String competences_TEXTE = "Liste des comp�tences";
    private final String competence_TEXTE = "Comp�tence � supprimer : ";
    private final String libFR_TEXTE = "Libell� en Francais : ";
    private final String libGB_TEXTE = "Libell� en Anglais : ";
    private final String domaine_TEXTE = "Domaine : ";
    private final String code_TEXTE = "Code : ";
    private final String VIDE = "";
   
    private final String supprimer_TEXTE = "Supprimer";
    private final String TITRE = "Supprimer la comp�tence";
   
    // End of variables declaration 
    
	@Override
	
	public void reagir(ModifEvenement evt) {
		initCompetences();
    	jlist_competences.setListData(competences);
	}
	
	// Gestion des �v�nements
	// S�lection d'un �l�ment de la liste des competences
	public void jlist_competencesVelueChanged(ListSelectionEvent e){
		if (!e.getValueIsAdjusting() && jlist_competences.getSelectedValue() != null) {
			jlab_domaine.setText( domaine_TEXTE + jlist_competences.getSelectedValue().getDomaine());
			jlab_code.setText( code_TEXTE + jlist_competences.getSelectedValue().getCode());
			jlab_libFR.setText( libFR_TEXTE + jlist_competences.getSelectedValue().getLibFR());
			jlab_libGB.setText(libGB_TEXTE + jlist_competences.getSelectedValue().getLibGB());
			this.repaint();
		}
	}
	
	public void jbtn_supprimerActPerf(ActionEvent evt){
		jlab_domaine.setText( domaine_TEXTE );
		jlab_code.setText( code_TEXTE );
		jlab_libFR.setText( libFR_TEXTE );
		jlab_libGB.setText(libGB_TEXTE );
		supprimer(jlist_competences.getSelectedValue());
		this.repaint();
	}
                      
}

