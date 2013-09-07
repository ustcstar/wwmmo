// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ./messages.proto
package au.com.codeka.common.model;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.INT32;
import static com.squareup.wire.Message.Datatype.STRING;

public final class Building extends Message {

  public static final String DEFAULT_KEY = "";
  public static final String DEFAULT_COLONY_KEY = "";
  public static final String DEFAULT_DESIGN_ID = "";
  public static final Integer DEFAULT_LEVEL = 0;

  /**
   * The unique key of this building.
   */
  @ProtoField(tag = 1, type = STRING)
  public String key;

  /**
   * The key of the colony to which this building belongs.
   */
  @ProtoField(tag = 2, type = STRING)
  public String colony_key;

  /**
   * The string ID of the design of this building (defined in data/buildings.xml)
   */
  @ProtoField(tag = 3, type = STRING)
  public String design_id;

  /**
   * The level of this building
   */
  @ProtoField(tag = 4, type = INT32)
  public Integer level;

  private Building(Builder builder) {
    super(builder);
    this.key = builder.key;
    this.colony_key = builder.colony_key;
    this.design_id = builder.design_id;
    this.level = builder.level;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof Building)) return false;
    Building o = (Building) other;
    return equals(key, o.key)
        && equals(colony_key, o.colony_key)
        && equals(design_id, o.design_id)
        && equals(level, o.level);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = key != null ? key.hashCode() : 0;
      result = result * 37 + (colony_key != null ? colony_key.hashCode() : 0);
      result = result * 37 + (design_id != null ? design_id.hashCode() : 0);
      result = result * 37 + (level != null ? level.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<Building> {

    public String key;
    public String colony_key;
    public String design_id;
    public Integer level;

    public Builder() {
    }

    public Builder(Building message) {
      super(message);
      if (message == null) return;
      this.key = message.key;
      this.colony_key = message.colony_key;
      this.design_id = message.design_id;
      this.level = message.level;
    }

    public Builder key(String key) {
      this.key = key;
      return this;
    }

    public Builder colony_key(String colony_key) {
      this.colony_key = colony_key;
      return this;
    }

    public Builder design_id(String design_id) {
      this.design_id = design_id;
      return this;
    }

    public Builder level(Integer level) {
      this.level = level;
      return this;
    }

    @Override
    public Building build() {
      return new Building(this);
    }
  }
}
