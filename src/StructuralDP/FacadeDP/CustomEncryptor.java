package StructuralDP.FacadeDP;

public class CustomEncryptor{

    public static void main(String[] args) {

        String text = " Content";

        // !!! kotu dizayn ornegi

        AESEnc aesEnc = new AESEnc();
        aesEnc.encrypt(text);

        MD5Enc md5Enc = new MD5Enc();
        md5Enc.encrypt(text, "KEY");

        SHAEnc shaEnc = new SHAEnc();
        shaEnc.encrypt(text, "KEY", true);

        // !!! iyi dizayn ornegi
        System.out.println("********************");
        EncFacade encFacade = new EncFacade();
        encFacade.encrypt(text, EncFacade.EncType.SHA);


    }


}
