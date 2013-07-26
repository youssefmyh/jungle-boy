/*    */ package com.veritechnolohy.elements;
/*    */ 
/*    */ import com.veritechnology.engine.Constants;
/*    */ import com.veritechnology.engine.ImageLoader;
/*    */ import com.veritechnology.engine.releaseObject;
/*    */ import javax.microedition.lcdui.Graphics;
/*    */ import javax.microedition.lcdui.Image;
/*    */ 
/*    */ public class LevelNumber extends MainElement
/*    */   implements releaseObject
/*    */ {
/*    */   int starNummber;
/*    */   public boolean Selected;
/*    */   private Image levelImage;
/*    */   private Image levelImage_sc;
/*    */   private Image levelNumber;
/*    */   int lNumber;
/*    */ 
/*    */   public boolean isSelected()
/*    */   {
/* 24 */     return this.Selected;
/*    */   }
/*    */ 
/*    */   public void setSelected(boolean Selected) {
/* 28 */     this.Selected = Selected;
/*    */   }
/*    */ 
/*    */   public LevelNumber(int stNumber, int lNumber)
/*    */   {
/* 37 */     super(Constants.EATINGELEMENT);
/* 38 */     this.starNummber = stNumber;
/* 39 */     this.lNumber = lNumber;
/* 40 */     this.levelNumber = ImageLoader.loadImage("" + lNumber);
/* 41 */     setFixedElement(true);
/* 42 */     this.levelImage = ImageLoader.loadLevel(stNumber);
/* 43 */     this.levelImage_sc = ImageLoader.loadLevel_SC(stNumber);
/* 44 */     this.elemntWidth = this.levelImage.getWidth();
/* 45 */     this.elementHeight = this.levelImage.getHeight();
/*    */   }
/*    */ 
/*    */   public void paint(Graphics g)
/*    */   {
/* 52 */     if (this.hidden) {
/* 53 */       return;
/*    */     }
/*    */ 
/* 56 */     g.setColor(7370190);
/* 57 */     if (isSelected()) {
/* 58 */       g.drawImage(this.levelImage_sc, this.locationx, this.locationy, 0);
/*    */     }
/*    */     else
/*    */     {
/* 63 */       g.drawImage(this.levelImage, this.locationx, this.locationy, 0);
/*    */     }
/* 65 */     g.drawImage(this.levelNumber, this.locationx, this.locationy, 0);
/*    */   }
/*    */ 
/*    */   public void freeElement() {
/* 69 */     super.freeElement();
/* 70 */     this.levelImage = null;
/*    */   }
/*    */ 
/*    */   public void freememory()
/*    */   {
/*    */   }
/*    */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veritechnolohy.elements.LevelNumber
 * JD-Core Version:    0.6.2
 */