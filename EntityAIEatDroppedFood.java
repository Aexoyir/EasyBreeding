package easybreeding.common;

import aab;
import aqx;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import om;
import px;
import qh;
import rh;

public class EntityAIEatDroppedFood
  extends om
{
  private qh animal;
  private Random rand = new Random();
  
  public EntityAIEatDroppedFood(qh ent)
  {
    this.animal = ent;
  }
  
  public rh whatFoodIsNear()
  {
    aab world = this.animal.q;
    float searchDistance = 8.0F;
    rh ei = new rh(world);
    List nearbyEntities = world.a(ei.getClass(), this.animal.E.b(searchDistance, searchDistance, searchDistance));
    
    Iterator iterate = nearbyEntities.iterator();
    rh check;
    do
    {
      if (!iterate.hasNext()) {
        return null;
      }
      check = (rh)iterate.next();
    } while (!this.animal.c(check.d()));
    return check;
  }
  
  public boolean a()
  {
    rh closeFood = whatFoodIsNear();
    if ((closeFood != null) && (this.animal.d <= 0) && (!this.animal.h_()) && (this.animal.b() == 0)) {
      execute(this.animal, closeFood);
    }
    return false;
  }
  
  public boolean execute(qh enta, rh enti)
  {
    if (enta.aC().a(enti.u, enti.v, enti.w, 0.25F)) {
      if (enta.d(enti) < 1.0F)
      {
        enta.q.a("heart", enta.u, enta.v + 0.05D, enta.w, 0.0D, 0.0D, 0.0D);
        enta.d = 600;
        enti.w();
      }
    }
    return true;
  }
}
