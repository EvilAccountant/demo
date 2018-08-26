package com.example.demo.util;

import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
//import net.jsrbc.bean.ResultBean;
//import net.jsrbc.entity.system.SysUser;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.User;

import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * Created by zzj on 2018/7/5.
 */
public class CommonUtil {
	/**
	 * 获取无'-'的UUID
	 *
	 * @return
	 */
	public static String getUUID() {
		return UUID.randomUUID().toString().replace("-", "").toUpperCase();
	}

	/**
	 * 用code作为编码时，下一个三位数编码
	 * @return
	 */
	public static synchronized String nextCode(String parentCode) {
		//基于2018-01-01 01:01以来的毫秒数
		long baseTime=1514739660000L;
		String code=StringUtil.encodeStr(System.currentTimeMillis() - baseTime);
		if (StringUtil.isEmpty(parentCode)){
			return code;
		}
		return parentCode + code;
	}
	/**
	 * 分页
	 *
	 * @param params 分页条件
	 */
	public static void startPage(Map<String, Object> params) {
		if (null != params) {
			Integer pageNum = (Integer) params.get("pageNum");
			Integer pageSize = (Integer) params.get("pageSize");
			if (null != pageNum && null != pageSize && pageSize > 0)
				PageHelper.startPage(pageNum, pageSize);
		}
	}

//	/**
//	 * 返回分页信息
//	 * @param resultBean 页面返回值
//	 * @param pageInfo 分页信息
//	 */
//	public static void  returnPageInfo(ResultBean resultBean, PageInfo<?> pageInfo) {
//		// 数据列表
//		resultBean.setRows(pageInfo.getList());
//		// 当前页
//		resultBean.setPageNum(pageInfo.getPageNum());
//		// 每页记录数
//		resultBean.setPageSize(pageInfo.getPageSize());
//		// 记录总数
//		resultBean.setTotal(pageInfo.getTotal());
//		//导航页第一页页码
//		resultBean.setFirstPage(pageInfo.getFirstPage());
//		//导航页最后一页页码
//		resultBean.setLastPage(pageInfo.getLastPage());
//		//总页数
//		resultBean.setPages(pageInfo.getPages());
//	}
//
//	/**
//	 * 从Spring-security上下文中获取用户id
//	 * @return
//	 */
//	public static String getUserId(){
//		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//		return (String)authentication.getCredentials();
////		return "70067CB7A772465F820A414E392FB69F";//TODO 测试用
//	}
//
//	public static SysUser getUser() {
//		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//		if (authentication.getPrincipal() instanceof SysUser) return (SysUser)authentication.getPrincipal();
//		return null;
//	}
//
//	public static boolean isInspectionUnit() {
//		return getUser() != null && Objects.equals(getUser().getRoleId(), "ROLE_JCDW");
//	}

	/**
	 * 从请求参数中提取全文搜索内容
	 * @param params
	 * @return
	 */
	public static String wrapFullName(Map<String,Object> params){
		StringBuilder sb=new StringBuilder();
		for (Map.Entry<String,Object> it: params.entrySet()){
			if (it.getValue()!=null && it.getValue().toString().length()!=32){
				sb.append(it.getValue()).append(",");
			}
		}
		return sb.toString();
	}

	public static String getBridgeCategory(int sumSpan, int maxSpan) {
		sumSpan/=1000;
		maxSpan/=1000;
		if (sumSpan>1000 || maxSpan>150){
			return "特大桥";
		}else if (sumSpan>=100 || maxSpan>=40){
			return "大桥";
		}else if (sumSpan>30 || maxSpan>=20){
			return "中桥";
		}else if (sumSpan>=8 || maxSpan>=5){
			return "小桥";
		}else {
			return "未知";
		}
	}
}
