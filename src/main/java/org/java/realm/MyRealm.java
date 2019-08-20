package org.java.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.java.service.OaUserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * @Author 秒度
 * @Date 2019/7/28 0028 15:58
 * @Description shiro的realm
 */
public class MyRealm extends AuthorizingRealm {
    @Autowired
    private OaUserService oaUserService;
    /**
     * 授权
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
/*
        System.out.println("###########从数据库中加载用户权限#####################");

        //获得用户的主要凭证信息
        Map principal = (Map) principals.getPrimaryPrincipal();

        //获得用户的id
        Integer userId = (Integer) principal.get("id");

        //根据用户id,查询用户权限
        List<String> list = userService.loadPermission(userId);

        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.addStringPermissions(list);*/
        return null;
    }

    /**
     * 认证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        //获得用户凭证
        String principal = (String) token.getPrincipal();
        System.out.println(principal+"2222222222222222222222222222222222");
        //根据用户凭证（用户名）到数据库中，判断用是否存在
        Map user = oaUserService.oaLogin(principal);
        if(user==null){
            return null;//用户名不存在
        }
        //获得正确密码
        String pwd = (String) user.get("staff_pwd");
        //设置盐
        String salt = "d102";
        //获得用户的id
       // Integer userId = (Integer) user.get("id");
        //获得当前用户可以访问的菜单
     //   List<Map> menus = oaUserService.loadMenus(userId);
        //把菜单放在user中
    //    user.put("menus",menus );
        //返回AuthenticationInfo
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user,pwd, ByteSource.Util.bytes(salt), "myrealm" );
        return info;
    }
}
