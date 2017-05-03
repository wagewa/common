package com.sunkun.common.utils;

import java.io.Serializable;
import java.util.List;

/**
 * 列表查询返回对象
 * @ClassName: pageInfo 
 * @Description: TODO
 * @author sunkun
 * @date 2017年5月3日 下午10:40:55 
 * @version version 1.0
 */
public class pageInfo implements Serializable
{
    /** 
     * @Fields serialVersionUID : TODO
     */
    private static final long serialVersionUID = -8835353249019108938L;
    
    private Integer status;
    
    private Integer total;
    
    private String msg;
    
    private List<Object> list;
    
    public Integer getStatus()
    {
        return status;
    }
    
    public void setStatus(Integer status)
    {
        this.status = status;
    }
    
    public Integer getTotal()
    {
        return total;
    }
    
    public void setTotal(Integer total)
    {
        this.total = total;
    }
    
    public String getMsg()
    {
        return msg;
    }
    
    public void setMsg(String msg)
    {
        this.msg = msg;
    }
    
    public List<Object> getList()
    {
        return list;
    }
    
    public void setList(List<Object> list)
    {
        this.list = list;
    }
    
}
