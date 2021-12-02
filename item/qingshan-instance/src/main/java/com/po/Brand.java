package com.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.core.po.BaseEntity;
import lombok.Data;

/**
 * @author 程啸轩
 * @date 2021/12/1 9:39 上午
 */

@Data
@TableName("brand_")
public class Brand extends BaseEntity {

    @TableField("name_")
    private String name; // 名称

    @TableField("image_") private String image; // 图片

    @TableField("letter_") private String letter; //首字母

    @TableField(exist = false)
    private Long[] categoryIds; //瞬时属性，品牌的所属分类如[1,2,3,4]
}
