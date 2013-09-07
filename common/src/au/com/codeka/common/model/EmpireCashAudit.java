// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ./messages.proto
package au.com.codeka.common.model;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

import static com.squareup.wire.Message.Label.REPEATED;

public final class EmpireCashAudit extends Message {

  public static final List<EmpireCashAuditEntry> DEFAULT_ENTRIES = Collections.emptyList();

  @ProtoField(tag = 1, label = REPEATED)
  public List<EmpireCashAuditEntry> entries;

  private EmpireCashAudit(Builder builder) {
    super(builder);
    this.entries = copyOf(builder.entries);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof EmpireCashAudit)) return false;
    return equals(entries, ((EmpireCashAudit) other).entries);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    return result != 0 ? result : (hashCode = entries != null ? entries.hashCode() : 0);
  }

  public static final class Builder extends Message.Builder<EmpireCashAudit> {

    public List<EmpireCashAuditEntry> entries;

    public Builder() {
    }

    public Builder(EmpireCashAudit message) {
      super(message);
      if (message == null) return;
      this.entries = copyOf(message.entries);
    }

    public Builder entries(List<EmpireCashAuditEntry> entries) {
      this.entries = entries;
      return this;
    }

    @Override
    public EmpireCashAudit build() {
      return new EmpireCashAudit(this);
    }
  }
}
