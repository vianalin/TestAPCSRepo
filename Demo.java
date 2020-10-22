public class Demo { 
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            for(int j = 5; j >= i; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println(arrToString(new int[] {1}));
        System.out.println(arrayDeepToString(new int[][] {{1}, {2,3}}));
    }

    public static String arrToString(int[] arr) {
        String result = "{";
        if(arr.length == 0) return "{}";
        for(int i = 0; i < arr.length - 1; i++) {
            result = result + arr[i] + ", ";
        }
        result = result + arr[arr.length - 1] + "}";
        return result;
    }

    public static String arrayDeepToString(int[][] arr) {
        String result = "{";
        if(arr.length == 0) return result + "}";
        for(int i = 0; i < arr.length - 1; i++) { //length = 2, uses arrToString twice
            result = result + arrToString(arr[i]) + ", ";
        }
        result = result + arrToString(arr[arr.length - 1]) + "}";
        return result;
    }

}


