package week03;

/**
 * Purpose:
 * This class serves as a means of calculating execution time within a program and makes use of system.nanotime to
 * achieve accurate results down to the nearest nanosecond.
 *
 * @author:wesolowskitj
 * @version: 1.1
 * <p/>
 * Created on 12/18/2014 at 2:30 PM.
 */
public class Stopwatch {
    float startTime;
    float endTime;
    float exeTime;

    public void start(){
        startTime = System.nanoTime();
    }
    public void stop(){
        endTime = System.nanoTime();
        exeTime = endTime - startTime;
    }
    public void clear(){
        startTime = 0;
        endTime = 0;
        exeTime = 0;
    }
    public float returnTimeMilliseconds(float time){
        return time /1000000;
    }//divides accordingly to output in milli instead of nano

    public void stopWatch(){

    };
}
