
public class minDist {

    public static void main(String[] args) {
        int[] xr = {10, 9, 8, 10};
        int minDistance = 0;
        int index = 0;
        for (int i = 0; i < xr.length; i++) {
            for (int j=0; j<xr.length;j++){
                int dist = xr[i] - xr[j];
                if (dist < minDistance){
                    minDistance = dist;
                    index = i; 
                }
            }
        }
        System.out.println("Min Distance : " + minDistance);
        System.out.println("Min Distance index: " + index);
    }
}
