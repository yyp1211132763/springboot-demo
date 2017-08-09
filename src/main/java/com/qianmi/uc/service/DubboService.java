package com.qianmi.uc.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qianmi.base.response.CentreResponse;
import com.qianmi.uc.qstore.api.store.StoreProvider;
import com.qianmi.uc.qstore.api.store.StoreQueryProvider;
import com.qianmi.uc.qstore.api.store.request.StoreGetByIdRequest;
import com.qianmi.uc.qstore.api.store.request.StoreSetNameRequest;
import com.qianmi.uc.qstore.api.store.response.bean.StoreVO;
import com.qianmi.usercenter.api.provider.common.QueryProvider;
import org.springframework.stereotype.Service;

/**
 * description
 * <p>
 * <p>FileName: com.qianmi.uc.service.DubboService</p>
 * <p>Date: 2017-08-07 10:38.</p>
 *
 * @author <a href="mailto:lilonglong@qianmi.com">of2639-李龙龙</a>
 */
@Service
public class DubboService {

    @Reference(version = "1.0.0", timeout = 15000)
    private StoreProvider storeProvider;

    @Reference(version = "1.0.0", timeout = 15000)
    private StoreQueryProvider storeQueryProvider;

    @Reference(version = "1.0", timeout = 15000)
    private QueryProvider queryProvider;

    public String hello() throws Exception {
        StoreGetByIdRequest request = new StoreGetByIdRequest();
        request.setAdminId("A893119");
        CentreResponse<StoreVO> storeVO = storeQueryProvider.getById(request);
        System.out.println(storeVO.getData().getAddTime());
        return "";
    }

    public String getUserAdminId() throws Exception {
        String parentId = queryProvider.getUserAdminId("A855735");
        return "";
    }

    public String setName(String adminId, String storeName) throws Exception {
        StoreSetNameRequest request = new StoreSetNameRequest();
        request.setAdminId(adminId);
        request.setStoreName(storeName);
        storeProvider.setName(request);
        return "";
    }
}
