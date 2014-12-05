package easybreeding.common;

import java.util.List;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import ng;
import on;
import oo;
import qh;
import qi;
import qj;
import qn;
import qo;

public class droppedFoodEventHandler
{
  @ForgeSubscribe
  public void addFoodtoAnimals(LivingEvent.LivingUpdateEvent evt)
  {
    if ((evt.entityLiving.ac < 5) && (!evt.entityLiving.h_()))
    {
      qh mob;
      qh mob;
      if ((evt.entityLiving instanceof qj))
      {
        mob = (qj)evt.entityLiving;
      }
      else
      {
        qh mob;
        if ((evt.entityLiving instanceof qn))
        {
          mob = (qn)evt.entityLiving;
        }
        else
        {
          qh mob;
          if ((evt.entityLiving instanceof qi))
          {
            mob = (qi)evt.entityLiving;
          }
          else
          {
            qh mob;
            if ((evt.entityLiving instanceof qo)) {
              mob = (qo)evt.entityLiving;
            } else {
              mob = null;
            }
          }
        }
      }
      if (mob != null)
      {
        List tasks = mob.bo.a;
        for (int i = 0; i < tasks.size(); i++)
        {
          oo task = (oo)tasks.get(i);
          if ((task.b != 8) && (!(task.a instanceof EntityAIEatDroppedFood))) {
            mob.bo.a(8, new EntityAIEatDroppedFood(mob));
          }
        }
      }
    }
  }
}
