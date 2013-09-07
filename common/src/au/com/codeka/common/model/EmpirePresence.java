// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ./messages.proto
package au.com.codeka.common.model;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.FLOAT;
import static com.squareup.wire.Message.Datatype.INT64;
import static com.squareup.wire.Message.Datatype.STRING;

public final class EmpirePresence extends Message {

  public static final String DEFAULT_KEY = "";
  public static final String DEFAULT_EMPIRE_KEY = "";
  public static final String DEFAULT_STAR_KEY = "";
  public static final Float DEFAULT_TOTAL_GOODS = 0F;
  public static final Float DEFAULT_TOTAL_MINERALS = 0F;
  public static final Float DEFAULT_GOODS_DELTA_PER_HOUR = 0F;
  public static final Float DEFAULT_MINERALS_DELTA_PER_HOUR = 0F;
  public static final Float DEFAULT_MAX_GOODS = 0F;
  public static final Float DEFAULT_MAX_MINERALS = 0F;
  public static final Long DEFAULT_GOODS_ZERO_TIME = 0L;

  @ProtoField(tag = 1, type = STRING)
  public String key;

  @ProtoField(tag = 2, type = STRING)
  public String empire_key;

  @ProtoField(tag = 3, type = STRING)
  public String star_key;

  @ProtoField(tag = 4, type = FLOAT)
  public Float total_goods;

  @ProtoField(tag = 5, type = FLOAT)
  public Float total_minerals;

  @ProtoField(tag = 6, type = FLOAT)
  public Float goods_delta_per_hour;

  @ProtoField(tag = 7, type = FLOAT)
  public Float minerals_delta_per_hour;

  @ProtoField(tag = 8, type = FLOAT)
  public Float max_goods;

  @ProtoField(tag = 9, type = FLOAT)
  public Float max_minerals;

  @ProtoField(tag = 10, type = INT64)
  public Long goods_zero_time;

  private EmpirePresence(Builder builder) {
    super(builder);
    this.key = builder.key;
    this.empire_key = builder.empire_key;
    this.star_key = builder.star_key;
    this.total_goods = builder.total_goods;
    this.total_minerals = builder.total_minerals;
    this.goods_delta_per_hour = builder.goods_delta_per_hour;
    this.minerals_delta_per_hour = builder.minerals_delta_per_hour;
    this.max_goods = builder.max_goods;
    this.max_minerals = builder.max_minerals;
    this.goods_zero_time = builder.goods_zero_time;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof EmpirePresence)) return false;
    EmpirePresence o = (EmpirePresence) other;
    return equals(key, o.key)
        && equals(empire_key, o.empire_key)
        && equals(star_key, o.star_key)
        && equals(total_goods, o.total_goods)
        && equals(total_minerals, o.total_minerals)
        && equals(goods_delta_per_hour, o.goods_delta_per_hour)
        && equals(minerals_delta_per_hour, o.minerals_delta_per_hour)
        && equals(max_goods, o.max_goods)
        && equals(max_minerals, o.max_minerals)
        && equals(goods_zero_time, o.goods_zero_time);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = key != null ? key.hashCode() : 0;
      result = result * 37 + (empire_key != null ? empire_key.hashCode() : 0);
      result = result * 37 + (star_key != null ? star_key.hashCode() : 0);
      result = result * 37 + (total_goods != null ? total_goods.hashCode() : 0);
      result = result * 37 + (total_minerals != null ? total_minerals.hashCode() : 0);
      result = result * 37 + (goods_delta_per_hour != null ? goods_delta_per_hour.hashCode() : 0);
      result = result * 37 + (minerals_delta_per_hour != null ? minerals_delta_per_hour.hashCode() : 0);
      result = result * 37 + (max_goods != null ? max_goods.hashCode() : 0);
      result = result * 37 + (max_minerals != null ? max_minerals.hashCode() : 0);
      result = result * 37 + (goods_zero_time != null ? goods_zero_time.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<EmpirePresence> {

    public String key;
    public String empire_key;
    public String star_key;
    public Float total_goods;
    public Float total_minerals;
    public Float goods_delta_per_hour;
    public Float minerals_delta_per_hour;
    public Float max_goods;
    public Float max_minerals;
    public Long goods_zero_time;

    public Builder() {
    }

    public Builder(EmpirePresence message) {
      super(message);
      if (message == null) return;
      this.key = message.key;
      this.empire_key = message.empire_key;
      this.star_key = message.star_key;
      this.total_goods = message.total_goods;
      this.total_minerals = message.total_minerals;
      this.goods_delta_per_hour = message.goods_delta_per_hour;
      this.minerals_delta_per_hour = message.minerals_delta_per_hour;
      this.max_goods = message.max_goods;
      this.max_minerals = message.max_minerals;
      this.goods_zero_time = message.goods_zero_time;
    }

    public Builder key(String key) {
      this.key = key;
      return this;
    }

    public Builder empire_key(String empire_key) {
      this.empire_key = empire_key;
      return this;
    }

    public Builder star_key(String star_key) {
      this.star_key = star_key;
      return this;
    }

    public Builder total_goods(Float total_goods) {
      this.total_goods = total_goods;
      return this;
    }

    public Builder total_minerals(Float total_minerals) {
      this.total_minerals = total_minerals;
      return this;
    }

    public Builder goods_delta_per_hour(Float goods_delta_per_hour) {
      this.goods_delta_per_hour = goods_delta_per_hour;
      return this;
    }

    public Builder minerals_delta_per_hour(Float minerals_delta_per_hour) {
      this.minerals_delta_per_hour = minerals_delta_per_hour;
      return this;
    }

    public Builder max_goods(Float max_goods) {
      this.max_goods = max_goods;
      return this;
    }

    public Builder max_minerals(Float max_minerals) {
      this.max_minerals = max_minerals;
      return this;
    }

    public Builder goods_zero_time(Long goods_zero_time) {
      this.goods_zero_time = goods_zero_time;
      return this;
    }

    @Override
    public EmpirePresence build() {
      return new EmpirePresence(this);
    }
  }
}
