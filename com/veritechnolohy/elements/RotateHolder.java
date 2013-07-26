/*    */ package com.veritechnolohy.elements;
/*    */ 
/*    */ import com.veritechnology.engine.Constants;
/*    */ import com.veritechnology.engine.ImageLoader;
/*    */ import com.veritechnology.engine.releaseObject;
/*    */ import javax.microedition.lcdui.Graphics;
/*    */ import javax.microedition.lcdui.Image;
/*    */ 
/*    */ public class RotateHolder extends MainElement
/*    */   implements releaseObject
/*    */ {
/*    */   private Image[] rotateHolder;
/*    */   private int currentSelectedEelemnt;
/*    */   private boolean isAnimated;
/*    */ 
/*    */   public boolean isIsAnimated()
/*    */   {
/* 26 */     return this.isAnimated;
/*    */   }
/*    */ 
/*    */   public void setIsAnimated(boolean isAnimated) {
/* 30 */     this.isAnimated = isAnimated;
/*    */   }
/*    */ 
/*    */   public RotateHolder() {
/* 34 */     super(Constants.HOLDER);
/* 35 */     setFixedElement(true);
/* 36 */     this.rotateHolder = new Image[5];
/* 37 */     for (int i = 0; i < this.rotateHolder.length; i++) {
/* 38 */       this.rotateHolder[i] = ImageLoader.loadImage("rholder0" + i);
/*    */     }
/* 40 */     this.locationx = 100;
/* 41 */     this.locationy = 70;
/* 42 */     this.elemntWidth = this.rotateHolder[0].getWidth();
/* 43 */     this.elementHeight = this.rotateHolder[0].getHeight();
/*    */   }
/*    */ 
/*    */   public void paint(Graphics g)
/*    */   {
/* 51 */     if (this.isAnimated) {
/* 52 */       if (this.currentSelectedEelemnt < this.rotateHolder.length - 1)
/*    */       {
/* 54 */         this.currentSelectedEelemnt += 1;
/*    */       }
/*    */       else
/*    */       {
/* 60 */         this.isAnimated = false;
/*    */       }
/*    */     }
/* 63 */     g.drawImage(this.rotateHolder[this.currentSelectedEelemnt], this.locationx, this.locationy, 0);
/*    */   }
/*    */ 
/*    */   public void freememory() {
/* 67 */     this.rotateHolder = null;
/*    */   }
/*    */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veritechnolohy.elements.RotateHolder
 * JD-Core Version:    0.6.2
 */