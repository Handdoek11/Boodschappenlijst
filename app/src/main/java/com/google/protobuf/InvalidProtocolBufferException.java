package com.google.protobuf;

import java.io.IOException;

/* loaded from: classes2.dex */
public class InvalidProtocolBufferException extends IOException {

    /* renamed from: o, reason: collision with root package name */
    private l f33068o;

    public InvalidProtocolBufferException(String str) {
        super(str);
        this.f33068o = null;
    }

    static InvalidProtocolBufferException a() {
        return new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
    }

    static InvalidProtocolBufferException b() {
        return new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    static InvalidProtocolBufferException c() {
        return new InvalidProtocolBufferException("Protocol message tag had invalid wire type.");
    }

    static InvalidProtocolBufferException d() {
        return new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    static InvalidProtocolBufferException e() {
        return new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static InvalidProtocolBufferException f() {
        return new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static InvalidProtocolBufferException h() {
        return new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static InvalidProtocolBufferException i() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    public InvalidProtocolBufferException g(l lVar) {
        this.f33068o = lVar;
        return this;
    }
}
