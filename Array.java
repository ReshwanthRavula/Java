public class Array {
    public static void main(String[] args) {
        // int nums[] = {3,4,5,6,7};
        // System.out.println(nums[3]);
        // for (int i = 0; i < nums.length; i++) {
        //     nums[i] = i; 
        // }
        
        // for (int i = 0; i < nums.length; i++) {
        //     System.out.println(nums[i]);            
        // }
        int nums[][] = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {

                nums[i][j] = (int)(Math.random() * 10);
                
            }
            
        }    
        
        // int random1 = (int)Math.random() * 100;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {

                System.out.print(nums[i][j] + " ");
                
            }
            System.out.println();
        }  
        
        for(int n[] : nums)
        {
            for(int m: n)
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
    
}
