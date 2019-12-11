package com.skynet.udf.impl;

import com.skynet.udf.IUDF;
import com.skynet.udf.annons.UDF;

@UDF("format_date_compact")
public class DateFormatCompactUDF implements IUDF<String ,String> {
    /**
     * 函数处理
     * @param value 参数
     * @return 处理结果
     */
    public String execute(String value) {
        return value.replaceAll("/|-|:| " ,"");
    }
}
