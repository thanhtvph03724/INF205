/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigmentdammay;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultListModel;


import javax.swing.JOptionPane;

/**
 *
 * @author Tu Anh
 */
public class BrandPanel extends javax.swing.JPanel {
Connection conn = null;
PreparedStatement pst = null;
ResultSet rs = null;



    /**
     * Creates new form BrandPanel
     */
    public BrandPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ListBrand = new javax.swing.JList<>();
        Refresh = new javax.swing.JButton();
        FindBrandName = new javax.swing.JTextField();
        SearchButton = new javax.swing.JButton();
        BrandName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        AddBrand = new javax.swing.JButton();
        UpdateBrand = new javax.swing.JButton();
        DeleteBrand = new javax.swing.JButton();

        ListBrand.setModel(new javax.swing.AbstractListModel<Brand>() {
            Brand[] strings = {new Brand("1","1"),new Brand("2","2") };
            public int getSize() { return strings.length; }
            public Brand getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(ListBrand);

        Refresh.setText("Refresh");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });

        FindBrandName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindBrandNameActionPerformed(evt);
            }
        });

        SearchButton.setText("Search");
        SearchButton.setActionCommand("Search");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        BrandName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrandNameActionPerformed(evt);
            }
        });

        jLabel1.setText("Tên thương hiêu");

        AddBrand.setText("Thêm");
        AddBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBrandActionPerformed(evt);
            }
        });

        UpdateBrand.setText("Sửa");
        UpdateBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBrandActionPerformed(evt);
            }
        });

        DeleteBrand.setText("Xóa");
        DeleteBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBrandActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(BrandName, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(UpdateBrand)
                                    .addComponent(AddBrand)
                                    .addComponent(DeleteBrand)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(Refresh)
                        .addGap(36, 36, 36)
                        .addComponent(FindBrandName, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SearchButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Refresh)
                    .addComponent(FindBrandName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BrandName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddBrand))
                        .addGap(35, 35, 35)
                        .addComponent(UpdateBrand)
                        .addGap(32, 32, 32)
                        .addComponent(DeleteBrand)))
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        // TODO add your handling code here:
       
         conn = MysqlConnect.connectDB();
            String sql = "SELECT * FROM brand WHERE Brand_Name =?";
            
            try{
                  String brandName = FindBrandName.getText();
             
                pst = conn.prepareStatement(sql);
                pst.setString(1,brandName);
               
             
                rs =  pst.executeQuery();
               while(rs.next()){
                  Brand br = new Brand(rs.getString("Brand_Id"),rs.getString("Brand_Name"));
                  dm.removeAllElements();
                add(br);
               }
            }catch(Exception e){
             System.out.println("Co loi xay ra "+e);}
       
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void AddBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBrandActionPerformed
        // TODO add your handling code here:
         conn = MysqlConnect.connectDB();
            String sql = "INSERT INTO brand (Brand_Name) VALUES (?)";
            try{
                pst = conn.prepareStatement(sql);
                pst.setString(1, BrandName.getText());
                int a =pst.executeUpdate();
                if(a>0){
                    JOptionPane.showMessageDialog(null, "Add Brand Success");
                      dm.removeAllElements();
                     addItemtoList();
                }else{
                JOptionPane.showMessageDialog(null, "Add Brand Failure");}
            }catch(Exception e){
              JOptionPane.showMessageDialog(null, "Co loi xay ra"+e);}
    }//GEN-LAST:event_AddBrandActionPerformed

    private void UpdateBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBrandActionPerformed
        // TODO add your handling code here:
         conn = MysqlConnect.connectDB();
            String sql = "UPDATE brand SET Brand_Name =? WHERE Brand_Id =?";
            try{
                pst = conn.prepareStatement(sql);
                pst.setString(1, BrandName.getText());
                Brand brand = ListBrand.getSelectedValue();
                pst.setString(2,brand.getId());
                int a =  pst.executeUpdate();
               if(a>0){
                                   JOptionPane.showMessageDialog(null, "Update Brand Success");
                                     dm.removeAllElements();
                                     addItemtoList();

               }else{
                                   JOptionPane.showMessageDialog(null, "Update Brand Failure");

               }
            }catch(Exception e){
             System.out.println("Co loi xay ra "+e);}
    }//GEN-LAST:event_UpdateBrandActionPerformed

    private void DeleteBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBrandActionPerformed
        // TODO add your handling code here:
        
         conn = MysqlConnect.connectDB();
            String sql = " DELETE FROM brand WHERE Brand_Id =?";
            try{
                pst = conn.prepareStatement(sql);
               
                Brand brand = ListBrand.getSelectedValue();
                pst.setString(1,brand.getId());
                int a =  pst.executeUpdate();
               if(a>0){
                                   JOptionPane.showMessageDialog(null, "Delete Brand Success");
                                     dm.removeAllElements();
                                      addItemtoList();

               }else{
                                   JOptionPane.showMessageDialog(null, "Delete Brand Failure");

               }
            }catch(Exception e){
             System.out.println("Co loi xay ra "+e);}
        
    }//GEN-LAST:event_DeleteBrandActionPerformed

    private void BrandNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrandNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BrandNameActionPerformed

    private void FindBrandNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindBrandNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FindBrandNameActionPerformed

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        // TODO add your handling code here:
         dm.removeAllElements();
        addItemtoList();
    }//GEN-LAST:event_RefreshActionPerformed
private void addItemtoList(){
 conn = MysqlConnect.connectDB();
            String sql = "SELECT * FROM brand";
            try{
                pst = conn.prepareStatement(sql);
               
                rs =  pst.executeQuery();
               while(rs.next()){
                  Brand br = new Brand(rs.getString("Brand_Id"),rs.getString("Brand_Name"));
                  add(br);
               }
            }catch(Exception e){
             System.out.println("Co loi xay ra "+e);}
}
 DefaultListModel<Brand> dm = new DefaultListModel();
private void add(Brand br){
    ListBrand.setModel(dm);
    
    dm.addElement(br);
    
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBrand;
    private javax.swing.JTextField BrandName;
    private javax.swing.JButton DeleteBrand;
    private javax.swing.JTextField FindBrandName;
    private javax.swing.JList<Brand> ListBrand;
    private javax.swing.JButton Refresh;
    private javax.swing.JButton SearchButton;
    private javax.swing.JButton UpdateBrand;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
