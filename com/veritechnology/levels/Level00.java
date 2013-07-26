/*     */ package com.veritechnology.levels;
/*     */ 
/*     */ import com.veritechnology.engine.Constants;
/*     */ import com.veritechnology.engine.ImageLoader;
/*     */ import com.veritechnolohy.Screens.MainScreen;
/*     */ import com.veritechnolohy.elements.Bazaza;
/*     */ import com.veritechnolohy.elements.Rubber;
/*     */ import com.veritechnolohy.elements.SEREER;
/*     */ import com.veritechnolohy.elements.SERERRFELEMT;
/*     */ import javax.microedition.lcdui.Graphics;
/*     */ import javax.microedition.lcdui.Image;
/*     */ 
/*     */ public class Level00 extends MainScreen
/*     */   implements Runnable
/*     */ {
/*     */   private Image levelBg;
/*     */   private Rubber rubber;
/*     */   private Bazaza bazaza;
/*     */   private SEREER sereer;
/*     */   private SERERRFELEMT secondsereer;
/*     */ 
/*     */   public Level00()
/*     */   {
/*  32 */     super(0);
/*  33 */     this.bazaza = new Bazaza();
/*  34 */     this.bazaza.setLocationx(190);
/*  35 */     this.bazaza.setLocationy(200);
/*  36 */     this.levelBg = ImageLoader.loadImage("levelsbg");
/*  37 */     this.rubber = new Rubber(-45);
/*  38 */     this.rubber.setLocationx(100);
/*  39 */     this.rubber.setLocationy(250);
/*     */ 
/*  41 */     this.rubber.setXYMovePowerFromRubber(150, 50);
/*     */ 
/*  44 */     this.secondsereer = new SERERRFELEMT();
/*  45 */     this.secondsereer.setLocationx(217);
/*  46 */     this.secondsereer.setLocationy(319);
/*  47 */     addElement(this.secondsereer);
/*  48 */     addPlayer();
/*  49 */     this.sereer = new SEREER();
/*     */ 
/*  51 */     this.sereer.setLocationx(217);
/*  52 */     this.sereer.setLocationy(319);
/*  53 */     addElement(this.sereer);
/*  54 */     addElement(this.rubber);
/*  55 */     addElement(this.bazaza);
/*     */ 
/*  58 */     new Thread(this).start();
/*     */   }
/*     */ 
/*     */   protected void pointerPressed(int x, int y)
/*     */   {
/*  63 */     super.pointerPressed(x, y);
/*  64 */     repaint();
/*     */   }
/*     */ 
/*     */   protected void pointerDragged(int x, int y) {
/*  68 */     super.pointerDragged(x, y);
/*  69 */     repaint();
/*     */   }
/*     */ 
/*     */   public void paint(Graphics g)
/*     */   {
/*  76 */     g.setColor(16777215);
/*  77 */     g.fillRect(0, 0, getWidth(), getHeight());
/*  78 */     g.drawImage(this.levelBg, 0, 0, 0);
/*  79 */     super.paint(g);
/*     */   }
/*     */ 
/*     */   public void run()
/*     */   {
/*  85 */     while (Constants.ISTHREADRUN)
/*     */       try
/*     */       {
/*  88 */         repaint();
/*  89 */         Thread.sleep(50L);
/*     */       }
/*     */       catch (InterruptedException ex)
/*     */       {
/*  94 */         ex.printStackTrace();
/*     */       }
/*     */   }
/*     */ 
/*     */   public void freeMemory()
/*     */   {
/* 101 */     this.levelBg = null;
/* 102 */     this.rubber = null;
/* 103 */     this.bazaza = null;
/* 104 */     this.sereer = null;
/*     */   }
/*     */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veritechnology.levels.Level00
 * JD-Core Version:    0.6.2
 */