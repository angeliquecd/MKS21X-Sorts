public class Sorts{
  /**Selection sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
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
  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] ary){
    int swaps=-10;
    while (swaps>0)
  }
}
