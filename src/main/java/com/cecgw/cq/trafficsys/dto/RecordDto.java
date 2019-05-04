package com.cecgw.cq.trafficsys.dto;

import com.cecgw.cq.trafficsys.entity.Record;
import lombok.Data;

/**
 * @author denghualin
 * @version V1.0
 * @since 2019-05-03
 */
@Data
public class RecordDto {
    private Record record;
    private String msg;
}
