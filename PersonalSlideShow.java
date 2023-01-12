// GraphicsLab09st.java
// This is the student, starting file for Graphics Lab 08.
// This file is identical to Java1520.java.
// This slide show is about Mr. Leon Schram.
// Each student needs to alter this presentation,
// add pictures, add pages, add graphics and make it about him/herself.


import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;


public class PersonalSlideShow extends JPanel implements MouseListener
{

   private int numClicks;
   private Image picture1, picture2, picture3, picture4, picture5, picture6, picture7;
 

   public PersonalSlideShow()
   {
      numClicks = 0;
      addMouseListener(this);
      try {
         picture1 = ImageIO.read(getClass().getResource("My Face2.jpeg"));
         picture2 = ImageIO.read(getClass().getResource("Dulles HS.jpg"));
         picture3 = ImageIO.read(getClass().getResource("Indian Flag.jpg"));
         picture4 = ImageIO.read(getClass().getResource("family picture.jpg"));
         picture5 = ImageIO.read(getClass().getResource("9 grade.jpg"));
         picture6 = ImageIO.read(getClass().getResource("soccer.jpg"));
         picture7 = ImageIO.read(getClass().getResource("house.jpg"));
      } catch (IOException ex) {
         System.err.println("Could not load image");
      }
   }

   public void paint(Graphics g)
   {
      Expo.setBackground(g, Expo.white);
      switch (numClicks)
      {
         case 0 : page1(g); 
            break;
         case 1 : page2(g); 
            break;
         case 2 : page3(g); 
            break;
         case 3 : page4(g); 
            break;
         case 4 : page5(g); 
            break;
         case 5 : page6(g); 
            break;
         case 6 : page7(g); 
            break;
         case 7 : page8(g); 
            break;

      }
   }

   public void mouseExited(MouseEvent e){}
   public void mouseEntered(MouseEvent e){}
   public void mouseReleased(MouseEvent e){}
   public void mouseClicked(MouseEvent e)	{}
   
   
   public void mousePressed(MouseEvent e)
   {
      numClicks++;
      repaint();
   }

   public void page1(Graphics g)
   {
      Expo.setFont(g,"Algerian",Font.BOLD,100);
      Expo.drawString(g,"TITLE PAGE",218,100);
      Expo.setColor(g,Expo.blue);
      Expo.fillPolygon(g,550,300,550,550,300,550,300,300);
      Expo.setColor(g,Expo.gray);
      Expo.fillPolygon(g,550,300,425,550,300,300);
      Expo.setColor(g,Expo.red);
      g.drawImage(picture1,315,325,200,200,this);
      Expo.setFont(g,"Impact",Font.PLAIN,25);
      Expo.drawString(g,"My name is Hitansh Mendiratta.",50,280);
      Expo.setFont(g,"Times Roman",Font.PLAIN,19);
      Expo.drawString(g,"Click once to continue.",700,550);
   }

   public void page2(Graphics g)
   {
      Expo.setFont(g,"Impact",Font.BOLD,100);
      Expo.drawString(g,"PAGE 2",200,100);
      Expo.setColor(g,Expo.orange);
      Expo.fillPolygon(g,280,220,340,460,534,490,630,460,680,250);
      Expo.setColor(g,Expo.chartreuse);
      g.drawImage(picture3,380,250,250,250,this);
      Expo.setColor(g,Expo.green);
      Expo.setFont(g,"Algerian",Font.PLAIN,25);
      Expo.drawString(g,"I was born in India in 2006",100,200);
      Expo.setColor(g,Expo.red);
      Expo.setFont(g,"Times Roman",Font.PLAIN,19);
      Expo.drawString(g,"Click once to continue.",750,550);
   }

   public void page3(Graphics g)
   {
      Expo.setFont(g,"Algerian",Font.BOLD,100);
      Expo.drawString(g,"PAGE 3",200,100);
      Expo.setColor(g,Expo.magenta);
      Expo.fillCircle(g,500,300,200);
      g.drawImage(picture2,400,193,250,250,this);
      Expo.setFont(g,"Impact",Font.PLAIN,25);
      Expo.setColor(g,Expo.blue);
      Expo.drawString(g,"I go Dulles high school",100,150);
      Expo.setFont(g,"Times Roman",Font.PLAIN,19);
      Expo.drawString(g,"Click once to continue.",750,550);
   }
   public void page4(Graphics g)
   {
      Expo.setFont(g,"Impact",Font.BOLD,100);
      Expo.setColor(g,Expo.yellow);
      Expo.drawString(g,"PAGE 4",200,100);
      Expo.setColor(g,Expo.red);
      Expo.fillStar(g,500,390,255,5);
      Expo.setColor(g,Expo.chartreuse);
      g.drawImage(picture4,350,280,330,250,this);
      Expo.setColor(g,Expo.green);
      Expo.setFont(g,"Algerian",Font.PLAIN,25);
      Expo.drawString(g,"My famly includes my mom, my dad, my brother and me",100,200);
      Expo.setColor(g,Expo.red);
      Expo.setFont(g,"Times Roman",Font.PLAIN,19);
      Expo.drawString(g,"Click once to continue.",750,550);
   }
   public void page5(Graphics g)
   {
      Expo.setFont(g,"Algerian",Font.BOLD,100);
      Expo.drawString(g,"PAGE 5",200,100);
      Expo.setColor(g,Expo.green);
      Expo.drawThickStar(g,510,350,225,8,25);
      g.drawImage(picture5,270,193,450,250,this);
      Expo.setFont(g,"Impact",Font.PLAIN,25);
      Expo.setColor(g,Expo.gray);
      Expo.drawString(g,"I am a 9th grader (freshman)",100,150);
      Expo.setFont(g,"Times Roman",Font.PLAIN,19);
      Expo.setColor(g,Expo.red);
      Expo.drawString(g,"Click once to continue.",750,550);
   }
   public void page6(Graphics g)
   {
      Expo.setFont(g,"Impact",Font.BOLD,100);
      Expo.setColor(g,Expo.orange);
      Expo.drawString(g,"PAGE 6",200,100);
      Expo.setColor(g,Expo.red);
      Expo.fillRoundedRectangle(g,460,170,960,515,50);
      Expo.setColor(g,Expo.cyan);
      g.drawImage(picture6,550,220,330,250,this);
      Expo.setColor(g,Expo.orange);
      Expo.setFont(g,"Algerian",Font.PLAIN,25);
      Expo.drawString(g,"I like to play soccer",100,200);
      Expo.setColor(g,Expo.red);
      Expo.setFont(g,"Times Roman",Font.PLAIN,19);
      Expo.drawString(g,"Click once to continue.",750,550);
   }

   public void page7(Graphics g)
   {
      Expo.setFont(g,"Algerian",Font.BOLD,100);
      Expo.drawString(g,"PAGE 7",200,100);
      Expo.setColor(g,Expo.lightGray);
      Expo.fillTriangle(g,200,600,700,70,600,600);
      g.drawImage(picture7,350,193,450,250,this);
      Expo.setFont(g,"Impact",Font.PLAIN,25);
      Expo.setColor(g,Expo.pink);
      Expo.drawString(g,"I live in stafford",100,150);
      Expo.setFont(g,"Times Roman",Font.PLAIN,19);
      Expo.setColor(g,Expo.red);
      Expo.drawString(g,"Click once to continue.",750,550);
   }
   public void page8(Graphics g)
   {
      Expo.setFont(g,"Algerian",Font.BOLD,100);
      Expo.drawString(g,"Citations",200,100);
      Expo.setColor(g,Expo.green);
      Expo.fillRectangle(g,460,170,960,515);
      Expo.setFont(g,"Impact",Font.PLAIN,25);
      Expo.setColor(g,Expo.pink);
      Expo.drawString(g,"https://www.pexels.com/photo/teacher-asking-a-question-to-the-class-5212345/",100,150);
      Expo.drawString(g,"https://www.pexels.com/photo/photo-of-person-wearing-neon-green-socks-3621104/",100,170);
      Expo.drawString(g,"https://unsplash.com/photos/9Dt4WutvwDs",100,190);
      Expo.drawString(g,"https://www.fortbendisd.com/dhs#",100,210);
      Expo.drawString(g,"https://unsplash.com/photos/1ddol8rgUH8",100,230);
      Expo.drawString(g,"https://www.pexels.com/photo/family-of-four-walking-at-the-street-2253879/",100,250);
      Expo.setFont(g,"Times Roman",Font.PLAIN,19);
      Expo.setColor(g,Expo.red);
      Expo.drawString(g,"End.",750,550);
   }

}