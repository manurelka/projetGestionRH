package vues;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;

import reader_writer.IHMPersonnelAccessor;
import ressources.Competence;
import ressources.ModifEvenement;
import ressources.Personne;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bertr
 */
public class ListePers extends PannelPersonnel {

    /**
     * Creates new form ListePers
     */
    public ListePers() {
    	competencescour = new Competence[1];
    	initPersonnes();
        initComponents();
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
    	this.setLayout(new BorderLayout());
    	
    	
    	
    	paneldroit = new JPanel();
    	panelgauche = new JPanel();
    	LabelListe_Pers = new javax.swing.JLabel("       Liste du personnel                                        ");
    	LabelListe_Comp = new javax.swing.JLabel("Liste des comp�tences de l'employ� s�lectionn�       ");
    	
    	this.add(paneldroit, BorderLayout.EAST);
        this.add(panelgauche, BorderLayout.WEST);
    	paneldroit.setLayout(new BorderLayout());
    	panelgauche.setLayout(new BorderLayout());
    	panelgauche.add(LabelListe_Pers, BorderLayout.NORTH);
    	paneldroit.add(LabelListe_Comp, BorderLayout.NORTH);
    	
    	
    	jScrollPane_Pers = new javax.swing.JScrollPane();
        jListPers = new javax.swing.JList<>();
        jScrollPane_Comp = new javax.swing.JScrollPane();
        jListComp = new javax.swing.JList<>();
        

        

        jListPers.setModel(new javax.swing.AbstractListModel<Personne>() {
            public int getSize() { return personnes.length; }
            public Personne getElementAt(int i) { return personnes[i]; }
        });
        jListPers.setListData(personnes);
        
        jScrollPane_Pers.setViewportView(jListPers);
        

        jListComp.setModel(new javax.swing.AbstractListModel<Competence>() {
        	
            public int getSize() { return competencescour.length; }
            public Competence getElementAt(int i) { return competencescour[i]; }
        });
       // jListComp.setListData(competences);
        
        jScrollPane_Comp.setViewportView(jListComp);

        panelgauche.add(jScrollPane_Pers, BorderLayout.CENTER);
        paneldroit.add(jScrollPane_Comp, BorderLayout.CENTER);

       /* javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LabelListe_Pers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jListPers, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane_Comp, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(LabelListe_Comp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelListe_Pers)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane_Pers, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelListe_Comp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane_Comp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))*/
   //     );
        jListPers.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
            	jListPersValueChanged(evt);
            }
        });
    
    }// </editor-fold>                        


    // Variables declaration - do not modify                     
    private javax.swing.JLabel LabelListe_Pers;
    private javax.swing.JLabel LabelListe_Comp;
    private javax.swing.JList<Personne> jListPers;
    private javax.swing.JList<Competence> jListComp;
    private javax.swing.JScrollPane jScrollPane_Pers;
    private javax.swing.JScrollPane jScrollPane_Comp;
    private JPanel paneldroit;
    private JPanel panelgauche;
    
    
    // End of variables declaration                   
	@Override
	public void reagir(ModifEvenement evt) {
		initPersonnes();
		jListPers.setListData(personnes);
		repaint();
	}
	private void jListPersValueChanged(ListSelectionEvent evt){
		
		if (!evt.getValueIsAdjusting() && jListPers.getSelectedValue() != null){
			persCourante = jListPers.getSelectedValue();
			competencescour = persCourante.getTabCompetences();
			jListComp.setListData(competencescour);
			
			repaint();
		}
	}
}
