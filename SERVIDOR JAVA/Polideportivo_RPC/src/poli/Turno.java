/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package poli;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-11-04")
public class Turno implements org.apache.thrift.TBase<Turno, Turno._Fields>, java.io.Serializable, Cloneable, Comparable<Turno> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Turno");

  private static final org.apache.thrift.protocol.TField ID_TURNO_FIELD_DESC = new org.apache.thrift.protocol.TField("idTurno", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField FECHA_HORA_FIELD_DESC = new org.apache.thrift.protocol.TField("fechaHora", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField VIGENTE_FIELD_DESC = new org.apache.thrift.protocol.TField("vigente", org.apache.thrift.protocol.TType.BOOL, (short)3);
  private static final org.apache.thrift.protocol.TField LOCALIDAD_FIELD_DESC = new org.apache.thrift.protocol.TField("localidad", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField DEPORTE_FIELD_DESC = new org.apache.thrift.protocol.TField("deporte", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField TIPO_CANCHA_FIELD_DESC = new org.apache.thrift.protocol.TField("tipoCancha", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField APELLIDO_FIELD_DESC = new org.apache.thrift.protocol.TField("apellido", org.apache.thrift.protocol.TType.STRING, (short)7);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TurnoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TurnoTupleSchemeFactory();

  public int idTurno; // required
  public java.lang.String fechaHora; // required
  public boolean vigente; // required
  public java.lang.String localidad; // required
  public java.lang.String deporte; // required
  public java.lang.String tipoCancha; // required
  public java.lang.String apellido; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID_TURNO((short)1, "idTurno"),
    FECHA_HORA((short)2, "fechaHora"),
    VIGENTE((short)3, "vigente"),
    LOCALIDAD((short)4, "localidad"),
    DEPORTE((short)5, "deporte"),
    TIPO_CANCHA((short)6, "tipoCancha"),
    APELLIDO((short)7, "apellido");

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
        case 1: // ID_TURNO
          return ID_TURNO;
        case 2: // FECHA_HORA
          return FECHA_HORA;
        case 3: // VIGENTE
          return VIGENTE;
        case 4: // LOCALIDAD
          return LOCALIDAD;
        case 5: // DEPORTE
          return DEPORTE;
        case 6: // TIPO_CANCHA
          return TIPO_CANCHA;
        case 7: // APELLIDO
          return APELLIDO;
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
  private static final int __IDTURNO_ISSET_ID = 0;
  private static final int __VIGENTE_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID_TURNO, new org.apache.thrift.meta_data.FieldMetaData("idTurno", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.FECHA_HORA, new org.apache.thrift.meta_data.FieldMetaData("fechaHora", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.VIGENTE, new org.apache.thrift.meta_data.FieldMetaData("vigente", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.LOCALIDAD, new org.apache.thrift.meta_data.FieldMetaData("localidad", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DEPORTE, new org.apache.thrift.meta_data.FieldMetaData("deporte", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TIPO_CANCHA, new org.apache.thrift.meta_data.FieldMetaData("tipoCancha", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.APELLIDO, new org.apache.thrift.meta_data.FieldMetaData("apellido", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Turno.class, metaDataMap);
  }

  public Turno() {
  }

  public Turno(
    int idTurno,
    java.lang.String fechaHora,
    boolean vigente,
    java.lang.String localidad,
    java.lang.String deporte,
    java.lang.String tipoCancha,
    java.lang.String apellido)
  {
    this();
    this.idTurno = idTurno;
    setIdTurnoIsSet(true);
    this.fechaHora = fechaHora;
    this.vigente = vigente;
    setVigenteIsSet(true);
    this.localidad = localidad;
    this.deporte = deporte;
    this.tipoCancha = tipoCancha;
    this.apellido = apellido;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Turno(Turno other) {
    __isset_bitfield = other.__isset_bitfield;
    this.idTurno = other.idTurno;
    if (other.isSetFechaHora()) {
      this.fechaHora = other.fechaHora;
    }
    this.vigente = other.vigente;
    if (other.isSetLocalidad()) {
      this.localidad = other.localidad;
    }
    if (other.isSetDeporte()) {
      this.deporte = other.deporte;
    }
    if (other.isSetTipoCancha()) {
      this.tipoCancha = other.tipoCancha;
    }
    if (other.isSetApellido()) {
      this.apellido = other.apellido;
    }
  }

  public Turno deepCopy() {
    return new Turno(this);
  }

  @Override
  public void clear() {
    setIdTurnoIsSet(false);
    this.idTurno = 0;
    this.fechaHora = null;
    setVigenteIsSet(false);
    this.vigente = false;
    this.localidad = null;
    this.deporte = null;
    this.tipoCancha = null;
    this.apellido = null;
  }

  public int getIdTurno() {
    return this.idTurno;
  }

  public Turno setIdTurno(int idTurno) {
    this.idTurno = idTurno;
    setIdTurnoIsSet(true);
    return this;
  }

  public void unsetIdTurno() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __IDTURNO_ISSET_ID);
  }

  /** Returns true if field idTurno is set (has been assigned a value) and false otherwise */
  public boolean isSetIdTurno() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __IDTURNO_ISSET_ID);
  }

  public void setIdTurnoIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __IDTURNO_ISSET_ID, value);
  }

  public java.lang.String getFechaHora() {
    return this.fechaHora;
  }

  public Turno setFechaHora(java.lang.String fechaHora) {
    this.fechaHora = fechaHora;
    return this;
  }

  public void unsetFechaHora() {
    this.fechaHora = null;
  }

  /** Returns true if field fechaHora is set (has been assigned a value) and false otherwise */
  public boolean isSetFechaHora() {
    return this.fechaHora != null;
  }

  public void setFechaHoraIsSet(boolean value) {
    if (!value) {
      this.fechaHora = null;
    }
  }

  public boolean isVigente() {
    return this.vigente;
  }

  public Turno setVigente(boolean vigente) {
    this.vigente = vigente;
    setVigenteIsSet(true);
    return this;
  }

  public void unsetVigente() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __VIGENTE_ISSET_ID);
  }

  /** Returns true if field vigente is set (has been assigned a value) and false otherwise */
  public boolean isSetVigente() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __VIGENTE_ISSET_ID);
  }

  public void setVigenteIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __VIGENTE_ISSET_ID, value);
  }

  public java.lang.String getLocalidad() {
    return this.localidad;
  }

  public Turno setLocalidad(java.lang.String localidad) {
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

  public java.lang.String getDeporte() {
    return this.deporte;
  }

  public Turno setDeporte(java.lang.String deporte) {
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

  public java.lang.String getTipoCancha() {
    return this.tipoCancha;
  }

  public Turno setTipoCancha(java.lang.String tipoCancha) {
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

  public java.lang.String getApellido() {
    return this.apellido;
  }

  public Turno setApellido(java.lang.String apellido) {
    this.apellido = apellido;
    return this;
  }

  public void unsetApellido() {
    this.apellido = null;
  }

  /** Returns true if field apellido is set (has been assigned a value) and false otherwise */
  public boolean isSetApellido() {
    return this.apellido != null;
  }

  public void setApellidoIsSet(boolean value) {
    if (!value) {
      this.apellido = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case ID_TURNO:
      if (value == null) {
        unsetIdTurno();
      } else {
        setIdTurno((java.lang.Integer)value);
      }
      break;

    case FECHA_HORA:
      if (value == null) {
        unsetFechaHora();
      } else {
        setFechaHora((java.lang.String)value);
      }
      break;

    case VIGENTE:
      if (value == null) {
        unsetVigente();
      } else {
        setVigente((java.lang.Boolean)value);
      }
      break;

    case LOCALIDAD:
      if (value == null) {
        unsetLocalidad();
      } else {
        setLocalidad((java.lang.String)value);
      }
      break;

    case DEPORTE:
      if (value == null) {
        unsetDeporte();
      } else {
        setDeporte((java.lang.String)value);
      }
      break;

    case TIPO_CANCHA:
      if (value == null) {
        unsetTipoCancha();
      } else {
        setTipoCancha((java.lang.String)value);
      }
      break;

    case APELLIDO:
      if (value == null) {
        unsetApellido();
      } else {
        setApellido((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ID_TURNO:
      return getIdTurno();

    case FECHA_HORA:
      return getFechaHora();

    case VIGENTE:
      return isVigente();

    case LOCALIDAD:
      return getLocalidad();

    case DEPORTE:
      return getDeporte();

    case TIPO_CANCHA:
      return getTipoCancha();

    case APELLIDO:
      return getApellido();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ID_TURNO:
      return isSetIdTurno();
    case FECHA_HORA:
      return isSetFechaHora();
    case VIGENTE:
      return isSetVigente();
    case LOCALIDAD:
      return isSetLocalidad();
    case DEPORTE:
      return isSetDeporte();
    case TIPO_CANCHA:
      return isSetTipoCancha();
    case APELLIDO:
      return isSetApellido();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Turno)
      return this.equals((Turno)that);
    return false;
  }

  public boolean equals(Turno that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_idTurno = true;
    boolean that_present_idTurno = true;
    if (this_present_idTurno || that_present_idTurno) {
      if (!(this_present_idTurno && that_present_idTurno))
        return false;
      if (this.idTurno != that.idTurno)
        return false;
    }

    boolean this_present_fechaHora = true && this.isSetFechaHora();
    boolean that_present_fechaHora = true && that.isSetFechaHora();
    if (this_present_fechaHora || that_present_fechaHora) {
      if (!(this_present_fechaHora && that_present_fechaHora))
        return false;
      if (!this.fechaHora.equals(that.fechaHora))
        return false;
    }

    boolean this_present_vigente = true;
    boolean that_present_vigente = true;
    if (this_present_vigente || that_present_vigente) {
      if (!(this_present_vigente && that_present_vigente))
        return false;
      if (this.vigente != that.vigente)
        return false;
    }

    boolean this_present_localidad = true && this.isSetLocalidad();
    boolean that_present_localidad = true && that.isSetLocalidad();
    if (this_present_localidad || that_present_localidad) {
      if (!(this_present_localidad && that_present_localidad))
        return false;
      if (!this.localidad.equals(that.localidad))
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

    boolean this_present_tipoCancha = true && this.isSetTipoCancha();
    boolean that_present_tipoCancha = true && that.isSetTipoCancha();
    if (this_present_tipoCancha || that_present_tipoCancha) {
      if (!(this_present_tipoCancha && that_present_tipoCancha))
        return false;
      if (!this.tipoCancha.equals(that.tipoCancha))
        return false;
    }

    boolean this_present_apellido = true && this.isSetApellido();
    boolean that_present_apellido = true && that.isSetApellido();
    if (this_present_apellido || that_present_apellido) {
      if (!(this_present_apellido && that_present_apellido))
        return false;
      if (!this.apellido.equals(that.apellido))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + idTurno;

    hashCode = hashCode * 8191 + ((isSetFechaHora()) ? 131071 : 524287);
    if (isSetFechaHora())
      hashCode = hashCode * 8191 + fechaHora.hashCode();

    hashCode = hashCode * 8191 + ((vigente) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetLocalidad()) ? 131071 : 524287);
    if (isSetLocalidad())
      hashCode = hashCode * 8191 + localidad.hashCode();

    hashCode = hashCode * 8191 + ((isSetDeporte()) ? 131071 : 524287);
    if (isSetDeporte())
      hashCode = hashCode * 8191 + deporte.hashCode();

    hashCode = hashCode * 8191 + ((isSetTipoCancha()) ? 131071 : 524287);
    if (isSetTipoCancha())
      hashCode = hashCode * 8191 + tipoCancha.hashCode();

    hashCode = hashCode * 8191 + ((isSetApellido()) ? 131071 : 524287);
    if (isSetApellido())
      hashCode = hashCode * 8191 + apellido.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(Turno other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetIdTurno()).compareTo(other.isSetIdTurno());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIdTurno()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.idTurno, other.idTurno);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetFechaHora()).compareTo(other.isSetFechaHora());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFechaHora()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fechaHora, other.fechaHora);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetVigente()).compareTo(other.isSetVigente());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVigente()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.vigente, other.vigente);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
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
    lastComparison = java.lang.Boolean.valueOf(isSetApellido()).compareTo(other.isSetApellido());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetApellido()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.apellido, other.apellido);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Turno(");
    boolean first = true;

    sb.append("idTurno:");
    sb.append(this.idTurno);
    first = false;
    if (!first) sb.append(", ");
    sb.append("fechaHora:");
    if (this.fechaHora == null) {
      sb.append("null");
    } else {
      sb.append(this.fechaHora);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("vigente:");
    sb.append(this.vigente);
    first = false;
    if (!first) sb.append(", ");
    sb.append("localidad:");
    if (this.localidad == null) {
      sb.append("null");
    } else {
      sb.append(this.localidad);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("deporte:");
    if (this.deporte == null) {
      sb.append("null");
    } else {
      sb.append(this.deporte);
    }
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
    sb.append("apellido:");
    if (this.apellido == null) {
      sb.append("null");
    } else {
      sb.append(this.apellido);
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

  private static class TurnoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TurnoStandardScheme getScheme() {
      return new TurnoStandardScheme();
    }
  }

  private static class TurnoStandardScheme extends org.apache.thrift.scheme.StandardScheme<Turno> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Turno struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID_TURNO
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.idTurno = iprot.readI32();
              struct.setIdTurnoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FECHA_HORA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.fechaHora = iprot.readString();
              struct.setFechaHoraIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // VIGENTE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.vigente = iprot.readBool();
              struct.setVigenteIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // LOCALIDAD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.localidad = iprot.readString();
              struct.setLocalidadIsSet(true);
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
          case 6: // TIPO_CANCHA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tipoCancha = iprot.readString();
              struct.setTipoCanchaIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // APELLIDO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.apellido = iprot.readString();
              struct.setApellidoIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Turno struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ID_TURNO_FIELD_DESC);
      oprot.writeI32(struct.idTurno);
      oprot.writeFieldEnd();
      if (struct.fechaHora != null) {
        oprot.writeFieldBegin(FECHA_HORA_FIELD_DESC);
        oprot.writeString(struct.fechaHora);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(VIGENTE_FIELD_DESC);
      oprot.writeBool(struct.vigente);
      oprot.writeFieldEnd();
      if (struct.localidad != null) {
        oprot.writeFieldBegin(LOCALIDAD_FIELD_DESC);
        oprot.writeString(struct.localidad);
        oprot.writeFieldEnd();
      }
      if (struct.deporte != null) {
        oprot.writeFieldBegin(DEPORTE_FIELD_DESC);
        oprot.writeString(struct.deporte);
        oprot.writeFieldEnd();
      }
      if (struct.tipoCancha != null) {
        oprot.writeFieldBegin(TIPO_CANCHA_FIELD_DESC);
        oprot.writeString(struct.tipoCancha);
        oprot.writeFieldEnd();
      }
      if (struct.apellido != null) {
        oprot.writeFieldBegin(APELLIDO_FIELD_DESC);
        oprot.writeString(struct.apellido);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TurnoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TurnoTupleScheme getScheme() {
      return new TurnoTupleScheme();
    }
  }

  private static class TurnoTupleScheme extends org.apache.thrift.scheme.TupleScheme<Turno> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Turno struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetIdTurno()) {
        optionals.set(0);
      }
      if (struct.isSetFechaHora()) {
        optionals.set(1);
      }
      if (struct.isSetVigente()) {
        optionals.set(2);
      }
      if (struct.isSetLocalidad()) {
        optionals.set(3);
      }
      if (struct.isSetDeporte()) {
        optionals.set(4);
      }
      if (struct.isSetTipoCancha()) {
        optionals.set(5);
      }
      if (struct.isSetApellido()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetIdTurno()) {
        oprot.writeI32(struct.idTurno);
      }
      if (struct.isSetFechaHora()) {
        oprot.writeString(struct.fechaHora);
      }
      if (struct.isSetVigente()) {
        oprot.writeBool(struct.vigente);
      }
      if (struct.isSetLocalidad()) {
        oprot.writeString(struct.localidad);
      }
      if (struct.isSetDeporte()) {
        oprot.writeString(struct.deporte);
      }
      if (struct.isSetTipoCancha()) {
        oprot.writeString(struct.tipoCancha);
      }
      if (struct.isSetApellido()) {
        oprot.writeString(struct.apellido);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Turno struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.idTurno = iprot.readI32();
        struct.setIdTurnoIsSet(true);
      }
      if (incoming.get(1)) {
        struct.fechaHora = iprot.readString();
        struct.setFechaHoraIsSet(true);
      }
      if (incoming.get(2)) {
        struct.vigente = iprot.readBool();
        struct.setVigenteIsSet(true);
      }
      if (incoming.get(3)) {
        struct.localidad = iprot.readString();
        struct.setLocalidadIsSet(true);
      }
      if (incoming.get(4)) {
        struct.deporte = iprot.readString();
        struct.setDeporteIsSet(true);
      }
      if (incoming.get(5)) {
        struct.tipoCancha = iprot.readString();
        struct.setTipoCanchaIsSet(true);
      }
      if (incoming.get(6)) {
        struct.apellido = iprot.readString();
        struct.setApellidoIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
