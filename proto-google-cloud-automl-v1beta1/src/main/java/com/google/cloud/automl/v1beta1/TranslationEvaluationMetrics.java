// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/translation.proto

package com.google.cloud.automl.v1beta1;

/**
 * <pre>
 * Evaluation metrics for the dataset.
 * </pre>
 *
 * Protobuf type {@code google.cloud.automl.v1beta1.TranslationEvaluationMetrics}
 */
public  final class TranslationEvaluationMetrics extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.automl.v1beta1.TranslationEvaluationMetrics)
    TranslationEvaluationMetricsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TranslationEvaluationMetrics.newBuilder() to construct.
  private TranslationEvaluationMetrics(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TranslationEvaluationMetrics() {
    bleuScore_ = 0D;
    baseBleuScore_ = 0D;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TranslationEvaluationMetrics(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 9: {

            bleuScore_ = input.readDouble();
            break;
          }
          case 17: {

            baseBleuScore_ = input.readDouble();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.automl.v1beta1.TranslationProto.internal_static_google_cloud_automl_v1beta1_TranslationEvaluationMetrics_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.automl.v1beta1.TranslationProto.internal_static_google_cloud_automl_v1beta1_TranslationEvaluationMetrics_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics.class, com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics.Builder.class);
  }

  public static final int BLEU_SCORE_FIELD_NUMBER = 1;
  private double bleuScore_;
  /**
   * <pre>
   * Output only. BLEU score.
   * </pre>
   *
   * <code>double bleu_score = 1;</code>
   */
  public double getBleuScore() {
    return bleuScore_;
  }

  public static final int BASE_BLEU_SCORE_FIELD_NUMBER = 2;
  private double baseBleuScore_;
  /**
   * <pre>
   * Output only. BLEU score for base model.
   * </pre>
   *
   * <code>double base_bleu_score = 2;</code>
   */
  public double getBaseBleuScore() {
    return baseBleuScore_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (bleuScore_ != 0D) {
      output.writeDouble(1, bleuScore_);
    }
    if (baseBleuScore_ != 0D) {
      output.writeDouble(2, baseBleuScore_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (bleuScore_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, bleuScore_);
    }
    if (baseBleuScore_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, baseBleuScore_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics)) {
      return super.equals(obj);
    }
    com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics other = (com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics) obj;

    boolean result = true;
    result = result && (
        java.lang.Double.doubleToLongBits(getBleuScore())
        == java.lang.Double.doubleToLongBits(
            other.getBleuScore()));
    result = result && (
        java.lang.Double.doubleToLongBits(getBaseBleuScore())
        == java.lang.Double.doubleToLongBits(
            other.getBaseBleuScore()));
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + BLEU_SCORE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getBleuScore()));
    hash = (37 * hash) + BASE_BLEU_SCORE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getBaseBleuScore()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Evaluation metrics for the dataset.
   * </pre>
   *
   * Protobuf type {@code google.cloud.automl.v1beta1.TranslationEvaluationMetrics}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.automl.v1beta1.TranslationEvaluationMetrics)
      com.google.cloud.automl.v1beta1.TranslationEvaluationMetricsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.automl.v1beta1.TranslationProto.internal_static_google_cloud_automl_v1beta1_TranslationEvaluationMetrics_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.automl.v1beta1.TranslationProto.internal_static_google_cloud_automl_v1beta1_TranslationEvaluationMetrics_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics.class, com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics.Builder.class);
    }

    // Construct using com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      bleuScore_ = 0D;

      baseBleuScore_ = 0D;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.automl.v1beta1.TranslationProto.internal_static_google_cloud_automl_v1beta1_TranslationEvaluationMetrics_descriptor;
    }

    public com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics getDefaultInstanceForType() {
      return com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics.getDefaultInstance();
    }

    public com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics build() {
      com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics buildPartial() {
      com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics result = new com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics(this);
      result.bleuScore_ = bleuScore_;
      result.baseBleuScore_ = baseBleuScore_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics) {
        return mergeFrom((com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics other) {
      if (other == com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics.getDefaultInstance()) return this;
      if (other.getBleuScore() != 0D) {
        setBleuScore(other.getBleuScore());
      }
      if (other.getBaseBleuScore() != 0D) {
        setBaseBleuScore(other.getBaseBleuScore());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double bleuScore_ ;
    /**
     * <pre>
     * Output only. BLEU score.
     * </pre>
     *
     * <code>double bleu_score = 1;</code>
     */
    public double getBleuScore() {
      return bleuScore_;
    }
    /**
     * <pre>
     * Output only. BLEU score.
     * </pre>
     *
     * <code>double bleu_score = 1;</code>
     */
    public Builder setBleuScore(double value) {
      
      bleuScore_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. BLEU score.
     * </pre>
     *
     * <code>double bleu_score = 1;</code>
     */
    public Builder clearBleuScore() {
      
      bleuScore_ = 0D;
      onChanged();
      return this;
    }

    private double baseBleuScore_ ;
    /**
     * <pre>
     * Output only. BLEU score for base model.
     * </pre>
     *
     * <code>double base_bleu_score = 2;</code>
     */
    public double getBaseBleuScore() {
      return baseBleuScore_;
    }
    /**
     * <pre>
     * Output only. BLEU score for base model.
     * </pre>
     *
     * <code>double base_bleu_score = 2;</code>
     */
    public Builder setBaseBleuScore(double value) {
      
      baseBleuScore_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. BLEU score for base model.
     * </pre>
     *
     * <code>double base_bleu_score = 2;</code>
     */
    public Builder clearBaseBleuScore() {
      
      baseBleuScore_ = 0D;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.automl.v1beta1.TranslationEvaluationMetrics)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.automl.v1beta1.TranslationEvaluationMetrics)
  private static final com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics();
  }

  public static com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TranslationEvaluationMetrics>
      PARSER = new com.google.protobuf.AbstractParser<TranslationEvaluationMetrics>() {
    public TranslationEvaluationMetrics parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new TranslationEvaluationMetrics(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TranslationEvaluationMetrics> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TranslationEvaluationMetrics> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

