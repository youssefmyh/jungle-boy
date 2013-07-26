/*    */ package com.veritechnolohy.elements;
/*    */ 
/*    */ import com.veritechnology.engine.Constants;
/*    */ import com.veritechnology.engine.ImageLoader;
/*    */ import com.veritechnology.engine.releaseObject;
/*    */ import javax.microedition.lcdui.Graphics;
/*    */ import javax.microedition.lcdui.Image;
/*    */ 
/*    */ public class DragAndDrop extends MainElement
/*    */   implements releaseObject
/*    */ {
/*    */   private Image bazaza;
/*    */ 
/*    */   public DragAndDrop()
/*    */   {
/* 27 */     super(Constants.EATINGELEMENT);
/* 28 */     setFixedElement(true);
/* 29 */     this.bazaza = ImageLoader.loadImage("draganddrop");
/* 30 */     this.locationx = 300;
/* 31 */     this.locationy = 500;
/* 32 */     this.elemntWidth = this.bazaza.getWidth();
/* 33 */     this.elementHeight = this.bazaza.getHeight();
/*    */   }
/*    */ 
/*    */   public void paint(Graphics g)
/*    */   {
/* 40 */     if (this.hidden)
/* 41 */       return;
/* 42 */     g.drawImage(this.bazaza, this.locationx, this.locationy, 0);
/*    */   }
/*    */ 
/*    */   public void freeElement()
/*    */   {
/* 47 */     super.freeElement();
/* 48 */     this.bazaza = null;
/*    */   }
/*    */ 
/*    */   public void freememory()
/*    */   {
/* 53 */     this.bazaza = null;
/*    */   }
/*    */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veritechnolohy.elements.DragAndDrop
 * JD-Core Version:    0.6.2
 */