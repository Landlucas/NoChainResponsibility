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
public class Handler {

    public void handle(String fileName) {
        System.out.println("Não foi encontrado handler para processar arquivo: " + fileName);
    }

    protected boolean canHandleFile(String fileName, String format) {
        return (fileName == null) || (fileName.endsWith(format));
    }
}
