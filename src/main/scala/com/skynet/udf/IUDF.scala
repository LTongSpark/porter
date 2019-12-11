package com.skynet.udf

trait IUDF[P,R] extends Serializable {
  /**
    * 函数处理
    * @param value 参数
    * @return 处理结果
    */
  def execute(value:P):R ;

}
