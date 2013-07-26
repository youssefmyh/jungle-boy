/*    */ package com.veritechnolohy.elements;
/*    */ 
/*    */ import com.veritechnology.engine.Constants;
/*    */ import com.veritechnology.engine.ImageLoader;
/*    */ import com.veritechnology.engine.releaseObject;
/*    */ import javax.microedition.lcdui.Graphics;
/*    */ import javax.microedition.lcdui.Image;
/*    */ 
/*    */ public class TOOB extends MainElement
/*    */   implements releaseObject
/*    */ {
/*    */   private Image blocks;
/*    */   public int drawingIndex;
/*    */   private boolean animate;
/*    */   int angle;
/*    */ 
/*    */   public int getAngle()
/*    */   {
/* 28 */     return this.angle;
/*    */   }
/*    */ 
/*    */   public void setAngle(int angle) {
/* 32 */     this.angle = angle;
/*    */   }
/*    */   public boolean isAnimate() {
/* 35 */     return this.animate;
/*    */   }
/*    */ 
/*    */   public void setAnimate(boolean animate) {
/* 39 */     this.animate = animate;
/*    */   }
/*    */ 
/*    */   public TOOB()
/*    */   {
/* 44 */     super(Constants.TOOB);
/* 45 */     this.angle = this.angle;
/*    */ 
/* 47 */     this.blocks = ImageLoader.loadImage("toob");
/*    */ 
/* 51 */     this.elemntWidth = this.blocks.getWidth();
/* 52 */     this.elementHeight = this.blocks.getHeight();
/*    */   }
/*    */ 
/*    */   public boolean isContainPointes(int x, int y)
/*    */   {
/* 61 */     return false;
/*    */   }
/*    */ 
/*    */   public void animate()
/*    */   {
/*    */   }
/*    */ 
/*    */   public void paint(Graphics g)
/*    */   {
/* 77 */     g.drawImage(this.blocks, this.locationx, this.locationy, 0);
/*    */   }
/*    */ 
/*    */   public void drawIndexOfRubber(Graphics g, int index)
/*    */   {
/* 82 */     this.drawingIndex = index;
/* 83 */     paint(g);
/*    */   }
/*    */ 
/*    */   public void freememory() {
/* 87 */     this.blocks = null;
/*    */   }
/*    */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veritechnolohy.elements.TOOB
 * JD-Core Version:    0.6.2
 */