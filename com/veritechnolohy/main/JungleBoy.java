/*    */ package com.veritechnolohy.main;
/*    */ 
/*    */ import com.veritechnology.engine.LevelsStars;
/*    */ import com.veritechnology.engine.SoundLoader;
/*    */ import com.veritechnolohy.Screens.Splash;
/*    */ import javax.microedition.lcdui.Display;
/*    */ import javax.microedition.midlet.MIDlet;
/*    */ 
/*    */ public class JungleBoy extends MIDlet
/*    */ {
/*    */   static MIDlet babyMidlet;
/*    */   Splash splash;
/*    */ 
/*    */   public static MIDlet getBabyMidlet()
/*    */   {
/* 23 */     return babyMidlet;
/*    */   }
/*    */ 
/*    */   public void startApp()
/*    */   {
/* 28 */     babyMidlet = this;
/*    */ 
/* 30 */     LevelsStars.loadLevels();
/* 31 */     Display.getDisplay(this).setCurrent(new Splash());
/*    */   }
/*    */ 
/*    */   public void pauseApp()
/*    */   {
/* 40 */     SoundLoader.stopMainPlayer();
/*    */   }
/*    */ 
/*    */   public void destroyApp(boolean unconditional)
/*    */   {
/* 46 */     LevelsStars.storeLevels();
/*    */   }
/*    */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veritechnolohy.main.JungleBoy
 * JD-Core Version:    0.6.2
 */