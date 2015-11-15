/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hbase.thrift2.generated;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * if no Result is found, row and columnValues will not be set.
 */
public class TResult implements org.apache.thrift.TBase<TResult, TResult._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TResult");

  private static final org.apache.thrift.protocol.TField ROW_FIELD_DESC = new org.apache.thrift.protocol.TField("row", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField COLUMN_VALUES_FIELD_DESC = new org.apache.thrift.protocol.TField("columnValues", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TResultTupleSchemeFactory());
  }

  public ByteBuffer row; // optional
  public List<TColumnValue> columnValues; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ROW((short)1, "row"),
    COLUMN_VALUES((short)2, "columnValues");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ROW
          return ROW;
        case 2: // COLUMN_VALUES
          return COLUMN_VALUES;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private _Fields optionals[] = {_Fields.ROW};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ROW, new org.apache.thrift.meta_data.FieldMetaData("row", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.COLUMN_VALUES, new org.apache.thrift.meta_data.FieldMetaData("columnValues", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TColumnValue.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TResult.class, metaDataMap);
  }

  public TResult() {
  }

  public TResult(
    List<TColumnValue> columnValues)
  {
    this();
    this.columnValues = columnValues;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TResult(TResult other) {
    if (other.isSetRow()) {
      this.row = org.apache.thrift.TBaseHelper.copyBinary(other.row);
;
    }
    if (other.isSetColumnValues()) {
      List<TColumnValue> __this__columnValues = new ArrayList<TColumnValue>();
      for (TColumnValue other_element : other.columnValues) {
        __this__columnValues.add(new TColumnValue(other_element));
      }
      this.columnValues = __this__columnValues;
    }
  }

  public TResult deepCopy() {
    return new TResult(this);
  }

  @Override
  public void clear() {
    this.row = null;
    this.columnValues = null;
  }

  public byte[] getRow() {
    setRow(org.apache.thrift.TBaseHelper.rightSize(row));
    return row == null ? null : row.array();
  }

  public ByteBuffer bufferForRow() {
    return row;
  }

  public TResult setRow(byte[] row) {
    setRow(row == null ? (ByteBuffer)null : ByteBuffer.wrap(row));
    return this;
  }

  public TResult setRow(ByteBuffer row) {
    this.row = row;
    return this;
  }

  public void unsetRow() {
    this.row = null;
  }

  /** Returns true if field row is set (has been assigned a value) and false otherwise */
  public boolean isSetRow() {
    return this.row != null;
  }

  public void setRowIsSet(boolean value) {
    if (!value) {
      this.row = null;
    }
  }

  public int getColumnValuesSize() {
    return (this.columnValues == null) ? 0 : this.columnValues.size();
  }

  public java.util.Iterator<TColumnValue> getColumnValuesIterator() {
    return (this.columnValues == null) ? null : this.columnValues.iterator();
  }

  public void addToColumnValues(TColumnValue elem) {
    if (this.columnValues == null) {
      this.columnValues = new ArrayList<TColumnValue>();
    }
    this.columnValues.add(elem);
  }

  public List<TColumnValue> getColumnValues() {
    return this.columnValues;
  }

  public TResult setColumnValues(List<TColumnValue> columnValues) {
    this.columnValues = columnValues;
    return this;
  }

  public void unsetColumnValues() {
    this.columnValues = null;
  }

  /** Returns true if field columnValues is set (has been assigned a value) and false otherwise */
  public boolean isSetColumnValues() {
    return this.columnValues != null;
  }

  public void setColumnValuesIsSet(boolean value) {
    if (!value) {
      this.columnValues = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ROW:
      if (value == null) {
        unsetRow();
      } else {
        setRow((ByteBuffer)value);
      }
      break;

    case COLUMN_VALUES:
      if (value == null) {
        unsetColumnValues();
      } else {
        setColumnValues((List<TColumnValue>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ROW:
      return getRow();

    case COLUMN_VALUES:
      return getColumnValues();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ROW:
      return isSetRow();
    case COLUMN_VALUES:
      return isSetColumnValues();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TResult)
      return this.equals((TResult)that);
    return false;
  }

  public boolean equals(TResult that) {
    if (that == null)
      return false;

    boolean this_present_row = true && this.isSetRow();
    boolean that_present_row = true && that.isSetRow();
    if (this_present_row || that_present_row) {
      if (!(this_present_row && that_present_row))
        return false;
      if (!this.row.equals(that.row))
        return false;
    }

    boolean this_present_columnValues = true && this.isSetColumnValues();
    boolean that_present_columnValues = true && that.isSetColumnValues();
    if (this_present_columnValues || that_present_columnValues) {
      if (!(this_present_columnValues && that_present_columnValues))
        return false;
      if (!this.columnValues.equals(that.columnValues))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_row = true && (isSetRow());
    builder.append(present_row);
    if (present_row)
      builder.append(row);

    boolean present_columnValues = true && (isSetColumnValues());
    builder.append(present_columnValues);
    if (present_columnValues)
      builder.append(columnValues);

    return builder.toHashCode();
  }

  public int compareTo(TResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TResult typedOther = (TResult)other;

    lastComparison = Boolean.valueOf(isSetRow()).compareTo(typedOther.isSetRow());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRow()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.row, typedOther.row);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetColumnValues()).compareTo(typedOther.isSetColumnValues());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColumnValues()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.columnValues, typedOther.columnValues);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TResult(");
    boolean first = true;

    if (isSetRow()) {
      sb.append("row:");
      if (this.row == null) {
        sb.append("null");
      } else {
        org.apache.thrift.TBaseHelper.toString(this.row, sb);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("columnValues:");
    if (this.columnValues == null) {
      sb.append("null");
    } else {
      sb.append(this.columnValues);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (columnValues == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'columnValues' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TResultStandardSchemeFactory implements SchemeFactory {
    public TResultStandardScheme getScheme() {
      return new TResultStandardScheme();
    }
  }

  private static class TResultStandardScheme extends StandardScheme<TResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ROW
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.row = iprot.readBinary();
              struct.setRowIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COLUMN_VALUES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.columnValues = new ArrayList<TColumnValue>(_list0.size);
                for (int _i1 = 0; _i1 < _list0.size; ++_i1)
                {
                  TColumnValue _elem2; // required
                  _elem2 = new TColumnValue();
                  _elem2.read(iprot);
                  struct.columnValues.add(_elem2);
                }
                iprot.readListEnd();
              }
              struct.setColumnValuesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.row != null) {
        if (struct.isSetRow()) {
          oprot.writeFieldBegin(ROW_FIELD_DESC);
          oprot.writeBinary(struct.row);
          oprot.writeFieldEnd();
        }
      }
      if (struct.columnValues != null) {
        oprot.writeFieldBegin(COLUMN_VALUES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.columnValues.size()));
          for (TColumnValue _iter3 : struct.columnValues)
          {
            _iter3.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TResultTupleSchemeFactory implements SchemeFactory {
    public TResultTupleScheme getScheme() {
      return new TResultTupleScheme();
    }
  }

  private static class TResultTupleScheme extends TupleScheme<TResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TResult struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.columnValues.size());
        for (TColumnValue _iter4 : struct.columnValues)
        {
          _iter4.write(oprot);
        }
      }
      BitSet optionals = new BitSet();
      if (struct.isSetRow()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetRow()) {
        oprot.writeBinary(struct.row);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TResult struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.columnValues = new ArrayList<TColumnValue>(_list5.size);
        for (int _i6 = 0; _i6 < _list5.size; ++_i6)
        {
          TColumnValue _elem7; // required
          _elem7 = new TColumnValue();
          _elem7.read(iprot);
          struct.columnValues.add(_elem7);
        }
      }
      struct.setColumnValuesIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.row = iprot.readBinary();
        struct.setRowIsSet(true);
      }
    }
  }

}

