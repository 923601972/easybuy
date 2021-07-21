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
@ApiModel("商品详情类")
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@ApiModelProperty(value = "主键", required = false, dataType = "int(10)")
	private int id;

	/**
	 * 名称
	 */
	@ApiModelProperty(value = "名称", required = false, dataType = "varchar(20)")
	private String name;

	/**
	 * 描述
	 */
	@ApiModelProperty(value = "描述", required = false, dataType = "varchar(1024)")
	private String description;

	/**
	 * 价格
	 */
	@ApiModelProperty(value = "价格", required = false, dataType = "double")
	private double price;

	/**
	 * 库存
	 */
	@ApiModelProperty(value = "库存", required = false, dataType = "int(10)")
	private int stock;

	/**
	 * 分类1
	 */
	@ApiModelProperty(value = "分类1", required = false, dataType = "int(10)")
	private int categoryLevel1Id;

	/**
	 * 分类2
	 */
	@ApiModelProperty(value = "分类2", required = false, dataType = "int(10)")
	private int categoryLevel2Id;

	/**
	 * 分类3
	 */
	@ApiModelProperty(value = "分类3", required = false, dataType = "int(10)")
	private int categoryLevel3Id;

	/**
	 * 文件名称
	 */
	@ApiModelProperty(value = "文件名称", required = false, dataType = "varchar(200)")
	private String fileName;

	/**
	 * 是否删除(1：删除 0：未删除)
	 */
	@ApiModelProperty(value = "是否删除(1：删除 0：未删除)", required = false, dataType = "int(1)")
	private int isDelete;

}
