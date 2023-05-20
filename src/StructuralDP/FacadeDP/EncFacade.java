package StructuralDP.FacadeDP;

public class EncFacade {

     private AESEnc aesEnc = new AESEnc();
     private MD5Enc md5Enc = new MD5Enc();
     private SHAEnc shaEnc = new SHAEnc();

     public void encrypt(String text, EncType encType ){
         switch (encType){
             case AES : aesEnc.encrypt(text); break;
             case MD5 : md5Enc.encrypt(text,"KEY"); break;
             case SHA : shaEnc.encrypt(text,"KEY",true);
             default: throw new IllegalArgumentException(encType.toString());
         }

     }

     public enum EncType{
         SHA,
         MD5,
         AES
     }


}
