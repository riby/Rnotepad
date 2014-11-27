package notepad;

//package notepad2;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the Main.
 */

/**
 *
 * @author riby
 */
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ActionPerform
{
   int value;
   int option;
   String content = null;
   String name = null;
   String word;
   String str;
   public FontClass font = new FontClass();
   public Notepad nd;
   
   public ActionPerform(Notepad nd)
   {this.nd=nd;}
    
   
   
   
   /* Implementation of the fontFile() method. */
    public void fontFile()
    {
      /* Shows the Font dialog box. */
      font.setVisible(true);
      font.pack();
      /* Calls the getOk() method of FontClass. */
      font.getOk().addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent ae)
         {
            /*
            Sets the font name, size, and style of the file text.
            */
            nd.jTextArea1.setFont(font.font());
            font.label.setFont(new Font("Arial",Font.PLAIN,15));
            font.setVisible(false);
         }
      });
      /* Calls the getCancel() method of FontClass. */
      font.getCancel().addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent ae)
         {
            /* Hides the Font dialog box. */
            font.label.setFont(new Font("Arial",Font.PLAIN,15));
            font.setVisible(false);
         }
      });
    }}
   