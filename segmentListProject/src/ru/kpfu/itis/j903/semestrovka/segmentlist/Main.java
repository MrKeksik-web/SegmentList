package ru.kpfu.itis.j903.semestrovka.segmentlist;


import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

public class Main {

    public static void main(String[] args) throws IOException {
        test();
    }

    public static void generate(){
        SegmentTestsGenerator generator = new SegmentTestsGenerator(50);
        SegmentList list = new SegmentList("output.txt");
        list.show();
    }

    public static void test(){
        MethodTester tester = new MethodTester();
        System.out.println(tester.constructorTime()); //1
        System.out.println(tester.insertTime());//3
        System.out.println(tester.lengthListTime());//5
    }
}
