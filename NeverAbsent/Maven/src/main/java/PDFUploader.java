import com.google.api.client.http.FileContent;
import com.google.api.services.drive.model.File;

public class PDFUploader {
public static void main(String[] args){
    File fileMetadata = new File();
    fileMetadata.setName("photo.jpg");
    java.io.File filePath = new java.io.File("files/photo.jpg");
    FileContent mediaContent = new FileContent("image/jpeg", filePath);


}
}
