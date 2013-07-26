/*     */ package com.veritechnolohy.Screens;
/*     */ 
/*     */ import com.veripark.levels2.level1119;
/*     */ import com.veripark.levels2.level1120;
/*     */ import com.veripark.levels2.level1121;
/*     */ import com.veripark.levels2.level1122;
/*     */ import com.veripark.levels2.level1123;
/*     */ import com.veripark.levels2.level1124;
/*     */ import com.veripark.levels2.level1125;
/*     */ import com.veripark.levels2.level1126;
/*     */ import com.veripark.levels2.level1127;
/*     */ import com.veripark.levels2.level1128;
/*     */ import com.veripark.levels2.level1129;
/*     */ import com.veritechnology.engine.ImageLoader;
/*     */ import com.veritechnology.levels.Level00;
/*     */ import com.veritechnology.levels.Level01;
/*     */ import com.veritechnology.levels.Level02;
/*     */ import com.veritechnology.levels.Level03;
/*     */ import com.veritechnology.levels.Level04;
/*     */ import com.veritechnology.levels.Level05;
/*     */ import com.veritechnology.levels.Level06;
/*     */ import com.veritechnology.levels.Level07;
/*     */ import com.veritechnology.levels.Level08;
/*     */ import com.veritechnology.levels.Level09;
/*     */ import com.veritechnology.levels.level10;
/*     */ import com.veritechnology.levels.level111;
/*     */ import com.veritechnology.levels.level1112;
/*     */ import com.veritechnology.levels.level1113;
/*     */ import com.veritechnology.levels.level1114;
/*     */ import com.veritechnology.levels.level1115;
/*     */ import com.veritechnology.levels.level1116;
/*     */ import com.veritechnology.levels.level1117;
/*     */ import com.veritechnology.levels.level1118;
/*     */ import com.veritechnolohy.elements.LevelNumber;
/*     */ import com.veritechnolohy.elements.homeButton;
/*     */ import com.veritechnolohy.main.JungleBoy;
/*     */ import java.io.PrintStream;
/*     */ import javax.microedition.lcdui.Canvas;
/*     */ import javax.microedition.lcdui.Display;
/*     */ import javax.microedition.lcdui.Graphics;
/*     */ import javax.microedition.lcdui.Image;
/*     */ 
/*     */ public class LevelsSelection extends Canvas
/*     */ {
/*     */   LevelNumber[] levelsNumbers;
/*     */   int levelSelectionType;
/*     */   private Image selectionBg;
/*     */   private Image worldImage;
/*     */   private Image pauseImage;
/*     */   private homeButton homeBtn;
/*     */ 
/*     */   public LevelsSelection(int levelSelectionType)
/*     */   {
/*  62 */     setFullScreenMode(true);
/*  63 */     this.worldImage = ImageLoader.loadImage("world" + levelSelectionType / 10 + "_title");
/*  64 */     this.homeBtn = new homeButton();
/*  65 */     this.levelSelectionType = levelSelectionType;
/*  66 */     this.levelsNumbers = new LevelNumber[10];
/*  67 */     this.selectionBg = ImageLoader.loadImage("selctions");
/*  68 */     for (int i = 0; i < this.levelsNumbers.length; i++)
/*     */     {
/*  70 */       System.out.println("levels is = " + (i + levelSelectionType));
/*  71 */       this.levelsNumbers[i] = new LevelNumber(com.veritechnology.engine.LevelsStars.levelsstarts_num[(i + levelSelectionType)], i + 1);
/*     */ 
/*  73 */       this.levelsNumbers[i].setLocationx(5 + i * 64 + (i + 1) * 5);
/*  74 */       this.levelsNumbers[i].setLocationy(380);
/*  75 */       if (i > 4)
/*     */       {
/*  77 */         this.levelsNumbers[i].setLocationy(480);
/*  78 */         this.levelsNumbers[i].setLocationx(5 + (i - 5) * 64 + (i - 4) * 5);
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   protected void pointerPressed(int x, int y)
/*     */   {
/*  87 */     super.pointerPressed(x, y);
/*  88 */     if (this.levelsNumbers != null) {
/*  89 */       for (int i = 0; i < this.levelsNumbers.length; i++)
/*     */       {
/*  91 */         LevelNumber _level = this.levelsNumbers[i];
/*  92 */         _level.setSelected(false);
/*  93 */         if ((x >= _level.locationx) && (x < _level.locationx + _level.elemntWidth) && (y >= _level.locationy) && (y < _level.locationy + _level.elementHeight))
/*     */         {
/*  98 */           _level.setSelected(true);
/*  99 */           System.out.println("levelSelected is " + (i + 1));
/* 100 */           break;
/*     */         }
/*     */       }
/*     */ 
/* 104 */       repaint();
/*     */     }
/*     */ 
/* 107 */     if ((x >= this.homeBtn.locationx) && (x < this.homeBtn.locationx + this.homeBtn.elemntWidth) && (y >= this.homeBtn.locationy) && (y < this.homeBtn.elementHeight + this.homeBtn.elementHeight))
/*     */     {
/* 112 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new WorldSelection(0));
/* 113 */       freeMemory();
/*     */     }
/*     */   }
/*     */ 
/*     */   protected void pointerDragged(int x, int y)
/*     */   {
/* 119 */     super.pointerDragged(x, y);
/*     */   }
/*     */ 
/*     */   protected void pointerReleased(int x, int y) {
/* 123 */     super.pointerReleased(x, y);
/* 124 */     if (this.levelsNumbers != null)
/* 125 */       for (int i = 0; i < this.levelsNumbers.length; i++)
/*     */       {
/* 127 */         LevelNumber _level = this.levelsNumbers[i];
/* 128 */         _level.setSelected(false);
/* 129 */         if ((x >= _level.locationx) && (x < _level.locationx + _level.elemntWidth) && (y >= _level.locationy) && (y < _level.locationy + _level.elementHeight))
/*     */         {
/* 135 */           System.out.println("levelSelected is " + (i + 1));
/* 136 */           loadLevel(i + 1);
/* 137 */           break;
/*     */         }
/*     */       }
/*     */   }
/*     */ 
/*     */   public void freeMemory()
/*     */   {
/* 148 */     this.levelsNumbers = null;
/*     */ 
/* 150 */     this.selectionBg = null;
/* 151 */     this.worldImage = null;
/* 152 */     this.homeBtn = null;
/* 153 */     System.gc();
/*     */   }
/*     */ 
/*     */   public void paint(Graphics g)
/*     */   {
/* 160 */     if (getHeight() <= getWidth())
/*     */     {
/* 162 */       g.drawImage(ImageLoader.getPortraitImage(), 0, 0, 0);
/*     */     }
/*     */     else
/*     */     {
/* 166 */       if (this.selectionBg != null) {
/* 167 */         g.drawImage(this.selectionBg, 0, 0, 0);
/* 168 */         g.drawImage(this.worldImage, 0, 300, 0);
/* 169 */         this.homeBtn.paint(g);
/*     */       }
/* 171 */       if (this.levelsNumbers != null)
/* 172 */         for (int i = 0; i < this.levelsNumbers.length; i++)
/*     */         {
/* 174 */           this.levelsNumbers[i].paint(g);
/*     */         }
/*     */     }
/*     */   }
/*     */ 
/*     */   public void loadLevel(int theLevelNumber)
/*     */   {
/* 184 */     theLevelNumber = this.levelSelectionType + theLevelNumber;
/* 185 */     com.veritechnology.engine.Constants.ISTHREADRUN = true;
/* 186 */     switch (theLevelNumber)
/*     */     {
/*     */     case 1:
/* 189 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new Level00());
/* 190 */       break;
/*     */     case 2:
/* 194 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new Level01());
/*     */ 
/* 196 */       break;
/*     */     case 3:
/* 199 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new Level02());
/* 200 */       break;
/*     */     case 4:
/* 203 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new Level03());
/* 204 */       break;
/*     */     case 5:
/* 207 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new Level04());
/* 208 */       break;
/*     */     case 6:
/* 211 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new Level05());
/* 212 */       break;
/*     */     case 7:
/* 215 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new Level06());
/* 216 */       break;
/*     */     case 8:
/* 218 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new Level07());
/* 219 */       break;
/*     */     case 9:
/* 222 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new Level08());
/* 223 */       break;
/*     */     case 10:
/* 226 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new Level09());
/* 227 */       break;
/*     */     case 11:
/* 230 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new level10());
/* 231 */       break;
/*     */     case 12:
/* 235 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new level111());
/* 236 */       break;
/*     */     case 13:
/* 239 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new level1112());
/* 240 */       break;
/*     */     case 14:
/* 244 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new level1113());
/* 245 */       break;
/*     */     case 15:
/* 249 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new level1114());
/* 250 */       break;
/*     */     case 16:
/* 253 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new level1115());
/* 254 */       break;
/*     */     case 17:
/* 256 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new level1116());
/* 257 */       break;
/*     */     case 18:
/* 259 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new level1117());
/* 260 */       break;
/*     */     case 19:
/* 262 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new level1118());
/* 263 */       break;
/*     */     case 20:
/* 265 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new level1119());
/* 266 */       break;
/*     */     case 21:
/* 268 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new level1120());
/* 269 */       break;
/*     */     case 22:
/* 271 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new level1121());
/* 272 */       break;
/*     */     case 23:
/* 274 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new level1122());
/* 275 */       break;
/*     */     case 24:
/* 277 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new level1123());
/* 278 */       break;
/*     */     case 25:
/* 280 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new level1124());
/* 281 */       break;
/*     */     case 26:
/* 283 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new level1125());
/* 284 */       break;
/*     */     case 27:
/* 286 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new level1126());
/* 287 */       break;
/*     */     case 28:
/* 289 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new level1127());
/* 290 */       break;
/*     */     case 29:
/* 292 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new level1128());
/* 293 */       break;
/*     */     case 30:
/* 295 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new level1129());
/*     */     }
/*     */ 
/* 300 */     freeMemory();
/*     */   }
/*     */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veritechnolohy.Screens.LevelsSelection
 * JD-Core Version:    0.6.2
 */