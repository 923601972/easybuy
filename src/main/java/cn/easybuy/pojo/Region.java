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
@ApiModel("全国省市区类")
public class Region implements Serializable {

	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "null", required = false, dataType = "int(10)")
	private int id;

	@ApiModelProperty(value = "市、县、区", required = false, dataType = "varchar(50)")
	private String name;

	@ApiModelProperty(value = "身份Id", required = false, dataType = "int(10)")
	private int parentId;

}
