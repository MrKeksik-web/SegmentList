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
        double average4 = 0;
        double average5 = 0;
        double average6 = 0;
        for (int i = 0; i < 100; i++) {
            average1 += tester.constructorTime();//1
            average2 += tester.showTime();//2
            average3 += tester.insertTime();//3
            average4 += tester.angleTime();//4
            average5 += tester.lengthListTime();//5
            average6 += tester.sortTime();//6
        }
        average1 = average1/100.0;
        average2 = average2/100.0;
        average3 = average3/100.0;
        average4 = average4/100.0;
        average5 = average5/100.0;
        average6 = average6/100.0;
        System.out.println(average1); //1
        System.out.println(average2);//2
        System.out.println(average3);//3
        System.out.println(average4);//4
        System.out.println(average5);//5
        System.out.println(average6);//6
    }
}
