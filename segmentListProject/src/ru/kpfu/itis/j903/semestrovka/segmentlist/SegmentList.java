package ru.kpfu.itis.j903.semestrovka.segmentlist;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SegmentList {

    protected List<Segment> segments;


    public SegmentList(String path) {
        try (DataSegmentInputStream in = new DataSegmentInputStream(new FileInputStream(path))) {
            segments = in.readSegmentList();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private SegmentList(List<Segment> list) {
        segments = list;
    }

    public void show() {
        //System.out.println(segments);
    }

    public void insert(Segment segment) {
        if (!segments.contains(segment)) {
            segments.add(segment);
        }
    }

    public SegmentList angleList() {
        double epsilon = 0.000001;
        List<Segment> newList = segments.stream()
                .filter(segment -> {
                    double k = (segment.getSecondYCoordinate() - segment.getFirstYCoordinate()) * 1.0 / (segment.getSecondXCoordinate() - segment.getFirstXCoordinate());
                    if (Math.abs(k - Math.sqrt(3)/3) < epsilon || Math.abs(k - 1) < epsilon) {
                        return true;
                    }
                    return false;
                }).collect(Collectors.toList());
        return new SegmentList(newList);
    }

    public SegmentList lengthList(int a, int b) {
        List<Segment> newList = segments.stream()
                .filter(segment -> segment.getLength() >= a && segment.getLength() <= b).collect(Collectors.toList());
        return new SegmentList(newList);
    }

    public void sort() {
        boolean flag = true;
        for (int i = 0; i < segments.size() && flag; i++) {
            for (int j = 0; j < segments.size(); j++) {
                flag = false;
                if (segments.get(i).getLength() < segments.get(j).getLength()) {
                    Segment seg = segments.get(i);
                    segments.set(i, segments.get(j));
                    segments.set(j, seg);
                    flag = true;
                }
            }
        }
    }
}
