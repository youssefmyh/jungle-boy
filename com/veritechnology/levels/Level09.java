/*    */ package com.veritechnology.levels;
/*    */ 
/*    */ import com.veritechnology.engine.AddingElements;
/*    */ import com.veritechnology.engine.Constants;
/*    */ import com.veritechnology.engine.ImageLoader;
/*    */ import com.veritechnolohy.Screens.MainScreen;
/*    */ import com.veritechnolohy.elements.Bazaza;
/*    */ import com.veritechnolohy.elements.Rubber;
/*    */ import com.veritechnolohy.elements.SEER;
/*    */ import com.veritechnolohy.elements.TOOB;
/*    */ import javax.microedition.lcdui.Graphics;
/*    */ import javax.microedition.lcdui.Image;
/*    */ 
/*    */ public class Level09 extends MainScreen
/*    */   implements Runnable
/*    */ {
/*    */   private Image levelBg;
/*    */   private SEER seer;
/*    */   private SEER seer2;
/*    */   private Bazaza bazaza;
/*    */   private TOOB horzontalTOOb;
/*    */   private Rubber rubber;
/*    */   private Rubber rubber2;
/*    */ 
/*    */   public Level09()
/*    */   {
/* 33 */     super(9);
/*    */ 
/* 35 */     this.rubber = new Rubber(-45);
/* 36 */     this.rubber2 = new Rubber(45);
/* 37 */     this.rubber.setLocationx(150);
/* 38 */     this.rubber.setLocationy(400);
/* 39 */     this.horzontalTOOb = new TOOB();
/* 40 */     this.horzontalTOOb.setLocationx(50);
/* 41 */     this.horzontalTOOb.setLocationy(300);
/* 42 */     this.bazaza = new Bazaza();
/* 43 */     this.bazaza.setLocationx(190);
/* 44 */     this.bazaza.setLocationy(200);
/* 45 */     this.levelBg = ImageLoader.loadImage("levelsbg");
/* 46 */     this.seer = new SEER(1);
/*    */ 
/* 50 */     this.rubber.setXYMovePowerFromRubber(150, 50);
/*    */ 
/* 53 */     this.rubber2.setXYMovePowerFromRubber(200, 50);
/*    */ 
/* 56 */     addElement(this.seer);
/* 57 */     addElement(this.bazaza);
/* 58 */     addElement(this.horzontalTOOb);
/*    */ 
/* 60 */     addElement(this.rubber);
/* 61 */     addElement(this.rubber2);
/* 62 */     AddingElements.addingFirstSereer(211, 550, this);
/* 63 */     addPlayer();
/* 64 */     AddingElements.addingSereer(211, 550, this);
/* 65 */     AddingElements.addingBAZaZElement(100, 300, this);
/* 66 */     AddingElements.addingBAZaZElement(100, 400, this);
/*    */ 
/* 68 */     new Thread(this).start();
/*    */   }
/*    */ 
/*    */   protected void pointerPressed(int x, int y)
/*    */   {
/* 73 */     super.pointerPressed(x, y);
/* 74 */     repaint();
/*    */   }
/*    */ 
/*    */   protected void pointerDragged(int x, int y) {
/* 78 */     super.pointerDragged(x, y);
/* 79 */     repaint();
/*    */   }
/*    */ 
/*    */   public void paint(Graphics g)
/*    */   {
/* 86 */     g.setColor(16777215);
/* 87 */     g.fillRect(0, 0, getWidth(), getHeight());
/* 88 */     g.drawImage(this.levelBg, 0, 0, 0);
/* 89 */     super.paint(g);
/*    */   }
/*    */ 
/*    */   public void run()
/*    */   {
/* 95 */     while (Constants.ISTHREADRUN)
/*    */       try
/*    */       {
/* 98 */         repaint();
/* 99 */         Thread.sleep(50L);
/*    */       }
/*    */       catch (InterruptedException ex)
/*    */       {
/* 104 */         ex.printStackTrace();
/*    */       }
/*    */   }
/*    */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veritechnology.levels.Level09
 * JD-Core Version:    0.6.2
 */