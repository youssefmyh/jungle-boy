/*     */ package com.veritechnolohy.Screens;
/*     */ 
/*     */ import com.veritechnology.engine.Constants;
/*     */ import com.veritechnology.engine.ImageLoader;
/*     */ import com.veritechnology.engine.LevelsStars;
/*     */ import com.veritechnology.engine.Listener;
/*     */ import com.veritechnology.engine.SoundLoader;
/*     */ import com.veritechnolohy.elements.Ballon;
/*     */ import com.veritechnolohy.elements.Holder;
/*     */ import com.veritechnolohy.elements.MainElement;
/*     */ import com.veritechnolohy.elements.PlayerElement;
/*     */ import com.veritechnolohy.elements.RotateHolder;
/*     */ import com.veritechnolohy.elements.Rubber;
/*     */ import com.veritechnolohy.elements.SEER;
/*     */ import com.veritechnolohy.elements.SEREER;
/*     */ import com.veritechnolohy.elements.board;
/*     */ import com.veritechnolohy.elements.onOffButton;
/*     */ import com.veritechnolohy.elements.pauseButton;
/*     */ import com.veritechnolohy.main.JungleBoy;
/*     */ import java.io.PrintStream;
/*     */ import java.util.Vector;
/*     */ import javax.microedition.lcdui.Display;
/*     */ import javax.microedition.lcdui.Graphics;
/*     */ import javax.microedition.lcdui.game.GameCanvas;
/*     */ 
/*     */ public abstract class MainScreen extends GameCanvas
/*     */   implements Listener
/*     */ {
/*     */   public Vector elements;
/*     */   MainElement selectedElement;
/*     */   pauseButton pause;
/*     */   Holder holder;
/*     */   RotateHolder rholder;
/*     */   onOffButton onOff;
/*     */   PlayerElement player;
/*     */   private int score;
/*     */   private int numberofStars;
/*     */   private PauseMenu pauseMenu;
/*     */   private PauseMenu nextMenu;
/*     */   private PauseMenu faieldMenu;
/*     */   public static boolean isPauseMenu;
/*     */   public static boolean isNextMenu;
/*     */   public static boolean isFaieldMenu;
/*     */   public static boolean startPlaying;
/*  52 */   int startPause = 0;
/*  53 */   int maxPause = 100;
/*  54 */   int step = 1;
/*     */   board board_num;
/*     */   public int levelNumber;
/*     */ 
/*     */   public int getScore()
/*     */   {
/*  58 */     return this.score;
/*     */   }
/*     */ 
/*     */   public void setScore(int score) {
/*  62 */     this.score = score;
/*  63 */     this.numberofStars += 1;
/*     */ 
/*  65 */     switch (this.levelNumber)
/*     */     {
/*     */     case 0:
/*  68 */       this.numberofStars = 3;
/*  69 */       break;
/*     */     case 1:
/*  72 */       this.numberofStars = 3;
/*  73 */       break;
/*     */     case 2:
/*  75 */       this.numberofStars = 3;
/*  76 */       break;
/*     */     case 3:
/*  78 */       this.numberofStars = 3;
/*     */ 
/*  80 */       break;
/*     */     case 4:
/*  82 */       this.numberofStars = 3;
/*     */ 
/*  84 */       break;
/*     */     case 5:
/*  86 */       this.numberofStars = 3;
/*     */     }
/*     */ 
/*  93 */     if (LevelsStars.levelsstarts_num[(this.levelNumber - 1)] < this.numberofStars)
/*  94 */       LevelsStars.levelsstarts_num[(this.levelNumber - 1)] = ((byte)this.numberofStars);
/*  95 */     System.out.println(score);
/*     */   }
/*     */ 
/*     */   public MainScreen(int levelNumber)
/*     */   {
/* 100 */     super(true);
/* 101 */     setFullScreenMode(true);
/* 102 */     this.board_num = new board(levelNumber);
/* 103 */     isPauseMenu = false;
/* 104 */     isFaieldMenu = false;
/* 105 */     startPlaying = false;
/* 106 */     isNextMenu = false;
/* 107 */     this.pauseMenu = new PauseMenu(0);
/* 108 */     this.pauseMenu.mainscreen = this;
/* 109 */     this.nextMenu = new PauseMenu(0, true);
/* 110 */     this.faieldMenu = new PauseMenu(0, true, true);
/* 111 */     this.nextMenu.mainscreen = this;
/* 112 */     this.faieldMenu.mainscreen = this;
/* 113 */     Constants.ISPAUSE = false;
/* 114 */     this.levelNumber = (levelNumber + 1);
/* 115 */     if (levelNumber > 0)
/* 116 */       setFullScreenMode(true);
/* 117 */     this.elements = new Vector();
/* 118 */     this.pause = new pauseButton();
/* 119 */     this.holder = new Holder();
/* 120 */     this.rholder = new RotateHolder();
/* 121 */     this.onOff = new onOffButton();
/* 122 */     this.player = new PlayerElement();
/* 123 */     this.onOff.setListener(this);
/* 124 */     this.pause.setListener(this);
/* 125 */     this.elements.addElement(this.pause);
/* 126 */     this.elements.addElement(this.holder);
/* 127 */     this.elements.addElement(this.rholder);
/* 128 */     this.elements.addElement(this.onOff);
/* 129 */     this.elements.addElement(this.board_num);
/* 130 */     SoundLoader.playMainPlayer();
/*     */ 
/* 132 */     LevelsStars.storeLevels();
/* 133 */     LevelsStars.loadLevels();
/*     */   }
/*     */ 
/*     */   protected void showNotify()
/*     */   {
/* 139 */     super.showNotify();
/* 140 */     SoundLoader.playMainPlayer();
/*     */   }
/*     */ 
/*     */   protected void hideNotify() {
/* 144 */     super.hideNotify();
/* 145 */     SoundLoader.stopMainPlayer();
/*     */   }
/*     */ 
/*     */   public void addPlayer()
/*     */   {
/* 150 */     this.elements.addElement(this.player);
/*     */   }
/*     */ 
/*     */   public void paint(Graphics g)
/*     */   {
/* 155 */     if (getHeight() <= getWidth())
/*     */     {
/* 157 */       g.drawImage(ImageLoader.getPortraitImage(), 0, 0, 0);
/* 158 */       return;
/*     */     }
/* 160 */     if (this.elements != null) {
/* 161 */       for (int i = 0; i < this.elements.size(); i++)
/*     */       {
/* 163 */         MainElement element = (MainElement)this.elements.elementAt(i);
/* 164 */         checkbabyPosition(element);
/* 165 */         element.paint(g);
/*     */       }
/*     */     }
/* 168 */     if ((isPauseMenu) && (this.pauseMenu != null))
/*     */     {
/* 170 */       this.pauseMenu.paint(g);
/*     */     }
/* 172 */     if (((isNextMenu) && (this.nextMenu != null)) || ((isFaieldMenu) && (this.faieldMenu != null)))
/*     */     {
/* 174 */       System.out.print("start on ");
/* 175 */       this.startPause += this.step;
/* 176 */       if (this.startPause > this.maxPause) {
/* 177 */         Constants.ISTHREADRUN = false;
/*     */ 
/* 179 */         if (isNextMenu) {
/* 180 */           this.nextMenu.paint(g);
/*     */         }
/* 182 */         if (isFaieldMenu)
/* 183 */           this.faieldMenu.paint(g);
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public void addElement(MainElement element)
/*     */   {
/* 195 */     this.elements.addElement(element);
/*     */   }
/*     */ 
/*     */   public void removeElement(MainElement element)
/*     */   {
/* 202 */     this.elements.removeElement(element);
/*     */   }
/*     */ 
/*     */   protected void pointerPressed(int x, int y) {
/* 206 */     super.pointerPressed(x, y);
/* 207 */     System.out.println("touch");
/*     */ 
/* 209 */     if (isPauseMenu)
/*     */     {
/* 211 */       this.pauseMenu.pointerPressed(x, y);
/* 212 */       return;
/*     */     }
/* 214 */     if (isNextMenu)
/*     */     {
/* 216 */       this.nextMenu.pointerPressed(x, y);
/* 217 */       return;
/*     */     }
/* 219 */     if (isFaieldMenu)
/*     */     {
/* 221 */       this.faieldMenu.pointerPressed(x, y);
/* 222 */       return;
/*     */     }
/*     */ 
/* 225 */     for (int i = 0; i < this.elements.size(); i++)
/*     */     {
/* 227 */       MainElement elemented_sc = (MainElement)this.elements.elementAt(i);
/* 228 */       if ((x >= elemented_sc.locationx) && (x <= elemented_sc.locationx + elemented_sc.elemntWidth) && (y >= elemented_sc.locationy) && (y <= elemented_sc.locationy + elemented_sc.elementHeight))
/*     */       {
/* 231 */         this.selectedElement = elemented_sc;
/* 232 */         break;
/*     */       }
/*     */     }
/* 235 */     if ((this.selectedElement != null) && 
/* 236 */       (this.selectedElement.getListener() != null))
/*     */     {
/* 238 */       actionPerformed(this.selectedElement);
/*     */     }
/*     */   }
/*     */ 
/*     */   protected void pointerDragged(int x, int y)
/*     */   {
/* 246 */     super.pointerDragged(x, y);
/* 247 */     if (startPlaying)
/* 248 */       return;
/* 249 */     if ((isPauseMenu) || (isNextMenu))
/*     */     {
/* 251 */       this.pauseMenu.pointerDragged(x, y);
/* 252 */       return;
/*     */     }
/* 254 */     if (isNextMenu)
/*     */     {
/* 256 */       this.nextMenu.pointerDragged(x, y);
/* 257 */       return;
/*     */     }
/*     */ 
/* 260 */     if ((this.selectedElement != null) && (!this.selectedElement.isFixedElement()))
/*     */     {
/* 263 */       this.selectedElement.locationx = (x - this.selectedElement.locationx / 7);
/* 264 */       this.selectedElement.locationy = (y - this.selectedElement.locationy / 7);
/*     */     }
/*     */   }
/*     */ 
/*     */   protected void pointerReleased(int x, int y)
/*     */   {
/* 271 */     super.pointerReleased(x, y);
/*     */ 
/* 273 */     this.selectedElement = null;
/*     */   }
/*     */ 
/*     */   public void actionPerformed(MainElement element)
/*     */   {
/* 278 */     if (element.equals(this.pause))
/*     */     {
/* 280 */       pause();
/*     */     }
/* 282 */     else if (element.equals(this.onOff))
/*     */     {
/* 284 */       this.onOff.setOn(!this.onOff.isOn());
/* 285 */       this.rholder.setIsAnimated(true);
/* 286 */       this.player.setDown(true);
/* 287 */       startPlaying = true;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void back()
/*     */   {
/* 295 */     Constants.ISTHREADRUN = false;
/* 296 */     this.pauseMenu.freeMemory();
/* 297 */     for (int i = 0; i < this.elements.size(); i++) {
/* 298 */       ((MainElement)this.elements.elementAt(i)).freeElement();
/*     */     }
/* 300 */     this.elements.removeAllElements();
/* 301 */     this.elements = null;
/* 302 */     this.selectedElement = null;
/* 303 */     this.pause = null;
/* 304 */     this.holder = null;
/* 305 */     this.rholder = null;
/* 306 */     this.onOff = null;
/* 307 */     this.player = null;
/* 308 */     System.gc();
/*     */   }
/*     */ 
/*     */   public void pause()
/*     */   {
/* 315 */     isPauseMenu = true;
/* 316 */     Constants.ISPAUSE = true;
/*     */   }
/*     */ 
/*     */   public void returnBack()
/*     */   {
/* 326 */     Display.getDisplay(JungleBoy.getBabyMidlet()).setCurrent(new LevelsSelection(Constants.currentWorldSelection * 10));
/*     */ 
/* 328 */     back();
/*     */   }
/*     */ 
/*     */   public void checkbabyPosition(MainElement element)
/*     */   {
/* 336 */     if ((element.getFieldType() == Constants.RUBBERELEMENT) && (!this.player.withBallon))
/*     */     {
/* 338 */       if ((this.player.locationy + 10 >= element.locationy) && (this.player.locationy <= element.locationy + element.elementHeight) && (this.player.locationx >= element.locationx) && (this.player.locationx <= element.locationx + element.elemntWidth))
/*     */       {
/* 344 */         this.player.setDown(false);
/* 345 */         Rubber rubber = (Rubber)element;
/* 346 */         rubber.setAnimate(true);
/*     */ 
/* 348 */         this.player.setXYMovePowerFromRubber(rubber.getxMovePower(), rubber.getyMovePower());
/* 349 */         this.player.setMove(true, rubber.getAngle());
/*     */       }
/*     */ 
/* 352 */       if ((this.player.locationy + 10 >= element.locationy) && (this.player.locationy <= element.locationy + element.elementHeight) && (this.player.locationx + this.player.elemntWidth / 2 >= element.locationx) && (this.player.locationx + this.player.elemntWidth / 2 <= element.locationx + element.elemntWidth))
/*     */       {
/* 358 */         this.player.setDown(false);
/* 359 */         Rubber rubber = (Rubber)element;
/* 360 */         rubber.setAnimate(true);
/*     */ 
/* 362 */         this.player.setXYMovePowerFromRubber(rubber.getxMovePower(), rubber.getyMovePower());
/* 363 */         this.player.setMove(true, rubber.getAngle());
/*     */       }
/*     */ 
/*     */     }
/* 369 */     else if (element.getFieldType() == Constants.EATINGELEMENT)
/*     */     {
/* 371 */       if (((this.player.locationy <= element.locationy + element.elementHeight * 2) && (this.player.locationy >= element.locationy - 30) && (this.player.locationx >= element.locationx) && (this.player.locationx <= element.locationx + element.elemntWidth)) || ((this.player.locationy <= element.locationy + element.elementHeight * 2) && (this.player.locationy >= element.locationy - 30) && (this.player.locationx + this.player.elemntWidth >= element.locationx) && (this.player.locationx + this.player.elemntWidth / 2 <= element.locationx + element.elemntWidth)))
/*     */       {
/* 385 */         setScore(this.score + Constants.BAZAZASCORE);
/* 386 */         element.setHidden(true);
/* 387 */         element.freeElement();
/* 388 */         this.elements.removeElement(element);
/* 389 */         SoundLoader.playBazazSound();
/*     */       }
/*     */     }
/* 392 */     else if ((element.getFieldType() == Constants.TOOB) && (!this.player.withBallon))
/*     */     {
/* 394 */       if ((this.player.locationy >= element.locationy) && (this.player.locationy + this.player.elementHeight / 3 <= element.locationy + element.elementHeight) && (this.player.locationx + this.player.elemntWidth >= element.locationx) && (this.player.locationx + this.player.elemntWidth <= element.locationx + element.elemntWidth))
/*     */       {
/* 401 */         this.player.setLocationx(this.player.locationx - 20);
/* 402 */         this.player.setMove(false);
/* 403 */         this.player.setDown(true);
/*     */       }
/* 405 */       if ((this.player.locationy >= element.locationy) && (this.player.locationy + this.player.elementHeight / 3 <= element.locationy + element.elementHeight) && (this.player.locationx <= element.locationx + element.elemntWidth) && (this.player.locationx >= element.locationx))
/*     */       {
/* 410 */         this.player.setLocationx(this.player.locationx + 20);
/* 411 */         this.player.setMove(false);
/* 412 */         this.player.setDown(true);
/*     */       }
/* 414 */       if ((this.player.locationy - 10 <= element.locationy + element.elementHeight) && (this.player.locationy >= element.locationy) && (this.player.locationx >= element.locationx) && (this.player.locationx + this.player.elemntWidth <= element.locationx + element.elemntWidth))
/*     */       {
/* 419 */         this.player.setMove(false);
/* 420 */         this.player.setLocationx(this.player.locationx);
/* 421 */         this.player.setDown(true);
/*     */       }
/*     */     }
/* 424 */     else if ((element.getFieldType() == Constants.SEER) && (!this.player.isWithBallon()))
/*     */     {
/* 426 */       if ((this.player.locationy + this.player.elementHeight >= element.locationy) && (this.player.locationy + this.player.elementHeight <= element.locationy + 20) && (this.player.locationx >= element.locationx) && (this.player.locationx <= element.locationx + element.elemntWidth))
/*     */       {
/* 431 */         this.player.setDown(false);
/* 432 */         this.player.setMove(false);
/* 433 */         this.player.setWithBallon(false);
/* 434 */         SEER seer = (SEER)element;
/* 435 */         seer.setAnimate(true);
/* 436 */         if (seer.getAngle() > 0)
/* 437 */           this.player.setxMovePower(seer.locationx + seer.elemntWidth + this.player.elemntWidth + 20 - this.player.locationx);
/*     */         else
/* 439 */           this.player.setxMovePower(seer.locationx - this.player.elemntWidth);
/* 440 */         this.player.setMoveX(true, seer.getAngle());
/* 441 */         this.player.setStartFromMoveLoactionX(this.player.locationx);
/* 442 */         this.player.setStartFromMoveLoactionY(this.player.locationy);
/*     */       }
/* 444 */       if ((this.player.locationy + this.player.elementHeight >= element.locationy) && (this.player.locationy + this.player.elementHeight <= element.locationy + 20) && (this.player.locationx + this.player.elemntWidth >= element.locationx) && (this.player.locationx + this.player.elemntWidth <= element.locationx + element.elemntWidth))
/*     */       {
/* 449 */         this.player.setDown(false);
/* 450 */         this.player.setMove(false);
/* 451 */         this.player.setWithBallon(false);
/* 452 */         SEER seer = (SEER)element;
/* 453 */         seer.setAnimate(true);
/* 454 */         if (seer.getAngle() > 0)
/* 455 */           this.player.setxMovePower(seer.locationx + seer.elemntWidth + this.player.elemntWidth * 2 - this.player.locationx);
/*     */         else
/* 457 */           this.player.setxMovePower(seer.locationx - this.player.elemntWidth);
/* 458 */         this.player.setMoveX(true, seer.getAngle());
/* 459 */         this.player.setStartFromMoveLoactionX(this.player.locationx);
/* 460 */         this.player.setStartFromMoveLoactionY(this.player.locationy);
/*     */       }
/*     */ 
/*     */     }
/* 464 */     else if (element.getFieldType() == Constants.BALONA)
/*     */     {
/* 466 */       if (((this.player.locationy >= element.locationy) && (this.player.locationy <= element.locationy + element.elementHeight) && (this.player.locationx >= element.locationx) && (this.player.locationx <= element.locationx + element.elemntWidth)) || ((this.player.locationy >= element.locationy) && (this.player.locationy <= element.locationy + element.elementHeight) && (this.player.locationx + this.player.elemntWidth >= element.locationx) && (this.player.locationx + this.player.elemntWidth <= element.locationx + element.elemntWidth * 2)))
/*     */       {
/* 476 */         this.player.setLocationx(element.locationx);
/* 477 */         this.player.setDown(false);
/* 478 */         this.player.setMove(false);
/* 479 */         this.player.setWithBallon(true);
/* 480 */         Ballon seer = (Ballon)element;
/* 481 */         seer.setHidden(true);
/*     */ 
/* 483 */         this.player.setMoveBallon(true);
/* 484 */         removeElement(element);
/* 485 */         this.player.setyMovePower(200);
/* 486 */         this.player.setyMovePower(100);
/* 487 */         this.player.setStartFromMoveLoactionX(this.player.locationx);
/* 488 */         this.player.setStartFromMoveLoactionY(this.player.locationy);
/*     */       }
/*     */ 
/*     */     }
/* 493 */     else if ((element.getFieldType() == Constants.MARWHAA) && (this.player.withBallon))
/*     */     {
/* 495 */       if ((this.player.locationy + this.player.elementHeight >= element.locationy) && (this.player.locationy + this.player.elementHeight <= element.locationy + element.elementHeight) && (this.player.locationx + this.player.elemntWidth * 2 >= element.locationx) && (this.player.locationx + this.player.elemntWidth <= element.locationx + element.elemntWidth))
/*     */       {
/* 500 */         this.player.setxMovePower(this.player.locationx - 100);
/* 501 */         this.player.setMoveX(true, -1);
/* 502 */         this.player.setStartFromMoveLoactionX(this.player.locationx);
/* 503 */         this.player.setStartFromMoveLoactionY(this.player.locationy);
/*     */       }
/* 505 */       if ((this.player.locationy + this.player.elementHeight >= element.locationy) && (this.player.locationy + this.player.elementHeight <= element.locationy + element.elementHeight) && (this.player.locationx >= element.locationx) && (this.player.locationx <= element.locationx + element.elemntWidth * 2))
/*     */       {
/* 510 */         this.player.setxMovePower(this.player.locationx + 100);
/* 511 */         this.player.setMoveX(true, 1);
/*     */ 
/* 513 */         this.player.setStartFromMoveLoactionX(this.player.locationx);
/* 514 */         this.player.setStartFromMoveLoactionY(this.player.locationy);
/*     */       }
/*     */ 
/*     */     }
/* 518 */     else if ((element.getFieldType() == Constants.SEREEEEER) && (!this.player.withBallon))
/*     */     {
/* 520 */       if (((this.player.locationy >= element.locationy) && (this.player.locationy <= element.locationy + element.elementHeight) && (this.player.locationx + this.player.elemntWidth / 2 >= element.locationx) && (this.player.locationx + this.player.elemntWidth / 2 <= element.locationx + element.elemntWidth)) || ((this.player.locationy >= element.locationy) && (this.player.locationy <= element.locationy + element.elementHeight) && (this.player.locationx + this.player.elemntWidth / 5 >= element.locationx) && (this.player.locationx + this.player.elemntWidth / 5 <= element.locationx + element.elemntWidth)))
/*     */       {
/* 531 */         this.player.setDown(false);
/* 532 */         this.player.setMove(false);
/* 533 */         this.player.setWithBallon(false);
/* 534 */         SEREER sereer = (SEREER)element;
/* 535 */         sereer.setWithBaby(true);
/* 536 */         this.player.setHidden(true);
/* 537 */         this.player.setSelectedIndex(0);
/* 538 */         this.player.setLocationy(this.player.locationy - 40);
/* 539 */         SoundLoader.playFinishLevelSound();
/* 540 */         if (Constants.ISTHREADRUN)
/*     */         {
/* 542 */           repaint();
/*     */         }
/*     */ 
/* 545 */         showReplay(true);
/*     */       }
/*     */ 
/*     */     }
/* 550 */     else if ((element.getFieldType() == Constants.ELECTRICAL) && (!this.player.withBallon))
/*     */     {
/* 552 */       if (((this.player.locationy >= element.locationy) && (this.player.locationy <= element.locationy + element.elementHeight) && (this.player.locationx + 20 >= element.locationx) && (this.player.locationx + 20 <= element.locationx + element.elemntWidth)) || ((this.player.locationy >= element.locationy) && (this.player.locationy <= element.locationy + element.elementHeight) && (this.player.locationx + this.player.elemntWidth >= element.locationx) && (this.player.locationx + this.player.elemntWidth <= element.locationx + element.elemntWidth)))
/*     */       {
/* 561 */         if (!element.isHidden())
/*     */         {
/* 564 */           this.player.setHidden(true);
/* 565 */           this.player.setFired(true);
/* 566 */           this.player.setWithBallon(false);
/* 567 */           this.player.setDown(false);
/* 568 */           this.player.setMove(false);
/* 569 */           showReplay(false);
/*     */         }
/*     */ 
/*     */       }
/*     */ 
/*     */     }
/* 575 */     else if ((element.getFieldType() == Constants.MOVEBLOCK) && (!this.player.withBallon))
/*     */     {
/* 577 */       if (((this.player.locationy >= element.locationy) && (this.player.locationy <= element.locationy + element.elementHeight) && (this.player.locationx >= element.locationx) && (this.player.locationx <= element.locationx + element.elemntWidth)) || ((this.player.locationy >= element.locationy) && (this.player.locationy <= element.locationy + element.elementHeight) && (this.player.locationx + this.player.elemntWidth >= element.locationx) && (this.player.locationx + this.player.elemntWidth <= element.locationx + element.elemntWidth)))
/*     */       {
/* 586 */         if (!element.isHidden())
/*     */         {
/* 588 */           this.player.setHidden(true);
/* 589 */           this.player.setFired(true);
/* 590 */           this.player.setWithBallon(false);
/* 591 */           this.player.setDown(false);
/* 592 */           this.player.setMove(false);
/* 593 */           showReplay(false);
/*     */         }
/*     */ 
/*     */       }
/*     */ 
/*     */     }
/* 599 */     else if ((this.player.locationy > getHeight() + 50) || (this.player.locationx > getWidth() + 50))
/*     */     {
/* 605 */       this.player.setHidden(true);
/* 606 */       this.player.setFired(true);
/* 607 */       this.player.setWithBallon(false);
/* 608 */       this.player.setDown(false);
/* 609 */       this.player.setMove(false);
/* 610 */       showReplay(false);
/*     */     }
/*     */   }
/*     */ 
/*     */   public void showReplay(boolean isNext)
/*     */   {
/* 623 */     if (isNext) {
/* 624 */       isNextMenu = true;
/* 625 */       this.nextMenu.setTheNumberofStars(this.numberofStars);
/*     */     }
/*     */     else {
/* 628 */       isFaieldMenu = true;
/*     */     }
/*     */   }
/*     */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veritechnolohy.Screens.MainScreen
 * JD-Core Version:    0.6.2
 */