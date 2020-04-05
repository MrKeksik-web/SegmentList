package ru.kpfu.itis.j903.semestrovka.segmentlist;

public class MethodTester {
    public String dataPath = "output.txt";
    public String angleDataPath = "outputAngle.txt";
    public String lengthDataPath = "outputLength.txt";

    public long constructorTime() {
        long t1 = System.nanoTime();
        new SegmentList(dataPath);
        long t2 = System.nanoTime();
        return t2 - t1;
    }

    public long showTime() {
        SegmentList list = new SegmentList(dataPath);
        long t1 = System.nanoTime();
        list.show();
        long t2 = System.nanoTime();
        return t2 - t1;
    }

    public long insertTime() {
        Segment segment = new Segment((int) (Math.random() * 2000 - 1000), (int) (Math.random() * 2000 - 1000), (int) (Math.random() * 2000 - 1000), (int) (Math.random() * 2000 - 1000));
        SegmentList list = new SegmentList(dataPath);
        long t1 = System.nanoTime();
        list.insert(segment);
        long t2 = System.nanoTime();
        return t2 - t1;
    }

    public long angleTime() {
        SegmentList list = new SegmentList(angleDataPath);
        long t1 = System.nanoTime();
        list.angleList();
        long t2 = System.nanoTime();
        return t2 - t1;
    }

    public long lengthListTime() {
        int a = 0;
        int b = 100;
        SegmentList list = new SegmentList(lengthDataPath);
        long t1 = System.nanoTime();
        list.lengthList(a, b);
        long t2 = System.nanoTime();
        return t2 - t1;
    }

    public long sortTime() {
        SegmentList list = new SegmentList(dataPath);
        long t1 = System.nanoTime();
        list.sort();
        long t2 = System.nanoTime();
        return t2 - t1;
    }
}
