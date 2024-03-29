package com.arden.dormaster.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Util { //MD5加密的原理：将位数拓展到n*512+64(如果原来是512的倍数也要加512)

    private static String byteArrayToHexString(byte b[]){
        StringBuffer resultSb=new StringBuffer();//StringBuffer是可变的字符串类型
        for(int i=0;i<b.length;i++){
            resultSb.append(byteToHexString(b[i]));
        }
        return resultSb.toString();
    }

    private static String byteToHexString(byte b){ //将字节b转换为十六进制字符串
        int n=b;
        if(n<0){
            n+=256;
        }
        int d1=n/16;
        int d2=n%16;
        return hexDigits[d1]+hexDigits[d2];
    }

    private static String MD5Encode(String origin,String charsetname){
        String resultString=null;
        try{
            resultString=new String(origin);
            MessageDigest md=MessageDigest.getInstance("MD5");  //获取MD5实例
            if(charsetname==null||"".equals(charsetname)){
                resultString=byteArrayToHexString(md.digest(resultString.getBytes()));
            }
            else{
                resultString=byteArrayToHexString(md.digest(resultString.getBytes(charsetname)));
            }
        } catch (Exception exception) {
        }
        return resultString.toUpperCase();//字符串变大写
    }

    public static String MD5EncodeUtf8(String origin){
        return MD5Encode(origin,"utf-8")
    }

    private static final String hexDigits[]={"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"};

}
