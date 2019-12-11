package com.skynet.udf.impl

import com.skynet.udf.IUDF
import com.skynet.udf.annons.UDF

@UDF("format_id")
class IDFormatUDF extends IUDF[String ,String]{
  /**
    * 函数处理
    * @param value 参数
    * @return 处理结果
    */
  override def execute(value: String): String = value.replaceAll("-" ,"")
}
