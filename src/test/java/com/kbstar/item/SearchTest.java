package com.kbstar.item;

import com.kbstar.dto.Item;
import com.kbstar.dto.ItemSearch;
import com.kbstar.service.ItemService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

import static oracle.sql.TIMESTAMPTZ.toDate;

@Slf4j
@SpringBootTest
class SearchTest {

    @Autowired
    ItemService service;
    @Test
    void contextLoads() throws Exception{

        ItemSearch is = new ItemSearch(110,5000,"jpg","반바지", new Date(2022-05-01));
        try {
            service.search(is);
            } catch (Exception e) {
                log.info("시스템 장애입니다.");
                e.printStackTrace();
            }

//            log.info("register error.......");
//            e.printStackTrace();
        }
    }

