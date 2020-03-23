package ru.kpfu.itis.j903.semestrovka.segmentlist;

import java.util.Objects;

public class Segment {
    private int firstXCoordinate;
    private int firstYCoordinate;
    private int secondXCoordinate;
    private int secondYCoordinate;

    public Segment(int firstXCoordinate, int firstYCoordinate, int secondXCoordinate, int secondYCoordinate) {
        this.firstXCoordinate = firstXCoordinate;
        this.firstYCoordinate = firstYCoordinate;
        this.secondXCoordinate = secondXCoordinate;
        this.secondYCoordinate = secondYCoordinate;
    }

    public double getLength(){
        return Math.sqrt((secondXCoordinate - firstXCoordinate)*(secondXCoordinate - firstXCoordinate) + (secondYCoordinate - firstYCoordinate)*(secondYCoordinate - firstYCoordinate));
    }

    public int getFirstXCoordinate() {
        return firstXCoordinate;
    }

    public int getFirstYCoordinate() {
        return firstYCoordinate;
    }

    public int getSecondXCoordinate() {
        return secondXCoordinate;
    }

    public int getSecondYCoordinate() {
        return secondYCoordinate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Segment segment = (Segment) o;
        return firstXCoordinate == segment.firstXCoordinate &&
                firstYCoordinate == segment.firstYCoordinate &&
                secondXCoordinate == segment.secondXCoordinate &&
                secondYCoordinate == segment.secondYCoordinate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstXCoordinate, firstYCoordinate, secondXCoordinate, secondYCoordinate);
    }

    @Override
    public String toString() {
        String str = "[(" + firstXCoordinate + "," + firstYCoordinate + ")" + "(" + secondXCoordinate + "," + secondYCoordinate + ")]";
        return str;
    }
}
