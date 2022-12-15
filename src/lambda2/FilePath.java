package lambda2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class FilePath {
    public static void main(String[] args) throws IOException {
        Files.lines(Paths.get("/Users/IT/IdeaProjects/batch108/src/lambda2/LambdaTextFile.txt")).forEach(System.out::print);
        Files.lines(Paths.get("/Users/IT/IdeaProjects/batch108/src/lambda2/LambdaTextFile.txt")).forEach(System.out::print);

Files.lines(Paths.get("/Users/IT/IdeaProjects/batch108/src/lambda2/LambdaTextFile.txt")).map(t->t.toUpperCase()).forEach(System.out::print);

boolean exist=Files.lines(Paths.get("/Users/IT/IdeaProjects/batch108/src/lambda2/LambdaTextFile.txt")).anyMatch(t->t.contains("lambda"));

Files.lines(Paths.get("/Users/IT/IdeaProjects/batch108/src/lambda2/LambdaTextFile.txt")).map(t->t.split(" ")).flatMap(Arrays::stream).distinct().forEach(System.out::print);


Files.lines(Paths.get("/Users/IT/IdeaProjects/batch108/src/lambda2/LambdaTextFile.txt")).map(t->t.split(" ")).
        flatMap(Arrays::stream).
        filter(t->t.endsWith("e")).
        forEach(System.out::print);

    }
}
