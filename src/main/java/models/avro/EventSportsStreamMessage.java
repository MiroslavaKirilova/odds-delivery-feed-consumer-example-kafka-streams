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
public class EventSportsStreamMessage extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5566382328255341982L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"EventSportsStreamMessage\",\"namespace\":\"models.avro\",\"fields\":[{\"name\":\"origin\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Origin\",\"fields\":[{\"name\":\"stream\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"type\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"environment\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"version\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"default\":null},{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"eventInfo\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"EventInfo\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"state\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"status\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"liveGamePeriod\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"LiveGamePeriod\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"default\":null},{\"name\":\"liveMinute\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"marketsCount\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"startDate\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"timeRange\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"sport\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Sport\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"title\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"key\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"default\":null},{\"name\":\"country\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Country\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"title\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"default\":null},{\"name\":\"league\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"League\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"title\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"format\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"default\":null},{\"name\":\"teams\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Teams\",\"fields\":[{\"name\":\"home\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Team\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"color\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"default\":null},{\"name\":\"away\",\"type\":[\"null\",\"Team\"],\"default\":null}]}],\"default\":null}]}],\"default\":null},{\"name\":\"liveScores\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"LiveScores\",\"fields\":[{\"name\":\"lineEntity\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"LineEntity\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"default\":null},{\"name\":\"gamePeriod\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"GamePeriod\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"default\":null},{\"name\":\"home\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"away\",\"type\":[\"null\",\"int\"],\"default\":null}]}}],\"default\":null},{\"name\":\"typedScores\",\"type\":[\"null\",{\"type\":\"map\",\"values\":{\"type\":\"map\",\"values\":{\"type\":\"record\",\"name\":\"Score\",\"fields\":[{\"name\":\"homeTeam\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"awayTeam\",\"type\":[\"null\",\"int\"],\"default\":null}]},\"keys\":\"string\"},\"keys\":\"string\"}],\"default\":null},{\"name\":\"timestamp\",\"type\":[\"null\",\"string\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<EventSportsStreamMessage> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<EventSportsStreamMessage> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<EventSportsStreamMessage> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<EventSportsStreamMessage> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<EventSportsStreamMessage> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this EventSportsStreamMessage to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a EventSportsStreamMessage from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a EventSportsStreamMessage instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static EventSportsStreamMessage fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private models.avro.Origin origin;
  private CharSequence id;
  private models.avro.EventInfo eventInfo;
  private java.util.List<models.avro.LiveScores> liveScores;
  private java.util.Map<CharSequence,java.util.Map<CharSequence,models.avro.Score>> typedScores;
  private CharSequence timestamp;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public EventSportsStreamMessage() {}

  /**
   * All-args constructor.
   * @param origin The new value for origin
   * @param id The new value for id
   * @param eventInfo The new value for eventInfo
   * @param liveScores The new value for liveScores
   * @param typedScores The new value for typedScores
   * @param timestamp The new value for timestamp
   */
  public EventSportsStreamMessage(models.avro.Origin origin, CharSequence id, models.avro.EventInfo eventInfo, java.util.List<models.avro.LiveScores> liveScores, java.util.Map<CharSequence,java.util.Map<CharSequence,models.avro.Score>> typedScores, CharSequence timestamp) {
    this.origin = origin;
    this.id = id;
    this.eventInfo = eventInfo;
    this.liveScores = liveScores;
    this.typedScores = typedScores;
    this.timestamp = timestamp;
  }

  @Override
  public SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public Object get(int field$) {
    switch (field$) {
    case 0: return origin;
    case 1: return id;
    case 2: return eventInfo;
    case 3: return liveScores;
    case 4: return typedScores;
    case 5: return timestamp;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: origin = (models.avro.Origin)value$; break;
    case 1: id = (CharSequence)value$; break;
    case 2: eventInfo = (models.avro.EventInfo)value$; break;
    case 3: liveScores = (java.util.List<models.avro.LiveScores>)value$; break;
    case 4: typedScores = (java.util.Map<CharSequence,java.util.Map<CharSequence,models.avro.Score>>)value$; break;
    case 5: timestamp = (CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'origin' field.
   * @return The value of the 'origin' field.
   */
  public models.avro.Origin getOrigin() {
    return origin;
  }


  /**
   * Sets the value of the 'origin' field.
   * @param value the value to set.
   */
  public void setOrigin(models.avro.Origin value) {
    this.origin = value;
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
   * Gets the value of the 'eventInfo' field.
   * @return The value of the 'eventInfo' field.
   */
  public models.avro.EventInfo getEventInfo() {
    return eventInfo;
  }


  /**
   * Sets the value of the 'eventInfo' field.
   * @param value the value to set.
   */
  public void setEventInfo(models.avro.EventInfo value) {
    this.eventInfo = value;
  }

  /**
   * Gets the value of the 'liveScores' field.
   * @return The value of the 'liveScores' field.
   */
  public java.util.List<models.avro.LiveScores> getLiveScores() {
    return liveScores;
  }


  /**
   * Sets the value of the 'liveScores' field.
   * @param value the value to set.
   */
  public void setLiveScores(java.util.List<models.avro.LiveScores> value) {
    this.liveScores = value;
  }

  /**
   * Gets the value of the 'typedScores' field.
   * @return The value of the 'typedScores' field.
   */
  public java.util.Map<CharSequence,java.util.Map<CharSequence,models.avro.Score>> getTypedScores() {
    return typedScores;
  }


  /**
   * Sets the value of the 'typedScores' field.
   * @param value the value to set.
   */
  public void setTypedScores(java.util.Map<CharSequence,java.util.Map<CharSequence,models.avro.Score>> value) {
    this.typedScores = value;
  }

  /**
   * Gets the value of the 'timestamp' field.
   * @return The value of the 'timestamp' field.
   */
  public CharSequence getTimestamp() {
    return timestamp;
  }


  /**
   * Sets the value of the 'timestamp' field.
   * @param value the value to set.
   */
  public void setTimestamp(CharSequence value) {
    this.timestamp = value;
  }

  /**
   * Creates a new EventSportsStreamMessage RecordBuilder.
   * @return A new EventSportsStreamMessage RecordBuilder
   */
  public static models.avro.EventSportsStreamMessage.Builder newBuilder() {
    return new models.avro.EventSportsStreamMessage.Builder();
  }

  /**
   * Creates a new EventSportsStreamMessage RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new EventSportsStreamMessage RecordBuilder
   */
  public static models.avro.EventSportsStreamMessage.Builder newBuilder(models.avro.EventSportsStreamMessage.Builder other) {
    if (other == null) {
      return new models.avro.EventSportsStreamMessage.Builder();
    } else {
      return new models.avro.EventSportsStreamMessage.Builder(other);
    }
  }

  /**
   * Creates a new EventSportsStreamMessage RecordBuilder by copying an existing EventSportsStreamMessage instance.
   * @param other The existing instance to copy.
   * @return A new EventSportsStreamMessage RecordBuilder
   */
  public static models.avro.EventSportsStreamMessage.Builder newBuilder(models.avro.EventSportsStreamMessage other) {
    if (other == null) {
      return new models.avro.EventSportsStreamMessage.Builder();
    } else {
      return new models.avro.EventSportsStreamMessage.Builder(other);
    }
  }

  /**
   * RecordBuilder for EventSportsStreamMessage instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<EventSportsStreamMessage>
    implements org.apache.avro.data.RecordBuilder<EventSportsStreamMessage> {

    private models.avro.Origin origin;
    private models.avro.Origin.Builder originBuilder;
    private CharSequence id;
    private models.avro.EventInfo eventInfo;
    private models.avro.EventInfo.Builder eventInfoBuilder;
    private java.util.List<models.avro.LiveScores> liveScores;
    private java.util.Map<CharSequence,java.util.Map<CharSequence,models.avro.Score>> typedScores;
    private CharSequence timestamp;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(models.avro.EventSportsStreamMessage.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.origin)) {
        this.origin = data().deepCopy(fields()[0].schema(), other.origin);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (other.hasOriginBuilder()) {
        this.originBuilder = models.avro.Origin.newBuilder(other.getOriginBuilder());
      }
      if (isValidValue(fields()[1], other.id)) {
        this.id = data().deepCopy(fields()[1].schema(), other.id);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.eventInfo)) {
        this.eventInfo = data().deepCopy(fields()[2].schema(), other.eventInfo);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (other.hasEventInfoBuilder()) {
        this.eventInfoBuilder = models.avro.EventInfo.newBuilder(other.getEventInfoBuilder());
      }
      if (isValidValue(fields()[3], other.liveScores)) {
        this.liveScores = data().deepCopy(fields()[3].schema(), other.liveScores);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.typedScores)) {
        this.typedScores = data().deepCopy(fields()[4].schema(), other.typedScores);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[5].schema(), other.timestamp);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
    }

    /**
     * Creates a Builder by copying an existing EventSportsStreamMessage instance
     * @param other The existing instance to copy.
     */
    private Builder(models.avro.EventSportsStreamMessage other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.origin)) {
        this.origin = data().deepCopy(fields()[0].schema(), other.origin);
        fieldSetFlags()[0] = true;
      }
      this.originBuilder = null;
      if (isValidValue(fields()[1], other.id)) {
        this.id = data().deepCopy(fields()[1].schema(), other.id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.eventInfo)) {
        this.eventInfo = data().deepCopy(fields()[2].schema(), other.eventInfo);
        fieldSetFlags()[2] = true;
      }
      this.eventInfoBuilder = null;
      if (isValidValue(fields()[3], other.liveScores)) {
        this.liveScores = data().deepCopy(fields()[3].schema(), other.liveScores);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.typedScores)) {
        this.typedScores = data().deepCopy(fields()[4].schema(), other.typedScores);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[5].schema(), other.timestamp);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'origin' field.
      * @return The value.
      */
    public models.avro.Origin getOrigin() {
      return origin;
    }


    /**
      * Sets the value of the 'origin' field.
      * @param value The value of 'origin'.
      * @return This builder.
      */
    public models.avro.EventSportsStreamMessage.Builder setOrigin(models.avro.Origin value) {
      validate(fields()[0], value);
      this.originBuilder = null;
      this.origin = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'origin' field has been set.
      * @return True if the 'origin' field has been set, false otherwise.
      */
    public boolean hasOrigin() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'origin' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public models.avro.Origin.Builder getOriginBuilder() {
      if (originBuilder == null) {
        if (hasOrigin()) {
          setOriginBuilder(models.avro.Origin.newBuilder(origin));
        } else {
          setOriginBuilder(models.avro.Origin.newBuilder());
        }
      }
      return originBuilder;
    }

    /**
     * Sets the Builder instance for the 'origin' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public models.avro.EventSportsStreamMessage.Builder setOriginBuilder(models.avro.Origin.Builder value) {
      clearOrigin();
      originBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'origin' field has an active Builder instance
     * @return True if the 'origin' field has an active Builder instance
     */
    public boolean hasOriginBuilder() {
      return originBuilder != null;
    }

    /**
      * Clears the value of the 'origin' field.
      * @return This builder.
      */
    public models.avro.EventSportsStreamMessage.Builder clearOrigin() {
      origin = null;
      originBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
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
    public models.avro.EventSportsStreamMessage.Builder setId(CharSequence value) {
      validate(fields()[1], value);
      this.id = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public models.avro.EventSportsStreamMessage.Builder clearId() {
      id = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'eventInfo' field.
      * @return The value.
      */
    public models.avro.EventInfo getEventInfo() {
      return eventInfo;
    }


    /**
      * Sets the value of the 'eventInfo' field.
      * @param value The value of 'eventInfo'.
      * @return This builder.
      */
    public models.avro.EventSportsStreamMessage.Builder setEventInfo(models.avro.EventInfo value) {
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
    public models.avro.EventInfo.Builder getEventInfoBuilder() {
      if (eventInfoBuilder == null) {
        if (hasEventInfo()) {
          setEventInfoBuilder(models.avro.EventInfo.newBuilder(eventInfo));
        } else {
          setEventInfoBuilder(models.avro.EventInfo.newBuilder());
        }
      }
      return eventInfoBuilder;
    }

    /**
     * Sets the Builder instance for the 'eventInfo' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public models.avro.EventSportsStreamMessage.Builder setEventInfoBuilder(models.avro.EventInfo.Builder value) {
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
    public models.avro.EventSportsStreamMessage.Builder clearEventInfo() {
      eventInfo = null;
      eventInfoBuilder = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'liveScores' field.
      * @return The value.
      */
    public java.util.List<models.avro.LiveScores> getLiveScores() {
      return liveScores;
    }


    /**
      * Sets the value of the 'liveScores' field.
      * @param value The value of 'liveScores'.
      * @return This builder.
      */
    public models.avro.EventSportsStreamMessage.Builder setLiveScores(java.util.List<models.avro.LiveScores> value) {
      validate(fields()[3], value);
      this.liveScores = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'liveScores' field has been set.
      * @return True if the 'liveScores' field has been set, false otherwise.
      */
    public boolean hasLiveScores() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'liveScores' field.
      * @return This builder.
      */
    public models.avro.EventSportsStreamMessage.Builder clearLiveScores() {
      liveScores = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'typedScores' field.
      * @return The value.
      */
    public java.util.Map<CharSequence,java.util.Map<CharSequence,models.avro.Score>> getTypedScores() {
      return typedScores;
    }


    /**
      * Sets the value of the 'typedScores' field.
      * @param value The value of 'typedScores'.
      * @return This builder.
      */
    public models.avro.EventSportsStreamMessage.Builder setTypedScores(java.util.Map<CharSequence,java.util.Map<CharSequence,models.avro.Score>> value) {
      validate(fields()[4], value);
      this.typedScores = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'typedScores' field has been set.
      * @return True if the 'typedScores' field has been set, false otherwise.
      */
    public boolean hasTypedScores() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'typedScores' field.
      * @return This builder.
      */
    public models.avro.EventSportsStreamMessage.Builder clearTypedScores() {
      typedScores = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'timestamp' field.
      * @return The value.
      */
    public CharSequence getTimestamp() {
      return timestamp;
    }


    /**
      * Sets the value of the 'timestamp' field.
      * @param value The value of 'timestamp'.
      * @return This builder.
      */
    public models.avro.EventSportsStreamMessage.Builder setTimestamp(CharSequence value) {
      validate(fields()[5], value);
      this.timestamp = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'timestamp' field has been set.
      * @return True if the 'timestamp' field has been set, false otherwise.
      */
    public boolean hasTimestamp() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'timestamp' field.
      * @return This builder.
      */
    public models.avro.EventSportsStreamMessage.Builder clearTimestamp() {
      timestamp = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public EventSportsStreamMessage build() {
      try {
        EventSportsStreamMessage record = new EventSportsStreamMessage();
        if (originBuilder != null) {
          try {
            record.origin = this.originBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("origin"));
            throw e;
          }
        } else {
          record.origin = fieldSetFlags()[0] ? this.origin : (models.avro.Origin) defaultValue(fields()[0]);
        }
        record.id = fieldSetFlags()[1] ? this.id : (CharSequence) defaultValue(fields()[1]);
        if (eventInfoBuilder != null) {
          try {
            record.eventInfo = this.eventInfoBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("eventInfo"));
            throw e;
          }
        } else {
          record.eventInfo = fieldSetFlags()[2] ? this.eventInfo : (models.avro.EventInfo) defaultValue(fields()[2]);
        }
        record.liveScores = fieldSetFlags()[3] ? this.liveScores : (java.util.List<models.avro.LiveScores>) defaultValue(fields()[3]);
        record.typedScores = fieldSetFlags()[4] ? this.typedScores : (java.util.Map<CharSequence,java.util.Map<CharSequence,models.avro.Score>>) defaultValue(fields()[4]);
        record.timestamp = fieldSetFlags()[5] ? this.timestamp : (CharSequence) defaultValue(fields()[5]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<EventSportsStreamMessage>
    WRITER$ = (org.apache.avro.io.DatumWriter<EventSportsStreamMessage>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<EventSportsStreamMessage>
    READER$ = (org.apache.avro.io.DatumReader<EventSportsStreamMessage>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.origin == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      this.origin.customEncode(out);
    }

    if (this.id == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.id);
    }

    if (this.eventInfo == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      this.eventInfo.customEncode(out);
    }

    if (this.liveScores == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      long size0 = this.liveScores.size();
      out.writeArrayStart();
      out.setItemCount(size0);
      long actualSize0 = 0;
      for (models.avro.LiveScores e0: this.liveScores) {
        actualSize0++;
        out.startItem();
        e0.customEncode(out);
      }
      out.writeArrayEnd();
      if (actualSize0 != size0)
        throw new java.util.ConcurrentModificationException("Array-size written was " + size0 + ", but element count was " + actualSize0 + ".");
    }

    if (this.typedScores == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      long size1 = this.typedScores.size();
      out.writeMapStart();
      out.setItemCount(size1);
      long actualSize1 = 0;
      for (java.util.Map.Entry<CharSequence, java.util.Map<CharSequence,models.avro.Score>> e1: this.typedScores.entrySet()) {
        actualSize1++;
        out.startItem();
        out.writeString(e1.getKey());
        java.util.Map<CharSequence,models.avro.Score> v1 = e1.getValue();
        long size2 = v1.size();
        out.writeMapStart();
        out.setItemCount(size2);
        long actualSize2 = 0;
        for (java.util.Map.Entry<CharSequence, models.avro.Score> e2: v1.entrySet()) {
          actualSize2++;
          out.startItem();
          out.writeString(e2.getKey());
          models.avro.Score v2 = e2.getValue();
          v2.customEncode(out);
        }
        out.writeMapEnd();
        if (actualSize2 != size2)
      throw new java.util.ConcurrentModificationException("Map-size written was " + size2 + ", but element count was " + actualSize2 + ".");
      }
      out.writeMapEnd();
      if (actualSize1 != size1)
      throw new java.util.ConcurrentModificationException("Map-size written was " + size1 + ", but element count was " + actualSize1 + ".");
    }

    if (this.timestamp == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.timestamp);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.origin = null;
      } else {
        if (this.origin == null) {
          this.origin = new models.avro.Origin();
        }
        this.origin.customDecode(in);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.id = null;
      } else {
        this.id = in.readString(this.id instanceof Utf8 ? (Utf8)this.id : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.eventInfo = null;
      } else {
        if (this.eventInfo == null) {
          this.eventInfo = new models.avro.EventInfo();
        }
        this.eventInfo.customDecode(in);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.liveScores = null;
      } else {
        long size0 = in.readArrayStart();
        java.util.List<models.avro.LiveScores> a0 = this.liveScores;
        if (a0 == null) {
          a0 = new SpecificData.Array<models.avro.LiveScores>((int)size0, SCHEMA$.getField("liveScores").schema().getTypes().get(1));
          this.liveScores = a0;
        } else a0.clear();
        SpecificData.Array<models.avro.LiveScores> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<models.avro.LiveScores>)a0 : null);
        for ( ; 0 < size0; size0 = in.arrayNext()) {
          for ( ; size0 != 0; size0--) {
            models.avro.LiveScores e0 = (ga0 != null ? ga0.peek() : null);
            if (e0 == null) {
              e0 = new models.avro.LiveScores();
            }
            e0.customDecode(in);
            a0.add(e0);
          }
        }
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.typedScores = null;
      } else {
        long size1 = in.readMapStart();
        java.util.Map<CharSequence,java.util.Map<CharSequence,models.avro.Score>> m1 = this.typedScores; // Need fresh name due to limitation of macro system
        if (m1 == null) {
          m1 = new java.util.HashMap<CharSequence,java.util.Map<CharSequence,models.avro.Score>>((int)size1);
          this.typedScores = m1;
        } else m1.clear();
        for ( ; 0 < size1; size1 = in.mapNext()) {
          for ( ; size1 != 0; size1--) {
            CharSequence k1 = null;
            k1 = in.readString(k1 instanceof Utf8 ? (Utf8)k1 : null);
            java.util.Map<CharSequence,models.avro.Score> v1 = null;
            long size2 = in.readMapStart();
            java.util.Map<CharSequence,models.avro.Score> m2 = v1; // Need fresh name due to limitation of macro system
            if (m2 == null) {
              m2 = new java.util.HashMap<CharSequence,models.avro.Score>((int)size2);
              v1 = m2;
            } else m2.clear();
            for ( ; 0 < size2; size2 = in.mapNext()) {
              for ( ; size2 != 0; size2--) {
                CharSequence k2 = null;
                k2 = in.readString(k2 instanceof Utf8 ? (Utf8)k2 : null);
                models.avro.Score v2 = null;
                if (v2 == null) {
                  v2 = new models.avro.Score();
                }
                v2.customDecode(in);
                m2.put(k2, v2);
              }
            }
            m1.put(k1, v1);
          }
        }
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.timestamp = null;
      } else {
        this.timestamp = in.readString(this.timestamp instanceof Utf8 ? (Utf8)this.timestamp : null);
      }

    } else {
      for (int i = 0; i < 6; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.origin = null;
          } else {
            if (this.origin == null) {
              this.origin = new models.avro.Origin();
            }
            this.origin.customDecode(in);
          }
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.id = null;
          } else {
            this.id = in.readString(this.id instanceof Utf8 ? (Utf8)this.id : null);
          }
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.eventInfo = null;
          } else {
            if (this.eventInfo == null) {
              this.eventInfo = new models.avro.EventInfo();
            }
            this.eventInfo.customDecode(in);
          }
          break;

        case 3:
          if (in.readIndex() != 1) {
            in.readNull();
            this.liveScores = null;
          } else {
            long size0 = in.readArrayStart();
            java.util.List<models.avro.LiveScores> a0 = this.liveScores;
            if (a0 == null) {
              a0 = new SpecificData.Array<models.avro.LiveScores>((int)size0, SCHEMA$.getField("liveScores").schema().getTypes().get(1));
              this.liveScores = a0;
            } else a0.clear();
            SpecificData.Array<models.avro.LiveScores> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<models.avro.LiveScores>)a0 : null);
            for ( ; 0 < size0; size0 = in.arrayNext()) {
              for ( ; size0 != 0; size0--) {
                models.avro.LiveScores e0 = (ga0 != null ? ga0.peek() : null);
                if (e0 == null) {
                  e0 = new models.avro.LiveScores();
                }
                e0.customDecode(in);
                a0.add(e0);
              }
            }
          }
          break;

        case 4:
          if (in.readIndex() != 1) {
            in.readNull();
            this.typedScores = null;
          } else {
            long size1 = in.readMapStart();
            java.util.Map<CharSequence,java.util.Map<CharSequence,models.avro.Score>> m1 = this.typedScores; // Need fresh name due to limitation of macro system
            if (m1 == null) {
              m1 = new java.util.HashMap<CharSequence,java.util.Map<CharSequence,models.avro.Score>>((int)size1);
              this.typedScores = m1;
            } else m1.clear();
            for ( ; 0 < size1; size1 = in.mapNext()) {
              for ( ; size1 != 0; size1--) {
                CharSequence k1 = null;
                k1 = in.readString(k1 instanceof Utf8 ? (Utf8)k1 : null);
                java.util.Map<CharSequence,models.avro.Score> v1 = null;
                long size2 = in.readMapStart();
                java.util.Map<CharSequence,models.avro.Score> m2 = v1; // Need fresh name due to limitation of macro system
                if (m2 == null) {
                  m2 = new java.util.HashMap<CharSequence,models.avro.Score>((int)size2);
                  v1 = m2;
                } else m2.clear();
                for ( ; 0 < size2; size2 = in.mapNext()) {
                  for ( ; size2 != 0; size2--) {
                    CharSequence k2 = null;
                    k2 = in.readString(k2 instanceof Utf8 ? (Utf8)k2 : null);
                    models.avro.Score v2 = null;
                    if (v2 == null) {
                      v2 = new models.avro.Score();
                    }
                    v2.customDecode(in);
                    m2.put(k2, v2);
                  }
                }
                m1.put(k1, v1);
              }
            }
          }
          break;

        case 5:
          if (in.readIndex() != 1) {
            in.readNull();
            this.timestamp = null;
          } else {
            this.timestamp = in.readString(this.timestamp instanceof Utf8 ? (Utf8)this.timestamp : null);
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










