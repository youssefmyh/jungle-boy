/*     */ package com.veritechnolohy.elements;
/*     */ 
/*     */ import com.veritechnology.engine.Constants;
/*     */ import com.veritechnology.engine.ImageLoader;
/*     */ import com.veritechnology.engine.releaseObject;
/*     */ import javax.microedition.lcdui.Graphics;
/*     */ import javax.microedition.lcdui.Image;
/*     */ 
/*     */ public class VerticalElectrical extends MainElement
/*     */   implements releaseObject
/*     */ {
/*     */   private Image[] ballonImages;
/*     */   public int drawingIndex;
/*     */   private boolean animate;
/*     */   int angle;
/*  25 */   boolean right = true;
/*  26 */   int incremental = 0;
/*     */ 
/*  28 */   public int getAngle() { return this.angle; }
/*     */ 
/*     */   public void setAngle(int angle)
/*     */   {
/*  32 */     this.angle = angle;
/*     */   }
/*     */   public boolean isAnimate() {
/*  35 */     return this.animate;
/*     */   }
/*     */ 
/*     */   public void setAnimate(boolean animate) {
/*  39 */     this.animate = animate;
/*     */   }
/*     */ 
/*     */   public VerticalElectrical(int angle)
/*     */   {
/*  44 */     super(Constants.ELECTRICAL);
/*  45 */     this.angle = angle;
/*  46 */     this.locationx = 28;
/*  47 */     this.locationy = 240;
/*  48 */     this.ballonImages = new Image[1];
/*     */ 
/*  50 */     for (int i = 0; i < this.ballonImages.length; i++) {
/*  51 */       this.ballonImages[i] = ImageLoader.loadImage("kahrabavertical");
/*     */     }
/*     */ 
/*  54 */     this.elemntWidth = this.ballonImages[0].getWidth();
/*  55 */     this.elementHeight = this.ballonImages[0].getHeight();
/*     */   }
/*     */ 
/*     */   public boolean isContainPointes(int x, int y)
/*     */   {
/*  64 */     return false;
/*     */   }
/*     */ 
/*     */   public void animate()
/*     */   {
/*     */   }
/*     */ 
/*     */   public void paint(Graphics g)
/*     */   {
/*  78 */     if (this.right)
/*  79 */       incrementX();
/*     */     else {
/*  81 */       decrementX();
/*     */     }
/*     */ 
/*  84 */     if (!isHidden())
/*  85 */       g.drawImage(this.ballonImages[this.drawingIndex], this.locationx, this.locationy, 0);
/*     */   }
/*     */ 
/*     */   public void incrementX()
/*     */   {
/*  91 */     if ((++this.incremental > 20) && (this.incremental < 80)) {
/*  92 */       setHidden(true);
/*     */     }
/*     */     else
/*     */     {
/*  96 */       setHidden(false);
/*     */     }
/*     */ 
/*  99 */     if (this.incremental > 50)
/*     */     {
/* 101 */       this.incremental = 0;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void decrementX()
/*     */   {
/* 109 */     if (this.locationx + this.elemntWidth > 0) {
/* 110 */       this.locationx -= 3;
/*     */     }
/*     */     else
/*     */     {
/* 114 */       this.right = true;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void drawIndexOfRubber(Graphics g, int index)
/*     */   {
/* 122 */     this.drawingIndex = index;
/* 123 */     paint(g);
/*     */   }
/*     */ 
/*     */   public void freememory() {
/* 127 */     this.ballonImages = null;
/*     */   }
/*     */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veritechnolohy.elements.VerticalElectrical
 * JD-Core Version:    0.6.2
 */