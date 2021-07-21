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
@ApiModel("用户订单类")
public class Order implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@ApiModelProperty(value = "主键", required = false, dataType = "int(11)")
	private int id;

	/**
	 * 用户主键
	 */
	@ApiModelProperty(value = "用户主键", required = false, dataType = "int(255)")
	private int userId;


	@ApiModelProperty(value = "null", required = false, dataType = "varchar(255)")
	private String loginName;

	/**
	 * 用户地址
	 */
	@ApiModelProperty(value = "用户地址", required = false, dataType = "varchar(255)")
	private String userAddress;

	/**
	 * 创建时间
	 */
	@ApiModelProperty(value = "创建时间", required = false, dataType = "datetime")
	private Date createTime;

	/**
	 * 总消费
	 */
	@ApiModelProperty(value = "总消费", required = false, dataType = "double")
	private double cost;

	/**
	 * 订单号
	 */
	@ApiModelProperty(value = "订单号", required = false, dataType = "varchar(255)")
	private String serialNumber;

}
