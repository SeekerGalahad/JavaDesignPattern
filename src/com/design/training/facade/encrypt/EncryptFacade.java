package com.design.training.facade.encrypt;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-19 15:24 by Wagic 创建
 */
public class EncryptFacade extends AbstractFacade {

    private FileReader reader;

    private CipherMachine cipher;

    private FileWriter fileWriter;

    public EncryptFacade() {
        this.reader = new FileReader();
        this.cipher = new CipherMachine();
        this.fileWriter = new FileWriter();
    }

    @Override
    void fileEncrypt(String fileNameSrc, String fileNameDes) {
        String fileContent = reader.read(fileNameSrc);
        String encryptContent = cipher.encrypt(fileContent);
        fileWriter.write(encryptContent, fileNameDes);
    }
}
