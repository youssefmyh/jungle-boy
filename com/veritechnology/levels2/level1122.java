/*     */ package com.veripark.levels2;
/*     */ 
/*     */ import com.veritechnology.engine.AddingElements;
/*     */ import com.veritechnology.engine.Constants;
/*     */ import com.veritechnology.engine.ImageLoader;
/*     */ import com.veritechnolohy.Screens.MainScreen;
/*     */ import com.veritechnolohy.elements.Ballon;
/*     */ import com.veritechnolohy.elements.Bazaza;
/*     */ import com.veritechnolohy.elements.Electrical;
/*     */ import com.veritechnolohy.elements.Marwaha;
/*     */ import com.veritechnolohy.elements.Rubber;
/*     */ import com.veritechnolohy.elements.SEER;
/*     */ import com.veritechnolohy.elements.TOOB;
/*     */ import javax.microedition.lcdui.Graphics;
/*     */ import javax.microedition.lcdui.Image;
/*     */ 
/*     */ public class level1122 extends MainScreen
/*     */   implements Runnable
/*     */ {
/*     */   private Image levelBg;
/*     */   private Rubber rubber;
/*     */   private Bazaza bazaza;
/*     */   private Ballon ballon;
/*     */   private SEER seer;
/*     */   private TOOB toob;
/*     */   private Marwaha marwha;
/*     */   private Electrical electrical;
/*     */ 
/*     */   public level1122()
/*     */   {
/*  37 */     super(22);
/*  38 */     this.bazaza = new Bazaza();
/*     */ 
/*  40 */     this.marwha = new Marwaha(1);
/*  41 */     this.marwha.setLocationx(120);
/*  42 */     this.marwha.setLocationy(300);
/*     */ 
/*  44 */     AddingElements.addingBAZaZElement(100, 250, this);
/*     */ 
/*  46 */     AddingElements.addingBAZaZElement(100, 400, this);
/*     */ 
/*  49 */     this.bazaza.setLocationx(190);
/*  50 */     this.bazaza.setLocationy(200);
/*     */ 
/*  53 */     this.seer = new SEER(1);
/*  54 */     this.seer.setLocationx(45);
/*  55 */     this.seer.setLocationy(256);
/*  56 */     this.levelBg = ImageLoader.loadImage("levelsbg");
/*     */ 
/*  58 */     this.electrical = new Electrical(-1);
/*  59 */     this.electrical.setLocationx(198);
/*  60 */     this.electrical.setLocationy(378);
/*     */ 
/*  62 */     this.ballon = new Ballon(0);
/*  63 */     this.ballon.setLocationy(300);
/*  64 */     addElement(this.seer);
/*  65 */     addElement(this.ballon);
/*     */ 
/*  67 */     addElement(this.bazaza);
/*     */ 
/*  69 */     addElement(this.marwha);
/*  70 */     addElement(this.electrical);
/*     */ 
/*  72 */     AddingElements.addingFirstSereer(231, 228, this);
/*  73 */     addPlayer();
/*  74 */     AddingElements.addingSereer(231, 228, this);
/*  75 */     new Thread(this).start();
/*     */   }
/*     */ 
/*     */   protected void pointerPressed(int x, int y)
/*     */   {
/*  80 */     super.pointerPressed(x, y);
/*  81 */     repaint();
/*     */   }
/*     */ 
/*     */   protected void pointerDragged(int x, int y) {
/*  85 */     super.pointerDragged(x, y);
/*  86 */     repaint();
/*     */   }
/*     */ 
/*     */   public void paint(Graphics g)
/*     */   {
/*  93 */     g.setColor(16777215);
/*  94 */     g.fillRect(0, 0, getWidth(), getHeight());
/*  95 */     g.drawImage(this.levelBg, 0, 0, 0);
/*  96 */     super.paint(g);
/*     */   }
/*     */ 
/*     */   public void run()
/*     */   {
/* 102 */     while (Constants.ISTHREADRUN)
/*     */       try
/*     */       {
/* 105 */         repaint();
/* 106 */         Thread.sleep(50L);
/*     */       }
/*     */       catch (InterruptedException ex)
/*     */       {
/* 111 */         ex.printStackTrace();
/*     */       }
/*     */   }
/*     */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veripark.levels2.level1122
 * JD-Core Version:    0.6.2
 */