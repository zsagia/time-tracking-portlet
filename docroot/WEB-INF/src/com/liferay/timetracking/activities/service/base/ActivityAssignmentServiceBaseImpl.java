/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.timetracking.activities.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import com.liferay.timetracking.activities.model.ActivityAssignment;
import com.liferay.timetracking.activities.service.ActivityAssignmentService;
import com.liferay.timetracking.activities.service.persistence.ActivityAssignmentPersistence;
import com.liferay.timetracking.activities.service.persistence.ActivityPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the activity assignment remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.liferay.timetracking.activities.service.impl.ActivityAssignmentServiceImpl}.
 * </p>
 *
 * @author Laszlo Hudak, Adam T. Nagy
 * @see com.liferay.timetracking.activities.service.impl.ActivityAssignmentServiceImpl
 * @see com.liferay.timetracking.activities.service.ActivityAssignmentServiceUtil
 * @generated
 */
public abstract class ActivityAssignmentServiceBaseImpl extends BaseServiceImpl
	implements ActivityAssignmentService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.liferay.timetracking.activities.service.ActivityAssignmentServiceUtil} to access the activity assignment remote service.
	 */

	/**
	 * Returns the activity local service.
	 *
	 * @return the activity local service
	 */
	public com.liferay.timetracking.activities.service.ActivityLocalService getActivityLocalService() {
		return activityLocalService;
	}

	/**
	 * Sets the activity local service.
	 *
	 * @param activityLocalService the activity local service
	 */
	public void setActivityLocalService(
		com.liferay.timetracking.activities.service.ActivityLocalService activityLocalService) {
		this.activityLocalService = activityLocalService;
	}

	/**
	 * Returns the activity remote service.
	 *
	 * @return the activity remote service
	 */
	public com.liferay.timetracking.activities.service.ActivityService getActivityService() {
		return activityService;
	}

	/**
	 * Sets the activity remote service.
	 *
	 * @param activityService the activity remote service
	 */
	public void setActivityService(
		com.liferay.timetracking.activities.service.ActivityService activityService) {
		this.activityService = activityService;
	}

	/**
	 * Returns the activity persistence.
	 *
	 * @return the activity persistence
	 */
	public ActivityPersistence getActivityPersistence() {
		return activityPersistence;
	}

	/**
	 * Sets the activity persistence.
	 *
	 * @param activityPersistence the activity persistence
	 */
	public void setActivityPersistence(ActivityPersistence activityPersistence) {
		this.activityPersistence = activityPersistence;
	}

	/**
	 * Returns the activity assignment local service.
	 *
	 * @return the activity assignment local service
	 */
	public com.liferay.timetracking.activities.service.ActivityAssignmentLocalService getActivityAssignmentLocalService() {
		return activityAssignmentLocalService;
	}

	/**
	 * Sets the activity assignment local service.
	 *
	 * @param activityAssignmentLocalService the activity assignment local service
	 */
	public void setActivityAssignmentLocalService(
		com.liferay.timetracking.activities.service.ActivityAssignmentLocalService activityAssignmentLocalService) {
		this.activityAssignmentLocalService = activityAssignmentLocalService;
	}

	/**
	 * Returns the activity assignment remote service.
	 *
	 * @return the activity assignment remote service
	 */
	public com.liferay.timetracking.activities.service.ActivityAssignmentService getActivityAssignmentService() {
		return activityAssignmentService;
	}

	/**
	 * Sets the activity assignment remote service.
	 *
	 * @param activityAssignmentService the activity assignment remote service
	 */
	public void setActivityAssignmentService(
		com.liferay.timetracking.activities.service.ActivityAssignmentService activityAssignmentService) {
		this.activityAssignmentService = activityAssignmentService;
	}

	/**
	 * Returns the activity assignment persistence.
	 *
	 * @return the activity assignment persistence
	 */
	public ActivityAssignmentPersistence getActivityAssignmentPersistence() {
		return activityAssignmentPersistence;
	}

	/**
	 * Sets the activity assignment persistence.
	 *
	 * @param activityAssignmentPersistence the activity assignment persistence
	 */
	public void setActivityAssignmentPersistence(
		ActivityAssignmentPersistence activityAssignmentPersistence) {
		this.activityAssignmentPersistence = activityAssignmentPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();
	}

	public void destroy() {
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return ActivityAssignment.class;
	}

	protected String getModelClassName() {
		return ActivityAssignment.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = activityAssignmentPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.liferay.timetracking.activities.service.ActivityLocalService.class)
	protected com.liferay.timetracking.activities.service.ActivityLocalService activityLocalService;
	@BeanReference(type = com.liferay.timetracking.activities.service.ActivityService.class)
	protected com.liferay.timetracking.activities.service.ActivityService activityService;
	@BeanReference(type = ActivityPersistence.class)
	protected ActivityPersistence activityPersistence;
	@BeanReference(type = com.liferay.timetracking.activities.service.ActivityAssignmentLocalService.class)
	protected com.liferay.timetracking.activities.service.ActivityAssignmentLocalService activityAssignmentLocalService;
	@BeanReference(type = com.liferay.timetracking.activities.service.ActivityAssignmentService.class)
	protected com.liferay.timetracking.activities.service.ActivityAssignmentService activityAssignmentService;
	@BeanReference(type = ActivityAssignmentPersistence.class)
	protected ActivityAssignmentPersistence activityAssignmentPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private ActivityAssignmentServiceClpInvoker _clpInvoker = new ActivityAssignmentServiceClpInvoker();
}