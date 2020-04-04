package ru.kpfu.itis.j903.semestrovka.segmentlist;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

public class DataTimeOutputStream extends OutputStream {
    private DataOutputStream out;

    public DataTimeOutputStream(OutputStream out) {
        this.out = new DataOutputStream(out);
    }

    public void writeTime(ArrayList arr) throws IOException {
        out.writeChars(String.valueOf("N\t"));
        out.writeChars(String.valueOf("Time\n"));
        for (int i = 0; i < arr.size(); i++) {
            out.writeChars(String.valueOf((i + 1) + "\t"));
            out.writeChars(String.valueOf(arr.get(i) + "\n"));
        }
    }

    @Override
    public void write(int b) throws IOException {
        out.write(b);
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
