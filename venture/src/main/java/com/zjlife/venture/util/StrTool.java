package com.zjlife.venture.util;



import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrTool {
	 /*************************************************************************************
     * ���ַ�ת��ΪGBK�ַ�
     * ����  :   strOriginal:ԭ��
     * ����ֵ��  ��ԭ����ISO8859_1(Unicode)����ת��ΪGBK����
     *************************************************************************************
     */
    public static String unicodeToGBK(String strOriginal)
    {
        if (strOriginal != null)
        {
            try
            {
                if (!isGBKString(strOriginal))
                {
                    return new String(strOriginal.getBytes("ISO8859_1"), "GBK");
                }
                else
                {
                    return strOriginal;
                }

            }
            catch (Exception exception)
            {
                return strOriginal;
            }
        }
        else
        {
            return "";
        }
        
    }
    
    /**
     * �ж��Ƿ���GBK����
     * @param tStr
     * @return
     */
    public static boolean isGBKString(String tStr)
    {
    	Pattern tPattern = Pattern.compile("[\\u4e00-\\u9fa5]");
		Matcher tMatcher = tPattern.matcher(tStr);
		System.out.print("11");
		return tMatcher.find();
		
    }

}
