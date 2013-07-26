/*     */ package com.veritechnolohy.elements;
/*     */ 
/*     */ import com.veritechnology.engine.Constants;
/*     */ import com.veritechnology.engine.ImageLoader;
/*     */ import com.veritechnology.engine.releaseObject;
/*     */ import javax.microedition.lcdui.Graphics;
/*     */ import javax.microedition.lcdui.Image;
/*     */ 
/*     */ public class Marwaha extends MainElement
/*     */   implements releaseObject
/*     */ {
/*     */   private Image[] marwhaImages;
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
/*     */   public Marwaha(int angle)
/*     */   {
/*  44 */     super(Constants.MARWHAA);
/*  45 */     this.angle = angle;
/*  46 */     this.locationx = 28;
/*  47 */     this.locationy = 240;
/*  48 */     this.marwhaImages = new Image[Constants.MARWHANUMBER];
/*  49 */     for (int i = 0; i < this.marwhaImages.length; i++)
/*     */     {
/*  51 */       if (angle <= 0)
/*  52 */         this.marwhaImages[i] = ImageLoader.loadImage("marwha/fan000" + (i + 1));
/*     */       else {
/*  54 */         this.marwhaImages[i] = ImageLoader.loadImage("marwha-1/fan000" + (i + 1));
/*     */       }
/*     */     }
/*  57 */     this.elemntWidth = this.marwhaImages[0].getWidth();
/*  58 */     this.elementHeight = this.marwhaImages[0].getHeight();
/*     */   }
/*     */ 
/*     */   public boolean isContainPointes(int x, int y)
/*     */   {
/*  67 */     return false;
/*     */   }
/*     */ 
/*     */   public void animate()
/*     */   {
/*     */   }
/*     */ 
/*     */   public void paint(Graphics g)
/*     */   {
/*  82 */     if (this.drawingIndex < this.marwhaImages.length - 1)
/*     */     {
/*  84 */       this.drawingIndex += 1;
/*     */     }
/*     */     else
/*     */     {
/*  88 */       this.animate = false;
/*  89 */       this.drawingIndex = 0;
/*     */     }
/*     */ 
/*  93 */     g.drawImage(this.marwhaImages[this.drawingIndex], this.locationx, this.locationy, 0);
/*     */   }
/*     */ 
/*     */   public void drawIndexOfRubber(Graphics g, int index)
/*     */   {
/*  98 */     this.drawingIndex = index;
/*  99 */     paint(g);
/*     */   }
/*     */ 
/*     */   public void freememory() {
/* 103 */     this.marwhaImages = null;
/*     */   }
/*     */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veritechnolohy.elements.Marwaha
 * JD-Core Version:    0.6.2
 */