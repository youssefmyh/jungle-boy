/*     */ package com.veripark.levels2;
/*     */ 
/*     */ import com.veritechnology.engine.AddingElements;
/*     */ import com.veritechnology.engine.Constants;
/*     */ import com.veritechnology.engine.ImageLoader;
/*     */ import com.veritechnolohy.Screens.MainScreen;
/*     */ import com.veritechnolohy.elements.Ballon;
/*     */ import com.veritechnolohy.elements.Bazaza;
/*     */ import com.veritechnolohy.elements.Electrical;
/*     */ import com.veritechnolohy.elements.ElectricalwithAngle;
/*     */ import com.veritechnolohy.elements.Marwaha;
/*     */ import com.veritechnolohy.elements.MoveBlock;
/*     */ import com.veritechnolohy.elements.Rubber;
/*     */ import com.veritechnolohy.elements.SEER;
/*     */ import com.veritechnolohy.elements.TOOB;
/*     */ import com.veritechnolohy.elements.VerticalElectrical;
/*     */ import javax.microedition.lcdui.Graphics;
/*     */ import javax.microedition.lcdui.Image;
/*     */ 
/*     */ public class level1129 extends MainScreen
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
/*     */   private ElectricalwithAngle electericalwithAngle;
/*     */   private ElectricalwithAngle electericalwithAngle2;
/*     */ 
/*     */   public level1129()
/*     */   {
/*  45 */     super(29);
/*  46 */     this.electericalwithAngle = new ElectricalwithAngle(1);
/*  47 */     this.electericalwithAngle2 = new ElectricalwithAngle(-1);
/*  48 */     this.electericalwithAngle.setLocationx(50);
/*  49 */     this.electericalwithAngle.setLocationy(200);
/*     */ 
/*  51 */     this.electericalwithAngle2.setLocationx(50);
/*  52 */     this.electericalwithAngle2.setLocationy(200);
/*  53 */     this.bazaza = new Bazaza();
/*     */ 
/*  55 */     AddingElements.addingBAZaZElement(100, 250, this);
/*  56 */     AddingElements.addingBAZaZElement(100, 350, this);
/*     */ 
/*  63 */     this.bazaza.setLocationx(200);
/*  64 */     this.bazaza.setLocationy(230);
/*  65 */     this.toob = new TOOB();
/*  66 */     this.toob.setLocationx(329);
/*  67 */     this.toob.setLocationy(218);
/*     */ 
/*  74 */     this.levelBg = ImageLoader.loadImage("levelsbg");
/*  75 */     this.rubber = new Rubber(-45);
/*  76 */     this.rubber.setXYMovePowerFromRubber(150, 80);
/*  77 */     this.rubber.setLocationx(167);
/*  78 */     this.rubber.setLocationy(434);
/*  79 */     addElement(this.electericalwithAngle);
/*  80 */     addElement(this.electericalwithAngle2);
/*     */ 
/*  91 */     this.electrical = new Electrical(-1);
/*  92 */     this.electrical.setLocationx(70);
/*  93 */     this.electrical.setLocationy(210);
/*     */ 
/*  95 */     this.ballon = new Ballon(0);
/*     */ 
/*  97 */     addElement(this.ballon);
/*  98 */     addElement(this.rubber);
/*  99 */     addElement(this.bazaza);
/*     */ 
/* 106 */     AddingElements.addingFirstSereer(200, 119, this);
/* 107 */     addPlayer();
/* 108 */     AddingElements.addingSereer(200, 119, this);
/* 109 */     new Thread(this).start();
/*     */   }
/*     */ 
/*     */   protected void pointerPressed(int x, int y) {
/* 113 */     super.pointerPressed(x, y);
/* 114 */     repaint();
/*     */   }
/*     */ 
/*     */   protected void pointerDragged(int x, int y) {
/* 118 */     super.pointerDragged(x, y);
/* 119 */     repaint();
/*     */   }
/*     */ 
/*     */   public void paint(Graphics g)
/*     */   {
/* 124 */     g.setColor(16777215);
/* 125 */     g.fillRect(0, 0, getWidth(), getHeight());
/* 126 */     g.drawImage(this.levelBg, 0, 0, 0);
/* 127 */     super.paint(g);
/*     */   }
/*     */ 
/*     */   public void run()
/*     */   {
/* 132 */     while (Constants.ISTHREADRUN)
/*     */       try {
/* 134 */         repaint();
/* 135 */         Thread.sleep(50L);
/*     */       }
/*     */       catch (InterruptedException ex)
/*     */       {
/* 139 */         ex.printStackTrace();
/*     */       }
/*     */   }
/*     */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veripark.levels2.level1129
 * JD-Core Version:    0.6.2
 */