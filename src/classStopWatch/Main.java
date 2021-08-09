package classStopWatch;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.star();
        int[] arr = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arr[i]=(int) Math.round(Math.random()*99+1);
        }
        int temp = 0;
        stopWatch.star();
        System.out.println("Start agument selection sort in:\t" +stopWatch.getStartTime());
        for (int i = 0; i < 100000; i++) {
            for (int j = i; j <100000 ; j++) {
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        stopWatch.stop();
        System.out.println("Total times enforcement the agument sort is:\t"+stopWatch.getElapsedTime());

    }
}
