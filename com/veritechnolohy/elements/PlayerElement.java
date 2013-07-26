/*     */ package com.veritechnolohy.elements;
/*     */ 
/*     */ import com.veritechnology.engine.Constants;
/*     */ import com.veritechnology.engine.ImageLoader;
/*     */ import com.veritechnology.engine.releaseObject;
/*     */ import java.io.PrintStream;
/*     */ import javax.microedition.lcdui.Graphics;
/*     */ import javax.microedition.lcdui.Image;
/*     */ 
/*     */ public class PlayerElement extends MainElement
/*     */   implements releaseObject
/*     */ {
/*     */   private static Image[] holder;
/*     */   private Image babyWithBallon;
/*     */   boolean down;
/*     */   boolean move;
/*     */   int angle;
/*     */   boolean moveX;
/*     */   int theXangle;
/*     */   boolean moveBallon;
/*     */   boolean isTOOB;
/*  30 */   public int selectedIndex = 0;
/*     */   boolean beginAnimate;
/*     */   public boolean fired;
/*     */   private static Image[] firedImage;
/*  42 */   int nfired = 0;
/*     */ 
/*     */   public int getSelectedIndex()
/*     */   {
/*  33 */     return this.selectedIndex;
/*     */   }
/*     */ 
/*     */   public void setSelectedIndex(int selectedIndex) {
/*  37 */     this.selectedIndex = selectedIndex;
/*     */   }
/*     */ 
/*     */   public boolean isFired()
/*     */   {
/*  44 */     return this.fired;
/*     */   }
/*     */ 
/*     */   public void setFired(boolean fired) {
/*  48 */     if (firedImage == null) {
/*  49 */       firedImage = new Image[2];
/*  50 */       firedImage[0] = ImageLoader.loadImage("redbaby");
/*  51 */       firedImage[1] = ImageLoader.loadImage("redbaby01");
/*     */     }
/*  53 */     this.fired = fired;
/*     */   }
/*     */ 
/*     */   public boolean isIsTOOB() {
/*  57 */     return this.isTOOB;
/*     */   }
/*     */ 
/*     */   public void setIsTOOB(boolean isTOOB) {
/*  61 */     this.isTOOB = isTOOB;
/*     */   }
/*     */   public boolean isMoveBallon() {
/*  64 */     return this.moveBallon;
/*     */   }
/*     */ 
/*     */   public void setMoveBallon(boolean moveBallon) {
/*  68 */     this.moveBallon = moveBallon;
/*  69 */     this.toLocationY = 30;
/*     */   }
/*     */ 
/*     */   public boolean isMoveX() {
/*  73 */     return this.moveX;
/*     */   }
/*     */ 
/*     */   public void setMoveX(boolean moveX, int angles) {
/*  77 */     this.moveX = moveX;
/*     */ 
/*  79 */     this.theXangle = angles;
/*  80 */     this.theAngle = angles;
/*     */   }
/*     */ 
/*     */   public boolean isMove()
/*     */   {
/*  89 */     return this.move;
/*     */   }
/*     */ 
/*     */   public void setMove(boolean move) {
/*  93 */     this.move = move;
/*     */   }
/*     */ 
/*     */   public void setMove(boolean move, int angle)
/*     */   {
/*  98 */     this.move = move;
/*  99 */     this.angle = angle;
/* 100 */     this.theAngle = angle;
/* 101 */     this.toLocationY = (this.locationy - this.yMovePower);
/* 102 */     if (this.theAngle < 0)
/*     */     {
/* 104 */       this.toLocationX = (this.locationx + this.xMovePower);
/*     */     }
/*     */     else
/*     */     {
/* 108 */       this.toLocationX = (this.locationx - this.xMovePower);
/*     */     }
/*     */   }
/*     */ 
/*     */   public boolean isDown() {
/* 113 */     return this.down;
/*     */   }
/*     */ 
/*     */   public void setDown(boolean move) {
/* 117 */     this.down = move;
/*     */   }
/*     */ 
/*     */   public PlayerElement()
/*     */   {
/* 124 */     super(Constants.PLAYER);
/* 125 */     setFixedElement(true);
/* 126 */     this.babyWithBallon = ImageLoader.loadImage("babyballona");
/*     */ 
/* 128 */     if (holder == null) {
/* 129 */       holder = new Image[40];
/* 130 */       for (int i = 1; i < holder.length; i++)
/* 131 */         holder[(i - 1)] = ImageLoader.loadImage("baby/rotation00" + i);
/*     */     }
/* 133 */     this.locationx = 110;
/* 134 */     this.locationy = -10;
/* 135 */     this.elemntWidth = holder[0].getWidth();
/* 136 */     this.elementHeight = holder[0].getHeight();
/*     */   }
/*     */ 
/*     */   public void paint(Graphics g)
/*     */   {
/* 142 */     if (!Constants.ISPAUSE) {
/* 143 */       checkXAndYMove();
/* 144 */       if (isDown())
/*     */       {
/* 146 */         incrementY();
/*     */       }
/* 148 */       if (isMove())
/*     */       {
/* 150 */         if (this.theAngle == 45)
/*     */         {
/* 152 */           decrementX();
/* 153 */           decrementY();
/*     */         }
/*     */ 
/* 156 */         if (this.theAngle == -45)
/*     */         {
/* 158 */           incrementX();
/* 159 */           decrementY();
/*     */         }
/*     */       }
/* 162 */       if (isMoveX())
/*     */       {
/* 164 */         if (this.theXangle > 0)
/*     */         {
/* 166 */           incrementX();
/*     */         }
/*     */         else {
/* 169 */           decrementX();
/*     */         }
/*     */       }
/*     */ 
/* 173 */       if (this.moveBallon)
/*     */       {
/* 175 */         decrementY();
/*     */       }
/*     */ 
/* 178 */       if ((!this.isTOOB) || 
/* 183 */         (this.beginAnimate))
/*     */       {
/* 185 */         this.selectedIndex += 1;
/* 186 */         if (this.selectedIndex > holder.length - 2) {
/* 187 */           this.selectedIndex = 0;
/*     */         }
/*     */       }
/* 190 */       if (!isHidden())
/*     */       {
/* 192 */         if (this.withBallon) {
/* 193 */           g.drawImage(this.babyWithBallon, this.locationx, this.locationy, 0);
/*     */         }
/*     */         else
/* 196 */           g.drawImage(holder[this.selectedIndex], this.locationx, this.locationy, 0);
/*     */       }
/* 198 */       if (isFired())
/*     */       {
/* 200 */         g.drawImage(firedImage[this.nfired], this.locationx, this.locationy, 0);
/* 201 */         this.nfired += 1;
/* 202 */         if (this.nfired > 1)
/* 203 */           this.nfired = 0;
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public void incrementY()
/*     */   {
/* 212 */     this.beginAnimate = true;
/* 213 */     this.locationy += Constants.STEP;
/*     */   }
/*     */ 
/*     */   public void incrementX()
/*     */   {
/* 218 */     if (this.locationx < this.toLocationX)
/* 219 */       this.locationx += Constants.STEP;
/*     */   }
/*     */ 
/*     */   public void decrementY()
/*     */   {
/* 225 */     if (this.locationy > this.toLocationY) {
/* 226 */       this.locationy -= Constants.STEP;
/* 227 */       System.out.println("   " + this.locationy + "   " + this.toLocationY);
/*     */     }
/*     */   }
/*     */ 
/*     */   public void decrementX()
/*     */   {
/* 233 */     if (this.locationx > this.toLocationX)
/* 234 */       this.locationx -= Constants.STEP;
/*     */   }
/*     */ 
/*     */   public void checkXAndYMove()
/*     */   {
/* 239 */     if (isMove())
/*     */     {
/* 242 */       if (this.theAngle < 0) {
/* 243 */         if ((this.locationx >= this.toLocationX) && (this.locationy <= this.toLocationY))
/*     */         {
/* 245 */           this.move = false;
/* 246 */           this.down = true;
/*     */         }
/*     */ 
/*     */       }
/* 251 */       else if ((this.locationx <= this.toLocationX) && (this.locationy <= this.toLocationY))
/*     */       {
/* 253 */         this.move = false;
/* 254 */         this.down = true;
/*     */       }
/*     */ 
/*     */     }
/*     */ 
/* 262 */     if (isMoveX())
/*     */     {
/* 264 */       if (this.theXangle > 0) {
/* 265 */         if (this.locationx > this.toLocationX)
/*     */         {
/* 267 */           if (!this.withBallon) {
/* 268 */             this.move = false;
/* 269 */             this.moveX = false;
/* 270 */             this.down = true;
/*     */           }
/*     */         }
/*     */ 
/*     */       }
/* 275 */       else if (this.locationx < this.toLocationX)
/*     */       {
/* 277 */         if (!this.withBallon)
/*     */         {
/* 279 */           this.move = false;
/* 280 */           this.moveX = false;
/* 281 */           this.down = true;
/*     */         }
/*     */ 
/*     */       }
/*     */ 
/*     */     }
/*     */ 
/* 288 */     if (this.moveBallon)
/*     */     {
/* 290 */       if (this.locationy <= this.toLocationY)
/*     */       {
/* 292 */         this.move = false;
/* 293 */         this.moveX = false;
/* 294 */         this.down = true;
/* 295 */         this.moveBallon = false;
/* 296 */         this.withBallon = false;
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public void resetAll()
/*     */   {
/* 303 */     this.down = false;
/* 304 */     this.move = false;
/*     */ 
/* 306 */     this.moveX = false;
/*     */ 
/* 308 */     this.moveBallon = false;
/*     */   }
/*     */ 
/*     */   public void freememory()
/*     */   {
/*     */   }
/*     */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veritechnolohy.elements.PlayerElement
 * JD-Core Version:    0.6.2
 */