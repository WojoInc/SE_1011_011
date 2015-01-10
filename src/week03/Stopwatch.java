package week03;

/**
 * Purpose:
 *
 * @author:Owner
 * @version: 1.1
 * <p/>
 * Created by Owner on 12/18/2014 at 2:30 PM.
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
    }

    public void stopWatch(){

    };
}
