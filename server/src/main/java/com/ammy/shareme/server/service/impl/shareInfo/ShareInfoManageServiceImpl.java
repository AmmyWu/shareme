package com.ammy.shareme.server.service.impl.shareInfo;

import com.ammy.shareme.server.dao.JsonObjectEx;
import com.ammy.shareme.server.dao.mapper.MomentInfoMapper;
import com.ammy.shareme.server.dao.mapper.RelationshipInfoMapper;
import com.ammy.shareme.server.dao.model.MomentInfo;
import com.ammy.shareme.server.dao.model.MomentInfoExample;
import com.ammy.shareme.server.dao.model.MomentInfoExample.Criteria;
import com.ammy.shareme.server.dao.model.RelationshipInfo;
import com.ammy.shareme.server.dao.model.RelationshipInfoExample;
import com.ammy.shareme.server.service.shareInfo.ShareInfoManageService;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class ShareInfoManageServiceImpl implements ShareInfoManageService {

    @Autowired
    MomentInfoMapper momentInfoMapper;

    @Autowired
    RelationshipInfoMapper relationshipInfoMapper;

    @Override
    public JsonObjectEx getOwnMomentInfo(Integer user_id) {
        MomentInfoExample momentInfoExample = new MomentInfoExample();
        Criteria criteria = momentInfoExample.createCriteria();
        criteria.andUserIdEqualTo(user_id);
        momentInfoExample.setOrderByClause("modify_time desc");
        List moment = momentInfoMapper.selectByExample(momentInfoExample);
        JsonObjectEx jsonObjectEx = new JsonObjectEx("success",moment);
        return jsonObjectEx;
    }


    @Override
    public JsonObjectEx getFocusMomentInfo(Integer user_id) {
        RelationshipInfoExample relationshipInfoExample = new RelationshipInfoExample();
        MomentInfoExample momentInfoExample = new MomentInfoExample();
        Criteria criteria = momentInfoExample.createCriteria();
        relationshipInfoExample.createCriteria().andFollowUserIdEqualTo(user_id);
        List<RelationshipInfo> relationList = relationshipInfoMapper.selectByExample(relationshipInfoExample);

        List<Integer> userId  = new ArrayList<>();
        for(RelationshipInfo relation : relationList){
            userId.add(relation.getFocusId());
        }

        criteria.andUserIdIn(userId);
        List momentInfoList = momentInfoMapper.selectByExample(momentInfoExample);
        return new JsonObjectEx("success",momentInfoList);
    }

    @Override
    public JsonObjectEx addMoment() {
        return null;
    }

    @Override
    public JsonObjectEx deleteMoment() {
        return null;
    }
}
