package com.genpact.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the DataGenerator service. Represents a row in the &quot;t_data_generator&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.genpact.model.impl.DataGeneratorModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.genpact.model.impl.DataGeneratorImpl}.
 * </p>
 *
 * @author 710008328
 * @see DataGenerator
 * @see com.genpact.model.impl.DataGeneratorImpl
 * @see com.genpact.model.impl.DataGeneratorModelImpl
 * @generated
 */
public interface DataGeneratorModel extends BaseModel<DataGenerator> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a data generator model instance should use the {@link DataGenerator} interface instead.
     */

    /**
     * Returns the primary key of this data generator.
     *
     * @return the primary key of this data generator
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this data generator.
     *
     * @param primaryKey the primary key of this data generator
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the ID of this data generator.
     *
     * @return the ID of this data generator
     */
    public long getId();

    /**
     * Sets the ID of this data generator.
     *
     * @param id the ID of this data generator
     */
    public void setId(long id);

    /**
     * Returns the data of this data generator.
     *
     * @return the data of this data generator
     */
    @AutoEscape
    public String getData();

    /**
     * Sets the data of this data generator.
     *
     * @param data the data of this data generator
     */
    public void setData(String data);

    /**
     * Returns the type of this data generator.
     *
     * @return the type of this data generator
     */
    @AutoEscape
    public String getType();

    /**
     * Sets the type of this data generator.
     *
     * @param type the type of this data generator
     */
    public void setType(String type);

    /**
     * Returns the create date of this data generator.
     *
     * @return the create date of this data generator
     */
    public Date getCreateDate();

    /**
     * Sets the create date of this data generator.
     *
     * @param createDate the create date of this data generator
     */
    public void setCreateDate(Date createDate);

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
    public int compareTo(DataGenerator dataGenerator);

    @Override
    public int hashCode();

    @Override
    public CacheModel<DataGenerator> toCacheModel();

    @Override
    public DataGenerator toEscapedModel();

    @Override
    public DataGenerator toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
