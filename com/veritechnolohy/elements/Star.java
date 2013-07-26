/*    */ package com.veritechnolohy.elements;
/*    */ 
/*    */ import com.veritechnology.engine.Constants;
/*    */ import com.veritechnology.engine.ImageLoader;
/*    */ import com.veritechnology.engine.releaseObject;
/*    */ import javax.microedition.lcdui.Graphics;
/*    */ import javax.microedition.lcdui.Image;
/*    */ 
/*    */ public class Star extends MainElement
/*    */   implements releaseObject
/*    */ {
/*    */   private Image starImage;
/*    */   boolean isStar;
/*    */ 
/*    */   public Star(boolean instar)
/*    */   {
/* 28 */     super(Constants.EATINGELEMENT);
/* 29 */     this.isStar = instar;
/* 30 */     setFixedElement(true);
/* 31 */     if (instar)
/* 32 */       this.starImage = ImageLoader.loadImage("star1");
/*    */     else {
/* 34 */       this.starImage = ImageLoader.loadImage("star0");
/*    */     }
/* 36 */     this.locationx = 300;
/* 37 */     this.locationy = 500;
/* 38 */     this.elemntWidth = this.starImage.getWidth();
/* 39 */     this.elementHeight = this.starImage.getHeight();
/*    */   }
/*    */ 
/*    */   public void paint(Graphics g)
/*    */   {
/* 46 */     if (this.hidden)
/* 47 */       return;
/* 48 */     g.drawImage(this.starImage, this.locationx, this.locationy, 0);
/*    */   }
/*    */ 
/*    */   public void freeElement()
/*    */   {
/* 53 */     super.freeElement();
/* 54 */     this.starImage = null;
/*    */   }
/*    */ 
/*    */   public void freememory()
/*    */   {
/* 59 */     this.starImage = null;
/*    */   }
/*    */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veritechnolohy.elements.Star
 * JD-Core Version:    0.6.2
 */