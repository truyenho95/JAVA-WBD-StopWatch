package stop_watch.test;

import stop_watch.model.StopWatch;

import java.util.Arrays;

public class TestStopWatch {
  public static void main(String[] args) {
    int[] numberArray = create100000Numbers();

    StopWatch watch = new StopWatch();

    System.out.println("Start!\nWait a few seconds...");
    watch.start();
    selectSort(numberArray);
    watch.stop();
    long result = watch.getElapsedTime();
    System.out.printf("Thời gian thực thi Selection sort cho 100,000 số là: %d(ms)", result);
  }

  public static int[] create100000Numbers() {
    int[] numberArray = new int[100000];
    for (int i = 0; i<100000; i++) {
      numberArray[i] = (int) (Math.random() * 100);
    }
    return numberArray;
  }

  public static void  selectSort (int [] array) {
    int  position =  0 ;
    for  ( int  i =  0 ; i <array.length; i ++) {
      int  j = i +  1 ;
      position = i;
      int  temp = array [i];
      for  (; j <array.length; j ++) {
        if  (array [j] <temp) {
          temp = array [j];
          position = j;
        }
      }
      array [position] = array [i];
      array [i] = temp;
    }
    System.out.println ("Done!");
  }
}
