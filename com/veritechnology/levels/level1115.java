/*     */ package com.veritechnology.levels;
/*     */ 
/*     */ import com.veritechnology.engine.AddingElements;
/*     */ import com.veritechnology.engine.Constants;
/*     */ import com.veritechnology.engine.ImageLoader;
/*     */ import com.veritechnolohy.Screens.MainScreen;
/*     */ import com.veritechnolohy.elements.Ballon;
/*     */ import com.veritechnolohy.elements.Bazaza;
/*     */ import com.veritechnolohy.elements.Marwaha;
/*     */ import com.veritechnolohy.elements.MoveBlock;
/*     */ import com.veritechnolohy.elements.Rubber;
/*     */ import com.veritechnolohy.elements.SEER;
/*     */ import javax.microedition.lcdui.Graphics;
/*     */ import javax.microedition.lcdui.Image;
/*     */ 
/*     */ public class level1115 extends MainScreen
/*     */   implements Runnable
/*     */ {
/*     */   private Image levelBg;
/*     */   private Rubber rubber;
/*     */   private Bazaza bazaza;
/*     */   private Ballon ballon;
/*     */   private SEER seer;
/*     */   private Marwaha marwha;
/*     */   MoveBlock moveBlock;
/*     */ 
/*     */   public level1115()
/*     */   {
/*  35 */     super(15);
/*  36 */     this.bazaza = new Bazaza();
/*  37 */     this.marwha = new Marwaha(1);
/*  38 */     this.marwha.setLocationx(280);
/*  39 */     this.marwha.setLocationy(400);
/*  40 */     this.bazaza.setLocationx(250);
/*  41 */     this.bazaza.setLocationy(300);
/*     */ 
/*  43 */     AddingElements.addingBAZaZElement(150, 250, this);
/*  44 */     AddingElements.addingBAZaZElement(150, 400, this);
/*     */ 
/*  47 */     this.seer = new SEER(1);
/*  48 */     this.levelBg = ImageLoader.loadImage("levelsbg");
/*     */ 
/*  51 */     this.ballon = new Ballon(0);
/*  52 */     this.ballon.setLocationy(250);
/*     */ 
/*  56 */     addElement(this.ballon);
/*     */ 
/*  58 */     addElement(this.seer);
/*  59 */     addElement(this.bazaza);
/*  60 */     addElement(this.marwha);
/*     */ 
/*  63 */     AddingElements.addingFirstSereer(230, 200, this);
/*  64 */     addPlayer();
/*  65 */     AddingElements.addingSereer(230, 200, this);
/*     */ 
/*  70 */     new Thread(this).start();
/*     */   }
/*     */ 
/*     */   protected void pointerPressed(int x, int y)
/*     */   {
/*  75 */     super.pointerPressed(x, y);
/*  76 */     repaint();
/*     */   }
/*     */ 
/*     */   protected void pointerDragged(int x, int y) {
/*  80 */     super.pointerDragged(x, y);
/*  81 */     repaint();
/*     */   }
/*     */ 
/*     */   public void paint(Graphics g)
/*     */   {
/*  88 */     g.setColor(16777215);
/*  89 */     g.fillRect(0, 0, getWidth(), getHeight());
/*  90 */     g.drawImage(this.levelBg, 0, 0, 0);
/*  91 */     super.paint(g);
/*     */   }
/*     */ 
/*     */   public void run()
/*     */   {
/* 100 */     while (Constants.ISTHREADRUN)
/*     */       try
/*     */       {
/* 103 */         repaint();
/* 104 */         Thread.sleep(50L);
/*     */       }
/*     */       catch (InterruptedException ex)
/*     */       {
/* 109 */         ex.printStackTrace();
/*     */       }
/*     */   }
/*     */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veritechnology.levels.level1115
 * JD-Core Version:    0.6.2
 */