package com.yjs.cloud.learning.message.biz.privateletter.bean;

import com.yjs.cloud.learning.message.common.response.PageResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 请求参数
 *
 * @author Bill.lai
 * @since 12/22/20
 */
@EqualsAndHashCode(callSuper = true)
@ApiModel
@Data
public class PrivateLetterGetMemberListResponse extends PageResponse {

    @ApiModelProperty(value = "列表")
    private List<PrivateLetterResponse> list;

}
