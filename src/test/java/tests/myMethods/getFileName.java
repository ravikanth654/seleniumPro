package tests.myMethods;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class getFileName
{
    public static String recentFile(String downloadPath)
    {
        String filename;
        File dir = new File(downloadPath);
        File[] dirContents = dir.listFiles();
        Arrays.sort(dirContents, Comparator.comparingLong(File::lastModified).reversed());
        filename=dirContents[0].getName();
        System.out.println(filename);

        return filename;

    }


    /*public static void main(String[] args)
    {
        getFileName.recentFile("C:\\Users\\25004035\\Documents");
    }*/
}