package ru.kpfu.itis.j903.semestrovka.segmentlist;


import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

public class Main {

    public static void main(String[] args) throws IOException {
        SegmentTestsGenerator generator = new SegmentTestsGenerator(50);
        SegmentList list = new SegmentList("output.txt");
        list.show();
    }
}
