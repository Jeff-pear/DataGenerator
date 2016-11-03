package com.genpact.service.base;

import com.genpact.model.DataGenerator;

import com.genpact.service.DataGeneratorLocalService;
import com.genpact.service.persistence.DataGeneratorPersistence;
import com.genpact.service.persistence.QbPortletFieldPersistence;
import com.genpact.service.persistence.QbPortletPersistence;
import com.genpact.service.persistence.QbProjectPersistence;
import com.genpact.service.persistence.TalendProcessPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the data generator local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.genpact.service.impl.DataGeneratorLocalServiceImpl}.
 * </p>
 *
 * @author 710008328
 * @see com.genpact.service.impl.DataGeneratorLocalServiceImpl
 * @see com.genpact.service.DataGeneratorLocalServiceUtil
 * @generated
 */
public abstract class DataGeneratorLocalServiceBaseImpl
    extends BaseLocalServiceImpl implements DataGeneratorLocalService,
        IdentifiableBean {
    @BeanReference(type = com.genpact.service.DataGeneratorLocalService.class)
    protected com.genpact.service.DataGeneratorLocalService dataGeneratorLocalService;
    @BeanReference(type = com.genpact.service.DataGeneratorService.class)
    protected com.genpact.service.DataGeneratorService dataGeneratorService;
    @BeanReference(type = DataGeneratorPersistence.class)
    protected DataGeneratorPersistence dataGeneratorPersistence;
    @BeanReference(type = com.genpact.service.QbPortletLocalService.class)
    protected com.genpact.service.QbPortletLocalService qbPortletLocalService;
    @BeanReference(type = com.genpact.service.QbPortletService.class)
    protected com.genpact.service.QbPortletService qbPortletService;
    @BeanReference(type = QbPortletPersistence.class)
    protected QbPortletPersistence qbPortletPersistence;
    @BeanReference(type = com.genpact.service.QbPortletFieldLocalService.class)
    protected com.genpact.service.QbPortletFieldLocalService qbPortletFieldLocalService;
    @BeanReference(type = com.genpact.service.QbPortletFieldService.class)
    protected com.genpact.service.QbPortletFieldService qbPortletFieldService;
    @BeanReference(type = QbPortletFieldPersistence.class)
    protected QbPortletFieldPersistence qbPortletFieldPersistence;
    @BeanReference(type = com.genpact.service.QbProjectLocalService.class)
    protected com.genpact.service.QbProjectLocalService qbProjectLocalService;
    @BeanReference(type = com.genpact.service.QbProjectService.class)
    protected com.genpact.service.QbProjectService qbProjectService;
    @BeanReference(type = QbProjectPersistence.class)
    protected QbProjectPersistence qbProjectPersistence;
    @BeanReference(type = com.genpact.service.TalendProcessLocalService.class)
    protected com.genpact.service.TalendProcessLocalService talendProcessLocalService;
    @BeanReference(type = TalendProcessPersistence.class)
    protected TalendProcessPersistence talendProcessPersistence;
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
    private DataGeneratorLocalServiceClpInvoker _clpInvoker = new DataGeneratorLocalServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link com.genpact.service.DataGeneratorLocalServiceUtil} to access the data generator local service.
     */

    /**
     * Adds the data generator to the database. Also notifies the appropriate model listeners.
     *
     * @param dataGenerator the data generator
     * @return the data generator that was added
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public DataGenerator addDataGenerator(DataGenerator dataGenerator)
        throws SystemException {
        dataGenerator.setNew(true);

        return dataGeneratorPersistence.update(dataGenerator);
    }

    /**
     * Creates a new data generator with the primary key. Does not add the data generator to the database.
     *
     * @param id the primary key for the new data generator
     * @return the new data generator
     */
    @Override
    public DataGenerator createDataGenerator(long id) {
        return dataGeneratorPersistence.create(id);
    }

    /**
     * Deletes the data generator with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the data generator
     * @return the data generator that was removed
     * @throws PortalException if a data generator with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public DataGenerator deleteDataGenerator(long id)
        throws PortalException, SystemException {
        return dataGeneratorPersistence.remove(id);
    }

    /**
     * Deletes the data generator from the database. Also notifies the appropriate model listeners.
     *
     * @param dataGenerator the data generator
     * @return the data generator that was removed
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public DataGenerator deleteDataGenerator(DataGenerator dataGenerator)
        throws SystemException {
        return dataGeneratorPersistence.remove(dataGenerator);
    }

    @Override
    public DynamicQuery dynamicQuery() {
        Class<?> clazz = getClass();

        return DynamicQueryFactoryUtil.forClass(DataGenerator.class,
            clazz.getClassLoader());
    }

    /**
     * Performs a dynamic query on the database and returns the matching rows.
     *
     * @param dynamicQuery the dynamic query
     * @return the matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return dataGeneratorPersistence.findWithDynamicQuery(dynamicQuery);
    }

    /**
     * Performs a dynamic query on the database and returns a range of the matching rows.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.genpact.model.impl.DataGeneratorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param dynamicQuery the dynamic query
     * @param start the lower bound of the range of model instances
     * @param end the upper bound of the range of model instances (not inclusive)
     * @return the range of matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return dataGeneratorPersistence.findWithDynamicQuery(dynamicQuery,
            start, end);
    }

    /**
     * Performs a dynamic query on the database and returns an ordered range of the matching rows.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.genpact.model.impl.DataGeneratorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param dynamicQuery the dynamic query
     * @param start the lower bound of the range of model instances
     * @param end the upper bound of the range of model instances (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return dataGeneratorPersistence.findWithDynamicQuery(dynamicQuery,
            start, end, orderByComparator);
    }

    /**
     * Returns the number of rows that match the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @return the number of rows that match the dynamic query
     * @throws SystemException if a system exception occurred
     */
    @Override
    public long dynamicQueryCount(DynamicQuery dynamicQuery)
        throws SystemException {
        return dataGeneratorPersistence.countWithDynamicQuery(dynamicQuery);
    }

    /**
     * Returns the number of rows that match the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @param projection the projection to apply to the query
     * @return the number of rows that match the dynamic query
     * @throws SystemException if a system exception occurred
     */
    @Override
    public long dynamicQueryCount(DynamicQuery dynamicQuery,
        Projection projection) throws SystemException {
        return dataGeneratorPersistence.countWithDynamicQuery(dynamicQuery,
            projection);
    }

    @Override
    public DataGenerator fetchDataGenerator(long id) throws SystemException {
        return dataGeneratorPersistence.fetchByPrimaryKey(id);
    }

    /**
     * Returns the data generator with the primary key.
     *
     * @param id the primary key of the data generator
     * @return the data generator
     * @throws PortalException if a data generator with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DataGenerator getDataGenerator(long id)
        throws PortalException, SystemException {
        return dataGeneratorPersistence.findByPrimaryKey(id);
    }

    @Override
    public PersistedModel getPersistedModel(Serializable primaryKeyObj)
        throws PortalException, SystemException {
        return dataGeneratorPersistence.findByPrimaryKey(primaryKeyObj);
    }

    /**
     * Returns a range of all the data generators.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.genpact.model.impl.DataGeneratorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of data generators
     * @param end the upper bound of the range of data generators (not inclusive)
     * @return the range of data generators
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<DataGenerator> getDataGenerators(int start, int end)
        throws SystemException {
        return dataGeneratorPersistence.findAll(start, end);
    }

    /**
     * Returns the number of data generators.
     *
     * @return the number of data generators
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int getDataGeneratorsCount() throws SystemException {
        return dataGeneratorPersistence.countAll();
    }

    /**
     * Updates the data generator in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
     *
     * @param dataGenerator the data generator
     * @return the data generator that was updated
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public DataGenerator updateDataGenerator(DataGenerator dataGenerator)
        throws SystemException {
        return dataGeneratorPersistence.update(dataGenerator);
    }

    /**
     * Returns the data generator local service.
     *
     * @return the data generator local service
     */
    public com.genpact.service.DataGeneratorLocalService getDataGeneratorLocalService() {
        return dataGeneratorLocalService;
    }

    /**
     * Sets the data generator local service.
     *
     * @param dataGeneratorLocalService the data generator local service
     */
    public void setDataGeneratorLocalService(
        com.genpact.service.DataGeneratorLocalService dataGeneratorLocalService) {
        this.dataGeneratorLocalService = dataGeneratorLocalService;
    }

    /**
     * Returns the data generator remote service.
     *
     * @return the data generator remote service
     */
    public com.genpact.service.DataGeneratorService getDataGeneratorService() {
        return dataGeneratorService;
    }

    /**
     * Sets the data generator remote service.
     *
     * @param dataGeneratorService the data generator remote service
     */
    public void setDataGeneratorService(
        com.genpact.service.DataGeneratorService dataGeneratorService) {
        this.dataGeneratorService = dataGeneratorService;
    }

    /**
     * Returns the data generator persistence.
     *
     * @return the data generator persistence
     */
    public DataGeneratorPersistence getDataGeneratorPersistence() {
        return dataGeneratorPersistence;
    }

    /**
     * Sets the data generator persistence.
     *
     * @param dataGeneratorPersistence the data generator persistence
     */
    public void setDataGeneratorPersistence(
        DataGeneratorPersistence dataGeneratorPersistence) {
        this.dataGeneratorPersistence = dataGeneratorPersistence;
    }

    /**
     * Returns the qb portlet local service.
     *
     * @return the qb portlet local service
     */
    public com.genpact.service.QbPortletLocalService getQbPortletLocalService() {
        return qbPortletLocalService;
    }

    /**
     * Sets the qb portlet local service.
     *
     * @param qbPortletLocalService the qb portlet local service
     */
    public void setQbPortletLocalService(
        com.genpact.service.QbPortletLocalService qbPortletLocalService) {
        this.qbPortletLocalService = qbPortletLocalService;
    }

    /**
     * Returns the qb portlet remote service.
     *
     * @return the qb portlet remote service
     */
    public com.genpact.service.QbPortletService getQbPortletService() {
        return qbPortletService;
    }

    /**
     * Sets the qb portlet remote service.
     *
     * @param qbPortletService the qb portlet remote service
     */
    public void setQbPortletService(
        com.genpact.service.QbPortletService qbPortletService) {
        this.qbPortletService = qbPortletService;
    }

    /**
     * Returns the qb portlet persistence.
     *
     * @return the qb portlet persistence
     */
    public QbPortletPersistence getQbPortletPersistence() {
        return qbPortletPersistence;
    }

    /**
     * Sets the qb portlet persistence.
     *
     * @param qbPortletPersistence the qb portlet persistence
     */
    public void setQbPortletPersistence(
        QbPortletPersistence qbPortletPersistence) {
        this.qbPortletPersistence = qbPortletPersistence;
    }

    /**
     * Returns the qb portlet field local service.
     *
     * @return the qb portlet field local service
     */
    public com.genpact.service.QbPortletFieldLocalService getQbPortletFieldLocalService() {
        return qbPortletFieldLocalService;
    }

    /**
     * Sets the qb portlet field local service.
     *
     * @param qbPortletFieldLocalService the qb portlet field local service
     */
    public void setQbPortletFieldLocalService(
        com.genpact.service.QbPortletFieldLocalService qbPortletFieldLocalService) {
        this.qbPortletFieldLocalService = qbPortletFieldLocalService;
    }

    /**
     * Returns the qb portlet field remote service.
     *
     * @return the qb portlet field remote service
     */
    public com.genpact.service.QbPortletFieldService getQbPortletFieldService() {
        return qbPortletFieldService;
    }

    /**
     * Sets the qb portlet field remote service.
     *
     * @param qbPortletFieldService the qb portlet field remote service
     */
    public void setQbPortletFieldService(
        com.genpact.service.QbPortletFieldService qbPortletFieldService) {
        this.qbPortletFieldService = qbPortletFieldService;
    }

    /**
     * Returns the qb portlet field persistence.
     *
     * @return the qb portlet field persistence
     */
    public QbPortletFieldPersistence getQbPortletFieldPersistence() {
        return qbPortletFieldPersistence;
    }

    /**
     * Sets the qb portlet field persistence.
     *
     * @param qbPortletFieldPersistence the qb portlet field persistence
     */
    public void setQbPortletFieldPersistence(
        QbPortletFieldPersistence qbPortletFieldPersistence) {
        this.qbPortletFieldPersistence = qbPortletFieldPersistence;
    }

    /**
     * Returns the qb project local service.
     *
     * @return the qb project local service
     */
    public com.genpact.service.QbProjectLocalService getQbProjectLocalService() {
        return qbProjectLocalService;
    }

    /**
     * Sets the qb project local service.
     *
     * @param qbProjectLocalService the qb project local service
     */
    public void setQbProjectLocalService(
        com.genpact.service.QbProjectLocalService qbProjectLocalService) {
        this.qbProjectLocalService = qbProjectLocalService;
    }

    /**
     * Returns the qb project remote service.
     *
     * @return the qb project remote service
     */
    public com.genpact.service.QbProjectService getQbProjectService() {
        return qbProjectService;
    }

    /**
     * Sets the qb project remote service.
     *
     * @param qbProjectService the qb project remote service
     */
    public void setQbProjectService(
        com.genpact.service.QbProjectService qbProjectService) {
        this.qbProjectService = qbProjectService;
    }

    /**
     * Returns the qb project persistence.
     *
     * @return the qb project persistence
     */
    public QbProjectPersistence getQbProjectPersistence() {
        return qbProjectPersistence;
    }

    /**
     * Sets the qb project persistence.
     *
     * @param qbProjectPersistence the qb project persistence
     */
    public void setQbProjectPersistence(
        QbProjectPersistence qbProjectPersistence) {
        this.qbProjectPersistence = qbProjectPersistence;
    }

    /**
     * Returns the talend process local service.
     *
     * @return the talend process local service
     */
    public com.genpact.service.TalendProcessLocalService getTalendProcessLocalService() {
        return talendProcessLocalService;
    }

    /**
     * Sets the talend process local service.
     *
     * @param talendProcessLocalService the talend process local service
     */
    public void setTalendProcessLocalService(
        com.genpact.service.TalendProcessLocalService talendProcessLocalService) {
        this.talendProcessLocalService = talendProcessLocalService;
    }

    /**
     * Returns the talend process persistence.
     *
     * @return the talend process persistence
     */
    public TalendProcessPersistence getTalendProcessPersistence() {
        return talendProcessPersistence;
    }

    /**
     * Sets the talend process persistence.
     *
     * @param talendProcessPersistence the talend process persistence
     */
    public void setTalendProcessPersistence(
        TalendProcessPersistence talendProcessPersistence) {
        this.talendProcessPersistence = talendProcessPersistence;
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

        PersistedModelLocalServiceRegistryUtil.register("com.genpact.model.DataGenerator",
            dataGeneratorLocalService);
    }

    public void destroy() {
        PersistedModelLocalServiceRegistryUtil.unregister(
            "com.genpact.model.DataGenerator");
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
        } finally {
            if (contextClassLoader != _classLoader) {
                currentThread.setContextClassLoader(contextClassLoader);
            }
        }
    }

    protected Class<?> getModelClass() {
        return DataGenerator.class;
    }

    protected String getModelClassName() {
        return DataGenerator.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = dataGeneratorPersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}
