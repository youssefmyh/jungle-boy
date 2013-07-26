/*    */ package com.veritechnolohy.elements;
/*    */ 
/*    */ import com.veritechnology.engine.Constants;
/*    */ import com.veritechnology.engine.releaseObject;
/*    */ import javax.microedition.lcdui.Graphics;
/*    */ import javax.microedition.lcdui.Image;
/*    */ 
/*    */ public class SERERRFELEMT extends MainElement
/*    */   implements releaseObject
/*    */ {
/*    */   private Image sereer;
/*    */   private boolean withBaby;
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
/*    */   public void setLocationx(int locationx) {
/* 32 */     super.setLocationx(locationx);
/*    */   }
/*    */ 
/*    */   public void setLocationy(int locationy) {
/* 36 */     super.setLocationy(locationy);
/*    */   }
/*    */ 
/*    */   public SERERRFELEMT()
/*    */   {
/* 43 */     super(Constants.SEREEEEERSECONDELEMENT);
/*    */   }
/*    */ 
/*    */   public void paint(Graphics g)
/*    */   {
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
 * Qualified Name:     com.veritechnolohy.elements.SERERRFELEMT
 * JD-Core Version:    0.6.2
 */