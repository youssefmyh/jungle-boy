/*     */ package com.veritechnolohy.Screens;
/*     */ 
/*     */ import com.veritechnology.engine.ImageLoader;
/*     */ import com.veritechnolohy.elements.PrevButton;
/*     */ import com.veritechnolohy.elements.World;
/*     */ import com.veritechnolohy.elements.homeButton;
/*     */ import com.veritechnolohy.elements.nextButton;
/*     */ import com.veritechnolohy.elements.pauseButton;
/*     */ import com.veritechnolohy.main.JungleBoy;
/*     */ import java.io.PrintStream;
/*     */ import javax.microedition.lcdui.Canvas;
/*     */ import javax.microedition.lcdui.Display;
/*     */ import javax.microedition.lcdui.Graphics;
/*     */ import javax.microedition.lcdui.Image;
/*     */ 
/*     */ public class Help extends Canvas
/*     */ {
/*     */   World[] levelsNumbers;
/*     */   int levelSelectionType;
/*     */   private Image[] backgroundIMage;
/*     */   homeButton homeBtn;
/*     */   pauseButton pause;
/*     */   nextButton next_button;
/*     */   PrevButton prev_button;
/*     */   int selection;
/*     */ 
/*     */   public Help(int levelSelectionType)
/*     */   {
/*  38 */     setFullScreenMode(true);
/*  39 */     this.levelSelectionType = levelSelectionType;
/*  40 */     this.backgroundIMage = new Image[6];
/*  41 */     for (int i = 0; i < this.backgroundIMage.length; i++)
/*     */     {
/*  43 */       this.backgroundIMage[i] = ImageLoader.loadImage("help_" + (i + 1));
/*     */     }
/*  45 */     this.next_button = new nextButton();
/*  46 */     this.prev_button = new PrevButton();
/*  47 */     this.homeBtn = new homeButton();
/*     */   }
/*     */ 
/*     */   protected void pointerPressed(int x, int y)
/*     */   {
/*  53 */     super.pointerPressed(x, y);
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
/*     */ 
/*  84 */     if ((this.next_button != null) && 
/*  85 */       (x >= this.next_button.locationx) && (x < this.next_button.locationx + this.next_button.elemntWidth) && (y >= this.next_button.locationy) && (y < this.next_button.locationy + this.next_button.elementHeight))
/*     */     {
/*  91 */       if (this.selection < this.backgroundIMage.length - 1) {
/*  92 */         this.selection += 1;
/*     */       }
/*     */     }
/*  95 */     if ((this.prev_button != null) && 
/*  96 */       (x >= this.prev_button.locationx) && (x < this.prev_button.locationx + this.prev_button.elemntWidth) && (y >= this.prev_button.locationy) && (y < this.prev_button.locationy + this.prev_button.elementHeight))
/*     */     {
/* 101 */       if (this.selection > 0) {
/* 102 */         this.selection -= 1;
/*     */       }
/*     */ 
/*     */     }
/*     */ 
/* 107 */     repaint();
/*     */   }
/*     */ 
/*     */   protected void pointerDragged(int x, int y)
/*     */   {
/* 114 */     super.pointerDragged(x, y);
/*     */   }
/*     */ 
/*     */   protected void pointerReleased(int x, int y) {
/* 118 */     super.pointerReleased(x, y);
/*     */   }
/*     */ 
/*     */   public void freeMemory()
/*     */   {
/* 127 */     this.levelsNumbers = null;
/* 128 */     this.backgroundIMage = null;
/* 129 */     this.homeBtn = null;
/* 130 */     System.gc();
/*     */   }
/*     */ 
/*     */   public void paint(Graphics g)
/*     */   {
/* 138 */     if (getHeight() <= getWidth())
/*     */     {
/* 140 */       g.drawImage(ImageLoader.getPortraitImage(), 0, 0, 0);
/*     */     }
/* 144 */     else if (this.backgroundIMage != null) {
/* 145 */       g.drawImage(this.backgroundIMage[this.selection], 0, 0, 0);
/* 146 */       this.homeBtn.paint(g);
/* 147 */       this.prev_button.paint(g);
/* 148 */       this.next_button.paint(g);
/*     */     }
/*     */   }
/*     */ 
/*     */   public void loadLevel(int theLevelNumber)
/*     */   {
/* 156 */     com.veritechnology.engine.Constants.currentWorldSelection = theLevelNumber;
/* 157 */     Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new LevelsSelection(theLevelNumber * 10));
/* 158 */     freeMemory();
/*     */   }
/*     */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veritechnolohy.Screens.Help
 * JD-Core Version:    0.6.2
 */