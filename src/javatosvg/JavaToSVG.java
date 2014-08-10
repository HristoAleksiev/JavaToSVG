package javatosvg;

import javax.swing.*;
import java.io.*;
import java.lang.Exception;
import java.nio.file.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class JavaToSVG extends javax.swing.JFrame {
    
    public JavaToSVG() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chooseFile = new javax.swing.JFileChooser();
        loadFile = new javax.swing.JButton();
        init_HTML = new javax.swing.JButton();
        openInBrowser = new javax.swing.JButton();
        notifyPane = new javax.swing.JScrollPane();
        notify = new javax.swing.JTextArea();
        menuBar = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        examples = new javax.swing.JMenu();
        houseExample = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loadFile.setText("LoadFile");
        loadFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadFileActionPerformed(evt);
            }
        });

        init_HTML.setText("Initiallize with HTML");
        init_HTML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                init_HTMLActionPerformed(evt);
            }
        });

        openInBrowser.setText("Open in Browser");
        openInBrowser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openInBrowserActionPerformed(evt);
            }
        });

        notify.setColumns(20);
        notify.setRows(5);
        notifyPane.setViewportView(notify);

        file.setText("File");
        menuBar.add(file);

        examples.setText("Examples");

        houseExample.setText("House(example)");
        houseExample.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                houseExampleActionPerformed(evt);
            }
        });
        examples.add(houseExample);

        menuBar.add(examples);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(openInBrowser)
                .addGap(53, 53, 53))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(notifyPane)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(loadFile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(init_HTML)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(init_HTML)
                    .addComponent(loadFile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(notifyPane, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(openInBrowser)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadFileActionPerformed
        FileFilter fileFilter = new FileNameExtensionFilter("HTML File", "html");
        
        chooseFile.setCurrentDirectory(new File("C:\\GitRepos\\JavaToSVG\\Output"));
        
        chooseFile.setFileFilter(fileFilter);
        
        int returnVal = chooseFile.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = chooseFile.getSelectedFile();

            FileInputOutput.set_path(file.getAbsolutePath());

            notify.append("File loaded!\n");
    
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_loadFileActionPerformed

    private void init_HTMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_init_HTMLActionPerformed
        
        if (FileInputOutput.get_path_asString() != null) {
            Renderer renderer = new Renderer();
            renderer.buildSVG();
                notify.append("The file was initiallyzed correctly!\n");
        }
        else{
            notify.append("No file loaded!\n");
        }
         
    }//GEN-LAST:event_init_HTMLActionPerformed

    private void openInBrowserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openInBrowserActionPerformed
        try{
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler file://" + 
                    FileInputOutput.get_path_asString());
        }
        catch(IOException x){
            notify.append("Something went wrong with the execution!\n");
        }
            
            
            
    }//GEN-LAST:event_openInBrowserActionPerformed

    private void houseExampleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_houseExampleActionPerformed

        TestObjectDeclarations.comandProgram();
        notify.append("Example loaded!");
    }//GEN-LAST:event_houseExampleActionPerformed

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
            java.util.logging.Logger.getLogger(JavaToSVG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JavaToSVG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JavaToSVG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JavaToSVG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JavaToSVG().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser chooseFile;
    private javax.swing.JMenu examples;
    private javax.swing.JMenu file;
    private javax.swing.JMenuItem houseExample;
    private javax.swing.JButton init_HTML;
    private javax.swing.JButton loadFile;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JTextArea notify;
    private javax.swing.JScrollPane notifyPane;
    private javax.swing.JButton openInBrowser;
    // End of variables declaration//GEN-END:variables
}
