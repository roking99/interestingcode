package com.roking.showstacktrace;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Title: 这段代码是展示当前java虚拟机栈中所有的线程相关信息 可以做一个页面，在查问题的时候 访问该页面即可
 *  不再需要很麻烦的去  jstack </br>
 * <p/>
 * Description: </br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2017/12/4.
 */
public class ShowStacktrace {

    public static void main(String[] args) {
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        Set<Map.Entry<Thread, StackTraceElement[]>> entries = allStackTraces.entrySet();
        Iterator<Map.Entry<Thread, StackTraceElement[]>> iterator = entries.iterator();
        while(iterator.hasNext()){
            Map.Entry<Thread, StackTraceElement[]> next = iterator.next();
            if(next.getKey().equals(Thread.currentThread())){
                continue;
            }
            System.out.println("线程: "+next.getKey().getName());
            for (StackTraceElement stackTraceElement:next.getValue()){
                System.out.println(stackTraceElement);
            }
        }

    }
}
