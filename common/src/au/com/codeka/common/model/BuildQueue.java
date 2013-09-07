// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ./messages.proto
package au.com.codeka.common.model;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

import static com.squareup.wire.Message.Label.REPEATED;

public final class BuildQueue extends Message {

  public static final List<BuildRequest> DEFAULT_REQUESTS = Collections.emptyList();

  @ProtoField(tag = 1, label = REPEATED)
  public List<BuildRequest> requests;

  private BuildQueue(Builder builder) {
    super(builder);
    this.requests = copyOf(builder.requests);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof BuildQueue)) return false;
    return equals(requests, ((BuildQueue) other).requests);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    return result != 0 ? result : (hashCode = requests != null ? requests.hashCode() : 0);
  }

  public static final class Builder extends Message.Builder<BuildQueue> {

    public List<BuildRequest> requests;

    public Builder() {
    }

    public Builder(BuildQueue message) {
      super(message);
      if (message == null) return;
      this.requests = copyOf(message.requests);
    }

    public Builder requests(List<BuildRequest> requests) {
      this.requests = requests;
      return this;
    }

    @Override
    public BuildQueue build() {
      return new BuildQueue(this);
    }
  }
}
