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

package com.liferay.timetracking.dayoffs.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.liferay.timetracking.dayoffs.model.DaysOffCounter;

import java.util.List;

/**
 * The persistence utility for the days off counter service. This utility wraps {@link DaysOffCounterPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Laszlo Hudak
 * @see DaysOffCounterPersistence
 * @see DaysOffCounterPersistenceImpl
 * @generated
 */
public class DaysOffCounterUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(DaysOffCounter daysOffCounter) {
		getPersistence().clearCache(daysOffCounter);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<DaysOffCounter> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DaysOffCounter> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DaysOffCounter> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DaysOffCounter update(DaysOffCounter daysOffCounter)
		throws SystemException {
		return getPersistence().update(daysOffCounter);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DaysOffCounter update(DaysOffCounter daysOffCounter,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(daysOffCounter, serviceContext);
	}

	/**
	* Returns all the days off counters where workerUserId = &#63;.
	*
	* @param workerUserId the worker user ID
	* @return the matching days off counters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.timetracking.dayoffs.model.DaysOffCounter> findByWorkerUserId(
		long workerUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByWorkerUserId(workerUserId);
	}

	/**
	* Returns a range of all the days off counters where workerUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.timetracking.dayoffs.model.impl.DaysOffCounterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param workerUserId the worker user ID
	* @param start the lower bound of the range of days off counters
	* @param end the upper bound of the range of days off counters (not inclusive)
	* @return the range of matching days off counters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.timetracking.dayoffs.model.DaysOffCounter> findByWorkerUserId(
		long workerUserId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByWorkerUserId(workerUserId, start, end);
	}

	/**
	* Returns an ordered range of all the days off counters where workerUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.timetracking.dayoffs.model.impl.DaysOffCounterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param workerUserId the worker user ID
	* @param start the lower bound of the range of days off counters
	* @param end the upper bound of the range of days off counters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching days off counters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.timetracking.dayoffs.model.DaysOffCounter> findByWorkerUserId(
		long workerUserId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByWorkerUserId(workerUserId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first days off counter in the ordered set where workerUserId = &#63;.
	*
	* @param workerUserId the worker user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching days off counter
	* @throws com.liferay.timetracking.dayoffs.NoSuchDaysOffCounterException if a matching days off counter could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.timetracking.dayoffs.model.DaysOffCounter findByWorkerUserId_First(
		long workerUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.timetracking.dayoffs.NoSuchDaysOffCounterException {
		return getPersistence()
				   .findByWorkerUserId_First(workerUserId, orderByComparator);
	}

	/**
	* Returns the first days off counter in the ordered set where workerUserId = &#63;.
	*
	* @param workerUserId the worker user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching days off counter, or <code>null</code> if a matching days off counter could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.timetracking.dayoffs.model.DaysOffCounter fetchByWorkerUserId_First(
		long workerUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByWorkerUserId_First(workerUserId, orderByComparator);
	}

	/**
	* Returns the last days off counter in the ordered set where workerUserId = &#63;.
	*
	* @param workerUserId the worker user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching days off counter
	* @throws com.liferay.timetracking.dayoffs.NoSuchDaysOffCounterException if a matching days off counter could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.timetracking.dayoffs.model.DaysOffCounter findByWorkerUserId_Last(
		long workerUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.timetracking.dayoffs.NoSuchDaysOffCounterException {
		return getPersistence()
				   .findByWorkerUserId_Last(workerUserId, orderByComparator);
	}

	/**
	* Returns the last days off counter in the ordered set where workerUserId = &#63;.
	*
	* @param workerUserId the worker user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching days off counter, or <code>null</code> if a matching days off counter could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.timetracking.dayoffs.model.DaysOffCounter fetchByWorkerUserId_Last(
		long workerUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByWorkerUserId_Last(workerUserId, orderByComparator);
	}

	/**
	* Returns the days off counters before and after the current days off counter in the ordered set where workerUserId = &#63;.
	*
	* @param dayOffCounterId the primary key of the current days off counter
	* @param workerUserId the worker user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next days off counter
	* @throws com.liferay.timetracking.dayoffs.NoSuchDaysOffCounterException if a days off counter with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.timetracking.dayoffs.model.DaysOffCounter[] findByWorkerUserId_PrevAndNext(
		long dayOffCounterId, long workerUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.timetracking.dayoffs.NoSuchDaysOffCounterException {
		return getPersistence()
				   .findByWorkerUserId_PrevAndNext(dayOffCounterId,
			workerUserId, orderByComparator);
	}

	/**
	* Removes all the days off counters where workerUserId = &#63; from the database.
	*
	* @param workerUserId the worker user ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByWorkerUserId(long workerUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByWorkerUserId(workerUserId);
	}

	/**
	* Returns the number of days off counters where workerUserId = &#63;.
	*
	* @param workerUserId the worker user ID
	* @return the number of matching days off counters
	* @throws SystemException if a system exception occurred
	*/
	public static int countByWorkerUserId(long workerUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByWorkerUserId(workerUserId);
	}

	/**
	* Returns all the days off counters where ruleId = &#63;.
	*
	* @param ruleId the rule ID
	* @return the matching days off counters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.timetracking.dayoffs.model.DaysOffCounter> findByRuleId(
		long ruleId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByRuleId(ruleId);
	}

	/**
	* Returns a range of all the days off counters where ruleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.timetracking.dayoffs.model.impl.DaysOffCounterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ruleId the rule ID
	* @param start the lower bound of the range of days off counters
	* @param end the upper bound of the range of days off counters (not inclusive)
	* @return the range of matching days off counters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.timetracking.dayoffs.model.DaysOffCounter> findByRuleId(
		long ruleId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByRuleId(ruleId, start, end);
	}

	/**
	* Returns an ordered range of all the days off counters where ruleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.timetracking.dayoffs.model.impl.DaysOffCounterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ruleId the rule ID
	* @param start the lower bound of the range of days off counters
	* @param end the upper bound of the range of days off counters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching days off counters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.timetracking.dayoffs.model.DaysOffCounter> findByRuleId(
		long ruleId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByRuleId(ruleId, start, end, orderByComparator);
	}

	/**
	* Returns the first days off counter in the ordered set where ruleId = &#63;.
	*
	* @param ruleId the rule ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching days off counter
	* @throws com.liferay.timetracking.dayoffs.NoSuchDaysOffCounterException if a matching days off counter could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.timetracking.dayoffs.model.DaysOffCounter findByRuleId_First(
		long ruleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.timetracking.dayoffs.NoSuchDaysOffCounterException {
		return getPersistence().findByRuleId_First(ruleId, orderByComparator);
	}

	/**
	* Returns the first days off counter in the ordered set where ruleId = &#63;.
	*
	* @param ruleId the rule ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching days off counter, or <code>null</code> if a matching days off counter could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.timetracking.dayoffs.model.DaysOffCounter fetchByRuleId_First(
		long ruleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByRuleId_First(ruleId, orderByComparator);
	}

	/**
	* Returns the last days off counter in the ordered set where ruleId = &#63;.
	*
	* @param ruleId the rule ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching days off counter
	* @throws com.liferay.timetracking.dayoffs.NoSuchDaysOffCounterException if a matching days off counter could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.timetracking.dayoffs.model.DaysOffCounter findByRuleId_Last(
		long ruleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.timetracking.dayoffs.NoSuchDaysOffCounterException {
		return getPersistence().findByRuleId_Last(ruleId, orderByComparator);
	}

	/**
	* Returns the last days off counter in the ordered set where ruleId = &#63;.
	*
	* @param ruleId the rule ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching days off counter, or <code>null</code> if a matching days off counter could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.timetracking.dayoffs.model.DaysOffCounter fetchByRuleId_Last(
		long ruleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByRuleId_Last(ruleId, orderByComparator);
	}

	/**
	* Returns the days off counters before and after the current days off counter in the ordered set where ruleId = &#63;.
	*
	* @param dayOffCounterId the primary key of the current days off counter
	* @param ruleId the rule ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next days off counter
	* @throws com.liferay.timetracking.dayoffs.NoSuchDaysOffCounterException if a days off counter with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.timetracking.dayoffs.model.DaysOffCounter[] findByRuleId_PrevAndNext(
		long dayOffCounterId, long ruleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.timetracking.dayoffs.NoSuchDaysOffCounterException {
		return getPersistence()
				   .findByRuleId_PrevAndNext(dayOffCounterId, ruleId,
			orderByComparator);
	}

	/**
	* Removes all the days off counters where ruleId = &#63; from the database.
	*
	* @param ruleId the rule ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByRuleId(long ruleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByRuleId(ruleId);
	}

	/**
	* Returns the number of days off counters where ruleId = &#63;.
	*
	* @param ruleId the rule ID
	* @return the number of matching days off counters
	* @throws SystemException if a system exception occurred
	*/
	public static int countByRuleId(long ruleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByRuleId(ruleId);
	}

	/**
	* Returns all the days off counters where year = &#63;.
	*
	* @param year the year
	* @return the matching days off counters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.timetracking.dayoffs.model.DaysOffCounter> findByYear(
		int year) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByYear(year);
	}

	/**
	* Returns a range of all the days off counters where year = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.timetracking.dayoffs.model.impl.DaysOffCounterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param year the year
	* @param start the lower bound of the range of days off counters
	* @param end the upper bound of the range of days off counters (not inclusive)
	* @return the range of matching days off counters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.timetracking.dayoffs.model.DaysOffCounter> findByYear(
		int year, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByYear(year, start, end);
	}

	/**
	* Returns an ordered range of all the days off counters where year = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.timetracking.dayoffs.model.impl.DaysOffCounterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param year the year
	* @param start the lower bound of the range of days off counters
	* @param end the upper bound of the range of days off counters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching days off counters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.timetracking.dayoffs.model.DaysOffCounter> findByYear(
		int year, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByYear(year, start, end, orderByComparator);
	}

	/**
	* Returns the first days off counter in the ordered set where year = &#63;.
	*
	* @param year the year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching days off counter
	* @throws com.liferay.timetracking.dayoffs.NoSuchDaysOffCounterException if a matching days off counter could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.timetracking.dayoffs.model.DaysOffCounter findByYear_First(
		int year,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.timetracking.dayoffs.NoSuchDaysOffCounterException {
		return getPersistence().findByYear_First(year, orderByComparator);
	}

	/**
	* Returns the first days off counter in the ordered set where year = &#63;.
	*
	* @param year the year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching days off counter, or <code>null</code> if a matching days off counter could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.timetracking.dayoffs.model.DaysOffCounter fetchByYear_First(
		int year,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByYear_First(year, orderByComparator);
	}

	/**
	* Returns the last days off counter in the ordered set where year = &#63;.
	*
	* @param year the year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching days off counter
	* @throws com.liferay.timetracking.dayoffs.NoSuchDaysOffCounterException if a matching days off counter could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.timetracking.dayoffs.model.DaysOffCounter findByYear_Last(
		int year,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.timetracking.dayoffs.NoSuchDaysOffCounterException {
		return getPersistence().findByYear_Last(year, orderByComparator);
	}

	/**
	* Returns the last days off counter in the ordered set where year = &#63;.
	*
	* @param year the year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching days off counter, or <code>null</code> if a matching days off counter could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.timetracking.dayoffs.model.DaysOffCounter fetchByYear_Last(
		int year,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByYear_Last(year, orderByComparator);
	}

	/**
	* Returns the days off counters before and after the current days off counter in the ordered set where year = &#63;.
	*
	* @param dayOffCounterId the primary key of the current days off counter
	* @param year the year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next days off counter
	* @throws com.liferay.timetracking.dayoffs.NoSuchDaysOffCounterException if a days off counter with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.timetracking.dayoffs.model.DaysOffCounter[] findByYear_PrevAndNext(
		long dayOffCounterId, int year,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.timetracking.dayoffs.NoSuchDaysOffCounterException {
		return getPersistence()
				   .findByYear_PrevAndNext(dayOffCounterId, year,
			orderByComparator);
	}

	/**
	* Removes all the days off counters where year = &#63; from the database.
	*
	* @param year the year
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByYear(int year)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByYear(year);
	}

	/**
	* Returns the number of days off counters where year = &#63;.
	*
	* @param year the year
	* @return the number of matching days off counters
	* @throws SystemException if a system exception occurred
	*/
	public static int countByYear(int year)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByYear(year);
	}

	/**
	* Returns all the days off counters where ruleId = &#63; and year = &#63;.
	*
	* @param ruleId the rule ID
	* @param year the year
	* @return the matching days off counters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.timetracking.dayoffs.model.DaysOffCounter> findByR_Y(
		long ruleId, int year)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByR_Y(ruleId, year);
	}

	/**
	* Returns a range of all the days off counters where ruleId = &#63; and year = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.timetracking.dayoffs.model.impl.DaysOffCounterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ruleId the rule ID
	* @param year the year
	* @param start the lower bound of the range of days off counters
	* @param end the upper bound of the range of days off counters (not inclusive)
	* @return the range of matching days off counters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.timetracking.dayoffs.model.DaysOffCounter> findByR_Y(
		long ruleId, int year, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByR_Y(ruleId, year, start, end);
	}

	/**
	* Returns an ordered range of all the days off counters where ruleId = &#63; and year = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.timetracking.dayoffs.model.impl.DaysOffCounterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ruleId the rule ID
	* @param year the year
	* @param start the lower bound of the range of days off counters
	* @param end the upper bound of the range of days off counters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching days off counters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.timetracking.dayoffs.model.DaysOffCounter> findByR_Y(
		long ruleId, int year, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByR_Y(ruleId, year, start, end, orderByComparator);
	}

	/**
	* Returns the first days off counter in the ordered set where ruleId = &#63; and year = &#63;.
	*
	* @param ruleId the rule ID
	* @param year the year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching days off counter
	* @throws com.liferay.timetracking.dayoffs.NoSuchDaysOffCounterException if a matching days off counter could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.timetracking.dayoffs.model.DaysOffCounter findByR_Y_First(
		long ruleId, int year,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.timetracking.dayoffs.NoSuchDaysOffCounterException {
		return getPersistence().findByR_Y_First(ruleId, year, orderByComparator);
	}

	/**
	* Returns the first days off counter in the ordered set where ruleId = &#63; and year = &#63;.
	*
	* @param ruleId the rule ID
	* @param year the year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching days off counter, or <code>null</code> if a matching days off counter could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.timetracking.dayoffs.model.DaysOffCounter fetchByR_Y_First(
		long ruleId, int year,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByR_Y_First(ruleId, year, orderByComparator);
	}

	/**
	* Returns the last days off counter in the ordered set where ruleId = &#63; and year = &#63;.
	*
	* @param ruleId the rule ID
	* @param year the year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching days off counter
	* @throws com.liferay.timetracking.dayoffs.NoSuchDaysOffCounterException if a matching days off counter could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.timetracking.dayoffs.model.DaysOffCounter findByR_Y_Last(
		long ruleId, int year,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.timetracking.dayoffs.NoSuchDaysOffCounterException {
		return getPersistence().findByR_Y_Last(ruleId, year, orderByComparator);
	}

	/**
	* Returns the last days off counter in the ordered set where ruleId = &#63; and year = &#63;.
	*
	* @param ruleId the rule ID
	* @param year the year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching days off counter, or <code>null</code> if a matching days off counter could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.timetracking.dayoffs.model.DaysOffCounter fetchByR_Y_Last(
		long ruleId, int year,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByR_Y_Last(ruleId, year, orderByComparator);
	}

	/**
	* Returns the days off counters before and after the current days off counter in the ordered set where ruleId = &#63; and year = &#63;.
	*
	* @param dayOffCounterId the primary key of the current days off counter
	* @param ruleId the rule ID
	* @param year the year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next days off counter
	* @throws com.liferay.timetracking.dayoffs.NoSuchDaysOffCounterException if a days off counter with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.timetracking.dayoffs.model.DaysOffCounter[] findByR_Y_PrevAndNext(
		long dayOffCounterId, long ruleId, int year,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.timetracking.dayoffs.NoSuchDaysOffCounterException {
		return getPersistence()
				   .findByR_Y_PrevAndNext(dayOffCounterId, ruleId, year,
			orderByComparator);
	}

	/**
	* Removes all the days off counters where ruleId = &#63; and year = &#63; from the database.
	*
	* @param ruleId the rule ID
	* @param year the year
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByR_Y(long ruleId, int year)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByR_Y(ruleId, year);
	}

	/**
	* Returns the number of days off counters where ruleId = &#63; and year = &#63;.
	*
	* @param ruleId the rule ID
	* @param year the year
	* @return the number of matching days off counters
	* @throws SystemException if a system exception occurred
	*/
	public static int countByR_Y(long ruleId, int year)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByR_Y(ruleId, year);
	}

	/**
	* Returns all the days off counters where workerUserId = &#63; and ruleId = &#63;.
	*
	* @param workerUserId the worker user ID
	* @param ruleId the rule ID
	* @return the matching days off counters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.timetracking.dayoffs.model.DaysOffCounter> findByW_R(
		long workerUserId, long ruleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByW_R(workerUserId, ruleId);
	}

	/**
	* Returns a range of all the days off counters where workerUserId = &#63; and ruleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.timetracking.dayoffs.model.impl.DaysOffCounterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param workerUserId the worker user ID
	* @param ruleId the rule ID
	* @param start the lower bound of the range of days off counters
	* @param end the upper bound of the range of days off counters (not inclusive)
	* @return the range of matching days off counters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.timetracking.dayoffs.model.DaysOffCounter> findByW_R(
		long workerUserId, long ruleId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByW_R(workerUserId, ruleId, start, end);
	}

	/**
	* Returns an ordered range of all the days off counters where workerUserId = &#63; and ruleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.timetracking.dayoffs.model.impl.DaysOffCounterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param workerUserId the worker user ID
	* @param ruleId the rule ID
	* @param start the lower bound of the range of days off counters
	* @param end the upper bound of the range of days off counters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching days off counters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.timetracking.dayoffs.model.DaysOffCounter> findByW_R(
		long workerUserId, long ruleId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByW_R(workerUserId, ruleId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first days off counter in the ordered set where workerUserId = &#63; and ruleId = &#63;.
	*
	* @param workerUserId the worker user ID
	* @param ruleId the rule ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching days off counter
	* @throws com.liferay.timetracking.dayoffs.NoSuchDaysOffCounterException if a matching days off counter could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.timetracking.dayoffs.model.DaysOffCounter findByW_R_First(
		long workerUserId, long ruleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.timetracking.dayoffs.NoSuchDaysOffCounterException {
		return getPersistence()
				   .findByW_R_First(workerUserId, ruleId, orderByComparator);
	}

	/**
	* Returns the first days off counter in the ordered set where workerUserId = &#63; and ruleId = &#63;.
	*
	* @param workerUserId the worker user ID
	* @param ruleId the rule ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching days off counter, or <code>null</code> if a matching days off counter could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.timetracking.dayoffs.model.DaysOffCounter fetchByW_R_First(
		long workerUserId, long ruleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByW_R_First(workerUserId, ruleId, orderByComparator);
	}

	/**
	* Returns the last days off counter in the ordered set where workerUserId = &#63; and ruleId = &#63;.
	*
	* @param workerUserId the worker user ID
	* @param ruleId the rule ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching days off counter
	* @throws com.liferay.timetracking.dayoffs.NoSuchDaysOffCounterException if a matching days off counter could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.timetracking.dayoffs.model.DaysOffCounter findByW_R_Last(
		long workerUserId, long ruleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.timetracking.dayoffs.NoSuchDaysOffCounterException {
		return getPersistence()
				   .findByW_R_Last(workerUserId, ruleId, orderByComparator);
	}

	/**
	* Returns the last days off counter in the ordered set where workerUserId = &#63; and ruleId = &#63;.
	*
	* @param workerUserId the worker user ID
	* @param ruleId the rule ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching days off counter, or <code>null</code> if a matching days off counter could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.timetracking.dayoffs.model.DaysOffCounter fetchByW_R_Last(
		long workerUserId, long ruleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByW_R_Last(workerUserId, ruleId, orderByComparator);
	}

	/**
	* Returns the days off counters before and after the current days off counter in the ordered set where workerUserId = &#63; and ruleId = &#63;.
	*
	* @param dayOffCounterId the primary key of the current days off counter
	* @param workerUserId the worker user ID
	* @param ruleId the rule ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next days off counter
	* @throws com.liferay.timetracking.dayoffs.NoSuchDaysOffCounterException if a days off counter with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.timetracking.dayoffs.model.DaysOffCounter[] findByW_R_PrevAndNext(
		long dayOffCounterId, long workerUserId, long ruleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.timetracking.dayoffs.NoSuchDaysOffCounterException {
		return getPersistence()
				   .findByW_R_PrevAndNext(dayOffCounterId, workerUserId,
			ruleId, orderByComparator);
	}

	/**
	* Removes all the days off counters where workerUserId = &#63; and ruleId = &#63; from the database.
	*
	* @param workerUserId the worker user ID
	* @param ruleId the rule ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByW_R(long workerUserId, long ruleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByW_R(workerUserId, ruleId);
	}

	/**
	* Returns the number of days off counters where workerUserId = &#63; and ruleId = &#63;.
	*
	* @param workerUserId the worker user ID
	* @param ruleId the rule ID
	* @return the number of matching days off counters
	* @throws SystemException if a system exception occurred
	*/
	public static int countByW_R(long workerUserId, long ruleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByW_R(workerUserId, ruleId);
	}

	/**
	* Returns all the days off counters where workerUserId = &#63; and year = &#63;.
	*
	* @param workerUserId the worker user ID
	* @param year the year
	* @return the matching days off counters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.timetracking.dayoffs.model.DaysOffCounter> findByW_Y(
		long workerUserId, int year)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByW_Y(workerUserId, year);
	}

	/**
	* Returns a range of all the days off counters where workerUserId = &#63; and year = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.timetracking.dayoffs.model.impl.DaysOffCounterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param workerUserId the worker user ID
	* @param year the year
	* @param start the lower bound of the range of days off counters
	* @param end the upper bound of the range of days off counters (not inclusive)
	* @return the range of matching days off counters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.timetracking.dayoffs.model.DaysOffCounter> findByW_Y(
		long workerUserId, int year, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByW_Y(workerUserId, year, start, end);
	}

	/**
	* Returns an ordered range of all the days off counters where workerUserId = &#63; and year = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.timetracking.dayoffs.model.impl.DaysOffCounterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param workerUserId the worker user ID
	* @param year the year
	* @param start the lower bound of the range of days off counters
	* @param end the upper bound of the range of days off counters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching days off counters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.timetracking.dayoffs.model.DaysOffCounter> findByW_Y(
		long workerUserId, int year, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByW_Y(workerUserId, year, start, end, orderByComparator);
	}

	/**
	* Returns the first days off counter in the ordered set where workerUserId = &#63; and year = &#63;.
	*
	* @param workerUserId the worker user ID
	* @param year the year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching days off counter
	* @throws com.liferay.timetracking.dayoffs.NoSuchDaysOffCounterException if a matching days off counter could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.timetracking.dayoffs.model.DaysOffCounter findByW_Y_First(
		long workerUserId, int year,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.timetracking.dayoffs.NoSuchDaysOffCounterException {
		return getPersistence()
				   .findByW_Y_First(workerUserId, year, orderByComparator);
	}

	/**
	* Returns the first days off counter in the ordered set where workerUserId = &#63; and year = &#63;.
	*
	* @param workerUserId the worker user ID
	* @param year the year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching days off counter, or <code>null</code> if a matching days off counter could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.timetracking.dayoffs.model.DaysOffCounter fetchByW_Y_First(
		long workerUserId, int year,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByW_Y_First(workerUserId, year, orderByComparator);
	}

	/**
	* Returns the last days off counter in the ordered set where workerUserId = &#63; and year = &#63;.
	*
	* @param workerUserId the worker user ID
	* @param year the year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching days off counter
	* @throws com.liferay.timetracking.dayoffs.NoSuchDaysOffCounterException if a matching days off counter could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.timetracking.dayoffs.model.DaysOffCounter findByW_Y_Last(
		long workerUserId, int year,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.timetracking.dayoffs.NoSuchDaysOffCounterException {
		return getPersistence()
				   .findByW_Y_Last(workerUserId, year, orderByComparator);
	}

	/**
	* Returns the last days off counter in the ordered set where workerUserId = &#63; and year = &#63;.
	*
	* @param workerUserId the worker user ID
	* @param year the year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching days off counter, or <code>null</code> if a matching days off counter could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.timetracking.dayoffs.model.DaysOffCounter fetchByW_Y_Last(
		long workerUserId, int year,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByW_Y_Last(workerUserId, year, orderByComparator);
	}

	/**
	* Returns the days off counters before and after the current days off counter in the ordered set where workerUserId = &#63; and year = &#63;.
	*
	* @param dayOffCounterId the primary key of the current days off counter
	* @param workerUserId the worker user ID
	* @param year the year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next days off counter
	* @throws com.liferay.timetracking.dayoffs.NoSuchDaysOffCounterException if a days off counter with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.timetracking.dayoffs.model.DaysOffCounter[] findByW_Y_PrevAndNext(
		long dayOffCounterId, long workerUserId, int year,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.timetracking.dayoffs.NoSuchDaysOffCounterException {
		return getPersistence()
				   .findByW_Y_PrevAndNext(dayOffCounterId, workerUserId, year,
			orderByComparator);
	}

	/**
	* Removes all the days off counters where workerUserId = &#63; and year = &#63; from the database.
	*
	* @param workerUserId the worker user ID
	* @param year the year
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByW_Y(long workerUserId, int year)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByW_Y(workerUserId, year);
	}

	/**
	* Returns the number of days off counters where workerUserId = &#63; and year = &#63;.
	*
	* @param workerUserId the worker user ID
	* @param year the year
	* @return the number of matching days off counters
	* @throws SystemException if a system exception occurred
	*/
	public static int countByW_Y(long workerUserId, int year)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByW_Y(workerUserId, year);
	}

	/**
	* Returns the days off counter where workerUserId = &#63; and ruleId = &#63; and year = &#63; or throws a {@link com.liferay.timetracking.dayoffs.NoSuchDaysOffCounterException} if it could not be found.
	*
	* @param workerUserId the worker user ID
	* @param ruleId the rule ID
	* @param year the year
	* @return the matching days off counter
	* @throws com.liferay.timetracking.dayoffs.NoSuchDaysOffCounterException if a matching days off counter could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.timetracking.dayoffs.model.DaysOffCounter findByW_R_Y(
		long workerUserId, long ruleId, int year)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.timetracking.dayoffs.NoSuchDaysOffCounterException {
		return getPersistence().findByW_R_Y(workerUserId, ruleId, year);
	}

	/**
	* Returns the days off counter where workerUserId = &#63; and ruleId = &#63; and year = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param workerUserId the worker user ID
	* @param ruleId the rule ID
	* @param year the year
	* @return the matching days off counter, or <code>null</code> if a matching days off counter could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.timetracking.dayoffs.model.DaysOffCounter fetchByW_R_Y(
		long workerUserId, long ruleId, int year)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByW_R_Y(workerUserId, ruleId, year);
	}

	/**
	* Returns the days off counter where workerUserId = &#63; and ruleId = &#63; and year = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param workerUserId the worker user ID
	* @param ruleId the rule ID
	* @param year the year
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching days off counter, or <code>null</code> if a matching days off counter could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.timetracking.dayoffs.model.DaysOffCounter fetchByW_R_Y(
		long workerUserId, long ruleId, int year, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByW_R_Y(workerUserId, ruleId, year, retrieveFromCache);
	}

	/**
	* Removes the days off counter where workerUserId = &#63; and ruleId = &#63; and year = &#63; from the database.
	*
	* @param workerUserId the worker user ID
	* @param ruleId the rule ID
	* @param year the year
	* @return the days off counter that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.timetracking.dayoffs.model.DaysOffCounter removeByW_R_Y(
		long workerUserId, long ruleId, int year)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.timetracking.dayoffs.NoSuchDaysOffCounterException {
		return getPersistence().removeByW_R_Y(workerUserId, ruleId, year);
	}

	/**
	* Returns the number of days off counters where workerUserId = &#63; and ruleId = &#63; and year = &#63;.
	*
	* @param workerUserId the worker user ID
	* @param ruleId the rule ID
	* @param year the year
	* @return the number of matching days off counters
	* @throws SystemException if a system exception occurred
	*/
	public static int countByW_R_Y(long workerUserId, long ruleId, int year)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByW_R_Y(workerUserId, ruleId, year);
	}

	/**
	* Caches the days off counter in the entity cache if it is enabled.
	*
	* @param daysOffCounter the days off counter
	*/
	public static void cacheResult(
		com.liferay.timetracking.dayoffs.model.DaysOffCounter daysOffCounter) {
		getPersistence().cacheResult(daysOffCounter);
	}

	/**
	* Caches the days off counters in the entity cache if it is enabled.
	*
	* @param daysOffCounters the days off counters
	*/
	public static void cacheResult(
		java.util.List<com.liferay.timetracking.dayoffs.model.DaysOffCounter> daysOffCounters) {
		getPersistence().cacheResult(daysOffCounters);
	}

	/**
	* Creates a new days off counter with the primary key. Does not add the days off counter to the database.
	*
	* @param dayOffCounterId the primary key for the new days off counter
	* @return the new days off counter
	*/
	public static com.liferay.timetracking.dayoffs.model.DaysOffCounter create(
		long dayOffCounterId) {
		return getPersistence().create(dayOffCounterId);
	}

	/**
	* Removes the days off counter with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dayOffCounterId the primary key of the days off counter
	* @return the days off counter that was removed
	* @throws com.liferay.timetracking.dayoffs.NoSuchDaysOffCounterException if a days off counter with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.timetracking.dayoffs.model.DaysOffCounter remove(
		long dayOffCounterId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.timetracking.dayoffs.NoSuchDaysOffCounterException {
		return getPersistence().remove(dayOffCounterId);
	}

	public static com.liferay.timetracking.dayoffs.model.DaysOffCounter updateImpl(
		com.liferay.timetracking.dayoffs.model.DaysOffCounter daysOffCounter)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(daysOffCounter);
	}

	/**
	* Returns the days off counter with the primary key or throws a {@link com.liferay.timetracking.dayoffs.NoSuchDaysOffCounterException} if it could not be found.
	*
	* @param dayOffCounterId the primary key of the days off counter
	* @return the days off counter
	* @throws com.liferay.timetracking.dayoffs.NoSuchDaysOffCounterException if a days off counter with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.timetracking.dayoffs.model.DaysOffCounter findByPrimaryKey(
		long dayOffCounterId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.timetracking.dayoffs.NoSuchDaysOffCounterException {
		return getPersistence().findByPrimaryKey(dayOffCounterId);
	}

	/**
	* Returns the days off counter with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param dayOffCounterId the primary key of the days off counter
	* @return the days off counter, or <code>null</code> if a days off counter with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.timetracking.dayoffs.model.DaysOffCounter fetchByPrimaryKey(
		long dayOffCounterId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(dayOffCounterId);
	}

	/**
	* Returns all the days off counters.
	*
	* @return the days off counters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.timetracking.dayoffs.model.DaysOffCounter> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the days off counters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.timetracking.dayoffs.model.impl.DaysOffCounterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of days off counters
	* @param end the upper bound of the range of days off counters (not inclusive)
	* @return the range of days off counters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.timetracking.dayoffs.model.DaysOffCounter> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the days off counters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.timetracking.dayoffs.model.impl.DaysOffCounterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of days off counters
	* @param end the upper bound of the range of days off counters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of days off counters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.timetracking.dayoffs.model.DaysOffCounter> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the days off counters from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of days off counters.
	*
	* @return the number of days off counters
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DaysOffCounterPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DaysOffCounterPersistence)PortletBeanLocatorUtil.locate(com.liferay.timetracking.dayoffs.service.ClpSerializer.getServletContextName(),
					DaysOffCounterPersistence.class.getName());

			ReferenceRegistry.registerReference(DaysOffCounterUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DaysOffCounterPersistence persistence) {
	}

	private static DaysOffCounterPersistence _persistence;
}