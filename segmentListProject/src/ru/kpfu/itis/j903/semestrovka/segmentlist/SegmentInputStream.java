package ru.kpfu.itis.j903.semestrovka.segmentlist;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

public class SegmentInputStream{
    private DataInputStream inputStream;

    public ArrayList<Segment> readSegmentList(String path){
        ArrayList<Segment> segments = new ArrayList<>();
        try(DataInputStream in = new DataInputStream(new FileInputStream(path))) {
            int bytes = in.available();
            ByteBuffer bb = ByteBuffer.allocate(bytes);
            int b;
            while((b = in.read()) != -1){
                bb.put((byte) b);
            }
            bb.rewind();
            for(int i = 0;i < bytes/16;i++) {
                segments.add(new Segment(bb.getInt(),bb.getInt(),bb.getInt(),bb.getInt()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return segments;
    }
}
