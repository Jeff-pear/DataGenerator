package com.genpact.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the QbPortlet service. Represents a row in the &quot;t_qb_portlet&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.genpact.model.impl.QbPortletModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.genpact.model.impl.QbPortletImpl}.
 * </p>
 *
 * @author 710008328
 * @see QbPortlet
 * @see com.genpact.model.impl.QbPortletImpl
 * @see com.genpact.model.impl.QbPortletModelImpl
 * @generated
 */
public interface QbPortletModel extends BaseModel<QbPortlet> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a qb portlet model instance should use the {@link QbPortlet} interface instead.
     */

    /**
     * Returns the primary key of this qb portlet.
     *
     * @return the primary key of this qb portlet
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this qb portlet.
     *
     * @param primaryKey the primary key of this qb portlet
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the portlet_id of this qb portlet.
     *
     * @return the portlet_id of this qb portlet
     */
    public long getPortlet_id();

    /**
     * Sets the portlet_id of this qb portlet.
     *
     * @param portlet_id the portlet_id of this qb portlet
     */
    public void setPortlet_id(long portlet_id);

    /**
     * Returns the portlet_name of this qb portlet.
     *
     * @return the portlet_name of this qb portlet
     */
    @AutoEscape
    public String getPortlet_name();

    /**
     * Sets the portlet_name of this qb portlet.
     *
     * @param portlet_name the portlet_name of this qb portlet
     */
    public void setPortlet_name(String portlet_name);

    /**
     * Returns the portlet_label_name of this qb portlet.
     *
     * @return the portlet_label_name of this qb portlet
     */
    @AutoEscape
    public String getPortlet_label_name();

    /**
     * Sets the portlet_label_name of this qb portlet.
     *
     * @param portlet_label_name the portlet_label_name of this qb portlet
     */
    public void setPortlet_label_name(String portlet_label_name);

    /**
     * Returns the project_id of this qb portlet.
     *
     * @return the project_id of this qb portlet
     */
    public long getProject_id();

    /**
     * Sets the project_id of this qb portlet.
     *
     * @param project_id the project_id of this qb portlet
     */
    public void setProject_id(long project_id);

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
    public int compareTo(QbPortlet qbPortlet);

    @Override
    public int hashCode();

    @Override
    public CacheModel<QbPortlet> toCacheModel();

    @Override
    public QbPortlet toEscapedModel();

    @Override
    public QbPortlet toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}