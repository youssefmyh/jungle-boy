/*     */ package com.veritechnolohy.Screens;
/*     */ 
/*     */ import com.veritechnology.engine.ImageLoader;
/*     */ import com.veritechnology.engine.LevelsStars;
/*     */ import com.veritechnology.engine.SoundLoader;
/*     */ import com.veritechnolohy.elements.MainElement;
/*     */ import com.veritechnolohy.elements.PlayButton;
/*     */ import com.veritechnolohy.elements.SoundOnOff;
/*     */ import com.veritechnolohy.elements.about_btn;
/*     */ import com.veritechnolohy.elements.facebookButton;
/*     */ import com.veritechnolohy.elements.help_btn;
/*     */ import com.veritechnolohy.elements.homeButton;
/*     */ import com.veritechnolohy.elements.pauseButton;
/*     */ import com.veritechnolohy.elements.reviewus;
/*     */ import com.veritechnolohy.main.JungleBoy;
/*     */ import java.io.PrintStream;
/*     */ import javax.microedition.io.ConnectionNotFoundException;
/*     */ import javax.microedition.lcdui.Canvas;
/*     */ import javax.microedition.lcdui.Display;
/*     */ import javax.microedition.lcdui.Graphics;
/*     */ import javax.microedition.lcdui.Image;
/*     */ import javax.microedition.midlet.MIDlet;
/*     */ 
/*     */ public class PlayOrOption extends Canvas
/*     */ {
/*     */   private PlayButton play_button;
/*     */   private SoundOnOff option_button;
/*     */   MainElement[] levelsNumbers;
/*     */   int levelSelectionType;
/*     */   private Image backgroundIMage;
/*     */   homeButton homeBtn;
/*     */   facebookButton facebook;
/*     */   reviewus review;
/*     */   pauseButton close_btn;
/*     */   about_btn aboutBtn;
/*     */   help_btn helpBtn;
/*     */ 
/*     */   public PlayOrOption(int levelSelectionType)
/*     */   {
/*  47 */     setFullScreenMode(true);
/*  48 */     this.levelSelectionType = levelSelectionType;
/*  49 */     this.backgroundIMage = ImageLoader.loadImage("optionmenu");
/*  50 */     this.play_button = new PlayButton();
/*  51 */     this.play_button.setLocationx(105);
/*  52 */     this.play_button.setLocationy(205);
/*     */ 
/*  54 */     this.option_button = new SoundOnOff();
/*  55 */     this.option_button.setLocationx(35);
/*  56 */     this.option_button.setLocationy(215);
/*  57 */     if (LevelsStars.levelsstarts_num[30] == 1)
/*     */     {
/*  59 */       this.option_button.setOn(true);
/*     */     }
/*  61 */     SoundLoader.stopStartedPlayer();
/*     */ 
/*  63 */     this.aboutBtn = new about_btn();
/*  64 */     this.aboutBtn.setLocationx(260);
/*  65 */     this.aboutBtn.setLocationy(600);
/*  66 */     this.close_btn = new pauseButton();
/*     */ 
/*  70 */     this.helpBtn = new help_btn();
/*  71 */     this.helpBtn.setLocationx(320);
/*  72 */     this.helpBtn.setLocationy(600);
/*     */ 
/*  78 */     this.review = new reviewus();
/*     */ 
/*  80 */     this.facebook = new facebookButton();
/*     */ 
/*  82 */     this.levelsNumbers = new MainElement[6];
/*  83 */     this.levelsNumbers[0] = this.play_button;
/*  84 */     this.levelsNumbers[1] = this.option_button;
/*  85 */     this.levelsNumbers[2] = this.helpBtn;
/*  86 */     this.levelsNumbers[3] = this.aboutBtn;
/*  87 */     this.levelsNumbers[4] = this.close_btn;
/*     */ 
/*  89 */     this.levelsNumbers[5] = this.facebook;
/*     */   }
/*     */ 
/*     */   protected void showNotify()
/*     */   {
/*  99 */     super.showNotify();
/* 100 */     SoundLoader.playStartPlayer();
/*     */   }
/*     */ 
/*     */   protected void hideNotify() {
/* 104 */     super.hideNotify();
/* 105 */     SoundLoader.stopStartedPlayer();
/*     */   }
/*     */ 
/*     */   protected void pointerPressed(int x, int y) {
/* 109 */     super.pointerPressed(x, y);
/*     */ 
/* 111 */     for (int i = 0; i < this.levelsNumbers.length; i++)
/*     */     {
/* 113 */       MainElement _level = this.levelsNumbers[i];
/*     */ 
/* 115 */       if ((x >= _level.locationx) && (x < _level.locationx + _level.elemntWidth) && (y >= _level.locationy) && (y < _level.locationy + _level.elementHeight))
/*     */       {
/*     */         break;
/*     */       }
/*     */ 
/*     */     }
/*     */ 
/* 126 */     repaint();
/*     */   }
/*     */ 
/*     */   protected void pointerDragged(int x, int y) {
/* 130 */     super.pointerDragged(x, y);
/*     */   }
/*     */ 
/*     */   protected void pointerReleased(int x, int y) {
/* 134 */     super.pointerReleased(x, y);
/* 135 */     for (int i = 0; i < this.levelsNumbers.length; i++)
/*     */     {
/* 137 */       MainElement _level = this.levelsNumbers[i];
/*     */ 
/* 139 */       if ((x >= _level.locationx) && (x < _level.locationx + _level.elemntWidth) && (y >= _level.locationy) && (y < _level.locationy + _level.elementHeight))
/*     */       {
/* 146 */         loadLevel(i);
/* 147 */         break;
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public void freeMemory()
/*     */   {
/* 158 */     this.levelsNumbers = null;
/* 159 */     this.backgroundIMage = null;
/* 160 */     this.homeBtn = null;
/* 161 */     System.gc();
/*     */   }
/*     */ 
/*     */   public void paint(Graphics g)
/*     */   {
/* 169 */     if (getHeight() <= getWidth())
/*     */     {
/* 171 */       g.drawImage(ImageLoader.getPortraitImage(), 0, 0, 0);
/*     */     }
/*     */     else
/*     */     {
/* 175 */       if (this.backgroundIMage != null) {
/* 176 */         g.drawImage(this.backgroundIMage, 0, 0, 0);
/*     */       }
/*     */ 
/* 179 */       for (int i = 0; i < this.levelsNumbers.length; i++)
/*     */       {
/* 181 */         this.levelsNumbers[i].paint(g);
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public void loadLevel(int theLevelNumber)
/*     */   {
/* 190 */     System.out.println("the selection " + theLevelNumber);
/* 191 */     if (theLevelNumber == 0)
/*     */     {
/* 193 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new WorldSelection(0));
/* 194 */       freeMemory();
/*     */     }
/* 197 */     else if (theLevelNumber == 3)
/*     */     {
/* 199 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new AboutScreen(0));
/* 200 */       freeMemory();
/*     */     }
/* 202 */     else if (theLevelNumber == 2)
/*     */     {
/* 204 */       Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new Help(0));
/* 205 */       freeMemory();
/*     */     }
/* 208 */     else if (theLevelNumber == 4)
/*     */     {
/* 210 */       LevelsStars.storeLevels();
/* 211 */       JungleBoy.getBabyMidlet().notifyDestroyed();
/*     */     }
/* 214 */     else if (theLevelNumber == 5)
/*     */     {
/* 216 */       System.out.println("FaceBook");
/*     */       try {
/* 218 */         JungleBoy.getBabyMidlet().platformRequest("http://www.facebook.com/pages/Jungle-Boy/102825183168587");
/*     */       } catch (ConnectionNotFoundException ex) {
/* 220 */         ex.printStackTrace();
/*     */       }
/*     */ 
/*     */     }
/* 225 */     else if (theLevelNumber == 1)
/*     */     {
/* 227 */       System.out.println("inisied");
/* 228 */       this.option_button.setOn(!this.option_button.isOn());
/*     */ 
/* 230 */       if (this.option_button.isOn())
/*     */       {
/* 232 */         LevelsStars.levelsstarts_num[30] = 0;
/*     */       }
/*     */       else {
/* 235 */         LevelsStars.levelsstarts_num[30] = 1;
/*     */       }
/* 237 */       SoundLoader.playStartPlayer();
/*     */     }
/*     */   }
/*     */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veritechnolohy.Screens.PlayOrOption
 * JD-Core Version:    0.6.2
 */