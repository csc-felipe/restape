package nl.esciencecenter.restape;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import nl.uu.cs.ape.io.APEFiles;

public class IOUtils {

    /**
     * Get byte array that represents the image from the file system at the given
     * path.
     * 
     * @param filePath - path to the image
     * @return byte array that represents the image
     * @throws IOException - if the image cannot be read
     */
    public static byte[] getImageFromFileSystem(Path filePath) throws IOException {
        File currFile = filePath.toFile();
        BufferedImage image = ImageIO.read(currFile);

        ByteArrayOutputStream byteArray = new ByteArrayOutputStream();
        ImageIO.write(image, "png", byteArray);

        return byteArray.toByteArray();

    }

    /**
     * Get the CWL content of the file at the given path.
     * 
     * @param filePath - path to the CWL file
     * @return CWL content of the file representing a workflow
     * @throws IOException - if the file cannot be read
     */
    public static String getLocalCwlFile(Path filePath) throws IOException {
        return FileUtils.readFileToString(filePath.toFile(), StandardCharsets.UTF_8);
    }

}
