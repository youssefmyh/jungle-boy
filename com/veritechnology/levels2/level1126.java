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
/*     */ import com.veritechnolohy.elements.VerticalElectrical;
/*     */ import javax.microedition.lcdui.Graphics;
/*     */ import javax.microedition.lcdui.Image;
/*     */ 
/*     */ public class level1126 extends MainScreen
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
/*     */   private VerticalElectrical vErictrical;
/*     */ 
/*     */   public level1126()
/*     */   {
/*  37 */     super(26);
/*  38 */     this.bazaza = new Bazaza();
/*  39 */     this.bazaza.setLocationx(10);
/*  40 */     this.bazaza.setLocationy(200);
/*     */ 
/*  42 */     AddingElements.addingBAZaZElement(100, 300, this);
/*  43 */     AddingElements.addingBAZaZElement(130, 360, this);
/*     */ 
/*  46 */     this.vErictrical = new VerticalElectrical(0);
/*  47 */     this.vErictrical.setLocationx(292);
/*  48 */     this.vErictrical.setLocationy(227);
/*  49 */     this.seer = new SEER(-1);
/*  50 */     this.seer.setLocationx(45);
/*  51 */     this.seer.setLocationy(400);
/*  52 */     this.levelBg = ImageLoader.loadImage("levelsbg");
/*  53 */     this.rubber = new Rubber(-45);
/*  54 */     this.rubber.setXYMovePowerFromRubber(150, 80);
/*  55 */     this.rubber.setLocationx(220);
/*  56 */     this.rubber.setLocationy(400);
/*     */ 
/*  59 */     this.electrical = new Electrical(-1);
/*  60 */     this.electrical.setLocationx(70);
/*  61 */     this.electrical.setLocationy(210);
/*     */ 
/*  63 */     this.ballon = new Ballon(0);
/*  64 */     addElement(this.seer);
/*     */ 
/*  66 */     addElement(this.rubber);
/*  67 */     addElement(this.bazaza);
/*     */ 
/*  70 */     addElement(this.electrical);
/*     */ 
/*  73 */     AddingElements.addingFirstSereer(147, 467, this);
/*  74 */     addPlayer();
/*  75 */     AddingElements.addingSereer(147, 467, this);
/*  76 */     new Thread(this).start();
/*     */   }
/*     */ 
/*     */   protected void pointerPressed(int x, int y)
/*     */   {
/*  81 */     super.pointerPressed(x, y);
/*  82 */     repaint();
/*     */   }
/*     */ 
/*     */   protected void pointerDragged(int x, int y) {
/*  86 */     super.pointerDragged(x, y);
/*  87 */     repaint();
/*     */   }
/*     */ 
/*     */   public void paint(Graphics g)
/*     */   {
/*  94 */     g.setColor(16777215);
/*  95 */     g.fillRect(0, 0, getWidth(), getHeight());
/*  96 */     g.drawImage(this.levelBg, 0, 0, 0);
/*  97 */     super.paint(g);
/*     */   }
/*     */ 
/*     */   public void run()
/*     */   {
/* 103 */     while (Constants.ISTHREADRUN)
/*     */       try
/*     */       {
/* 106 */         repaint();
/* 107 */         Thread.sleep(50L);
/*     */       }
/*     */       catch (InterruptedException ex)
/*     */       {
/* 112 */         ex.printStackTrace();
/*     */       }
/*     */   }
/*     */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veripark.levels2.level1126
 * JD-Core Version:    0.6.2
 */