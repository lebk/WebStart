package com.lebk.po;

// default package
// Generated Nov 7, 2013 6:36:31 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Ptsize generated by hbm2java
 */
public class Ptsize implements java.io.Serializable
{

  private Integer id;
  private String size;
  private Integer opUserId;
  private Date createTime;

  public Ptsize()
  {
  }

  public Ptsize(String size)
  {
    this.size = size;
  }

  public Ptsize(String size, Integer opUserId, Date createTime)
  {
    this.size = size;
    this.opUserId = opUserId;
    this.createTime = createTime;
  }

  public Integer getId()
  {
    return this.id;
  }

  public void setId(Integer id)
  {
    this.id = id;
  }

  public String getSize()
  {
    return this.size;
  }

  public void setSize(String size)
  {
    this.size = size;
  }

  public Integer getOpUserId()
  {
    return this.opUserId;
  }

  public void setOpUserId(Integer opUserId)
  {
    this.opUserId = opUserId;
  }

  public Date getCreateTime()
  {
    return this.createTime;
  }

  public void setCreateTime(Date createTime)
  {
    this.createTime = createTime;
  }

}