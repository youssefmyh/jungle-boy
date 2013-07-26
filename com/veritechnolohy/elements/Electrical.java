/*     */ package com.veritechnolohy.elements;
/*     */ 
/*     */ import com.veritechnology.engine.Constants;
/*     */ import com.veritechnology.engine.ImageLoader;
/*     */ import com.veritechnology.engine.SoundLoader;
/*     */ import com.veritechnology.engine.releaseObject;
/*     */ import javax.microedition.lcdui.Graphics;
/*     */ import javax.microedition.lcdui.Image;
/*     */ 
/*     */ public class Electrical extends MainElement
/*     */   implements releaseObject
/*     */ {
/*     */   private Image[] ballonImages;
/*     */   public int drawingIndex;
/*     */   private boolean animate;
/*     */   int angle;
/*  26 */   boolean right = true;
/*  27 */   int incremental = 0;
/*     */ 
/*  29 */   public int getAngle() { return this.angle; }
/*     */ 
/*     */   public void setAngle(int angle)
/*     */   {
/*  33 */     this.angle = angle;
/*     */   }
/*     */   public boolean isAnimate() {
/*  36 */     return this.animate;
/*     */   }
/*     */ 
/*     */   public void setAnimate(boolean animate) {
/*  40 */     this.animate = animate;
/*     */   }
/*     */ 
/*     */   public Electrical(int angle)
/*     */   {
/*  45 */     super(Constants.ELECTRICAL);
/*  46 */     setFixedElement(true);
/*  47 */     this.angle = angle;
/*  48 */     this.locationx = 28;
/*  49 */     this.locationy = 240;
/*  50 */     this.ballonImages = new Image[1];
/*  51 */     if (angle < 0) {
/*  52 */       for (int i = 0; i < this.ballonImages.length; i++)
/*  53 */         this.ballonImages[i] = ImageLoader.loadImage("kahraba");
/*     */     }
/*     */     else {
/*  56 */       for (int i = 0; i < this.ballonImages.length; i++) {
/*  57 */         this.ballonImages[i] = ImageLoader.loadImage("bigkahraba");
/*     */       }
/*     */     }
/*  60 */     this.elemntWidth = this.ballonImages[0].getWidth();
/*  61 */     this.elementHeight = this.ballonImages[0].getHeight();
/*     */   }
/*     */ 
/*     */   public boolean isContainPointes(int x, int y)
/*     */   {
/*  70 */     return false;
/*     */   }
/*     */ 
/*     */   public void animate()
/*     */   {
/*     */   }
/*     */ 
/*     */   public void paint(Graphics g)
/*     */   {
/*  84 */     if (this.right)
/*  85 */       incrementX();
/*     */     else {
/*  87 */       decrementX();
/*     */     }
/*     */ 
/*  90 */     if (!isHidden()) {
/*  91 */       g.drawImage(this.ballonImages[this.drawingIndex], this.locationx, this.locationy, 0);
/*  92 */       SoundLoader.playElectericalSound();
/*     */     }
/*     */   }
/*     */ 
/*     */   public void incrementX()
/*     */   {
/* 100 */     if ((++this.incremental > 20) && (this.incremental < 80)) {
/* 101 */       setHidden(true);
/*     */     }
/*     */     else
/*     */     {
/* 105 */       setHidden(false);
/*     */     }
/*     */ 
/* 108 */     if (this.incremental > 50)
/*     */     {
/* 110 */       this.incremental = 0;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void decrementX()
/*     */   {
/* 118 */     if (this.locationx + this.elemntWidth > 0) {
/* 119 */       this.locationx -= 3;
/*     */     }
/*     */     else
/*     */     {
/* 123 */       this.right = true;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void drawIndexOfRubber(Graphics g, int index)
/*     */   {
/* 131 */     this.drawingIndex = index;
/* 132 */     paint(g);
/*     */   }
/*     */ 
/*     */   public void freememory() {
/* 136 */     this.ballonImages = null;
/*     */   }
/*     */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veritechnolohy.elements.Electrical
 * JD-Core Version:    0.6.2
 */