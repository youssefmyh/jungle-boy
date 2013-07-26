/*     */ package com.veritechnolohy.Screens;
/*     */ 
/*     */ import com.veritechnology.engine.ImageLoader;
/*     */ import com.veritechnolohy.elements.World;
/*     */ import com.veritechnolohy.elements.homeButton;
/*     */ import com.veritechnolohy.elements.pauseButton;
/*     */ import com.veritechnolohy.main.JungleBoy;
/*     */ import java.io.PrintStream;
/*     */ import javax.microedition.lcdui.Canvas;
/*     */ import javax.microedition.lcdui.Display;
/*     */ import javax.microedition.lcdui.Graphics;
/*     */ import javax.microedition.lcdui.Image;
/*     */ 
/*     */ public class AboutScreen extends Canvas
/*     */ {
/*     */   World[] levelsNumbers;
/*     */   int levelSelectionType;
/*     */   private Image backgroundIMage;
/*     */   homeButton homeBtn;
/*     */   pauseButton pause;
/*     */ 
/*     */   public AboutScreen(int levelSelectionType)
/*     */   {
/*  32 */     setFullScreenMode(true);
/*  33 */     this.levelSelectionType = levelSelectionType;
/*  34 */     this.backgroundIMage = ImageLoader.loadImage("aboutbg");
/*  35 */     this.homeBtn = new homeButton();
/*     */   }
/*     */ 
/*     */   protected void pointerPressed(int x, int y)
/*     */   {
/*  41 */     super.pointerPressed(x, y);
/*     */   }
/*     */ 
/*     */   protected void pointerDragged(int x, int y)
/*     */   {
/*  50 */     super.pointerDragged(x, y);
/*     */   }
/*     */ 
/*     */   protected void pointerReleased(int x, int y) {
/*  54 */     super.pointerReleased(x, y);
/*     */ 
/*  56 */     if (this.levelsNumbers != null) {
/*  57 */       for (int i = 0; i < this.levelsNumbers.length; i++)
/*     */       {
/*  59 */         World _level = this.levelsNumbers[i];
/*  60 */         _level.setSelected(false);
/*  61 */         if ((x >= _level.locationx) && (x < _level.locationx + _level.elemntWidth) && (y >= _level.locationy) && (y < _level.locationy + _level.elementHeight))
/*     */         {
/*  67 */           System.out.println("levelSelected is " + (i + 1));
/*  68 */           loadLevel(i);
/*  69 */           break;
/*     */         }
/*     */       }
/*     */     }
/*  73 */     if ((this.homeBtn != null) && 
/*  74 */       (x >= this.homeBtn.locationx) && (x < this.homeBtn.locationx + this.homeBtn.elemntWidth) && (y >= this.homeBtn.locationy) && (y < this.homeBtn.locationy + this.homeBtn.elementHeight))
/*     */     {
/*  79 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new PlayOrOption(0));
/*  80 */       freeMemory();
/*     */     }
/*     */   }
/*     */ 
/*     */   public void freeMemory()
/*     */   {
/*  93 */     this.levelsNumbers = null;
/*  94 */     this.backgroundIMage = null;
/*  95 */     this.homeBtn = null;
/*  96 */     System.gc();
/*     */   }
/*     */ 
/*     */   public void paint(Graphics g)
/*     */   {
/* 110 */     if (getHeight() <= getWidth())
/*     */     {
/* 112 */       g.drawImage(ImageLoader.getPortraitImage(), 0, 0, 0);
/*     */     }
/* 116 */     else if (this.backgroundIMage != null) {
/* 117 */       g.drawImage(this.backgroundIMage, 0, 0, 0);
/* 118 */       this.homeBtn.paint(g);
/*     */     }
/*     */   }
/*     */ 
/*     */   public void loadLevel(int theLevelNumber)
/*     */   {
/* 126 */     com.veritechnology.engine.Constants.currentWorldSelection = theLevelNumber;
/* 127 */     Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new LevelsSelection(theLevelNumber * 10));
/* 128 */     freeMemory();
/*     */   }
/*     */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veritechnolohy.Screens.AboutScreen
 * JD-Core Version:    0.6.2
 */