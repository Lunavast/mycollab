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
/*Domain class of table m_prj_kanban_board*/
package com.mycollab.module.project.domain;

import com.mycollab.core.arguments.ValuedBean;
import com.mycollab.db.metadata.Column;
import com.mycollab.db.metadata.Table;
import java.util.Date;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

@SuppressWarnings("ucd")
@Table("m_prj_kanban_board")
public class KanbanBoard extends ValuedBean {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_kanban_board.id
     *
     * @mbg.generated Sat Sep 24 08:44:29 ICT 2016
     */
    @Column("id")
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_kanban_board.name
     *
     * @mbg.generated Sat Sep 24 08:44:29 ICT 2016
     */
    @Length(max=255, message="Field value is too long")
    @Column("name")
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_kanban_board.projectId
     *
     * @mbg.generated Sat Sep 24 08:44:29 ICT 2016
     */
    @Column("projectId")
    private Integer projectid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_kanban_board.sAccountId
     *
     * @mbg.generated Sat Sep 24 08:44:29 ICT 2016
     */
    @Column("sAccountId")
    private Integer saccountid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_kanban_board.lead
     *
     * @mbg.generated Sat Sep 24 08:44:29 ICT 2016
     */
    @Length(max=45, message="Field value is too long")
    @Column("lead")
    private String lead;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_kanban_board.createdTime
     *
     * @mbg.generated Sat Sep 24 08:44:29 ICT 2016
     */
    @Column("createdTime")
    private Date createdtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_kanban_board.lastUpdatedTime
     *
     * @mbg.generated Sat Sep 24 08:44:29 ICT 2016
     */
    @Column("lastUpdatedTime")
    private Date lastupdatedtime;

    private static final long serialVersionUID = 1;

    public final boolean equals(Object obj) {
        if (obj == null) { return false;}
        if (obj == this) { return true;}
        if (!obj.getClass().isAssignableFrom(getClass())) { return false;}
        KanbanBoard item = (KanbanBoard)obj;
        return new EqualsBuilder().append(id, item.id).build();
    }

    public final int hashCode() {
        return new HashCodeBuilder(1075, 273).append(id).build();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_kanban_board.id
     *
     * @return the value of m_prj_kanban_board.id
     *
     * @mbg.generated Sat Sep 24 08:44:29 ICT 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_kanban_board.id
     *
     * @param id the value for m_prj_kanban_board.id
     *
     * @mbg.generated Sat Sep 24 08:44:29 ICT 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_kanban_board.name
     *
     * @return the value of m_prj_kanban_board.name
     *
     * @mbg.generated Sat Sep 24 08:44:29 ICT 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_kanban_board.name
     *
     * @param name the value for m_prj_kanban_board.name
     *
     * @mbg.generated Sat Sep 24 08:44:29 ICT 2016
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_kanban_board.projectId
     *
     * @return the value of m_prj_kanban_board.projectId
     *
     * @mbg.generated Sat Sep 24 08:44:29 ICT 2016
     */
    public Integer getProjectid() {
        return projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_kanban_board.projectId
     *
     * @param projectid the value for m_prj_kanban_board.projectId
     *
     * @mbg.generated Sat Sep 24 08:44:29 ICT 2016
     */
    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_kanban_board.sAccountId
     *
     * @return the value of m_prj_kanban_board.sAccountId
     *
     * @mbg.generated Sat Sep 24 08:44:29 ICT 2016
     */
    public Integer getSaccountid() {
        return saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_kanban_board.sAccountId
     *
     * @param saccountid the value for m_prj_kanban_board.sAccountId
     *
     * @mbg.generated Sat Sep 24 08:44:29 ICT 2016
     */
    public void setSaccountid(Integer saccountid) {
        this.saccountid = saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_kanban_board.lead
     *
     * @return the value of m_prj_kanban_board.lead
     *
     * @mbg.generated Sat Sep 24 08:44:29 ICT 2016
     */
    public String getLead() {
        return lead;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_kanban_board.lead
     *
     * @param lead the value for m_prj_kanban_board.lead
     *
     * @mbg.generated Sat Sep 24 08:44:29 ICT 2016
     */
    public void setLead(String lead) {
        this.lead = lead;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_kanban_board.createdTime
     *
     * @return the value of m_prj_kanban_board.createdTime
     *
     * @mbg.generated Sat Sep 24 08:44:29 ICT 2016
     */
    public Date getCreatedtime() {
        return createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_kanban_board.createdTime
     *
     * @param createdtime the value for m_prj_kanban_board.createdTime
     *
     * @mbg.generated Sat Sep 24 08:44:29 ICT 2016
     */
    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_kanban_board.lastUpdatedTime
     *
     * @return the value of m_prj_kanban_board.lastUpdatedTime
     *
     * @mbg.generated Sat Sep 24 08:44:29 ICT 2016
     */
    public Date getLastupdatedtime() {
        return lastupdatedtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_kanban_board.lastUpdatedTime
     *
     * @param lastupdatedtime the value for m_prj_kanban_board.lastUpdatedTime
     *
     * @mbg.generated Sat Sep 24 08:44:29 ICT 2016
     */
    public void setLastupdatedtime(Date lastupdatedtime) {
        this.lastupdatedtime = lastupdatedtime;
    }

    public enum Field {
        id,
        name,
        projectid,
        saccountid,
        lead,
        createdtime,
        lastupdatedtime;

        public boolean equalTo(Object value) {
            return name().equals(value);
        }
    }
}