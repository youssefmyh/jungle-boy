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
/*    */ import javax.microedition.lcdui.Graphics;
/*    */ import javax.microedition.lcdui.Image;
/*    */ 
/*    */ public class level111 extends MainScreen
/*    */   implements Runnable
/*    */ {
/*    */   private Image levelBg;
/*    */   private Rubber rubber;
/*    */   private Bazaza bazaza;
/*    */   private Ballon ballon;
/*    */   private SEER seer;
/*    */ 
/*    */   public level111()
/*    */   {
/* 31 */     super(11);
/* 32 */     this.bazaza = new Bazaza();
/* 33 */     this.bazaza.setLocationx(100);
/* 34 */     this.bazaza.setLocationy(200);
/* 35 */     this.seer = new SEER(1);
/* 36 */     this.seer.setLocationx(100);
/* 37 */     this.seer.setLocationy(350);
/* 38 */     this.levelBg = ImageLoader.loadImage("levelsbg");
/* 39 */     this.rubber = new Rubber(-45);
/* 40 */     this.rubber.setXYMovePowerFromRubber(100, 50);
/* 41 */     this.ballon = new Ballon(0);
/* 42 */     this.ballon.setLocationx(250);
/* 43 */     this.ballon.setLocationy(300);
/* 44 */     addElement(this.seer);
/* 45 */     addElement(this.ballon);
/* 46 */     addElement(this.rubber);
/* 47 */     addElement(this.bazaza);
/*    */ 
/* 49 */     AddingElements.addingFirstSereer(213, 197, this);
/* 50 */     addPlayer();
/*    */ 
/* 52 */     AddingElements.addingSereer(213, 197, this);
/* 53 */     AddingElements.addingBAZaZElement(100, 300, this);
/* 54 */     AddingElements.addingBAZaZElement(200, 400, this);
/*    */ 
/* 57 */     new Thread(this).start();
/*    */   }
/*    */ 
/*    */   protected void pointerPressed(int x, int y)
/*    */   {
/* 62 */     super.pointerPressed(x, y);
/* 63 */     repaint();
/*    */   }
/*    */ 
/*    */   protected void pointerDragged(int x, int y) {
/* 67 */     super.pointerDragged(x, y);
/* 68 */     repaint();
/*    */   }
/*    */ 
/*    */   public void paint(Graphics g)
/*    */   {
/* 75 */     g.setColor(16777215);
/* 76 */     g.fillRect(0, 0, getWidth(), getHeight());
/* 77 */     g.drawImage(this.levelBg, 0, 0, 0);
/* 78 */     super.paint(g);
/*    */   }
/*    */ 
/*    */   public void run()
/*    */   {
/* 84 */     while (Constants.ISTHREADRUN)
/*    */       try
/*    */       {
/* 87 */         repaint();
/* 88 */         Thread.sleep(50L);
/*    */       }
/*    */       catch (InterruptedException ex)
/*    */       {
/* 93 */         ex.printStackTrace();
/*    */       }
/*    */   }
/*    */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veritechnology.levels.level111
 * JD-Core Version:    0.6.2
 */