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
@ApiModel("订单详情类")
public class OrderDetail implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@ApiModelProperty(value = "主键", required = false, dataType = "int(10)")
	private int id;

	/**
	 * 订单主键
	 */
	@ApiModelProperty(value = "订单主键", required = false, dataType = "int(10)")
	private int orderId;

	/**
	 * 商品主键
	 */
	@ApiModelProperty(value = "商品主键", required = false, dataType = "int(10)")
	private int productId;

	/**
	 * 数量
	 */
	@ApiModelProperty(value = "数量", required = false, dataType = "int(10)")
	private int quantity;

	/**
	 * 消费
	 */
	@ApiModelProperty(value = "消费", required = false, dataType = "double")
	private double cost;

}
