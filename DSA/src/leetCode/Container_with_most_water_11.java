package leetCode;

public class Container_with_most_water_11 {
    public static void main(String[] args) {
        int height[]={2,3,4,5,18,17,6};
       int max=0;
       int fP=0;
       int sP=height.length-1;
       while(fP<sP){
           int l=height[fP]<height[sP]?height[fP]:height[sP];
           max=Math.max(l*(sP-fP),max);
           if(height[fP]<height[sP]){
               fP++;
           }else{
               sP--;
           }
       }
        System.out.println(max);
    }
}
