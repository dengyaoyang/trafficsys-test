package com.cecgw.cq.trafficsys.controller;

import com.cecgw.cq.trafficsys.dto.CustomerDto;
import com.cecgw.cq.trafficsys.dto.RecordDto;
import com.cecgw.cq.trafficsys.entity.Record;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author denghualin
 * @version V1.0
 * @since 2019-05-03
 */
@RestController
@RequestMapping("/record")
public class RecordController {

    @RequestMapping("getAllRc")
    public RecordDto getAllRc(CustomerDto customerDto){
        String uId = customerDto.getUId();
        //做业务操作
        RecordDto recordDto = new RecordDto();
        Record record = new Record();
        record.setName(uId);
        record.setAmount(1000.01);
        recordDto.setRecord(record);
        return recordDto;
    }
}
