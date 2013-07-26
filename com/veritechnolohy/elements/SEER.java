/*     */ package com.veritechnolohy.elements;
/*     */ 
/*     */ import com.veritechnology.engine.Constants;
/*     */ import com.veritechnology.engine.ImageLoader;
/*     */ import com.veritechnology.engine.releaseObject;
/*     */ import javax.microedition.lcdui.Graphics;
/*     */ import javax.microedition.lcdui.Image;
/*     */ 
/*     */ public class SEER extends MainElement
/*     */   implements releaseObject
/*     */ {
/*     */   private Image[] seeerImages;
/*     */   public int drawingIndex;
/*     */   private boolean animate;
/*     */   int angle;
/*     */ 
/*     */   public int getAngle()
/*     */   {
/*  28 */     return this.angle;
/*     */   }
/*     */ 
/*     */   public void setAngle(int angle) {
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
/*     */   public SEER(int angle)
/*     */   {
/*  44 */     super(Constants.SEER);
/*  45 */     this.angle = angle;
/*  46 */     this.locationx = 28;
/*  47 */     this.locationy = 240;
/*  48 */     this.seeerImages = new Image[Constants.SEERNUMBER];
/*  49 */     if (angle > 0)
/*     */     {
/*  51 */       for (int i = 0; i < this.seeerImages.length; i++) {
/*  52 */         this.seeerImages[i] = ImageLoader.loadImage("seer/seer" + i);
/*     */       }
/*     */     }
/*     */     else {
/*  56 */       for (int i = 0; i < this.seeerImages.length; i++)
/*     */       {
/*  59 */         this.seeerImages[i] = ImageLoader.loadImage("seer/seer" + (this.seeerImages.length - i - 1));
/*     */       }
/*     */     }
/*     */ 
/*  63 */     this.elemntWidth = this.seeerImages[0].getWidth();
/*  64 */     this.elementHeight = this.seeerImages[0].getHeight();
/*     */   }
/*     */ 
/*     */   public boolean isContainPointes(int x, int y)
/*     */   {
/*  73 */     return false;
/*     */   }
/*     */ 
/*     */   public void animate()
/*     */   {
/*     */   }
/*     */ 
/*     */   public void paint(Graphics g)
/*     */   {
/*  87 */     if (this.drawingIndex < this.seeerImages.length - 1)
/*     */     {
/*  89 */       this.drawingIndex += 1;
/*     */     }
/*     */     else {
/*  92 */       this.drawingIndex = 0;
/*     */     }
/*     */ 
/*  95 */     g.drawImage(this.seeerImages[this.drawingIndex], this.locationx, this.locationy, 0);
/*     */   }
/*     */ 
/*     */   public void drawIndexOfRubber(Graphics g, int index)
/*     */   {
/* 100 */     this.drawingIndex = index;
/* 101 */     paint(g);
/*     */   }
/*     */ 
/*     */   public void freememory() {
/* 105 */     this.seeerImages = null;
/*     */   }
/*     */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veritechnolohy.elements.SEER
 * JD-Core Version:    0.6.2
 */