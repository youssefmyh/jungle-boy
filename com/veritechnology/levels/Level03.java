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
/*    */ public class Level03 extends MainScreen
/*    */   implements Runnable
/*    */ {
/*    */   private Image levelBg;
/*    */   private Rubber rubber;
/*    */   private Rubber rubber2;
/*    */   private Bazaza bazaza;
/*    */   private Bazaza bazaza2;
/*    */   private TOOB blocks;
/*    */ 
/*    */   public Level03()
/*    */   {
/* 33 */     super(3);
/* 34 */     this.bazaza = new Bazaza();
/* 35 */     this.bazaza2 = new Bazaza();
/* 36 */     this.bazaza2.setLocationx(230);
/* 37 */     this.bazaza2.setLocationy(400);
/* 38 */     this.blocks = new TOOB();
/* 39 */     this.blocks.setLocationx(315);
/* 40 */     this.blocks.setLocationy(315);
/* 41 */     this.bazaza.setLocationx(190);
/* 42 */     this.bazaza.setLocationy(200);
/* 43 */     this.levelBg = ImageLoader.loadImage("levelsbg");
/* 44 */     this.rubber = new Rubber(-45);
/* 45 */     this.rubber.setXYMovePowerFromRubber(300, 50);
/*    */ 
/* 47 */     this.rubber2 = new Rubber(45);
/* 48 */     this.rubber2.setXYMovePowerFromRubber(170, 50);
/* 49 */     this.rubber2.setLocationx(100);
/* 50 */     this.rubber2.setLocationy(350);
/*    */ 
/* 52 */     addElement(this.rubber2);
/* 53 */     addElement(this.rubber);
/* 54 */     addElement(this.bazaza);
/* 55 */     addElement(this.blocks);
/* 56 */     addElement(this.bazaza2);
/* 57 */     AddingElements.addingFirstSereer(20, 548, this);
/* 58 */     addPlayer();
/* 59 */     AddingElements.addingSereer(20, 548, this);
/* 60 */     AddingElements.addingBAZaZElement(100, 450, this);
/*    */ 
/* 62 */     new Thread(this).start();
/*    */   }
/*    */ 
/*    */   protected void pointerPressed(int x, int y)
/*    */   {
/* 67 */     super.pointerPressed(x, y);
/* 68 */     repaint();
/*    */   }
/*    */ 
/*    */   protected void pointerDragged(int x, int y) {
/* 72 */     super.pointerDragged(x, y);
/* 73 */     repaint();
/*    */   }
/*    */ 
/*    */   public void paint(Graphics g)
/*    */   {
/* 80 */     g.setColor(16777215);
/* 81 */     g.fillRect(0, 0, getWidth(), getHeight());
/* 82 */     g.drawImage(this.levelBg, 0, 0, 0);
/* 83 */     super.paint(g);
/*    */   }
/*    */ 
/*    */   public void run()
/*    */   {
/* 89 */     while (Constants.ISTHREADRUN)
/*    */       try
/*    */       {
/* 92 */         repaint();
/* 93 */         Thread.sleep(50L);
/*    */       }
/*    */       catch (InterruptedException ex)
/*    */       {
/* 98 */         ex.printStackTrace();
/*    */       }
/*    */   }
/*    */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veritechnology.levels.Level03
 * JD-Core Version:    0.6.2
 */