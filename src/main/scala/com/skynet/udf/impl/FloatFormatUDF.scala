package com.skynet.udf.impl

import com.skynet.udf.IUDF
import com.skynet.udf.annons.UDF

@UDF("format_float")
class FloatFormatUDF extends IUDF[Float ,String]{
  /**
    * 函数处理
    * @param value 参数
    * @return 处理结果
    */
  override def execute(value: Float): String = value.formatted("%.3f")
}
