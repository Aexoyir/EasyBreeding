/*    */ package easybreeding.common;
/*    */ 
/*    */ import aab;
/*    */ import aqx;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ import om;
/*    */ import px;
/*    */ import qh;
/*    */ import rh;
/*    */ 
/*    */ public class EntityAIEatDroppedFood
/*    */   extends om
/*    */ {
/*    */   private qh animal;
/* 16 */   private Random rand = new Random();
/*    */   
/*    */   public EntityAIEatDroppedFood(qh ent)
/*    */   {
/* 19 */     this.animal = ent;
/*    */   }
/*    */   
/*    */   public rh whatFoodIsNear()
/*    */   {
/* 21 */     aab world = this.animal.q;
/* 22 */     float searchDistance = 8.0F;
/* 23 */     rh ei = new rh(world);
/* 24 */     List nearbyEntities = world.a(ei.getClass(), this.animal.E.b(searchDistance, searchDistance, searchDistance));
/*    */     
/* 26 */     Iterator iterate = nearbyEntities.iterator();
/*    */     rh check;
/*    */     do
/*    */     {
/* 28 */       if (!iterate.hasNext()) {
/* 29 */         return null;
/*    */       }
/* 31 */       check = (rh)iterate.next();
/* 32 */     } while (!this.animal.c(check.d()));
/* 34 */     return check;
/*    */   }
/*    */   
/*    */   public boolean a()
/*    */   {
/* 38 */     rh closeFood = whatFoodIsNear();
/* 39 */     if ((closeFood != null) && (this.animal.d <= 0) && (!this.animal.h_()) && (this.animal.b() == 0)) {
/* 40 */       execute(this.animal, closeFood);
/*    */     }
/* 42 */     return false;
/*    */   }
/*    */   
/*    */   public boolean execute(qh enta, rh enti)
/*    */   {
/* 47 */     if (enta.aC().a(enti.u, enti.v, enti.w, 0.25F)) {
/* 49 */       if (enta.d(enti) < 1.0F)
/*    */       {
/* 50 */         enta.q.a("heart", enta.u, enta.v + 0.05D, enta.w, 0.0D, 0.0D, 0.0D);
/* 51 */         enta.d = 600;
/* 52 */         enti.w();
/*    */       }
/*    */     }
/* 55 */     return true;
/*    */   }
/*    */ }


/* Location:           C:\Users\N\SkyDrive\Documents\Repos\EasyBreeding\
 * Qualified Name:     easybreeding.common.EntityAIEatDroppedFood
 * JD-Core Version:    0.7.0.1
 */