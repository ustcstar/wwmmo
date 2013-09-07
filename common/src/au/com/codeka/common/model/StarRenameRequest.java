// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ./messages.proto
package au.com.codeka.common.model;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.INT64;
import static com.squareup.wire.Message.Datatype.STRING;

public final class StarRenameRequest extends Message {

  public static final String DEFAULT_STAR_KEY = "";
  public static final String DEFAULT_OLD_NAME = "";
  public static final String DEFAULT_NEW_NAME = "";
  public static final String DEFAULT_PURCHASE_ORDER_ID = "";
  public static final Long DEFAULT_PURCHASE_TIME = 0L;
  public static final String DEFAULT_PURCHASE_DEVELOPER_PAYLOAD = "";
  public static final String DEFAULT_PURCHASE_PRICE = "";

  @ProtoField(tag = 1, type = STRING)
  public String star_key;

  @ProtoField(tag = 2, type = STRING)
  public String old_name;

  @ProtoField(tag = 3, type = STRING)
  public String new_name;

  @ProtoField(tag = 4, type = STRING)
  public String purchase_order_id;

  @ProtoField(tag = 5, type = INT64)
  public Long purchase_time;

  @ProtoField(tag = 6, type = STRING)
  public String purchase_developer_payload;

  @ProtoField(tag = 7, type = STRING)
  public String purchase_price;

  private StarRenameRequest(Builder builder) {
    super(builder);
    this.star_key = builder.star_key;
    this.old_name = builder.old_name;
    this.new_name = builder.new_name;
    this.purchase_order_id = builder.purchase_order_id;
    this.purchase_time = builder.purchase_time;
    this.purchase_developer_payload = builder.purchase_developer_payload;
    this.purchase_price = builder.purchase_price;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof StarRenameRequest)) return false;
    StarRenameRequest o = (StarRenameRequest) other;
    return equals(star_key, o.star_key)
        && equals(old_name, o.old_name)
        && equals(new_name, o.new_name)
        && equals(purchase_order_id, o.purchase_order_id)
        && equals(purchase_time, o.purchase_time)
        && equals(purchase_developer_payload, o.purchase_developer_payload)
        && equals(purchase_price, o.purchase_price);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = star_key != null ? star_key.hashCode() : 0;
      result = result * 37 + (old_name != null ? old_name.hashCode() : 0);
      result = result * 37 + (new_name != null ? new_name.hashCode() : 0);
      result = result * 37 + (purchase_order_id != null ? purchase_order_id.hashCode() : 0);
      result = result * 37 + (purchase_time != null ? purchase_time.hashCode() : 0);
      result = result * 37 + (purchase_developer_payload != null ? purchase_developer_payload.hashCode() : 0);
      result = result * 37 + (purchase_price != null ? purchase_price.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<StarRenameRequest> {

    public String star_key;
    public String old_name;
    public String new_name;
    public String purchase_order_id;
    public Long purchase_time;
    public String purchase_developer_payload;
    public String purchase_price;

    public Builder() {
    }

    public Builder(StarRenameRequest message) {
      super(message);
      if (message == null) return;
      this.star_key = message.star_key;
      this.old_name = message.old_name;
      this.new_name = message.new_name;
      this.purchase_order_id = message.purchase_order_id;
      this.purchase_time = message.purchase_time;
      this.purchase_developer_payload = message.purchase_developer_payload;
      this.purchase_price = message.purchase_price;
    }

    public Builder star_key(String star_key) {
      this.star_key = star_key;
      return this;
    }

    public Builder old_name(String old_name) {
      this.old_name = old_name;
      return this;
    }

    public Builder new_name(String new_name) {
      this.new_name = new_name;
      return this;
    }

    public Builder purchase_order_id(String purchase_order_id) {
      this.purchase_order_id = purchase_order_id;
      return this;
    }

    public Builder purchase_time(Long purchase_time) {
      this.purchase_time = purchase_time;
      return this;
    }

    public Builder purchase_developer_payload(String purchase_developer_payload) {
      this.purchase_developer_payload = purchase_developer_payload;
      return this;
    }

    public Builder purchase_price(String purchase_price) {
      this.purchase_price = purchase_price;
      return this;
    }

    @Override
    public StarRenameRequest build() {
      return new StarRenameRequest(this);
    }
  }
}
