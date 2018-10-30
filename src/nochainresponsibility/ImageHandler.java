/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nochainresponsibility;

/**
 *
 * @author land
 */
public class ImageHandler extends Handler {

    @Override
    public void handle(String fileName) {
        if (canHandleFile(fileName, ".jpg")) {
            System.out.println("Um handler de imagem está processando arquivo: " + fileName);
        } else {
            super.handle(fileName);
        }

    }

}
