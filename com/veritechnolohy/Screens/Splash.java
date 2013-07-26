/*    */ package com.veritechnolohy.Screens;
/*    */ 
/*    */ import com.veritechnology.engine.ImageLoader;
/*    */ import com.veritechnology.engine.SoundLoader;
/*    */ import com.veritechnology.engine.releaseObject;
/*    */ import com.veritechnolohy.main.JungleBoy;
/*    */ import javax.microedition.lcdui.Canvas;
/*    */ import javax.microedition.lcdui.Display;
/*    */ import javax.microedition.lcdui.Graphics;
/*    */ import javax.microedition.lcdui.Image;
/*    */ 
/*    */ public class Splash extends Canvas
/*    */   implements Runnable, releaseObject
/*    */ {
/*    */   private Image splashScreen;
/*    */   private Image logo_screen;
/* 26 */   private boolean loadLogo = true;
/*    */ 
/*    */   public Splash()
/*    */   {
/* 30 */     setFullScreenMode(true);
/* 31 */     this.logo_screen = ImageLoader.loadImage("logo");
/* 32 */     this.splashScreen = ImageLoader.loadImage("splash");
/*    */ 
/* 34 */     new Thread(this).start();
/*    */   }
/*    */ 
/*    */   public void paint(Graphics g)
/*    */   {
/* 40 */     if (getHeight() <= getWidth())
/*    */     {
/* 42 */       g.drawImage(ImageLoader.getPortraitImage(), 0, 0, 0);
/*    */     }
/* 45 */     else if ((this.splashScreen != null) && (!this.loadLogo)) {
/* 46 */       g.drawImage(this.splashScreen, 0, 0, 0);
/*    */     }
/*    */     else
/* 49 */       g.drawImage(this.logo_screen, 0, 0, 0);
/*    */   }
/*    */ 
/*    */   public void run()
/*    */   {
/*    */     try
/*    */     {
/* 58 */       SoundLoader.loadsounds();
/* 59 */       Thread.sleep(2500L);
/* 60 */       this.loadLogo = false;
/* 61 */       Thread.sleep(1L);
/* 62 */       repaint();
/* 63 */       Thread.sleep(2500L);
/* 64 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new PlayOrOption(0));
/*    */ 
/* 66 */       freeElement();
/*    */     }
/*    */     catch (InterruptedException ex)
/*    */     {
/* 70 */       ex.printStackTrace();
/*    */     }
/*    */   }
/*    */ 
/*    */   public void freeElement()
/*    */   {
/* 77 */     this.splashScreen = null;
/* 78 */     System.gc();
/*    */   }
/*    */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veritechnolohy.Screens.Splash
 * JD-Core Version:    0.6.2
 */