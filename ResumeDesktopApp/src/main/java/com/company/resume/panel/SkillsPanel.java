
package com.company.resume.panel;

import com.company.resume.config.Config;
import dao.inter.SkillDaoInter;
import dao.inter.UserSkillDaoInter;
import entity.Skill;
import entity.User;
import entity.UserSkill;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import main.Context;

public class SkillsPanel extends javax.swing.JPanel {
 private SkillDaoInter skillDao=Context.instanceSkillDao();
 private UserSkillDaoInter userskillDao=Context.instanceUserSkillDao();
    public SkillsPanel() {
        initComponents(); }
 public void fillSkillComponents(){
     fillWindow();
 }
  private List<UserSkill>list;
  
 private void fillTable(){
     User user= Config.loggedInUser;
     System.out.println("user="+user);
     int id=user.getId();
     list=userskillDao.getAllSkillByUserId(Config.loggedInUser.getId());
     Vector<Vector>rows= new Vector<>();//vector icinde vector yaradiriq, balaca vector rowdur, boyuyu rows
     for(UserSkill us:list){//1 ve 2ci setir birlikde yeniki hamsi birlikde olur rows
         Vector<Object>row= new Vector<>();//amma her setir ayriliqda rows vectorudur ve 1ci elementi skill, digeri ise powerdur
         row.add(us.getSkill());//for each ile user skillin skill ve power elementlerini ayirdi ve add etdi vectora
         row.add(us.getPower());
         rows.add(row);
     }
     Vector<String>columns=new Vector<>();
     columns.add("Skill");
      columns.add("Power");
     DefaultTableModel model= new DefaultTableModel(rows,columns);
      tblSkills.setModel(model);
 }
 private void fillWindow(){
     List<Skill>skills=skillDao.getAllSkill();
     for(Skill s:skills){
         cbSkill.addItem(s);
         fillTable();
     }
 }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblSkills = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lblSkills = new javax.swing.JLabel();
        txtSkillName = new javax.swing.JTextField();
        lblPower = new javax.swing.JLabel();
        sliderPower = new javax.swing.JSlider();
        cbSkill = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        tblSkills.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblSkills.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblSkillsPropertyChange(evt);
            }
        });
        jScrollPane2.setViewportView(tblSkills);

        lblSkills.setText("skill:");

        txtSkillName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSkillNameActionPerformed(evt);
            }
        });

        lblPower.setText("power");

        sliderPower.setMaximum(10);
        sliderPower.setMinimum(1);
        sliderPower.setPaintLabels(true);
        sliderPower.setPaintTicks(true);
        sliderPower.setValue(1);

        btnAdd.setText("add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setText("delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAdd)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblSkills, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(cbSkill, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtSkillName, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPower, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sliderPower, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnDelete)
                        .addGap(44, 44, 44)
                        .addComponent(btnSave)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSkills, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSkillName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbSkill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPower)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(sliderPower, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdd)
                            .addComponent(btnDelete)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSave)))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSkillNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSkillNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSkillNameActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int index=tblSkills.getSelectedRow();//0cidan bashlayacaq
        UserSkill userSkill =list.get(index);
        userskillDao.removeUserSkill(userSkill.getId());
        fillWindow();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
       String skillName=txtSkillName.getText();//bu xana bosh deyilse demeli nese add etmek isteyirik
       Skill skill=null;
       if(skillName!=null&& !skillName.trim().isEmpty()){
           skill=new Skill(0, skillName);//yeni skill yaranir id-si set olunmur ama
          skillDao.insertSkill(skill);//burda ise bazaya gedenden sonra id ozu yaranir navicatda
        }else{
           skill= (Skill)cbSkill.getSelectedItem();//comboboxla secdiyin skill ve power-i add edecek ashagi
       }
        
       int power=sliderPower.getValue();
       UserSkill userSkill=new UserSkill(null, Config.loggedInUser, skill, power);//burda yazdigimi add edirem user skill objectine
       userskillDao.insertUserSkill(userSkill);//o object vasitesile de bazaya navicata gedir
       fillWindow();
    }//GEN-LAST:event_btnAddActionPerformed

    private void tblSkillsPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblSkillsPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblSkillsPropertyChange

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        UserSkill selectedUserSkill=list.get(tblSkills.getSelectedRow());//yaddashda olan(add olan) her hansisa skilli basirsan(ashgida olanlardan)
        String skillName=txtSkillName.getText();//sonra ya comboboxdan secilir birsheyler yada elnen yazirsan
       Skill skill=null;
       if(skillName!=null&& !skillName.trim().isEmpty()){
           skill=new Skill(0, skillName);
          skillDao.insertSkill(skill);
        }else{
           skill= (Skill)cbSkill.getSelectedItem();
       }int power=sliderPower.getValue();
       
        selectedUserSkill.setPower(power);//secilen(yaddashda olan)skill-in yerine yeni secdiyin (comboboxdan) veya elave etdiyin skill evez olunur
        selectedUserSkill.setSkill(skill);//skillin adi ve power her ikisi deyishir olur sen secdiyin
        userskillDao.updateUserSkill(selectedUserSkill);//update gedir bazaya
        fillWindow();//ve table-e dolur
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<Skill> cbSkill;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblPower;
    private javax.swing.JLabel lblSkills;
    private javax.swing.JSlider sliderPower;
    private javax.swing.JTable tblSkills;
    private javax.swing.JTextField txtSkillName;
    // End of variables declaration//GEN-END:variables
}
