/*     */ package com.veritechnology.engine;
/*     */ 
/*     */ import java.io.ByteArrayInputStream;
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.DataInputStream;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.PrintStream;
/*     */ import javax.microedition.rms.RecordStore;
/*     */ 
/*     */ public class LevelsStars
/*     */ {
/*  20 */   public static byte[] levelsstarts_num = new byte[31];
/*     */   static RecordStore recordStore;
/*     */ 
/*     */   public static void storeLevels()
/*     */   {
/*     */     try
/*     */     {
/*  27 */       byte[] b = new byte[levelsstarts_num.length];
/*  28 */       for (int i = 0; i < levelsstarts_num.length; i++)
/*     */       {
/*  30 */         b[i] = levelsstarts_num[i];
/*     */       }
/*  32 */       saveDate(b);
/*     */     }
/*     */     catch (Exception e)
/*     */     {
/*  43 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */ 
/*     */   public static void loadLevels()
/*     */   {
/*     */     try
/*     */     {
/*  53 */       byte[] data = null;
/*  54 */       data = loadData(data);
/*     */ 
/*  56 */       for (int i = 0; i < data.length; i++)
/*     */       {
/*  58 */         levelsstarts_num[i] = data[i];
/*  59 */         System.out.println("le =" + i + "   " + data[i]);
/*     */       }
/*     */     }
/*     */     catch (Exception e) {
/*  63 */       System.err.println("Load LevelsStarts Error");
/*  64 */       levelsstarts_num[30] = 1;
/*     */     }
/*     */   }
/*     */ 
/*     */   public static void openRecord()
/*     */   {
/*     */     try
/*     */     {
/*  75 */       recordStore = RecordStore.openRecordStore("baby", true);
/*     */     }
/*     */     catch (Exception ee)
/*     */     {
/*  79 */       ee.printStackTrace();
/*     */     }
/*     */   }
/*     */ 
/*     */   public static void saveDate(byte[] setting)
/*     */   {
/*  87 */     openRecord();
/*     */     try
/*     */     {
/*  92 */       ByteArrayOutputStream outStream = new ByteArrayOutputStream();
/*  93 */       DataOutputStream dataOut = new DataOutputStream(outStream);
/*  94 */       dataOut.write(setting);
/*     */ 
/*  96 */       byte[] outArray = outStream.toByteArray();
/*  97 */       outStream.close();
/*  98 */       dataOut.close();
/*  99 */       outStream.reset();
/* 100 */       if (recordStore.getNumRecords() <= 0)
/* 101 */         recordStore.addRecord(outArray, 0, outArray.length);
/*     */       else
/* 103 */         recordStore.setRecord(1, outArray, 0, outArray.length);
/* 104 */       recordStore.closeRecordStore();
/*     */     }
/*     */     catch (Exception ee) {
/* 107 */       ee.printStackTrace();
/*     */     }
/*     */   }
/*     */ 
/*     */   public static byte[] loadData(byte[] outArray)
/*     */   {
/* 117 */     openRecord();
/*     */     try
/*     */     {
/* 120 */       if (recordStore.getNumRecords() > 0)
/*     */       {
/* 122 */         outArray = new byte[recordStore.getRecord(1).length];
/* 123 */         ByteArrayInputStream outStream = new ByteArrayInputStream(outArray);
/* 124 */         DataInputStream datain = new DataInputStream(outStream);
/* 125 */         recordStore.getRecord(1, outArray, 0);
/* 126 */         datain.read(outArray);
/*     */ 
/* 128 */         outStream.close();
/* 129 */         datain.close();
/* 130 */         recordStore.closeRecordStore();
/*     */       }
/*     */     }
/*     */     catch (Exception ee)
/*     */     {
/* 135 */       ee.printStackTrace();
/*     */     }
/* 137 */     return outArray;
/*     */   }
/*     */ }

/* Location:           /media/youssef/Hard3/Code C/babygame.jar
 * Qualified Name:     com.veritechnology.engine.LevelsStars
 * JD-Core Version:    0.6.2
 */