/*     */ package com.veritechnolohy.Screens;
/*     */ 
/*     */ import com.veritechnology.engine.ImageLoader;
/*     */ import com.veritechnolohy.elements.MainElement;
/*     */ import com.veritechnolohy.elements.onOffButton;
/*     */ import com.veritechnolohy.elements.pauseButton;
/*     */ import com.veritechnolohy.main.JungleBoy;
/*     */ import java.io.PrintStream;
/*     */ import javax.microedition.lcdui.Canvas;
/*     */ import javax.microedition.lcdui.Display;
/*     */ import javax.microedition.lcdui.Font;
/*     */ import javax.microedition.lcdui.Graphics;
/*     */ import javax.microedition.lcdui.Image;
/*     */ 
/*     */ public class OptionScreen extends Canvas
/*     */ {
/*     */   private pauseButton option_button;
/*     */   MainElement[] levelsNumbers;
/*     */   int levelSelectionType;
/*     */   private Image backgroundIMage;
/*     */   onOffButton onOff;
/*     */ 
/*     */   public OptionScreen(int levelSelectionType)
/*     */   {
/*  33 */     setFullScreenMode(true);
/*  34 */     this.levelSelectionType = levelSelectionType;
/*  35 */     this.backgroundIMage = ImageLoader.loadImage("selctions");
/*  36 */     this.option_button = new pauseButton();
/*  37 */     this.levelsNumbers = new MainElement[1];
/*  38 */     this.levelsNumbers[0] = this.option_button;
/*     */ 
/*  40 */     this.onOff = new onOffButton();
/*  41 */     this.onOff.setLocationx(200);
/*  42 */     this.onOff.setLocationy(330);
/*  43 */     if (com.veritechnology.engine.LevelsStars.levelsstarts_num[30] == 0)
/*     */     {
/*  45 */       this.onOff.setOn(false);
/*     */     }
/*     */     else
/*  48 */       this.onOff.setOn(true);
/*     */   }
/*     */ 
/*     */   protected void pointerPressed(int x, int y)
/*     */   {
/*  56 */     if ((this.onOff != null) && 
/*  57 */       (x >= this.onOff.locationx) && (x < this.onOff.locationx + this.onOff.elemntWidth) && (y >= this.onOff.locationy) && (y < this.onOff.locationy + this.onOff.elementHeight))
/*     */     {
/*  62 */       this.onOff.setOn(!this.onOff.isOn());
/*  63 */       if (this.onOff.isOn())
/*     */       {
/*  65 */         com.veritechnology.engine.LevelsStars.levelsstarts_num[30] = 1;
/*     */       }
/*     */       else {
/*  68 */         com.veritechnology.engine.LevelsStars.levelsstarts_num[30] = 0;
/*     */       }
/*     */     }
/*  71 */     for (int i = 0; i < this.levelsNumbers.length; i++)
/*     */     {
/*  73 */       MainElement _level = this.levelsNumbers[i];
/*  74 */       if ((x >= _level.locationx) && (x < _level.locationx + _level.elemntWidth) && (y >= _level.locationy) && (y < _level.locationy + _level.elementHeight))
/*     */       {
/*  79 */         loadLevel(i);
/*  80 */         break;
/*     */       }
/*     */ 
/*     */     }
/*     */ 
/*  85 */     repaint();
/*     */   }
/*     */ 
/*     */   protected void pointerDragged(int x, int y) {
/*  89 */     super.pointerDragged(x, y);
/*     */   }
/*     */ 
/*     */   protected void pointerReleased(int x, int y)
/*     */   {
/*     */   }
/*     */ 
/*     */   public void freeMemory()
/*     */   {
/* 100 */     this.levelsNumbers = null;
/* 101 */     this.backgroundIMage = null;
/* 102 */     this.onOff = null;
/* 103 */     System.gc();
/*     */   }
/*     */ 
/*     */   public void paint(Graphics g)
/*     */   {
/* 111 */     if (getHeight() <= getWidth())
/*     */     {
/* 113 */       g.drawImage(ImageLoader.getPortraitImage(), 0, 0, 0);
/*     */     }
/* 117 */     else if (this.backgroundIMage != null) {
/* 118 */       g.drawImage(this.backgroundIMage, 0, 0, 0);
/* 119 */       this.onOff.paint(g);
/* 120 */       g.setFont(Font.getFont(0, 0, 16));
/* 121 */       if (this.onOff.isOn())
/*     */       {
/* 123 */         g.drawString("Sound ON", this.onOff.locationx - 100, this.onOff.locationy + this.onOff.elementHeight / 3, 0);
/*     */       }
/*     */       else {
/* 126 */         g.drawString("Sound OFF", this.onOff.locationx - 100, this.onOff.locationy + this.onOff.elementHeight / 3, 0);
/*     */       }
/*     */ 
/* 130 */       for (int i = 0; i < this.levelsNumbers.length; i++)
/*     */       {
/* 132 */         this.levelsNumbers[i].paint(g);
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public void loadLevel(int theLevelNumber)
/*     */   {
/* 144 */     System.out.println("the selection " + theLevelNumber);
/* 145 */     if (theLevelNumber == 0)
/*     */     {
/* 147 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new PlayOrOption(0));
/*     */     }
/*     */ 
/* 154 */     freeMemory();
/*     */   }
/*     */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veritechnolohy.Screens.OptionScreen
 * JD-Core Version:    0.6.2
 */