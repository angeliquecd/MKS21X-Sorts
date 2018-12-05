public class selectionSort{
public static void selectionsort(int [] ary) {
  int shortest=ary[0];
  for (int index=0;index<ary.length;index++){
  for (int i=1;index+i<ary.length;i++){
    shortest = ary[index];
    if (ary[index+i]<shortest) shortest=ary[i+index];}
    ary[index]=shortest;
  }
}
}
