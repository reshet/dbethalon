package com.mresearch.server.services;

import com.mresearch.server.business.Archiver;
import com.mresearch.shared.services.DatabankServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: reshet
 * Date: 3/17/14
 * Time: 9:51 AM
 * To change this template use File | Settings | File Templates.
 */
@Service("databankService")
public class DatabankServicesImpl implements DatabankServices{

  @Autowired
  Archiver archiver;

  public String getServiceName() {
    return archiver.getServiceName();
  }
}
