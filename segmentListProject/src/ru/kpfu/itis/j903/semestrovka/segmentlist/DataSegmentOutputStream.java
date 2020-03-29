package ru.kpfu.itis.j903.semestrovka.segmentlist;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class DataSegmentOutputStream extends OutputStream {
    protected DataOutputStream out;
    protected final int BYTES_PER_SEGMENT;


    public DataSegmentOutputStream(OutputStream out) {
        this.out = new DataOutputStream(out);
        BYTES_PER_SEGMENT = 16;
    }

    public void writeSegment(Segment segment) throws IOException {
        writeCoord(segment.getFirstXCoordinate());
        writeCoord(segment.getFirstYCoordinate());
        writeCoord(segment.getSecondXCoordinate());
        writeCoord(segment.getSecondYCoordinate());
    }

    public void writeCoord(int x) throws IOException {
        out.writeInt(x);
    }

    @Override
    public void write(int b) throws IOException {
        out.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        out.write(b, off, len);
    }

    @Override
    public void flush() throws IOException {
        out.flush();
    }

    public void writeBoolean(boolean v) throws IOException {
        out.writeBoolean(v);
    }

    public void writeByte(int v) throws IOException {
        out.writeByte(v);
    }

    public void writeShort(int v) throws IOException {
        out.writeShort(v);
    }

    public void writeChar(int v) throws IOException {
        out.writeChar(v);
    }

    public void writeInt(int v) throws IOException {
        out.writeInt(v);
    }

    public void writeLong(long v) throws IOException {
        out.writeLong(v);
    }

    public void writeFloat(float v) throws IOException {
        out.writeFloat(v);
    }

    public void writeDouble(double v) throws IOException {
        out.writeDouble(v);
    }

    public void writeBytes(String s) throws IOException {
        out.writeBytes(s);
    }

    public void writeChars(String s) throws IOException {
        out.writeChars(s);
    }

    public void writeUTF(String str) throws IOException {
        out.writeUTF(str);
    }

    public int size() {
        return out.size();
    }
}
