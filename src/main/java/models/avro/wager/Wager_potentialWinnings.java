/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package models.avro.wager;

import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;

@org.apache.avro.specific.AvroGenerated
public class Wager_potentialWinnings extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -2599266214455883194L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Wager_potentialWinnings\",\"namespace\":\"models.avro.wager\",\"fields\":[{\"name\":\"amount\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"wallet\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Wager_potentialWinnings_wallet\",\"fields\":[{\"name\":\"compartment\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Wager_potentialWinnings_wallet_compartment\",\"fields\":[{\"name\":\"real\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Wager_potentialWinnings_wallet_compartment_real\",\"fields\":[{\"name\":\"amount\",\"type\":[\"null\",\"double\"],\"default\":null}]}],\"default\":null},{\"name\":\"virtual\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Wager_potentialWinnings_wallet_compartment_virtual\",\"fields\":[{\"name\":\"amount\",\"type\":[\"null\",\"double\"],\"default\":null}]}],\"default\":null}]}],\"default\":null}]}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Wager_potentialWinnings> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Wager_potentialWinnings> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Wager_potentialWinnings> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Wager_potentialWinnings> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Wager_potentialWinnings> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Wager_potentialWinnings to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Wager_potentialWinnings from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Wager_potentialWinnings instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Wager_potentialWinnings fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private Double amount;
  private models.avro.wager.Wager_potentialWinnings_wallet wallet;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Wager_potentialWinnings() {}

  /**
   * All-args constructor.
   * @param amount The new value for amount
   * @param wallet The new value for wallet
   */
  public Wager_potentialWinnings(Double amount, models.avro.wager.Wager_potentialWinnings_wallet wallet) {
    this.amount = amount;
    this.wallet = wallet;
  }

  @Override
  public SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public Object get(int field$) {
    switch (field$) {
    case 0: return amount;
    case 1: return wallet;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: amount = (Double)value$; break;
    case 1: wallet = (models.avro.wager.Wager_potentialWinnings_wallet)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'amount' field.
   * @return The value of the 'amount' field.
   */
  public Double getAmount() {
    return amount;
  }


  /**
   * Sets the value of the 'amount' field.
   * @param value the value to set.
   */
  public void setAmount(Double value) {
    this.amount = value;
  }

  /**
   * Gets the value of the 'wallet' field.
   * @return The value of the 'wallet' field.
   */
  public models.avro.wager.Wager_potentialWinnings_wallet getWallet() {
    return wallet;
  }


  /**
   * Sets the value of the 'wallet' field.
   * @param value the value to set.
   */
  public void setWallet(models.avro.wager.Wager_potentialWinnings_wallet value) {
    this.wallet = value;
  }

  /**
   * Creates a new Wager_potentialWinnings RecordBuilder.
   * @return A new Wager_potentialWinnings RecordBuilder
   */
  public static models.avro.wager.Wager_potentialWinnings.Builder newBuilder() {
    return new models.avro.wager.Wager_potentialWinnings.Builder();
  }

  /**
   * Creates a new Wager_potentialWinnings RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Wager_potentialWinnings RecordBuilder
   */
  public static models.avro.wager.Wager_potentialWinnings.Builder newBuilder(models.avro.wager.Wager_potentialWinnings.Builder other) {
    if (other == null) {
      return new models.avro.wager.Wager_potentialWinnings.Builder();
    } else {
      return new models.avro.wager.Wager_potentialWinnings.Builder(other);
    }
  }

  /**
   * Creates a new Wager_potentialWinnings RecordBuilder by copying an existing Wager_potentialWinnings instance.
   * @param other The existing instance to copy.
   * @return A new Wager_potentialWinnings RecordBuilder
   */
  public static models.avro.wager.Wager_potentialWinnings.Builder newBuilder(models.avro.wager.Wager_potentialWinnings other) {
    if (other == null) {
      return new models.avro.wager.Wager_potentialWinnings.Builder();
    } else {
      return new models.avro.wager.Wager_potentialWinnings.Builder(other);
    }
  }

  /**
   * RecordBuilder for Wager_potentialWinnings instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Wager_potentialWinnings>
    implements org.apache.avro.data.RecordBuilder<Wager_potentialWinnings> {

    private Double amount;
    private models.avro.wager.Wager_potentialWinnings_wallet wallet;
    private models.avro.wager.Wager_potentialWinnings_wallet.Builder walletBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(models.avro.wager.Wager_potentialWinnings.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.amount)) {
        this.amount = data().deepCopy(fields()[0].schema(), other.amount);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.wallet)) {
        this.wallet = data().deepCopy(fields()[1].schema(), other.wallet);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (other.hasWalletBuilder()) {
        this.walletBuilder = models.avro.wager.Wager_potentialWinnings_wallet.newBuilder(other.getWalletBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing Wager_potentialWinnings instance
     * @param other The existing instance to copy.
     */
    private Builder(models.avro.wager.Wager_potentialWinnings other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.amount)) {
        this.amount = data().deepCopy(fields()[0].schema(), other.amount);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.wallet)) {
        this.wallet = data().deepCopy(fields()[1].schema(), other.wallet);
        fieldSetFlags()[1] = true;
      }
      this.walletBuilder = null;
    }

    /**
      * Gets the value of the 'amount' field.
      * @return The value.
      */
    public Double getAmount() {
      return amount;
    }


    /**
      * Sets the value of the 'amount' field.
      * @param value The value of 'amount'.
      * @return This builder.
      */
    public models.avro.wager.Wager_potentialWinnings.Builder setAmount(Double value) {
      validate(fields()[0], value);
      this.amount = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'amount' field has been set.
      * @return True if the 'amount' field has been set, false otherwise.
      */
    public boolean hasAmount() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'amount' field.
      * @return This builder.
      */
    public models.avro.wager.Wager_potentialWinnings.Builder clearAmount() {
      amount = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'wallet' field.
      * @return The value.
      */
    public models.avro.wager.Wager_potentialWinnings_wallet getWallet() {
      return wallet;
    }


    /**
      * Sets the value of the 'wallet' field.
      * @param value The value of 'wallet'.
      * @return This builder.
      */
    public models.avro.wager.Wager_potentialWinnings.Builder setWallet(models.avro.wager.Wager_potentialWinnings_wallet value) {
      validate(fields()[1], value);
      this.walletBuilder = null;
      this.wallet = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'wallet' field has been set.
      * @return True if the 'wallet' field has been set, false otherwise.
      */
    public boolean hasWallet() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'wallet' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public models.avro.wager.Wager_potentialWinnings_wallet.Builder getWalletBuilder() {
      if (walletBuilder == null) {
        if (hasWallet()) {
          setWalletBuilder(models.avro.wager.Wager_potentialWinnings_wallet.newBuilder(wallet));
        } else {
          setWalletBuilder(models.avro.wager.Wager_potentialWinnings_wallet.newBuilder());
        }
      }
      return walletBuilder;
    }

    /**
     * Sets the Builder instance for the 'wallet' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public models.avro.wager.Wager_potentialWinnings.Builder setWalletBuilder(models.avro.wager.Wager_potentialWinnings_wallet.Builder value) {
      clearWallet();
      walletBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'wallet' field has an active Builder instance
     * @return True if the 'wallet' field has an active Builder instance
     */
    public boolean hasWalletBuilder() {
      return walletBuilder != null;
    }

    /**
      * Clears the value of the 'wallet' field.
      * @return This builder.
      */
    public models.avro.wager.Wager_potentialWinnings.Builder clearWallet() {
      wallet = null;
      walletBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Wager_potentialWinnings build() {
      try {
        Wager_potentialWinnings record = new Wager_potentialWinnings();
        record.amount = fieldSetFlags()[0] ? this.amount : (Double) defaultValue(fields()[0]);
        if (walletBuilder != null) {
          try {
            record.wallet = this.walletBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("wallet"));
            throw e;
          }
        } else {
          record.wallet = fieldSetFlags()[1] ? this.wallet : (models.avro.wager.Wager_potentialWinnings_wallet) defaultValue(fields()[1]);
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
  private static final org.apache.avro.io.DatumWriter<Wager_potentialWinnings>
    WRITER$ = (org.apache.avro.io.DatumWriter<Wager_potentialWinnings>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Wager_potentialWinnings>
    READER$ = (org.apache.avro.io.DatumReader<Wager_potentialWinnings>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.amount == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeDouble(this.amount);
    }

    if (this.wallet == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      this.wallet.customEncode(out);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.amount = null;
      } else {
        this.amount = in.readDouble();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.wallet = null;
      } else {
        if (this.wallet == null) {
          this.wallet = new models.avro.wager.Wager_potentialWinnings_wallet();
        }
        this.wallet.customDecode(in);
      }

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.amount = null;
          } else {
            this.amount = in.readDouble();
          }
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.wallet = null;
          } else {
            if (this.wallet == null) {
              this.wallet = new models.avro.wager.Wager_potentialWinnings_wallet();
            }
            this.wallet.customDecode(in);
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










