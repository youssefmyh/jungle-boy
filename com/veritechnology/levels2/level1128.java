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
/*     */ import com.veritechnolohy.elements.MoveBlock;
/*     */ import com.veritechnolohy.elements.Rubber;
/*     */ import com.veritechnolohy.elements.SEER;
/*     */ import com.veritechnolohy.elements.TOOB;
/*     */ import com.veritechnolohy.elements.VerticalElectrical;
/*     */ import javax.microedition.lcdui.Graphics;
/*     */ import javax.microedition.lcdui.Image;
/*     */ 
/*     */ public class level1128 extends MainScreen
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
/*     */   private MoveBlock movebloack;
/*     */   private MoveBlock movebloack2;
/*     */ 
/*     */   public level1128()
/*     */   {
/*  42 */     super(28);
/*  43 */     this.bazaza = new Bazaza();
/*     */ 
/*  45 */     this.marwha = new Marwaha(1);
/*  46 */     this.marwha.setLocationx(280);
/*  47 */     this.marwha.setLocationy(300);
/*  48 */     this.bazaza.setLocationx(200);
/*  49 */     this.bazaza.setLocationy(200);
/*  50 */     this.toob = new TOOB();
/*  51 */     this.toob.setLocationx(329);
/*  52 */     this.toob.setLocationy(218);
/*     */ 
/*  54 */     AddingElements.addingBAZaZElement(100, 200, this);
/*  55 */     AddingElements.addingBAZaZElement(200, 400, this);
/*     */ 
/*  59 */     this.vErictrical = new VerticalElectrical(0);
/*  60 */     this.vErictrical.setLocationx(292);
/*  61 */     this.vErictrical.setLocationy(227);
/*  62 */     this.seer = new SEER(-1);
/*  63 */     this.seer.setLocationx(45);
/*  64 */     this.seer.setLocationy(340);
/*  65 */     this.levelBg = ImageLoader.loadImage("levelsbg");
/*  66 */     this.rubber = new Rubber(-45);
/*  67 */     this.rubber.setXYMovePowerFromRubber(150, 80);
/*  68 */     this.rubber.setLocationx(167);
/*  69 */     this.rubber.setLocationy(434);
/*     */ 
/*  71 */     this.movebloack = new MoveBlock(1);
/*  72 */     this.movebloack.setLocationx(400);
/*  73 */     this.movebloack.setLocationy(350);
/*  74 */     addElement(this.movebloack);
/*     */ 
/*  76 */     this.movebloack2 = new MoveBlock(1);
/*  77 */     this.movebloack2.setLocationx(-50);
/*  78 */     this.movebloack2.setLocationy(350);
/*  79 */     addElement(this.movebloack2);
/*     */ 
/*  81 */     this.electrical = new Electrical(-1);
/*  82 */     this.electrical.setLocationx(70);
/*  83 */     this.electrical.setLocationy(210);
/*     */ 
/*  85 */     this.ballon = new Ballon(0);
/*     */ 
/*  87 */     addElement(this.ballon);
/*  88 */     addElement(this.rubber);
/*  89 */     addElement(this.bazaza);
/*     */ 
/*  92 */     addElement(this.electrical);
/*     */ 
/*  96 */     AddingElements.addingFirstSereer(200, 119, this);
/*  97 */     addPlayer();
/*  98 */     AddingElements.addingSereer(200, 119, this);
/*  99 */     new Thread(this).start();
/*     */   }
/*     */ 
/*     */   protected void pointerPressed(int x, int y)
/*     */   {
/* 104 */     super.pointerPressed(x, y);
/* 105 */     repaint();
/*     */   }
/*     */ 
/*     */   protected void pointerDragged(int x, int y) {
/* 109 */     super.pointerDragged(x, y);
/* 110 */     repaint();
/*     */   }
/*     */ 
/*     */   public void paint(Graphics g)
/*     */   {
/* 117 */     g.setColor(16777215);
/* 118 */     g.fillRect(0, 0, getWidth(), getHeight());
/* 119 */     g.drawImage(this.levelBg, 0, 0, 0);
/* 120 */     super.paint(g);
/*     */   }
/*     */ 
/*     */   public void run()
/*     */   {
/* 126 */     while (Constants.ISTHREADRUN)
/*     */       try
/*     */       {
/* 129 */         repaint();
/* 130 */         Thread.sleep(50L);
/*     */       }
/*     */       catch (InterruptedException ex)
/*     */       {
/* 135 */         ex.printStackTrace();
/*     */       }
/*     */   }
/*     */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veripark.levels2.level1128
 * JD-Core Version:    0.6.2
 */