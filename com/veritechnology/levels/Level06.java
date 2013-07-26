/*    */ package com.veritechnology.levels;
/*    */ 
/*    */ import com.veritechnology.engine.AddingElements;
/*    */ import com.veritechnology.engine.Constants;
/*    */ import com.veritechnology.engine.ImageLoader;
/*    */ import com.veritechnolohy.Screens.MainScreen;
/*    */ import com.veritechnolohy.elements.Bazaza;
/*    */ import com.veritechnolohy.elements.Rubber;
/*    */ import com.veritechnolohy.elements.SEER;
/*    */ import com.veritechnolohy.elements.TOOBHorizontal;
/*    */ import javax.microedition.lcdui.Graphics;
/*    */ import javax.microedition.lcdui.Image;
/*    */ 
/*    */ public class Level06 extends MainScreen
/*    */   implements Runnable
/*    */ {
/*    */   private Image levelBg;
/*    */   private SEER seer;
/*    */   private SEER seer2;
/*    */   private Bazaza bazaza;
/*    */   private TOOBHorizontal horzontalTOOb;
/*    */   private Rubber rubber;
/*    */   private Rubber rubber2;
/*    */ 
/*    */   public Level06()
/*    */   {
/* 32 */     super(6);
/*    */ 
/* 34 */     this.rubber = new Rubber(-45);
/* 35 */     this.rubber2 = new Rubber(45);
/* 36 */     this.rubber.setLocationx(150);
/* 37 */     this.rubber.setLocationy(400);
/* 38 */     this.horzontalTOOb = new TOOBHorizontal();
/* 39 */     this.horzontalTOOb.setLocationx(50);
/* 40 */     this.horzontalTOOb.setLocationy(300);
/* 41 */     this.bazaza = new Bazaza();
/* 42 */     this.bazaza.setLocationx(190);
/* 43 */     this.bazaza.setLocationy(200);
/* 44 */     this.levelBg = ImageLoader.loadImage("levelsbg");
/* 45 */     this.seer = new SEER(1);
/* 46 */     this.seer2 = new SEER(-1);
/* 47 */     this.seer.setLocationx(50);
/* 48 */     this.seer.setLocationx(250);
/* 49 */     this.rubber.setXYMovePowerFromRubber(170, 50);
/*    */ 
/* 51 */     this.rubber2.setXYMovePowerFromRubber(300, 300);
/* 52 */     addElement(this.seer);
/* 53 */     addElement(this.bazaza);
/* 54 */     addElement(this.horzontalTOOb);
/*    */ 
/* 56 */     addElement(this.rubber);
/* 57 */     addElement(this.rubber2);
/* 58 */     AddingElements.addingFirstSereer(122, 548, this);
/* 59 */     addPlayer();
/* 60 */     AddingElements.addingSereer(122, 548, this);
/* 61 */     AddingElements.addingBAZaZElement(200, 360, this);
/* 62 */     AddingElements.addingBAZaZElement(100, 400, this);
/*    */ 
/* 64 */     new Thread(this).start();
/*    */   }
/*    */ 
/*    */   protected void pointerPressed(int x, int y)
/*    */   {
/* 69 */     super.pointerPressed(x, y);
/* 70 */     repaint();
/*    */   }
/*    */ 
/*    */   protected void pointerDragged(int x, int y) {
/* 74 */     super.pointerDragged(x, y);
/* 75 */     repaint();
/*    */   }
/*    */ 
/*    */   public void paint(Graphics g)
/*    */   {
/* 82 */     g.setColor(16777215);
/* 83 */     g.fillRect(0, 0, getWidth(), getHeight());
/* 84 */     g.drawImage(this.levelBg, 0, 0, 0);
/* 85 */     super.paint(g);
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
 * Qualified Name:     com.veritechnology.levels.Level06
 * JD-Core Version:    0.6.2
 */