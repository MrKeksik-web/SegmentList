package ru.kpfu.itis.j903.semestrovka.segmentlist;

public class MethodTester {
    public String dataPath = "output.txt";

    public long constructorTime(){
        long t1 = System.currentTimeMillis();
        new SegmentList(dataPath);
        long t2 = System.currentTimeMillis();
        return t2 - t1;
    }

    public long insertTime(){
        Segment segment = new Segment((int) (Math.random() * 2000 - 1000), (int) (Math.random() * 2000 - 1000), (int) (Math.random() * 2000 - 1000), (int) (Math.random() * 2000 - 1000));
        SegmentList list = new SegmentList(dataPath);
        long t1 = System.currentTimeMillis();
        list.insert(segment);
        long t2 = System.currentTimeMillis();
        return t2 - t1;
    }

    public long lengthListTime(){
        int a = (int) (Math.random() * 2000 - 1000);
        int b = (int) (Math.random() * 2000 - 1000);
        if (a > b){
            int t = a;
            a = b;
            b = t;
        }
        SegmentList list = new SegmentList(dataPath);
        long t1 = System.currentTimeMillis();
        list.lengthList(a, b);
        long t2 = System.currentTimeMillis();
        return t2 - t1;
    }
}
