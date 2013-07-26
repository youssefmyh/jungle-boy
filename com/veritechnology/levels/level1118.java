/*    */ package com.veritechnology.levels;
/*    */ 
/*    */ import com.veritechnology.engine.AddingElements;
/*    */ import com.veritechnology.engine.Constants;
/*    */ import com.veritechnology.engine.ImageLoader;
/*    */ import com.veritechnolohy.Screens.MainScreen;
/*    */ import com.veritechnolohy.elements.Ballon;
/*    */ import com.veritechnolohy.elements.Bazaza;
/*    */ import com.veritechnolohy.elements.Electrical;
/*    */ import com.veritechnolohy.elements.Marwaha;
/*    */ import com.veritechnolohy.elements.MoveBlock;
/*    */ import com.veritechnolohy.elements.Rubber;
/*    */ import com.veritechnolohy.elements.SEER;
/*    */ import javax.microedition.lcdui.Graphics;
/*    */ import javax.microedition.lcdui.Image;
/*    */ 
/*    */ public class level1118 extends MainScreen
/*    */   implements Runnable
/*    */ {
/*    */   private Image levelBg;
/*    */   private Rubber rubber;
/*    */   private Bazaza bazaza;
/*    */   private Ballon ballon;
/*    */   private SEER seer;
/*    */   private Marwaha marwha;
/*    */   Electrical electrical;
/*    */   MoveBlock moveBlock;
/*    */ 
/*    */   public level1118()
/*    */   {
/* 37 */     super(18);
/* 38 */     this.bazaza = new Bazaza();
/* 39 */     this.electrical = new Electrical(1);
/* 40 */     this.marwha = new Marwaha(1);
/* 41 */     this.marwha.setLocationx(280);
/* 42 */     this.marwha.setLocationy(300);
/* 43 */     this.bazaza.setLocationx(100);
/* 44 */     this.bazaza.setLocationy(200);
/* 45 */     AddingElements.addingBAZaZElement(100, 300, this);
/* 46 */     AddingElements.addingBAZaZElement(100, 400, this);
/*    */ 
/* 49 */     this.seer = new SEER(1);
/* 50 */     this.levelBg = ImageLoader.loadImage("levelsbg");
/* 51 */     this.rubber = new Rubber(-45);
/* 52 */     this.rubber.setXYMovePowerFromRubber(200, 50);
/* 53 */     this.ballon = new Ballon(0);
/* 54 */     this.moveBlock = new MoveBlock(1);
/* 55 */     this.moveBlock.setLocationx(108);
/* 56 */     this.moveBlock.setLocationy(315);
/* 57 */     this.electrical.setLocationx(14);
/* 58 */     this.electrical.setLocationy(200);
/*    */ 
/* 60 */     addElement(this.bazaza);
/*    */ 
/* 62 */     addElement(this.electrical);
/* 63 */     AddingElements.addingFirstSereer(80, 540, this);
/* 64 */     addPlayer();
/* 65 */     AddingElements.addingSereer(80, 540, this);
/* 66 */     new Thread(this).start();
/*    */   }
/*    */ 
/*    */   protected void pointerPressed(int x, int y)
/*    */   {
/* 71 */     super.pointerPressed(x, y);
/* 72 */     repaint();
/*    */   }
/*    */ 
/*    */   protected void pointerDragged(int x, int y) {
/* 76 */     super.pointerDragged(x, y);
/* 77 */     repaint();
/*    */   }
/*    */ 
/*    */   public void paint(Graphics g)
/*    */   {
/* 84 */     g.setColor(16777215);
/* 85 */     g.fillRect(0, 0, getWidth(), getHeight());
/* 86 */     g.drawImage(this.levelBg, 0, 0, 0);
/* 87 */     super.paint(g);
/*    */   }
/*    */ 
/*    */   public void run()
/*    */   {
/* 96 */     while (Constants.ISTHREADRUN)
/*    */       try
/*    */       {
/* 99 */         repaint();
/* 100 */         Thread.sleep(50L);
/*    */       }
/*    */       catch (InterruptedException ex)
/*    */       {
/* 105 */         ex.printStackTrace();
/*    */       }
/*    */   }
/*    */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veritechnology.levels.level1118
 * JD-Core Version:    0.6.2
 */