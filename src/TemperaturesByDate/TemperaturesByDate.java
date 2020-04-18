package TemperaturesByDate;

import java.io.File;
import java.util.Random;
import java.util.Scanner;

class TemperatureSample {
    int month, day, year;
    double temperature;
}

public class TemperaturesByDate {
    public static void main(String[] args) throws Exception {
//        String site = "https://learnjavathehardway.org";
//        String path = "/txt/avg-daily-temps-with-dates-atx.txt";
//        Scanner inFile = new Scanner((new java.net.URL(site + path)).openStream());
        Scanner inFile = new Scanner(new File("/Users/lda49/Projects/learnJavaTheHardWay/src/TemperaturesByDate/london.txt"));

        TemperatureSample[] tempDB = new TemperatureSample[10000];

        int numRecords, i = 0;

        while (inFile.hasNext() && i < tempDB.length) {
            TemperatureSample e = new TemperatureSample();
            e.month = inFile.nextInt();
            e.day = inFile.nextInt();
            e.year = inFile.nextInt();
            e.temperature = inFile.nextDouble();
            if (e.temperature == -99) {
                continue;
            }
            tempDB[i] = e;
            i++;
        }
        inFile.close();
        numRecords = i;
        System.out.println(numRecords + " daily temperatures loaded.");

        double total = 0, avg;
        int count = 0;
        for (i = 0; i < numRecords; i++) {
            if (tempDB[i].month == 11) {
                total += tempDB[i].temperature;
                count++;
            }
        }
        avg = total / count;
        avg = roundToOneDecimal(avg);
        System.out.print("Average daily temperature over " + count);
        System.out.println(" days in November: " + avg);


        double highestTemp = 0;
        for (i = 0; i < numRecords; i++) {
            if (tempDB[i].month == 2 && tempDB[i].temperature > highestTemp) {
                highestTemp = tempDB[i].temperature;
            }
        }
        System.out.println("Highest temperature in February was " + highestTemp);

        int record = 1 + (int)(Math.random()*count);
        TemperatureSample ts = tempDB[record];
        System.out.println("Details for record " +  record + ": ");
        System.out.println("Temp: " + ts.temperature);
        System.out.println("Day: " + ts.day);
        System.out.println("Month: " + ts.month);
        System.out.println("Year: " + ts.year);

    }

    public static double roundToOneDecimal(double d) {
        return Math.round(d * 10) / 10.0;
    }
}

