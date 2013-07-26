/*    */ package com.veritechnolohy.elements;
/*    */ 
/*    */ import com.veritechnology.engine.Constants;
/*    */ import com.veritechnology.engine.ImageLoader;
/*    */ import com.veritechnology.engine.releaseObject;
/*    */ import java.util.Random;
/*    */ import javax.microedition.lcdui.Graphics;
/*    */ import javax.microedition.lcdui.Image;
/*    */ 
/*    */ public class Bazaza extends MainElement
/*    */   implements releaseObject
/*    */ {
/*    */   private Image bazaza;
/*    */ 
/*    */   public Bazaza()
/*    */   {
/* 28 */     super(Constants.EATINGELEMENT);
/* 29 */     setFixedElement(true);
/* 30 */     int randomNumber = new Random().nextInt(7);
/* 31 */     this.bazaza = ImageLoader.loadImage("element" + randomNumber);
/* 32 */     this.locationx = 300;
/* 33 */     this.locationy = 500;
/* 34 */     this.elemntWidth = this.bazaza.getWidth();
/* 35 */     this.elementHeight = this.bazaza.getHeight();
/*    */   }
/*    */ 
/*    */   public void paint(Graphics g)
/*    */   {
/* 42 */     if (this.hidden)
/* 43 */       return;
/* 44 */     g.drawImage(this.bazaza, this.locationx, this.locationy, 0);
/*    */   }
/*    */ 
/*    */   public void freeElement()
/*    */   {
/* 49 */     super.freeElement();
/* 50 */     this.bazaza = null;
/*    */   }
/*    */ 
/*    */   public void freememory()
/*    */   {
/* 55 */     this.bazaza = null;
/*    */   }
/*    */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veritechnolohy.elements.Bazaza
 * JD-Core Version:    0.6.2
 */