/*    */ package com.veritechnology.levels;
/*    */ 
/*    */ import com.veritechnology.engine.AddingElements;
/*    */ import com.veritechnology.engine.Constants;
/*    */ import com.veritechnology.engine.ImageLoader;
/*    */ import com.veritechnolohy.Screens.MainScreen;
/*    */ import com.veritechnolohy.elements.Ballon;
/*    */ import com.veritechnolohy.elements.Bazaza;
/*    */ import com.veritechnolohy.elements.Marwaha;
/*    */ import com.veritechnolohy.elements.Rubber;
/*    */ import com.veritechnolohy.elements.SEER;
/*    */ import javax.microedition.lcdui.Graphics;
/*    */ import javax.microedition.lcdui.Image;
/*    */ 
/*    */ public class level1113 extends MainScreen
/*    */   implements Runnable
/*    */ {
/*    */   private Image levelBg;
/*    */   private Rubber rubber;
/*    */   private Bazaza bazaza;
/*    */   private Ballon ballon;
/*    */   private SEER seer;
/*    */   private Marwaha marwha;
/*    */ 
/*    */   public level1113()
/*    */   {
/* 34 */     super(13);
/* 35 */     this.bazaza = new Bazaza();
/* 36 */     this.marwha = new Marwaha(-1);
/* 37 */     this.marwha.setLocationx(280);
/* 38 */     this.marwha.setLocationy(300);
/* 39 */     this.bazaza.setLocationx(190);
/* 40 */     this.bazaza.setLocationy(200);
/*    */ 
/* 42 */     this.levelBg = ImageLoader.loadImage("levelsbg");
/* 43 */     this.rubber = new Rubber(-45);
/* 44 */     this.rubber.setXYMovePowerFromRubber(100, 50);
/* 45 */     this.rubber.setLocationy(200);
/* 46 */     this.rubber.setLocationy(500);
/*    */ 
/* 50 */     this.ballon = new Ballon(0);
/* 51 */     this.ballon.setLocationy(350);
/*    */ 
/* 53 */     addElement(this.ballon);
/* 54 */     addElement(this.rubber);
/* 55 */     addElement(this.bazaza);
/* 56 */     addElement(this.marwha);
/* 57 */     AddingElements.addingFirstSereer(0, 185, this);
/* 58 */     addPlayer();
/* 59 */     AddingElements.addingSereer(0, 185, this);
/*    */ 
/* 61 */     AddingElements.addingBAZaZElement(120, 250, this);
/*    */ 
/* 63 */     AddingElements.addingBAZaZElement(190, 450, this);
/*    */ 
/* 67 */     new Thread(this).start();
/*    */   }
/*    */ 
/*    */   protected void pointerPressed(int x, int y)
/*    */   {
/* 72 */     super.pointerPressed(x, y);
/* 73 */     repaint();
/*    */   }
/*    */ 
/*    */   protected void pointerDragged(int x, int y) {
/* 77 */     super.pointerDragged(x, y);
/* 78 */     repaint();
/*    */   }
/*    */ 
/*    */   public void paint(Graphics g)
/*    */   {
/* 85 */     g.setColor(16777215);
/* 86 */     g.fillRect(0, 0, getWidth(), getHeight());
/* 87 */     g.drawImage(this.levelBg, 0, 0, 0);
/* 88 */     super.paint(g);
/*    */   }
/*    */ 
/*    */   public void run()
/*    */   {
/* 94 */     while (Constants.ISTHREADRUN)
/*    */       try
/*    */       {
/* 97 */         repaint();
/* 98 */         Thread.sleep(50L);
/*    */       }
/*    */       catch (InterruptedException ex)
/*    */       {
/* 103 */         ex.printStackTrace();
/*    */       }
/*    */   }
/*    */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veritechnology.levels.level1113
 * JD-Core Version:    0.6.2
 */