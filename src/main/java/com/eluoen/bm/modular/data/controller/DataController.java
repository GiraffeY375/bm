package com.eluoen.bm.modular.data.controller;

import com.alibaba.fastjson.JSON;
import cn.stylefeng.roses.core.base.controller.BaseController;
import com.eluoen.bm.modular.data.service.IDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/data")
public class DataController extends BaseController {

    private final static Logger log = LoggerFactory.getLogger(DataController.class);

    private String PREFIX = "/data/";

    @Autowired
    private IDataService dataService;

    /**
     * 会员城市分布统计
     * @return
     */
    @RequestMapping(value = "/memberCity")
    public String memberCityData(Model model){
        Integer userId = (Integer) super.getSession().getAttribute("userId");
        List<Map<String,Object>> list = dataService.searchMemberDataByCity(userId);
        List<Map<String,Object>> memberList = dataService.searchMemberLast(userId);
        model.addAttribute("data",JSON.toJSONString(list));
        model.addAttribute("memberList",memberList);

        return PREFIX + "member_city.html";
    }

    /**
     * 会员活跃分布统计
     * @return
     */
    @RequestMapping(value = "/memberActive")
    public String memberActiveData(Model model){
        Integer userId = (Integer) super.getSession().getAttribute("userId");
        List<Map<String,Object>> list = dataService.searchWxPlayDataByCity(userId);
        model.addAttribute("data",JSON.toJSONString(list));

        return PREFIX + "member_active.html";
    }

}
