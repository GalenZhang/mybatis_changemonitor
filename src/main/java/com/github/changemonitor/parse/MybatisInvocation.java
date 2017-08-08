package com.github.changemonitor.parse;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;

/**
 * @author AlexLu
 * @version CreateDate：2017年4月21日 上午10:19:41
 * Class Description 
 */
public class MybatisInvocation {
	private Object[] args ;
	private MappedStatement mappedStatement;
	private Object parameter;
	private Executor executor;
	
	public MybatisInvocation(Object[] args, MappedStatement mappedStatement, Object parameter, Executor executor) {
		super();
		this.args = args;
		this.mappedStatement = mappedStatement;
		this.parameter = parameter;
		this.executor = executor;
	}
	
	public Object[] getArgs() {
		return args;
	}
	public void setArgs(Object[] args) {
		this.args = args;
	}
	public MappedStatement getMappedStatement() {
		return mappedStatement;
	}
	public void setMappedStatement(MappedStatement mappedStatement) {
		this.mappedStatement = mappedStatement;
	}
	public Object getParameter() {
		return parameter;
	}
	public void setParameter(Object parameter) {
		this.parameter = parameter;
	}
	public Executor getExecutor() {
		return executor;
	}
	public void setExecutor(Executor executor) {
		this.executor = executor;
	}
}

