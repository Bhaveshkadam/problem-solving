public class CheckArraySubString {
    public static boolean isSubArray(int[] arr1, int[] arr2) {
        boolean found = false;

        if ((arr1.length >= 0 && arr2.length == 0))
            return true;
//        if ((arr1.length > 0 && arr2.length )

        if ((arr1.length < arr2.length))
            return false;

        for (int i = 0; i < arr2.length; i++) {
            int current = arr2[i];
            found = false;
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] == current) {
                    found = true;
                    break;
                }
            }
            if (!found)
                break;
        }
        System.out.println("before return :");
        return (found || false);
    }
}