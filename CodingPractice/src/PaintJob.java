public class PaintJob {
    public static int getBucketCount(double width,double height,double areaPerBucket,int extraBuckets)
    {
        if(width <=0 || height <=0 || areaPerBucket<=0 || extraBuckets<0)
        {
            return -1;
        }
        else {
            double area = width*height;
            area-=areaPerBucket*extraBuckets;
            if(area==0)
            {
                return 0;
            }
            else{
                double buckets =area/areaPerBucket;
                System.out.println(buckets);
                int wynik=(int) Math.ceil(buckets);
                return wynik;

            }
        }
    }
    public static int getBucketCount(double width,double height,double areaPerBucket)
    {
        if(width <=0 || height <=0 || areaPerBucket<=0)
        {
            return -1;
        }
        else {
            double area = width*height;
            if(area==0)
            {
                return 0;
            }
            else{
                double buckets = area/areaPerBucket;
                int wynik=(int) Math.ceil(buckets);
                return wynik;

            }
        }
    }
    public static int getBucketCount(double area,double areaPerBucket)
    {
        if(area <=0 || areaPerBucket<=0)
        {
            return -1;
        }
        else {

            if(area==0)
            {
                return 0;
            }
            else{
                double buckets = area/areaPerBucket;
                int wynik=(int) Math.ceil(buckets);
                return wynik;

            }
        }
    }
}
