/*    */ package com.veritechnolohy.elements;
/*    */ 
/*    */ import com.veritechnology.engine.Constants;
/*    */ import com.veritechnology.engine.ImageLoader;
/*    */ import com.veritechnology.engine.releaseObject;
/*    */ import javax.microedition.lcdui.Graphics;
/*    */ import javax.microedition.lcdui.Image;
/*    */ 
/*    */ public class SEREER extends MainElement
/*    */   implements releaseObject
/*    */ {
/*    */   private Image sereer;
/*    */   private boolean withBaby;
/*    */   private Image sereerWithBaby;
/*    */ 
/*    */   public boolean isWithBaby()
/*    */   {
/* 24 */     return this.withBaby;
/*    */   }
/*    */ 
/*    */   public void setWithBaby(boolean withBaby) {
/* 28 */     this.withBaby = withBaby;
/*    */   }
/*    */ 
/*    */   public SEREER()
/*    */   {
/* 34 */     super(Constants.SEREEEEER);
/* 35 */     setFixedElement(true);
/* 36 */     this.sereer = ImageLoader.loadImage("BED_03");
/* 37 */     this.locationx = 300;
/* 38 */     this.locationy = 500;
/* 39 */     this.elemntWidth = this.sereer.getWidth();
/* 40 */     this.elementHeight = this.sereer.getHeight();
/* 41 */     this.sereerWithBaby = ImageLoader.loadImage("bedwithbolbol");
/*    */   }
/*    */ 
/*    */   public void paint(Graphics g)
/*    */   {
/* 47 */     if (this.hidden)
/* 48 */       return;
/* 49 */     if (!this.withBaby)
/*    */     {
/* 52 */       g.drawImage(this.sereer, this.locationx, this.locationy, 0);
/*    */     }
/*    */     else
/*    */     {
/* 57 */       g.drawImage(this.sereerWithBaby, this.locationx, this.locationy, 0);
/*    */     }
/*    */   }
/*    */ 
/*    */   public void freeElement()
/*    */   {
/* 63 */     super.freeElement();
/* 64 */     this.sereer = null;
/*    */   }
/*    */ 
/*    */   public void freememory()
/*    */   {
/* 69 */     this.sereer = null;
/*    */   }
/*    */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veritechnolohy.elements.SEREER
 * JD-Core Version:    0.6.2
 */