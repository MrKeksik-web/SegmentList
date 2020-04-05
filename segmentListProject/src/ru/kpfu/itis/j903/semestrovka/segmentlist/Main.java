package ru.kpfu.itis.j903.semestrovka.segmentlist;


import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.*;
import java.nio.ByteBuffer;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        test();
    }

    public static void generate(int count) {
        SegmentTestsGenerator generator = new SegmentTestsGenerator(count);
        AngleListTestGenerator generator1 = new AngleListTestGenerator(count);
        LengthListTestGenerator generator2 = new LengthListTestGenerator(count);
    }

    public static void writeTime(ArrayList arr, String path) {
        try (DataTimeOutputStream out = new DataTimeOutputStream(new FileOutputStream(path))) {
            out.writeTime(arr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void test() {
        MethodTester tester = new MethodTester();
        ArrayList<double[]> arrTimes = new ArrayList<>();
        int testsCount = 200;
        for (int i = 1; i <= testsCount; i++) {
            double[] arrAverages = new double[6];
            generate(i);
            int count = 100;
            for (int j = 0; j < count; j++) {
                arrAverages[0] += tester.constructorTime();
                arrAverages[1] += tester.showTime();
                arrAverages[2] += tester.insertTime();
                arrAverages[3] += tester.angleTime();
                arrAverages[4] += tester.lengthListTime();
                arrAverages[5] += tester.sortTime();
            }
            arrAverages[0] = arrAverages[0] / count;
            arrAverages[1] = arrAverages[1] / count;
            arrAverages[2] = arrAverages[2] / count;
            arrAverages[3] = arrAverages[3] / count;
            arrAverages[4] = arrAverages[4] / count;
            arrAverages[5] = arrAverages[5] / count;
            arrTimes.add(arrAverages);
        }

        ArrayList arrConst = new ArrayList();
        ArrayList arrShow = new ArrayList();
        ArrayList arrIns = new ArrayList();
        ArrayList arrAngle = new ArrayList();
        ArrayList arrLength = new ArrayList();
        ArrayList arrSort = new ArrayList();

        for (int i = 0; i < testsCount; i++) {
            double[] arr2 = arrTimes.get(i);
            arrConst.add(arr2[0]);
            arrShow.add(arr2[1]);
            arrIns.add(arr2[2]);
            arrAngle.add(arr2[3]);
            arrLength.add(arr2[4]);
            arrSort.add(arr2[5]);
        }
        writeTime(arrConst, "constTimes.txt");
        writeTime(arrShow, "showTimes.txt");
        writeTime(arrIns, "insTimes.txt");
        writeTime(arrAngle, "angleTimes.txt");
        writeTime(arrLength, "lengthTimes.txt");
        writeTime(arrSort, "sortTimes.txt");
//        MethodTester tester = new MethodTester();
//        generate();
//        double average1 = 0;
//        double average2 = 0;
//        double average3 = 0;
//        double average4 = 0;
//        double average5 = 0;
//        double average6 = 0;
//        for (int i = 0; i < 1000; i++) {
//            average1 += tester.constructorTime();//1
//            average2 += tester.showTime();//2
//            average3 += tester.insertTime();//3
//            average4 += tester.angleTime();//4
//            average5 += tester.lengthListTime();//5
//            average6 += tester.sortTime();//6
//        }
//        average1 = average1/100.0;
//        average2 = average2/1000.0;
//        average3 = average3/100.0;
//        average4 = average4/100.0;
//        average5 = average5/100.0;
//        average6 = average6/100.0;
//        System.out.println(average1); //1
//        System.out.println(average2);//2
//        System.out.println(average3);//3
//        System.out.println(average4);//4
//        System.out.println(average5);//5
//        System.out.println(average6);//6
    }
}
