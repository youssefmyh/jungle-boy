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
/*    */ public class level1114 extends MainScreen
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
/*    */   public level1114()
/*    */   {
/* 35 */     super(14);
/* 36 */     this.bazaza = new Bazaza();
/* 37 */     AddingElements.addingBAZaZElement(100, 250, this);
/* 38 */     AddingElements.addingBAZaZElement(220, 450, this);
/*    */ 
/* 43 */     this.bazaza.setLocationx(220);
/* 44 */     this.bazaza.setLocationy(300);
/* 45 */     this.levelBg = ImageLoader.loadImage("levelsbg");
/* 46 */     this.rubber = new Rubber(-45);
/* 47 */     this.rubber.setXYMovePowerFromRubber(100, 50);
/* 48 */     this.rubber.setLocationx(200);
/* 49 */     this.rubber.setLocationy(500);
/* 50 */     this.ballon = new Ballon(0);
/* 51 */     this.moveBlock = new MoveBlock(1);
/* 52 */     this.moveBlock.setLocationx(108);
/* 53 */     this.moveBlock.setLocationy(315);
/* 54 */     addElement(this.ballon);
/* 55 */     addElement(this.rubber);
/* 56 */     addElement(this.bazaza);
/*    */ 
/* 58 */     addElement(this.moveBlock);
/* 59 */     AddingElements.addingFirstSereer(229, 140, this);
/* 60 */     addPlayer();
/* 61 */     AddingElements.addingSereer(229, 140, this);
/*    */ 
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
 * Qualified Name:     com.veritechnology.levels.level1114
 * JD-Core Version:    0.6.2
 */