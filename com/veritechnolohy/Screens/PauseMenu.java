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
/*     */ import com.veritechnolohy.elements.CloseButton;
/*     */ import com.veritechnolohy.elements.MainElement;
/*     */ import com.veritechnolohy.elements.PlayButton;
/*     */ import com.veritechnolohy.elements.Replay;
/*     */ import com.veritechnolohy.elements.ResumeButton;
/*     */ import com.veritechnolohy.elements.Star;
/*     */ import com.veritechnolohy.elements.nextLevelButton;
/*     */ import com.veritechnolohy.elements.option;
/*     */ import com.veritechnolohy.main.JungleBoy;
/*     */ import java.io.PrintStream;
/*     */ import javax.microedition.lcdui.Display;
/*     */ import javax.microedition.lcdui.Graphics;
/*     */ import javax.microedition.lcdui.Image;
/*     */ 
/*     */ public class PauseMenu
/*     */ {
/*     */   private PlayButton play_button;
/*     */   private option option_button;
/*     */   MainElement[] levelsNumbers;
/*     */   int levelSelectionType;
/*     */   private Image backgroundIMage;
/*     */   CloseButton homeBtn;
/*     */   CloseButton close_btn;
/*     */   ResumeButton resume_btn;
/*     */   public MainScreen mainscreen;
/*     */   Replay replay;
/*     */   nextLevelButton next;
/*     */   boolean isNextMenu;
/*     */   boolean isFaieldMenu;
/*  74 */   private Star nostar = new Star(false);
/*  75 */   private Star star = new Star(true);
/*     */   int theNumberofStars;
/*     */ 
/*     */   public int getTheNumberofStars()
/*     */   {
/*  80 */     return this.theNumberofStars;
/*     */   }
/*     */ 
/*     */   public void setTheNumberofStars(int theNumberofStars) {
/*  84 */     this.theNumberofStars = theNumberofStars;
/*     */   }
/*     */ 
/*     */   public PauseMenu(int levelSelectionType)
/*     */   {
/*  89 */     this.isNextMenu = false;
/*  90 */     this.levelSelectionType = levelSelectionType;
/*  91 */     this.backgroundIMage = ImageLoader.loadImage("thepausemenu");
/*     */ 
/*  94 */     this.close_btn = new CloseButton();
/*  95 */     this.close_btn.setLocationx(117);
/*  96 */     this.close_btn.setLocationy(450);
/*     */ 
/* 101 */     this.resume_btn = new ResumeButton();
/* 102 */     this.resume_btn.setLocationx(272);
/* 103 */     this.resume_btn.setLocationy(410);
/*     */ 
/* 109 */     this.levelsNumbers = new MainElement[2];
/* 110 */     this.levelsNumbers[0] = this.resume_btn;
/* 111 */     this.levelsNumbers[1] = this.close_btn;
/*     */   }
/*     */ 
/*     */   public PauseMenu(int levelSelectionType, boolean replayandNext)
/*     */   {
/* 119 */     this.isNextMenu = true;
/* 120 */     this.levelSelectionType = levelSelectionType;
/* 121 */     this.backgroundIMage = ImageLoader.loadImage("pausemenu");
/*     */ 
/* 124 */     this.close_btn = new CloseButton();
/* 125 */     this.close_btn.setLocationx(112);
/* 126 */     this.close_btn.setLocationy(450);
/*     */ 
/* 131 */     this.next = new nextLevelButton();
/* 132 */     this.next.setLocationx(268);
/* 133 */     this.next.setLocationy(410);
/*     */ 
/* 135 */     this.replay = new Replay();
/* 136 */     this.replay.setLocationx(192);
/* 137 */     this.replay.setLocationy(445);
/*     */ 
/* 142 */     this.levelsNumbers = new MainElement[3];
/* 143 */     this.levelsNumbers[0] = this.next;
/* 144 */     this.levelsNumbers[1] = this.close_btn;
/* 145 */     this.levelsNumbers[2] = this.replay;
/*     */   }
/*     */ 
/*     */   public PauseMenu(int levelSelectionType, boolean replayandNext, boolean faield)
/*     */   {
/* 152 */     this.isFaieldMenu = true;
/* 153 */     this.levelSelectionType = levelSelectionType;
/* 154 */     this.backgroundIMage = ImageLoader.loadImage("failedmenu");
/*     */ 
/* 157 */     this.close_btn = new CloseButton();
/* 158 */     this.close_btn.setLocationx(117);
/* 159 */     this.close_btn.setLocationy(450);
/*     */ 
/* 168 */     this.replay = new Replay();
/* 169 */     this.replay.setLocationx(300);
/* 170 */     this.replay.setLocationy(410);
/*     */ 
/* 175 */     this.levelsNumbers = new MainElement[2];
/* 176 */     this.levelsNumbers[0] = this.close_btn;
/*     */ 
/* 178 */     this.levelsNumbers[1] = this.replay;
/*     */   }
/*     */ 
/*     */   protected void pointerPressed(int x, int y)
/*     */   {
/* 186 */     for (int i = 0; i < this.levelsNumbers.length; i++)
/*     */     {
/* 188 */       MainElement _level = this.levelsNumbers[i];
/* 189 */       if ((x >= _level.locationx) && (x < _level.locationx + _level.elemntWidth) && (y >= _level.locationy) && (y < _level.locationy + _level.elementHeight))
/*     */       {
/* 194 */         loadLevel(i);
/* 195 */         break;
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   protected void pointerDragged(int x, int y)
/*     */   {
/*     */   }
/*     */ 
/*     */   protected void pointerReleased(int x, int y)
/*     */   {
/*     */   }
/*     */ 
/*     */   public void freeMemory()
/*     */   {
/* 215 */     this.levelsNumbers = null;
/* 216 */     this.backgroundIMage = null;
/* 217 */     this.homeBtn = null;
/* 218 */     System.gc();
/*     */   }
/*     */ 
/*     */   public void paint(Graphics g)
/*     */   {
/* 227 */     if (this.backgroundIMage != null)
/*     */     {
/* 229 */       g.drawImage(this.backgroundIMage, 0, (this.mainscreen.getHeight() - this.backgroundIMage.getHeight()) / 2, 0);
/*     */     }
/* 231 */     if (this.levelsNumbers != null) {
/* 232 */       for (int i = 0; i < this.levelsNumbers.length; i++)
/*     */       {
/* 234 */         this.levelsNumbers[i].paint(g);
/*     */       }
/*     */     }
/*     */ 
/* 238 */     if (this.isNextMenu)
/*     */     {
/* 240 */       if (this.theNumberofStars == 0)
/*     */       {
/* 242 */         this.nostar.setLocationx(100);
/* 243 */         this.nostar.setLocationy(380);
/* 244 */         this.nostar.paint(g);
/*     */ 
/* 246 */         this.nostar.setLocationx(180);
/* 247 */         this.nostar.setLocationy(360);
/* 248 */         this.nostar.paint(g);
/*     */ 
/* 250 */         this.nostar.setLocationx(260);
/* 251 */         this.nostar.setLocationy(340);
/* 252 */         this.nostar.paint(g);
/*     */       }
/* 256 */       else if (this.theNumberofStars == 1)
/*     */       {
/* 258 */         this.star.setLocationx(100);
/* 259 */         this.star.setLocationy(380);
/* 260 */         this.star.paint(g);
/*     */ 
/* 262 */         this.nostar.setLocationx(180);
/* 263 */         this.nostar.setLocationy(360);
/* 264 */         this.nostar.paint(g);
/*     */ 
/* 266 */         this.nostar.setLocationx(260);
/* 267 */         this.nostar.setLocationy(340);
/* 268 */         this.nostar.paint(g);
/*     */       }
/*     */ 
/* 272 */       if (this.theNumberofStars == 2)
/*     */       {
/* 274 */         this.star.setLocationx(100);
/* 275 */         this.star.setLocationy(380);
/* 276 */         this.star.paint(g);
/*     */ 
/* 278 */         this.star.setLocationx(180);
/* 279 */         this.star.setLocationy(360);
/* 280 */         this.star.paint(g);
/*     */ 
/* 282 */         this.nostar.setLocationx(260);
/* 283 */         this.nostar.setLocationy(340);
/* 284 */         this.nostar.paint(g);
/*     */       }
/* 286 */       if (this.theNumberofStars == 3)
/*     */       {
/* 288 */         this.star.setLocationx(100);
/* 289 */         this.star.setLocationy(380);
/* 290 */         this.star.paint(g);
/*     */ 
/* 292 */         this.star.setLocationx(180);
/* 293 */         this.star.setLocationy(360);
/* 294 */         this.star.paint(g);
/*     */ 
/* 296 */         this.star.setLocationx(260);
/* 297 */         this.star.setLocationy(340);
/* 298 */         this.star.paint(g);
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public void loadLevel(int theLevelNumber)
/*     */   {
/* 310 */     System.out.println("the selection " + theLevelNumber);
/*     */ 
/* 312 */     if (this.isFaieldMenu)
/*     */     {
/* 314 */       if (theLevelNumber == 0)
/*     */       {
/* 316 */         this.mainscreen.returnBack();
/*     */       }
/*     */       else
/*     */       {
/* 320 */         int cuLevel = this.mainscreen.levelNumber;
/* 321 */         loadLevels(cuLevel);
/*     */       }
/*     */ 
/*     */     }
/* 326 */     else if (!this.isNextMenu) {
/* 327 */       if (theLevelNumber == 0)
/*     */       {
/* 329 */         MainScreen.isPauseMenu = false;
/* 330 */         com.veritechnology.engine.Constants.ISPAUSE = false;
/*     */       }
/*     */       else
/*     */       {
/* 335 */         this.mainscreen.returnBack();
/*     */       }
/*     */ 
/*     */     }
/* 340 */     else if (theLevelNumber == 0)
/*     */     {
/* 343 */       int cuLevel = this.mainscreen.levelNumber;
/* 344 */       cuLevel++;
/* 345 */       loadLevels(cuLevel);
/*     */     }
/* 348 */     else if (theLevelNumber == 2)
/*     */     {
/* 350 */       int cuLevel = this.mainscreen.levelNumber;
/* 351 */       loadLevels(cuLevel);
/*     */     }
/*     */     else
/*     */     {
/* 359 */       this.mainscreen.returnBack();
/*     */     }
/*     */ 
/* 368 */     System.gc();
/*     */   }
/*     */ 
/*     */   public void loadLevels(int theLevelNumber)
/*     */   {
/* 373 */     System.out.println("the level is " + theLevelNumber);
/* 374 */     com.veritechnology.engine.Constants.ISTHREADRUN = true;
/* 375 */     switch (theLevelNumber)
/*     */     {
/*     */     case 1:
/* 378 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new Level00());
/* 379 */       break;
/*     */     case 2:
/* 383 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new Level01());
/*     */ 
/* 385 */       break;
/*     */     case 3:
/* 388 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new Level02());
/* 389 */       break;
/*     */     case 4:
/* 392 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new Level03());
/* 393 */       break;
/*     */     case 5:
/* 396 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new Level04());
/* 397 */       break;
/*     */     case 6:
/* 400 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new Level05());
/* 401 */       break;
/*     */     case 7:
/* 404 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new Level06());
/* 405 */       break;
/*     */     case 8:
/* 407 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new Level07());
/* 408 */       break;
/*     */     case 9:
/* 411 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new Level08());
/* 412 */       break;
/*     */     case 10:
/* 415 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new Level09());
/* 416 */       break;
/*     */     case 11:
/* 419 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new level10());
/* 420 */       break;
/*     */     case 12:
/* 424 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new level111());
/* 425 */       break;
/*     */     case 13:
/* 428 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new level1112());
/* 429 */       break;
/*     */     case 14:
/* 433 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new level1113());
/* 434 */       break;
/*     */     case 15:
/* 438 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new level1114());
/* 439 */       break;
/*     */     case 16:
/* 442 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new level1115());
/* 443 */       break;
/*     */     case 17:
/* 445 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new level1116());
/* 446 */       break;
/*     */     case 18:
/* 448 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new level1117());
/* 449 */       break;
/*     */     case 19:
/* 451 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new level1118());
/* 452 */       break;
/*     */     case 20:
/* 454 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new level1119());
/* 455 */       break;
/*     */     case 21:
/* 457 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new level1120());
/* 458 */       break;
/*     */     case 22:
/* 460 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new level1121());
/* 461 */       break;
/*     */     case 23:
/* 463 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new level1122());
/* 464 */       break;
/*     */     case 24:
/* 466 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new level1123());
/* 467 */       break;
/*     */     case 25:
/* 469 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new level1124());
/* 470 */       break;
/*     */     case 26:
/* 472 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new level1125());
/* 473 */       break;
/*     */     case 27:
/* 475 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new level1126());
/* 476 */       break;
/*     */     case 28:
/* 478 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new level1127());
/* 479 */       break;
/*     */     case 29:
/* 481 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new level1128());
/* 482 */       break;
/*     */     case 30:
/* 484 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new level1129());
/* 485 */       break;
/*     */     default:
/* 487 */       this.mainscreen.returnBack();
/*     */     }
/*     */   }
/*     */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veritechnolohy.Screens.PauseMenu
 * JD-Core Version:    0.6.2
 */