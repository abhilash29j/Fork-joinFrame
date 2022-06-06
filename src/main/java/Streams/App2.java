package Streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class App2 {
    public static void main(String[] args) throws IOException {
        String path = "/home/abhi//IdeaProjects/Fork-joinFrame/src/main/java/Streams/names";
        Stream<String> namesStream = Files.lines(Paths.get(path));
         namesStream.forEach(System.out::println);
    }
}
