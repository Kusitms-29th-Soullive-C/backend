package com.kusitms.soullivec.domain.Model.service;

import com.kusitms.soullivec.domain.Model.repository.ModelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@RequiredArgsConstructor
@Service
@Transactional
public class ModelService {

    private final ModelRepository modelRepository;

    //model dto화

    //model 저장
}