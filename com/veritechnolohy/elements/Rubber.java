/*     */ package com.veritechnolohy.elements;
/*     */ 
/*     */ import com.veritechnology.engine.Constants;
/*     */ import com.veritechnology.engine.ImageLoader;
/*     */ import com.veritechnology.engine.releaseObject;
/*     */ import javax.microedition.lcdui.Graphics;
/*     */ import javax.microedition.lcdui.Image;
/*     */ 
/*     */ public class Rubber extends MainElement
/*     */   implements releaseObject
/*     */ {
/*     */   private Image[] rubberImages;
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
/*     */   public Rubber(int angle)
/*     */   {
/*  44 */     super(Constants.RUBBERELEMENT);
/*  45 */     this.angle = angle;
/*  46 */     this.theAngle = angle;
/*  47 */     this.locationx = 28;
/*  48 */     this.locationy = 240;
/*  49 */     this.rubberImages = new Image[Constants.RUBBERNUMBER];
/*  50 */     for (int i = 0; i < this.rubberImages.length; i++) {
/*  51 */       this.rubberImages[i] = ImageLoader.loadImage("astek" + angle + "/astek_4500" + (i + 1));
/*     */     }
/*     */ 
/*  54 */     this.elemntWidth = this.rubberImages[0].getWidth();
/*  55 */     this.elementHeight = this.rubberImages[0].getHeight();
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
/*  78 */     if (this.animate) {
/*  79 */       if (this.drawingIndex < this.rubberImages.length - 1)
/*     */       {
/*  81 */         this.drawingIndex += 1;
/*     */       }
/*     */       else
/*     */       {
/*  85 */         this.animate = false;
/*  86 */         this.drawingIndex = 0;
/*     */       }
/*     */     }
/*     */ 
/*  90 */     g.drawImage(this.rubberImages[this.drawingIndex], this.locationx, this.locationy, 0);
/*     */   }
/*     */ 
/*     */   public void drawIndexOfRubber(Graphics g, int index)
/*     */   {
/*  95 */     this.drawingIndex = index;
/*  96 */     paint(g);
/*     */   }
/*     */ 
/*     */   public void freememory() {
/* 100 */     this.rubberImages = null;
/*     */   }
/*     */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veritechnolohy.elements.Rubber
 * JD-Core Version:    0.6.2
 */