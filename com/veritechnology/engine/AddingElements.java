/*    */ package com.veritechnology.engine;
/*    */ 
/*    */ import com.veritechnolohy.Screens.MainScreen;
/*    */ import com.veritechnolohy.elements.Bazaza;
/*    */ import com.veritechnolohy.elements.DragAndDrop;
/*    */ import com.veritechnolohy.elements.SEREER;
/*    */ import com.veritechnolohy.elements.SERERRFELEMT;
/*    */ 
/*    */ public class AddingElements
/*    */ {
/*    */   public static void addingSereer(int locationx, int locationy, MainScreen mainscreen)
/*    */   {
/* 22 */     SEREER serer = new SEREER();
/* 23 */     serer.setLocationx(locationx);
/* 24 */     serer.setLocationy(locationy);
/* 25 */     mainscreen.addElement(serer);
/*    */   }
/*    */ 
/*    */   public static void addingFirstSereer(int locationx, int locationy, MainScreen mainscreen)
/*    */   {
/* 31 */     SERERRFELEMT secondsereer = new SERERRFELEMT();
/* 32 */     secondsereer.setLocationx(locationx);
/* 33 */     secondsereer.setLocationy(locationy);
/* 34 */     mainscreen.addElement(secondsereer);
/*    */   }
/*    */ 
/*    */   public static void addingDragAndDrop(int locationx, int locationy, MainScreen mainscreen)
/*    */   {
/* 40 */     DragAndDrop secondsereer = new DragAndDrop();
/* 41 */     secondsereer.setLocationx(locationx);
/* 42 */     secondsereer.setLocationy(locationy);
/* 43 */     mainscreen.addElement(secondsereer);
/*    */   }
/*    */ 
/*    */   public static void addingBAZaZElement(int locationx, int locationy, MainScreen mainscreen)
/*    */   {
/* 49 */     Bazaza secondsereer = new Bazaza();
/* 50 */     secondsereer.setLocationx(locationx);
/* 51 */     secondsereer.setLocationy(locationy);
/* 52 */     mainscreen.addElement(secondsereer);
/*    */   }
/*    */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veritechnology.engine.AddingElements
 * JD-Core Version:    0.6.2
 */