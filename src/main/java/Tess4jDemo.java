import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

public class Tess4jDemo {
    private static Tesseract getTesseract() {
        Tesseract instance = new Tesseract();
        instance.setDatapath("/home/charangan/Desktop/");
        instance.setLanguage("eng");
        instance.setHocr(true);
        return instance;
    }

    public static void main(String[] args) throws TesseractException {
        Tesseract tesseract = getTesseract();
        File file = new File("/home/charangan/Desktop/bookme.jpg");
        String result = tesseract.doOCR(file);
        System.out.println(result);
    }
}