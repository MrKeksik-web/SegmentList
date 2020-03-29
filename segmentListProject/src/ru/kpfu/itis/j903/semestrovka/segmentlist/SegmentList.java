package ru.kpfu.itis.j903.semestrovka.segmentlist;

import java.util.ArrayList;

public class SegmentList {
    protected ArrayList<Segment> segments;
    private int size;

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

    public SegmentList angleList(){
        segments.stream()
            .filter(segment -> {
                double k = (segment.getSecondYCoordinate() - segment.getFirstYCoordinate())/(segment.getSecondXCoordinate() - segment.getFirstXCoordinate());
                if(Math.sqrt(3)/3 == k || 1 == k){
                    return true;
                }
                return false;
            });
        return this;
    }

    public SegmentList lengthList(int a,int b){
        segments.stream()
                .filter(segment -> segment.getLength() >= a && segment.getLength() <= b);
        return this;
    }

    public void sort(){
        for(int i = 0;i < size;i++){
            for(int j = 0;j < size;j++){
                if(segments.get(i).getLength() < segments.get(j).getLength()){
                    Segment seg = segments.get(i);
                    segments.set(i,segments.get(j));
                    segments.set(j,seg);
                }
            }
        }
    }

}
