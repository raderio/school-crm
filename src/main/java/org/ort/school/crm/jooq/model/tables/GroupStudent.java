/*
 * This file is generated by jOOQ.
 */
package org.ort.school.crm.jooq.model.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.ort.school.crm.jooq.model.Indexes;
import org.ort.school.crm.jooq.model.Keys;
import org.ort.school.crm.jooq.model.Public;
import org.ort.school.crm.jooq.model.tables.records.GroupStudentRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GroupStudent extends TableImpl<GroupStudentRecord> {

    private static final long serialVersionUID = 1150876507;

    /**
     * The reference instance of <code>PUBLIC.GROUP_STUDENT</code>
     */
    public static final GroupStudent GROUP_STUDENT = new GroupStudent();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GroupStudentRecord> getRecordType() {
        return GroupStudentRecord.class;
    }

    /**
     * The column <code>PUBLIC.GROUP_STUDENT.STUDENT_ID</code>.
     */
    public final TableField<GroupStudentRecord, Long> STUDENT_ID = createField("STUDENT_ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.GROUP_STUDENT.GROUP_ID</code>.
     */
    public final TableField<GroupStudentRecord, Long> GROUP_ID = createField("GROUP_ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>PUBLIC.GROUP_STUDENT</code> table reference
     */
    public GroupStudent() {
        this(DSL.name("GROUP_STUDENT"), null);
    }

    /**
     * Create an aliased <code>PUBLIC.GROUP_STUDENT</code> table reference
     */
    public GroupStudent(String alias) {
        this(DSL.name(alias), GROUP_STUDENT);
    }

    /**
     * Create an aliased <code>PUBLIC.GROUP_STUDENT</code> table reference
     */
    public GroupStudent(Name alias) {
        this(alias, GROUP_STUDENT);
    }

    private GroupStudent(Name alias, Table<GroupStudentRecord> aliased) {
        this(alias, aliased, null);
    }

    private GroupStudent(Name alias, Table<GroupStudentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> GroupStudent(Table<O> child, ForeignKey<O, GroupStudentRecord> key) {
        super(child, key, GROUP_STUDENT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.CONSTRAINT_INDEX_48, Indexes.CONSTRAINT_INDEX_48E, Indexes.GR_G, Indexes.GR_S);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<GroupStudentRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<GroupStudentRecord, ?>>asList(Keys.CONSTRAINT_48, Keys.CONSTRAINT_48E);
    }

    public Student student() {
        return new Student(this, Keys.CONSTRAINT_48);
    }

    public Group group() {
        return new Group(this, Keys.CONSTRAINT_48E);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupStudent as(String alias) {
        return new GroupStudent(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupStudent as(Name alias) {
        return new GroupStudent(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public GroupStudent rename(String name) {
        return new GroupStudent(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GroupStudent rename(Name name) {
        return new GroupStudent(name, null);
    }
}