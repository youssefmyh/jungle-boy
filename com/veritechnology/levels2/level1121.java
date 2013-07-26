/*     */ package com.veripark.levels2;
/*     */ 
/*     */ import com.veritechnology.engine.AddingElements;
/*     */ import com.veritechnology.engine.Constants;
/*     */ import com.veritechnology.engine.ImageLoader;
/*     */ import com.veritechnolohy.Screens.MainScreen;
/*     */ import com.veritechnolohy.elements.Ballon;
/*     */ import com.veritechnolohy.elements.Bazaza;
/*     */ import com.veritechnolohy.elements.Electrical;
/*     */ import com.veritechnolohy.elements.Marwaha;
/*     */ import com.veritechnolohy.elements.Rubber;
/*     */ import com.veritechnolohy.elements.SEER;
/*     */ import com.veritechnolohy.elements.TOOB;
/*     */ import javax.microedition.lcdui.Graphics;
/*     */ import javax.microedition.lcdui.Image;
/*     */ 
/*     */ public class level1121 extends MainScreen
/*     */   implements Runnable
/*     */ {
/*     */   private Image levelBg;
/*     */   private Rubber rubber;
/*     */   private Bazaza bazaza;
/*     */   private Ballon ballon;
/*     */   private SEER seer;
/*     */   private TOOB toob;
/*     */   private Marwaha marwha;
/*     */   private Electrical electrical;
/*     */ 
/*     */   public level1121()
/*     */   {
/*  37 */     super(21);
/*  38 */     this.bazaza = new Bazaza();
/*     */ 
/*  44 */     this.bazaza.setLocationx(190);
/*  45 */     this.bazaza.setLocationy(200);
/*  46 */     AddingElements.addingBAZaZElement(200, 450, this);
/*  47 */     AddingElements.addingBAZaZElement(140, 450, this);
/*     */ 
/*  53 */     this.levelBg = ImageLoader.loadImage("levelsbg");
/*  54 */     this.rubber = new Rubber(-45);
/*  55 */     this.rubber.setXYMovePowerFromRubber(200, 80);
/*  56 */     this.rubber.setLocationy(350);
/*     */ 
/*  59 */     this.electrical = new Electrical(-1);
/*  60 */     this.electrical.setLocationx(198);
/*  61 */     this.electrical.setLocationy(378);
/*     */ 
/*  63 */     this.ballon = new Ballon(0);
/*     */ 
/*  65 */     addElement(this.ballon);
/*  66 */     addElement(this.rubber);
/*  67 */     addElement(this.bazaza);
/*     */ 
/*  70 */     addElement(this.electrical);
/*     */ 
/*  72 */     AddingElements.addingFirstSereer(208, 121, this);
/*  73 */     addPlayer();
/*  74 */     AddingElements.addingSereer(208, 121, this);
/*  75 */     new Thread(this).start();
/*     */   }
/*     */ 
/*     */   protected void pointerPressed(int x, int y)
/*     */   {
/*  80 */     super.pointerPressed(x, y);
/*  81 */     repaint();
/*     */   }
/*     */ 
/*     */   protected void pointerDragged(int x, int y) {
/*  85 */     super.pointerDragged(x, y);
/*  86 */     repaint();
/*     */   }
/*     */ 
/*     */   public void paint(Graphics g)
/*     */   {
/*  93 */     g.setColor(16777215);
/*  94 */     g.fillRect(0, 0, getWidth(), getHeight());
/*  95 */     g.drawImage(this.levelBg, 0, 0, 0);
/*  96 */     super.paint(g);
/*     */   }
/*     */ 
/*     */   public void run()
/*     */   {
/* 102 */     while (Constants.ISTHREADRUN)
/*     */       try
/*     */       {
/* 105 */         repaint();
/* 106 */         Thread.sleep(50L);
/*     */       }
/*     */       catch (InterruptedException ex)
/*     */       {
/* 111 */         ex.printStackTrace();
/*     */       }
/*     */   }
/*     */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veripark.levels2.level1121
 * JD-Core Version:    0.6.2
 */