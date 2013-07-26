/*     */ package com.veritechnology.engine;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.io.PrintStream;
/*     */ import javax.microedition.lcdui.Image;
/*     */ 
/*     */ public class ImageLoader
/*     */ {
/*     */   public static Image levelNoStar;
/*     */   public static Image levelStar1;
/*     */   public static Image levelStar2;
/*     */   public static Image levelStar3;
/*     */   public static Image portraitOnlyImage;
/*     */   public static Image levelNoStar_SC;
/*     */   public static Image levelStar1_SC;
/*     */   public static Image levelStar2_SC;
/*     */   public static Image levelStar3_SC;
/*     */ 
/*     */   public static Image getPortraitImage()
/*     */   {
/*  29 */     if (portraitOnlyImage == null)
/*     */     {
/*  31 */       portraitOnlyImage = loadImage("portrait");
/*     */     }
/*  33 */     return portraitOnlyImage;
/*     */   }
/*     */ 
/*     */   public static Image loadLevel(int lstar)
/*     */   {
/*  38 */     if (lstar == 0) {
/*  39 */       if (levelNoStar == null) {
/*  40 */         return loadImage("nostar");
/*     */       }
/*     */ 
/*  43 */       return levelNoStar;
/*     */     }
/*     */ 
/*  47 */     if (lstar == 1)
/*     */     {
/*  49 */       return loadImage("1star");
/*     */     }
/*     */ 
/*  53 */     if (lstar == 2)
/*     */     {
/*  55 */       return loadImage("2stars");
/*     */     }
/*     */ 
/*  59 */     if (lstar == 3)
/*     */     {
/*  61 */       return loadImage("3stars");
/*     */     }
/*     */ 
/*  65 */     return null;
/*     */   }
/*     */ 
/*     */   public static Image loadLevel_SC(int lstar)
/*     */   {
/*  71 */     if (lstar == 0) {
/*  72 */       if (levelNoStar == null) {
/*  73 */         return loadImage("nostar_sc");
/*     */       }
/*     */ 
/*  76 */       return levelNoStar;
/*     */     }
/*     */ 
/*  80 */     if (lstar == 1)
/*     */     {
/*  82 */       return loadImage("1star_sc");
/*     */     }
/*     */ 
/*  86 */     if (lstar == 2)
/*     */     {
/*  88 */       return loadImage("2star_sc");
/*     */     }
/*     */ 
/*  92 */     if (lstar == 3)
/*     */     {
/*  94 */       return loadImage("3starts_sc");
/*     */     }
/*     */ 
/*  98 */     return null;
/*     */   }
/*     */ 
/*     */   public static Image laodLevelNumber(int levelNumber)
/*     */   {
/* 106 */     return loadImage("" + levelNumber);
/*     */   }
/*     */ 
/*     */   public static Image loadImage(String imagename)
/*     */   {
/*     */     try {
/* 112 */       System.out.println(Constants.IMAGES_PATH + imagename + ".png");
/* 113 */       return Image.createImage(Constants.IMAGES_PATH + imagename + ".png");
/*     */     }
/*     */     catch (IOException ex) {
/* 116 */       ex.printStackTrace();
/*     */     }
/* 118 */     return null;
/*     */   }
/*     */ 
/*     */   public static Image loadImage(String imagename, int imgId) {
/*     */     try {
/* 123 */       return Image.createImage(Constants.IMAGES_PATH + imagename + "_" + imgId);
/*     */     } catch (IOException ex) {
/* 125 */       ex.printStackTrace();
/*     */     }
/* 127 */     return null;
/*     */   }
/*     */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veritechnology.engine.ImageLoader
 * JD-Core Version:    0.6.2
 */