/*     */ package com.veritechnolohy.elements;
/*     */ 
/*     */ import com.veritechnology.engine.Listener;
/*     */ import com.veritechnology.engine.releaseObject;
/*     */ import javax.microedition.lcdui.Graphics;
/*     */ import javax.microedition.lcdui.Image;
/*     */ import javax.microedition.lcdui.game.Sprite;
/*     */ 
/*     */ public abstract class MainElement
/*     */   implements releaseObject
/*     */ {
/*     */   public int startFromMoveLoactionX;
/*     */   public boolean withBallon;
/*     */   int theAngle;
/*     */   public int startFromMoveLoactionY;
/*     */   public int xMovePower;
/*     */   public int yMovePower;
/*     */   public int locationx;
/*     */   public int locationy;
/*     */   public int elemntWidth;
/*     */   public int elementHeight;
/*     */   public String imgName;
/*     */   public Image elementImage;
/*     */   public int numberOfImage;
/*     */   public Sprite elementSpirit;
/*     */   public boolean fixedElement;
/*     */   public int fieldType;
/*     */   boolean hidden;
/*     */   public int toLocationX;
/*     */   public int toLocationY;
/*     */   Listener listener;
/*     */ 
/*     */   public int getTheAngle()
/*     */   {
/*  25 */     return this.theAngle;
/*     */   }
/*     */ 
/*     */   public void setTheAngle(int theAngle) {
/*  29 */     this.theAngle = theAngle;
/*     */   }
/*     */   public boolean isWithBallon() {
/*  32 */     return this.withBallon;
/*     */   }
/*     */ 
/*     */   public void setWithBallon(boolean withBallon) {
/*  36 */     this.withBallon = withBallon;
/*     */   }
/*     */   public int getStartFromMoveLoactionX() {
/*  39 */     return this.startFromMoveLoactionX;
/*     */   }
/*     */ 
/*     */   public void setStartFromMoveLoactionX(int startFromMoveLoactionX) {
/*  43 */     this.startFromMoveLoactionX = startFromMoveLoactionX;
/*     */   }
/*     */ 
/*     */   public int getStartFromMoveLoactionY() {
/*  47 */     return this.startFromMoveLoactionY;
/*     */   }
/*     */ 
/*     */   public void setStartFromMoveLoactionY(int startFromMoveLoactionY) {
/*  51 */     this.startFromMoveLoactionY = startFromMoveLoactionY;
/*     */   }
/*     */ 
/*     */   public int getxMovePower()
/*     */   {
/*  59 */     return this.xMovePower;
/*     */   }
/*     */ 
/*     */   public void setxMovePower(int xMovePower)
/*     */   {
/*  64 */     this.toLocationX = xMovePower;
/*     */   }
/*     */ 
/*     */   public void setXYMovePowerFromRubber(int xpower, int ypower)
/*     */   {
/*  69 */     this.xMovePower = xpower;
/*  70 */     this.yMovePower = ypower;
/*  71 */     if (this.theAngle < 0)
/*  72 */       this.toLocationX = (this.locationx - xpower);
/*     */     else {
/*  74 */       this.toLocationX = (this.locationx + xpower);
/*     */     }
/*  76 */     this.toLocationY = (this.locationy - ypower);
/*     */   }
/*     */ 
/*     */   public int getyMovePower()
/*     */   {
/*  83 */     return this.yMovePower;
/*     */   }
/*     */ 
/*     */   public void setyMovePower(int yMovePower) {
/*  87 */     this.yMovePower = yMovePower;
/*     */   }
/*     */ 
/*     */   public int getLocationx()
/*     */   {
/*  92 */     return this.locationx;
/*     */   }
/*     */ 
/*     */   public void setLocationx(int locationx) {
/*  96 */     this.locationx = locationx;
/*     */   }
/*     */ 
/*     */   public int getLocationy() {
/* 100 */     return this.locationy;
/*     */   }
/*     */ 
/*     */   public void setLocationy(int locationy) {
/* 104 */     this.locationy = locationy;
/*     */   }
/*     */ 
/*     */   public int getToLocationX()
/*     */   {
/* 120 */     return this.toLocationX;
/*     */   }
/*     */ 
/*     */   public void setToLocationX(int toLocationX) {
/* 124 */     this.toLocationX = toLocationX;
/*     */   }
/*     */ 
/*     */   public boolean isHidden()
/*     */   {
/* 129 */     return this.hidden;
/*     */   }
/*     */ 
/*     */   public void setHidden(boolean hidden) {
/* 133 */     this.hidden = hidden;
/*     */   }
/*     */ 
/*     */   public int getFieldType() {
/* 137 */     return this.fieldType;
/*     */   }
/*     */ 
/*     */   public void setFieldType(int fieldType) {
/* 141 */     this.fieldType = fieldType;
/*     */   }
/*     */   public boolean isFixedElement() {
/* 144 */     return this.fixedElement;
/*     */   }
/*     */ 
/*     */   public void setFixedElement(boolean fixedElement) {
/* 148 */     this.fixedElement = fixedElement;
/*     */   }
/*     */ 
/*     */   public Listener getListener()
/*     */   {
/* 153 */     return this.listener;
/*     */   }
/*     */ 
/*     */   public void setListener(Listener listener) {
/* 157 */     this.listener = listener;
/*     */   }
/*     */ 
/*     */   public MainElement(int fieldtype) {
/* 161 */     this.fieldType = fieldtype;
/*     */   }
/*     */ 
/*     */   public void setElementSpirit(Sprite sp)
/*     */   {
/* 167 */     this.elementSpirit = sp;
/*     */   }
/*     */ 
/*     */   public MainElement(String eImage, int nImage)
/*     */   {
/* 173 */     this.numberOfImage = nImage;
/* 174 */     this.imgName = eImage;
/*     */   }
/*     */ 
/*     */   public abstract void paint(Graphics paramGraphics);
/*     */ 
/*     */   public void freeElement()
/*     */   {
/* 184 */     this.imgName = null;
/* 185 */     this.elementImage = null;
/*     */   }
/*     */ 
/*     */   public abstract void freememory();
/*     */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veritechnolohy.elements.MainElement
 * JD-Core Version:    0.6.2
 */