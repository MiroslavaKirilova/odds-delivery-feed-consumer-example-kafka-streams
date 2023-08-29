/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package models.avro.wager.avro.wager.selections;

import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;

@org.apache.avro.specific.AvroGenerated
public class Selection_selection_eventInfo_league extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -1778996770487377480L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Selection_selection_eventInfo_league\",\"namespace\":\"models.avro.wager.selections\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"format\",\"type\":[\"null\",\"string\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Selection_selection_eventInfo_league> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Selection_selection_eventInfo_league> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Selection_selection_eventInfo_league> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Selection_selection_eventInfo_league> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Selection_selection_eventInfo_league> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Selection_selection_eventInfo_league to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Selection_selection_eventInfo_league from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Selection_selection_eventInfo_league instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Selection_selection_eventInfo_league fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private Long id;
  private CharSequence name;
  private CharSequence format;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Selection_selection_eventInfo_league() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param name The new value for name
   * @param format The new value for format
   */
  public Selection_selection_eventInfo_league(Long id, CharSequence name, CharSequence format) {
    this.id = id;
    this.name = name;
    this.format = format;
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
    case 1: return name;
    case 2: return format;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: id = (Long)value$; break;
    case 1: name = (CharSequence)value$; break;
    case 2: format = (CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public Long getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(Long value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public CharSequence getName() {
    return name;
  }


  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'format' field.
   * @return The value of the 'format' field.
   */
  public CharSequence getFormat() {
    return format;
  }


  /**
   * Sets the value of the 'format' field.
   * @param value the value to set.
   */
  public void setFormat(CharSequence value) {
    this.format = value;
  }

  /**
   * Creates a new Selection_selection_eventInfo_league RecordBuilder.
   * @return A new Selection_selection_eventInfo_league RecordBuilder
   */
  public static Selection_selection_eventInfo_league.Builder newBuilder() {
    return new Selection_selection_eventInfo_league.Builder();
  }

  /**
   * Creates a new Selection_selection_eventInfo_league RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Selection_selection_eventInfo_league RecordBuilder
   */
  public static Selection_selection_eventInfo_league.Builder newBuilder(Selection_selection_eventInfo_league.Builder other) {
    if (other == null) {
      return new Selection_selection_eventInfo_league.Builder();
    } else {
      return new Selection_selection_eventInfo_league.Builder(other);
    }
  }

  /**
   * Creates a new Selection_selection_eventInfo_league RecordBuilder by copying an existing Selection_selection_eventInfo_league instance.
   * @param other The existing instance to copy.
   * @return A new Selection_selection_eventInfo_league RecordBuilder
   */
  public static Selection_selection_eventInfo_league.Builder newBuilder(Selection_selection_eventInfo_league other) {
    if (other == null) {
      return new Selection_selection_eventInfo_league.Builder();
    } else {
      return new Selection_selection_eventInfo_league.Builder(other);
    }
  }

  /**
   * RecordBuilder for Selection_selection_eventInfo_league instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Selection_selection_eventInfo_league>
    implements org.apache.avro.data.RecordBuilder<Selection_selection_eventInfo_league> {

    private Long id;
    private CharSequence name;
    private CharSequence format;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Selection_selection_eventInfo_league.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.format)) {
        this.format = data().deepCopy(fields()[2].schema(), other.format);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing Selection_selection_eventInfo_league instance
     * @param other The existing instance to copy.
     */
    private Builder(Selection_selection_eventInfo_league other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.format)) {
        this.format = data().deepCopy(fields()[2].schema(), other.format);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public Long getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public Selection_selection_eventInfo_league.Builder setId(Long value) {
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
    public Selection_selection_eventInfo_league.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public CharSequence getName() {
      return name;
    }


    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public Selection_selection_eventInfo_league.Builder setName(CharSequence value) {
      validate(fields()[1], value);
      this.name = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public Selection_selection_eventInfo_league.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'format' field.
      * @return The value.
      */
    public CharSequence getFormat() {
      return format;
    }


    /**
      * Sets the value of the 'format' field.
      * @param value The value of 'format'.
      * @return This builder.
      */
    public Selection_selection_eventInfo_league.Builder setFormat(CharSequence value) {
      validate(fields()[2], value);
      this.format = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'format' field has been set.
      * @return True if the 'format' field has been set, false otherwise.
      */
    public boolean hasFormat() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'format' field.
      * @return This builder.
      */
    public Selection_selection_eventInfo_league.Builder clearFormat() {
      format = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Selection_selection_eventInfo_league build() {
      try {
        Selection_selection_eventInfo_league record = new Selection_selection_eventInfo_league();
        record.id = fieldSetFlags()[0] ? this.id : (Long) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (CharSequence) defaultValue(fields()[1]);
        record.format = fieldSetFlags()[2] ? this.format : (CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Selection_selection_eventInfo_league>
    WRITER$ = (org.apache.avro.io.DatumWriter<Selection_selection_eventInfo_league>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Selection_selection_eventInfo_league>
    READER$ = (org.apache.avro.io.DatumReader<Selection_selection_eventInfo_league>)MODEL$.createDatumReader(SCHEMA$);

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
      out.writeLong(this.id);
    }

    if (this.name == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.name);
    }

    if (this.format == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.format);
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
        this.id = in.readLong();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.name = null;
      } else {
        this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.format = null;
      } else {
        this.format = in.readString(this.format instanceof Utf8 ? (Utf8)this.format : null);
      }

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.id = null;
          } else {
            this.id = in.readLong();
          }
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.name = null;
          } else {
            this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);
          }
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.format = null;
          } else {
            this.format = in.readString(this.format instanceof Utf8 ? (Utf8)this.format : null);
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










