package com.eluoen.bm.modular.system.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.eluoen.bm.modular.system.model.BbsWx;
import com.eluoen.bm.modular.system.model.Gift;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 微信用户帖子 Mapper 接口
 * </p>
 *
 * @author eluoen123
 * @since 2018-12-12
 */
public interface BbsWxMapper extends BaseMapper<BbsWx> {

    List<BbsWx> selectList_U(@Param("userId") Integer userId, @Param("condition") String condition);
}
