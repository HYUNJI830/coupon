package com.couponapi.service;

import com.couponapi.controller.dto.CouponIssueRequestDto;
import com.couponapi.controller.dto.CouponRequestDto;
import com.couponcore.service.CouponIssueService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CouponIssueRequestService {

    private final CouponIssueService couponIssueService;

    private final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());



    public void issueRequest(CouponIssueRequestDto requestDto){
        couponIssueService.issue(requestDto.couponId(),requestDto.userId());
        log.info("쿠폰 발급 완료. couponId: %s, userId: %s".formatted(requestDto.couponId(), requestDto.userId()));
    }

}
