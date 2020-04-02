package ru.kpfu.itis.j903.semestrovka.segmentlist;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class SegmentTestsGenerator {
    //интервал генерации [-1000, 1000),целочисленные.

    public SegmentTestsGenerator(int count) {
        String path = "output.txt";
        try(DataSegmentOutputStream out = new DataSegmentOutputStream(new FileOutputStream(path))){
            for(int i = 0;i < count;i++){
                Segment segment = new Segment((int)(Math.random()* 2000 - 1000),(int)(Math.random()* 2000 - 1000),(int)(Math.random()*2000 - 1000),(int)(Math.random()*2000 - 1000));
                out.writeSegment(segment);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
