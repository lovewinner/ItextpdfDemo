/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.SimpleBookmark;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author xxh
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        PdfReader reader = new PdfReader("c:\\test.pdf");
        List list = SimpleBookmark.getBookmark(reader);
        for (Iterator i = list.iterator(); i.hasNext();) {
            showBookmark((Map) i.next());
        }
    }

    private static void showBookmark(Map bookmark) {
        System.out.println(bookmark.get("Title"));
        ArrayList kids = (ArrayList) bookmark.get("Kids");
        if (kids == null) {
            return;
        }
        for (Iterator i = kids.iterator(); i.hasNext();) {
            showBookmark((Map) i.next());
        }
    }
}
