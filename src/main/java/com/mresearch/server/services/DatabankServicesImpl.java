package com.mresearch.server.services;

import com.mresearch.shared.services.DatabankServices;
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
//@Controller
//@RequestMapping("databankService")
public class DatabankServicesImpl implements DatabankServices{
  public String getServiceName() {
    return "Spring name";
  }
}
