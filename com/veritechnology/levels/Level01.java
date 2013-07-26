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
/*    */ public class Level01 extends MainScreen
/*    */   implements Runnable
/*    */ {
/*    */   private Image levelBg;
/*    */   private Rubber rubber;
/*    */   private Bazaza bazaza;
/*    */   private TOOB blocks;
/*    */ 
/*    */   public Level01()
/*    */   {
/* 31 */     super(1);
/* 32 */     this.bazaza = new Bazaza();
/* 33 */     this.blocks = new TOOB();
/* 34 */     this.blocks.setLocationx(315);
/* 35 */     this.blocks.setLocationy(315);
/* 36 */     this.bazaza.setLocationx(190);
/* 37 */     this.bazaza.setLocationy(200);
/* 38 */     this.levelBg = ImageLoader.loadImage("levelsbg");
/* 39 */     this.rubber = new Rubber(-45);
/* 40 */     this.rubber.setXYMovePowerFromRubber(300, 50);
/*    */ 
/* 42 */     addElement(this.rubber);
/* 43 */     addElement(this.bazaza);
/* 44 */     addElement(this.blocks);
/*    */ 
/* 46 */     AddingElements.addingFirstSereer(178, 508, this);
/* 47 */     addPlayer();
/* 48 */     AddingElements.addingSereer(178, 508, this);
/* 49 */     new Thread(this).start();
/*    */   }
/*    */ 
/*    */   protected void pointerPressed(int x, int y)
/*    */   {
/* 54 */     super.pointerPressed(x, y);
/* 55 */     repaint();
/*    */   }
/*    */ 
/*    */   protected void pointerDragged(int x, int y) {
/* 59 */     super.pointerDragged(x, y);
/* 60 */     repaint();
/*    */   }
/*    */ 
/*    */   public void paint(Graphics g)
/*    */   {
/* 67 */     g.setColor(16777215);
/* 68 */     g.fillRect(0, 0, getWidth(), getHeight());
/* 69 */     g.drawImage(this.levelBg, 0, 0, 0);
/* 70 */     super.paint(g);
/*    */   }
/*    */ 
/*    */   public void run()
/*    */   {
/* 76 */     while (Constants.ISTHREADRUN)
/*    */       try
/*    */       {
/* 79 */         repaint();
/* 80 */         Thread.sleep(50L);
/*    */       }
/*    */       catch (InterruptedException ex)
/*    */       {
/* 85 */         ex.printStackTrace();
/*    */       }
/*    */   }
/*    */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veritechnology.levels.Level01
 * JD-Core Version:    0.6.2
 */