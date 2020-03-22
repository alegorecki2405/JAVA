public class SharedDigit {
    public static boolean hasSharedDigit(int a,int b){
        if(a<10 || b<10 || a>99 || b>99)
        {
            return false;
        }
        int x = a%10;
        int z = (a/10)%10;
        int y = b%10;
        int w = (b/10)%10;

        if (x==y || x==w || y==z || z==w){
            return true;
        }
        else{
            return false;
        }

    }
}

