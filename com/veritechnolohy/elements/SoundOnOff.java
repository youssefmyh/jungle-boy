/*    */ package com.veritechnolohy.elements;
/*    */ 
/*    */ import com.veritechnology.engine.Constants;
/*    */ import com.veritechnology.engine.ImageLoader;
/*    */ import com.veritechnology.engine.releaseObject;
/*    */ import javax.microedition.lcdui.Graphics;
/*    */ import javax.microedition.lcdui.Image;
/*    */ 
/*    */ public class SoundOnOff extends MainElement
/*    */   implements releaseObject
/*    */ {
/*    */   private Image onButton;
/*    */   private Image offButton;
/*    */   public boolean on;
/*    */ 
/*    */   public boolean isOn()
/*    */   {
/* 25 */     return this.on;
/*    */   }
/*    */ 
/*    */   public void setOn(boolean on) {
/* 29 */     this.on = on;
/*    */   }
/*    */ 
/*    */   public SoundOnOff()
/*    */   {
/* 34 */     super(Constants.BUTTON);
/* 35 */     setFixedElement(true);
/* 36 */     this.onButton = ImageLoader.loadImage("sound_on");
/* 37 */     this.offButton = ImageLoader.loadImage("sound_off");
/* 38 */     this.locationx = 285;
/* 39 */     this.locationy = 13;
/* 40 */     this.elemntWidth = (this.onButton.getWidth() + 30);
/* 41 */     this.elementHeight = (this.onButton.getHeight() + 30);
/*    */   }
/*    */ 
/*    */   public void paint(Graphics g)
/*    */   {
/* 48 */     if (this.on)
/* 49 */       g.drawImage(this.onButton, this.locationx, this.locationy, 0);
/*    */     else
/* 51 */       g.drawImage(this.offButton, this.locationx, this.locationy, 0);
/*    */   }
/*    */ 
/*    */   public void freememory() {
/* 55 */     this.onButton = null;
/* 56 */     this.offButton = null;
/*    */   }
/*    */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veritechnolohy.elements.SoundOnOff
 * JD-Core Version:    0.6.2
 */