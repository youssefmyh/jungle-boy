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
/*     */ public class level1124 extends MainScreen
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
/*     */   public level1124()
/*     */   {
/*  40 */     super(24);
/*  41 */     this.bazaza = new Bazaza();
/*     */ 
/*  43 */     this.bazaza.setLocationx(190);
/*  44 */     this.bazaza.setLocationy(200);
/*  45 */     this.toob = new TOOB();
/*  46 */     this.toob.setLocationx(329);
/*  47 */     this.toob.setLocationy(218);
/*     */ 
/*  49 */     AddingElements.addingBAZaZElement(100, 200, this);
/*  50 */     AddingElements.addingBAZaZElement(200, 400, this);
/*     */ 
/*  54 */     this.vErictrical = new VerticalElectrical(0);
/*  55 */     this.vErictrical.setLocationx(292);
/*  56 */     this.vErictrical.setLocationy(227);
/*     */ 
/*  58 */     this.levelBg = ImageLoader.loadImage("levelsbg");
/*  59 */     this.rubber = new Rubber(-45);
/*  60 */     this.rubber.setXYMovePowerFromRubber(150, 80);
/*  61 */     this.rubber.setLocationy(350);
/*     */ 
/*  63 */     this.electrical = new Electrical(-1);
/*  64 */     this.electrical.setLocationx(40);
/*  65 */     this.electrical.setLocationy(207);
/*     */ 
/*  67 */     this.ballon = new Ballon(0);
/*     */ 
/*  69 */     addElement(this.ballon);
/*  70 */     addElement(this.rubber);
/*  71 */     addElement(this.bazaza);
/*  72 */     addElement(this.toob);
/*  73 */     addElement(this.electrical);
/*  74 */     addElement(this.vErictrical);
/*  75 */     AddingElements.addingFirstSereer(208, 121, this);
/*  76 */     addPlayer();
/*  77 */     AddingElements.addingSereer(208, 121, this);
/*  78 */     new Thread(this).start();
/*     */   }
/*     */ 
/*     */   protected void pointerPressed(int x, int y)
/*     */   {
/*  83 */     super.pointerPressed(x, y);
/*  84 */     repaint();
/*     */   }
/*     */ 
/*     */   protected void pointerDragged(int x, int y) {
/*  88 */     super.pointerDragged(x, y);
/*  89 */     repaint();
/*     */   }
/*     */ 
/*     */   public void paint(Graphics g)
/*     */   {
/*  96 */     g.setColor(16777215);
/*  97 */     g.fillRect(0, 0, getWidth(), getHeight());
/*  98 */     g.drawImage(this.levelBg, 0, 0, 0);
/*  99 */     super.paint(g);
/*     */   }
/*     */ 
/*     */   public void run()
/*     */   {
/* 105 */     while (Constants.ISTHREADRUN)
/*     */       try
/*     */       {
/* 108 */         repaint();
/* 109 */         Thread.sleep(50L);
/*     */       }
/*     */       catch (InterruptedException ex)
/*     */       {
/* 114 */         ex.printStackTrace();
/*     */       }
/*     */   }
/*     */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veripark.levels2.level1124
 * JD-Core Version:    0.6.2
 */