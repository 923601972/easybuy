package cn.easybuy.pojo;

import java.io.Serializable;
import lombok.Data;
import lombok.NoArgsConstructor;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
import java.util.Date;

/**
 * @Description 
 * @Author haida.yu
 * @Date 2021-07-20 
 */

@Data
@NoArgsConstructor
@ApiModel("用户地址类")
public class UserAddress implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键id
	 */
	@ApiModelProperty(value = "主键id", required = false, dataType = "int(20)")
	private int id;

	/**
	 * 用户主键
	 */
	@ApiModelProperty(value = "用户主键", required = false, dataType = "int(255)")
	private int userId;

	/**
	 * 地址
	 */
	@ApiModelProperty(value = "地址", required = false, dataType = "varchar(255)")
	private String address;

	/**
	 * 创建时间
	 */
	@ApiModelProperty(value = "创建时间", required = false, dataType = "datetime")
	private Date createTime;

	/**
	 * 是否是默认地址（1:是 0否）
	 */
	@ApiModelProperty(value = "是否是默认地址（1:是 0否）", required = false, dataType = "int(2)")
	private int isDefault;

	/**
	 * 备注
	 */
	@ApiModelProperty(value = "备注", required = false, dataType = "varchar(255)")
	private String remark;

}
