/*    */ package com.veritechnolohy.elements;
/*    */ 
/*    */ import com.veritechnology.engine.Constants;
/*    */ import com.veritechnology.engine.ImageLoader;
/*    */ import com.veritechnology.engine.releaseObject;
/*    */ import java.io.PrintStream;
/*    */ import javax.microedition.lcdui.Graphics;
/*    */ import javax.microedition.lcdui.Image;
/*    */ 
/*    */ public class board extends MainElement
/*    */   implements releaseObject
/*    */ {
/*    */   private Image bazaza;
/*    */   private Image levelNumberimg;
/*    */ 
/*    */   public board(int levelNumber)
/*    */   {
/* 28 */     super(Constants.NONEATINGELEMENT);
/* 29 */     setFixedElement(true);
/* 30 */     this.bazaza = ImageLoader.loadImage("board");
/* 31 */     levelNumber++;
/* 32 */     if ((levelNumber > 10) && (levelNumber < 21))
/* 33 */       levelNumber -= 10;
/* 34 */     if (levelNumber > 20) {
/* 35 */       levelNumber -= 20;
/*    */     }
/* 37 */     System.out.println("the level number is " + levelNumber);
/* 38 */     this.levelNumberimg = ImageLoader.loadImage("" + levelNumber);
/*    */ 
/* 41 */     this.locationx = 200;
/* 42 */     this.locationy = 0;
/* 43 */     this.elemntWidth = this.bazaza.getWidth();
/* 44 */     this.elementHeight = this.bazaza.getHeight();
/*    */   }
/*    */ 
/*    */   public void paint(Graphics g)
/*    */   {
/* 52 */     g.drawImage(this.bazaza, this.locationx, this.locationy, 0);
/* 53 */     g.drawImage(this.levelNumberimg, this.locationx + 20, this.locationy + 28, 0);
/*    */   }
/*    */ 
/*    */   public void freeElement()
/*    */   {
/* 58 */     super.freeElement();
/* 59 */     this.bazaza = null;
/*    */   }
/*    */ 
/*    */   public void freememory()
/*    */   {
/* 64 */     this.bazaza = null;
/*    */   }
/*    */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veritechnolohy.elements.board
 * JD-Core Version:    0.6.2
 */