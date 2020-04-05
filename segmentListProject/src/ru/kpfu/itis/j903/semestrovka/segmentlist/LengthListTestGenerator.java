package ru.kpfu.itis.j903.semestrovka.segmentlist;

import java.io.FileOutputStream;
import java.io.IOException;

public class LengthListTestGenerator {
    public LengthListTestGenerator(int count) {
        String path = "outputLength.txt";
        try (DataSegmentOutputStream out = new DataSegmentOutputStream(new FileOutputStream(path))) {
            for (int i = 0; i < count; i++) {
                Segment segment;
                if (i % 2 == 0) {
                    segment = new Segment(0,0, 20, 20);
                } else {
                    segment = new Segment((int) (Math.random() * 2000 - 1000), (int) (Math.random() * 2000 - 1000), (int) (Math.random() * 2000 - 1000), (int) (Math.random() * 2000 - 1000));
                }
                out.writeSegment(segment);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
