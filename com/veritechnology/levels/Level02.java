/*    */ package com.veritechnology.levels;
/*    */ 
/*    */ import com.veritechnology.engine.AddingElements;
/*    */ import com.veritechnology.engine.Constants;
/*    */ import com.veritechnology.engine.ImageLoader;
/*    */ import com.veritechnolohy.Screens.MainScreen;
/*    */ import com.veritechnolohy.elements.Bazaza;
/*    */ import com.veritechnolohy.elements.Rubber;
/*    */ import com.veritechnolohy.elements.TOOB;
/*    */ import javax.microedition.lcdui.Graphics;
/*    */ import javax.microedition.lcdui.Image;
/*    */ 
/*    */ public class Level02 extends MainScreen
/*    */   implements Runnable
/*    */ {
/*    */   private Image levelBg;
/*    */   private Rubber rubber;
/*    */   private Bazaza bazaza;
/*    */   private Bazaza bazaza2;
/*    */   private TOOB blocks;
/*    */ 
/*    */   public Level02()
/*    */   {
/* 32 */     super(2);
/* 33 */     this.bazaza = new Bazaza();
/* 34 */     this.bazaza2 = new Bazaza();
/* 35 */     this.bazaza2.setLocationx(230);
/* 36 */     this.bazaza2.setLocationy(400);
/* 37 */     this.blocks = new TOOB();
/* 38 */     this.blocks.setLocationx(315);
/* 39 */     this.blocks.setLocationy(315);
/* 40 */     this.bazaza.setLocationx(190);
/* 41 */     this.bazaza.setLocationy(200);
/* 42 */     this.levelBg = ImageLoader.loadImage("levelsbg");
/* 43 */     this.rubber = new Rubber(-45);
/* 44 */     this.rubber.setXYMovePowerFromRubber(300, 50);
/* 45 */     addElement(this.rubber);
/* 46 */     addElement(this.bazaza);
/* 47 */     addElement(this.blocks);
/* 48 */     addElement(this.bazaza2);
/* 49 */     AddingElements.addingFirstSereer(178, 508, this);
/* 50 */     addPlayer();
/* 51 */     AddingElements.addingSereer(178, 508, this);
/*    */ 
/* 53 */     new Thread(this).start();
/*    */   }
/*    */ 
/*    */   protected void pointerPressed(int x, int y)
/*    */   {
/* 58 */     super.pointerPressed(x, y);
/* 59 */     repaint();
/*    */   }
/*    */ 
/*    */   protected void pointerDragged(int x, int y) {
/* 63 */     super.pointerDragged(x, y);
/* 64 */     repaint();
/*    */   }
/*    */ 
/*    */   public void paint(Graphics g)
/*    */   {
/* 71 */     g.setColor(16777215);
/* 72 */     g.fillRect(0, 0, getWidth(), getHeight());
/* 73 */     g.drawImage(this.levelBg, 0, 0, 0);
/* 74 */     super.paint(g);
/*    */   }
/*    */ 
/*    */   public void run()
/*    */   {
/* 80 */     while (Constants.ISTHREADRUN)
/*    */       try
/*    */       {
/* 83 */         repaint();
/* 84 */         Thread.sleep(50L);
/*    */       }
/*    */       catch (InterruptedException ex)
/*    */       {
/* 89 */         ex.printStackTrace();
/*    */       }
/*    */   }
/*    */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veritechnology.levels.Level02
 * JD-Core Version:    0.6.2
 */