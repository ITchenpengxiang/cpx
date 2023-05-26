package com.cpx.agent.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 代理人基础信息表
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FaAgent implements Serializable {
    /**
    * id
    */
    private String id;

    /**
    * 代理人工号
    */
    private String agentCode;

    /**
    * 姓名
    */
    private String agentName;

    /**
    * 推荐人id
    */
    private String recommendId;

    /**
    * 推荐人代码
    */
    private String recommendCode;

    /**
    * 推荐人姓名
    */
    private String recommendName;

    /**
    * 执业证号
    */
    private String practicingCertificateCode;

    /**
    * 执业证名称
    */
    private String practicingCertificateName;

    /**
    * 导入职业证号码日期
    */
    private Date practicingCertificateDate;

    /**
    * 手机号
    */
    private String phone;

    /**
    * 国籍
    */
    private String nationality;

    /**
    * 国籍名称
    */
    private String nationalityChi;

    /**
    * 性别  1-男  2-女  9-未知
    */
    private String sex;

    /**
    * 出生日期
    */
    private Date birthday;

    /**
    * 婚姻状况 1-未婚,2-已婚,3-离异
    */
    private String maritalState;

    /**
    * 婚姻状况名称
    */
    private String maritalStateChi;

    /**
    * 政治面貌
    */
    private String politicalOutlook;

    private String politicalOutlookChi;

    /**
    * 民族
    */
    private String nation;

    /**
    * 民族名称
    */
    private String nationChi;

    /**
    * 血型
    */
    private String bloodType;

    private String bloodTypeChi;

    /**
    * 籍贯
    */
    private String nativePlace;

    /**
    * 通信地址
    */
    private String registeredResidence;

    /**
    * 详细地址
    */
    private String address;

    /**
    * 邮箱地址
    */
    private String email;

    /**
    * 最高学历
    */
    private String highestEducation;

    private String highestEducationChi;

    /**
    * 近期年收入范围
    */
    private String annualIncomeRange;

    /**
    * 证件类型
    */
    private String identType;

    /**
    * 证件类型名称
    */
    private String identTypeChi;

    /**
    * 证件号码
    */
    private String identNo;

    /**
    * 证件有效期起期
    */
    private Date certStartDate;

    /**
    * 证件有效期止期
    */
    private Date certExpiryDate;

    /**
    * 分公司id
    */
    private String branchId;

    /**
    * 所属分公司编码
    */
    private String branchOfficeCode;

    /**
    * 所属分公司名称
    */
    private String branchOfficeName;

    /**
    * 所属团队编码-财富中心
    */
    private String teamCode;

    /**
    * 所属团队名称
    */
    private String teamName;

    /**
    * 工作地
    */
    private String workplace;

    /**
    * 代理人状态 1-未入职 2-在职 3-离职,4-入职失败
    */
    private String agentState;

    /**
    * 性向测试状态 0-未完成,1-已完成
    */
    private String aptitudeState;

    /**
    * 性向测试结果
    */
    private String aptitudeResule;

    /**
    * 面试状态 1-待面试,2-通过,3-未通过,4-待优秀代理人审核,5-优秀代理人审核未通过
    */
    private String interviewState;

    /**
    * 面试结果
    */
    private String interviewResults;

    /**
    * 签约日期
    */
    private Date updateDate;

    /**
    * 暂存 0-已暂存,1-已提交
    */
    private String temporaryStorage;

    /**
    * 是否有亲属在我司工作 0-无,1-有
    */
    private String relativesStayOurCompany;

    /**
    * 是否有同业经历 0.否;1.是
    */
    private String sameExperienceIndustry;

    /**
    * 是否兼职签约我司 0-是,1-否
    */
    private String signContractConcurrentPost;

    /**
    * 当前工作单位
    */
    private String currentJobStation;

    /**
    * 紧急联系人姓名
    */
    private String urgentName;

    /**
    * 紧急联系人电话
    */
    private String urgentPhone;

    /**
    * 职位类型 1-总监,2-规划师,3-顾问,4-合伙人
    */
    private String positionType;

    /**
    * 职位类型名称
    */
    private String positionTypeChi;

    /**
    * 身份证正面
    */
    private String cardFrontUrl;

    /**
    * 身份证反面
    */
    private String cardReverseUrl;

    /**
    * 证件照(个人一寸照片)
    */
    private String personalpicUrl;

    /**
    * 最高学历照片
    */
    private String educationUrl;

    /**
    * 学信网认证报告
    */
    private String educationCertificationReportUrl;

    /**
    * 收入证明
    */
    private String incomeCertificate;

    /**
    * 删除标记 0-正常；1-删除；
    */
    private String delFlag;

    /**
    * 操作人
    */
    private String operator;

    /**
    * 创建日期
    */
    private Date createDate;

    /**
    * 修改日期
    */
    private Date modifyDate;

    /**
    * 备注
    */
    private String remark;

    /**
    * 获奖情况
    */
    private String awards;

    /**
    * 技能/特长
    */
    private String specialties;

    /**
    * 兴趣爱好
    */
    private String hobbies;

    /**
    * 证件有效期类型 1.短期（有效起止日期必填），2.长期（有效起止日期不填）
    */
    private String certValidityType;

    /**
    * 证件有效期类型名称
    */
    private String certValidityTypeChi;

    /**
    * 个人证件照
    */
    private String personalPicUrl;

    /**
    * 代理人职级
    */
    private String agentGrade;

    /**
    * 职级名称
    */
    private String agentGradeChi;

    /**
    * 合同签署状态
    */
    private String signContractStatus;

    /**
    * 合同签署进度
    */
    private String signContractProcess;

    /**
    * 签约状态 1-成功,2-失败,3-未签约
    */
    private String signingState;

    /**
    * 是否优秀同行业引进人员:0.否;1.是
    */
    private String excellentAgentIntroduced;

    private String addrProvenceCode;

    private String addrProvenceName;

    private String addrCityCode;

    private String addrCityName;

    private String addrCountyCode;

    private String addrCountyName;

    /**
    * 通信地址-省编号
    */
    private String regProvenceCode;

    /**
    * 通信地址-省名称
    */
    private String regProvenceName;

    /**
    * 通信地址-市编号
    */
    private String regCityCode;

    /**
    * 通信地址-市名称
    */
    private String regCityName;

    /**
    * 通信地址-县编号
    */
    private String regCountyCode;

    /**
    * 通信地址-县名称
    */
    private String regCountyName;

    /**
    * 籍贯-省编号
    */
    private String nativeProvenceCode;

    /**
    * 籍贯-省名称
    */
    private String nativeProvenceName;

    /**
    * 籍贯-市编号
    */
    private String nativeCityCode;

    /**
    * 籍贯-市名称
    */
    private String nativeCityName;

    /**
    * 籍贯-县编号
    */
    private String nativeCountyCode;

    /**
    * 籍贯-县名称
    */
    private String nativeCountyName;

    /**
    * 详细信息填写情况:0.未填写;1基本信息填写完成;2.教育工作经历完成;3.亲属及紧急联络人;4.影像资料上传;5.获奖证书;6.面纹采集;7.声明签署
    */
    private String detailComplete;

    /**
    * 用户id
    */
    private String userId;

    /**
    * 合同编号
    */
    private String contractNo;

    private static final long serialVersionUID = 1L;
}