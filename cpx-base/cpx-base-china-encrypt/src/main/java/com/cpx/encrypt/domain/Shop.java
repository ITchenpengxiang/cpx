package com.cpx.encrypt.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * @author:  pengxiang chen
 * @date:  2024/2/5 15:37
 * @description:  
 */

/**
 * 专卖店表
 */
@Data
public class Shop implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
    * 门店编号,主属性
    */
    private String shopNo;

    /**
    * 区县,
    */
    private Integer locId;

    /**
    * 门店地址,
    */
    private String address;

    /**
    * 经营类型,接收表单提交内容
    */
    private String managementType;

    /**
    * 渠道id,关联channel表channel_id
    */
    private Integer channelId;

    /**
    * 门店电话,
    */
    private String mobile;

    /**
    * 销售业务,接收表单提交内容
    */
    private String saleGame;

    /**
    * 专管员,同toto_user表user_id关联
    */
    private Integer userId;

    /**
    * 代销者,
    */
    private Integer saleProxyUserId;

    /**
    * 营业状态,0正常营业，1暂停营业；2已注销 3未启用，
    */
    private Integer shopStatus;

    /**
    * 房屋类型,接收表单提交内容
    */
    private String rentType;

    /**
    * 月租金,
    */
    private BigDecimal houseRent;

    /**
    * 面积,
    */
    private BigDecimal shopArea;

    /**
    * 保证金,接收表单提交内容
    */
    private String deposit;

    /**
    * 电彩佣金比例,
    */
    private BigDecimal dcSaleRate;

    /**
    * 即开佣金比例,
    */
    private BigDecimal jkSaleRate;

    /**
    * 门店级别分类,接收表单提交内容
    */
    private String shopLvl;

    /**
    * 店面形式,接收表单提交内容
    */
    private String houseType;

    /**
    * 区域性质,接收表单提交内容
    */
    private String locType;

    /**
    * 账期状态,0开通；1关闭
    */
    private Integer accountPeriodStatus;

    /**
    * 报名方式,接收表单提交内容
    */
    private String signUpType;

    /**
    * 报名日期,
    */
    private Date signUpDate;

    /**
    * 信息获知渠道,接收表单提交内容
    */
    private String getInfoType;

    /**
    * 是否异常注销,0否；1是
    */
    private Integer ifErrDelete;

    /**
    * 室外门面照片,
    */
    private String shopFrontImg;

    /**
    * 室内照片,
    */
    private String shopInsideImg;

    /**
    * 店内销售台照片,
    */
    private String shopInsideSaleImg;

    /**
    * 代销申请书正面照片,
    */
    private String applicationFrontImg;

    /**
    * 代销申请书反面照片,
    */
    private String applicationImg;

    /**
    * 房屋租赁合同照片,
    */
    private String houseContractImg;

    /**
    * 实名认证照片,
    */
    private String realNameImg;

    /**
    * 打点照片,
    */
    private String shopDotImg;

    /**
    * 财务类型,接收表单提交内容
    */
    private String financeType;

    /**
    * 佣金卡卡号,
    */
    private String commBankNo;

    /**
    * 开户行,
    */
    private String commBankName;

    /**
    * 开户名,
    */
    private String commBankOwner;

    /**
    * 佣金卡照片,
    */
    private String commBankNoImg;

    /**
    * 创建人,
    */
    private Integer createUserId;

    /**
    * 创建时间,
    */
    private Date createTime;

    /**
    * 最后修改人,
    */
    private Integer lastUpdateUser;

    /**
    * 最后修改时间,
    */
    private Date lastUpdateTime;

    /**
    * 备注,
    */
    private String remark;

    /**
    * 竞彩佣金比例,
    */
    private BigDecimal jcSaleRate;

    /**
    * 地图纬度,
    */
    private String mapLat;

    /**
    * 地图经度,
    */
    private String mapLng;

    /**
    * 大地纬度,
    */
    private String gpsLat;

    /**
    * 大地经度,
    */
    private String gpsLng;

    /**
    * 兑奖转出卡号,
    */
    private String paidAmtBankNo;

    /**
    * 兑奖转出卡开户行,
    */
    private String paidAmtBankName;

    /**
    * 兑奖转出卡开户名,
    */
    private String paidAmtBankOwner;

    /**
    * 兑奖转出卡照片,
    */
    private String paidAmtBankNoImg;

    /**
    * 竞彩区照片,
    */
    private String jcqImg;

    /**
    * 门头拆除照片,
    */
    private String doorOffImg;

    /**
    * 实体渠道照片,
    */
    private String stqdImg;

    /**
    * 室内全景,
    */
    private String shopInsideFullImg;

    /**
    * 室外近景,
    */
    private String shopFrontFullImg;

    /**
    * 夜景照片,
    */
    private String nightImg;

    /**
    * 周围环境照片,
    */
    private String roundEnvironmentImg;

    /**
    * 竞彩门店级别,
    */
    private String jcShopLvl;

    /**
    * 配送电话,
    */
    private String deliveryMobile;

    /**
    * 配送地址,
    */
    private String deliveryAddress;

    /**
    * 注销时间,
    */
    private Date logOffTime;

    /**
    * 账期开通日期,
    */
    private Date accountBeginTime;

    /**
    * 账期到期日期,
    */
    private Date accountEndTime;

    /**
    * 账期金额,
    */
    private BigDecimal accountAmt;


}