package com.eluoen.bm.modular.market.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.eluoen.bm.modular.system.dao.MemberMapper;
import com.eluoen.bm.modular.market.service.IMemberService;
import com.eluoen.bm.modular.system.model.Member;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author eluoen123
 * @since 2018-11-17
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements IMemberService {

}
