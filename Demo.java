public class Demo { 
    public static void main(String[] args) {
    	for(int i = 1; i <= 5; i++) {
    		for(int j = 5; j >= i; j--) {
    			System.out.print(i);
    		}
    		System.out.println();
    	}
    	System.out.println(arrToString(new int[] {1}));
        System.out.println(arrDeepToString(new int[][] {{1}, {2,3}}));
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
        for(int i = 0; i < arr.length; i++) {
            if(i < arr.length - 1) {
                result += Integer.toString(arr[i]) + ", "; 
            }
            result += Integer.toString(arr[i]);
        }
        result += "}";
        return result; 
    }


}

