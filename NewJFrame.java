/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f1;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import javax.swing.JFileChooser;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 *
 * @author cj
 */
public class NewJFrame extends javax.swing.JFrame {
int score=500;
StringBuilder history = new StringBuilder();
String[] figure = {"kiwi.jpg", "appleRed.jpg", "appleGreen.jpg", "banana.jpg", "Taxi.jpg", "busYellow.jpg", "busRed.jpg", "truck.jpg", "1.jpg", "2.jpg", "3.jpg", "asterisk.jpg", "dollar.jpg"};
    /**
     * Creates new form NewJFrame
     * @throws java.lang.Exception
     */
     public File getfile() throws Exception
       {                                          //Dialog Box for saving and loading files
         JFileChooser chooser = new JFileChooser();
         File f = new File(new File("filename.dat").getCanonicalPath());
         chooser.setSelectedFile(f);
         chooser.showOpenDialog(null);
         File curFile = chooser.getSelectedFile();
         System.out.println(chooser.getSelectedFile());
         return curFile;
       }
    public NewJFrame() throws IOException {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    private void initComponents() throws IOException {
        String path = "src/f1/images/1.jpg";
        File file = new File(path);
        BufferedImage image = ImageIO.read(file);
        jLabel1 = new javax.swing.JLabel(new ImageIcon(image));//JLabel label = new JLabel(new ImageIcon(image));
        jLabel2 = new javax.swing.JLabel(new ImageIcon(image));
        jLabel3 = new javax.swing.JLabel(new ImageIcon(image));
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(73, 55, 38));

        //jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel1.setPreferredSize(new java.awt.Dimension(100, 100));

        //jLabel2.setText("jLabel2");
        jLabel2.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel2.setPreferredSize(new java.awt.Dimension(100, 100));

        //jLabel3.setText("jLabel3");
        jLabel3.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel3.setPreferredSize(new java.awt.Dimension(100, 100));

        jButton1.setText("SPIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButton1ActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        jLabel4.setText("Your Wallet Currently Contains:"+ score+" Press spin to bet Another 100");
        jLabel4.setPreferredSize(new java.awt.Dimension(220, 500));
        jLabel5.setText("Have A Cheat? Enter Here:");

        jTextField1.setText("CODE!");     //jTextField1.getText();
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel6.setText("RESULT");

        jButton2.setText("NEW");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("LOAD");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButton3ActionPerformed(evt);
                } catch (Exception ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        jButton4.setText("SAVE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButton4ActionPerformed(evt);
                } catch (Exception ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        jButton5.setText("HISTORY");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("QUIT");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                 System.exit(0);
              ;
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jButton2)
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)//, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(jButton3)
                                    .addGap(65, 65, 65)
                                    .addComponent(jButton4)
                                    .addGap(46, 46, 46)
                                    .addComponent(jButton5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton6))
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
      String ch=jTextField1.getText();
      go g1=new go();
      history.append("Score =" +score);
      history.append(System.getProperty("line.separator"));
      calculate c1= new calculate();
      int[] x= g1.go(ch);
      jLabel1.setIcon(new ImageIcon("src/f1/images/"+figure[x[0]]));    //Load the Images after SPIN
      jLabel2.setIcon(new ImageIcon("src/f1/images/"+figure[x[1]]));
      jLabel3.setIcon(new ImageIcon("src/f1/images/"+figure[x[2]])); 
      int p=c1.calc(x);
      score= score+p-100;
      jLabel4.setText("Your Wallet Now Contains:"+ score+"\n Press spin to bet Another 100");
      String temp = new String("SPINNED! RESULT: You won "+ p);
      jLabel6.setText(temp);
      history.append(System.getProperty("line.separator"));
      history.append("Score = \n" +score);
      this.setVisible(false);
      this.setVisible(true);
    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
      score=500;
      this.setVisible(false);
      this.setVisible(true);
      history=new StringBuilder("");
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
      //File file = new File(getfile());
      File file = getfile();
      BufferedReader br = new BufferedReader(new FileReader(file));
      String lastLine = "500";
      String sCurrentLine;
      while ((sCurrentLine = br.readLine()) != null) 
      {
          System.out.println(sCurrentLine);
          lastLine = sCurrentLine;
      }
      score = Integer.parseInt(lastLine);
      
      this.setVisible(false);
      this.setVisible(true);
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
      //BufferedReader br = new BufferedReader(new FileReader(getfile()));
      try {
                         File file = getfile();
			
                         // if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
      
			FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
			BufferedWriter bw = new BufferedWriter(fw);
                        
			bw.write( history.toString() );
			bw.close();

			System.out.println("Done");

		} catch (IOException e) {
			e.printStackTrace();
		}
      
      this.setVisible(false);
      this.setVisible(true);
    }


    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
      JFrame frame = new JFrame ("MyPanel");
      frame.setSize(500, 500);
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      JLabel jLabelx = new javax.swing.JLabel();
      jLabelx.setText(history.toString());
      frame.add(jLabelx);
      frame.setVisible (true);

    }

  
    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration
}
