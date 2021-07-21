package cn.easybuy.pojo;

import java.io.Serializable;
import lombok.Data;
import lombok.NoArgsConstructor;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/**
 * @Description 
 * @Author haida.yu
 * @Date 2021-07-20 
 */

@Data
@NoArgsConstructor
@ApiModel("用户详情类")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@ApiModelProperty(value = "主键", required = false, dataType = "int(20)")
	private int id;

	/**
	 * 登录名
	 */
	@ApiModelProperty(value = "登录名", required = false, dataType = "varchar(255)")
	private String loginName;

	/**
	 * 用户名
	 */
	@ApiModelProperty(value = "用户名", required = false, dataType = "varchar(255)")
	private String userName;

	/**
	 * 密码
	 */
	@ApiModelProperty(value = "密码", required = false, dataType = "varchar(255)")
	private String password;

	/**
	 * 性别(1:男 0：女)
	 */
	@ApiModelProperty(value = "性别(1:男 0：女)", required = false, dataType = "int(2)")
	private int sex;

	/**
	 * 身份证号
	 */
	@ApiModelProperty(value = "身份证号", required = false, dataType = "varchar(60)")
	private String identityCode;

	/**
	 * 邮箱
	 */
	@ApiModelProperty(value = "邮箱", required = false, dataType = "varchar(80)")
	private String email;

	/**
	 * 手机
	 */
	@ApiModelProperty(value = "手机", required = false, dataType = "varchar(11)")
	private String mobile;

	/**
	 * 类型（1：后台 0:前台）
	 */
	@ApiModelProperty(value = "类型（1：后台 0:前台）", required = false, dataType = "int(2)")
	private int type;

}
