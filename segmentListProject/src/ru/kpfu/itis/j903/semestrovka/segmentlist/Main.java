package ru.kpfu.itis.j903.semestrovka.segmentlist;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

public class Main {

    public static void main(String[] args) throws IOException {
        DataSegmentOutputStream out = new DataSegmentOutputStream(new FileOutputStream("input.txt"));
        out.writeCoord(10);
        out.writeCoord(10);
        out.writeCoord(150);
        out.writeCoord(150);
        SegmentList list = new SegmentList("input.txt");
        list.show();
        list.lengthList(1,5);
        list.show();
    }
}
