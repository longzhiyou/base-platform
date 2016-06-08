package com.lzy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

public class CustomAuthenticationProvider extends
		AbstractUserDetailsAuthenticationProvider {

	@Override
	protected void additionalAuthenticationChecks(UserDetails userDetails,
			UsernamePasswordAuthenticationToken authentication)
			throws AuthenticationException {
		// 转换为自定义的token
		CustomAuthenticationToken token = (CustomAuthenticationToken) authentication;
//		String poem = LoginQuestion.getQuestions().get(token.getQuestionId());
//		// 校验下一句的答案是否正确
//		if (!poem.split("/")[1].equals(token.getAnswer())) {
//			throw new BadAnswerException("the answer is wrong!");
//		}

	}

	@Override
	protected UserDetails retrieveUser(String username,
			UsernamePasswordAuthenticationToken authentication)
			throws AuthenticationException {

		System.out
				.println("CustomAuthenticationProvider.retrieveUser() is called!");

		String[] whiteLists = new String[] { "ADMIN", "SUPERVISOR", "JIMMY" };

		// 如果用户在白名单里,直接放行(注:仅仅只是演示,千万不要在实际项目中这么干!)
		if (Arrays.asList(whiteLists).contains(username)) {
			Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
			authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
			UserDetails user = new User(username, "whatever", authorities);
			return user;
		}

		return new User(username, "no-password", false, false, false, false,
				new ArrayList<GrantedAuthority>());

	}

}
