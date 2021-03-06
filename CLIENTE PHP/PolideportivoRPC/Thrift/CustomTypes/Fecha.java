/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package ejemplo;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-10-15")
public class Fecha implements org.apache.thrift.TBase<Fecha, Fecha._Fields>, java.io.Serializable, Cloneable, Comparable<Fecha> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Fecha");

  private static final org.apache.thrift.protocol.TField DIA_FIELD_DESC = new org.apache.thrift.protocol.TField("dia", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField MES_FIELD_DESC = new org.apache.thrift.protocol.TField("mes", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField ANIO_FIELD_DESC = new org.apache.thrift.protocol.TField("anio", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new FechaStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new FechaTupleSchemeFactory();

  public int dia; // required
  public int mes; // required
  public int anio; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DIA((short)1, "dia"),
    MES((short)2, "mes"),
    ANIO((short)3, "anio");

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
        case 1: // DIA
          return DIA;
        case 2: // MES
          return MES;
        case 3: // ANIO
          return ANIO;
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
  private static final int __DIA_ISSET_ID = 0;
  private static final int __MES_ISSET_ID = 1;
  private static final int __ANIO_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DIA, new org.apache.thrift.meta_data.FieldMetaData("dia", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.MES, new org.apache.thrift.meta_data.FieldMetaData("mes", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.ANIO, new org.apache.thrift.meta_data.FieldMetaData("anio", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Fecha.class, metaDataMap);
  }

  public Fecha() {
  }

  public Fecha(
    int dia,
    int mes,
    int anio)
  {
    this();
    this.dia = dia;
    setDiaIsSet(true);
    this.mes = mes;
    setMesIsSet(true);
    this.anio = anio;
    setAnioIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Fecha(Fecha other) {
    __isset_bitfield = other.__isset_bitfield;
    this.dia = other.dia;
    this.mes = other.mes;
    this.anio = other.anio;
  }

  public Fecha deepCopy() {
    return new Fecha(this);
  }

  @Override
  public void clear() {
    setDiaIsSet(false);
    this.dia = 0;
    setMesIsSet(false);
    this.mes = 0;
    setAnioIsSet(false);
    this.anio = 0;
  }

  public int getDia() {
    return this.dia;
  }

  public Fecha setDia(int dia) {
    this.dia = dia;
    setDiaIsSet(true);
    return this;
  }

  public void unsetDia() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __DIA_ISSET_ID);
  }

  /** Returns true if field dia is set (has been assigned a value) and false otherwise */
  public boolean isSetDia() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __DIA_ISSET_ID);
  }

  public void setDiaIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __DIA_ISSET_ID, value);
  }

  public int getMes() {
    return this.mes;
  }

  public Fecha setMes(int mes) {
    this.mes = mes;
    setMesIsSet(true);
    return this;
  }

  public void unsetMes() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __MES_ISSET_ID);
  }

  /** Returns true if field mes is set (has been assigned a value) and false otherwise */
  public boolean isSetMes() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __MES_ISSET_ID);
  }

  public void setMesIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __MES_ISSET_ID, value);
  }

  public int getAnio() {
    return this.anio;
  }

  public Fecha setAnio(int anio) {
    this.anio = anio;
    setAnioIsSet(true);
    return this;
  }

  public void unsetAnio() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ANIO_ISSET_ID);
  }

  /** Returns true if field anio is set (has been assigned a value) and false otherwise */
  public boolean isSetAnio() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ANIO_ISSET_ID);
  }

  public void setAnioIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ANIO_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case DIA:
      if (value == null) {
        unsetDia();
      } else {
        setDia((java.lang.Integer)value);
      }
      break;

    case MES:
      if (value == null) {
        unsetMes();
      } else {
        setMes((java.lang.Integer)value);
      }
      break;

    case ANIO:
      if (value == null) {
        unsetAnio();
      } else {
        setAnio((java.lang.Integer)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case DIA:
      return getDia();

    case MES:
      return getMes();

    case ANIO:
      return getAnio();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case DIA:
      return isSetDia();
    case MES:
      return isSetMes();
    case ANIO:
      return isSetAnio();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Fecha)
      return this.equals((Fecha)that);
    return false;
  }

  public boolean equals(Fecha that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_dia = true;
    boolean that_present_dia = true;
    if (this_present_dia || that_present_dia) {
      if (!(this_present_dia && that_present_dia))
        return false;
      if (this.dia != that.dia)
        return false;
    }

    boolean this_present_mes = true;
    boolean that_present_mes = true;
    if (this_present_mes || that_present_mes) {
      if (!(this_present_mes && that_present_mes))
        return false;
      if (this.mes != that.mes)
        return false;
    }

    boolean this_present_anio = true;
    boolean that_present_anio = true;
    if (this_present_anio || that_present_anio) {
      if (!(this_present_anio && that_present_anio))
        return false;
      if (this.anio != that.anio)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + dia;

    hashCode = hashCode * 8191 + mes;

    hashCode = hashCode * 8191 + anio;

    return hashCode;
  }

  @Override
  public int compareTo(Fecha other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetDia()).compareTo(other.isSetDia());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDia()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dia, other.dia);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetMes()).compareTo(other.isSetMes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mes, other.mes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAnio()).compareTo(other.isSetAnio());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAnio()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.anio, other.anio);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Fecha(");
    boolean first = true;

    sb.append("dia:");
    sb.append(this.dia);
    first = false;
    if (!first) sb.append(", ");
    sb.append("mes:");
    sb.append(this.mes);
    first = false;
    if (!first) sb.append(", ");
    sb.append("anio:");
    sb.append(this.anio);
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

  private static class FechaStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public FechaStandardScheme getScheme() {
      return new FechaStandardScheme();
    }
  }

  private static class FechaStandardScheme extends org.apache.thrift.scheme.StandardScheme<Fecha> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Fecha struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DIA
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.dia = iprot.readI32();
              struct.setDiaIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MES
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.mes = iprot.readI32();
              struct.setMesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ANIO
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.anio = iprot.readI32();
              struct.setAnioIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Fecha struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(DIA_FIELD_DESC);
      oprot.writeI32(struct.dia);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(MES_FIELD_DESC);
      oprot.writeI32(struct.mes);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ANIO_FIELD_DESC);
      oprot.writeI32(struct.anio);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class FechaTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public FechaTupleScheme getScheme() {
      return new FechaTupleScheme();
    }
  }

  private static class FechaTupleScheme extends org.apache.thrift.scheme.TupleScheme<Fecha> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Fecha struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetDia()) {
        optionals.set(0);
      }
      if (struct.isSetMes()) {
        optionals.set(1);
      }
      if (struct.isSetAnio()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetDia()) {
        oprot.writeI32(struct.dia);
      }
      if (struct.isSetMes()) {
        oprot.writeI32(struct.mes);
      }
      if (struct.isSetAnio()) {
        oprot.writeI32(struct.anio);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Fecha struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.dia = iprot.readI32();
        struct.setDiaIsSet(true);
      }
      if (incoming.get(1)) {
        struct.mes = iprot.readI32();
        struct.setMesIsSet(true);
      }
      if (incoming.get(2)) {
        struct.anio = iprot.readI32();
        struct.setAnioIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

