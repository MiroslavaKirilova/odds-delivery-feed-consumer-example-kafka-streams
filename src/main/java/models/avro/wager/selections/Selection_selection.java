/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package models.avro.wager.selections;

import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;

@org.apache.avro.specific.AvroGenerated
public class Selection_selection extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -4522767543875431193L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Selection_selection\",\"namespace\":\"models.avro.wager.selections\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"status\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"eventInfo\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Selection_selection_eventInfo\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"state\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"status\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"liveGamePeriod\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Selection_selection_eventInfo_liveGamePeriod\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"default\":null},{\"name\":\"liveMinute\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"startDate\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"sport\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Selection_selection_eventInfo_sport\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"default\":null},{\"name\":\"country\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Selection_selection_eventInfo_country\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"default\":null},{\"name\":\"league\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Selection_selection_eventInfo_league\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"format\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"default\":null},{\"name\":\"teams\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Selection_selection_eventInfo_teams\",\"fields\":[{\"name\":\"home\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Selection_selection_eventInfo_teams_home\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"default\":null},{\"name\":\"away\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Selection_selection_eventInfo_teams_away\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"default\":null}]}],\"default\":null}]}],\"default\":null},{\"name\":\"lineInfo\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Selection_selection_lineInfo\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"index\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"updatedAt\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"marketType\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Selection_selection_lineInfo_marketType\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"default\":null},{\"name\":\"lineEntity\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Selection_selection_lineInfo_lineEntity\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"default\":null},{\"name\":\"gamePeriod\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Selection_selection_lineInfo_gamePeriod\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"default\":null},{\"name\":\"isValid\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"spread\",\"type\":[\"null\",\"double\"],\"default\":null}]}],\"default\":null},{\"name\":\"odd\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Selection_selection_odd\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"key\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"value\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"format\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Selection_selection> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Selection_selection> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Selection_selection> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Selection_selection> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Selection_selection> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Selection_selection to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Selection_selection from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Selection_selection instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Selection_selection fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private Long id;
  private CharSequence status;
  private models.avro.wager.selections.Selection_selection_eventInfo eventInfo;
  private models.avro.wager.selections.Selection_selection_lineInfo lineInfo;
  private models.avro.wager.selections.Selection_selection_odd odd;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Selection_selection() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param status The new value for status
   * @param eventInfo The new value for eventInfo
   * @param lineInfo The new value for lineInfo
   * @param odd The new value for odd
   */
  public Selection_selection(Long id, CharSequence status, models.avro.wager.selections.Selection_selection_eventInfo eventInfo, models.avro.wager.selections.Selection_selection_lineInfo lineInfo, models.avro.wager.selections.Selection_selection_odd odd) {
    this.id = id;
    this.status = status;
    this.eventInfo = eventInfo;
    this.lineInfo = lineInfo;
    this.odd = odd;
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
    case 1: return status;
    case 2: return eventInfo;
    case 3: return lineInfo;
    case 4: return odd;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: id = (Long)value$; break;
    case 1: status = (CharSequence)value$; break;
    case 2: eventInfo = (models.avro.wager.selections.Selection_selection_eventInfo)value$; break;
    case 3: lineInfo = (models.avro.wager.selections.Selection_selection_lineInfo)value$; break;
    case 4: odd = (models.avro.wager.selections.Selection_selection_odd)value$; break;
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
   * Gets the value of the 'status' field.
   * @return The value of the 'status' field.
   */
  public CharSequence getStatus() {
    return status;
  }


  /**
   * Sets the value of the 'status' field.
   * @param value the value to set.
   */
  public void setStatus(CharSequence value) {
    this.status = value;
  }

  /**
   * Gets the value of the 'eventInfo' field.
   * @return The value of the 'eventInfo' field.
   */
  public models.avro.wager.selections.Selection_selection_eventInfo getEventInfo() {
    return eventInfo;
  }


  /**
   * Sets the value of the 'eventInfo' field.
   * @param value the value to set.
   */
  public void setEventInfo(models.avro.wager.selections.Selection_selection_eventInfo value) {
    this.eventInfo = value;
  }

  /**
   * Gets the value of the 'lineInfo' field.
   * @return The value of the 'lineInfo' field.
   */
  public models.avro.wager.selections.Selection_selection_lineInfo getLineInfo() {
    return lineInfo;
  }


  /**
   * Sets the value of the 'lineInfo' field.
   * @param value the value to set.
   */
  public void setLineInfo(models.avro.wager.selections.Selection_selection_lineInfo value) {
    this.lineInfo = value;
  }

  /**
   * Gets the value of the 'odd' field.
   * @return The value of the 'odd' field.
   */
  public models.avro.wager.selections.Selection_selection_odd getOdd() {
    return odd;
  }


  /**
   * Sets the value of the 'odd' field.
   * @param value the value to set.
   */
  public void setOdd(models.avro.wager.selections.Selection_selection_odd value) {
    this.odd = value;
  }

  /**
   * Creates a new Selection_selection RecordBuilder.
   * @return A new Selection_selection RecordBuilder
   */
  public static models.avro.wager.selections.Selection_selection.Builder newBuilder() {
    return new models.avro.wager.selections.Selection_selection.Builder();
  }

  /**
   * Creates a new Selection_selection RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Selection_selection RecordBuilder
   */
  public static models.avro.wager.selections.Selection_selection.Builder newBuilder(models.avro.wager.selections.Selection_selection.Builder other) {
    if (other == null) {
      return new models.avro.wager.selections.Selection_selection.Builder();
    } else {
      return new models.avro.wager.selections.Selection_selection.Builder(other);
    }
  }

  /**
   * Creates a new Selection_selection RecordBuilder by copying an existing Selection_selection instance.
   * @param other The existing instance to copy.
   * @return A new Selection_selection RecordBuilder
   */
  public static models.avro.wager.selections.Selection_selection.Builder newBuilder(models.avro.wager.selections.Selection_selection other) {
    if (other == null) {
      return new models.avro.wager.selections.Selection_selection.Builder();
    } else {
      return new models.avro.wager.selections.Selection_selection.Builder(other);
    }
  }

  /**
   * RecordBuilder for Selection_selection instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Selection_selection>
    implements org.apache.avro.data.RecordBuilder<Selection_selection> {

    private Long id;
    private CharSequence status;
    private models.avro.wager.selections.Selection_selection_eventInfo eventInfo;
    private models.avro.wager.selections.Selection_selection_eventInfo.Builder eventInfoBuilder;
    private models.avro.wager.selections.Selection_selection_lineInfo lineInfo;
    private models.avro.wager.selections.Selection_selection_lineInfo.Builder lineInfoBuilder;
    private models.avro.wager.selections.Selection_selection_odd odd;
    private models.avro.wager.selections.Selection_selection_odd.Builder oddBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(models.avro.wager.selections.Selection_selection.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.status)) {
        this.status = data().deepCopy(fields()[1].schema(), other.status);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.eventInfo)) {
        this.eventInfo = data().deepCopy(fields()[2].schema(), other.eventInfo);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (other.hasEventInfoBuilder()) {
        this.eventInfoBuilder = models.avro.wager.selections.Selection_selection_eventInfo.newBuilder(other.getEventInfoBuilder());
      }
      if (isValidValue(fields()[3], other.lineInfo)) {
        this.lineInfo = data().deepCopy(fields()[3].schema(), other.lineInfo);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (other.hasLineInfoBuilder()) {
        this.lineInfoBuilder = models.avro.wager.selections.Selection_selection_lineInfo.newBuilder(other.getLineInfoBuilder());
      }
      if (isValidValue(fields()[4], other.odd)) {
        this.odd = data().deepCopy(fields()[4].schema(), other.odd);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (other.hasOddBuilder()) {
        this.oddBuilder = models.avro.wager.selections.Selection_selection_odd.newBuilder(other.getOddBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing Selection_selection instance
     * @param other The existing instance to copy.
     */
    private Builder(models.avro.wager.selections.Selection_selection other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.status)) {
        this.status = data().deepCopy(fields()[1].schema(), other.status);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.eventInfo)) {
        this.eventInfo = data().deepCopy(fields()[2].schema(), other.eventInfo);
        fieldSetFlags()[2] = true;
      }
      this.eventInfoBuilder = null;
      if (isValidValue(fields()[3], other.lineInfo)) {
        this.lineInfo = data().deepCopy(fields()[3].schema(), other.lineInfo);
        fieldSetFlags()[3] = true;
      }
      this.lineInfoBuilder = null;
      if (isValidValue(fields()[4], other.odd)) {
        this.odd = data().deepCopy(fields()[4].schema(), other.odd);
        fieldSetFlags()[4] = true;
      }
      this.oddBuilder = null;
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
    public models.avro.wager.selections.Selection_selection.Builder setId(Long value) {
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
    public models.avro.wager.selections.Selection_selection.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'status' field.
      * @return The value.
      */
    public CharSequence getStatus() {
      return status;
    }


    /**
      * Sets the value of the 'status' field.
      * @param value The value of 'status'.
      * @return This builder.
      */
    public models.avro.wager.selections.Selection_selection.Builder setStatus(CharSequence value) {
      validate(fields()[1], value);
      this.status = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'status' field has been set.
      * @return True if the 'status' field has been set, false otherwise.
      */
    public boolean hasStatus() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'status' field.
      * @return This builder.
      */
    public models.avro.wager.selections.Selection_selection.Builder clearStatus() {
      status = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'eventInfo' field.
      * @return The value.
      */
    public models.avro.wager.selections.Selection_selection_eventInfo getEventInfo() {
      return eventInfo;
    }


    /**
      * Sets the value of the 'eventInfo' field.
      * @param value The value of 'eventInfo'.
      * @return This builder.
      */
    public models.avro.wager.selections.Selection_selection.Builder setEventInfo(models.avro.wager.selections.Selection_selection_eventInfo value) {
      validate(fields()[2], value);
      this.eventInfoBuilder = null;
      this.eventInfo = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'eventInfo' field has been set.
      * @return True if the 'eventInfo' field has been set, false otherwise.
      */
    public boolean hasEventInfo() {
      return fieldSetFlags()[2];
    }

    /**
     * Gets the Builder instance for the 'eventInfo' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public models.avro.wager.selections.Selection_selection_eventInfo.Builder getEventInfoBuilder() {
      if (eventInfoBuilder == null) {
        if (hasEventInfo()) {
          setEventInfoBuilder(models.avro.wager.selections.Selection_selection_eventInfo.newBuilder(eventInfo));
        } else {
          setEventInfoBuilder(models.avro.wager.selections.Selection_selection_eventInfo.newBuilder());
        }
      }
      return eventInfoBuilder;
    }

    /**
     * Sets the Builder instance for the 'eventInfo' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public models.avro.wager.selections.Selection_selection.Builder setEventInfoBuilder(models.avro.wager.selections.Selection_selection_eventInfo.Builder value) {
      clearEventInfo();
      eventInfoBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'eventInfo' field has an active Builder instance
     * @return True if the 'eventInfo' field has an active Builder instance
     */
    public boolean hasEventInfoBuilder() {
      return eventInfoBuilder != null;
    }

    /**
      * Clears the value of the 'eventInfo' field.
      * @return This builder.
      */
    public models.avro.wager.selections.Selection_selection.Builder clearEventInfo() {
      eventInfo = null;
      eventInfoBuilder = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'lineInfo' field.
      * @return The value.
      */
    public models.avro.wager.selections.Selection_selection_lineInfo getLineInfo() {
      return lineInfo;
    }


    /**
      * Sets the value of the 'lineInfo' field.
      * @param value The value of 'lineInfo'.
      * @return This builder.
      */
    public models.avro.wager.selections.Selection_selection.Builder setLineInfo(models.avro.wager.selections.Selection_selection_lineInfo value) {
      validate(fields()[3], value);
      this.lineInfoBuilder = null;
      this.lineInfo = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'lineInfo' field has been set.
      * @return True if the 'lineInfo' field has been set, false otherwise.
      */
    public boolean hasLineInfo() {
      return fieldSetFlags()[3];
    }

    /**
     * Gets the Builder instance for the 'lineInfo' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public models.avro.wager.selections.Selection_selection_lineInfo.Builder getLineInfoBuilder() {
      if (lineInfoBuilder == null) {
        if (hasLineInfo()) {
          setLineInfoBuilder(models.avro.wager.selections.Selection_selection_lineInfo.newBuilder(lineInfo));
        } else {
          setLineInfoBuilder(models.avro.wager.selections.Selection_selection_lineInfo.newBuilder());
        }
      }
      return lineInfoBuilder;
    }

    /**
     * Sets the Builder instance for the 'lineInfo' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public models.avro.wager.selections.Selection_selection.Builder setLineInfoBuilder(models.avro.wager.selections.Selection_selection_lineInfo.Builder value) {
      clearLineInfo();
      lineInfoBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'lineInfo' field has an active Builder instance
     * @return True if the 'lineInfo' field has an active Builder instance
     */
    public boolean hasLineInfoBuilder() {
      return lineInfoBuilder != null;
    }

    /**
      * Clears the value of the 'lineInfo' field.
      * @return This builder.
      */
    public models.avro.wager.selections.Selection_selection.Builder clearLineInfo() {
      lineInfo = null;
      lineInfoBuilder = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'odd' field.
      * @return The value.
      */
    public models.avro.wager.selections.Selection_selection_odd getOdd() {
      return odd;
    }


    /**
      * Sets the value of the 'odd' field.
      * @param value The value of 'odd'.
      * @return This builder.
      */
    public models.avro.wager.selections.Selection_selection.Builder setOdd(models.avro.wager.selections.Selection_selection_odd value) {
      validate(fields()[4], value);
      this.oddBuilder = null;
      this.odd = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'odd' field has been set.
      * @return True if the 'odd' field has been set, false otherwise.
      */
    public boolean hasOdd() {
      return fieldSetFlags()[4];
    }

    /**
     * Gets the Builder instance for the 'odd' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public models.avro.wager.selections.Selection_selection_odd.Builder getOddBuilder() {
      if (oddBuilder == null) {
        if (hasOdd()) {
          setOddBuilder(models.avro.wager.selections.Selection_selection_odd.newBuilder(odd));
        } else {
          setOddBuilder(models.avro.wager.selections.Selection_selection_odd.newBuilder());
        }
      }
      return oddBuilder;
    }

    /**
     * Sets the Builder instance for the 'odd' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public models.avro.wager.selections.Selection_selection.Builder setOddBuilder(models.avro.wager.selections.Selection_selection_odd.Builder value) {
      clearOdd();
      oddBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'odd' field has an active Builder instance
     * @return True if the 'odd' field has an active Builder instance
     */
    public boolean hasOddBuilder() {
      return oddBuilder != null;
    }

    /**
      * Clears the value of the 'odd' field.
      * @return This builder.
      */
    public models.avro.wager.selections.Selection_selection.Builder clearOdd() {
      odd = null;
      oddBuilder = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Selection_selection build() {
      try {
        Selection_selection record = new Selection_selection();
        record.id = fieldSetFlags()[0] ? this.id : (Long) defaultValue(fields()[0]);
        record.status = fieldSetFlags()[1] ? this.status : (CharSequence) defaultValue(fields()[1]);
        if (eventInfoBuilder != null) {
          try {
            record.eventInfo = this.eventInfoBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("eventInfo"));
            throw e;
          }
        } else {
          record.eventInfo = fieldSetFlags()[2] ? this.eventInfo : (models.avro.wager.selections.Selection_selection_eventInfo) defaultValue(fields()[2]);
        }
        if (lineInfoBuilder != null) {
          try {
            record.lineInfo = this.lineInfoBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("lineInfo"));
            throw e;
          }
        } else {
          record.lineInfo = fieldSetFlags()[3] ? this.lineInfo : (models.avro.wager.selections.Selection_selection_lineInfo) defaultValue(fields()[3]);
        }
        if (oddBuilder != null) {
          try {
            record.odd = this.oddBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("odd"));
            throw e;
          }
        } else {
          record.odd = fieldSetFlags()[4] ? this.odd : (models.avro.wager.selections.Selection_selection_odd) defaultValue(fields()[4]);
        }
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Selection_selection>
    WRITER$ = (org.apache.avro.io.DatumWriter<Selection_selection>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Selection_selection>
    READER$ = (org.apache.avro.io.DatumReader<Selection_selection>)MODEL$.createDatumReader(SCHEMA$);

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

    if (this.status == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.status);
    }

    if (this.eventInfo == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      this.eventInfo.customEncode(out);
    }

    if (this.lineInfo == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      this.lineInfo.customEncode(out);
    }

    if (this.odd == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      this.odd.customEncode(out);
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
        this.status = null;
      } else {
        this.status = in.readString(this.status instanceof Utf8 ? (Utf8)this.status : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.eventInfo = null;
      } else {
        if (this.eventInfo == null) {
          this.eventInfo = new models.avro.wager.selections.Selection_selection_eventInfo();
        }
        this.eventInfo.customDecode(in);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.lineInfo = null;
      } else {
        if (this.lineInfo == null) {
          this.lineInfo = new models.avro.wager.selections.Selection_selection_lineInfo();
        }
        this.lineInfo.customDecode(in);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.odd = null;
      } else {
        if (this.odd == null) {
          this.odd = new models.avro.wager.selections.Selection_selection_odd();
        }
        this.odd.customDecode(in);
      }

    } else {
      for (int i = 0; i < 5; i++) {
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
            this.status = null;
          } else {
            this.status = in.readString(this.status instanceof Utf8 ? (Utf8)this.status : null);
          }
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.eventInfo = null;
          } else {
            if (this.eventInfo == null) {
              this.eventInfo = new models.avro.wager.selections.Selection_selection_eventInfo();
            }
            this.eventInfo.customDecode(in);
          }
          break;

        case 3:
          if (in.readIndex() != 1) {
            in.readNull();
            this.lineInfo = null;
          } else {
            if (this.lineInfo == null) {
              this.lineInfo = new models.avro.wager.selections.Selection_selection_lineInfo();
            }
            this.lineInfo.customDecode(in);
          }
          break;

        case 4:
          if (in.readIndex() != 1) {
            in.readNull();
            this.odd = null;
          } else {
            if (this.odd == null) {
              this.odd = new models.avro.wager.selections.Selection_selection_odd();
            }
            this.odd.customDecode(in);
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










