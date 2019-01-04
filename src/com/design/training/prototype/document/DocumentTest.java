package com.design.training.prototype.document;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-04 14:19 by Wagic 创建
 */
public class DocumentTest {

    public static void main(String[] args) {
        PrototypeManager prototypeManager = PrototypeManager.getPrototypeManager();

        prototypeManager.addDocument("SRS", new SRS());
        prototypeManager.addDocument("FAR", new FAR());


        OfficialDocument far = prototypeManager.getDocument("FAR");
        far.display();

        OfficialDocument far1 = prototypeManager.getDocument("FAR");
        far1.display();

        System.out.println(far1.equals(far));

        OfficialDocument srs = prototypeManager.getDocument("SRS");
        srs.display();

        OfficialDocument srs1 = prototypeManager.getDocument("SRS");
        srs1.display();

        System.out.println(srs1.equals(srs));


    }
}
