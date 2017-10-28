import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.staticFiles;

public class Test {
    public static void main(String[] args) {
        port(9997);
        staticFiles.location("/public");
        get("/hello", (request, response) -> {
            return "Hello World!";
        });
    }
}
