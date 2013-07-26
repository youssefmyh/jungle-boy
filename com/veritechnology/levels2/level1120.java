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
/*     */ import com.veritechnolohy.elements.TOOBHorizontal;
/*     */ import javax.microedition.lcdui.Graphics;
/*     */ import javax.microedition.lcdui.Image;
/*     */ 
/*     */ public class level1120 extends MainScreen
/*     */   implements Runnable
/*     */ {
/*     */   private Image levelBg;
/*     */   private Rubber rubber;
/*     */   private Bazaza bazaza;
/*     */   private Ballon ballon;
/*     */   private SEER seer;
/*     */   private TOOBHorizontal horizontalToob;
/*     */   private Marwaha marwha;
/*     */   private Electrical electrical;
/*     */ 
/*     */   public level1120()
/*     */   {
/*  37 */     super(20);
/*  38 */     this.bazaza = new Bazaza();
/*     */ 
/*  44 */     AddingElements.addingBAZaZElement(100, 200, this);
/*  45 */     AddingElements.addingBAZaZElement(100, 400, this);
/*     */ 
/*  48 */     this.bazaza.setLocationx(190);
/*  49 */     this.bazaza.setLocationy(200);
/*  50 */     this.horizontalToob = new TOOBHorizontal();
/*  51 */     this.horizontalToob.setLocationx(125);
/*  52 */     this.horizontalToob.setLocationy(125);
/*  53 */     this.levelBg = ImageLoader.loadImage("levelsbg");
/*  54 */     this.rubber = new Rubber(-45);
/*  55 */     this.rubber.setXYMovePowerFromRubber(200, 80);
/*  56 */     this.rubber.setLocationx(100);
/*  57 */     this.rubber.setLocationy(250);
/*     */ 
/*  60 */     this.electrical = new Electrical(-1);
/*  61 */     this.electrical.setLocationx(198);
/*  62 */     this.electrical.setLocationy(378);
/*  63 */     this.ballon = new Ballon(0);
/*  64 */     addElement(this.ballon);
/*  65 */     addElement(this.rubber);
/*  66 */     addElement(this.bazaza);
/*     */ 
/*  69 */     addElement(this.electrical);
/*     */ 
/*  71 */     AddingElements.addingFirstSereer(220, 285, this);
/*  72 */     addPlayer();
/*  73 */     AddingElements.addingSereer(220, 285, this);
/*  74 */     new Thread(this).start();
/*     */   }
/*     */ 
/*     */   protected void pointerPressed(int x, int y)
/*     */   {
/*  79 */     super.pointerPressed(x, y);
/*  80 */     repaint();
/*     */   }
/*     */ 
/*     */   protected void pointerDragged(int x, int y) {
/*  84 */     super.pointerDragged(x, y);
/*  85 */     repaint();
/*     */   }
/*     */ 
/*     */   public void paint(Graphics g)
/*     */   {
/*  92 */     g.setColor(16777215);
/*  93 */     g.fillRect(0, 0, getWidth(), getHeight());
/*  94 */     g.drawImage(this.levelBg, 0, 0, 0);
/*  95 */     super.paint(g);
/*     */   }
/*     */ 
/*     */   public void run()
/*     */   {
/* 101 */     while (Constants.ISTHREADRUN)
/*     */       try
/*     */       {
/* 104 */         repaint();
/* 105 */         Thread.sleep(50L);
/*     */       }
/*     */       catch (InterruptedException ex)
/*     */       {
/* 110 */         ex.printStackTrace();
/*     */       }
/*     */   }
/*     */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veripark.levels2.level1120
 * JD-Core Version:    0.6.2
 */