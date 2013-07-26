/*    */ package com.veritechnolohy.elements;
/*    */ 
/*    */ import com.veritechnology.engine.Constants;
/*    */ import com.veritechnology.engine.ImageLoader;
/*    */ import com.veritechnology.engine.releaseObject;
/*    */ import javax.microedition.lcdui.Graphics;
/*    */ import javax.microedition.lcdui.Image;
/*    */ 
/*    */ public class Holder extends MainElement
/*    */   implements releaseObject
/*    */ {
/*    */   private Image holder;
/*    */ 
/*    */   public Holder()
/*    */   {
/* 24 */     super(Constants.HOLDER);
/* 25 */     setFixedElement(true);
/* 26 */     this.holder = ImageLoader.loadImage("holder");
/* 27 */     this.locationx = 0;
/* 28 */     this.locationy = 85;
/* 29 */     this.elemntWidth = this.holder.getWidth();
/* 30 */     this.elementHeight = this.holder.getHeight();
/*    */   }
/*    */ 
/*    */   public void paint(Graphics g)
/*    */   {
/* 36 */     g.drawImage(this.holder, this.locationx, this.locationy, 0);
/*    */   }
/*    */ 
/*    */   public void freememory() {
/* 40 */     this.holder = null;
/*    */   }
/*    */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veritechnolohy.elements.Holder
 * JD-Core Version:    0.6.2
 */