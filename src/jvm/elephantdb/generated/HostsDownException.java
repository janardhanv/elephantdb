/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package elephantdb.generated;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.thrift.*;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.protocol.*;

import java.util.*;

public class HostsDownException extends Exception implements TBase<HostsDownException, HostsDownException._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("HostsDownException");

  private static final TField HOSTS_FIELD_DESC = new TField("hosts", TType.LIST, (short)1);

  private List<String> hosts;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    HOSTS((short)1, "hosts");

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
        case 1: // HOSTS
          return HOSTS;
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

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.HOSTS, new FieldMetaData("hosts", TFieldRequirementType.REQUIRED, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(HostsDownException.class, metaDataMap);
  }

  public HostsDownException() {
  }

  public HostsDownException(
    List<String> hosts)
  {
    this();
    this.hosts = hosts;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public HostsDownException(HostsDownException other) {
    if (other.is_set_hosts()) {
      List<String> __this__hosts = new ArrayList<String>();
      for (String other_element : other.hosts) {
        __this__hosts.add(other_element);
      }
      this.hosts = __this__hosts;
    }
  }

  public HostsDownException deepCopy() {
    return new HostsDownException(this);
  }

  @Deprecated
  public HostsDownException clone() {
    return new HostsDownException(this);
  }

  public int get_hosts_size() {
    return (this.hosts == null) ? 0 : this.hosts.size();
  }

  public java.util.Iterator<String> get_hosts_iterator() {
    return (this.hosts == null) ? null : this.hosts.iterator();
  }

  public void add_to_hosts(String elem) {
    if (this.hosts == null) {
      this.hosts = new ArrayList<String>();
    }
    this.hosts.add(elem);
  }

  public List<String> get_hosts() {
    return this.hosts;
  }

  public void set_hosts(List<String> hosts) {
    this.hosts = hosts;
  }

  public void unset_hosts() {
    this.hosts = null;
  }

  /** Returns true if field hosts is set (has been asigned a value) and false otherwise */
  public boolean is_set_hosts() {
    return this.hosts != null;
  }

  public void set_hosts_isSet(boolean value) {
    if (!value) {
      this.hosts = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case HOSTS:
      if (value == null) {
        unset_hosts();
      } else {
        set_hosts((List<String>)value);
      }
      break;

    }
  }

  public void setFieldValue(int fieldID, Object value) {
    setFieldValue(_Fields.findByThriftIdOrThrow(fieldID), value);
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case HOSTS:
      return get_hosts();

    }
    throw new IllegalStateException();
  }

  public Object getFieldValue(int fieldId) {
    return getFieldValue(_Fields.findByThriftIdOrThrow(fieldId));
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    switch (field) {
    case HOSTS:
      return is_set_hosts();
    }
    throw new IllegalStateException();
  }

  public boolean isSet(int fieldID) {
    return isSet(_Fields.findByThriftIdOrThrow(fieldID));
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof HostsDownException)
      return this.equals((HostsDownException)that);
    return false;
  }

  public boolean equals(HostsDownException that) {
    if (that == null)
      return false;

    boolean this_present_hosts = true && this.is_set_hosts();
    boolean that_present_hosts = true && that.is_set_hosts();
    if (this_present_hosts || that_present_hosts) {
      if (!(this_present_hosts && that_present_hosts))
        return false;
      if (!this.hosts.equals(that.hosts))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_hosts = true && (is_set_hosts());
    builder.append(present_hosts);
    if (present_hosts)
      builder.append(hosts);

    return builder.toHashCode();
  }

  public int compareTo(HostsDownException other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    HostsDownException typedOther = (HostsDownException)other;

    lastComparison = Boolean.valueOf(is_set_hosts()).compareTo(typedOther.is_set_hosts());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_hosts()) {      lastComparison = TBaseHelper.compareTo(this.hosts, typedOther.hosts);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // HOSTS
          if (field.type == TType.LIST) {
            {
              TList _list5 = iprot.readListBegin();
              this.hosts = new ArrayList<String>(_list5.size);
              for (int _i6 = 0; _i6 < _list5.size; ++_i6)
              {
                String _elem7;
                _elem7 = iprot.readString();
                this.hosts.add(_elem7);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.hosts != null) {
      oprot.writeFieldBegin(HOSTS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRING, this.hosts.size()));
        for (String _iter8 : this.hosts)
        {
          oprot.writeString(_iter8);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("HostsDownException(");
    boolean first = true;

    sb.append("hosts:");
    if (this.hosts == null) {
      sb.append("null");
    } else {
      sb.append(this.hosts);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    if (!is_set_hosts()) {
      throw new TProtocolException("Required field 'hosts' is unset! Struct:" + toString());
    }

  }

}

