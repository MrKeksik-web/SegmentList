package ru.kpfu.itis.j903.semestrovka.segmentlist;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

public class Main {

    public static void main(String[] args) throws IOException {
        SegmentList list = new SegmentList("input.txt");
        list.show();
//        FileOutputStream out = new FileOutputStream("input.txt");
//        ByteBuffer bb = ByteBuffer.allocate(32);
//        bb.putInt(1);
//        bb.putInt(1);
//        bb.putInt(2);
//        bb.putInt(2);
//        bb.putInt(3);
//        bb.putInt(3);
//        bb.putInt(5);
//        bb.putInt(5);
//        out.write(bb.array());
    }
}
