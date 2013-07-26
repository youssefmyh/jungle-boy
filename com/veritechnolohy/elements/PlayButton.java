/*    */ package com.veritechnolohy.elements;
/*    */ 
/*    */ import com.veritechnology.engine.Constants;
/*    */ import com.veritechnology.engine.ImageLoader;
/*    */ import com.veritechnology.engine.releaseObject;
/*    */ import javax.microedition.lcdui.Graphics;
/*    */ import javax.microedition.lcdui.Image;
/*    */ 
/*    */ public class PlayButton extends MainElement
/*    */   implements releaseObject
/*    */ {
/*    */   private Image pauseImage;
/*    */ 
/*    */   public PlayButton()
/*    */   {
/* 24 */     super(Constants.BUTTON);
/* 25 */     setFixedElement(true);
/* 26 */     this.pauseImage = ImageLoader.loadImage("play_btn");
/* 27 */     this.locationx = 12;
/* 28 */     this.locationy = 12;
/* 29 */     this.elemntWidth = this.pauseImage.getWidth();
/* 30 */     this.elementHeight = this.pauseImage.getHeight();
/*    */   }
/*    */ 
/*    */   public void paint(Graphics g)
/*    */   {
/* 36 */     g.drawImage(this.pauseImage, this.locationx, this.locationy, 0);
/*    */   }
/*    */ 
/*    */   public void freememory() {
/* 40 */     this.pauseImage = null;
/*    */   }
/*    */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veritechnolohy.elements.PlayButton
 * JD-Core Version:    0.6.2
 */