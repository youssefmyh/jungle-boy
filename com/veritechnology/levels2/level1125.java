/*    */ package com.veripark.levels2;
/*    */ 
/*    */ import com.veritechnology.engine.AddingElements;
/*    */ import com.veritechnology.engine.Constants;
/*    */ import com.veritechnology.engine.ImageLoader;
/*    */ import com.veritechnolohy.Screens.MainScreen;
/*    */ import com.veritechnolohy.elements.Ballon;
/*    */ import com.veritechnolohy.elements.Bazaza;
/*    */ import com.veritechnolohy.elements.Electrical;
/*    */ import com.veritechnolohy.elements.Marwaha;
/*    */ import com.veritechnolohy.elements.Rubber;
/*    */ import com.veritechnolohy.elements.SEER;
/*    */ import com.veritechnolohy.elements.TOOB;
/*    */ import com.veritechnolohy.elements.VerticalElectrical;
/*    */ import javax.microedition.lcdui.Graphics;
/*    */ import javax.microedition.lcdui.Image;
/*    */ 
/*    */ public class level1125 extends MainScreen
/*    */   implements Runnable
/*    */ {
/*    */   private Image levelBg;
/*    */   private Rubber rubber;
/*    */   private Bazaza bazaza;
/*    */   private Ballon ballon;
/*    */   private SEER seer;
/*    */   private TOOB toob;
/*    */   private Marwaha marwha;
/*    */   private Electrical electrical;
/*    */   private VerticalElectrical vErictrical;
/*    */ 
/*    */   public level1125()
/*    */   {
/* 38 */     super(25);
/* 39 */     this.bazaza = new Bazaza();
/* 40 */     this.bazaza.setLocationx(190);
/* 41 */     this.bazaza.setLocationy(200);
/*    */ 
/* 43 */     AddingElements.addingBAZaZElement(100, 300, this);
/* 44 */     AddingElements.addingBAZaZElement(100, 400, this);
/*    */ 
/* 46 */     this.vErictrical = new VerticalElectrical(0);
/* 47 */     this.vErictrical.setLocationx(292);
/* 48 */     this.vErictrical.setLocationy(227);
/* 49 */     this.seer = new SEER(1);
/* 50 */     this.seer.setLocationx(45);
/* 51 */     this.seer.setLocationy(340);
/* 52 */     this.levelBg = ImageLoader.loadImage("levelsbg");
/* 53 */     this.rubber = new Rubber(45);
/* 54 */     this.rubber.setXYMovePowerFromRubber(150, 80);
/* 55 */     this.rubber.setLocationx(167);
/* 56 */     this.rubber.setLocationy(434);
/*    */ 
/* 58 */     this.electrical = new Electrical(-1);
/* 59 */     this.electrical.setLocationx(40);
/* 60 */     this.electrical.setLocationy(210);
/*    */ 
/* 62 */     this.ballon = new Ballon(0);
/* 63 */     addElement(this.seer);
/* 64 */     addElement(this.rubber);
/* 65 */     addElement(this.bazaza);
/*    */ 
/* 67 */     addElement(this.electrical);
/* 68 */     AddingElements.addingFirstSereer(33, 514, this);
/* 69 */     addPlayer();
/* 70 */     AddingElements.addingSereer(33, 514, this);
/* 71 */     new Thread(this).start();
/*    */   }
/*    */ 
/*    */   protected void pointerPressed(int x, int y)
/*    */   {
/* 76 */     super.pointerPressed(x, y);
/* 77 */     repaint();
/*    */   }
/*    */ 
/*    */   protected void pointerDragged(int x, int y) {
/* 81 */     super.pointerDragged(x, y);
/* 82 */     repaint();
/*    */   }
/*    */ 
/*    */   public void paint(Graphics g)
/*    */   {
/* 89 */     g.setColor(16777215);
/* 90 */     g.fillRect(0, 0, getWidth(), getHeight());
/* 91 */     g.drawImage(this.levelBg, 0, 0, 0);
/* 92 */     super.paint(g);
/*    */   }
/*    */ 
/*    */   public void run()
/*    */   {
/* 98 */     while (Constants.ISTHREADRUN)
/*    */       try
/*    */       {
/* 101 */         repaint();
/* 102 */         Thread.sleep(50L);
/*    */       }
/*    */       catch (InterruptedException ex)
/*    */       {
/* 107 */         ex.printStackTrace();
/*    */       }
/*    */   }
/*    */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veripark.levels2.level1125
 * JD-Core Version:    0.6.2
 */