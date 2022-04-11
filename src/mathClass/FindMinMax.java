package mathClass;

public class FindMinMax {
    public static void main(String[] args) {

        int x = 8;
        int y = 20;
        int z = 576;

        // find max from group of values
        int findMaxOfXY = Math.max(x, y); // this class only takes 2 data values
        System.out.println("Max of x,y: " + findMaxOfXY);

        int findMaxOfXYZ = Math.max(findMaxOfXY, z); // work around to data limitation
        System.out.println("Max of x,y,z: " + findMaxOfXYZ);
        System.out.println();

        // find min from group of values
        int findMinOfXY = Math.min(x, y); // this class only takes 2 data values
        System.out.println("Min of x,y: " + findMinOfXY);

        int findMinOfXYZ = Math.min(findMinOfXY, z); // work around to data limitation
        System.out.println("Min of x,y,z: " + findMinOfXYZ);
        System.out.println();
    }
}
