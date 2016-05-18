package org.ithinking.banana.ishow.remote;

import com.alibaba.dubbo.config.annotation.Reference;
import org.ithinking.banana.ishow.Application;
import org.ithinking.banana.ishow.Constant;
import org.ithinking.banana.pay.remote.service.AccountRemoteService;
import org.ithinking.banana.pay.remote.vo.AccountVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * ${TITLE}
 *
 * @author agan
 * @date 2016-05-07
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class AccountRemoteServiceTest {

    //@Reference(registry = Constant.DUBBO_PAY_REGISTRY)
    @Autowired
    private AccountRemoteService accountRemoteService;

    @Test
    public void test(){
        AccountVo accountVo = accountRemoteService.getAccount(0L);
        System.out.println(accountVo);
    }

}
