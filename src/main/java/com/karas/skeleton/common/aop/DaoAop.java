package com.karas.skeleton.common.aop;



/**
 * Created by karasying on 2016/10/28.
 */
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @DESCRIPTION 全局Dao的切面自动 对 Insert Update Delete 数据库操作进行 时间与用户记录
 * @AUTHOR karas - 272256055@qq.com
 * @DATE 2016/10/28
 */
@Aspect
public class DaoAop {
//        @Before("execution(com.karas.baseModel.*.dao.*)")
//@Before("execution(* com.howtodoinjava.app.service.impl.EmployeeManagerImpl.*(..))")
        @Before("execution(* com.karas.skeleton.account.*.*.*(..))")
        public void recordDaoBefore(){

        }
}
