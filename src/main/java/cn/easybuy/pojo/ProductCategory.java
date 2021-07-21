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
@ApiModel("商品分类")
public class ProductCategory implements Serializable {

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
	 * 父级目录id
	 */
	@ApiModelProperty(value = "父级目录id", required = false, dataType = "int(10)")
	private int parentId;

	/**
	 * 级别(1:一级 2：二级 3：三级)
	 */
	@ApiModelProperty(value = "级别(1:一级 2：二级 3：三级)", required = false, dataType = "int(11)")
	private int type;

	/**
	 * 图标
	 */
	@ApiModelProperty(value = "图标", required = false, dataType = "varchar(255)")
	private String iconClass;

}
