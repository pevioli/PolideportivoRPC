/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package poli;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-11-04")
public class Cancha implements org.apache.thrift.TBase<Cancha, Cancha._Fields>, java.io.Serializable, Cloneable, Comparable<Cancha> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Cancha");

  private static final org.apache.thrift.protocol.TField LOCALIDAD_FIELD_DESC = new org.apache.thrift.protocol.TField("localidad", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField ID_FILIAL_FIELD_DESC = new org.apache.thrift.protocol.TField("idFilial", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField TIPO_CANCHA_FIELD_DESC = new org.apache.thrift.protocol.TField("tipoCancha", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField ID_CANCHA_FIELD_DESC = new org.apache.thrift.protocol.TField("idCancha", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField DEPORTE_FIELD_DESC = new org.apache.thrift.protocol.TField("deporte", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new CanchaStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new CanchaTupleSchemeFactory();

  public java.lang.String localidad; // required
  public int idFilial; // required
  public java.lang.String tipoCancha; // required
  public int idCancha; // required
  public java.lang.String deporte; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LOCALIDAD((short)1, "localidad"),
    ID_FILIAL((short)2, "idFilial"),
    TIPO_CANCHA((short)3, "tipoCancha"),
    ID_CANCHA((short)4, "idCancha"),
    DEPORTE((short)5, "deporte");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // LOCALIDAD
          return LOCALIDAD;
        case 2: // ID_FILIAL
          return ID_FILIAL;
        case 3: // TIPO_CANCHA
          return TIPO_CANCHA;
        case 4: // ID_CANCHA
          return ID_CANCHA;
        case 5: // DEPORTE
          return DEPORTE;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __IDFILIAL_ISSET_ID = 0;
  private static final int __IDCANCHA_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LOCALIDAD, new org.apache.thrift.meta_data.FieldMetaData("localidad", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ID_FILIAL, new org.apache.thrift.meta_data.FieldMetaData("idFilial", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TIPO_CANCHA, new org.apache.thrift.meta_data.FieldMetaData("tipoCancha", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ID_CANCHA, new org.apache.thrift.meta_data.FieldMetaData("idCancha", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.DEPORTE, new org.apache.thrift.meta_data.FieldMetaData("deporte", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Cancha.class, metaDataMap);
  }

  public Cancha() {
  }

  public Cancha(
    java.lang.String localidad,
    int idFilial,
    java.lang.String tipoCancha,
    int idCancha,
    java.lang.String deporte)
  {
    this();
    this.localidad = localidad;
    this.idFilial = idFilial;
    setIdFilialIsSet(true);
    this.tipoCancha = tipoCancha;
    this.idCancha = idCancha;
    setIdCanchaIsSet(true);
    this.deporte = deporte;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Cancha(Cancha other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetLocalidad()) {
      this.localidad = other.localidad;
    }
    this.idFilial = other.idFilial;
    if (other.isSetTipoCancha()) {
      this.tipoCancha = other.tipoCancha;
    }
    this.idCancha = other.idCancha;
    if (other.isSetDeporte()) {
      this.deporte = other.deporte;
    }
  }

  public Cancha deepCopy() {
    return new Cancha(this);
  }

  @Override
  public void clear() {
    this.localidad = null;
    setIdFilialIsSet(false);
    this.idFilial = 0;
    this.tipoCancha = null;
    setIdCanchaIsSet(false);
    this.idCancha = 0;
    this.deporte = null;
  }

  public java.lang.String getLocalidad() {
    return this.localidad;
  }

  public Cancha setLocalidad(java.lang.String localidad) {
    this.localidad = localidad;
    return this;
  }

  public void unsetLocalidad() {
    this.localidad = null;
  }

  /** Returns true if field localidad is set (has been assigned a value) and false otherwise */
  public boolean isSetLocalidad() {
    return this.localidad != null;
  }

  public void setLocalidadIsSet(boolean value) {
    if (!value) {
      this.localidad = null;
    }
  }

  public int getIdFilial() {
    return this.idFilial;
  }

  public Cancha setIdFilial(int idFilial) {
    this.idFilial = idFilial;
    setIdFilialIsSet(true);
    return this;
  }

  public void unsetIdFilial() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __IDFILIAL_ISSET_ID);
  }

  /** Returns true if field idFilial is set (has been assigned a value) and false otherwise */
  public boolean isSetIdFilial() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __IDFILIAL_ISSET_ID);
  }

  public void setIdFilialIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __IDFILIAL_ISSET_ID, value);
  }

  public java.lang.String getTipoCancha() {
    return this.tipoCancha;
  }

  public Cancha setTipoCancha(java.lang.String tipoCancha) {
    this.tipoCancha = tipoCancha;
    return this;
  }

  public void unsetTipoCancha() {
    this.tipoCancha = null;
  }

  /** Returns true if field tipoCancha is set (has been assigned a value) and false otherwise */
  public boolean isSetTipoCancha() {
    return this.tipoCancha != null;
  }

  public void setTipoCanchaIsSet(boolean value) {
    if (!value) {
      this.tipoCancha = null;
    }
  }

  public int getIdCancha() {
    return this.idCancha;
  }

  public Cancha setIdCancha(int idCancha) {
    this.idCancha = idCancha;
    setIdCanchaIsSet(true);
    return this;
  }

  public void unsetIdCancha() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __IDCANCHA_ISSET_ID);
  }

  /** Returns true if field idCancha is set (has been assigned a value) and false otherwise */
  public boolean isSetIdCancha() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __IDCANCHA_ISSET_ID);
  }

  public void setIdCanchaIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __IDCANCHA_ISSET_ID, value);
  }

  public java.lang.String getDeporte() {
    return this.deporte;
  }

  public Cancha setDeporte(java.lang.String deporte) {
    this.deporte = deporte;
    return this;
  }

  public void unsetDeporte() {
    this.deporte = null;
  }

  /** Returns true if field deporte is set (has been assigned a value) and false otherwise */
  public boolean isSetDeporte() {
    return this.deporte != null;
  }

  public void setDeporteIsSet(boolean value) {
    if (!value) {
      this.deporte = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case LOCALIDAD:
      if (value == null) {
        unsetLocalidad();
      } else {
        setLocalidad((java.lang.String)value);
      }
      break;

    case ID_FILIAL:
      if (value == null) {
        unsetIdFilial();
      } else {
        setIdFilial((java.lang.Integer)value);
      }
      break;

    case TIPO_CANCHA:
      if (value == null) {
        unsetTipoCancha();
      } else {
        setTipoCancha((java.lang.String)value);
      }
      break;

    case ID_CANCHA:
      if (value == null) {
        unsetIdCancha();
      } else {
        setIdCancha((java.lang.Integer)value);
      }
      break;

    case DEPORTE:
      if (value == null) {
        unsetDeporte();
      } else {
        setDeporte((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case LOCALIDAD:
      return getLocalidad();

    case ID_FILIAL:
      return getIdFilial();

    case TIPO_CANCHA:
      return getTipoCancha();

    case ID_CANCHA:
      return getIdCancha();

    case DEPORTE:
      return getDeporte();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case LOCALIDAD:
      return isSetLocalidad();
    case ID_FILIAL:
      return isSetIdFilial();
    case TIPO_CANCHA:
      return isSetTipoCancha();
    case ID_CANCHA:
      return isSetIdCancha();
    case DEPORTE:
      return isSetDeporte();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Cancha)
      return this.equals((Cancha)that);
    return false;
  }

  public boolean equals(Cancha that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_localidad = true && this.isSetLocalidad();
    boolean that_present_localidad = true && that.isSetLocalidad();
    if (this_present_localidad || that_present_localidad) {
      if (!(this_present_localidad && that_present_localidad))
        return false;
      if (!this.localidad.equals(that.localidad))
        return false;
    }

    boolean this_present_idFilial = true;
    boolean that_present_idFilial = true;
    if (this_present_idFilial || that_present_idFilial) {
      if (!(this_present_idFilial && that_present_idFilial))
        return false;
      if (this.idFilial != that.idFilial)
        return false;
    }

    boolean this_present_tipoCancha = true && this.isSetTipoCancha();
    boolean that_present_tipoCancha = true && that.isSetTipoCancha();
    if (this_present_tipoCancha || that_present_tipoCancha) {
      if (!(this_present_tipoCancha && that_present_tipoCancha))
        return false;
      if (!this.tipoCancha.equals(that.tipoCancha))
        return false;
    }

    boolean this_present_idCancha = true;
    boolean that_present_idCancha = true;
    if (this_present_idCancha || that_present_idCancha) {
      if (!(this_present_idCancha && that_present_idCancha))
        return false;
      if (this.idCancha != that.idCancha)
        return false;
    }

    boolean this_present_deporte = true && this.isSetDeporte();
    boolean that_present_deporte = true && that.isSetDeporte();
    if (this_present_deporte || that_present_deporte) {
      if (!(this_present_deporte && that_present_deporte))
        return false;
      if (!this.deporte.equals(that.deporte))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetLocalidad()) ? 131071 : 524287);
    if (isSetLocalidad())
      hashCode = hashCode * 8191 + localidad.hashCode();

    hashCode = hashCode * 8191 + idFilial;

    hashCode = hashCode * 8191 + ((isSetTipoCancha()) ? 131071 : 524287);
    if (isSetTipoCancha())
      hashCode = hashCode * 8191 + tipoCancha.hashCode();

    hashCode = hashCode * 8191 + idCancha;

    hashCode = hashCode * 8191 + ((isSetDeporte()) ? 131071 : 524287);
    if (isSetDeporte())
      hashCode = hashCode * 8191 + deporte.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(Cancha other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetLocalidad()).compareTo(other.isSetLocalidad());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLocalidad()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.localidad, other.localidad);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetIdFilial()).compareTo(other.isSetIdFilial());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIdFilial()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.idFilial, other.idFilial);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTipoCancha()).compareTo(other.isSetTipoCancha());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTipoCancha()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tipoCancha, other.tipoCancha);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetIdCancha()).compareTo(other.isSetIdCancha());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIdCancha()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.idCancha, other.idCancha);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetDeporte()).compareTo(other.isSetDeporte());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDeporte()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.deporte, other.deporte);
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
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Cancha(");
    boolean first = true;

    sb.append("localidad:");
    if (this.localidad == null) {
      sb.append("null");
    } else {
      sb.append(this.localidad);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("idFilial:");
    sb.append(this.idFilial);
    first = false;
    if (!first) sb.append(", ");
    sb.append("tipoCancha:");
    if (this.tipoCancha == null) {
      sb.append("null");
    } else {
      sb.append(this.tipoCancha);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("idCancha:");
    sb.append(this.idCancha);
    first = false;
    if (!first) sb.append(", ");
    sb.append("deporte:");
    if (this.deporte == null) {
      sb.append("null");
    } else {
      sb.append(this.deporte);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class CanchaStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public CanchaStandardScheme getScheme() {
      return new CanchaStandardScheme();
    }
  }

  private static class CanchaStandardScheme extends org.apache.thrift.scheme.StandardScheme<Cancha> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Cancha struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // LOCALIDAD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.localidad = iprot.readString();
              struct.setLocalidadIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ID_FILIAL
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.idFilial = iprot.readI32();
              struct.setIdFilialIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TIPO_CANCHA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tipoCancha = iprot.readString();
              struct.setTipoCanchaIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ID_CANCHA
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.idCancha = iprot.readI32();
              struct.setIdCanchaIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // DEPORTE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.deporte = iprot.readString();
              struct.setDeporteIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Cancha struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.localidad != null) {
        oprot.writeFieldBegin(LOCALIDAD_FIELD_DESC);
        oprot.writeString(struct.localidad);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(ID_FILIAL_FIELD_DESC);
      oprot.writeI32(struct.idFilial);
      oprot.writeFieldEnd();
      if (struct.tipoCancha != null) {
        oprot.writeFieldBegin(TIPO_CANCHA_FIELD_DESC);
        oprot.writeString(struct.tipoCancha);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(ID_CANCHA_FIELD_DESC);
      oprot.writeI32(struct.idCancha);
      oprot.writeFieldEnd();
      if (struct.deporte != null) {
        oprot.writeFieldBegin(DEPORTE_FIELD_DESC);
        oprot.writeString(struct.deporte);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CanchaTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public CanchaTupleScheme getScheme() {
      return new CanchaTupleScheme();
    }
  }

  private static class CanchaTupleScheme extends org.apache.thrift.scheme.TupleScheme<Cancha> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Cancha struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetLocalidad()) {
        optionals.set(0);
      }
      if (struct.isSetIdFilial()) {
        optionals.set(1);
      }
      if (struct.isSetTipoCancha()) {
        optionals.set(2);
      }
      if (struct.isSetIdCancha()) {
        optionals.set(3);
      }
      if (struct.isSetDeporte()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetLocalidad()) {
        oprot.writeString(struct.localidad);
      }
      if (struct.isSetIdFilial()) {
        oprot.writeI32(struct.idFilial);
      }
      if (struct.isSetTipoCancha()) {
        oprot.writeString(struct.tipoCancha);
      }
      if (struct.isSetIdCancha()) {
        oprot.writeI32(struct.idCancha);
      }
      if (struct.isSetDeporte()) {
        oprot.writeString(struct.deporte);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Cancha struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.localidad = iprot.readString();
        struct.setLocalidadIsSet(true);
      }
      if (incoming.get(1)) {
        struct.idFilial = iprot.readI32();
        struct.setIdFilialIsSet(true);
      }
      if (incoming.get(2)) {
        struct.tipoCancha = iprot.readString();
        struct.setTipoCanchaIsSet(true);
      }
      if (incoming.get(3)) {
        struct.idCancha = iprot.readI32();
        struct.setIdCanchaIsSet(true);
      }
      if (incoming.get(4)) {
        struct.deporte = iprot.readString();
        struct.setDeporteIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

