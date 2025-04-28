class CatMouse {
    static String catAndMouse(int x, int y, int z) {
        int posA = z-x ; 
        int posB = z-y ; 
        if(posA>posB){
            return "Cat B";
        }else if(posA<posB){
            return "Cat A";
        }else{
            return "Mouse C";
        }
    }
    public static void main(String[] args) {
        System.out.println(catAndMouse(2,5,4));
    }
}
