public class Sorts{
  /**Selection sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void selectionSort(int [] ary) {
    if (ary.length>0){
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
  }}
  }
  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] ary){
    if (ary.length>0){//acounts for size zero
    double swaps=10.6;
    int index=-1;
    int oldfirst;
    int oldsecond;
    while (swaps!=0){//ends when no swaps are done
      swaps=0;//restarts each time
      for (int i =0;i<ary.length-1;i++){
        if (ary[i]>ary[i+1]){
          if (swaps==10.6) swaps=1;//adds to swap number
          else swaps++;
          oldfirst=ary[i];//executes the swap
          oldsecond=ary[i+1];
          ary[i]=oldsecond;
          ary[i+1]=oldfirst;
        }
      }
      if (swaps==10.6) swaps=0;//acounts for already ordered thing
    }
  }
  }
public static void insertionSort(int[] ary){
  int current=0;
  boolean shifting= false;
  for (int i=0;i<ary.length;i++){
    shifting=false;
    int stored=0;
    int stored1=0;
    boolean shiftedalready= false;
      current=ary[i];
      System.out.println();
      System.out.println(""+current);
      System.out.println(printArray(ary));
    for (int b =0;b<i+1;b++){
      System.out.println(""+b);
      if (current<ary[b]){
        shifting = true;}
      if (shifting){
        if (!shiftedalready) stored=current;
        stored1=ary[b];
        ary[b]=stored;
        stored=stored1;
        shiftedalready=true;}
          System.out.println("second"+printArray(ary));
    //  System.out.println("third "+printArray(ary));
  }
}
}
  public static String printArray(int[] ary) {
      String output = "[";
      if (ary.length>0){
      for(int i=0; i<ary.length-1; i++) {
        output += ary[i] + ", ";
      }
      return output += ary[ary.length-1] + "]";}
      return output+"]";
  }

  public static void main(String[] args) {
    System.out.println("Testing selectionSort: ");
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
  //In class testing selectionSort
  System.out.println("In class testing: ");
  int[] test_class= {7,5,4,2};
  selectionSort(test_class);
  System.out.println(printArray(test_class));
  int[] test2_class={5,1,12,-5,16,2,12,14};
  selectionSort(test2_class);
  System.out.println(printArray(test2_class));
  int [] test_emptya={};
  selectionSort(test_emptya);
  System.out.println(printArray(test_emptya));
  int [] ordereda = {1,2,3,4,5,6,7,10,15};
selectionSort(ordereda);
System.out.println(printArray(ordereda));

  System.out.println();
  System.out.println("Testing bubbleSort: ");
  int[] test_abubble = { 3, 4, 7, 1, 6, 2, 8, 6 };
  bubbleSort(test_abubble);
  System.out.println(printArray(test_abubble));
  int[] test_bbubble={};
  bubbleSort(test_bbubble);
  System.out.println(printArray(test_bbubble));
  int[] test_dbubble = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
  bubbleSort(test_dbubble);
  System.out.println(printArray(test_dbubble));
  int[] test_cbubble = { 17, 1, 19, 2, 18, 20, 1, 18, 11, 13, 5, 17 };
  bubbleSort(test_cbubble);
  System.out.println(printArray(test_cbubble));
  bubbleSort(ordereda);
  System.out.println(printArray(ordereda));
  System.out.println();
  System.out.println("Testing insertion sort: ");
  int[] test_cinsertion = { 17, 1, 19, 2, 18, 20, 1, 18, 11, 13, 5, 17 };
  insertionSort(test_cinsertion);
  System.out.println(printArray(test_cinsertion));
  insertionSort(ordereda);
  System.out.println(printArray(ordereda));
    }

}
