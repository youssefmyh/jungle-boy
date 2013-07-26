/*    */ package com.veritechnolohy.elements;
/*    */ 
/*    */ import com.veritechnology.engine.Constants;
/*    */ import com.veritechnology.engine.ImageLoader;
/*    */ import com.veritechnology.engine.releaseObject;
/*    */ import javax.microedition.lcdui.Graphics;
/*    */ import javax.microedition.lcdui.Image;
/*    */ 
/*    */ public class World extends MainElement
/*    */   implements releaseObject
/*    */ {
/*    */   int starNummber;
/*    */   public boolean Selected;
/*    */   private Image levelNumber;
/*    */   private Image levelNumber_selected;
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
/*    */   public World(int stNumber, int lNumber)
/*    */   {
/* 37 */     super(Constants.EATINGELEMENT);
/* 38 */     this.starNummber = stNumber;
/* 39 */     this.lNumber = lNumber;
/* 40 */     this.levelNumber = ImageLoader.loadImage("world" + lNumber);
/* 41 */     this.levelNumber_selected = ImageLoader.loadImage("world_" + lNumber + "_sc");
/*    */ 
/* 43 */     this.elemntWidth = this.levelNumber.getWidth();
/* 44 */     this.elementHeight = this.levelNumber.getHeight();
/*    */   }
/*    */ 
/*    */   public void paint(Graphics g)
/*    */   {
/* 51 */     if (this.hidden) {
/* 52 */       return;
/*    */     }
/*    */ 
/* 55 */     g.setColor(7370190);
/* 56 */     if (isSelected())
/*    */     {
/* 59 */       g.drawImage(this.levelNumber_selected, this.locationx, this.locationy, 0);
/*    */     }
/*    */     else
/* 62 */       g.drawImage(this.levelNumber, this.locationx, this.locationy, 0);
/*    */   }
/*    */ 
/*    */   public void freeElement()
/*    */   {
/* 68 */     super.freeElement();
/* 69 */     this.levelNumber = null;
/*    */   }
/*    */ 
/*    */   public void freememory()
/*    */   {
/*    */   }
/*    */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veritechnolohy.elements.World
 * JD-Core Version:    0.6.2
 */