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
/*    */ public class Level05 extends MainScreen
/*    */   implements Runnable
/*    */ {
/*    */   private Image levelBg;
/*    */   private SEER seer;
/*    */   private SEER seer2;
/*    */   private Bazaza bazaza;
/*    */   private TOOBHorizontal horzontalTOOb;
/*    */   private Rubber rubber;
/*    */ 
/*    */   public Level05()
/*    */   {
/* 32 */     super(5);
/*    */ 
/* 34 */     this.rubber = new Rubber(-45);
/* 35 */     this.rubber.setLocationx(100);
/* 36 */     this.rubber.setLocationy(400);
/* 37 */     this.horzontalTOOb = new TOOBHorizontal();
/* 38 */     this.horzontalTOOb.setLocationx(50);
/* 39 */     this.horzontalTOOb.setLocationy(300);
/* 40 */     this.bazaza = new Bazaza();
/* 41 */     this.bazaza.setLocationx(190);
/* 42 */     this.bazaza.setLocationy(200);
/* 43 */     this.levelBg = ImageLoader.loadImage("levelsbg");
/* 44 */     this.seer = new SEER(1);
/* 45 */     this.seer2 = new SEER(-1);
/* 46 */     this.seer.setLocationx(50);
/* 47 */     this.seer.setLocationx(250);
/*    */ 
/* 49 */     this.rubber.setXYMovePowerFromRubber(300, 300);
/* 50 */     addElement(this.seer);
/* 51 */     addElement(this.bazaza);
/* 52 */     addElement(this.horzontalTOOb);
/* 53 */     addElement(this.seer2);
/* 54 */     addElement(this.rubber);
/* 55 */     AddingElements.addingFirstSereer(215, 514, this);
/* 56 */     addPlayer();
/* 57 */     AddingElements.addingSereer(215, 514, this);
/*    */ 
/* 59 */     AddingElements.addingBAZaZElement(120, 400, this);
/* 60 */     AddingElements.addingBAZaZElement(280, 350, this);
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
/*    */     {
/*    */       try
/*    */       {
/* 93 */         repaint();
/* 94 */         Thread.sleep(50L);
/*    */       }
/*    */       catch (InterruptedException ex)
/*    */       {
/* 99 */         ex.printStackTrace();
/*    */       }
/*    */     }
/*    */   }
/*    */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veritechnology.levels.Level05
 * JD-Core Version:    0.6.2
 */