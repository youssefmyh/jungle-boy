/*    */ package com.veritechnology.levels;
/*    */ 
/*    */ import com.veritechnology.engine.AddingElements;
/*    */ import com.veritechnology.engine.Constants;
/*    */ import com.veritechnology.engine.ImageLoader;
/*    */ import com.veritechnolohy.Screens.MainScreen;
/*    */ import com.veritechnolohy.elements.Ballon;
/*    */ import com.veritechnolohy.elements.Bazaza;
/*    */ import com.veritechnolohy.elements.Rubber;
/*    */ import javax.microedition.lcdui.Graphics;
/*    */ import javax.microedition.lcdui.Image;
/*    */ 
/*    */ public class level10 extends MainScreen
/*    */   implements Runnable
/*    */ {
/*    */   private Image levelBg;
/*    */   private Rubber rubber;
/*    */   private Bazaza bazaza;
/*    */   private Ballon ballon;
/*    */ 
/*    */   public level10()
/*    */   {
/* 30 */     super(10);
/* 31 */     this.bazaza = new Bazaza();
/* 32 */     this.bazaza.setLocationx(100);
/* 33 */     this.bazaza.setLocationy(200);
/* 34 */     this.levelBg = ImageLoader.loadImage("levelsbg");
/* 35 */     this.rubber = new Rubber(-45);
/* 36 */     this.rubber.setXYMovePowerFromRubber(160, 50);
/* 37 */     this.ballon = new Ballon(0);
/* 38 */     this.ballon.setLocationx(100);
/* 39 */     this.ballon.setLocationy(360);
/* 40 */     addElement(this.ballon);
/* 41 */     addElement(this.rubber);
/* 42 */     addElement(this.bazaza);
/* 43 */     AddingElements.addingFirstSereer(211, 199, this);
/* 44 */     addPlayer();
/* 45 */     AddingElements.addingSereer(211, 199, this);
/*    */ 
/* 48 */     AddingElements.addingBAZaZElement(100, 300, this);
/* 49 */     AddingElements.addingBAZaZElement(250, 400, this);
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
 * Qualified Name:     com.veritechnology.levels.level10
 * JD-Core Version:    0.6.2
 */