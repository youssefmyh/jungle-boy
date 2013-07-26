/*    */ package com.veripark.levels2;
/*    */ 
/*    */ import com.veritechnology.engine.AddingElements;
/*    */ import com.veritechnology.engine.Constants;
/*    */ import com.veritechnology.engine.ImageLoader;
/*    */ import com.veritechnolohy.Screens.MainScreen;
/*    */ import com.veritechnolohy.elements.Ballon;
/*    */ import com.veritechnolohy.elements.Bazaza;
/*    */ import com.veritechnolohy.elements.Marwaha;
/*    */ import com.veritechnolohy.elements.MoveBlock;
/*    */ import com.veritechnolohy.elements.Rubber;
/*    */ import com.veritechnolohy.elements.SEER;
/*    */ import javax.microedition.lcdui.Graphics;
/*    */ import javax.microedition.lcdui.Image;
/*    */ 
/*    */ public class level1123 extends MainScreen
/*    */   implements Runnable
/*    */ {
/*    */   private Image levelBg;
/*    */   private Rubber rubber;
/*    */   private Bazaza bazaza;
/*    */   private Ballon ballon;
/*    */   private SEER seer;
/*    */   private Marwaha marwha;
/*    */   MoveBlock moveBlock;
/*    */ 
/*    */   public level1123()
/*    */   {
/* 35 */     super(23);
/* 36 */     this.bazaza = new Bazaza();
/* 37 */     this.marwha = new Marwaha(-1);
/* 38 */     this.marwha.setLocationx(280);
/* 39 */     this.marwha.setLocationy(300);
/* 40 */     this.bazaza.setLocationx(190);
/* 41 */     this.bazaza.setLocationy(220);
/*    */ 
/* 43 */     AddingElements.addingBAZaZElement(100, 200, this);
/* 44 */     AddingElements.addingBAZaZElement(100, 350, this);
/*    */ 
/* 47 */     this.seer = new SEER(1);
/* 48 */     this.levelBg = ImageLoader.loadImage("levelsbg");
/* 49 */     this.rubber = new Rubber(-45);
/* 50 */     this.rubber.setXYMovePowerFromRubber(200, 50);
/* 51 */     this.rubber.setLocationy(350);
/* 52 */     this.ballon = new Ballon(0);
/* 53 */     this.moveBlock = new MoveBlock(1);
/* 54 */     this.moveBlock.setLocationx(108);
/* 55 */     this.moveBlock.setLocationy(315);
/* 56 */     addElement(this.ballon);
/* 57 */     addElement(this.rubber);
/* 58 */     addElement(this.bazaza);
/* 59 */     addElement(this.moveBlock);
/* 60 */     AddingElements.addingFirstSereer(234, 535, this);
/* 61 */     addPlayer();
/* 62 */     AddingElements.addingSereer(234, 535, this);
/* 63 */     new Thread(this).start();
/*    */   }
/*    */ 
/*    */   protected void pointerPressed(int x, int y)
/*    */   {
/* 68 */     super.pointerPressed(x, y);
/* 69 */     repaint();
/*    */   }
/*    */ 
/*    */   protected void pointerDragged(int x, int y) {
/* 73 */     super.pointerDragged(x, y);
/* 74 */     repaint();
/*    */   }
/*    */ 
/*    */   public void paint(Graphics g)
/*    */   {
/* 81 */     g.setColor(16777215);
/* 82 */     g.fillRect(0, 0, getWidth(), getHeight());
/* 83 */     g.drawImage(this.levelBg, 0, 0, 0);
/* 84 */     super.paint(g);
/*    */   }
/*    */ 
/*    */   public void run()
/*    */   {
/* 93 */     while (Constants.ISTHREADRUN)
/*    */       try
/*    */       {
/* 96 */         repaint();
/* 97 */         Thread.sleep(50L);
/*    */       }
/*    */       catch (InterruptedException ex)
/*    */       {
/* 102 */         ex.printStackTrace();
/*    */       }
/*    */   }
/*    */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veripark.levels2.level1123
 * JD-Core Version:    0.6.2
 */