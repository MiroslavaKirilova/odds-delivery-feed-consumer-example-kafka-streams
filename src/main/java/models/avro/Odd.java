/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package models.avro;

import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;

@org.apache.avro.specific.AvroGenerated
public class Odd extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 5035660172631341298L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Odd\",\"namespace\":\"models.avro\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"key\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"value\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"isValid\",\"type\":[\"null\",\"int\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Odd> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Odd> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Odd> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Odd> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Odd> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Odd to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Odd from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Odd instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Odd fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private CharSequence id;
  private CharSequence key;
  private Double value;
  private Integer isValid;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Odd() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param key The new value for key
   * @param value The new value for value
   * @param isValid The new value for isValid
   */
  public Odd(CharSequence id, CharSequence key, Double value, Integer isValid) {
    this.id = id;
    this.key = key;
    this.value = value;
    this.isValid = isValid;
  }

  @Override
  public SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return key;
    case 2: return value;
    case 3: return isValid;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: id = (CharSequence)value$; break;
    case 1: key = (CharSequence)value$; break;
    case 2: value = (Double)value$; break;
    case 3: isValid = (Integer)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public CharSequence getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'key' field.
   * @return The value of the 'key' field.
   */
  public CharSequence getKey() {
    return key;
  }


  /**
   * Sets the value of the 'key' field.
   * @param value the value to set.
   */
  public void setKey(CharSequence value) {
    this.key = value;
  }

  /**
   * Gets the value of the 'value' field.
   * @return The value of the 'value' field.
   */
  public Double getValue() {
    return value;
  }


  /**
   * Sets the value of the 'value' field.
   * @param value the value to set.
   */
  public void setValue(Double value) {
    this.value = value;
  }

  /**
   * Gets the value of the 'isValid' field.
   * @return The value of the 'isValid' field.
   */
  public Integer getIsValid() {
    return isValid;
  }


  /**
   * Sets the value of the 'isValid' field.
   * @param value the value to set.
   */
  public void setIsValid(Integer value) {
    this.isValid = value;
  }

  /**
   * Creates a new Odd RecordBuilder.
   * @return A new Odd RecordBuilder
   */
  public static models.avro.Odd.Builder newBuilder() {
    return new models.avro.Odd.Builder();
  }

  /**
   * Creates a new Odd RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Odd RecordBuilder
   */
  public static models.avro.Odd.Builder newBuilder(models.avro.Odd.Builder other) {
    if (other == null) {
      return new models.avro.Odd.Builder();
    } else {
      return new models.avro.Odd.Builder(other);
    }
  }

  /**
   * Creates a new Odd RecordBuilder by copying an existing Odd instance.
   * @param other The existing instance to copy.
   * @return A new Odd RecordBuilder
   */
  public static models.avro.Odd.Builder newBuilder(models.avro.Odd other) {
    if (other == null) {
      return new models.avro.Odd.Builder();
    } else {
      return new models.avro.Odd.Builder(other);
    }
  }

  /**
   * RecordBuilder for Odd instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Odd>
    implements org.apache.avro.data.RecordBuilder<Odd> {

    private CharSequence id;
    private CharSequence key;
    private Double value;
    private Integer isValid;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(models.avro.Odd.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.key)) {
        this.key = data().deepCopy(fields()[1].schema(), other.key);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.value)) {
        this.value = data().deepCopy(fields()[2].schema(), other.value);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.isValid)) {
        this.isValid = data().deepCopy(fields()[3].schema(), other.isValid);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing Odd instance
     * @param other The existing instance to copy.
     */
    private Builder(models.avro.Odd other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.key)) {
        this.key = data().deepCopy(fields()[1].schema(), other.key);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.value)) {
        this.value = data().deepCopy(fields()[2].schema(), other.value);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.isValid)) {
        this.isValid = data().deepCopy(fields()[3].schema(), other.isValid);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public CharSequence getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public models.avro.Odd.Builder setId(CharSequence value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public models.avro.Odd.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'key' field.
      * @return The value.
      */
    public CharSequence getKey() {
      return key;
    }


    /**
      * Sets the value of the 'key' field.
      * @param value The value of 'key'.
      * @return This builder.
      */
    public models.avro.Odd.Builder setKey(CharSequence value) {
      validate(fields()[1], value);
      this.key = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'key' field has been set.
      * @return True if the 'key' field has been set, false otherwise.
      */
    public boolean hasKey() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'key' field.
      * @return This builder.
      */
    public models.avro.Odd.Builder clearKey() {
      key = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'value' field.
      * @return The value.
      */
    public Double getValue() {
      return value;
    }


    /**
      * Sets the value of the 'value' field.
      * @param value The value of 'value'.
      * @return This builder.
      */
    public models.avro.Odd.Builder setValue(Double value) {
      validate(fields()[2], value);
      this.value = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'value' field has been set.
      * @return True if the 'value' field has been set, false otherwise.
      */
    public boolean hasValue() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'value' field.
      * @return This builder.
      */
    public models.avro.Odd.Builder clearValue() {
      value = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'isValid' field.
      * @return The value.
      */
    public Integer getIsValid() {
      return isValid;
    }


    /**
      * Sets the value of the 'isValid' field.
      * @param value The value of 'isValid'.
      * @return This builder.
      */
    public models.avro.Odd.Builder setIsValid(Integer value) {
      validate(fields()[3], value);
      this.isValid = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'isValid' field has been set.
      * @return True if the 'isValid' field has been set, false otherwise.
      */
    public boolean hasIsValid() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'isValid' field.
      * @return This builder.
      */
    public models.avro.Odd.Builder clearIsValid() {
      isValid = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Odd build() {
      try {
        Odd record = new Odd();
        record.id = fieldSetFlags()[0] ? this.id : (CharSequence) defaultValue(fields()[0]);
        record.key = fieldSetFlags()[1] ? this.key : (CharSequence) defaultValue(fields()[1]);
        record.value = fieldSetFlags()[2] ? this.value : (Double) defaultValue(fields()[2]);
        record.isValid = fieldSetFlags()[3] ? this.isValid : (Integer) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Odd>
    WRITER$ = (org.apache.avro.io.DatumWriter<Odd>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Odd>
    READER$ = (org.apache.avro.io.DatumReader<Odd>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.id == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.id);
    }

    if (this.key == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.key);
    }

    if (this.value == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeDouble(this.value);
    }

    if (this.isValid == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeInt(this.isValid);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.id = null;
      } else {
        this.id = in.readString(this.id instanceof Utf8 ? (Utf8)this.id : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.key = null;
      } else {
        this.key = in.readString(this.key instanceof Utf8 ? (Utf8)this.key : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.value = null;
      } else {
        this.value = in.readDouble();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.isValid = null;
      } else {
        this.isValid = in.readInt();
      }

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.id = null;
          } else {
            this.id = in.readString(this.id instanceof Utf8 ? (Utf8)this.id : null);
          }
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.key = null;
          } else {
            this.key = in.readString(this.key instanceof Utf8 ? (Utf8)this.key : null);
          }
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.value = null;
          } else {
            this.value = in.readDouble();
          }
          break;

        case 3:
          if (in.readIndex() != 1) {
            in.readNull();
            this.isValid = null;
          } else {
            this.isValid = in.readInt();
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










