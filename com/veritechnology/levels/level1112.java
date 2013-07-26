/*    */ package com.veritechnology.levels;
/*    */ 
/*    */ import com.veritechnology.engine.AddingElements;
/*    */ import com.veritechnology.engine.Constants;
/*    */ import com.veritechnology.engine.ImageLoader;
/*    */ import com.veritechnolohy.Screens.MainScreen;
/*    */ import com.veritechnolohy.elements.Ballon;
/*    */ import com.veritechnolohy.elements.Bazaza;
/*    */ import com.veritechnolohy.elements.Rubber;
/*    */ import com.veritechnolohy.elements.SEER;
/*    */ import com.veritechnolohy.elements.TOOB;
/*    */ import javax.microedition.lcdui.Graphics;
/*    */ import javax.microedition.lcdui.Image;
/*    */ 
/*    */ public class level1112 extends MainScreen
/*    */   implements Runnable
/*    */ {
/*    */   private Image levelBg;
/*    */   private Rubber rubber;
/*    */   private Bazaza bazaza;
/*    */   private Ballon ballon;
/*    */   private SEER seer;
/*    */   private TOOB toob;
/*    */ 
/*    */   public level1112()
/*    */   {
/* 33 */     super(12);
/* 34 */     this.bazaza = new Bazaza();
/* 35 */     this.toob = new TOOB();
/* 36 */     this.toob.setLocationx(10);
/* 37 */     this.toob.setLocationy(300);
/* 38 */     this.bazaza.setLocationx(190);
/* 39 */     this.bazaza.setLocationy(150);
/* 40 */     this.seer = new SEER(1);
/* 41 */     this.seer.setLocationx(200);
/* 42 */     this.seer.setLocationy(500);
/* 43 */     this.levelBg = ImageLoader.loadImage("levelsbg");
/* 44 */     this.rubber = new Rubber(45);
/* 45 */     this.rubber.setXYMovePowerFromRubber(100, 50);
/* 46 */     this.rubber.setLocationx(150);
/* 47 */     this.rubber.setLocationy(350);
/*    */ 
/* 50 */     this.ballon = new Ballon(0);
/* 51 */     this.ballon.setLocationx(100);
/* 52 */     addElement(this.seer);
/* 53 */     addElement(this.ballon);
/* 54 */     addElement(this.rubber);
/* 55 */     addElement(this.bazaza);
/* 56 */     addElement(this.toob);
/* 57 */     AddingElements.addingFirstSereer(180, 230, this);
/* 58 */     addPlayer();
/* 59 */     AddingElements.addingSereer(180, 230, this);
/*    */ 
/* 61 */     AddingElements.addingBAZaZElement(40, 300, this);
/* 62 */     AddingElements.addingBAZaZElement(200, 500, this);
/*    */ 
/* 65 */     new Thread(this).start();
/*    */   }
/*    */ 
/*    */   protected void pointerPressed(int x, int y)
/*    */   {
/* 70 */     super.pointerPressed(x, y);
/* 71 */     repaint();
/*    */   }
/*    */ 
/*    */   protected void pointerDragged(int x, int y) {
/* 75 */     super.pointerDragged(x, y);
/* 76 */     repaint();
/*    */   }
/*    */ 
/*    */   public void paint(Graphics g)
/*    */   {
/* 83 */     g.setColor(16777215);
/* 84 */     g.fillRect(0, 0, getWidth(), getHeight());
/* 85 */     g.drawImage(this.levelBg, 0, 0, 0);
/* 86 */     super.paint(g);
/*    */   }
/*    */ 
/*    */   public void run()
/*    */   {
/* 92 */     while (Constants.ISTHREADRUN)
/*    */       try
/*    */       {
/* 95 */         repaint();
/* 96 */         Thread.sleep(50L);
/*    */       }
/*    */       catch (InterruptedException ex)
/*    */       {
/* 101 */         ex.printStackTrace();
/*    */       }
/*    */   }
/*    */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veritechnology.levels.level1112
 * JD-Core Version:    0.6.2
 */