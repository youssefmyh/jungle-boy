/*    */ package com.veripark.levels2;
/*    */ 
/*    */ import com.veritechnology.engine.AddingElements;
/*    */ import com.veritechnology.engine.Constants;
/*    */ import com.veritechnology.engine.ImageLoader;
/*    */ import com.veritechnolohy.Screens.MainScreen;
/*    */ import com.veritechnolohy.elements.Bazaza;
/*    */ import com.veritechnolohy.elements.Electrical;
/*    */ import com.veritechnolohy.elements.Rubber;
/*    */ import com.veritechnolohy.elements.TOOB;
/*    */ import javax.microedition.lcdui.Graphics;
/*    */ import javax.microedition.lcdui.Image;
/*    */ 
/*    */ public class level1119 extends MainScreen
/*    */   implements Runnable
/*    */ {
/*    */   private Image levelBg;
/*    */   private Rubber rubber;
/*    */   private Bazaza bazaza;
/*    */   private Bazaza bazaza2;
/*    */   private TOOB blocks;
/*    */   Electrical electrical;
/*    */ 
/*    */   public level1119()
/*    */   {
/* 32 */     super(19);
/* 33 */     this.bazaza = new Bazaza();
/* 34 */     this.bazaza2 = new Bazaza();
/* 35 */     this.bazaza2.setLocationx(230);
/* 36 */     this.bazaza2.setLocationy(400);
/* 37 */     AddingElements.addingBAZaZElement(100, 200, this);
/* 38 */     this.blocks = new TOOB();
/* 39 */     this.blocks.setLocationx(315);
/* 40 */     this.blocks.setLocationy(315);
/* 41 */     this.bazaza.setLocationx(190);
/* 42 */     this.bazaza.setLocationy(200);
/* 43 */     this.levelBg = ImageLoader.loadImage("levelsbg");
/* 44 */     this.rubber = new Rubber(-45);
/* 45 */     this.rubber.setXYMovePowerFromRubber(300, 50);
/*    */ 
/* 47 */     this.electrical = new Electrical(1);
/* 48 */     this.electrical.setLocationx(24);
/* 49 */     this.electrical.setLocationy(460);
/*    */ 
/* 51 */     addElement(this.rubber);
/* 52 */     addElement(this.bazaza);
/* 53 */     addElement(this.blocks);
/* 54 */     addElement(this.bazaza2);
/* 55 */     addElement(this.electrical);
/* 56 */     AddingElements.addingFirstSereer(178, 508, this);
/* 57 */     addPlayer();
/* 58 */     AddingElements.addingSereer(178, 508, this);
/*    */ 
/* 60 */     new Thread(this).start();
/*    */   }
/*    */ 
/*    */   protected void pointerPressed(int x, int y)
/*    */   {
/* 65 */     super.pointerPressed(x, y);
/* 66 */     repaint();
/*    */   }
/*    */ 
/*    */   protected void pointerDragged(int x, int y) {
/* 70 */     super.pointerDragged(x, y);
/* 71 */     repaint();
/*    */   }
/*    */ 
/*    */   public void paint(Graphics g)
/*    */   {
/* 78 */     g.setColor(16777215);
/* 79 */     g.fillRect(0, 0, getWidth(), getHeight());
/* 80 */     g.drawImage(this.levelBg, 0, 0, 0);
/* 81 */     super.paint(g);
/*    */   }
/*    */ 
/*    */   public void run()
/*    */   {
/* 87 */     while (Constants.ISTHREADRUN)
/*    */       try
/*    */       {
/* 90 */         repaint();
/* 91 */         Thread.sleep(50L);
/*    */       }
/*    */       catch (InterruptedException ex)
/*    */       {
/* 96 */         ex.printStackTrace();
/*    */       }
/*    */   }
/*    */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veripark.levels2.level1119
 * JD-Core Version:    0.6.2
 */