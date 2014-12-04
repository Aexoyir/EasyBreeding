/*    */ package easybreeding.common;
/*    */ 
/*    */ import java.util.List;
/*    */ import net.minecraftforge.event.ForgeSubscribe;
/*    */ import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
/*    */ import ng;
/*    */ import on;
/*    */ import oo;
/*    */ import qh;
/*    */ import qi;
/*    */ import qj;
/*    */ import qn;
/*    */ import qo;
/*    */ 
/*    */ public class droppedFoodEventHandler
/*    */ {
/*    */   @ForgeSubscribe
/*    */   public void addFoodtoAnimals(LivingEvent.LivingUpdateEvent evt)
/*    */   {
/* 21 */     if ((evt.entityLiving.ac < 5) && (!evt.entityLiving.h_()))
/*    */     {
/*    */       qh mob;
/*    */       qh mob;
/* 25 */       if ((evt.entityLiving instanceof qj))
/*    */       {
/* 27 */         mob = (qj)evt.entityLiving;
/*    */       }
/*    */       else
/*    */       {
/*    */         qh mob;
/* 32 */         if ((evt.entityLiving instanceof qn))
/*    */         {
/* 34 */           mob = (qn)evt.entityLiving;
/*    */         }
/*    */         else
/*    */         {
/*    */           qh mob;
/* 39 */           if ((evt.entityLiving instanceof qi))
/*    */           {
/* 41 */             mob = (qi)evt.entityLiving;
/*    */           }
/*    */           else
/*    */           {
/*    */             qh mob;
/* 46 */             if ((evt.entityLiving instanceof qo)) {
/* 48 */               mob = (qo)evt.entityLiving;
/*    */             } else {
/* 52 */               mob = null;
/*    */             }
/*    */           }
/*    */         }
/*    */       }
/* 57 */       if (mob != null)
/*    */       {
/* 59 */         List tasks = mob.bo.a;
/* 61 */         for (int i = 0; i < tasks.size(); i++)
/*    */         {
/* 62 */           oo task = (oo)tasks.get(i);
/* 63 */           if ((task.b != 8) && (!(task.a instanceof EntityAIEatDroppedFood))) {
/* 65 */             mob.bo.a(8, new EntityAIEatDroppedFood(mob));
/*    */           }
/*    */         }
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:           C:\Users\N\SkyDrive\Documents\Repos\EasyBreeding\
 * Qualified Name:     easybreeding.common.droppedFoodEventHandler
 * JD-Core Version:    0.7.0.1
 */