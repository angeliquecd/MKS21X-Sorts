public class selectionSort{
public static void selectionSort(int [] ary) {
  int shortest=ary[0];//initializes variables with random values
  int old = 4;
  int shortestindex=-5;
  for (int index=0;index<ary.length;index++){//fills in index by index
        shortest = ary[index];//rests these from last loop through
        shortestindex=index;//excludes past values
        old=ary[index];
  for (int i=0;i+index<ary.length;i++){
    if (ary[index+i]<=shortest) {//finds shortest part of ary
    shortest=ary[i+index];//saves what it is
    shortestindex=index+i;}//bookmarks its location
  }
  ary[index]=shortest;//performs a swap:
  ary[shortestindex]=old;
  //System.out.println(printArray(ary));
  }
}
  public static String printArray(int[] ary) {
      String output = "[";
      for(int i=0; i<ary.length-1; i++) {
        output += ary[i] + ", ";
      }
      return output += ary[ary.length-1] + "]";
  }

  public static void main(String[] args) {

      // Google random int generator

      String sorted = "";

      // 8 nums, [0:10]
      int[] test_a = { 3, 4, 7, 1, 6, 2, 8, 6 };
      System.out.println(printArray(test_a));               // [3, 4, 7, 1, 6, 2, 8, 6]

      selectionSort(test_a);

      sorted = printArray(test_a);
      System.out.println(sorted);               // [1, 2, 3, 4, 6, 6, 7, 8]

      if(sorted.equals("[1, 2, 3, 4, 6, 6, 7, 8]")) {
        System.out.println("TEST CASE - PASS");
      } else {
        System.out.println("TEST CASE - FAIL");
      }

      // 12 nums, [0:20]
      int[] test_b = { 17, 1, 19, 2, 18, 20, 1, 18, 11, 13, 5, 17 };
      System.out.println(printArray(test_b));   // [17, 1, 19, 2, 18, 20, 1, 18, 11, 13, 5, 17]

      selectionSort(test_b);

      sorted = printArray(test_b);
      System.out.println(sorted);               // [1, 1, 2, 5, 11, 13, 17, 17, 18, 18, 19, 20]

      if(sorted.equals("[1, 1, 2, 5, 11, 13, 17, 17, 18, 18, 19, 20]")) {
        System.out.println("TEST CASE - PASS");
      } else {
        System.out.println("TEST CASE - FAIL");
      }

      // 20 nums, [0:100]
      int[] test_c = { 14, 32, 19, 66, 61, 96, 33, 48, 30, 100, 65, 37, 15, 85, 1, 35, 9, 57, 50, 52 };
      System.out.println(printArray(test_c));   // [14, 32, 19, 66, 61, 96, 33, 48, 30, 100, 65, 37, 15, 85, 1, 35, 9, 57, 50, 52]

      selectionSort(test_c);

      sorted = printArray(test_c);
      System.out.println(sorted);               // [1, 9, 14, 15, 19, 30, 32, 33, 35, 37, 48, 50, 52, 57, 61, 65, 66, 85, 96, 100]

      if(sorted.equals("[1, 9, 14, 15, 19, 30, 32, 33, 35, 37, 48, 50, 52, 57, 61, 65, 66, 85, 96, 100]")) {
        System.out.println("TEST CASE - PASS");
      } else {
        System.out.println("TEST CASE - FAIL");
      }

      //TEST D
      int[] test_d = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
      System.out.println(printArray(test_d));

      selectionSort(test_d);

      sorted = printArray(test_d);
      System.out.println(sorted);

      if(sorted.equals("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]")) {
        System.out.println("TEST CASE - PASS");
      } else {
        System.out.println("TEST CASE - FAIL");
      }

      //TEST E
      int[] test_e = {0,0,0,0,0};
      System.out.println(printArray(test_e));

      selectionSort(test_e);

      sorted = printArray(test_e);
      System.out.println(sorted);

      if(sorted.equals("[0, 0, 0, 0, 0]")) {
        System.out.println("TEST CASE - PASS");
      } else {
        System.out.println("TEST CASE - FAIL");
      }

      //TEST F
      int[] test_f = {5,4,3,2,1};
      System.out.println(printArray(test_f));

      selectionSort(test_f);

      sorted = printArray(test_f);
      System.out.println(sorted);

      if(sorted.equals("[1, 2, 3, 4, 5]")) {
        System.out.println("TEST CASE - PASS");
      } else {
        System.out.println("TEST CASE - FAIL");
      }
//In class testing
	System.out.println("In class testing: ");
	int[] test_class= {7,5,4,2};
	selectionSort(test_class);
	System.out.println(printArray(test_class));
	int[] test2_class={5,1,12,-5,16,2,12,14};
	selectionSort(test2_class);
	System.out.println(printArray(test2_class));
    }

}
