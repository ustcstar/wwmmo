// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ./messages.proto
package au.com.codeka.common.model;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

import static com.squareup.wire.Message.Label.REPEATED;

public final class ScoutReports extends Message {

  public static final List<ScoutReport> DEFAULT_REPORTS = Collections.emptyList();

  @ProtoField(tag = 1, label = REPEATED)
  public List<ScoutReport> reports;

  private ScoutReports(Builder builder) {
    super(builder);
    this.reports = copyOf(builder.reports);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof ScoutReports)) return false;
    return equals(reports, ((ScoutReports) other).reports);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    return result != 0 ? result : (hashCode = reports != null ? reports.hashCode() : 0);
  }

  public static final class Builder extends Message.Builder<ScoutReports> {

    public List<ScoutReport> reports;

    public Builder() {
    }

    public Builder(ScoutReports message) {
      super(message);
      if (message == null) return;
      this.reports = copyOf(message.reports);
    }

    public Builder reports(List<ScoutReport> reports) {
      this.reports = reports;
      return this;
    }

    @Override
    public ScoutReports build() {
      return new ScoutReports(this);
    }
  }
}
