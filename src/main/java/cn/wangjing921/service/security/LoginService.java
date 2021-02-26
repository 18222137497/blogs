package cn.wangjing921.service.security;

import cn.wangjing921.custenum.domainTypeEnum.LVEnum;
import cn.wangjing921.domain.po.Luser;
import cn.wangjing921.mapper.LuserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
/**
 * 权限赋予与登录验证
 * @author afflatus
 */
@Service
@Slf4j
public class LoginService implements UserDetailsService {
    @Autowired
    LuserMapper luserMapper;
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    /**
     * 登录
     * @param username 账号
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        Luser byUsername =null;
        try {
            byUsername=luserMapper.selectByUsername(username);//执行查询方法,获取登录对象
        } catch (Exception e) {
            log.error("用户不存在",e);
        }
        //这个user是spring-security的类,第一参数:用户名,二:密码,三~六:查看中文源码,七:权限名
        User user=new User(byUsername.getUsername(),byUsername.getPassword(),byUsername.getLive().value()==1?true:false,true,true,true,getAuthority(byUsername.getLV()));
        return user;
    }

    /**
     * 获取role权限列表
     * @param roles
     * @return
     */
    //作用就是返回一个List集合，集合中装入的是角色描述(获取登录用户拥有的权限)
    public List<SimpleGrantedAuthority> getAuthority(LVEnum roles) {

        List<SimpleGrantedAuthority> list = new ArrayList<>();
        if (LVEnum.ORDINARY.getValue().equals(roles.getValue())){
            list.add(new SimpleGrantedAuthority("ROLE_" + LVEnum.ORDINARY.getTitle()));
        }else if (LVEnum.VIP.getValue().equals(roles.getValue())){
            list.add(new SimpleGrantedAuthority("ROLE_" + LVEnum.VIP.getTitle()));
        }else if (LVEnum.ADMIN.getValue().equals(roles.getValue())){
            list.add(new SimpleGrantedAuthority("ROLE_" + LVEnum.ADMIN.getTitle()));
        }else if (LVEnum.LOSER.getValue().equals(roles.getValue())){//低信誉用户会被禁止访问，指定时间后解除限制
            list.add(new SimpleGrantedAuthority("ROLE_"+ LVEnum.LOSER.getTitle()));
        }
        return list;
    }
}
