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
/*     */ public class WorldSelection extends Canvas
/*     */ {
/*     */   World[] levelsNumbers;
/*     */   int levelSelectionType;
/*     */   private Image backgroundIMage;
/*     */   homeButton homeBtn;
/*     */   pauseButton pause;
/*     */ 
/*     */   public WorldSelection(int levelSelectionType)
/*     */   {
/*  31 */     setFullScreenMode(true);
/*  32 */     this.levelSelectionType = levelSelectionType;
/*  33 */     this.backgroundIMage = ImageLoader.loadImage("selctions");
/*  34 */     this.homeBtn = new homeButton();
/*  35 */     this.levelsNumbers = new World[3];
/*     */ 
/*  37 */     for (int i = 0; i < this.levelsNumbers.length; i++)
/*     */     {
/*  39 */       this.levelsNumbers[i] = new World(0, i + 1);
/*  40 */       this.levelsNumbers[i].setLocationx(25 + i * this.levelsNumbers[i].elemntWidth + (i + 1) * 5);
/*  41 */       this.levelsNumbers[i].setLocationy(400);
/*     */     }
/*     */   }
/*     */ 
/*     */   protected void pointerPressed(int x, int y)
/*     */   {
/*  47 */     super.pointerPressed(x, y);
/*     */ 
/*  49 */     for (int i = 0; i < this.levelsNumbers.length; i++)
/*     */     {
/*  51 */       World _level = this.levelsNumbers[i];
/*  52 */       _level.setSelected(false);
/*  53 */       if ((x >= _level.locationx) && (x < _level.locationx + _level.elemntWidth) && (y >= _level.locationy) && (y < _level.locationy + _level.elementHeight))
/*     */       {
/*  58 */         _level.setSelected(true);
/*  59 */         System.out.println("levelSelected is " + (i + 1));
/*  60 */         break;
/*     */       }
/*     */ 
/*     */     }
/*     */ 
/*  65 */     repaint();
/*     */   }
/*     */ 
/*     */   protected void pointerDragged(int x, int y)
/*     */   {
/*  71 */     super.pointerDragged(x, y);
/*     */   }
/*     */ 
/*     */   protected void pointerReleased(int x, int y) {
/*  75 */     super.pointerReleased(x, y);
/*     */ 
/*  77 */     if (this.levelsNumbers != null) {
/*  78 */       for (int i = 0; i < this.levelsNumbers.length; i++)
/*     */       {
/*  80 */         World _level = this.levelsNumbers[i];
/*  81 */         _level.setSelected(false);
/*  82 */         if ((x >= _level.locationx) && (x < _level.locationx + _level.elemntWidth) && (y >= _level.locationy) && (y < _level.locationy + _level.elementHeight))
/*     */         {
/*  88 */           System.out.println("levelSelected is " + (i + 1));
/*  89 */           loadLevel(i);
/*  90 */           break;
/*     */         }
/*     */       }
/*     */     }
/*  94 */     if ((this.homeBtn != null) && 
/*  95 */       (x >= this.homeBtn.locationx) && (x < this.homeBtn.locationx + this.homeBtn.elemntWidth) && (y >= this.homeBtn.locationy) && (y < this.homeBtn.locationy + this.homeBtn.elementHeight))
/*     */     {
/* 100 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new PlayOrOption(0));
/* 101 */       freeMemory();
/*     */     }
/*     */   }
/*     */ 
/*     */   public void freeMemory()
/*     */   {
/* 114 */     this.levelsNumbers = null;
/* 115 */     this.backgroundIMage = null;
/* 116 */     this.homeBtn = null;
/* 117 */     System.gc();
/*     */   }
/*     */ 
/*     */   public void paint(Graphics g)
/*     */   {
/* 125 */     if (getHeight() <= getWidth())
/*     */     {
/* 127 */       g.drawImage(ImageLoader.getPortraitImage(), 0, 0, 0);
/*     */     }
/*     */     else {
/* 130 */       if (this.backgroundIMage != null) {
/* 131 */         g.drawImage(this.backgroundIMage, 0, 0, 0);
/* 132 */         this.homeBtn.paint(g);
/*     */       }
/* 134 */       for (int i = 0; i < this.levelsNumbers.length; i++)
/*     */       {
/* 136 */         this.levelsNumbers[i].paint(g);
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public void loadLevel(int theLevelNumber)
/*     */   {
/* 145 */     com.veritechnology.engine.Constants.currentWorldSelection = theLevelNumber;
/* 146 */     Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new LevelsSelection(theLevelNumber * 10));
/* 147 */     freeMemory();
/*     */   }
/*     */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veritechnolohy.Screens.WorldSelection
 * JD-Core Version:    0.6.2
 */