package ru.kpfu.itis.j903.semestrovka.segmentlist;

import java.util.ArrayList;

public class SegmentList {
    protected ArrayList<Segment> segments;

    public SegmentList(String path) {

    }

    public void show(){
        System.out.println(segments);
    }

    public void insert(Segment segment){
        if (!segments.contains(segment)){
            segments.add(segment);
        }
    }

    public void test(){

    }

}
