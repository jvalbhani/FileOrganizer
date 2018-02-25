package fileorganizer;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;
import javax.swing.JFileChooser;

public class FileOrgMain extends javax.swing.JFrame {

    public FileOrgMain() {
        initComponents(); 
        waitMessage.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        errDialog = new javax.swing.JDialog();
        err_ok = new javax.swing.JButton();
        err_message = new javax.swing.JLabel();
        TitleLabel = new javax.swing.JLabel();
        Organize = new javax.swing.JButton();
        FolderPathReader = new javax.swing.JTextField();
        ScrollFile = new javax.swing.JScrollPane();
        BigFileViewer = new javax.swing.JList<>();
        BrowserButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        LargeFileViewerButton = new javax.swing.JButton();
        waitMessage = new javax.swing.JLabel();

        errDialog.setTitle("Incorect path");
        errDialog.setBounds(new java.awt.Rectangle(150, 150, 200, 150));

        err_ok.setBackground(new java.awt.Color(153, 255, 204));
        err_ok.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        err_ok.setText("OK");
        err_ok.setBorderPainted(false);
        err_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                err_okActionPerformed(evt);
            }
        });

        err_message.setBackground(new java.awt.Color(153, 255, 153));
        err_message.setText("Please enter a valid path");

        javax.swing.GroupLayout errDialogLayout = new javax.swing.GroupLayout(errDialog.getContentPane());
        errDialog.getContentPane().setLayout(errDialogLayout);
        errDialogLayout.setHorizontalGroup(
            errDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(errDialogLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(errDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(err_message)
                    .addComponent(err_ok))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        errDialogLayout.setVerticalGroup(
            errDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, errDialogLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(err_message, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(err_ok)
                .addContainerGap())
        );

        errDialog.getAccessibleContext().setAccessibleParent(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TitleLabel.setText("File Organizer");

        Organize.setText("Organize");
        Organize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrganizeActionPerformed(evt);
            }
        });

        FolderPathReader.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                FolderPathReaderFocusLost(evt);
            }
        });
        FolderPathReader.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FolderPathReaderActionPerformed(evt);
            }
        });
        FolderPathReader.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FolderPathReaderKeyReleased(evt);
            }
        });

        BigFileViewer.setVisibleRowCount(10);
        ScrollFile.setViewportView(BigFileViewer);

        BrowserButton.setText("Browse");
        BrowserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowserButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Enter file Path");

        LargeFileViewerButton.setText("View large files");
        LargeFileViewerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LargeFileViewerButtonActionPerformed(evt);
            }
        });

        waitMessage.setText("Please wait while the files are loading........");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScrollFile)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FolderPathReader, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BrowserButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TitleLabel)
                                    .addComponent(Organize, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                    .addComponent(LargeFileViewerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(waitMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FolderPathReader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BrowserButton)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Organize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(LargeFileViewerButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(waitMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ScrollFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    
    //This method organizes the files of selected folder
    /*
    the method creates a documents folder inside the selected folder and in these 
    folders the seperate folder are creted according to their extensions except the shortcut's 
    */
    
    private void OrganizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrganizeActionPerformed
        File directory=new File(FolderPathReader.getText());
        if(!directory.isDirectory())
        {
            err_message.setText("Please enter valid file path");
            errDialog.setVisible(true);
        }
        else{
            File[] listFiles = directory.listFiles();        
            for (File listFile : listFiles) 
            {
                String extension[]=listFile.getName().split("\\.");
                if(!extension[extension.length-1].equalsIgnoreCase("lnk") && !extension[extension.length-1].equalsIgnoreCase("app") && !extension[extension.length-1].equalsIgnoreCase("desktop") && !listFile.isDirectory())
                {
                    try {
                        if(!(new File(listFile.getParentFile()+"/Documents/"+extension[extension.length-1].toUpperCase()).exists()))
                            new File(listFile.getParentFile()+"/Documents/"+extension[extension.length-1].toUpperCase()).mkdirs();
                        Files.move(Paths.get(listFile.getPath()),Paths.get(listFile.getParentFile()+"/Documents/"+extension[extension.length-1].toUpperCase()+"/"+listFile.getName()),StandardCopyOption.REPLACE_EXISTING);
                    } catch (IOException ex) {
                        err_message.setText("Some error occured : contact system admin");
                        errDialog.setVisible(true);
                    }
                } 
            }
            err_message.setText("Done");
            errDialog.setVisible(true);
        }
    }//GEN-LAST:event_OrganizeActionPerformed

    private void FolderPathReaderKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FolderPathReaderKeyReleased

    }//GEN-LAST:event_FolderPathReaderKeyReleased

    private void FolderPathReaderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FolderPathReaderActionPerformed
    }//GEN-LAST:event_FolderPathReaderActionPerformed

    private void FolderPathReaderFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FolderPathReaderFocusLost

    }//GEN-LAST:event_FolderPathReaderFocusLost

    //This method helps user to choose the directory in ui form
    private void BrowserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowserButtonActionPerformed

    JFileChooser chooser = new JFileChooser(); 
    chooser.setCurrentDirectory(new java.io.File("."));
    chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    chooser.setAcceptAllFileFilterUsed(false);
    if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) { 
        FolderPathReader.setText(chooser.getSelectedFile().toString());
      }
    }//GEN-LAST:event_BrowserButtonActionPerformed

    //This method is of err_meassage box which terminates the box clicking ok button
    private void err_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_err_okActionPerformed
        errDialog.setVisible(false);
    }//GEN-LAST:event_err_okActionPerformed
    
    
    //This method traverse the file directory from root using deapth first search algorithm
    private void LargeFileViewerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LargeFileViewerButtonActionPerformed
       
        waitMessage.setVisible(true);   
        
        TreeMap<Long,File> BigFiles=new TreeMap<>();        //Stores the Big 10 files in a sorted order according to fileSize
        Queue<File> DirectoryQ=new LinkedList<>();          // Stores all the directories which are yet to be traversed 
        File DirFiles[]=File.listRoots();                   //This static function returns us the all root directories
        
        for(File f: DirFiles)
        {
            if(f.canRead())
            {
                System.out.println(f.getPath());
                DirectoryQ.add(f);            
            }
        }

        //The below loop traverse and checks each file and compares the file with the least big file
        // P.S : this helps us from comparing all the big files
        
        while(!DirectoryQ.isEmpty())
        {
            File CurrFile[] = (DirectoryQ.remove()).listFiles();
            if(CurrFile!=null)
            {
                for(File file : CurrFile)
                {
                    if(!file.canRead())
                        System.out.println(file.getPath());
                    else if(file.isDirectory())
                        DirectoryQ.add(file);
                    else if(BigFiles.size()<10 || file.length()>BigFiles.firstKey())
                    {
                        BigFiles.put(file.length(),file);
                        if(BigFiles.size()>10)
                            BigFiles.remove(BigFiles.firstKey());
                    }  
                }
            }        
        }
               
        //Just printing those 10 big files 
        //eg : (<size>MB)<FileName>
        
        String arr[]=new String[10];
        for(int i=9;i>=0;i--)
        {
            arr[i]=new StringBuilder("(").append((float)BigFiles.firstKey()/(1024*1024)).append(" MB )\t").append(BigFiles.remove(BigFiles.firstKey()).getName()).toString();
        }
        BigFileViewer.setListData(arr);
        waitMessage.setVisible(false);
        System.out.println("----------------Done-------------------");
    }//GEN-LAST:event_LargeFileViewerButtonActionPerformed


    //The main method
    public static void main(String args[]) {       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FileOrgMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new FileOrgMain().setVisible(true);
        });        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> BigFileViewer;
    private javax.swing.JButton BrowserButton;
    javax.swing.JTextField FolderPathReader;
    private javax.swing.JButton LargeFileViewerButton;
    private javax.swing.JButton Organize;
    private javax.swing.JScrollPane ScrollFile;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JDialog errDialog;
    private javax.swing.JLabel err_message;
    private javax.swing.JButton err_ok;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel waitMessage;
    // End of variables declaration//GEN-END:variables
}
