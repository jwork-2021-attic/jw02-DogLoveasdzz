package S191220100;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Scene {
    public static void main(String[] args) throws IOException {
        String log = "";

        LineLike line = new Line(64);
        LineLike matrix = new Matrix(64);

        Sorter quickSorter = new QuickSorter();
        Sorter mergeSorter = new SelectSorter();

        Snake theSnake = Snake.getSnakeObject();

        //task 2
        theSnake.setSorter(quickSorter);
        line.setRandList();
        log = theSnake.lineUP(line);
        BufferedWriter writer;
        writer = new BufferedWriter(new FileWriter("S191220100/result/task2_quickSort.txt"));
        writer.write(log);
        writer.flush();
        writer.close();
        
        theSnake.setSorter(mergeSorter);
        line.setRandList();
        log = theSnake.lineUP(line);
        writer = new BufferedWriter(new FileWriter("S191220100/result/task2_selectSort.txt"));
        writer.write(log);
        writer.flush();
        writer.close();
        
        //task 3
        theSnake.setSorter(quickSorter);
        matrix.setRandList();
        log = theSnake.lineUP(matrix);
        writer = new BufferedWriter(new FileWriter("S191220100/result/task3_quickSort.txt"));
        writer.write(log);
        writer.flush();
        writer.close();
        
        theSnake.setSorter(mergeSorter);
        matrix.setRandList();
        log = theSnake.lineUP(matrix);
        writer = new BufferedWriter(new FileWriter("S191220100/result/task3_selectSort.txt"));
        writer.write(log);
        writer.flush();
        writer.close();
        
    }
}