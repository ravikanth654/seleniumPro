package framework.util.globalConstants;

import java.io.File;


public class FilePath {
    public final static String basePath = new File("").getAbsolutePath();

    public final static String FILE_DOWNLOAD_PATH = basePath + "\\downloads\\";
    public final static String TEST_DATA_PATH = basePath + "/src/test/resources/TestData/";
    public final static String FILE_CONFIG_INPUT = basePath + "/src/test/resources/AppData/ConfigInput.xlsx";
}
