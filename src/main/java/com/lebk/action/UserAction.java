package com.lebk.action;

/**
 * copyright: all right reserved.
 * 
 * Author: Lei Bo
 *
 * 2013-10-9
 *
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.lebk.dto.UserDTO;
import com.lebk.po.User;
import com.lebk.services.UserService;
import com.lebk.services.impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport
{
  private String username;
  private String password;
  private List<UserDTO> userDtoList;

  static final Integer iAdminType = 1;
  static final Integer iRegularType = 2;

  static Logger logger = Logger.getLogger(UserAction.class);
  UserService us = new UserServiceImpl();

  private String addUserName;
  private String addUserPassword;
  private boolean addasAdmin;

  public void setAddUserName(String addUserName)
  {
    this.addUserName = addUserName;
  }

  public String getAddUserName()
  {
    return addUserName;
  }

  public void setAddUserPassword(String addUserPassword)
  {
    this.addUserPassword = addUserPassword;
  }

  public String getAddUserPassword()
  {
    return addUserPassword;
  }

  public void setAddasAdmin(boolean addasAdmin)
  {
    this.addasAdmin = addasAdmin;
  }

  public boolean isAddasAdmin()
  {
    return addasAdmin;
  }

  public String logout()
  {
    Map session = ActionContext.getContext().getSession();
    session.remove("username");
    return SUCCESS;
  }

  public String aboutvmf()
  {
    return SUCCESS;
  }

  public String authUser()
  {
    try
    {
      if (us.authUser(this.username, this.password) == true)
      {
        Map session = ActionContext.getContext().getSession();
        session.put("username", this.username);
        return SUCCESS;
      } else
      {
        logger.info("Login failed");

        addActionError(getText("error.login"));

        return ERROR;
      }
    } catch (Exception e)
    {
      logger.info("Login Exception: " + e);
      return ERROR;
    }
  }

  public String getUsername()
  {
    return username;
  }

  public void setUsername(String username)
  {
    this.username = username;
  }

 
}
