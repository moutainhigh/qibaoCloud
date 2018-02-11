package com.qibao.frontend.feign;

import com.qibao.activity.entity.service.IRoomControl;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("qibao-activity-service")
public interface IRoomFeign extends IRoomControl {


}
