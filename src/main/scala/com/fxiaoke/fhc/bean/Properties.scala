package com.fxiaoke.fhc.bean

/**
  * Created by jiangxd on 2016/10/10.
  */
object Properties {

  //省份
  val PROVINCE_LIST = Array(110000, 310000, 440000, 500000, 120000, 320000, 330000, 340000, 350000, 620000, 450000, 520000, 460000, 130000, 410000, 230000, 420000, 430000, 220000, 360000, 210000, 150000, 640000, 630000, 370000, 140000, 610000, 510000, 540000, 650000, 530000, 810000, 820000, 710000, 990000)
  val PROVINCE_MAP: Map[Int, String] = Map(110000 -> "北京市", 120000 -> "天津市", 130000 -> "河北省", 140000 -> "山西省", 150000 -> "内蒙古自治区",
    210000 -> "辽宁省", 220000 -> "吉林省", 230000 -> "黑龙江省", 310000 -> "上海市", 320000 -> "江苏省", 330000 -> "浙江省", 340000 -> "安徽省", 350000 -> "福建省",
    360000 -> "江西省", 370000 -> "山东省", 410000 -> "河南省", 420000 -> "湖北省", 430000 -> "湖南省", 440000 -> "广东省", 450000 -> "广西壮族自治区",
    460000 -> "海南省", 500000 -> "重庆市", 510000 -> "四川省", 520000 -> "贵州省", 530000 -> "云南省", 540000 -> "西藏自治区", 610000 -> "陕西省", 620000 -> "甘肃省",
    630000 -> "青海省", 640000 -> "宁夏回族自治区", 650000 -> "新疆维吾尔自治区", 710000 -> "台湾省", 810000 -> "香港特别行政区", 820000 -> "澳门特别行政区",
    990000 -> "国外及其他", -1 -> "未知")

  //运行状态
  val RUN_STATUS_MAP: Map[Int, String] = Map(1 -> "待开通", 2 -> "已开通", 3 -> "已作废", 4 -> "已停用", 5 -> "已删除")

  //自注册的代理商默认值
  val DEFAULT_VENDORID = 3459
  //自注册的创建人ID
  val DEFAULT_CREATEORID = 0
  //企业来源Map
  val SOURCE_MAP: Map[Int, String] = Map(1 -> "线上", 0 -> "线下")

  //企业规模Map
  val COMPANY_SCALE_MAP: Map[Int, String] = Map(1 -> "未知", 2 -> "1-49人", 3 -> "50-99人", 4 -> "100-499人", 5 -> "500-999人", 6 -> "1000-4999人", 7 -> "5000-9999人", 8 -> "10000人以上")

  //拉链表初识化本版号
  val DEFAULT_VERSION = 1
  //拉链表最小最大时间
  val SK_SMALL_DATE = "19990101"
  val SK_BIG_DATE = "29990101"

  val KY = 1
  val FF = 2
  val MF = 3
  val WXF = 4
  val WZ = -1
  val ENTERPRISE_TYPE_MAP: Map[Int, String] = Map(1 -> "开源", 2 -> "付费", 3 -> "免费", 4 -> "未续费", -1 -> "未知")

  //行业类别
  val INDUSTRY_ONE = 1
  //一级行业类别
  val INDUSTRY_TWO = 2
  //二级行业类别
  val INDUSTRY_THREE = 3 //三级行业类别

  //企业所属组
  val ENTERPRISE_GROUP_NORMAL = (1, "正常企业")
  val ENTERPRISE_GROUP_AGENT = (2, "联营/代理商企业")
  val ENTERPRISE_GROUP_FS = (3, "纷享本公司账号")
  val ENTERPRISE_GROUP_BLACK = (4, "纷享测试企业（黑名单）")

  //纷享公司账号
  val FS_ENTERPRISE_ACCOUNT = "fs"
}
