package androidx.datastore.preferences.protobuf;

import java.util.List;

/* loaded from: classes.dex */
public class UninitializedMessageException extends RuntimeException {

    /* renamed from: o, reason: collision with root package name */
    private final List f9335o;

    public UninitializedMessageException(M m8) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f9335o = null;
    }

    public InvalidProtocolBufferException a() {
        return new InvalidProtocolBufferException(getMessage());
    }
}
