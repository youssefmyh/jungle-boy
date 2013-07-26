/*    */ package com.veritechnology.levels;
/*    */ 
/*    */ import com.veritechnology.engine.AddingElements;
/*    */ import com.veritechnology.engine.Constants;
/*    */ import com.veritechnology.engine.ImageLoader;
/*    */ import com.veritechnolohy.Screens.MainScreen;
/*    */ import com.veritechnolohy.elements.Bazaza;
/*    */ import com.veritechnolohy.elements.SEER;
/*    */ import javax.microedition.lcdui.Graphics;
/*    */ import javax.microedition.lcdui.Image;
/*    */ 
/*    */ public class Level04 extends MainScreen
/*    */   implements Runnable
/*    */ {
/*    */   private Image levelBg;
/*    */   private SEER seer;
/*    */   private Bazaza bazaza;
/*    */ 
/*    */   public Level04()
/*    */   {
/* 30 */     super(4);
/* 31 */     this.bazaza = new Bazaza();
/* 32 */     this.bazaza.setLocationx(190);
/* 33 */     this.bazaza.setLocationy(200);
/* 34 */     this.levelBg = ImageLoader.loadImage("levelsbg");
/* 35 */     this.seer = new SEER(1);
/* 36 */     addElement(this.seer);
/* 37 */     addElement(this.bazaza);
/* 38 */     AddingElements.addingFirstSereer(144, 518, this);
/* 39 */     addPlayer();
/* 40 */     AddingElements.addingSereer(144, 518, this);
/*    */ 
/* 43 */     new Thread(this).start();
/*    */   }
/*    */ 
/*    */   protected void pointerPressed(int x, int y)
/*    */   {
/* 48 */     super.pointerPressed(x, y);
/* 49 */     repaint();
/*    */   }
/*    */ 
/*    */   protected void pointerDragged(int x, int y) {
/* 53 */     super.pointerDragged(x, y);
/* 54 */     repaint();
/*    */   }
/*    */ 
/*    */   public void paint(Graphics g)
/*    */   {
/* 61 */     g.setColor(16777215);
/* 62 */     g.fillRect(0, 0, getWidth(), getHeight());
/* 63 */     g.drawImage(this.levelBg, 0, 0, 0);
/* 64 */     super.paint(g);
/*    */   }
/*    */ 
/*    */   public void run()
/*    */   {
/* 70 */     while (Constants.ISTHREADRUN)
/*    */       try
/*    */       {
/* 73 */         repaint();
/* 74 */         Thread.sleep(50L);
/*    */       }
/*    */       catch (InterruptedException ex)
/*    */       {
/* 79 */         ex.printStackTrace();
/*    */       }
/*    */   }
/*    */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veritechnology.levels.Level04
 * JD-Core Version:    0.6.2
 */