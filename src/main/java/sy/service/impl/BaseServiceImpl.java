package sy.service.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sy.action.BaseAction;
import sy.dao.base.BaseDaoI;
import sy.service.BaseServiceI;
import sy.util.base.HqlFilter;

/**
 * 基础业务逻辑
 * 
 * @author 孙宇
 * 
 * @param <T>
 */
@Service
public class BaseServiceImpl<T> implements BaseServiceI<T> {
	private static final Logger logger = Logger.getLogger(BaseAction.class);
	@Autowired
	private BaseDaoI<T> baseDao;

	@Override
	public Serializable save(T o) {
		return baseDao.save(o);
	}

	@Override
	public void delete(T o) {
		baseDao.delete(o);
	}

	@Override
	public void update(T o) {
		baseDao.update(o);
	}

	@Override
	public void saveOrUpdate(T o) {
		baseDao.saveOrUpdate(o);
	}

	@Override
	public T getById(Serializable id) {
		Class<T> c = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		return baseDao.getById(c, id);
	}

	@Override
	public T getByHql(String hql) {
		logger.info("getByHqlHqlLog1：" + hql);
		return baseDao.getByHql(hql);
	}

	@Override
	public T getByHql(String hql, Map<String, Object> params) {
		logger.info("getByHqlHqlLog2：" + hql);
		return baseDao.getByHql(hql, params);
	}

	@Override
	public T getByFilter(HqlFilter hqlFilter) {
		String className = ((Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]).getName();
		String hql = "select distinct t from " + className + " t";
		return getByHql(hql + hqlFilter.getWhereAndOrderHql(), hqlFilter.getParams());
	}

	@Override
	public List<T> find() {
		return findByFilter(new HqlFilter());
	}

	@Override
	public List<T> find(String hql) {
		logger.info("FindHqlLog1：" + hql);
		return baseDao.find(hql);
	}

	@Override
	public List<T> find(String hql, Map<String, Object> params) {
		logger.info("FindHqlLog2：" + hql);
		return baseDao.find(hql, params);
	}

	@Override
	public List<T> findByFilter(HqlFilter hqlFilter) {
		String className = ((Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]).getName();
		String hql = "select distinct t from " + className + " t";
		return find(hql + hqlFilter.getWhereAndOrderHql(), hqlFilter.getParams());
	}

	@Override
	public List<T> find(String hql, int page, int rows) {
		return baseDao.find(hql, page, rows);
	}

	@Override
	public List<T> find(String hql, Map<String, Object> params, int page, int rows) {
		logger.info("FindHqlLog带参分页：" + hql);
		return baseDao.find(hql, params, page, rows);
	}

	@Override
	public List<T> find(int page, int rows) {
		return findByFilter(new HqlFilter(), page, rows);
	}

	@Override
	public List<T> findByFilter(HqlFilter hqlFilter, int page, int rows) {
		String className = ((Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]).getName();
		String hql = "select distinct t from " + className + " t";
		return find(hql + hqlFilter.getWhereAndOrderHql(), hqlFilter.getParams(), page, rows);
	}

	@Override
	public Long count(String hql) {
		return baseDao.count(hql);
	}

	@Override
	public Long count(String hql, Map<String, Object> params) {
		logger.info("countHqlLog：" + hql);
		return baseDao.count(hql, params);
	}

	@Override
	public Long countByFilter(HqlFilter hqlFilter) {
		String className = ((Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]).getName();
		String hql = "select count(distinct t) from " + className + " t";
		hql  = hql + hqlFilter.getWhereHql();
		logger.info("countByFilterHqlLog：" + hql);
		return count(hql, hqlFilter.getParams());
	}

	@Override
	public Long count() {
		return countByFilter(new HqlFilter());
	}

	@Override
	public int executeHql(String hql) {
		logger.info("executeHqlFilterHqlLog：" + hql);
		return baseDao.executeHql(hql);
	}

	@Override
	public int executeHql(String hql, Map<String, Object> params) {
		return baseDao.executeHql(hql, params);
	}

	@Override
	public List findBySql(String sql) {
		logger.info("findBySqlLog：" + sql);
		return baseDao.findBySql(sql);
	}

	@Override
	public List findBySql(String sql, int page, int rows) {
		logger.info("findBySqlLog1：" + sql);
		return baseDao.findBySql(sql, page, rows);
	}

	@Override
	public List findBySql(String sql, Map<String, Object> params) {
		logger.info("findBySqlLog2：" + sql);
		return baseDao.findBySql(sql, params);
	}

	@Override
	public List findBySql(String sql, Map<String, Object> params, int page, int rows) {
		logger.info("findBySqlLog分页：" + sql);
		return baseDao.findBySql(sql, params, page, rows);
	}

	@Override
	public int executeSql(String sql) {
		return baseDao.executeSql(sql);
	}

	@Override
	public int executeSql(String sql, Map<String, Object> params) {
		return baseDao.executeSql(sql, params);
	}

	@Override
	public BigInteger countBySql(String sql) {
		return baseDao.countBySql(sql);
	}

	@Override
	public BigInteger countBySql(String sql, Map<String, Object> params) {
		return baseDao.countBySql(sql, params);
	}

}
