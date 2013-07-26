/*     */ package com.veritechnolohy.elements;
/*     */ 
/*     */ import com.veritechnology.engine.Constants;
/*     */ import com.veritechnology.engine.ImageLoader;
/*     */ import com.veritechnology.engine.releaseObject;
/*     */ import javax.microedition.lcdui.Graphics;
/*     */ import javax.microedition.lcdui.Image;
/*     */ 
/*     */ public class Ballon extends MainElement
/*     */   implements releaseObject
/*     */ {
/*     */   private Image[] ballonImages;
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
/*     */   public Ballon(int angle)
/*     */   {
/*  44 */     super(Constants.BALONA);
/*  45 */     this.angle = angle;
/*  46 */     this.locationx = 28;
/*  47 */     this.locationy = 240;
/*  48 */     this.ballonImages = new Image[Constants.BALLONNUMBER];
/*  49 */     for (int i = 0; i < this.ballonImages.length; i++) {
/*  50 */       this.ballonImages[i] = ImageLoader.loadImage("ballon/ballon00" + (i + 1));
/*     */     }
/*     */ 
/*  53 */     this.elemntWidth = this.ballonImages[0].getWidth();
/*  54 */     this.elementHeight = this.ballonImages[0].getHeight();
/*     */   }
/*     */ 
/*     */   public boolean isContainPointes(int x, int y)
/*     */   {
/*  63 */     return false;
/*     */   }
/*     */ 
/*     */   public void animate()
/*     */   {
/*     */   }
/*     */ 
/*     */   public void paint(Graphics g)
/*     */   {
/*  77 */     if (this.animate) {
/*  78 */       if (this.drawingIndex < this.ballonImages.length - 1)
/*     */       {
/*  80 */         this.drawingIndex += 1;
/*     */       }
/*     */       else
/*     */       {
/*  84 */         this.animate = false;
/*  85 */         this.drawingIndex = 0;
/*     */       }
/*     */     }
/*  88 */     if (!isHidden())
/*  89 */       g.drawImage(this.ballonImages[this.drawingIndex], this.locationx, this.locationy, 0);
/*     */   }
/*     */ 
/*     */   public void drawIndexOfRubber(Graphics g, int index)
/*     */   {
/*  94 */     this.drawingIndex = index;
/*  95 */     paint(g);
/*     */   }
/*     */ 
/*     */   public void freememory()
/*     */   {
/* 101 */     this.ballonImages = null;
/*     */   }
/*     */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veritechnolohy.elements.Ballon
 * JD-Core Version:    0.6.2
 */