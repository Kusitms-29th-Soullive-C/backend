package com.kusitms.soullivec.domain.Strategy.service;

import com.kusitms.soullivec.domain.Strategy.repository.StrategyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
@Transactional
public class StrategyService {

    private final StrategyRepository strategyRepository;


}
