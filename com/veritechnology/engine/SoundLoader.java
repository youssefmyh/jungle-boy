/*     */ package com.veritechnology.engine;
/*     */ 
/*     */ import java.io.InputStream;
/*     */ import java.io.PrintStream;
/*     */ import javax.microedition.media.Manager;
/*     */ import javax.microedition.media.MediaException;
/*     */ import javax.microedition.media.Player;
/*     */ 
/*     */ public class SoundLoader
/*     */ {
/*     */   public static Player levelCompletePlayer;
/*     */   public static Player bazazaPlayer;
/*     */   public static Player jumpPlayer;
/*     */   public static Player electericalPlayer;
/*     */   public static Player mainplayersound;
/*     */   public static Player startSound;
/*     */ 
/*     */   public static void stopStartedPlayer()
/*     */   {
/*     */     try
/*     */     {
/*  29 */       startSound.stop();
/*     */     } catch (MediaException ex) {
/*  31 */       ex.printStackTrace();
/*     */     }
/*     */   }
/*     */ 
/*     */   public static void stopMainPlayer()
/*     */   {
/*     */     try
/*     */     {
/*  39 */       mainplayersound.stop();
/*     */     } catch (MediaException ex) {
/*  41 */       ex.printStackTrace();
/*     */     }
/*     */   }
/*     */ 
/*     */   public static void loadsounds()
/*     */   {
/*     */     try
/*     */     {
/*  50 */       InputStream in = SoundLoader.class.getClass().getResourceAsStream("/res/levelcomplete.wav");
/*  51 */       levelCompletePlayer = Manager.createPlayer(in, "audio/x-wav");
/*  52 */       levelCompletePlayer.prefetch();
/*  53 */       in = SoundLoader.class.getClass().getResourceAsStream("/res/takebazaza.wav");
/*  54 */       bazazaPlayer = Manager.createPlayer(in, "audio/x-wav");
/*  55 */       bazazaPlayer.prefetch();
/*     */ 
/*  57 */       in = SoundLoader.class.getClass().getResourceAsStream("/res/electerical.wav");
/*  58 */       electericalPlayer = Manager.createPlayer(in, "audio/x-wav");
/*  59 */       electericalPlayer.prefetch();
/*     */ 
/*  61 */       in = SoundLoader.class.getClass().getResourceAsStream("/res/jungle1.wav");
/*  62 */       mainplayersound = Manager.createPlayer(in, "audio/x-wav");
/*  63 */       mainplayersound.setLoopCount(-1);
/*  64 */       mainplayersound.prefetch();
/*     */ 
/*  66 */       in = SoundLoader.class.getClass().getResourceAsStream("/res/darkwoods1.wav");
/*  67 */       startSound = Manager.createPlayer(in, "audio/x-wav");
/*  68 */       startSound.setLoopCount(-1);
/*  69 */       startSound.prefetch();
/*     */     }
/*     */     catch (Exception e)
/*     */     {
/*  73 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */ 
/*     */   public static void playMainPlayer()
/*     */   {
/*  79 */     if (LevelsStars.levelsstarts_num[30] == 0)
/*     */       try {
/*  81 */         mainplayersound.stop();
/*  82 */         return;
/*     */       } catch (MediaException ex) {
/*  84 */         ex.printStackTrace();
/*     */       }
/*     */     try
/*     */     {
/*  88 */       if (mainplayersound.getState() != 400)
/*  89 */         mainplayersound.start();
/*     */     } catch (Exception e) {
/*  91 */       System.out.println("Element Exception");
/*     */     }
/*     */   }
/*     */ 
/*     */   public static void playStartPlayer()
/*     */   {
/* 101 */     if (LevelsStars.levelsstarts_num[30] == 0)
/*     */       try {
/* 103 */         startSound.stop();
/* 104 */         return;
/*     */       } catch (MediaException ex) {
/* 106 */         ex.printStackTrace();
/*     */       }
/*     */     try
/*     */     {
/* 110 */       if (mainplayersound.getState() != 400)
/* 111 */         startSound.start();
/*     */     } catch (Exception e) {
/* 113 */       System.out.println("Element Exception");
/*     */     }
/*     */   }
/*     */ 
/*     */   public static void playBazazSound()
/*     */   {
/* 124 */     if (LevelsStars.levelsstarts_num[30] == 0)
/* 125 */       return;
/*     */     try {
/* 127 */       bazazaPlayer.start();
/*     */     } catch (Exception e) {
/* 129 */       System.out.println("Element Exception");
/*     */     }
/*     */   }
/*     */ 
/*     */   public static void playElectericalSound()
/*     */   {
/* 140 */     if (LevelsStars.levelsstarts_num[30] == 0)
/* 141 */       return;
/*     */     try {
/* 143 */       if (electericalPlayer.getState() != 400)
/* 144 */         electericalPlayer.start();
/*     */     } catch (Exception e) {
/* 146 */       System.out.println("Element Exception");
/*     */     }
/*     */   }
/*     */ 
/*     */   public static void playFinishLevelSound()
/*     */   {
/* 155 */     if (LevelsStars.levelsstarts_num[30] == 0)
/* 156 */       return;
/*     */     try
/*     */     {
/* 159 */       levelCompletePlayer.start();
/*     */     } catch (Exception e) {
/* 161 */       System.out.println("level Complete Exception");
/*     */     }
/*     */   }
/*     */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veritechnology.engine.SoundLoader
 * JD-Core Version:    0.6.2
 */