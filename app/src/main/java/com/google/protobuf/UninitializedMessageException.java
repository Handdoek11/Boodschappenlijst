package com.google.protobuf;

import java.util.List;

/* loaded from: classes2.dex */
public class UninitializedMessageException extends RuntimeException {

    /* renamed from: o, reason: collision with root package name */
    private final List f33069o;

    public UninitializedMessageException(l lVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f33069o = null;
    }

    public InvalidProtocolBufferException a() {
        return new InvalidProtocolBufferException(getMessage());
    }
}
