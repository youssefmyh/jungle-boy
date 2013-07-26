/*     */ package com.veritechnolohy.elements;
/*     */ 
/*     */ import com.veritechnology.engine.Constants;
/*     */ import com.veritechnology.engine.ImageLoader;
/*     */ import com.veritechnology.engine.releaseObject;
/*     */ import javax.microedition.lcdui.Graphics;
/*     */ import javax.microedition.lcdui.Image;
/*     */ 
/*     */ public class MoveBlock extends MainElement
/*     */   implements releaseObject
/*     */ {
/*     */   private Image[] ballonImages;
/*     */   public int drawingIndex;
/*     */   private boolean animate;
/*     */   int angle;
/*  25 */   boolean right = true;
/*     */ 
/*     */   public int getAngle() {
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
/*     */   public MoveBlock(int angle)
/*     */   {
/*  44 */     super(Constants.MOVEBLOCK);
/*  45 */     setFixedElement(true);
/*  46 */     this.angle = angle;
/*  47 */     this.locationx = 28;
/*  48 */     this.locationy = 240;
/*  49 */     this.ballonImages = new Image[1];
/*  50 */     for (int i = 0; i < this.ballonImages.length; i++) {
/*  51 */       this.ballonImages[i] = ImageLoader.loadImage("movetoob");
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
/*  91 */     if (this.locationx + this.elemntWidth < 360) {
/*  92 */       this.locationx += 3;
/*     */     }
/*     */     else
/*     */     {
/*  96 */       this.right = false;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void decrementX()
/*     */   {
/* 104 */     if (this.locationx + this.elemntWidth > 0) {
/* 105 */       this.locationx -= 3;
/*     */     }
/*     */     else
/*     */     {
/* 109 */       this.right = true;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void drawIndexOfRubber(Graphics g, int index)
/*     */   {
/* 117 */     this.drawingIndex = index;
/* 118 */     paint(g);
/*     */   }
/*     */ 
/*     */   public void freememory() {
/* 122 */     this.ballonImages = null;
/*     */   }
/*     */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veritechnolohy.elements.MoveBlock
 * JD-Core Version:    0.6.2
 */