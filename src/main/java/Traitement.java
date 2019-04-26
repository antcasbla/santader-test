import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Traitement
{
    public static void run()
    {
        String inPath = "C:\\Users\\ECASADOBLANCO\\Documents\\santander\\src\\main\\resources\\inFile.txt";
        String outPath = "C:\\Users\\ECASADOBLANCO\\Documents\\santander\\src\\main\\resources\\outFile.txt";

        System.out.println( readLineByLineJava8( inPath, outPath ) );
    }


    private static String readLineByLineJava8(String inPath, String outPath)
    {
        StringBuilder contentBuilder = new StringBuilder();

        try {
            FileWriter fileWriter = new FileWriter(outPath);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            Files
                    .lines( Paths.get(inPath), StandardCharsets.UTF_8)
                    .forEach(printWriter::println);

            printWriter.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return contentBuilder.toString();
    }
}
