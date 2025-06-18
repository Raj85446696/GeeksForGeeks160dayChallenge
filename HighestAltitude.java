class HighestAltitude{
    public static int highestAltitude(int[] gain){
        int altitude = 0 ; 
        int maxaltitude = 0 ; 
        for(int i = 0 ; i<gain.length ; i++){
            altitude+=gain[i];
            maxaltitude = Math.max(maxaltitude,altitude);
        }
        if(maxaltitude<0){
            return 0 ; 
        }else{
            return maxaltitude;
        }

    }
    public static void main(String[] args) {
        int[] gains = {-5,1,5,0,-7};
        System.out.println(highestAltitude(gains));
    }
}