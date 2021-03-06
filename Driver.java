import java.util.Arrays;
public class Driver{

  public static void main(String[]artie){

    int[] randish = new int[Integer.parseInt(artie[0])];
    for(int i = 0 ; i < randish.length; i++){
      randish[i] =(int)(Math.random()*10000);
    }
    int[] zeros= new int[1000000];
    for (int i=0;i<zeros.length;i++){
      zeros[i]=0;
    }

    if(artie[1].equals("selection")){
      Sorts.selectionSort(randish);
    }
    if(artie[1].equals("bubble")){
      Sorts.bubbleSort(randish);
    }
    if (artie[1].equals("insertion")){
      Sorts.insertionSort(randish);
    }
    if(artie[1].equals("test")){
      int[] randish2 = Arrays.copyOf(randish,randish.length);
      int[] randish3 = Arrays.copyOf(randish,randish.length);
      int[] randish4 = Arrays.copyOf(randish, randish.length);
      Sorts.selectionSort(randish);
      Sorts.bubbleSort(randish2);
      Sorts.insertionSort(randish4);
      Arrays.sort(randish3);
      if( Arrays.equals(randish,randish3)){
        System.out.println("Selection Correct!");
      }
      if( Arrays.equals(randish2,randish3)){
        System.out.println("Bubble Correct!");
      }
      if (Arrays.equals(randish4,randish3)){
        System.out.println("Insertion Correct!");
      }
    }
    if (artie[1].equals("zeros")){
      Sorts.bubbleSort(zeros);
    }
  }
}
