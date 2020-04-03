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

    public static void generate() {
        SegmentTestsGenerator generator = new SegmentTestsGenerator(50);
        SegmentList list = new SegmentList("output.txt");
        list.show();
    }

    public static void test() {
        MethodTester tester = new MethodTester();
        double average1 = 0;
        double average2 = 0;
        double average3 = 0;
        for (int i = 0; i < 100; i++) {
            average1 += tester.constructorTime();//1
            average2 += tester.insertTime();//3
            average3 += tester.lengthListTime();//5
        }
        average1 = average1/100.0;
        average2 = average2/100.0;
        average3 = average3/100.0;
        System.out.println(average1); //1
        System.out.println(average2);//3
        System.out.println(average3);//5
    }
}
