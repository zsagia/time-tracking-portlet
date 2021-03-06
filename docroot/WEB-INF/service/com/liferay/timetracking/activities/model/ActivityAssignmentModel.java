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

package com.liferay.timetracking.activities.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.AuditedModel;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the ActivityAssignment service. Represents a row in the &quot;TimeTracking_ActivityAssignment&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.timetracking.activities.model.impl.ActivityAssignmentModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.timetracking.activities.model.impl.ActivityAssignmentImpl}.
 * </p>
 *
 * @author Laszlo Hudak, Adam T. Nagy
 * @see ActivityAssignment
 * @see com.liferay.timetracking.activities.model.impl.ActivityAssignmentImpl
 * @see com.liferay.timetracking.activities.model.impl.ActivityAssignmentModelImpl
 * @generated
 */
public interface ActivityAssignmentModel extends AuditedModel,
	BaseModel<ActivityAssignment> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a activity assignment model instance should use the {@link ActivityAssignment} interface instead.
	 */

	/**
	 * Returns the primary key of this activity assignment.
	 *
	 * @return the primary key of this activity assignment
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this activity assignment.
	 *
	 * @param primaryKey the primary key of this activity assignment
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the activity assignment ID of this activity assignment.
	 *
	 * @return the activity assignment ID of this activity assignment
	 */
	public long getActivityAssignmentId();

	/**
	 * Sets the activity assignment ID of this activity assignment.
	 *
	 * @param activityAssignmentId the activity assignment ID of this activity assignment
	 */
	public void setActivityAssignmentId(long activityAssignmentId);

	/**
	 * Returns the company ID of this activity assignment.
	 *
	 * @return the company ID of this activity assignment
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this activity assignment.
	 *
	 * @param companyId the company ID of this activity assignment
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this activity assignment.
	 *
	 * @return the user ID of this activity assignment
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this activity assignment.
	 *
	 * @param userId the user ID of this activity assignment
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this activity assignment.
	 *
	 * @return the user uuid of this activity assignment
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this activity assignment.
	 *
	 * @param userUuid the user uuid of this activity assignment
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this activity assignment.
	 *
	 * @return the user name of this activity assignment
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this activity assignment.
	 *
	 * @param userName the user name of this activity assignment
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this activity assignment.
	 *
	 * @return the create date of this activity assignment
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this activity assignment.
	 *
	 * @param createDate the create date of this activity assignment
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this activity assignment.
	 *
	 * @return the modified date of this activity assignment
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this activity assignment.
	 *
	 * @param modifiedDate the modified date of this activity assignment
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the activity ID of this activity assignment.
	 *
	 * @return the activity ID of this activity assignment
	 */
	public long getActivityId();

	/**
	 * Sets the activity ID of this activity assignment.
	 *
	 * @param activityId the activity ID of this activity assignment
	 */
	public void setActivityId(long activityId);

	/**
	 * Returns the work day ID of this activity assignment.
	 *
	 * @return the work day ID of this activity assignment
	 */
	public long getWorkDayId();

	/**
	 * Sets the work day ID of this activity assignment.
	 *
	 * @param workDayId the work day ID of this activity assignment
	 */
	public void setWorkDayId(long workDayId);

	/**
	 * Returns the start time of this activity assignment.
	 *
	 * @return the start time of this activity assignment
	 */
	public Date getStartTime();

	/**
	 * Sets the start time of this activity assignment.
	 *
	 * @param startTime the start time of this activity assignment
	 */
	public void setStartTime(Date startTime);

	/**
	 * Returns the end time of this activity assignment.
	 *
	 * @return the end time of this activity assignment
	 */
	public Date getEndTime();

	/**
	 * Sets the end time of this activity assignment.
	 *
	 * @param endTime the end time of this activity assignment
	 */
	public void setEndTime(Date endTime);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(ActivityAssignment activityAssignment);

	@Override
	public int hashCode();

	@Override
	public CacheModel<ActivityAssignment> toCacheModel();

	@Override
	public ActivityAssignment toEscapedModel();

	@Override
	public ActivityAssignment toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}