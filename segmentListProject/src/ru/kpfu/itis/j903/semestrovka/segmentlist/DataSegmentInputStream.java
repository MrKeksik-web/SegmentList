package ru.kpfu.itis.j903.semestrovka.segmentlist;

import java.io.*;
import java.nio.ByteBuffer;
import java.util.ArrayList;

public class DataSegmentInputStream extends InputStream{
    private DataInputStream inputStream;

    public DataSegmentInputStream(InputStream inputStream) {
        this.inputStream = new DataInputStream(inputStream);
    }

//    public Segment readSegment() throws IOException {
//        ByteBuffer bb = ByteBuffer.allocate(16);
//        for(int i = 0;i < 16;i++){
//            bb.put((byte) inputStream.read());
//        }
//        bb.rewind();
//        return new Segment(bb.getInt(),bb.getInt(),bb.getInt(),bb.getInt());
//    }

    public ArrayList<Segment> readSegmentList() throws IOException {
        ArrayList<Segment> segments = new ArrayList<>();
        int bytes = inputStream.available();
        ByteBuffer bb = ByteBuffer.allocate(bytes);
        int b;
        while((b = inputStream.read()) != -1){
            bb.put((byte) b);
        }
        bb.rewind();
        for(int i = 0;i < bytes/16;i++) {
            segments.add(new Segment(bb.getInt(),bb.getInt(),bb.getInt(),bb.getInt()));
        }
        return segments;
    }

    @Override
    public int read() throws IOException {
        return inputStream.read();
    }

    public void readFully(byte[] b) throws IOException {
        inputStream.readFully(b);
    }

    public void readFully(byte[] b, int off, int len) throws IOException {
        inputStream.readFully(b, off, len);
    }

    public int skipBytes(int n) throws IOException {
        return inputStream.skipBytes(n);
    }

    public boolean readBoolean() throws IOException {
        return inputStream.readBoolean();
    }

    public byte readByte() throws IOException {
        return inputStream.readByte();
    }

    public int readUnsignedByte() throws IOException {
        return inputStream.readUnsignedByte();
    }

    public short readShort() throws IOException {
        return inputStream.readShort();
    }

    public int readUnsignedShort() throws IOException {
        return inputStream.readUnsignedShort();
    }

    public char readChar() throws IOException {
        return inputStream.readChar();
    }

    public int readInt() throws IOException {
        return inputStream.readInt();
    }

    public long readLong() throws IOException {
        return inputStream.readLong();
    }

    public float readFloat() throws IOException {
        return inputStream.readFloat();
    }

    public double readDouble() throws IOException {
        return inputStream.readDouble();
    }

    @Deprecated
    public String readLine() throws IOException {
        return inputStream.readLine();
    }

    public String readUTF() throws IOException {
        return inputStream.readUTF();
    }

    public static String readUTF(DataInput in) throws IOException {
        return DataInputStream.readUTF(in);
    }
}
