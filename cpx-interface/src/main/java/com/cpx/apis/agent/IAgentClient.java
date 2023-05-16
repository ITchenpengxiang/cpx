package com.cpx.apis.agent;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "agent-service")
public interface IAgentClient {

}
