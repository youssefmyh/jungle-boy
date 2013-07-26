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
/*    */ public class level1116 extends MainScreen
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
/*    */   public level1116()
/*    */   {
/* 35 */     super(16);
/* 36 */     this.bazaza = new Bazaza();
/* 37 */     this.bazaza.setLocationx(220);
/* 38 */     this.bazaza.setLocationy(200);
/*    */ 
/* 40 */     AddingElements.addingBAZaZElement(100, 200, this);
/* 41 */     AddingElements.addingBAZaZElement(100, 320, this);
/*    */ 
/* 45 */     this.levelBg = ImageLoader.loadImage("levelsbg");
/* 46 */     this.rubber = new Rubber(-45);
/* 47 */     this.rubber.setXYMovePowerFromRubber(200, 50);
/* 48 */     this.ballon = new Ballon(0);
/* 49 */     this.moveBlock = new MoveBlock(1);
/* 50 */     this.moveBlock.setLocationx(108);
/* 51 */     this.moveBlock.setLocationy(315);
/* 52 */     addElement(this.ballon);
/* 53 */     addElement(this.rubber);
/*    */ 
/* 55 */     addElement(this.bazaza);
/*    */ 
/* 57 */     addElement(this.moveBlock);
/* 58 */     AddingElements.addingFirstSereer(234, 535, this);
/* 59 */     addPlayer();
/* 60 */     AddingElements.addingSereer(234, 535, this);
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
 * Qualified Name:     com.veritechnology.levels.level1116
 * JD-Core Version:    0.6.2
 */