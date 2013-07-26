/*     */ package com.veritechnolohy.elements;
/*     */ 
/*     */ import com.veritechnology.engine.Constants;
/*     */ import com.veritechnology.engine.ImageLoader;
/*     */ import com.veritechnology.engine.SoundLoader;
/*     */ import com.veritechnology.engine.releaseObject;
/*     */ import javax.microedition.lcdui.Graphics;
/*     */ import javax.microedition.lcdui.Image;
/*     */ 
/*     */ public class ElectricalwithAngle extends MainElement
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
/*     */   public ElectricalwithAngle(int angle)
/*     */   {
/*  45 */     super(Constants.ELECTRICAL);
/*  46 */     this.angle = angle;
/*  47 */     setFixedElement(true);
/*  48 */     this.locationx = 28;
/*  49 */     this.locationy = 240;
/*  50 */     this.ballonImages = new Image[1];
/*  51 */     if (angle < 0) {
/*  52 */       for (int i = 0; i < this.ballonImages.length; i++)
/*  53 */         this.ballonImages[i] = ImageLoader.loadImage("bigkahrabaleft");
/*     */     }
/*     */     else {
/*  56 */       for (int i = 0; i < this.ballonImages.length; i++) {
/*  57 */         this.ballonImages[i] = ImageLoader.loadImage("bigkahrabaright");
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
/* 101 */     if ((++this.incremental > 20) && (this.incremental < 80)) {
/* 102 */       setHidden(true);
/*     */     }
/*     */     else
/*     */     {
/* 106 */       setHidden(false);
/*     */     }
/*     */ 
/* 109 */     if (this.incremental > 50)
/*     */     {
/* 111 */       this.incremental = 0;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void decrementX()
/*     */   {
/* 119 */     if (this.locationx + this.elemntWidth > 0) {
/* 120 */       this.locationx -= 3;
/*     */     }
/*     */     else
/*     */     {
/* 124 */       this.right = true;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void drawIndexOfRubber(Graphics g, int index)
/*     */   {
/* 132 */     this.drawingIndex = index;
/* 133 */     paint(g);
/*     */   }
/*     */ 
/*     */   public void freememory() {
/* 137 */     this.ballonImages = null;
/*     */   }
/*     */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veritechnolohy.elements.ElectricalwithAngle
 * JD-Core Version:    0.6.2
 */