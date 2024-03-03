package com.kusitms.soullivec.domain.Output.service;

import com.kusitms.soullivec.domain.Output.repository.OutputRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
@Transactional
public class OutputService {

    private final OutputRepository outputRepository;

    //output dto화

    //input과 model에 대한 적합도 검사 후 output 반환

}