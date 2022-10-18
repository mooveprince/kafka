/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.examples.kafka.avro;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Order extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 8064623708076691589L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Order\",\"namespace\":\"com.examples.kafka.avro\",\"fields\":[{\"name\":\"customerName\",\"type\":\"string\"},{\"name\":\"product\",\"type\":\"string\"},{\"name\":\"quantity\",\"type\":\"int\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Order> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Order> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Order> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Order> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Order> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Order to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Order from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Order instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Order fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence customerName;
  private java.lang.CharSequence product;
  private int quantity;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Order() {}

  /**
   * All-args constructor.
   * @param customerName The new value for customerName
   * @param product The new value for product
   * @param quantity The new value for quantity
   */
  public Order(java.lang.CharSequence customerName, java.lang.CharSequence product, java.lang.Integer quantity) {
    this.customerName = customerName;
    this.product = product;
    this.quantity = quantity;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return customerName;
    case 1: return product;
    case 2: return quantity;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: customerName = (java.lang.CharSequence)value$; break;
    case 1: product = (java.lang.CharSequence)value$; break;
    case 2: quantity = (java.lang.Integer)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'customerName' field.
   * @return The value of the 'customerName' field.
   */
  public java.lang.CharSequence getCustomerName() {
    return customerName;
  }


  /**
   * Sets the value of the 'customerName' field.
   * @param value the value to set.
   */
  public void setCustomerName(java.lang.CharSequence value) {
    this.customerName = value;
  }

  /**
   * Gets the value of the 'product' field.
   * @return The value of the 'product' field.
   */
  public java.lang.CharSequence getProduct() {
    return product;
  }


  /**
   * Sets the value of the 'product' field.
   * @param value the value to set.
   */
  public void setProduct(java.lang.CharSequence value) {
    this.product = value;
  }

  /**
   * Gets the value of the 'quantity' field.
   * @return The value of the 'quantity' field.
   */
  public int getQuantity() {
    return quantity;
  }


  /**
   * Sets the value of the 'quantity' field.
   * @param value the value to set.
   */
  public void setQuantity(int value) {
    this.quantity = value;
  }

  /**
   * Creates a new Order RecordBuilder.
   * @return A new Order RecordBuilder
   */
  public static com.examples.kafka.avro.Order.Builder newBuilder() {
    return new com.examples.kafka.avro.Order.Builder();
  }

  /**
   * Creates a new Order RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Order RecordBuilder
   */
  public static com.examples.kafka.avro.Order.Builder newBuilder(com.examples.kafka.avro.Order.Builder other) {
    if (other == null) {
      return new com.examples.kafka.avro.Order.Builder();
    } else {
      return new com.examples.kafka.avro.Order.Builder(other);
    }
  }

  /**
   * Creates a new Order RecordBuilder by copying an existing Order instance.
   * @param other The existing instance to copy.
   * @return A new Order RecordBuilder
   */
  public static com.examples.kafka.avro.Order.Builder newBuilder(com.examples.kafka.avro.Order other) {
    if (other == null) {
      return new com.examples.kafka.avro.Order.Builder();
    } else {
      return new com.examples.kafka.avro.Order.Builder(other);
    }
  }

  /**
   * RecordBuilder for Order instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Order>
    implements org.apache.avro.data.RecordBuilder<Order> {

    private java.lang.CharSequence customerName;
    private java.lang.CharSequence product;
    private int quantity;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.examples.kafka.avro.Order.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.customerName)) {
        this.customerName = data().deepCopy(fields()[0].schema(), other.customerName);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.product)) {
        this.product = data().deepCopy(fields()[1].schema(), other.product);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.quantity)) {
        this.quantity = data().deepCopy(fields()[2].schema(), other.quantity);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing Order instance
     * @param other The existing instance to copy.
     */
    private Builder(com.examples.kafka.avro.Order other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.customerName)) {
        this.customerName = data().deepCopy(fields()[0].schema(), other.customerName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.product)) {
        this.product = data().deepCopy(fields()[1].schema(), other.product);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.quantity)) {
        this.quantity = data().deepCopy(fields()[2].schema(), other.quantity);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'customerName' field.
      * @return The value.
      */
    public java.lang.CharSequence getCustomerName() {
      return customerName;
    }


    /**
      * Sets the value of the 'customerName' field.
      * @param value The value of 'customerName'.
      * @return This builder.
      */
    public com.examples.kafka.avro.Order.Builder setCustomerName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.customerName = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'customerName' field has been set.
      * @return True if the 'customerName' field has been set, false otherwise.
      */
    public boolean hasCustomerName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'customerName' field.
      * @return This builder.
      */
    public com.examples.kafka.avro.Order.Builder clearCustomerName() {
      customerName = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'product' field.
      * @return The value.
      */
    public java.lang.CharSequence getProduct() {
      return product;
    }


    /**
      * Sets the value of the 'product' field.
      * @param value The value of 'product'.
      * @return This builder.
      */
    public com.examples.kafka.avro.Order.Builder setProduct(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.product = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'product' field has been set.
      * @return True if the 'product' field has been set, false otherwise.
      */
    public boolean hasProduct() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'product' field.
      * @return This builder.
      */
    public com.examples.kafka.avro.Order.Builder clearProduct() {
      product = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'quantity' field.
      * @return The value.
      */
    public int getQuantity() {
      return quantity;
    }


    /**
      * Sets the value of the 'quantity' field.
      * @param value The value of 'quantity'.
      * @return This builder.
      */
    public com.examples.kafka.avro.Order.Builder setQuantity(int value) {
      validate(fields()[2], value);
      this.quantity = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'quantity' field has been set.
      * @return True if the 'quantity' field has been set, false otherwise.
      */
    public boolean hasQuantity() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'quantity' field.
      * @return This builder.
      */
    public com.examples.kafka.avro.Order.Builder clearQuantity() {
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Order build() {
      try {
        Order record = new Order();
        record.customerName = fieldSetFlags()[0] ? this.customerName : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.product = fieldSetFlags()[1] ? this.product : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.quantity = fieldSetFlags()[2] ? this.quantity : (java.lang.Integer) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Order>
    WRITER$ = (org.apache.avro.io.DatumWriter<Order>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Order>
    READER$ = (org.apache.avro.io.DatumReader<Order>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.customerName);

    out.writeString(this.product);

    out.writeInt(this.quantity);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.customerName = in.readString(this.customerName instanceof Utf8 ? (Utf8)this.customerName : null);

      this.product = in.readString(this.product instanceof Utf8 ? (Utf8)this.product : null);

      this.quantity = in.readInt();

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.customerName = in.readString(this.customerName instanceof Utf8 ? (Utf8)this.customerName : null);
          break;

        case 1:
          this.product = in.readString(this.product instanceof Utf8 ? (Utf8)this.product : null);
          break;

        case 2:
          this.quantity = in.readInt();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










