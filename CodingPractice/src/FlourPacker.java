public class FlourPacker {
    public static boolean canPack(int bigCount,int smallCount,int goal)
    {
        if(bigCount<0 || smallCount<0 || goal<0)
        {
            return false;
        }
        else if((bigCount*5)+(smallCount)<goal)
        {
            return false;
        }
        else if(bigCount==0)
        {
            if(goal<=smallCount)
            {
                return true;
            }
            return false;
        }
        else if(goal<=bigCount*5)
        {
            if(goal%5<=smallCount)
            {
                return true;
            }
        }
        else if(goal%(bigCount*5)<=smallCount)
        {
            return true;
        }
        return false;
    }
}
