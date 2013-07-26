/*    */ package com.veritechnology.levels;
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
/*    */ public class level1117 extends MainScreen
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
/*    */   public level1117()
/*    */   {
/* 35 */     super(17);
/* 36 */     this.bazaza = new Bazaza();
/* 37 */     this.marwha = new Marwaha(1);
/* 38 */     this.marwha.setLocationx(280);
/* 39 */     this.marwha.setLocationy(300);
/* 40 */     this.bazaza.setLocationx(200);
/* 41 */     this.bazaza.setLocationy(200);
/* 42 */     AddingElements.addingBAZaZElement(100, 200, this);
/* 43 */     AddingElements.addingBAZaZElement(100, 350, this);
/*    */ 
/* 46 */     this.seer = new SEER(1);
/* 47 */     this.levelBg = ImageLoader.loadImage("levelsbg");
/* 48 */     this.rubber = new Rubber(-45);
/* 49 */     this.rubber.setXYMovePowerFromRubber(200, 50);
/* 50 */     this.ballon = new Ballon(0);
/* 51 */     this.moveBlock = new MoveBlock(1);
/* 52 */     this.moveBlock.setLocationx(108);
/* 53 */     this.moveBlock.setLocationy(315);
/* 54 */     addElement(this.ballon);
/* 55 */     addElement(this.bazaza);
/* 56 */     addElement(this.marwha);
/* 57 */     AddingElements.addingFirstSereer(223, 540, this);
/* 58 */     addPlayer();
/* 59 */     AddingElements.addingSereer(223, 540, this);
/*    */ 
/* 61 */     new Thread(this).start();
/*    */   }
/*    */ 
/*    */   protected void pointerPressed(int x, int y)
/*    */   {
/* 66 */     super.pointerPressed(x, y);
/* 67 */     repaint();
/*    */   }
/*    */ 
/*    */   protected void pointerDragged(int x, int y) {
/* 71 */     super.pointerDragged(x, y);
/* 72 */     repaint();
/*    */   }
/*    */ 
/*    */   public void paint(Graphics g)
/*    */   {
/* 79 */     g.setColor(16777215);
/* 80 */     g.fillRect(0, 0, getWidth(), getHeight());
/* 81 */     g.drawImage(this.levelBg, 0, 0, 0);
/* 82 */     super.paint(g);
/*    */   }
/*    */ 
/*    */   public void run()
/*    */   {
/* 91 */     while (Constants.ISTHREADRUN)
/*    */       try
/*    */       {
/* 94 */         repaint();
/* 95 */         Thread.sleep(50L);
/*    */       }
/*    */       catch (InterruptedException ex)
/*    */       {
/* 100 */         ex.printStackTrace();
/*    */       }
/*    */   }
/*    */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veritechnology.levels.level1117
 * JD-Core Version:    0.6.2
 */