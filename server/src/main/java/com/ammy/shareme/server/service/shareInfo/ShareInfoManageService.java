package com.ammy.shareme.server.service.shareInfo;

import com.ammy.shareme.server.dao.JsonObjectEx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface ShareInfoManageService {

    public JsonObjectEx getOwnMomentInfo(Integer user_id);

    public JsonObjectEx getFocusMomentInfo(Integer user_id);

    public JsonObjectEx addMoment();

    public JsonObjectEx deleteMoment();
}
