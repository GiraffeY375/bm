package com.eluoen.bm.modular.bbs.service;

import com.baomidou.mybatisplus.service.IService;
import com.eluoen.bm.modular.system.model.BbsSys;
import com.eluoen.bm.modular.system.model.BbsWx;

import java.util.List;

/**
 * <p>
 * 微信用户帖子 服务类
 * </p>
 *
 * @author eluoen123
 * @since 2018-12-12
 */
public interface IBbsWxService extends IService<BbsWx> {

    List<BbsWx> selectList_U(Integer userId, String condition);
}
