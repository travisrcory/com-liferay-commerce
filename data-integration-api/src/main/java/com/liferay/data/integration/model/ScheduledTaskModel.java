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

package com.liferay.data.integration.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the ScheduledTask service. Represents a row in the &quot;ScheduledTask&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.data.integration.model.impl.ScheduledTaskModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.data.integration.model.impl.ScheduledTaskImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ScheduledTask
 * @see com.liferay.data.integration.model.impl.ScheduledTaskImpl
 * @see com.liferay.data.integration.model.impl.ScheduledTaskModelImpl
 * @generated
 */
@ProviderType
public interface ScheduledTaskModel extends BaseModel<ScheduledTask>,
	GroupedModel, ShardedModel, StagedAuditedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a scheduled task model instance should use the {@link ScheduledTask} interface instead.
	 */

	/**
	 * Returns the primary key of this scheduled task.
	 *
	 * @return the primary key of this scheduled task
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this scheduled task.
	 *
	 * @param primaryKey the primary key of this scheduled task
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this scheduled task.
	 *
	 * @return the uuid of this scheduled task
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this scheduled task.
	 *
	 * @param uuid the uuid of this scheduled task
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the scheduled task ID of this scheduled task.
	 *
	 * @return the scheduled task ID of this scheduled task
	 */
	public long getScheduledTaskId();

	/**
	 * Sets the scheduled task ID of this scheduled task.
	 *
	 * @param scheduledTaskId the scheduled task ID of this scheduled task
	 */
	public void setScheduledTaskId(long scheduledTaskId);

	/**
	 * Returns the group ID of this scheduled task.
	 *
	 * @return the group ID of this scheduled task
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this scheduled task.
	 *
	 * @param groupId the group ID of this scheduled task
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this scheduled task.
	 *
	 * @return the company ID of this scheduled task
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this scheduled task.
	 *
	 * @param companyId the company ID of this scheduled task
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this scheduled task.
	 *
	 * @return the user ID of this scheduled task
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this scheduled task.
	 *
	 * @param userId the user ID of this scheduled task
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this scheduled task.
	 *
	 * @return the user uuid of this scheduled task
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this scheduled task.
	 *
	 * @param userUuid the user uuid of this scheduled task
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this scheduled task.
	 *
	 * @return the user name of this scheduled task
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this scheduled task.
	 *
	 * @param userName the user name of this scheduled task
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this scheduled task.
	 *
	 * @return the create date of this scheduled task
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this scheduled task.
	 *
	 * @param createDate the create date of this scheduled task
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this scheduled task.
	 *
	 * @return the modified date of this scheduled task
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this scheduled task.
	 *
	 * @param modifiedDate the modified date of this scheduled task
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the name of this scheduled task.
	 *
	 * @return the name of this scheduled task
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this scheduled task.
	 *
	 * @param name the name of this scheduled task
	 */
	public void setName(String name);

	/**
	 * Returns the frequency of this scheduled task.
	 *
	 * @return the frequency of this scheduled task
	 */
	@AutoEscape
	public String getFrequency();

	/**
	 * Sets the frequency of this scheduled task.
	 *
	 * @param frequency the frequency of this scheduled task
	 */
	public void setFrequency(String frequency);

	/**
	 * Returns the process ID of this scheduled task.
	 *
	 * @return the process ID of this scheduled task
	 */
	public long getProcessId();

	/**
	 * Sets the process ID of this scheduled task.
	 *
	 * @param processId the process ID of this scheduled task
	 */
	public void setProcessId(long processId);

	/**
	 * Returns the status of this scheduled task.
	 *
	 * @return the status of this scheduled task
	 */
	public int getStatus();

	/**
	 * Sets the status of this scheduled task.
	 *
	 * @param status the status of this scheduled task
	 */
	public void setStatus(int status);

	/**
	 * Returns the active of this scheduled task.
	 *
	 * @return the active of this scheduled task
	 */
	public boolean getActive();

	/**
	 * Returns <code>true</code> if this scheduled task is active.
	 *
	 * @return <code>true</code> if this scheduled task is active; <code>false</code> otherwise
	 */
	public boolean isActive();

	/**
	 * Sets whether this scheduled task is active.
	 *
	 * @param active the active of this scheduled task
	 */
	public void setActive(boolean active);

	/**
	 * Returns the run start date of this scheduled task.
	 *
	 * @return the run start date of this scheduled task
	 */
	public Date getRunStartDate();

	/**
	 * Sets the run start date of this scheduled task.
	 *
	 * @param runStartDate the run start date of this scheduled task
	 */
	public void setRunStartDate(Date runStartDate);

	/**
	 * Returns the run end date of this scheduled task.
	 *
	 * @return the run end date of this scheduled task
	 */
	public Date getRunEndDate();

	/**
	 * Sets the run end date of this scheduled task.
	 *
	 * @param runEndDate the run end date of this scheduled task
	 */
	public void setRunEndDate(Date runEndDate);

	/**
	 * Returns the start date of this scheduled task.
	 *
	 * @return the start date of this scheduled task
	 */
	public Date getStartDate();

	/**
	 * Sets the start date of this scheduled task.
	 *
	 * @param startDate the start date of this scheduled task
	 */
	public void setStartDate(Date startDate);

	/**
	 * Returns the start hour of this scheduled task.
	 *
	 * @return the start hour of this scheduled task
	 */
	@AutoEscape
	public String getStartHour();

	/**
	 * Sets the start hour of this scheduled task.
	 *
	 * @param startHour the start hour of this scheduled task
	 */
	public void setStartHour(String startHour);

	/**
	 * Returns the enabled of this scheduled task.
	 *
	 * @return the enabled of this scheduled task
	 */
	public boolean getEnabled();

	/**
	 * Returns <code>true</code> if this scheduled task is enabled.
	 *
	 * @return <code>true</code> if this scheduled task is enabled; <code>false</code> otherwise
	 */
	public boolean isEnabled();

	/**
	 * Sets whether this scheduled task is enabled.
	 *
	 * @param enabled the enabled of this scheduled task
	 */
	public void setEnabled(boolean enabled);

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
	public int compareTo(ScheduledTask scheduledTask);

	@Override
	public int hashCode();

	@Override
	public CacheModel<ScheduledTask> toCacheModel();

	@Override
	public ScheduledTask toEscapedModel();

	@Override
	public ScheduledTask toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}