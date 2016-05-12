/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author xxh
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        List<String> r = new ArrayList<String>();
        List<String> shu = new ArrayList<String>();
        String s = "[专业=汽机][专业=锅炉][专业=电气][专业=热工][专业=燃料][专业=化学][专业=脱硫][专业=脱销][专业=除灰][专业=除渣][专业=通讯（远动）][专业=土建][专业=交通][专业=特种作业][专业=燃料试验][专业=热力试验][专业=金属试验][专业=化学试验][专业=管理][书目=安全生产法=2.1]";
        String[] sarry = s.split("\\]\\[");
        for (String ss : sarry) {
            r.add(ss.replaceAll("\\[", "").replaceAll("\\]", ""));
        }
        for (String ss : r) {
            if (ss.contains("书目")) {
                String[] temp = ss.split("=");
                for (String temps : temp) {
                    shu.add(temps);
                }
            }
        }
        
        System.err.println(r);
    }
}
