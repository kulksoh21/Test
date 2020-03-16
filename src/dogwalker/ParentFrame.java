/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dogwalker;

import java.util.ArrayList;

/**
 *
 * @author Kulkarni
 */
public class ParentFrame extends javax.swing.JFrame {

    private ArrayList<javax.swing.JPanel> listOfPanels = new ArrayList<>();
    public ParentFrame() {
        initComponents();
        int width = this.getContentPane().getWidth();
        int height = this.getContentPane().getHeight();
        HomeScreen jpanel = new HomeScreen();
        LoggedInScreen jpanel2 = new LoggedInScreen();
        StatisticsScreen jpanel3 = new StatisticsScreen();
        this.add(jpanel);
        this.add(jpanel2);
        this.add(jpanel3);
        listOfPanels.add(jpanel);
        listOfPanels.add(jpanel2);
        listOfPanels.add(jpanel3);
        pack();
        jpanel.setLocation(0, 0);
        jpanel.setSize(width, height);
        jpanel2.setLocation(0, 0);
        jpanel2.setSize(width, height);
        jpanel3.setLocation(0, 0);
        jpanel3.setSize(width, height);
        showPanel(0);
    }

    public void showPanel(int panelNum)
    {
         for (int i = 0; i < this.listOfPanels.size(); i++)
        {
            javax.swing.JPanel currentPanel = this.listOfPanels.get(i);
            currentPanel.setVisible(false);
        }
        javax.swing.JPanel p = this.listOfPanels.get(panelNum);
        p.setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables


