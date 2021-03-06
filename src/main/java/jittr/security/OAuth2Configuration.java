package jittr.security;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
//import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
//import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
//import org.springframework.security.oauth2.provider.ClientDetailsService;
//import org.springframework.security.oauth2.provider.client.BaseClientDetails;
//
//import jittr.db.JitterRepository;
//
///**
// * Provides authorization for security tests.
// */
//@Configuration
//@EnableResourceServer
//@EnableAuthorizationServer
//class OAuth2Configuration extends AuthorizationServerConfigurerAdapter {
//
//    private final static String APPLICATION_NAME = "jittr";
//	
//    @Autowired
//    JitterRepository jitterRepository;
//
//	@Autowired
//	AuthenticationManagerBuilder authenticationManager;
//
//	@Override
//	public void configure(AuthorizationServerEndpointsConfigurer endpoints) 
//	        throws Exception {
//		endpoints.authenticationManager(new AuthenticationManager() {
//			@Override
//			public Authentication authenticate(Authentication authentication)
//					throws AuthenticationException {
//				return authenticationManager.getOrBuild().authenticate(authentication);
//			}
//		});
//	}
//
//	@Override
//	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {	    
//	    clients.withClientDetails(clientDetailsService());
//	}
//	
//    @Bean
//    protected ClientDetailsService clientDetailsService() {           
//        return (username) -> jitterRepository
//                .findByUsername(username)
//                .map(u -> { BaseClientDetails client = new BaseClientDetails(u.getUsername(),
//                            u.getUsername(), "write", "password", u.getRole().toString());
//                            client.setClientSecret(u.getPassword());
//                            return client;})
//                .orElseThrow(() -> new UsernameNotFoundException("could not find the user '"
//                                + username + "'"));
//    }
//}

