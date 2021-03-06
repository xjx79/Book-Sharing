package com.dyenigma.backend.service;

import com.dyenigma.backend.entity.SysPermission;
import com.dyenigma.backend.entity.SysUser;

import java.util.List;

/**
 * sharing/com.dyenigma.backend.service
 *
 * @Description :
 * @Author : dingdongliang
 * @Date : 2018/4/18 15:11
 */
public interface SysPermissionService extends BaseService<SysPermission> {
    /**
     * 根据用户ID查询其所拥有的所有权限
     *
     * @param userId
     * @return java.util.List<com.dyenigma.backend.entity.SysPermission>
     * @author dingdongliang
     * @date 2018/4/18 15:44
     */
    List<SysPermission> getUserPmsn(String userId);

    /**
     * 查询当前登录用户的权限等信息
     * @param sysUser 当前用户
     * @return java.util.List<com.dyenigma.backend.entity.SysPermission>
     * @author dingdongliang
     * @date 2018/4/26 17:11
     */
    List<SysPermission> getCurrentPmsn(SysUser sysUser);

    /**
     * 删除权限，需要同时删除角色-权限对应表中的该权限记录
     *
     * @param pmsnId 权限ID
     * @return void
     * @author dingdongliang
     * @date 2018/4/25 16:24
     */
    void delete(String pmsnId);
}
