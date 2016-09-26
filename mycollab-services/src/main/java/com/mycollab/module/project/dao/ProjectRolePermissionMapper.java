/**
 * This file is part of mycollab-services.
 *
 * mycollab-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-services.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.mycollab.module.project.dao;

import com.mycollab.db.persistence.ICrudGenericDAO;
import com.mycollab.module.project.domain.ProjectRolePermission;
import com.mycollab.module.project.domain.ProjectRolePermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@SuppressWarnings({ "ucd", "rawtypes" })
public interface ProjectRolePermissionMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_role_permission
     *
     * @mbg.generated Sat Sep 24 08:44:29 ICT 2016
     */
    long countByExample(ProjectRolePermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_role_permission
     *
     * @mbg.generated Sat Sep 24 08:44:29 ICT 2016
     */
    int deleteByExample(ProjectRolePermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_role_permission
     *
     * @mbg.generated Sat Sep 24 08:44:29 ICT 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_role_permission
     *
     * @mbg.generated Sat Sep 24 08:44:29 ICT 2016
     */
    int insert(ProjectRolePermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_role_permission
     *
     * @mbg.generated Sat Sep 24 08:44:29 ICT 2016
     */
    int insertSelective(ProjectRolePermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_role_permission
     *
     * @mbg.generated Sat Sep 24 08:44:29 ICT 2016
     */
    List<ProjectRolePermission> selectByExampleWithBLOBs(ProjectRolePermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_role_permission
     *
     * @mbg.generated Sat Sep 24 08:44:29 ICT 2016
     */
    List<ProjectRolePermission> selectByExample(ProjectRolePermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_role_permission
     *
     * @mbg.generated Sat Sep 24 08:44:29 ICT 2016
     */
    ProjectRolePermission selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_role_permission
     *
     * @mbg.generated Sat Sep 24 08:44:29 ICT 2016
     */
    int updateByExampleSelective(@Param("record") ProjectRolePermission record, @Param("example") ProjectRolePermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_role_permission
     *
     * @mbg.generated Sat Sep 24 08:44:29 ICT 2016
     */
    int updateByExampleWithBLOBs(@Param("record") ProjectRolePermission record, @Param("example") ProjectRolePermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_role_permission
     *
     * @mbg.generated Sat Sep 24 08:44:29 ICT 2016
     */
    int updateByExample(@Param("record") ProjectRolePermission record, @Param("example") ProjectRolePermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_role_permission
     *
     * @mbg.generated Sat Sep 24 08:44:29 ICT 2016
     */
    int updateByPrimaryKeySelective(ProjectRolePermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_role_permission
     *
     * @mbg.generated Sat Sep 24 08:44:29 ICT 2016
     */
    int updateByPrimaryKeyWithBLOBs(ProjectRolePermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_role_permission
     *
     * @mbg.generated Sat Sep 24 08:44:29 ICT 2016
     */
    int updateByPrimaryKey(ProjectRolePermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_role_permission
     *
     * @mbg.generated Sat Sep 24 08:44:29 ICT 2016
     */
    Integer insertAndReturnKey(ProjectRolePermission value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_role_permission
     *
     * @mbg.generated Sat Sep 24 08:44:29 ICT 2016
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_role_permission
     *
     * @mbg.generated Sat Sep 24 08:44:29 ICT 2016
     */
    void massUpdateWithSession(@Param("record") ProjectRolePermission record, @Param("primaryKeys") List primaryKeys);
}