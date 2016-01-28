package cfms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * Created by longzhiyou on 2015-08-24.
 */
@Service
public class CustomUserDetailsService implements UserDetailsService
{
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName)
            throws UsernameNotFoundException {


        UserEntity usersEntity = userRepository.findOne(userName);

        if(usersEntity == null){
            throw new UsernameNotFoundException("UserName "+userName+" not found");
        }

        SecurityUser user = new SecurityUser();
        user.setUsername(usersEntity.getUsername());
        user.setPassword(usersEntity.getPassword());
        user.setEnabled(usersEntity.isEnabled());
        return user;
    }
}