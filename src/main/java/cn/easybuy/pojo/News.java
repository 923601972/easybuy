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
@ApiModel("新闻实体类")
public class News implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */

	@ApiModelProperty(value = "主键", required = false, dataType = "int(10)")
	private int id;

	/**
	 * 标题
	 */
	@ApiModelProperty(value = "标题", required = false, dataType = "varchar(40)")
	private String title;

	/**
	 * 内容
	 */
	@ApiModelProperty(value = "内容", required = false, dataType = "varchar(1000)")
	private String content;

	/**
	 * 创建时间
	 */
	@ApiModelProperty(value = "创建时间", required = false, dataType = "varchar(10)")
	private String createTime;

}
