/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nochainresponsibility;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author land
 */
public class NoChainResponsibility {

    /**
     * @param args
     */
    public static void main(String[] args) {

        List<String> fileList = addFiles();

        Handler handler = new Handler();
        Handler xmlHandler = new XmlHandler();
        Handler imageHandler = new ImageHandler();
        Handler textHandler = new TextHandler();

        for (String fileName : fileList) {
            if (fileName.endsWith(".txt")) {
                textHandler.handle(fileName);
            } else if (fileName.endsWith(".jpg")) {
                imageHandler.handle(fileName);
            } else if (fileName.endsWith(".xml")) {
                xmlHandler.handle(fileName);
            } else {
                handler.handle(fileName);
            }
        }

    }

    private static List<String> addFiles() {

        List<String> fileList = new ArrayList<>();
        fileList.add("arquivo.txt");
        fileList.add("arquivo.xml");
        fileList.add("arquivo.jpg");
        fileList.add("arquivo.docx");

        return fileList;
    }

}
