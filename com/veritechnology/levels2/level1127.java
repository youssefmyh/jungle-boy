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
/*     */ public class level1127 extends MainScreen
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
/*     */ 
/*     */   public level1127()
/*     */   {
/*  41 */     super(27);
/*  42 */     this.bazaza = new Bazaza();
/*     */ 
/*  44 */     AddingElements.addingBAZaZElement(100, 200, this);
/*     */ 
/*  46 */     AddingElements.addingBAZaZElement(100, 300, this);
/*  47 */     this.marwha = new Marwaha(1);
/*  48 */     this.marwha.setLocationx(280);
/*  49 */     this.marwha.setLocationy(400);
/*     */ 
/*  51 */     this.bazaza.setLocationx(200);
/*  52 */     this.bazaza.setLocationy(200);
/*  53 */     this.toob = new TOOB();
/*  54 */     this.toob.setLocationx(329);
/*  55 */     this.toob.setLocationy(218);
/*  56 */     this.vErictrical = new VerticalElectrical(0);
/*  57 */     this.vErictrical.setLocationx(292);
/*  58 */     this.vErictrical.setLocationy(227);
/*  59 */     this.seer = new SEER(-1);
/*  60 */     this.seer.setLocationx(45);
/*  61 */     this.seer.setLocationy(340);
/*  62 */     this.levelBg = ImageLoader.loadImage("levelsbg");
/*  63 */     this.rubber = new Rubber(-45);
/*  64 */     this.rubber.setXYMovePowerFromRubber(150, 80);
/*  65 */     this.rubber.setLocationx(167);
/*  66 */     this.rubber.setLocationy(434);
/*     */ 
/*  68 */     this.movebloack = new MoveBlock(1);
/*  69 */     this.movebloack.setLocationx(200);
/*  70 */     this.movebloack.setLocationy(350);
/*  71 */     addElement(this.movebloack);
/*  72 */     this.electrical = new Electrical(-1);
/*  73 */     this.electrical.setLocationx(70);
/*  74 */     this.electrical.setLocationy(210);
/*     */ 
/*  76 */     this.ballon = new Ballon(0);
/*     */ 
/*  78 */     addElement(this.ballon);
/*  79 */     addElement(this.bazaza);
/*  80 */     addElement(this.marwha);
/*  81 */     addElement(this.electrical);
/*     */ 
/*  83 */     AddingElements.addingFirstSereer(245, 221, this);
/*  84 */     addPlayer();
/*  85 */     AddingElements.addingSereer(245, 221, this);
/*  86 */     new Thread(this).start();
/*     */   }
/*     */ 
/*     */   protected void pointerPressed(int x, int y)
/*     */   {
/*  91 */     super.pointerPressed(x, y);
/*  92 */     repaint();
/*     */   }
/*     */ 
/*     */   protected void pointerDragged(int x, int y) {
/*  96 */     super.pointerDragged(x, y);
/*  97 */     repaint();
/*     */   }
/*     */ 
/*     */   public void paint(Graphics g)
/*     */   {
/* 104 */     g.setColor(16777215);
/* 105 */     g.fillRect(0, 0, getWidth(), getHeight());
/* 106 */     g.drawImage(this.levelBg, 0, 0, 0);
/* 107 */     super.paint(g);
/*     */   }
/*     */ 
/*     */   public void run()
/*     */   {
/* 113 */     while (Constants.ISTHREADRUN)
/*     */       try
/*     */       {
/* 116 */         repaint();
/* 117 */         Thread.sleep(50L);
/*     */       }
/*     */       catch (InterruptedException ex)
/*     */       {
/* 122 */         ex.printStackTrace();
/*     */       }
/*     */   }
/*     */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veripark.levels2.level1127
 * JD-Core Version:    0.6.2
 */